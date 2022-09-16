package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    public static volatile dehq a;
    public static volatile cxkb b;
    private static final dbty<dehq> c = dbud.a(cxlu.a);

    /* JADX WARN: Can't wrap try/catch for region: R(7:9|10|11|(2:13|(2:15|(1:17)(2:19|20)))|21|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        r0 = new defpackage.cxji(r5, com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver.c, defpackage.dbud.a(new defpackage.cxls(r5)));
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(final android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r6 = r6.getStringExtra(r0)
            if (r6 == 0) goto Lb2
            dcha<java.lang.String, cxkz> r0 = defpackage.cxlw.b
            boolean r0 = r0.m(r6)
            if (r0 != 0) goto Lb2
            java.lang.Class<cxlv> r0 = defpackage.cxlv.class
            android.content.Context r1 = r5.getApplicationContext()     // Catch: java.lang.IllegalStateException -> L59
            boolean r2 = r1 instanceof defpackage.dxja     // Catch: java.lang.IllegalStateException -> L59
            if (r2 == 0) goto L30
            dxja r1 = (defpackage.dxja) r1     // Catch: java.lang.IllegalStateException -> L59
            java.lang.Object r1 = r1.a()     // Catch: java.lang.IllegalStateException -> L59
            java.lang.Object r0 = r0.cast(r1)     // Catch: java.lang.ClassCastException -> L27 java.lang.IllegalStateException -> L59
            cxlv r0 = (defpackage.cxlv) r0     // Catch: java.lang.IllegalStateException -> L59
            goto L5a
        L27:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L59
            java.lang.String r2 = "Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?"
            r1.<init>(r2, r0)     // Catch: java.lang.IllegalStateException -> L59
            throw r1     // Catch: java.lang.IllegalStateException -> L59
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L59
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.IllegalStateException -> L59
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.IllegalStateException -> L59
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch: java.lang.IllegalStateException -> L59
            int r2 = r2.length()     // Catch: java.lang.IllegalStateException -> L59
            int r2 = r2 + 72
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L59
            r3.<init>(r2)     // Catch: java.lang.IllegalStateException -> L59
            java.lang.String r2 = "Given application context does not implement GeneratedComponentManager: "
            r3.append(r2)     // Catch: java.lang.IllegalStateException -> L59
            r3.append(r1)     // Catch: java.lang.IllegalStateException -> L59
            java.lang.String r1 = r3.toString()     // Catch: java.lang.IllegalStateException -> L59
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L59
            throw r0     // Catch: java.lang.IllegalStateException -> L59
        L59:
            r0 = 0
        L5a:
            if (r0 == 0) goto L6d
            dbsg r0 = r0.a()
            boolean r1 = r0.a()
            if (r1 == 0) goto L6d
            java.lang.Object r0 = r0.b()
            cxji r0 = (defpackage.cxji) r0
            goto L82
        L6d:
            cxji r0 = defpackage.cxji.b()     // Catch: java.lang.IllegalStateException -> L72
            goto L82
        L72:
            cxji r0 = new cxji
            dbty<dehq> r1 = com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver.c
            cxls r2 = new cxls
            r2.<init>(r5)
            dbty r2 = defpackage.dbud.a(r2)
            r0.<init>(r5, r1, r2)
        L82:
            if (r0 != 0) goto L85
            return
        L85:
            android.content.BroadcastReceiver$PendingResult r1 = r4.goAsync()
            dehq r2 = r0.c()
            cxll r3 = new cxll
            r3.<init>(r5)
            dehn r5 = r2.c(r3)
            cxlm r2 = new cxlm
            r2.<init>(r6, r0)
            dehq r6 = r0.c()
            dehn r5 = defpackage.deew.g(r5, r2, r6)
            r1.getClass()
            cxln r6 = new cxln
            r6.<init>(r1)
            dehq r0 = r0.c()
            r5.Pk(r6, r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
