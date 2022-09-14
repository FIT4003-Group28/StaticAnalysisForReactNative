package a;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: AndroidExecutors.java */
/* loaded from: classes.dex */
final class a {

    /* renamed from: d  reason: collision with root package name */
    private final Executor f3d = new ExecutorC0000a();

    /* renamed from: c  reason: collision with root package name */
    private static final a f2c = new a();
    private static final int e = Runtime.getRuntime().availableProcessors();

    /* renamed from: a  reason: collision with root package name */
    static final int f0a = e + 1;

    /* renamed from: b  reason: collision with root package name */
    static final int f1b = (e * 2) + 1;

    private a() {
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f0a, f1b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    public static void a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    public static Executor b() {
        return f2c.f3d;
    }

    /* compiled from: AndroidExecutors.java */
    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class ExecutorC0000a implements Executor {
        private ExecutorC0000a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
