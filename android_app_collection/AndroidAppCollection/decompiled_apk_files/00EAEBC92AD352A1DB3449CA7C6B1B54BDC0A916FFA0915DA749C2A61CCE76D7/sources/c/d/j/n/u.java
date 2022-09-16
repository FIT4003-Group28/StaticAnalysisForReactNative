package c.d.j.n;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3573a;

    /* renamed from: b  reason: collision with root package name */
    private final d f3574b;

    /* renamed from: e  reason: collision with root package name */
    private final int f3577e;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f3575c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f3576d = new b();

    /* renamed from: f  reason: collision with root package name */
    c.d.j.k.d f3578f = null;

    /* renamed from: g  reason: collision with root package name */
    int f3579g = 0;

    /* renamed from: h  reason: collision with root package name */
    f f3580h = f.IDLE;
    long i = 0;
    long j = 0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.d();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.f();
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3583a = new int[f.values().length];

        static {
            try {
                f3583a[f.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3583a[f.QUEUED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3583a[f.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3583a[f.RUNNING_AND_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(c.d.j.k.d dVar, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f3584a;

        static ScheduledExecutorService a() {
            if (f3584a == null) {
                f3584a = Executors.newSingleThreadScheduledExecutor();
            }
            return f3584a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum f {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public u(Executor executor, d dVar, int i) {
        this.f3573a = executor;
        this.f3574b = dVar;
        this.f3577e = i;
    }

    private void a(long j) {
        if (j > 0) {
            e.a().schedule(this.f3576d, j, TimeUnit.MILLISECONDS);
        } else {
            this.f3576d.run();
        }
    }

    private static boolean b(c.d.j.k.d dVar, int i) {
        return c.d.j.n.b.a(i) || c.d.j.n.b.b(i, 4) || c.d.j.k.d.e(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        c.d.j.k.d dVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            dVar = this.f3578f;
            i = this.f3579g;
            this.f3578f = null;
            this.f3579g = 0;
            this.f3580h = f.RUNNING;
            this.j = uptimeMillis;
        }
        try {
            if (b(dVar, i)) {
                this.f3574b.a(dVar, i);
            }
        } finally {
            c.d.j.k.d.c(dVar);
            e();
        }
    }

    private void e() {
        long j;
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f3580h == f.RUNNING_AND_PENDING) {
                j = Math.max(this.j + this.f3577e, uptimeMillis);
                z = true;
                this.i = uptimeMillis;
                this.f3580h = f.QUEUED;
            } else {
                this.f3580h = f.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            a(j - uptimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f3573a.execute(this.f3575c);
    }

    public void a() {
        c.d.j.k.d dVar;
        synchronized (this) {
            dVar = this.f3578f;
            this.f3578f = null;
            this.f3579g = 0;
        }
        c.d.j.k.d.c(dVar);
    }

    public boolean a(c.d.j.k.d dVar, int i) {
        c.d.j.k.d dVar2;
        if (!b(dVar, i)) {
            return false;
        }
        synchronized (this) {
            dVar2 = this.f3578f;
            this.f3578f = c.d.j.k.d.b(dVar);
            this.f3579g = i;
        }
        c.d.j.k.d.c(dVar2);
        return true;
    }

    public synchronized long b() {
        return this.j - this.i;
    }

    public boolean c() {
        long max;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            boolean z = false;
            if (!b(this.f3578f, this.f3579g)) {
                return false;
            }
            int i = c.f3583a[this.f3580h.ordinal()];
            if (i != 1) {
                if (i != 2 && i == 3) {
                    this.f3580h = f.RUNNING_AND_PENDING;
                }
                max = 0;
            } else {
                max = Math.max(this.j + this.f3577e, uptimeMillis);
                this.i = uptimeMillis;
                this.f3580h = f.QUEUED;
                z = true;
            }
            if (z) {
                a(max - uptimeMillis);
            }
            return true;
        }
    }
}
