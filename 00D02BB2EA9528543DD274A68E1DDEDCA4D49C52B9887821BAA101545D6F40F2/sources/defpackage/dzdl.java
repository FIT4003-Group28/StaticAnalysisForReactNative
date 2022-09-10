package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdl  reason: default package */
/* loaded from: classes6.dex */
final class dzdl<T, R> implements dyzw<T> {
    final dzgn<T> a;
    final AtomicReference<dzak> b;

    public dzdl(dzgn<T> dzgnVar, AtomicReference<dzak> atomicReference) {
        this.a = dzgnVar;
        this.b = atomicReference;
    }

    @Override // defpackage.dyzw
    public final void b(dzak dzakVar) {
        dzbd.b(this.b, dzakVar);
    }

    @Override // defpackage.dyzw
    public final void c(T t) {
        this.a.c(t);
    }

    @Override // defpackage.dyzw
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.dyzw
    public final void e() {
        this.a.e();
    }
}
