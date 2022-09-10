package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdw  reason: default package */
/* loaded from: classes6.dex */
final class dzdw<T> extends AtomicReference<dzak> implements Runnable, dzab, dzak {
    private static final long serialVersionUID = 7000911171163930287L;
    final dzab<? super T> a;
    final dzbg b = new dzbg();
    final dzac<? extends T> c;

    public dzdw(dzab<? super T> dzabVar, dzac<? extends T> dzacVar) {
        this.a = dzabVar;
        this.c = dzacVar;
    }

    @Override // defpackage.dzak
    public final void SQ() {
        dzbd.e(this);
        dzbd.e(this.b);
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        dzbd.b(this, dzakVar);
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        this.a.b(th);
    }

    @Override // defpackage.dzab
    public final void c(T t) {
        this.a.c(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.f(this);
    }
}
