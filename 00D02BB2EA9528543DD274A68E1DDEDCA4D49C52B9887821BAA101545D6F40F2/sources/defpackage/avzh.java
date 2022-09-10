package defpackage;
/* compiled from: PG */
/* renamed from: avzh  reason: default package */
/* loaded from: classes.dex */
public class avzh {
    @dzsi
    private dltm a = null;
    private boolean b = false;
    private final bvjj c;
    private final bzmm d;

    public avzh(bvjj bvjjVar, bzmm bzmmVar) {
        this.c = bvjjVar;
        this.d = bzmmVar;
    }

    private static void e(@dzsi dltm dltmVar, bvjj bvjjVar) {
        bvjk bvjkVar = bvjk.bz;
        bvjk bvjkVar2 = bvjk.bA;
        bvjjVar.P(bvjkVar);
        bvjjVar.P(bvjkVar2);
        if (dltmVar == null) {
            bvjjVar.P(bvjk.bB);
        } else {
            bvjjVar.al(bvjk.bB, dltmVar);
        }
    }

    @dzsi
    public final synchronized dltm a() {
        if (this.b) {
            return this.a;
        }
        dltm dltmVar = null;
        dltm dltmVar2 = (dltm) this.c.L(bvjk.bB, (dssr) dltm.t.cu(7), null);
        if (dltmVar2 != null) {
            dltmVar = dltmVar2;
        }
        this.a = dltmVar;
        e(dltmVar, this.c);
        this.b = true;
        return this.a;
    }

    public final synchronized void b() {
        this.b = true;
        this.a = null;
        e(null, this.c);
    }

    public final synchronized void c(dspd dspdVar) {
        dltm a = a();
        if (a == null || !a.b.equals(dspdVar)) {
            return;
        }
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r0 == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(defpackage.dltm r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.k     // Catch: java.lang.Throwable -> L67
            dltl r0 = defpackage.dltl.b(r0)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto Lb
            dltl r0 = defpackage.dltl.USER_DEFINED     // Catch: java.lang.Throwable -> L67
        Lb:
            dltl r1 = defpackage.dltl.USER_DEFINED     // Catch: java.lang.Throwable -> L67
            if (r0 == r1) goto L65
            int r0 = r4.d     // Catch: java.lang.Throwable -> L67
            int r0 = defpackage.dltj.a(r0)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L18
            goto L1b
        L18:
            r1 = 1
            if (r0 != r1) goto L63
        L1b:
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L20
            goto L63
        L20:
            bzmm r0 = r3.d     // Catch: java.lang.Throwable -> L67
            dqkc r1 = defpackage.dqkc.OFFLINE_ONBOARDING     // Catch: java.lang.Throwable -> L67
            bzmk r0 = r0.b(r1)     // Catch: java.lang.Throwable -> L67
            bzmk r1 = defpackage.bzmk.VISIBLE     // Catch: java.lang.Throwable -> L67
            r2 = 0
            if (r0 != r1) goto L3a
            bvjj r0 = r3.c     // Catch: java.lang.Throwable -> L67
            bvjk r1 = defpackage.bvjk.ew     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.m(r1, r2)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L38
            goto L3a
        L38:
            monitor-exit(r3)
            return
        L3a:
            bvjj r0 = r3.c     // Catch: java.lang.Throwable -> L67
            bvjk r1 = defpackage.bvjk.bK     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.m(r1, r2)     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L46
            monitor-exit(r3)
            return
        L46:
            dltm r0 = r3.a     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L5a
            int r0 = r0.k     // Catch: java.lang.Throwable -> L67
            dltl r0 = defpackage.dltl.b(r0)     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L54
            dltl r0 = defpackage.dltl.USER_DEFINED     // Catch: java.lang.Throwable -> L67
        L54:
            dltl r1 = defpackage.dltl.EXPLICIT_HOME_WORK     // Catch: java.lang.Throwable -> L67
            if (r0 != r1) goto L5a
            monitor-exit(r3)
            return
        L5a:
            r3.a = r4     // Catch: java.lang.Throwable -> L67
            bvjj r0 = r3.c     // Catch: java.lang.Throwable -> L67
            e(r4, r0)     // Catch: java.lang.Throwable -> L67
            monitor-exit(r3)
            return
        L63:
            monitor-exit(r3)
            return
        L65:
            monitor-exit(r3)
            return
        L67:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avzh.d(dltm):void");
    }
}
