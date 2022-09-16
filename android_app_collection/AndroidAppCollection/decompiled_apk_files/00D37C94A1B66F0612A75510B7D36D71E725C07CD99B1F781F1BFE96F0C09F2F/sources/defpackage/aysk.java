package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aysk  reason: default package */
/* loaded from: classes2.dex */
public final class aysk extends AtomicInteger implements ayoa, aypg {
    private static final long serialVersionUID = 9032184911934499404L;
    final ayns a;
    int f;
    int g;
    ayrn h;
    bamf i;
    volatile boolean j;
    volatile boolean k;
    final int b = 2;
    final aysj d = new aysj(this);
    final AtomicBoolean e = new AtomicBoolean();
    final int c = 2;

    public aysk(ayns aynsVar) {
        this.a = aynsVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            ayqi.c(this.d);
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        aynu aynuVar = (aynu) obj;
        if (this.f != 0 || this.h.k(aynuVar)) {
            d();
        } else {
            b(new aypp());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r1 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            int r0 = r4.getAndIncrement()
            if (r0 != 0) goto L5d
        L6:
            boolean r0 = r4.e()
            if (r0 == 0) goto Ld
            return
        Ld:
            boolean r0 = r4.k
            if (r0 != 0) goto L57
            boolean r0 = r4.j
            ayrn r1 = r4.h     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.sl()     // Catch: java.lang.Throwable -> L4f
            aynu r1 = (defpackage.aynu) r1     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r1 != 0) goto L31
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.e
            boolean r0 = r0.compareAndSet(r2, r3)
            if (r0 == 0) goto L2e
            ayns r0 = r4.a
            r0.sm()
        L2e:
            return
        L2f:
            if (r1 == 0) goto L57
        L31:
            r4.k = r3
            aysj r0 = r4.d
            r1.U(r0)
            int r0 = r4.f
            if (r0 == r3) goto L57
            int r0 = r4.g
            int r0 = r0 + r3
            int r1 = r4.c
            if (r0 != r1) goto L4c
            r4.g = r2
            bamf r1 = r4.i
            long r2 = (long) r0
            r1.sp(r2)
            goto L57
        L4c:
            r4.g = r0
            goto L57
        L4f:
            r0 = move-exception
            defpackage.bapv.j(r0)
            r4.g(r0)
            return
        L57:
            int r0 = r4.decrementAndGet()
            if (r0 != 0) goto L6
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aysk.d():void");
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return ayqi.d((aypg) this.d.get());
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.i, bamfVar)) {
            this.i = bamfVar;
            long j = this.b;
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(3);
                if (sk == 1) {
                    this.f = 1;
                    this.h = ayrkVar;
                    this.j = true;
                    this.a.sj(this);
                    d();
                    return;
                } else if (sk == 2) {
                    this.f = 2;
                    this.h = ayrkVar;
                    this.a.sj(this);
                    bamfVar.sp(j);
                    return;
                }
            }
            this.h = new azmk(this.b);
            this.a.sj(this);
            bamfVar.sp(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(Throwable th) {
        if (this.e.compareAndSet(false, true)) {
            this.i.si();
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.i.si();
        ayqi.c(this.d);
    }

    @Override // defpackage.bame
    public final void sm() {
        this.j = true;
        d();
    }
}
