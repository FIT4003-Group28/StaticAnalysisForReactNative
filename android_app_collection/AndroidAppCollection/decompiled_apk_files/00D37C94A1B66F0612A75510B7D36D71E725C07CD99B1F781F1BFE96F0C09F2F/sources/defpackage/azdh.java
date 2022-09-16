package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azdh  reason: default package */
/* loaded from: classes2.dex */
public final class azdh extends AtomicInteger implements ayom, aypg {
    private static final long serialVersionUID = -9140123220065488293L;
    final ayom a;
    final ayqe b;
    aypg f;
    volatile boolean g;
    volatile boolean h;
    Object i;
    volatile int j;
    final int k = 1;
    final azoj c = new azoj();
    final azdg d = new azdg(this);
    final ayrm e = new azml(2);

    public azdh(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.c, th)) {
            if (this.k == 1) {
                ayqi.c(this.d);
            }
            this.g = true;
            f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        this.e.k(obj);
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r7 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r9 = this;
            int r0 = r9.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            ayom r0 = r9.a
            int r1 = r9.k
            ayrm r2 = r9.e
            azoj r3 = r9.c
            r4 = 1
            r5 = 1
        L11:
            boolean r6 = r9.h
            r7 = 0
            if (r6 == 0) goto L1c
            r2.d()
            r9.i = r7
            goto L8a
        L1c:
            int r6 = r9.j
            java.lang.Object r8 = r3.get()
            if (r8 == 0) goto L34
            if (r1 == r4) goto L27
            goto L34
        L27:
            r2.d()
            r9.i = r7
            java.lang.Throwable r1 = defpackage.azom.d(r3)
            r0.b(r1)
            return
        L34:
            if (r6 != 0) goto L7c
            boolean r6 = r9.g
            java.lang.Object r7 = r2.sl()
            if (r6 == 0) goto L4e
            if (r7 != 0) goto L50
            java.lang.Throwable r1 = defpackage.azom.d(r3)
            if (r1 != 0) goto L4a
            r0.sm()
            return
        L4a:
            r0.b(r1)
            return
        L4e:
            if (r7 == 0) goto L8a
        L50:
            ayqe r6 = r9.b     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.a(r7)     // Catch: java.lang.Throwable -> L65
            ayof r6 = (defpackage.ayof) r6     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "The mapper returned a null MaybeSource"
            defpackage.ayrd.b(r6, r7)     // Catch: java.lang.Throwable -> L65
            r9.j = r4
            azdg r7 = r9.d
            r6.X(r7)
            goto L8a
        L65:
            r1 = move-exception
            defpackage.bapv.j(r1)
            aypg r4 = r9.f
            r4.qr()
            r2.d()
            defpackage.azom.e(r3, r1)
            java.lang.Throwable r1 = defpackage.azom.d(r3)
            r0.b(r1)
            return
        L7c:
            r8 = 2
            if (r6 != r8) goto L8a
            java.lang.Object r6 = r9.i
            r9.i = r7
            r0.c(r6)
            r6 = 0
            r9.j = r6
            goto L11
        L8a:
            int r5 = -r5
            int r5 = r9.addAndGet(r5)
            if (r5 != 0) goto L11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azdh.f():void");
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.h = true;
        this.f.qr();
        ayqi.c(this.d);
        if (getAndIncrement() == 0) {
            this.e.d();
            this.i = null;
        }
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.f, aypgVar)) {
            this.f = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.g = true;
        f();
    }
}
