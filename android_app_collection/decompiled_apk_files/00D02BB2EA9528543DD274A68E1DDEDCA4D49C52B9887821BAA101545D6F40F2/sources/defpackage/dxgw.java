package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dxgw  reason: default package */
/* loaded from: classes6.dex */
public abstract class dxgw<T> implements dxgv<T> {
    protected volatile boolean a;
    protected volatile dxhb<T> b;
    protected volatile dxgu c;
    private final CountDownLatch d = new CountDownLatch(1);

    protected abstract void b();

    @Override // defpackage.dxgv
    public final dxhb<T> d(long j, TimeUnit timeUnit) {
        try {
            if (!this.d.await(j, timeUnit)) {
                this.b = dxhe.a(new Exception("Result was not delivered on time."));
            }
        } catch (InterruptedException e) {
            this.b = dxhe.a(e);
        }
        return this.b;
    }

    public final boolean e() {
        return false;
    }

    public final void f(dxhb<T> dxhbVar) {
        dxgm.a(dxhbVar);
        this.b = dxhbVar;
        this.d.countDown();
        b();
    }

    public final void g(Throwable th) {
        this.b = dxhe.a(th);
        this.d.countDown();
        e();
        if (this.c != null) {
            this.c.a(this.b.c());
        }
    }

    public final void h(dxgu dxguVar) {
        this.c = dxguVar;
        e();
        if (this.c == null || this.b == null || this.b.c() == null) {
            return;
        }
        this.c.a(this.b.c());
    }
}
