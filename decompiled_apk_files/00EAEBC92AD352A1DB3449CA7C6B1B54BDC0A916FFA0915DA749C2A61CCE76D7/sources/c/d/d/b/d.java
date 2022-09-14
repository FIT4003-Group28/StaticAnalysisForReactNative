package c.d.d.b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class d<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* renamed from: b  reason: collision with root package name */
    private final FutureTask<V> f2803b;

    public d(Handler handler, Runnable runnable, V v) {
        this.f2803b = new FutureTask<>(runnable, v);
    }

    public d(Handler handler, Callable<V> callable) {
        this.f2803b = new FutureTask<>(callable);
    }

    public int a(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f2803b.cancel(z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        a(delayed);
        throw null;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f2803b.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        return this.f2803b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f2803b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f2803b.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f2803b.run();
    }
}
