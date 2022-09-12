package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cryz  reason: default package */
/* loaded from: classes.dex */
public final class cryz<T> implements degu<T> {
    final AtomicReference<degu<T>> a;

    public cryz(degu<T> deguVar) {
        AtomicReference<degu<T>> atomicReference = new AtomicReference<>();
        this.a = atomicReference;
        atomicReference.set(deguVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        degu<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            andSet.a(th);
        }
    }

    @Override // defpackage.degu
    public final void b(T t) {
        degu<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            andSet.b(t);
        }
    }

    public final void c() {
        this.a.set(null);
    }

    public final boolean d() {
        return this.a.get() == null;
    }
}
