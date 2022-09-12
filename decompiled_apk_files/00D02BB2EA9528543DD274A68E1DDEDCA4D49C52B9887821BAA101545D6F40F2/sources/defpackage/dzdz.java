package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dzdz  reason: default package */
/* loaded from: classes6.dex */
public final class dzdz<T> implements dzbp<T> {
    private final AtomicReference<dzdy<T>> a = new AtomicReference<>();
    private final AtomicReference<dzdy<T>> b = new AtomicReference<>();

    public dzdz() {
        dzdy<T> dzdyVar = new dzdy<>();
        c(dzdyVar);
        b(dzdyVar);
    }

    @Override // defpackage.dzbq
    public final boolean SO() {
        return this.b.get() == a();
    }

    @Override // defpackage.dzbp, defpackage.dzbq
    public final T SP() {
        dzdy<T> b;
        dzdy<T> dzdyVar = this.b.get();
        dzdy<T> b2 = dzdyVar.b();
        if (b2 != null) {
            T a = b2.a();
            c(b2);
            return a;
        } else if (dzdyVar == a()) {
            return null;
        } else {
            do {
                b = dzdyVar.b();
            } while (b == null);
            T a2 = b.a();
            c(b);
            return a2;
        }
    }

    final dzdy<T> a() {
        return this.a.get();
    }

    final dzdy<T> b(dzdy<T> dzdyVar) {
        return this.a.getAndSet(dzdyVar);
    }

    final void c(dzdy<T> dzdyVar) {
        this.b.lazySet(dzdyVar);
    }

    @Override // defpackage.dzbq
    public final void f() {
        while (SP() != null && !SO()) {
        }
    }

    @Override // defpackage.dzbq
    public final void g(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        dzdy<T> dzdyVar = new dzdy<>(t);
        b(dzdyVar).lazySet(dzdyVar);
    }
}
