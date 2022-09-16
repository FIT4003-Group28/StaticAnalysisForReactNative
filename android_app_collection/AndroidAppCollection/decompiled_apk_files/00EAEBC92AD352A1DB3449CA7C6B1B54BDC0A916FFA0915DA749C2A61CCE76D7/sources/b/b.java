package b;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final b f2174c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f2175a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2176b;

    /* renamed from: b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class ExecutorC0059b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f2177a;

        private ExecutorC0059b() {
            this.f2177a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f2177a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.f2177a;
            if (intValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f2177a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f2177a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private b() {
        this.f2175a = !c() ? Executors.newCachedThreadPool() : b.a.a();
        Executors.newSingleThreadScheduledExecutor();
        this.f2176b = new ExecutorC0059b();
    }

    public static ExecutorService a() {
        return f2174c.f2175a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return f2174c.f2176b;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
