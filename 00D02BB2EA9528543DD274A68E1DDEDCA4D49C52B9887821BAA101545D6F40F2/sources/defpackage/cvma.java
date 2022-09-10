package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cvma  reason: default package */
/* loaded from: classes5.dex */
public final class cvma {
    private final Context a;
    private final pbn b;

    public cvma(Context context, pbn pbnVar) {
        this.a = context;
        this.b = pbnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.concurrent.Future<android.graphics.Bitmap> a(java.lang.String r7, int r8, int r9) {
        /*
            r6 = this;
            android.net.Uri r0 = android.net.Uri.parse(r7)
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L83
            java.lang.String r1 = r0.getScheme()
            int r2 = r1.hashCode()
            r3 = -368816979(0xffffffffea044cad, float:-3.9985074E25)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L3c
            r3 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r2 == r3) goto L32
            r3 = 951530617(0x38b73479, float:8.735894E-5)
            if (r2 == r3) goto L28
            goto L46
        L28:
            java.lang.String r2 = "content"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L46
            r1 = 1
            goto L47
        L32:
            java.lang.String r2 = "file"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L46
            r1 = 2
            goto L47
        L3c:
            java.lang.String r2 = "android.resource"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L46
            r1 = 0
            goto L47
        L46:
            r1 = -1
        L47:
            if (r1 == 0) goto L6e
            if (r1 == r5) goto L4e
            if (r1 == r4) goto L4e
            goto L83
        L4e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "HTTP Scheme not suported for URL: "
            int r0 = r7.length()
            if (r0 == 0) goto L61
            java.lang.String r7 = r9.concat(r7)
            goto L66
        L61:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
        L66:
            r8.<init>(r7)
            dehn r7 = defpackage.deha.b(r8)
            return r7
        L6e:
            android.content.Context r7 = r6.a     // Catch: java.io.FileNotFoundException -> L7d
            java.io.InputStream r7 = defpackage.cxnp.a(r7, r0)     // Catch: java.io.FileNotFoundException -> L7d
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch: java.io.FileNotFoundException -> L7d
            dehn r7 = defpackage.deha.a(r7)     // Catch: java.io.FileNotFoundException -> L7d
            goto L82
        L7d:
            r7 = move-exception
            dehn r7 = defpackage.deha.b(r7)
        L82:
            return r7
        L83:
            pbn r0 = r6.b
            java.util.concurrent.Future r7 = r0.a(r7, r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvma.a(java.lang.String, int, int):java.util.concurrent.Future");
    }
}
