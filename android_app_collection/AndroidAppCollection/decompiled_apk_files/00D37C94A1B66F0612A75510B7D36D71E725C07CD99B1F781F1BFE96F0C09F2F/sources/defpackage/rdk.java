package defpackage;

import android.content.Context;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: rdk  reason: default package */
/* loaded from: classes4.dex */
final class rdk {
    private final Context a;
    private rdl b;

    public rdk(Context context) {
        this.a = context;
    }

    private final File c() {
        return new File(this.a.getCacheDir(), "gms_cache");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        this.b = null;
        rdl a = rdl.a(gmsDeviceComplianceResponse, 1, 0L);
        long j = a.b;
        long currentTimeMillis = System.currentTimeMillis();
        if (j < 1 || j > currentTimeMillis + 3600000) {
            j = currentTimeMillis + 3600000;
        }
        GmsDeviceComplianceResponse gmsDeviceComplianceResponse2 = a.a;
        int i = 0;
        if (gmsDeviceComplianceResponse2 != null && gmsDeviceComplianceResponse2.b) {
            i = 1;
        }
        byte[] array = ByteBuffer.allocate(16).putInt(1).putLong(j).putInt(i).array();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(c());
            try {
                fileOutputStream.write(array);
                fileOutputStream.close();
                this.b = a;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d A[Catch: all -> 0x00ba, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:9:0x000e, B:12:0x0019, B:15:0x0020, B:18:0x002d, B:37:0x008a, B:43:0x0094, B:49:0x009d, B:53:0x00a6, B:56:0x00af, B:58:0x00b5, B:41:0x0092, B:6:0x0008), top: B:72:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse a() {
        /*
            r15 = this;
            monitor-enter(r15)
            rdl r0 = r15.b     // Catch: java.lang.Throwable -> Lba
            r1 = 0
            if (r0 != 0) goto L8
            r2 = r1
            goto La
        L8:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r2 = r0.a     // Catch: java.lang.Throwable -> Lba
        La:
            if (r0 == 0) goto L20
            if (r2 == 0) goto L20
            long r3 = r0.b     // Catch: java.lang.Throwable -> Lba
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lba
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L19
            goto L20
        L19:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r0 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> Lba
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r15)
            return r0
        L20:
            r15.b = r1     // Catch: java.lang.Throwable -> Lba
            java.io.File r0 = r15.c()     // Catch: java.lang.Throwable -> Lba
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> Lba
            r3 = 1
            if (r2 == 0) goto L98
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.IOException -> L93 java.lang.Throwable -> Lba
            r2.<init>(r0)     // Catch: java.io.IOException -> L93 java.lang.Throwable -> Lba
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L8e
            r5 = 4096(0x1000, float:5.74E-42)
            r4.<init>(r2, r5)     // Catch: java.lang.Throwable -> L8e
            r5 = 16
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L8e
            int r4 = r4.read(r6)     // Catch: java.lang.Throwable -> L8e
            r7 = 0
            r9 = 2
            if (r4 == r5) goto L4b
            rdl r4 = defpackage.rdl.a(r1, r9, r7)     // Catch: java.lang.Throwable -> L8e
            goto L8a
        L4b:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r6)     // Catch: java.lang.Throwable -> L8e
            int r5 = r4.getInt()     // Catch: java.lang.Throwable -> L8e
            if (r5 == r3) goto L5a
            rdl r4 = defpackage.rdl.a(r1, r9, r7)     // Catch: java.lang.Throwable -> L8e
            goto L8a
        L5a:
            long r5 = r4.getLong()     // Catch: java.lang.Throwable -> L8e
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L8e
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r12 + r10
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 <= 0) goto L6f
            rdl r4 = defpackage.rdl.a(r1, r9, r7)     // Catch: java.lang.Throwable -> L8e
            goto L8a
        L6f:
            int r4 = r4.getInt()     // Catch: java.lang.Throwable -> L8e
            if (r4 != r3) goto L77
            r4 = 1
            goto L78
        L77:
            r4 = 0
        L78:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r7 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> L8e
            r7.<init>(r3, r3, r1)     // Catch: java.lang.Throwable -> L8e
            r7.b = r4     // Catch: java.lang.Throwable -> L8e
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 <= 0) goto L85
            r4 = 3
            goto L86
        L85:
            r4 = 1
        L86:
            rdl r4 = defpackage.rdl.a(r7, r4, r5)     // Catch: java.lang.Throwable -> L8e
        L8a:
            r2.close()     // Catch: java.io.IOException -> L94 java.lang.Throwable -> Lba
            goto L99
        L8e:
            r4 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L92
        L92:
            throw r4     // Catch: java.io.IOException -> L93 java.lang.Throwable -> Lba
        L93:
            r4 = r1
        L94:
            r0.delete()     // Catch: java.lang.Throwable -> Lba
            goto L99
        L98:
            r4 = r1
        L99:
            if (r4 != 0) goto L9d
            monitor-exit(r15)
            return r1
        L9d:
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r2 = r4.a     // Catch: java.lang.Throwable -> Lba
            int r5 = r4.c     // Catch: java.lang.Throwable -> Lba
            if (r5 != r3) goto Laf
            if (r2 != 0) goto La6
            goto Laf
        La6:
            r15.b = r4     // Catch: java.lang.Throwable -> Lba
            com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse r0 = new com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse     // Catch: java.lang.Throwable -> Lba
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r15)
            return r0
        Laf:
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lb8
            r0.delete()     // Catch: java.lang.Throwable -> Lba
        Lb8:
            monitor-exit(r15)
            return r1
        Lba:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdk.a():com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse");
    }
}
