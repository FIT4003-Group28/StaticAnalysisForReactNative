package defpackage;
/* compiled from: PG */
/* renamed from: cdgk  reason: default package */
/* loaded from: classes4.dex */
final class cdgk implements Runnable {
    final /* synthetic */ deig a;
    final /* synthetic */ btlu b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cdgl d;

    public cdgk(cdgl cdglVar, deig deigVar, btlu btluVar, boolean z) {
        this.d = cdglVar;
        this.a = deigVar;
        this.b = btluVar;
        this.c = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        if (((java.lang.Boolean) defpackage.deix.b(r1.c.e(r2))).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r15 = this;
            deig r0 = r15.a
            cdgl r1 = r15.d
            btlu r2 = r15.b
            boolean r3 = r15.c
            java.lang.Class<ckdv> r4 = defpackage.ckdv.class
            java.util.EnumSet r4 = java.util.EnumSet.noneOf(r4)
            bttf r5 = r1.e
            boolean r5 = r5.b()
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L1f
            ckdv r5 = defpackage.ckdv.TERMS_NOT_ACCEPTED
            r4.add(r5)
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            btlt r8 = defpackage.btlt.UNKNOWN
            btlt r8 = r2.f
            int r8 = r8.ordinal()
            r9 = 2
            if (r8 == r6) goto L3f
            if (r8 == r9) goto L39
            r10 = 3
            if (r8 == r10) goto L33
            btlt r8 = r2.f
            goto L3f
        L33:
            ckdv r5 = defpackage.ckdv.NOT_SIGNED_IN
            r4.add(r5)
            goto L3e
        L39:
            ckdv r5 = defpackage.ckdv.IN_INCOGNITO_MODE
            r4.add(r5)
        L3e:
            r5 = 0
        L3f:
            cqat r8 = r1.f
            long r10 = r8.b()
            bvjj r8 = r1.d
            bvjk r12 = defpackage.bvjk.go
            r13 = 0
            long r12 = r8.w(r12, r13)
            long r10 = r10 - r12
            long r12 = r1.b()
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 <= 0) goto L61
            r1.b()
            ckdv r5 = defpackage.ckdv.APP_NOT_RECENTLY_USED
            r4.add(r5)
            r5 = 0
        L61:
            dvls r8 = r1.a()     // Catch: java.util.concurrent.ExecutionException -> L7b
            boolean r8 = r8.k     // Catch: java.util.concurrent.ExecutionException -> L7b
            if (r8 == 0) goto L81
            cjnx r8 = r1.c     // Catch: java.util.concurrent.ExecutionException -> L7b
            dehn r2 = r8.e(r2)     // Catch: java.util.concurrent.ExecutionException -> L7b
            java.lang.Object r2 = defpackage.deix.b(r2)     // Catch: java.util.concurrent.ExecutionException -> L7b
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.util.concurrent.ExecutionException -> L7b
            boolean r2 = r2.booleanValue()     // Catch: java.util.concurrent.ExecutionException -> L7b
            if (r2 != 0) goto L81
        L7b:
            ckdv r2 = defpackage.ckdv.USER_LOCATION_REPORTING_DISABLED
            r4.add(r2)
            r5 = 0
        L81:
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r2 < r8) goto L92
            r1.d(r7)
            android.app.Application r2 = r1.a
            dxio<apni> r7 = r1.g
            com.google.android.apps.gmm.ugc.phototaken.PhotoTakenObserverService.b(r2, r5, r7)
            goto L95
        L92:
            r1.d(r5)
        L95:
            if (r3 == 0) goto Lca
            ckcw r2 = r1.b
            ckgz r3 = defpackage.ckdz.e
            java.lang.Object r2 = r2.a(r3)
            ckco r2 = (defpackage.ckco) r2
            if (r5 == 0) goto La4
            goto La5
        La4:
            r6 = 2
        La5:
            int r6 = r6 + (-1)
            r2.a(r6)
            ckcw r1 = r1.b
            ckgz r2 = defpackage.ckdz.f
            java.lang.Object r1 = r1.a(r2)
            ckco r1 = (defpackage.ckco) r1
            java.util.Iterator r2 = r4.iterator()
        Lb8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r2.next()
            ckdv r3 = (defpackage.ckdv) r3
            int r3 = r3.o
            r1.a(r3)
            goto Lb8
        Lca:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0.j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdgk.run():void");
    }
}
