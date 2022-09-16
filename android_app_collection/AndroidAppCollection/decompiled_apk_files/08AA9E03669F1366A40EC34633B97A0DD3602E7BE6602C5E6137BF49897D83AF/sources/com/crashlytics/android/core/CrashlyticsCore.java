package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import b.a.a.a.a.b.g;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.o;
import b.a.a.a.a.b.p;
import b.a.a.a.a.c.d;
import b.a.a.a.a.c.m;
import b.a.a.a.a.e.e;
import b.a.a.a.a.f.b;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.crashlytics.android.answers.EventLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
@d(a = {CrashlyticsNdkDataProvider.class})
/* loaded from: classes.dex */
public class CrashlyticsCore extends i<Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
    private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final String TAG = "CrashlyticsCore";
    private final ConcurrentHashMap<String, String> attributes;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private e httpRequestFactory;
    private CrashlyticsFileMarker initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    @Override // b.a.a.a.i
    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    @Override // b.a.a.a.i
    public String getVersion() {
        return "2.6.3.25";
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public Builder delay(float f) {
            if (f <= BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalArgumentException("delay must be greater than 0");
            }
            if (this.delay > BitmapDescriptorFactory.HUE_RED) {
                throw new IllegalStateException("delay already set.");
            }
            this.delay = f;
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            }
            if (this.listener != null) {
                throw new IllegalStateException("listener already set.");
            }
            this.listener = crashlyticsListener;
            return this;
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider) {
            if (pinningInfoProvider == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            }
            if (this.pinningInfoProvider != null) {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
            this.pinningInfoProvider = pinningInfoProvider;
            return this;
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public CrashlyticsCore build() {
            if (this.delay < BitmapDescriptorFactory.HUE_RED) {
                this.delay = CrashlyticsCore.CLS_DEFAULT_PROCESS_DELAY;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }
    }

    public CrashlyticsCore() {
        this(CLS_DEFAULT_PROCESS_DELAY, null, null, false);
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, n.a("Crashlytics Exception Handler"));
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        this.listener = crashlyticsListener == null ? new NoOpListener() : crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap<>();
        this.startTime = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    public boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context) {
        String a2;
        if (!this.disabled && (a2 = new g().a(context)) != null) {
            String m = b.a.a.a.a.b.i.m(context);
            if (!isBuildIdValid(m, b.a.a.a.a.b.i.a(context, CRASHLYTICS_REQUIRE_BUILD_ID, (boolean) CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT))) {
                throw new m(MISSING_BUILD_ID_MSG);
            }
            try {
                l h = c.h();
                h.c(TAG, "Initializing Crashlytics " + getVersion());
                b bVar = new b(this);
                this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, bVar);
                this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, bVar);
                PreferenceManager create = PreferenceManager.create(new b.a.a.a.a.f.d(getContext(), PREFERENCE_STORE_NAME), this);
                CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider = this.pinningInfo != null ? new CrashlyticsPinningInfoProvider(this.pinningInfo) : null;
                this.httpRequestFactory = new b.a.a.a.a.e.b(c.h());
                this.httpRequestFactory.a(crashlyticsPinningInfoProvider);
                p idManager = getIdManager();
                AppData create2 = AppData.create(context, idManager, a2, m);
                ManifestUnityVersionProvider manifestUnityVersionProvider = new ManifestUnityVersionProvider(context, create2.packageName);
                AppMeasurementEventListenerRegistrar instanceFrom = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
                EventLogger eventLogger = AppMeasurementEventLogger.getEventLogger(context);
                l h2 = c.h();
                h2.a(TAG, "Installer package name is: " + create2.installerPackageName);
                this.controller = new CrashlyticsController(this, this.backgroundWorker, this.httpRequestFactory, idManager, create, bVar, create2, manifestUnityVersionProvider, instanceFrom, eventLogger);
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), new o().b(context));
                if (didPreviousInitializationFail && b.a.a.a.a.b.i.n(context)) {
                    c.h().a(TAG, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    finishInitSynchronously();
                    return false;
                }
                c.h().a(TAG, "Exception handling initialization successful");
                return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
            } catch (Exception e) {
                c.h().e(TAG, "Crashlytics was not started due to an exception during initialization", e);
                this.controller = null;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    /* renamed from: doInBackground  reason: collision with other method in class */
    public Void mo24doInBackground() {
        t b2;
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            try {
                this.controller.registerDevicePowerStateListener();
                b2 = q.a().b();
            } catch (Exception e) {
                c.h().e(TAG, "Crashlytics encountered a problem during asynchronous initialization.", e);
            }
            if (b2 == null) {
                c.h().d(TAG, "Received null settings, skipping report submission!");
                return null;
            }
            this.controller.registerAnalyticsEventListener(b2);
            if (!b2.f1244d.f1218c) {
                c.h().a(TAG, "Collection of crash reports disabled in Crashlytics settings.");
                return null;
            }
            CrashlyticsNdkData nativeCrashData = getNativeCrashData();
            if (nativeCrashData != null && !this.controller.finalizeNativeReport(nativeCrashData)) {
                c.h().a(TAG, "Could not finalize previous NDK sessions.");
            }
            if (!this.controller.finalizeSessions(b2.f1242b)) {
                c.h().a(TAG, "Could not finalize previous sessions.");
            }
            this.controller.submitAllReports(this.delay, b2);
            return null;
        } finally {
            markInitializationComplete();
        }
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) c.a(CrashlyticsCore.class);
    }

    public PinningInfoProvider getPinningInfoProvider() {
        if (!this.disabled) {
            return this.pinningInfo;
        }
        return null;
    }

    public void logException(Throwable th) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging exceptions.")) {
            if (th == null) {
                c.h().a(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
            } else {
                this.controller.writeNonFatalException(Thread.currentThread(), th);
            }
        }
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        c.h().a(i, "" + str, "" + str2, CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT);
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userId = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userName = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userEmail = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setString(String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting keys.")) {
            if (str == null) {
                Context context = getContext();
                if (context != null && b.a.a.a.a.b.i.i(context)) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                c.h().e(TAG, "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
            String sanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() >= 64 && !this.attributes.containsKey(sanitizeAttribute)) {
                c.h().a(TAG, "Exceeded maximum number of custom attributes (64)");
                return;
            }
            this.attributes.put(sanitizeAttribute, str2 == null ? "" : sanitizeAttribute(str2));
            this.controller.cacheKeyData(this.attributes);
        }
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    public void setDouble(String str, double d2) {
        setString(str, Double.toString(d2));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Exception e) {
            c.h().e(TAG, "Could not verify SSL pinning", e);
            return false;
        }
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        c.h().d(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener == null) {
            throw new IllegalArgumentException("listener must not be null.");
        }
        this.listener = crashlyticsListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    CrashlyticsController getController() {
        return this.controller;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserIdentifier() {
        if (getIdManager().a()) {
            return this.userId;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserEmail() {
        if (getIdManager().a()) {
            return this.userEmail;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getUserName() {
        if (getIdManager().a()) {
            return this.userName;
        }
        return null;
    }

    private void finishInitSynchronously() {
        b.a.a.a.a.c.g<Void> gVar = new b.a.a.a.a.c.g<Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.1
            @Override // java.util.concurrent.Callable
            public Void call() {
                return CrashlyticsCore.this.mo24doInBackground();
            }

            @Override // b.a.a.a.a.c.j, b.a.a.a.a.c.i
            public b.a.a.a.a.c.e getPriority() {
                return b.a.a.a.a.c.e.IMMEDIATE;
            }
        };
        for (b.a.a.a.a.c.l lVar : getDependencies()) {
            gVar.addDependency(lVar);
        }
        Future submit = getFabric().f().submit(gVar);
        c.h().a(TAG, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            c.h().e(TAG, "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            c.h().e(TAG, "Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            c.h().e(TAG, "Crashlytics timed out during initialization.", e3);
        }
    }

    void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new Callable<Void>() { // from class: com.crashlytics.android.core.CrashlyticsCore.2
            @Override // java.util.concurrent.Callable
            public Void call() {
                CrashlyticsCore.this.initializationMarker.create();
                c.h().a(CrashlyticsCore.TAG, "Initialization marker file created.");
                return null;
            }
        });
    }

    void markInitializationComplete() {
        this.backgroundWorker.submit(new Callable<Boolean>() { // from class: com.crashlytics.android.core.CrashlyticsCore.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            /* renamed from: call */
            public Boolean mo26call() {
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    l h = c.h();
                    h.a(CrashlyticsCore.TAG, "Initialization marker file removed: " + remove);
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    c.h().e(CrashlyticsCore.TAG, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return false;
                }
            }
        });
    }

    boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider;
    }

    CrashlyticsNdkData getNativeCrashData() {
        if (this.crashlyticsNdkDataProvider != null) {
            return this.crashlyticsNdkDataProvider.getCrashlyticsNdkData();
        }
        return null;
    }

    boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() != null) {
            b.a.a.a.a.e.d a2 = this.httpRequestFactory.a(b.a.a.a.a.e.c.GET, url.toString());
            ((HttpsURLConnection) a2.a()).setInstanceFollowRedirects(false);
            a2.b();
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        }
        return false;
    }

    private void checkForPreviousCrash() {
        if (!Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            return;
        }
        try {
            this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
        } catch (Exception e) {
            c.h().e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void createCrashMarker() {
        this.crashMarker.create();
    }

    private static String formatLogMessage(int i, String str, String str2) {
        return b.a.a.a.a.b.i.b(i) + "/" + str + " " + str2;
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore crashlyticsCore = getInstance();
        if (crashlyticsCore == null || crashlyticsCore.controller == null) {
            l h = c.h();
            h.e(TAG, "Crashlytics must be initialized by calling Fabric.with(Context) " + str, null);
            return false;
        }
        return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
    }

    private static String sanitizeAttribute(String str) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Boolean mo27call() {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            c.h().a(CrashlyticsCore.TAG, "Found previous crash marker.");
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    private static final class NoOpListener implements CrashlyticsListener {
        @Override // com.crashlytics.android.core.CrashlyticsListener
        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        private NoOpListener() {
        }
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            c.h().a(TAG, "Configured not to require a build ID.");
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        } else if (!b.a.a.a.a.b.i.d(str)) {
            return CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT;
        } else {
            Log.e(TAG, ".");
            Log.e(TAG, ".     |  | ");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".   \\ |  | /");
            Log.e(TAG, ".    \\    /");
            Log.e(TAG, ".     \\  /");
            Log.e(TAG, ".      \\/");
            Log.e(TAG, ".");
            Log.e(TAG, MISSING_BUILD_ID_MSG);
            Log.e(TAG, ".");
            Log.e(TAG, ".      /\\");
            Log.e(TAG, ".     /  \\");
            Log.e(TAG, ".    /    \\");
            Log.e(TAG, ".   / |  | \\");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".     |  |");
            Log.e(TAG, ".");
            return false;
        }
    }
}
