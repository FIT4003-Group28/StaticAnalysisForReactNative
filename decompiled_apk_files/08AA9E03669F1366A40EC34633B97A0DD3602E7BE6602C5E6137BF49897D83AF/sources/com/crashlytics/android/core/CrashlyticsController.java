package com.crashlytics.android.core;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import b.a.a.a.a.b.i;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.p;
import b.a.a.a.a.e.e;
import b.a.a.a.a.f.a;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.o;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.l;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.EventLogger;
import com.crashlytics.android.core.CrashPromptDialog;
import com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler;
import com.crashlytics.android.core.LogFileManager;
import com.crashlytics.android.core.ReportUploader;
import com.google.android.gms.dynamite.ProviderConstants;
import ezvcard.property.Kind;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CrashlyticsController {
    private static final int ANALYZER_VERSION = 1;
    private static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    static final String FATAL_SESSION_DIR = "fatal-sessions";
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_REALTIME = "_r";
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final int MAX_INVALID_SESSIONS = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    static final int MAX_STACK_SIZE = 1024;
    static final String NONFATAL_SESSION_DIR = "nonfatal-sessions";
    static final int NUM_STACK_REPETITIONS_ALLOWED = 10;
    static final String SESSION_EVENT_MISSING_BINARY_IMGS_TAG = "SessionMissingBinaryImages";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_JSON_SUFFIX = ".json";
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    private final AppData appData;
    private final AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsCore crashlyticsCore;
    private final DevicePowerStateListener devicePowerStateListener;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final a fileStore;
    private final EventLogger firebaseAnalyticsLogger;
    private final ReportUploader.HandlingExceptionCheck handlingExceptionCheck;
    private final e httpRequestFactory;
    private final p idManager;
    private final LogFileDirectoryProvider logFileDirectoryProvider;
    private final LogFileManager logFileManager;
    private final PreferenceManager preferenceManager;
    private final ReportUploader.ReportFilesProvider reportFilesProvider;
    private final StackTraceTrimmingStrategy stackTraceTrimmingStrategy;
    private final String unityVersion;
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final FilenameFilter SESSION_BEGIN_FILE_FILTER = new FileNameContainsFilter(SESSION_BEGIN_TAG) { // from class: com.crashlytics.android.core.CrashlyticsController.1
        @Override // com.crashlytics.android.core.CrashlyticsController.FileNameContainsFilter, java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.2
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.length() == ClsFileOutputStream.SESSION_FILE_EXTENSION.length() + 35 && str.endsWith(ClsFileOutputStream.SESSION_FILE_EXTENSION);
        }
    };
    static final FileFilter SESSION_DIRECTORY_FILTER = new FileFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.3
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    };
    static final Comparator<File> LARGEST_FILE_NAME_FIRST = new Comparator<File>() { // from class: com.crashlytics.android.core.CrashlyticsController.4
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    };
    static final Comparator<File> SMALLEST_FILE_NAME_FIRST = new Comparator<File>() { // from class: com.crashlytics.android.core.CrashlyticsController.5
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final Map<String, String> SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_USER_TAG = "SessionUser";
    static final String SESSION_APP_TAG = "SessionApp";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    private static final String[] INITIAL_SESSION_PART_TAGS = {SESSION_USER_TAG, SESSION_APP_TAG, SESSION_OS_TAG, SESSION_DEVICE_TAG};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface CodedOutputStreamWriteAction {
        void writeTo(CodedOutputStream codedOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface FileOutputStreamWriteAction {
        void writeTo(FileOutputStream fileOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class FileNameContainsFilter implements FilenameFilter {
        private final String string;

        public FileNameContainsFilter(String str) {
            this.string = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains(this.string) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SessionPartFileFilter implements FilenameFilter {
        private final String sessionId;

        public SessionPartFileFilter(String str) {
            this.sessionId = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.sessionId);
            sb.append(ClsFileOutputStream.SESSION_FILE_EXTENSION);
            return !str.equals(sb.toString()) && str.contains(this.sessionId) && !str.endsWith(ClsFileOutputStream.IN_PROGRESS_SESSION_FILE_EXTENSION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class AnySessionPartFileFilter implements FilenameFilter {
        private AnySessionPartFileFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return !CrashlyticsController.SESSION_FILE_FILTER.accept(file, str) && CrashlyticsController.SESSION_FILE_PATTERN.matcher(str).matches();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class InvalidPartFileFilter implements FilenameFilter {
        InvalidPartFileFilter() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return ClsFileOutputStream.TEMP_FILENAME_FILTER.accept(file, str) || str.contains(CrashlyticsController.SESSION_EVENT_MISSING_BINARY_IMGS_TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CrashlyticsController(CrashlyticsCore crashlyticsCore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, e eVar, p pVar, PreferenceManager preferenceManager, a aVar, AppData appData, UnityVersionProvider unityVersionProvider, AppMeasurementEventListenerRegistrar appMeasurementEventListenerRegistrar, EventLogger eventLogger) {
        this.crashlyticsCore = crashlyticsCore;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.httpRequestFactory = eVar;
        this.idManager = pVar;
        this.preferenceManager = preferenceManager;
        this.fileStore = aVar;
        this.appData = appData;
        this.unityVersion = unityVersionProvider.getUnityVersion();
        this.appMeasurementEventListenerRegistrar = appMeasurementEventListenerRegistrar;
        this.firebaseAnalyticsLogger = eventLogger;
        Context context = crashlyticsCore.getContext();
        this.logFileDirectoryProvider = new LogFileDirectoryProvider(aVar);
        this.logFileManager = new LogFileManager(context, this.logFileDirectoryProvider);
        this.reportFilesProvider = new ReportUploaderFilesProvider();
        this.handlingExceptionCheck = new ReportUploaderHandlingExceptionCheck();
        this.devicePowerStateListener = new DevicePowerStateListener(context);
        this.stackTraceTrimmingStrategy = new MiddleOutFallbackStrategy(1024, new RemoveRepeatsStrategy(10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        openSession();
        this.crashHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.crashlytics.android.core.CrashlyticsController.6
            @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, Thread thread, Throwable th, boolean z2) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider, thread, th, z2);
            }
        }, new DefaultSettingsDataProvider(), z, uncaughtExceptionHandler);
        Thread.setDefaultUncaughtExceptionHandler(this.crashHandler);
    }

    synchronized void handleUncaughtException(final CrashlyticsUncaughtExceptionHandler.SettingsDataProvider settingsDataProvider, final Thread thread, final Throwable th, final boolean z) {
        l h = c.h();
        h.a(CrashlyticsCore.TAG, "Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        this.devicePowerStateListener.dispose();
        final Date date = new Date();
        this.backgroundWorker.submitAndWait(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            public Void call() {
                b.a.a.a.a.g.p pVar;
                m mVar;
                CrashlyticsController.this.crashlyticsCore.createCrashMarker();
                CrashlyticsController.this.writeFatal(date, thread, th);
                t settingsData = settingsDataProvider.getSettingsData();
                if (settingsData != null) {
                    pVar = settingsData.f1242b;
                    mVar = settingsData.f1244d;
                } else {
                    pVar = null;
                    mVar = null;
                }
                if ((mVar == null || mVar.e) || z) {
                    CrashlyticsController.this.recordFatalFirebaseEvent(date.getTime());
                }
                CrashlyticsController.this.doCloseSessions(pVar);
                CrashlyticsController.this.doOpenSession();
                if (pVar != null) {
                    CrashlyticsController.this.trimSessionFiles(pVar.g);
                }
                if (!CrashlyticsController.this.shouldPromptUserBeforeSendingCrashReports(settingsData)) {
                    CrashlyticsController.this.sendSessionReports(settingsData);
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void submitAllReports(float f, t tVar) {
        if (tVar == null) {
            c.h().d(CrashlyticsCore.TAG, "Could not send reports. Settings are not available.");
            return;
        }
        new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(tVar.f1241a.f1208d, tVar.f1241a.e), this.reportFilesProvider, this.handlingExceptionCheck).uploadReports(f, shouldPromptUserBeforeSendingCrashReports(tVar) ? new PrivacyDialogCheck(this.crashlyticsCore, this.preferenceManager, tVar.f1243c) : new ReportUploader.AlwaysSendCheck());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            public Void call() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.logFileManager.writeToLog(j, str);
                    return null;
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final Date date = new Date();
        this.backgroundWorker.submit(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.9
            @Override // java.lang.Runnable
            public void run() {
                if (!CrashlyticsController.this.isHandlingException()) {
                    CrashlyticsController.this.doWriteNonFatal(date, thread, th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cacheUserData(final String str, final String str2, final String str3) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.10
            @Override // java.util.concurrent.Callable
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(CrashlyticsController.this.getCurrentSessionId(), new UserMetaData(str, str2, str3));
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cacheKeyData(final Map<String, String> map) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.11
            @Override // java.util.concurrent.Callable
            public Void call() {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map);
                return null;
            }
        });
    }

    void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsController.12
            @Override // java.util.concurrent.Callable
            public Void call() {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 0) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[0]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPreviousSessionId() {
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length > 1) {
            return getSessionIdFromSessionFile(listSortedSessionBeginFiles[1]);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSessionIdFromSessionFile(File file) {
        return file.getName().substring(0, 35);
    }

    boolean hasOpenSession() {
        return listSessionBeginFiles().length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean finalizeSessions(final b.a.a.a.a.g.p pVar) {
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            /* renamed from: call */
            public Boolean mo22call() {
                if (CrashlyticsController.this.isHandlingException()) {
                    c.h().a(CrashlyticsCore.TAG, "Skipping session finalization because a crash has already occurred.");
                    return Boolean.FALSE;
                }
                c.h().a(CrashlyticsCore.TAG, "Finalizing previously open sessions.");
                CrashlyticsController.this.doCloseSessions(pVar, true);
                c.h().a(CrashlyticsCore.TAG, "Closed all previously open sessions");
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession() {
        Date date = new Date();
        String clsuuid = new CLSUUID(this.idManager).toString();
        l h = c.h();
        h.a(CrashlyticsCore.TAG, "Opening a new session with ID " + clsuuid);
        writeBeginSession(clsuuid, date);
        writeSessionApp(clsuuid);
        writeSessionOS(clsuuid);
        writeSessionDevice(clsuuid);
        this.logFileManager.setCurrentSession(clsuuid);
    }

    void doCloseSessions(b.a.a.a.a.g.p pVar) {
        doCloseSessions(pVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void doCloseSessions(b.a.a.a.a.g.p pVar, boolean z) {
        trimOpenSessions((z ? 1 : 0) + 8);
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        if (listSortedSessionBeginFiles.length <= z) {
            c.h().a(CrashlyticsCore.TAG, "No open sessions to be closed.");
            return;
        }
        writeSessionUser(getSessionIdFromSessionFile(listSortedSessionBeginFiles[z ? 1 : 0]));
        if (pVar == null) {
            c.h().a(CrashlyticsCore.TAG, "Unable to close session. Settings are not loaded.");
        } else {
            closeOpenSessions(listSortedSessionBeginFiles, z, pVar.f1230c);
        }
    }

    private void closeOpenSessions(File[] fileArr, int i, int i2) {
        c.h().a(CrashlyticsCore.TAG, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String sessionIdFromSessionFile = getSessionIdFromSessionFile(file);
            l h = c.h();
            h.a(CrashlyticsCore.TAG, "Closing session: " + sessionIdFromSessionFile);
            writeSessionPartsToSessionFile(file, sessionIdFromSessionFile, i2);
            i++;
        }
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsFileOutputStream) {
        if (clsFileOutputStream == null) {
            return;
        }
        try {
            clsFileOutputStream.closeInProgressStream();
        } catch (IOException e) {
            c.h().e(CrashlyticsCore.TAG, "Error closing session file stream in the presence of an exception", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recursiveDelete(Set<File> set) {
        for (File file : set) {
            recursiveDelete(file);
        }
    }

    private void recursiveDelete(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private void deleteSessionPartFilesFor(String str) {
        for (File file : listSessionPartFilesFor(str)) {
            file.delete();
        }
    }

    private File[] listSessionPartFilesFor(String str) {
        return listFilesMatching(new SessionPartFileFilter(str));
    }

    File[] listCompleteSessionFiles() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, listFilesMatching(getFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getNonFatalSessionFilesDir(), SESSION_FILE_FILTER));
        Collections.addAll(linkedList, listFilesMatching(getFilesDir(), SESSION_FILE_FILTER));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    File[] listNativeSessionFileDirectories() {
        return listFilesMatching(SESSION_DIRECTORY_FILTER);
    }

    File[] listSessionBeginFiles() {
        return listFilesMatching(SESSION_BEGIN_FILE_FILTER);
    }

    private File[] listSortedSessionBeginFiles() {
        File[] listSessionBeginFiles = listSessionBeginFiles();
        Arrays.sort(listSessionBeginFiles, LARGEST_FILE_NAME_FIRST);
        return listSessionBeginFiles;
    }

    private File[] listFilesMatching(FileFilter fileFilter) {
        return ensureFileArrayNotNull(getFilesDir().listFiles(fileFilter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private File[] listFiles(File file) {
        return ensureFileArrayNotNull(file.listFiles());
    }

    private File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    private void trimSessionEventFiles(String str, int i) {
        File filesDir = getFilesDir();
        Utils.capFileCount(filesDir, new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG), i, SMALLEST_FILE_NAME_FIRST);
    }

    void trimSessionFiles(int i) {
        int capFileCount = i - Utils.capFileCount(getFatalSessionFilesDir(), i, SMALLEST_FILE_NAME_FIRST);
        Utils.capFileCount(getFilesDir(), SESSION_FILE_FILTER, capFileCount - Utils.capFileCount(getNonFatalSessionFilesDir(), capFileCount, SMALLEST_FILE_NAME_FIRST), SMALLEST_FILE_NAME_FIRST);
    }

    private void trimOpenSessions(int i) {
        HashSet hashSet = new HashSet();
        File[] listSortedSessionBeginFiles = listSortedSessionBeginFiles();
        int min = Math.min(i, listSortedSessionBeginFiles.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(getSessionIdFromSessionFile(listSortedSessionBeginFiles[i2]));
        }
        this.logFileManager.discardOldLogFiles(hashSet);
        retainSessions(listFilesMatching(new AnySessionPartFileFilter()), hashSet);
    }

    private void retainSessions(File[] fileArr, Set<String> set) {
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(name);
            if (!matcher.matches()) {
                c.h().a(CrashlyticsCore.TAG, "Deleting unknown file: " + name);
                file.delete();
            } else if (!set.contains(matcher.group(1))) {
                c.h().a(CrashlyticsCore.TAG, "Trimming session file: " + name);
                file.delete();
            }
        }
    }

    private File[] getTrimmedNonFatalFiles(String str, File[] fileArr, int i) {
        if (fileArr.length > i) {
            c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Trimming down to %d logged exceptions.", Integer.valueOf(i)));
            trimSessionEventFiles(str, i);
            return listFilesMatching(new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
        }
        return fileArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cleanInvalidTempFiles() {
        this.backgroundWorker.submit(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.14
            @Override // java.lang.Runnable
            public void run() {
                CrashlyticsController.this.doCleanInvalidTempFiles(CrashlyticsController.this.listFilesMatching(new InvalidPartFileFilter()));
            }
        });
    }

    void doCleanInvalidTempFiles(File[] fileArr) {
        File[] listFilesMatching;
        final HashSet hashSet = new HashSet();
        for (File file : fileArr) {
            c.h().a(CrashlyticsCore.TAG, "Found invalid session part file: " + file);
            hashSet.add(getSessionIdFromSessionFile(file));
        }
        if (hashSet.isEmpty()) {
            return;
        }
        File invalidFilesDir = getInvalidFilesDir();
        if (!invalidFilesDir.exists()) {
            invalidFilesDir.mkdir();
        }
        for (File file2 : listFilesMatching(new FilenameFilter() { // from class: com.crashlytics.android.core.CrashlyticsController.15
            @Override // java.io.FilenameFilter
            public boolean accept(File file3, String str) {
                if (str.length() < 35) {
                    return false;
                }
                return hashSet.contains(str.substring(0, 35));
            }
        })) {
            c.h().a(CrashlyticsCore.TAG, "Moving session file: " + file2);
            if (!file2.renameTo(new File(invalidFilesDir, file2.getName()))) {
                c.h().a(CrashlyticsCore.TAG, "Could not move session file. Deleting " + file2);
                file2.delete();
            }
        }
        trimInvalidSessionFiles();
    }

    private void trimInvalidSessionFiles() {
        File invalidFilesDir = getInvalidFilesDir();
        if (!invalidFilesDir.exists()) {
            return;
        }
        File[] listFilesMatching = listFilesMatching(invalidFilesDir, new InvalidPartFileFilter());
        Arrays.sort(listFilesMatching, Collections.reverseOrder());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < listFilesMatching.length && hashSet.size() < 4; i++) {
            hashSet.add(getSessionIdFromSessionFile(listFilesMatching[i]));
        }
        retainSessions(listFiles(invalidFilesDir), hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizeMostRecentNativeCrash(Context context, File file, String str) {
        byte[] minidumpFromDirectory = NativeFileUtils.minidumpFromDirectory(file);
        byte[] metadataJsonFromDirectory = NativeFileUtils.metadataJsonFromDirectory(file);
        byte[] binaryImagesJsonFromDirectory = NativeFileUtils.binaryImagesJsonFromDirectory(file, context);
        if (minidumpFromDirectory == null || minidumpFromDirectory.length == 0) {
            l h = c.h();
            h.d(CrashlyticsCore.TAG, "No minidump data found in directory " + file);
            return;
        }
        recordFatalExceptionAnswersEvent(str, "<native-crash: minidump>");
        byte[] readFile = readFile(str, "BeginSession.json");
        byte[] readFile2 = readFile(str, "SessionApp.json");
        byte[] readFile3 = readFile(str, "SessionDevice.json");
        byte[] readFile4 = readFile(str, "SessionOS.json");
        byte[] readFile5 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getUserDataFileForSession(str));
        LogFileManager logFileManager = new LogFileManager(this.crashlyticsCore.getContext(), this.logFileDirectoryProvider, str);
        byte[] bytesForLog = logFileManager.getBytesForLog();
        logFileManager.clearLog();
        byte[] readFile6 = NativeFileUtils.readFile(new MetaDataStore(getFilesDir()).getKeysFileForSession(str));
        File file2 = new File(this.fileStore.a(), str);
        if (!file2.mkdir()) {
            c.h().a(CrashlyticsCore.TAG, "Couldn't create native sessions directory");
            return;
        }
        gzipIfNotEmpty(minidumpFromDirectory, new File(file2, "minidump"));
        gzipIfNotEmpty(metadataJsonFromDirectory, new File(file2, "metadata"));
        gzipIfNotEmpty(binaryImagesJsonFromDirectory, new File(file2, "binaryImages"));
        gzipIfNotEmpty(readFile, new File(file2, "session"));
        gzipIfNotEmpty(readFile2, new File(file2, "app"));
        gzipIfNotEmpty(readFile3, new File(file2, Kind.DEVICE));
        gzipIfNotEmpty(readFile4, new File(file2, "os"));
        gzipIfNotEmpty(readFile5, new File(file2, "user"));
        gzipIfNotEmpty(bytesForLog, new File(file2, "logs"));
        gzipIfNotEmpty(readFile6, new File(file2, "keys"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean finalizeNativeReport(final CrashlyticsNdkData crashlyticsNdkData) {
        if (crashlyticsNdkData == null) {
            return true;
        }
        return ((Boolean) this.backgroundWorker.submitAndWait(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsController.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            /* renamed from: call */
            public Boolean mo23call() {
                File first;
                TreeSet<File> treeSet = crashlyticsNdkData.timestampedDirectories;
                String previousSessionId = CrashlyticsController.this.getPreviousSessionId();
                if (previousSessionId != null && !treeSet.isEmpty() && (first = treeSet.first()) != null) {
                    CrashlyticsController.this.finalizeMostRecentNativeCrash(CrashlyticsController.this.crashlyticsCore.getContext(), first, previousSessionId);
                }
                CrashlyticsController.this.recursiveDelete(treeSet);
                return Boolean.TRUE;
            }
        })).booleanValue();
    }

    private void gzipIfNotEmpty(byte[] bArr, File file) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        gzip(bArr, file);
    }

    private void gzip(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                i.a(gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                i.a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        String currentSessionId;
        CodedOutputStream newInstance;
        CodedOutputStream codedOutputStream = null;
        try {
            currentSessionId = getCurrentSessionId();
        } catch (Exception e) {
            e = e;
            clsFileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            clsFileOutputStream = null;
        }
        if (currentSessionId == null) {
            c.h().e(CrashlyticsCore.TAG, "Tried to write a fatal exception while no session was open.", null);
            i.a((Flushable) null, "Failed to flush to session begin file.");
            i.a((Closeable) null, "Failed to close fatal exception file output stream.");
            return;
        }
        recordFatalExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_FATAL_TAG);
        try {
            try {
                newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            writeSessionEvent(newInstance, date, thread, th, EVENT_TYPE_CRASH, true);
            i.a(newInstance, "Failed to flush to session begin file.");
        } catch (Exception e3) {
            e = e3;
            codedOutputStream = newInstance;
            c.h().e(CrashlyticsCore.TAG, "An error occurred in the fatal exception logger", e);
            i.a(codedOutputStream, "Failed to flush to session begin file.");
            i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
        } catch (Throwable th4) {
            th = th4;
            codedOutputStream = newInstance;
            i.a(codedOutputStream, "Failed to flush to session begin file.");
            i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
            throw th;
        }
        i.a((Closeable) clsFileOutputStream, "Failed to close fatal exception file output stream.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteNonFatal(Date date, Thread thread, Throwable th) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream newInstance;
        String currentSessionId = getCurrentSessionId();
        CodedOutputStream codedOutputStream = null;
        if (currentSessionId == null) {
            c.h().e(CrashlyticsCore.TAG, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        recordLoggedExceptionAnswersEvent(currentSessionId, th.getClass().getName());
        try {
            try {
                c.h().a(CrashlyticsCore.TAG, "Crashlytics is logging non-fatal exception \"" + th + "\" from thread " + thread.getName());
                clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), currentSessionId + SESSION_NON_FATAL_TAG + i.a(this.eventCounter.getAndIncrement()));
                try {
                    newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                writeSessionEvent(newInstance, date, thread, th, EVENT_TYPE_LOGGED, false);
                i.a(newInstance, "Failed to flush to non-fatal file.");
            } catch (Exception e2) {
                e = e2;
                codedOutputStream = newInstance;
                c.h().e(CrashlyticsCore.TAG, "An error occurred in the non-fatal exception logger", e);
                i.a(codedOutputStream, "Failed to flush to non-fatal file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                trimSessionEventFiles(currentSessionId, 64);
            } catch (Throwable th3) {
                th = th3;
                codedOutputStream = newInstance;
                i.a(codedOutputStream, "Failed to flush to non-fatal file.");
                i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            clsFileOutputStream = null;
        }
        i.a((Closeable) clsFileOutputStream, "Failed to close non-fatal file output stream.");
        try {
            trimSessionEventFiles(currentSessionId, 64);
        } catch (Exception e4) {
            c.h().e(CrashlyticsCore.TAG, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    private void writeSessionPartFile(String str, String str2, CodedOutputStreamWriteAction codedOutputStreamWriteAction) {
        ClsFileOutputStream clsFileOutputStream;
        CodedOutputStream codedOutputStream = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(getFilesDir(), str + str2);
            try {
                CodedOutputStream newInstance = CodedOutputStream.newInstance(clsFileOutputStream);
                try {
                    codedOutputStreamWriteAction.writeTo(newInstance);
                    i.a(newInstance, "Failed to flush to session " + str2 + " file.");
                    i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                } catch (Throwable th) {
                    th = th;
                    codedOutputStream = newInstance;
                    i.a(codedOutputStream, "Failed to flush to session " + str2 + " file.");
                    i.a((Closeable) clsFileOutputStream, "Failed to close session " + str2 + " file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            clsFileOutputStream = null;
        }
    }

    private void writeFile(String str, String str2, FileOutputStreamWriteAction fileOutputStreamWriteAction) {
        FileOutputStream fileOutputStream = null;
        try {
            File filesDir = getFilesDir();
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(filesDir, str + str2));
            try {
                fileOutputStreamWriteAction.writeTo(fileOutputStream2);
                i.a((Closeable) fileOutputStream2, "Failed to close " + str2 + " file.");
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                i.a((Closeable) fileOutputStream, "Failed to close " + str2 + " file.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private byte[] readFile(String str, String str2) {
        File filesDir = getFilesDir();
        return NativeFileUtils.readFile(new File(filesDir, str + str2));
    }

    private void writeBeginSession(final String str, Date date) {
        final String format = String.format(Locale.US, GENERATOR_FORMAT, this.crashlyticsCore.getVersion());
        final long time = date.getTime() / 1000;
        writeSessionPartFile(str, SESSION_BEGIN_TAG, new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.17
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeBeginSession(codedOutputStream, str, format, time);
            }
        });
        writeFile(str, "BeginSession.json", new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.18
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.18.1
                    {
                        put("session_id", str);
                        put("generator", format);
                        put("started_at_seconds", Long.valueOf(time));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionApp(String str) {
        final String c2 = this.idManager.c();
        final String str2 = this.appData.versionCode;
        final String str3 = this.appData.versionName;
        final String b2 = this.idManager.b();
        final int a2 = b.a.a.a.a.b.l.a(this.appData.installerPackageName).a();
        writeSessionPartFile(str, SESSION_APP_TAG, new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.19
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionApp(codedOutputStream, c2, CrashlyticsController.this.appData.apiKey, str2, str3, b2, a2, CrashlyticsController.this.unityVersion);
            }
        });
        writeFile(str, "SessionApp.json", new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.20
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.20.1
                    {
                        put("app_identifier", c2);
                        put("api_key", CrashlyticsController.this.appData.apiKey);
                        put("version_code", str2);
                        put("version_name", str3);
                        put("install_uuid", b2);
                        put("delivery_mechanism", Integer.valueOf(a2));
                        put("unity_version", TextUtils.isEmpty(CrashlyticsController.this.unityVersion) ? "" : CrashlyticsController.this.unityVersion);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionOS(String str) {
        final boolean g = i.g(this.crashlyticsCore.getContext());
        writeSessionPartFile(str, SESSION_OS_TAG, new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.21
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionOS(codedOutputStream, Build.VERSION.RELEASE, Build.VERSION.CODENAME, g);
            }
        });
        writeFile(str, "SessionOS.json", new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.22
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.22.1
                    {
                        put(ProviderConstants.API_COLNAME_FEATURE_VERSION, Build.VERSION.RELEASE);
                        put("build_version", Build.VERSION.CODENAME);
                        put("is_rooted", Boolean.valueOf(g));
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionDevice(String str) {
        Context context = this.crashlyticsCore.getContext();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        final int a2 = i.a();
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        final long b2 = i.b();
        final long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        final boolean f = i.f(context);
        final Map<p.a, String> h = this.idManager.h();
        final int h2 = i.h(context);
        writeSessionPartFile(str, SESSION_DEVICE_TAG, new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.23
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionDevice(codedOutputStream, a2, Build.MODEL, availableProcessors, b2, blockCount, f, h, h2, Build.MANUFACTURER, Build.PRODUCT);
            }
        });
        writeFile(str, "SessionDevice.json", new FileOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.24
            @Override // com.crashlytics.android.core.CrashlyticsController.FileOutputStreamWriteAction
            public void writeTo(FileOutputStream fileOutputStream) {
                fileOutputStream.write(new JSONObject(new HashMap<String, Object>() { // from class: com.crashlytics.android.core.CrashlyticsController.24.1
                    {
                        put("arch", Integer.valueOf(a2));
                        put("build_model", Build.MODEL);
                        put("available_processors", Integer.valueOf(availableProcessors));
                        put("total_ram", Long.valueOf(b2));
                        put("disk_space", Long.valueOf(blockCount));
                        put("is_emulator", Boolean.valueOf(f));
                        put("ids", h);
                        put("state", Integer.valueOf(h2));
                        put("build_manufacturer", Build.MANUFACTURER);
                        put("build_product", Build.PRODUCT);
                    }
                }).toString().getBytes());
            }
        });
    }

    private void writeSessionUser(String str) {
        final UserMetaData userMetaData = getUserMetaData(str);
        writeSessionPartFile(str, SESSION_USER_TAG, new CodedOutputStreamWriteAction() { // from class: com.crashlytics.android.core.CrashlyticsController.25
            @Override // com.crashlytics.android.core.CrashlyticsController.CodedOutputStreamWriteAction
            public void writeTo(CodedOutputStream codedOutputStream) {
                SessionProtobufHelper.writeSessionUser(codedOutputStream, userMetaData.id, userMetaData.name, userMetaData.email);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void writeSessionEvent(CodedOutputStream codedOutputStream, Date date, Thread thread, Throwable th, String str, boolean z) {
        ?? r6;
        Thread[] threadArr;
        Map<String, String> attributes;
        TreeMap treeMap;
        TrimmedThrowableData trimmedThrowableData = new TrimmedThrowableData(th, this.stackTraceTrimmingStrategy);
        Context context = this.crashlyticsCore.getContext();
        long time = date.getTime() / 1000;
        Float c2 = i.c(context);
        int a2 = i.a(context, this.devicePowerStateListener.isPowerConnected());
        boolean d2 = i.d(context);
        int i = context.getResources().getConfiguration().orientation;
        long b2 = i.b() - i.b(context);
        long c3 = i.c(Environment.getDataDirectory().getPath());
        ActivityManager.RunningAppProcessInfo a3 = i.a(context.getPackageName(), context);
        LinkedList linkedList = new LinkedList();
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.stacktrace;
        String str2 = this.appData.buildId;
        String c4 = this.idManager.c();
        int i2 = 0;
        if (z) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread[] threadArr2 = new Thread[allStackTraces.size()];
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                threadArr2[i2] = entry.getKey();
                linkedList.add(this.stackTraceTrimmingStrategy.getTrimmedStackTrace(entry.getValue()));
                i2++;
            }
            r6 = 1;
            threadArr = threadArr2;
        } else {
            r6 = 1;
            threadArr = new Thread[0];
        }
        if (!i.a(context, COLLECT_CUSTOM_KEYS, (boolean) r6)) {
            attributes = new TreeMap<>();
        } else {
            attributes = this.crashlyticsCore.getAttributes();
            if (attributes != null && attributes.size() > r6) {
                treeMap = new TreeMap(attributes);
                SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, a3, i, c4, str2, c2, a2, d2, b2, c3);
            }
        }
        treeMap = attributes;
        SessionProtobufHelper.writeSessionEvent(codedOutputStream, time, str, trimmedThrowableData, thread, stackTraceElementArr, threadArr, linkedList, treeMap, this.logFileManager, a3, i, c4, str2, c2, a2, d2, b2, c3);
    }

    private void writeSessionPartsToSessionFile(File file, String str, int i) {
        l h = c.h();
        h.a(CrashlyticsCore.TAG, "Collecting session parts for ID " + str);
        File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + SESSION_FATAL_TAG));
        boolean z = listFilesMatching != null && listFilesMatching.length > 0;
        c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has fatal exception: %s", str, Boolean.valueOf(z)));
        File[] listFilesMatching2 = listFilesMatching(new FileNameContainsFilter(str + SESSION_NON_FATAL_TAG));
        boolean z2 = listFilesMatching2 != null && listFilesMatching2.length > 0;
        c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", str, Boolean.valueOf(z2)));
        if (z || z2) {
            synthesizeSessionFile(file, str, getTrimmedNonFatalFiles(str, listFilesMatching2, i), z ? listFilesMatching[0] : null);
        } else {
            l h2 = c.h();
            h2.a(CrashlyticsCore.TAG, "No events present for session ID " + str);
        }
        l h3 = c.h();
        h3.a(CrashlyticsCore.TAG, "Removing session part files for ID " + str);
        deleteSessionPartFilesFor(str);
    }

    private void synthesizeSessionFile(File file, String str, File[] fileArr, File file2) {
        CodedOutputStream codedOutputStream;
        ClsFileOutputStream clsFileOutputStream;
        boolean z = file2 != null;
        File fatalSessionFilesDir = z ? getFatalSessionFilesDir() : getNonFatalSessionFilesDir();
        if (!fatalSessionFilesDir.exists()) {
            fatalSessionFilesDir.mkdirs();
        }
        CodedOutputStream codedOutputStream2 = null;
        try {
            clsFileOutputStream = new ClsFileOutputStream(fatalSessionFilesDir, str);
            try {
                try {
                    codedOutputStream = CodedOutputStream.newInstance(clsFileOutputStream);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                codedOutputStream = codedOutputStream2;
            }
            try {
                c.h().a(CrashlyticsCore.TAG, "Collecting SessionStart data for session ID " + str);
                writeToCosFromFile(codedOutputStream, file);
                codedOutputStream.writeUInt64(4, new Date().getTime() / 1000);
                codedOutputStream.writeBool(5, z);
                codedOutputStream.writeUInt32(11, 1);
                codedOutputStream.writeEnum(12, 3);
                writeInitialPartsTo(codedOutputStream, str);
                writeNonFatalEventsTo(codedOutputStream, fileArr, str);
                if (z) {
                    writeToCosFromFile(codedOutputStream, file2);
                }
                i.a(codedOutputStream, "Error flushing session file stream");
                i.a((Closeable) clsFileOutputStream, "Failed to close CLS file");
            } catch (Exception e2) {
                e = e2;
                codedOutputStream2 = codedOutputStream;
                c.h().e(CrashlyticsCore.TAG, "Failed to write session file for session ID: " + str, e);
                i.a(codedOutputStream2, "Error flushing session file stream");
                closeWithoutRenamingOrLog(clsFileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                i.a(codedOutputStream, "Error flushing session file stream");
                i.a((Closeable) clsFileOutputStream, "Failed to close CLS file");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            clsFileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            codedOutputStream = null;
            clsFileOutputStream = null;
        }
    }

    private static void writeNonFatalEventsTo(CodedOutputStream codedOutputStream, File[] fileArr, String str) {
        Arrays.sort(fileArr, i.f1063a);
        for (File file : fileArr) {
            try {
                c.h().a(CrashlyticsCore.TAG, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", str, file.getName()));
                writeToCosFromFile(codedOutputStream, file);
            } catch (Exception e) {
                c.h().e(CrashlyticsCore.TAG, "Error writting non-fatal to session.", e);
            }
        }
    }

    private void writeInitialPartsTo(CodedOutputStream codedOutputStream, String str) {
        String[] strArr;
        for (String str2 : INITIAL_SESSION_PART_TAGS) {
            File[] listFilesMatching = listFilesMatching(new FileNameContainsFilter(str + str2 + ClsFileOutputStream.SESSION_FILE_EXTENSION));
            if (listFilesMatching.length == 0) {
                c.h().e(CrashlyticsCore.TAG, "Can't find " + str2 + " data for session ID " + str, null);
            } else {
                c.h().a(CrashlyticsCore.TAG, "Collecting " + str2 + " data for session ID " + str);
                writeToCosFromFile(codedOutputStream, listFilesMatching[0]);
            }
        }
    }

    private static void writeToCosFromFile(CodedOutputStream codedOutputStream, File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            c.h().e(CrashlyticsCore.TAG, "Tried to include a file that doesn't exist: " + file.getName(), null);
            return;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                copyToCodedOutputStream(fileInputStream, codedOutputStream, (int) file.length());
                i.a((Closeable) fileInputStream, "Failed to close file input stream.");
            } catch (Throwable th) {
                th = th;
                i.a((Closeable) fileInputStream, "Failed to close file input stream.");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static void copyToCodedOutputStream(InputStream inputStream, CodedOutputStream codedOutputStream, int i) {
        int read;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < bArr.length && (read = inputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            i2 += read;
        }
        codedOutputStream.writeRawBytes(bArr);
    }

    private UserMetaData getUserMetaData(String str) {
        if (isHandlingException()) {
            return new UserMetaData(this.crashlyticsCore.getUserIdentifier(), this.crashlyticsCore.getUserName(), this.crashlyticsCore.getUserEmail());
        }
        return new MetaDataStore(getFilesDir()).readUserData(str);
    }

    boolean isHandlingException() {
        return this.crashHandler != null && this.crashHandler.isHandlingException();
    }

    File getFilesDir() {
        return this.fileStore.a();
    }

    File getFatalSessionFilesDir() {
        return new File(getFilesDir(), FATAL_SESSION_DIR);
    }

    File getNonFatalSessionFilesDir() {
        return new File(getFilesDir(), NONFATAL_SESSION_DIR);
    }

    File getInvalidFilesDir() {
        return new File(getFilesDir(), INVALID_CLS_CACHE_DIR);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void registerAnalyticsEventListener(t tVar) {
        if (!tVar.f1244d.e || !this.appMeasurementEventListenerRegistrar.register()) {
            return;
        }
        c.h().a(CrashlyticsCore.TAG, "Registered Firebase Analytics event listener");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void registerDevicePowerStateListener() {
        this.devicePowerStateListener.initialize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldPromptUserBeforeSendingCrashReports(t tVar) {
        return tVar != null && tVar.f1244d.f1216a && !this.preferenceManager.shouldAlwaysSendReports();
    }

    private CreateReportSpiCall getCreateReportSpiCall(String str, String str2) {
        String b2 = i.b(this.crashlyticsCore.getContext(), CRASHLYTICS_API_ENDPOINT);
        return new CompositeCreateReportSpiCall(new DefaultCreateReportSpiCall(this.crashlyticsCore, b2, str, this.httpRequestFactory), new NativeCreateReportSpiCall(this.crashlyticsCore, b2, str2, this.httpRequestFactory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSessionReports(t tVar) {
        if (tVar == null) {
            c.h().d(CrashlyticsCore.TAG, "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context context = this.crashlyticsCore.getContext();
        ReportUploader reportUploader = new ReportUploader(this.appData.apiKey, getCreateReportSpiCall(tVar.f1241a.f1208d, tVar.f1241a.e), this.reportFilesProvider, this.handlingExceptionCheck);
        for (File file : listCompleteSessionFiles()) {
            this.backgroundWorker.submit(new SendReportRunnable(context, new SessionReport(file, SEND_AT_CRASHTIME_HEADER), reportUploader));
        }
    }

    private static void recordLoggedExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers == null) {
            c.h().a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new j.b(str, str2));
        }
    }

    private static void recordFatalExceptionAnswersEvent(String str, String str2) {
        Answers answers = (Answers) c.a(Answers.class);
        if (answers == null) {
            c.h().a(CrashlyticsCore.TAG, "Answers is not available");
        } else {
            answers.onException(new j.a(str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recordFatalFirebaseEvent(long j) {
        if (firebaseCrashExists()) {
            c.h().a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        } else if (this.firebaseAnalyticsLogger != null) {
            c.h().a(CrashlyticsCore.TAG, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt(FIREBASE_REALTIME, 1);
            bundle.putInt(FIREBASE_CRASH_TYPE, 1);
            bundle.putLong(FIREBASE_TIMESTAMP, j);
            this.firebaseAnalyticsLogger.logEvent(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, FIREBASE_APPLICATION_EXCEPTION, bundle);
        } else {
            c.h().a(CrashlyticsCore.TAG, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    private boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    private final class ReportUploaderHandlingExceptionCheck implements ReportUploader.HandlingExceptionCheck {
        private ReportUploaderHandlingExceptionCheck() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.HandlingExceptionCheck
        public boolean isHandlingException() {
            return CrashlyticsController.this.isHandlingException();
        }
    }

    /* loaded from: classes.dex */
    private final class ReportUploaderFilesProvider implements ReportUploader.ReportFilesProvider {
        private ReportUploaderFilesProvider() {
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getCompleteSessionFiles() {
            return CrashlyticsController.this.listCompleteSessionFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getInvalidSessionFiles() {
            return CrashlyticsController.this.getInvalidFilesDir().listFiles();
        }

        @Override // com.crashlytics.android.core.ReportUploader.ReportFilesProvider
        public File[] getNativeReportFiles() {
            return CrashlyticsController.this.listNativeSessionFileDirectories();
        }
    }

    /* loaded from: classes.dex */
    private static final class PrivacyDialogCheck implements ReportUploader.SendCheck {
        private final b.a.a.a.i kit;
        private final PreferenceManager preferenceManager;
        private final o promptData;

        public PrivacyDialogCheck(b.a.a.a.i iVar, PreferenceManager preferenceManager, o oVar) {
            this.kit = iVar;
            this.preferenceManager = preferenceManager;
            this.promptData = oVar;
        }

        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            Activity b2 = this.kit.getFabric().b();
            if (b2 == null || b2.isFinishing()) {
                return true;
            }
            final CrashPromptDialog create = CrashPromptDialog.create(b2, this.promptData, new CrashPromptDialog.AlwaysSendCallback() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.1
                @Override // com.crashlytics.android.core.CrashPromptDialog.AlwaysSendCallback
                public void sendUserReportsWithoutPrompting(boolean z) {
                    PrivacyDialogCheck.this.preferenceManager.setShouldAlwaysSendReports(z);
                }
            });
            b2.runOnUiThread(new Runnable() { // from class: com.crashlytics.android.core.CrashlyticsController.PrivacyDialogCheck.2
                @Override // java.lang.Runnable
                public void run() {
                    create.show();
                }
            });
            c.h().a(CrashlyticsCore.TAG, "Waiting for user opt-in.");
            create.await();
            return create.getOptIn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SendReportRunnable implements Runnable {
        private final Context context;
        private final Report report;
        private final ReportUploader reportUploader;

        public SendReportRunnable(Context context, Report report, ReportUploader reportUploader) {
            this.context = context;
            this.report = report;
            this.reportUploader = reportUploader;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!i.n(this.context)) {
                return;
            }
            c.h().a(CrashlyticsCore.TAG, "Attempting to send crash report at time of crash...");
            this.reportUploader.forceUpload(this.report);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class LogFileDirectoryProvider implements LogFileManager.DirectoryProvider {
        private static final String LOG_FILES_DIR = "log-files";
        private final a rootFileStore;

        public LogFileDirectoryProvider(a aVar) {
            this.rootFileStore = aVar;
        }

        @Override // com.crashlytics.android.core.LogFileManager.DirectoryProvider
        public File getLogFileDir() {
            File file = new File(this.rootFileStore.a(), LOG_FILES_DIR);
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* loaded from: classes.dex */
    private static final class DefaultSettingsDataProvider implements CrashlyticsUncaughtExceptionHandler.SettingsDataProvider {
        private DefaultSettingsDataProvider() {
        }

        @Override // com.crashlytics.android.core.CrashlyticsUncaughtExceptionHandler.SettingsDataProvider
        public t getSettingsData() {
            return q.a().b();
        }
    }
}
