package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aytd  reason: default package */
/* loaded from: classes2.dex */
public final class aytd extends AtomicInteger implements ayoa, aypg {
    private static final long serialVersionUID = -2108443387387077490L;
    final ayns a;
    bamf f;
    final int b = Integer.MAX_VALUE;
    final boolean c = true;
    final aypf e = new aypf();
    final azoj d = new azoj();

    public aytd(ayns aynsVar) {
        this.a = aynsVar;
        lazySet(1);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (!this.c) {
            this.e.qr();
            if (azom.e(this.d, th)) {
                if (getAndSet(0) <= 0) {
                    return;
                }
                this.a.b(azom.d(this.d));
                return;
            }
            azqc.d(th);
        } else if (azom.e(this.d, th)) {
            if (decrementAndGet() != 0) {
                return;
            }
            this.a.b(azom.d(this.d));
        } else {
            azqc.d(th);
        }
    }

    @Override // defpackage.bame
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        getAndIncrement();
        aytc aytcVar = new aytc(this);
        this.e.d(aytcVar);
        ((aynu) obj).U(aytcVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.e.b;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            this.a.sj(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                bamfVar.sp(Long.MAX_VALUE);
            } else {
                bamfVar.sp(i);
            }
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.f.si();
        this.e.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (decrementAndGet() == 0) {
            if (((Throwable) this.d.get()) != null) {
                this.a.b(azom.d(this.d));
            } else {
                this.a.sm();
            }
        }
    }
}
