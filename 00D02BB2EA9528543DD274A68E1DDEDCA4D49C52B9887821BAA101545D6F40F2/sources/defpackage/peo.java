package defpackage;
/* compiled from: PG */
/* renamed from: peo  reason: default package */
/* loaded from: classes.dex */
final class peo implements Runnable {
    final /* synthetic */ peq a;

    public peo(peq peqVar) {
        this.a = peqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (defpackage.btsj.a(r0.a, r3) != false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            peq r0 = r6.a
            axru r1 = r0.b
            java.lang.String r2 = "android.permission.BROADCAST_STICKY"
            boolean r1 = r1.a(r2)
            java.lang.String r3 = "com.google.android.carassistant"
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            r5 = 0
            if (r1 == 0) goto L24
            android.app.Application r1 = r0.a
            boolean r1 = defpackage.btsj.a(r1, r4)
            if (r1 == 0) goto L1b
            r3 = r4
            goto L25
        L1b:
            android.app.Application r0 = r0.a
            boolean r0 = defpackage.btsj.a(r0, r3)
            if (r0 == 0) goto L24
            goto L25
        L24:
            r3 = r5
        L25:
            if (r3 == 0) goto L40
            peq r0 = r6.a
            pep r0 = r0.c
            android.content.Intent r0 = r0.i(r3)
            peq r1 = r6.a     // Catch: java.lang.Throwable -> L37
            android.app.Application r1 = r1.a     // Catch: java.lang.Throwable -> L37
            r1.sendStickyBroadcast(r0)     // Catch: java.lang.Throwable -> L37
            goto L40
        L37:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            defpackage.bvoo.f(r1)
        L40:
            peq r0 = r6.a
            android.app.Application r1 = r0.a
            java.lang.String r3 = "com.google.android.gms"
            boolean r1 = defpackage.btsj.a(r1, r3)
            if (r1 == 0) goto L6d
            axru r0 = r0.b
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L6d
            peq r0 = r6.a
            pep r0 = r0.c
            android.content.Intent r0 = r0.i(r3)
            peq r1 = r6.a     // Catch: java.lang.Throwable -> L64
            android.app.Application r1 = r1.a     // Catch: java.lang.Throwable -> L64
            r1.sendStickyBroadcast(r0)     // Catch: java.lang.Throwable -> L64
            return
        L64:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            defpackage.bvoo.f(r1)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.peo.run():void");
    }
}
