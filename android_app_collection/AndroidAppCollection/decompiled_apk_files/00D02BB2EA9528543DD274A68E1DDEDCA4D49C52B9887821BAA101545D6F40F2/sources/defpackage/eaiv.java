package defpackage;
/* compiled from: PG */
/* renamed from: eaiv  reason: default package */
/* loaded from: classes6.dex */
final class eaiv extends Thread {
    public eaiv() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r1.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
        L0:
            java.lang.Class<eaiw> r0 = defpackage.eaiw.class
            monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
            eaiw r1 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L63
            eaiw r1 = r1.e     // Catch: java.lang.Throwable -> L63
            r2 = 0
            if (r1 != 0) goto L29
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L63
            java.lang.Class<eaiw> r1 = defpackage.eaiw.class
            long r5 = defpackage.eaiw.b     // Catch: java.lang.Throwable -> L63
            r1.wait(r5)     // Catch: java.lang.Throwable -> L63
            eaiw r1 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L63
            eaiw r1 = r1.e     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L48
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L63
            long r5 = r5 - r3
            long r3 = defpackage.eaiw.c     // Catch: java.lang.Throwable -> L63
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 < 0) goto L48
            eaiw r1 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L63
            goto L52
        L29:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L63
            long r3 = r1.f(r3)     // Catch: java.lang.Throwable -> L63
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L4a
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3 / r5
            java.lang.Long.signum(r7)
            long r5 = r5 * r7
            long r3 = r3 - r5
            java.lang.Class<eaiw> r1 = defpackage.eaiw.class
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L63
            r1.wait(r7, r4)     // Catch: java.lang.Throwable -> L63
        L48:
            r1 = r2
            goto L52
        L4a:
            eaiw r3 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L63
            eaiw r4 = r1.e     // Catch: java.lang.Throwable -> L63
            r3.e = r4     // Catch: java.lang.Throwable -> L63
            r1.e = r2     // Catch: java.lang.Throwable -> L63
        L52:
            if (r1 != 0) goto L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            goto L0
        L56:
            eaiw r3 = defpackage.eaiw.d     // Catch: java.lang.Throwable -> L63
            if (r1 != r3) goto L5e
            defpackage.eaiw.d = r2     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            return
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            r1.a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L63:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            goto L67
        L66:
            throw r1
        L67:
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaiv.run():void");
    }
}
