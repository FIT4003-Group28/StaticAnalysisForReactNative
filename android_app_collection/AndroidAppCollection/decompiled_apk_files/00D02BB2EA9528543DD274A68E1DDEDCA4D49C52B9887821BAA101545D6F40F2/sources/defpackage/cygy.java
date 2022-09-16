package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: cygy  reason: default package */
/* loaded from: classes5.dex */
public abstract class cygy<T> implements cycl<T> {
    final AtomicInteger a = new AtomicInteger(1);
    final AtomicReference<T> b = new AtomicReference<>();
    final AtomicReference<dehn<T>> c = new AtomicReference<>();
    public final degu<T> d;

    public cygy(degu<T> deguVar) {
        this.d = deguVar;
    }

    private final synchronized dehn<T> h() {
        dehn<T> f;
        int i = this.a.get();
        f = f();
        deha.q(f, new cygw(this, i), dege.a);
        this.c.set(f);
        return f;
    }

    @Override // defpackage.cycl
    public final synchronized void a() {
        if (this.b.get() == null && this.c.get() == null) {
            h();
        }
    }

    @Override // defpackage.cycl
    public final synchronized dehn<T> b() {
        T t = this.b.get();
        dehn<T> dehnVar = this.c.get();
        if (t != null) {
            dehnVar = deha.a(t);
        } else if (dehnVar == null) {
            dehnVar = null;
        }
        if (dehnVar == null) {
            return h();
        }
        return dehnVar;
    }

    @Override // defpackage.cycl
    public final dbsg<T> c() {
        return dbsg.j(this.b.get());
    }

    @Override // defpackage.cycl
    public final synchronized void d(T t) {
        g(t, this.a.get());
    }

    @Override // defpackage.cycl
    public final synchronized void e() {
        g(null, this.a.get());
    }

    public abstract dehn<T> f();

    public final synchronized void g(T t, int i) {
        if (this.a.compareAndSet(i, i + 1)) {
            this.b.set(t);
            this.c.set(null);
        }
    }
}
