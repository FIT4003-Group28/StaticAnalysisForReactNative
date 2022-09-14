package a;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: BoltsExecutors.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f4a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f5b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f6c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7d;

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(b.a.a.a.a.b.a.ANDROID_CLIENT_TYPE);
    }

    private b() {
        this.f5b = !c() ? Executors.newCachedThreadPool() : a.a.a();
        this.f6c = Executors.newSingleThreadScheduledExecutor();
        this.f7d = new a();
    }

    public static ExecutorService a() {
        return f4a.f5b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return f4a.f7d;
    }

    /* compiled from: BoltsExecutors.java */
    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f8a;

        private a() {
            this.f8a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f8a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f8a.set(Integer.valueOf(intValue));
            return intValue;
        }

        private int b() {
            Integer num = this.f8a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f8a.remove();
            } else {
                this.f8a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (a() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
                b();
            } catch (Throwable th) {
                b();
                throw th;
            }
        }
    }
}
