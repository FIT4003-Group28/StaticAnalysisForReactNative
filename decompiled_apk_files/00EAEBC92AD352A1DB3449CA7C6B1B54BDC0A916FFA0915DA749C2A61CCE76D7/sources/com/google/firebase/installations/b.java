package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* loaded from: classes.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f9339a;

    /* renamed from: b  reason: collision with root package name */
    private final FileLock f9340b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.f9339a = fileChannel;
        this.f9340b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.firebase.installations.b a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            java.io.File r4 = r4.getFilesDir()     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            r1.<init>(r4, r5)     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.lang.Error -> L28 java.io.IOException -> L2a
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.lang.Error -> L23 java.io.IOException -> L25
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch: java.lang.Error -> L1f java.io.IOException -> L21
            r1.<init>(r4, r5)     // Catch: java.lang.Error -> L1f java.io.IOException -> L21
            return r1
        L1f:
            r1 = move-exception
            goto L2d
        L21:
            r1 = move-exception
            goto L2d
        L23:
            r1 = move-exception
            goto L26
        L25:
            r1 = move-exception
        L26:
            r5 = r0
            goto L2d
        L28:
            r1 = move-exception
            goto L2b
        L2a:
            r1 = move-exception
        L2b:
            r4 = r0
            r5 = r4
        L2d:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L3b
            r5.release()     // Catch: java.io.IOException -> L3a
            goto L3b
        L3a:
        L3b:
            if (r4 == 0) goto L40
            r4.close()     // Catch: java.io.IOException -> L40
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        try {
            this.f9340b.release();
            this.f9339a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
