package b;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f2169b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final int f2170c = Runtime.getRuntime().availableProcessors();

    /* renamed from: d  reason: collision with root package name */
    static final int f2171d;

    /* renamed from: e  reason: collision with root package name */
    static final int f2172e;

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2173a = new b();

    /* loaded from: classes.dex */
    private static class b implements Executor {
        private b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int i = f2170c;
        f2171d = i + 1;
        f2172e = (i * 2) + 1;
    }

    private a() {
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f2171d, f2172e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
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
        return f2169b.f2173a;
    }
}
