package c.d.d.b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class c extends AbstractExecutorService implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f2802a;

    public c(Handler handler) {
        this.f2802a = handler;
    }

    public boolean a() {
        return Thread.currentThread() == this.f2802a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2802a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected <T> d<T> newTaskFor(Runnable runnable, T t) {
        return new d<>(this.f2802a, runnable, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: newTaskFor */
    public <T> d<T> mo118newTaskFor(Callable<T> callable) {
        return new d<>(this.f2802a, callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* renamed from: newTaskFor  reason: collision with other method in class */
    protected /* bridge */ /* synthetic */ RunnableFuture mo117newTaskFor(Runnable runnable, Object obj) {
        return newTaskFor(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        d newTaskFor = newTaskFor(runnable, (Runnable) null);
        this.f2802a.postDelayed(newTaskFor, timeUnit.toMillis(j));
        return newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        d mo118newTaskFor = mo118newTaskFor((Callable) callable);
        this.f2802a.postDelayed(mo118newTaskFor, timeUnit.toMillis(j));
        return mo118newTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return mo120submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public ScheduledFuture<?> submit(Runnable runnable) {
        return mo120submit(runnable, (Runnable) null);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* renamed from: submit  reason: collision with other method in class */
    public <T> ScheduledFuture<T> mo120submit(Runnable runnable, T t) {
        if (runnable != null) {
            d<T> newTaskFor = newTaskFor(runnable, (Runnable) t);
            execute(newTaskFor);
            return newTaskFor;
        }
        throw new NullPointerException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        if (callable != null) {
            d<T> mo118newTaskFor = mo118newTaskFor((Callable) callable);
            execute(mo118newTaskFor);
            return mo118newTaskFor;
        }
        throw new NullPointerException();
    }
}
