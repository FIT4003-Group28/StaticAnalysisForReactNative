package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayzk  reason: default package */
/* loaded from: classes2.dex */
final class ayzk extends AtomicReference implements Runnable, ayoa, bamf {
    private static final long serialVersionUID = 8094547886072529208L;
    final bame a;
    final ayoq b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final boolean e;
    bamd f;

    public ayzk(bame bameVar, ayoq ayoqVar, bamd bamdVar, boolean z) {
        this.a = bameVar;
        this.b = ayoqVar;
        this.f = bamdVar;
        this.e = !z;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.a.b(th);
        this.b.qr();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.a.c(obj);
    }

    final void d(long j, bamf bamfVar) {
        if (this.e || Thread.currentThread() == get()) {
            bamfVar.sp(j);
        } else {
            this.b.a(new ayzj(bamfVar, j));
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.g(this.c, bamfVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            d(andSet, bamfVar);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        bamd bamdVar = this.f;
        this.f = null;
        bamdVar.ad(this);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this.c);
        this.b.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.a.sm();
        this.b.qr();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            bamf bamfVar = (bamf) this.c.get();
            if (bamfVar != null) {
                d(j, bamfVar);
                return;
            }
            ayno.a(this.d, j);
            bamf bamfVar2 = (bamf) this.c.get();
            if (bamfVar2 == null) {
                return;
            }
            long andSet = this.d.getAndSet(0L);
            if (andSet == 0) {
                return;
            }
            d(andSet, bamfVar2);
        }
    }
}
