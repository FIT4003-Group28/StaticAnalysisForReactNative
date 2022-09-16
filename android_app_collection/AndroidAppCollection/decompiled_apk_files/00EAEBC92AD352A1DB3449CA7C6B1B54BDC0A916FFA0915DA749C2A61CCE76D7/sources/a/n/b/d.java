package a.n.b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
abstract class d<Params, Progress, Result> {

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadFactory f480g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f481h = new LinkedBlockingQueue(10);
    public static final Executor i = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f481h, f480g);
    private static f j;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f484d = g.PENDING;

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f485e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    final AtomicBoolean f486f = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final h<Params, Result> f482b = new b();

    /* renamed from: c  reason: collision with root package name */
    private final FutureTask<Result> f483c = new c(this.f482b);

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f487a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f487a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            d.this.f486f.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) d.this.a((Object[]) this.f497a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                d.this.e(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                d.this.e(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: a.n.b.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0028d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f490a = new int[g.values().length];

        static {
            try {
                f490a[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f490a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        final d f491a;

        /* renamed from: b  reason: collision with root package name */
        final Data[] f492b;

        e(d dVar, Data... dataArr) {
            this.f491a = dVar;
            this.f492b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f491a.a((d) eVar.f492b[0]);
            } else if (i != 2) {
            } else {
                eVar.f491a.b((Object[]) eVar.f492b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        Params[] f497a;

        h() {
        }
    }

    private static Handler d() {
        f fVar;
        synchronized (d.class) {
            if (j == null) {
                j = new f();
            }
            fVar = j;
        }
        return fVar;
    }

    public final d<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        if (this.f484d == g.PENDING) {
            this.f484d = g.RUNNING;
            c();
            this.f482b.f497a = paramsArr;
            executor.execute(this.f483c);
            return this;
        }
        int i2 = C0028d.f490a[this.f484d.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    protected abstract Result a(Params... paramsArr);

    void a(Result result) {
        if (a()) {
            b((d<Params, Progress, Result>) result);
        } else {
            c(result);
        }
        this.f484d = g.FINISHED;
    }

    public final boolean a() {
        return this.f485e.get();
    }

    public final boolean a(boolean z) {
        this.f485e.set(true);
        return this.f483c.cancel(z);
    }

    protected void b() {
    }

    protected void b(Result result) {
        b();
    }

    protected void b(Progress... progressArr) {
    }

    protected void c() {
    }

    protected void c(Result result) {
    }

    Result d(Result result) {
        d().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void e(Result result) {
        if (!this.f486f.get()) {
            d(result);
        }
    }
}
