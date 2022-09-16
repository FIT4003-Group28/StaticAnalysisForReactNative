package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdm  reason: default package */
/* loaded from: classes6.dex */
final class dzdm<T, R> extends AtomicReference<dzak> implements dyzw, dzak {
    private static final long serialVersionUID = 854110278590336484L;
    final dyzw<? super R> a;
    dzak b;

    public dzdm(dyzw<? super R> dyzwVar) {
        this.a = dyzwVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        this.b.SQ();
        dzbd.e(this);
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        if (dzbd.c(this.b, dzakVar)) {
            this.b = dzakVar;
            this.a.b(this);
        }
    }

    @Override // defpackage.dyzw
    public final void c(R r) {
        this.a.c(r);
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        dzbd.e(this);
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        dzbd.e(this);
        this.a.e();
    }
}
