package defpackage;
/* compiled from: PG */
/* renamed from: cxjc  reason: default package */
/* loaded from: classes.dex */
public final class cxjc {
    static volatile dbsg<Boolean> a = dbpy.a;
    private static final Object b = new Object();

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(6:33|(2:35|(1:37))|27|28|29|30)(1:20)|21|22|23|24|(1:26)|27|28|29|30) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r3, android.net.Uri r4) {
        /*
            java.lang.String r4 = r4.getAuthority()
            java.lang.String r0 = "com.google.android.gms.phenotype"
            boolean r0 = r0.equals(r4)
            r1 = 0
            if (r0 != 0) goto L32
            java.lang.String r3 = java.lang.String.valueOf(r4)
            int r3 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r3 = r3 + 91
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r3 = " is an unsupported authority. Only "
            r0.append(r3)
            java.lang.String r3 = "com.google.android.gms.phenotype"
            r0.append(r3)
            java.lang.String r3 = " authority is supported."
            r0.append(r3)
            r0.toString()
            return r1
        L32:
            dbsg<java.lang.Boolean> r4 = defpackage.cxjc.a
            boolean r4 = r4.a()
            if (r4 == 0) goto L47
            dbsg<java.lang.Boolean> r3 = defpackage.cxjc.a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L47:
            java.lang.Object r4 = defpackage.cxjc.b
            monitor-enter(r4)
            dbsg<java.lang.Boolean> r0 = defpackage.cxjc.a     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L60
            dbsg<java.lang.Boolean> r3 = defpackage.cxjc.a     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r3 = r3.b()     // Catch: java.lang.Throwable -> Lad
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Lad
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            return r3
        L60:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L6d
            goto L84
        L6d:
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r2 = "com.google.android.gms.phenotype"
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r1)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L95
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 != 0) goto L84
            goto L95
        L84:
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L95 java.lang.Throwable -> Lad
            int r3 = r3.flags     // Catch: java.lang.Throwable -> Lad
            r3 = r3 & 129(0x81, float:1.81E-43)
            if (r3 == 0) goto L95
            r1 = 1
        L95:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Lad
            dbsg r3 = defpackage.dbsg.i(r3)     // Catch: java.lang.Throwable -> Lad
            defpackage.cxjc.a = r3     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            dbsg<java.lang.Boolean> r3 = defpackage.cxjc.a
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        Lad:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lad
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxjc.a(android.content.Context, android.net.Uri):boolean");
    }
}
