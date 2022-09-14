package c.d.d.b;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class e<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicInteger f2804b = new AtomicInteger(0);

    public void a() {
        if (this.f2804b.compareAndSet(0, 2)) {
            c();
        }
    }

    protected abstract void a(Exception exc);

    protected abstract void a(T t);

    /* renamed from: b */
    protected abstract T mo147b();

    protected abstract void b(T t);

    protected abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f2804b.compareAndSet(0, 1)) {
            return;
        }
        try {
            T mo147b = mo147b();
            this.f2804b.set(3);
            try {
                b(mo147b);
            } finally {
                a((e<T>) mo147b);
            }
        } catch (Exception e2) {
            this.f2804b.set(4);
            a(e2);
        }
    }
}
