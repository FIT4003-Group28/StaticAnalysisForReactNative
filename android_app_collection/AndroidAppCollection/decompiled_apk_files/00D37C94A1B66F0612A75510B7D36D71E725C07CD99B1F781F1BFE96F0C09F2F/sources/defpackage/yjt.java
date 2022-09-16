package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: yjt  reason: default package */
/* loaded from: classes4.dex */
public final class yjt {
    private static yjt a;
    private final Semaphore b = new Semaphore(Integer.MAX_VALUE);

    private yjt() {
    }

    public static synchronized yjt a() {
        yjt yjtVar;
        synchronized (yjt.class) {
            if (a == null) {
                a = new yjt();
            }
            yjtVar = a;
        }
        return yjtVar;
    }

    public final void b() {
        this.b.acquire(Integer.MAX_VALUE);
    }

    public final void c() {
        this.b.acquire();
    }

    public final void d() {
        this.b.release(Integer.MAX_VALUE);
    }

    public final void e() {
        this.b.release();
    }

    public final boolean f() {
        return this.b.tryAcquire();
    }
}
