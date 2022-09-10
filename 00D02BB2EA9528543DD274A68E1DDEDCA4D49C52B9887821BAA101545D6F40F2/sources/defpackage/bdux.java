package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bdux  reason: default package */
/* loaded from: classes3.dex */
public final class bdux {
    private static final String[] b = {"_data"};
    public final Context a;

    public bdux(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    @defpackage.dzsi
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6, android.net.Uri r7) {
        /*
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r2 = r6.getPackageName()
            android.net.Uri$Builder r0 = r0.authority(r2)
            java.lang.String r2 = "photos"
            android.net.Uri$Builder r0 = r0.appendPath(r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r7.toString()
            boolean r3 = r2.startsWith(r0)
            if (r3 == 0) goto L4a
            int r0 = r0.length()
            java.lang.String r0 = r2.substring(r0)
            java.lang.String r0 = android.net.Uri.decode(r0)
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L47
            dbsg r0 = defpackage.dbsg.i(r0)
            goto L4c
        L47:
            r7.toString()
        L4a:
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a
        L4c:
            boolean r2 = r0.a()
            if (r2 == 0) goto L59
            java.lang.Object r6 = r0.b()
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L59:
            java.lang.String r0 = r7.getScheme()
            r2 = 0
            if (r0 != 0) goto L61
            return r2
        L61:
            int r3 = r0.hashCode()
            r4 = 3143036(0x2ff57c, float:4.404332E-39)
            r5 = 1
            if (r3 == r4) goto L79
            r4 = 951530617(0x38b73479, float:8.735894E-5)
            if (r3 == r4) goto L71
            goto L83
        L71:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L83
            r0 = 0
            goto L84
        L79:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L83
            r0 = 1
            goto L84
        L83:
            r0 = -1
        L84:
            if (r0 == 0) goto L92
            if (r0 == r5) goto L89
            return r2
        L89:
            java.lang.String r6 = r7.getPath()
            java.lang.String r6 = defpackage.dbsj.e(r6)
            return r6
        L92:
            btou r0 = new btou     // Catch: defpackage.btnx -> Lbb
            java.lang.String[] r1 = defpackage.bdux.b     // Catch: defpackage.btnx -> Lbb
            r0.<init>(r6, r7, r1)     // Catch: defpackage.btnx -> Lbb
            java.lang.String r6 = "_data"
            btor r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Lb1
            dbsg r6 = r0.g(r6)     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = r6.a()     // Catch: java.lang.Throwable -> Lb1
            if (r7 == 0) goto Lad
            r0.close()     // Catch: defpackage.btnx -> Lbb
            goto Lbd
        Lad:
            r0.close()     // Catch: defpackage.btnx -> Lbb
            goto Lbb
        Lb1:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lba
        Lb6:
            r7 = move-exception
            defpackage.deki.a(r6, r7)     // Catch: defpackage.btnx -> Lbb
        Lba:
            throw r6     // Catch: defpackage.btnx -> Lbb
        Lbb:
            dbpy<java.lang.Object> r6 = defpackage.dbpy.a
        Lbd:
            java.lang.Object r6 = r6.f()
            java.lang.String r6 = (java.lang.String) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdux.a(android.content.Context, android.net.Uri):java.lang.String");
    }
}
