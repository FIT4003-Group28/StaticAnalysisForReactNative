package c.d.j.n;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3570a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f3571b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f3572c;

    public t0(Executor executor) {
        c.d.d.d.i.a(executor);
        this.f3572c = executor;
        this.f3571b = new ArrayDeque();
    }

    public synchronized void a(Runnable runnable) {
        if (this.f3570a) {
            this.f3571b.add(runnable);
        } else {
            this.f3572c.execute(runnable);
        }
    }

    public synchronized void b(Runnable runnable) {
        this.f3571b.remove(runnable);
    }
}
