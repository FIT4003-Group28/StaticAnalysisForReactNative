package com.crashlytics.android.core;

import b.a.a.a.a.b.h;
import b.a.a.a.c;
import b.a.a.a.l;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReportUploader {
    static final Map<String, String> HEADER_INVALID_CLS_FILE = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    private static final short[] RETRY_INTERVALS = {10, 20, 30, 60, 120, 300};
    private final String apiKey;
    private final CreateReportSpiCall createReportCall;
    private final Object fileAccessLock = new Object();
    private final HandlingExceptionCheck handlingExceptionCheck;
    private final ReportFilesProvider reportFilesProvider;
    private Thread uploadThread;

    /* loaded from: classes.dex */
    static final class AlwaysSendCheck implements SendCheck {
        @Override // com.crashlytics.android.core.ReportUploader.SendCheck
        public boolean canSendReports() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface HandlingExceptionCheck {
        boolean isHandlingException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface ReportFilesProvider {
        File[] getCompleteSessionFiles();

        File[] getInvalidSessionFiles();

        File[] getNativeReportFiles();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface SendCheck {
        boolean canSendReports();
    }

    public ReportUploader(String str, CreateReportSpiCall createReportSpiCall, ReportFilesProvider reportFilesProvider, HandlingExceptionCheck handlingExceptionCheck) {
        if (createReportSpiCall == null) {
            throw new IllegalArgumentException("createReportCall must not be null.");
        }
        this.createReportCall = createReportSpiCall;
        this.apiKey = str;
        this.reportFilesProvider = reportFilesProvider;
        this.handlingExceptionCheck = handlingExceptionCheck;
    }

    public synchronized void uploadReports(float f, SendCheck sendCheck) {
        if (this.uploadThread != null) {
            c.h().a(CrashlyticsCore.TAG, "Report upload has already been started.");
            return;
        }
        this.uploadThread = new Thread(new Worker(f, sendCheck), "Crashlytics Report Uploader");
        this.uploadThread.start();
    }

    boolean isUploading() {
        return this.uploadThread != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean forceUpload(Report report) {
        boolean z;
        synchronized (this.fileAccessLock) {
            z = false;
            try {
                boolean invoke = this.createReportCall.invoke(new CreateReportRequest(this.apiKey, report));
                l h = c.h();
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(invoke ? "complete: " : "FAILED: ");
                sb.append(report.getIdentifier());
                h.c(CrashlyticsCore.TAG, sb.toString());
                if (invoke) {
                    report.remove();
                    z = true;
                }
            } catch (Exception e) {
                l h2 = c.h();
                h2.e(CrashlyticsCore.TAG, "Error occurred sending report " + report, e);
            }
        }
        return z;
    }

    List<Report> findReports() {
        File[] completeSessionFiles;
        File[] invalidSessionFiles;
        File[] nativeReportFiles;
        c.h().a(CrashlyticsCore.TAG, "Checking for crash reports...");
        synchronized (this.fileAccessLock) {
            completeSessionFiles = this.reportFilesProvider.getCompleteSessionFiles();
            invalidSessionFiles = this.reportFilesProvider.getInvalidSessionFiles();
            nativeReportFiles = this.reportFilesProvider.getNativeReportFiles();
        }
        LinkedList linkedList = new LinkedList();
        if (completeSessionFiles != null) {
            for (File file : completeSessionFiles) {
                c.h().a(CrashlyticsCore.TAG, "Found crash report " + file.getPath());
                linkedList.add(new SessionReport(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (invalidSessionFiles != null) {
            for (File file2 : invalidSessionFiles) {
                String sessionIdFromSessionFile = CrashlyticsController.getSessionIdFromSessionFile(file2);
                if (!hashMap.containsKey(sessionIdFromSessionFile)) {
                    hashMap.put(sessionIdFromSessionFile, new LinkedList());
                }
                ((List) hashMap.get(sessionIdFromSessionFile)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            c.h().a(CrashlyticsCore.TAG, "Found invalid session: " + str);
            List list = (List) hashMap.get(str);
            linkedList.add(new InvalidSessionReport(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (nativeReportFiles != null) {
            for (File file3 : nativeReportFiles) {
                linkedList.add(new NativeSessionReport(file3));
            }
        }
        if (linkedList.isEmpty()) {
            c.h().a(CrashlyticsCore.TAG, "No reports found.");
        }
        return linkedList;
    }

    /* loaded from: classes.dex */
    private class Worker extends h {
        private final float delay;
        private final SendCheck sendCheck;

        Worker(float f, SendCheck sendCheck) {
            this.delay = f;
            this.sendCheck = sendCheck;
        }

        @Override // b.a.a.a.a.b.h
        public void onRun() {
            try {
                attemptUploadWithRetry();
            } catch (Exception e) {
                c.h().e(CrashlyticsCore.TAG, "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            ReportUploader.this.uploadThread = null;
        }

        private void attemptUploadWithRetry() {
            c.h().a(CrashlyticsCore.TAG, "Starting report processing in " + this.delay + " second(s)...");
            if (this.delay > BitmapDescriptorFactory.HUE_RED) {
                try {
                    Thread.sleep(this.delay * 1000.0f);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<Report> findReports = ReportUploader.this.findReports();
            if (ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                return;
            }
            if (!findReports.isEmpty() && !this.sendCheck.canSendReports()) {
                c.h().a(CrashlyticsCore.TAG, "User declined to send. Removing " + findReports.size() + " Report(s).");
                for (Report report : findReports) {
                    report.remove();
                }
                return;
            }
            int i = 0;
            while (!findReports.isEmpty() && !ReportUploader.this.handlingExceptionCheck.isHandlingException()) {
                c.h().a(CrashlyticsCore.TAG, "Attempting to send " + findReports.size() + " report(s)");
                for (Report report2 : findReports) {
                    ReportUploader.this.forceUpload(report2);
                }
                findReports = ReportUploader.this.findReports();
                if (!findReports.isEmpty()) {
                    int i2 = i + 1;
                    long j = ReportUploader.RETRY_INTERVALS[Math.min(i, ReportUploader.RETRY_INTERVALS.length - 1)];
                    c.h().a(CrashlyticsCore.TAG, "Report submisson: scheduling delayed retry in " + j + " seconds");
                    try {
                        Thread.sleep(j * 1000);
                        i = i2;
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }
}
