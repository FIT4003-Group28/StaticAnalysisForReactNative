package com.crashlytics.android.core;

import b.a.a.a.a.b.i;
import b.a.a.a.a.b.r;
import b.a.a.a.c;
import b.a.a.a.l;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
/* loaded from: classes.dex */
class QueueFileLogStore implements FileLogStore {
    private r logFile;
    private final int maxLogSize;
    private final File workingFile;

    /* loaded from: classes.dex */
    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public ByteString getLogAsByteString() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return ByteString.copyFrom(logBytes.bytes, 0, logBytes.offset);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        return logBytes.bytes;
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        if (this.logFile == null) {
            return null;
        }
        final int[] iArr = {0};
        final byte[] bArr = new byte[this.logFile.a()];
        try {
            this.logFile.a(new r.c() { // from class: com.crashlytics.android.core.QueueFileLogStore.1
                @Override // b.a.a.a.a.b.r.c
                public void read(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (IOException e) {
            c.h().e(CrashlyticsCore.TAG, "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void closeLogFile() {
        i.a(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.crashlytics.android.core.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new r(this.workingFile);
            } catch (IOException e) {
                l h = c.h();
                h.e(CrashlyticsCore.TAG, "Could not open log file: " + this.workingFile, e);
            }
        }
    }

    private void doWriteToLog(long j, String str) {
        int i;
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.maxLogSize / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.logFile.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes("UTF-8"));
            while (!this.logFile.b() && this.logFile.a() > this.maxLogSize) {
                this.logFile.c();
            }
        } catch (IOException e) {
            c.h().e(CrashlyticsCore.TAG, "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
