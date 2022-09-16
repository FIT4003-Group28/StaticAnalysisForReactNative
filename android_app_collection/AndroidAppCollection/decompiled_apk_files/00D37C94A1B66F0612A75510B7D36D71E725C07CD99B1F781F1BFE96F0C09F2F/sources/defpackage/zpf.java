package defpackage;

import android.os.AsyncTask;
import java.io.File;
/* compiled from: PG */
/* renamed from: zpf  reason: default package */
/* loaded from: classes4.dex */
final class zpf extends AsyncTask {
    final /* synthetic */ axbw a;
    final /* synthetic */ File b;
    final /* synthetic */ axbw c;
    final /* synthetic */ zpg d;

    public zpf(zpg zpgVar, axbw axbwVar, File file, axbw axbwVar2) {
        this.d = zpgVar;
        this.a = axbwVar;
        this.b = file;
        this.c = axbwVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r6) {
        /*
            r5 = this;
            java.lang.Void[] r6 = (java.lang.Void[]) r6
            axbw r6 = r5.a
            byte[] r6 = r6.toByteArray()
            r0 = 0
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            java.io.File r1 = r1.getParentFile()     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.exists()     // Catch: java.io.IOException -> L6a
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L24
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            java.io.File r1 = r1.getParentFile()     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.mkdirs()     // Catch: java.io.IOException -> L6a
            if (r1 != 0) goto L24
            r2 = 0
        L24:
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.exists()     // Catch: java.io.IOException -> L6a
            if (r1 == 0) goto L35
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.delete()     // Catch: java.io.IOException -> L6a
            if (r1 != 0) goto L35
            r2 = 0
        L35:
            if (r6 == 0) goto L72
            int r1 = r6.length     // Catch: java.io.IOException -> L6a
            if (r1 <= 0) goto L72
            if (r2 == 0) goto L72
            java.io.File r1 = r5.b     // Catch: java.io.IOException -> L6a
            boolean r1 = r1.createNewFile()     // Catch: java.io.IOException -> L6a
            if (r1 == 0) goto L72
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L6a
            r1.<init>(r6)     // Catch: java.io.IOException -> L6a
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L6a
            java.io.File r2 = r5.b     // Catch: java.io.IOException -> L6a
            r6.<init>(r2)     // Catch: java.io.IOException -> L6a
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L6a
        L54:
            int r4 = r1.read(r2)     // Catch: java.io.IOException -> L6a
            if (r4 <= 0) goto L61
            r6.write(r2, r3, r4)     // Catch: java.io.IOException -> L6a
            java.util.Arrays.fill(r2, r3)     // Catch: java.io.IOException -> L6a
            goto L54
        L61:
            r1.close()     // Catch: java.io.IOException -> L6a
            r6.close()     // Catch: java.io.IOException -> L6a
            java.io.File r6 = r5.b     // Catch: java.io.IOException -> L6a
            goto L73
        L6a:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            defpackage.zep.b(r6)
        L72:
            r6 = r0
        L73:
            zpg r1 = r5.d
            java.lang.Object r1 = r1.d
            monitor-enter(r1)
            zpg r2 = r5.d     // Catch: java.lang.Throwable -> La1
            java.util.List r2 = r2.a     // Catch: java.lang.Throwable -> La1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La1
        L80:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r3 == 0) goto L92
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La1
            zqx r3 = (defpackage.zqx) r3     // Catch: java.lang.Throwable -> La1
            axbw r4 = r5.c     // Catch: java.lang.Throwable -> La1
            r3.a(r6, r4)     // Catch: java.lang.Throwable -> La1
            goto L80
        L92:
            zpg r6 = r5.d     // Catch: java.lang.Throwable -> La1
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> La1
            r6.clear()     // Catch: java.lang.Throwable -> La1
            zpg r6 = r5.d     // Catch: java.lang.Throwable -> La1
            amon r2 = defpackage.amon.a     // Catch: java.lang.Throwable -> La1
            r6.c = r2     // Catch: java.lang.Throwable -> La1
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            return r0
        La1:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La1
            goto La5
        La4:
            throw r6
        La5:
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpf.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
