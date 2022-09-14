package c.e.a.b.g;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class k {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f4613a;

        private a() {
            this.f4613a = new CountDownLatch(1);
        }

        /* synthetic */ a(d0 d0Var) {
            this();
        }

        @Override // c.e.a.b.g.b
        public final void a() {
            this.f4613a.countDown();
        }

        @Override // c.e.a.b.g.d
        public final void a(Exception exc) {
            this.f4613a.countDown();
        }

        @Override // c.e.a.b.g.e
        public final void a(Object obj) {
            this.f4613a.countDown();
        }

        public final boolean a(long j, TimeUnit timeUnit) {
            return this.f4613a.await(j, timeUnit);
        }

        public final void b() {
            this.f4613a.await();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b extends c.e.a.b.g.b, d, e<Object> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4614a = new Object();

        /* renamed from: b  reason: collision with root package name */
        private final int f4615b;

        /* renamed from: c  reason: collision with root package name */
        private final c0<Void> f4616c;

        /* renamed from: d  reason: collision with root package name */
        private int f4617d;

        /* renamed from: e  reason: collision with root package name */
        private int f4618e;

        /* renamed from: f  reason: collision with root package name */
        private int f4619f;

        /* renamed from: g  reason: collision with root package name */
        private Exception f4620g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f4621h;

        public c(int i, c0<Void> c0Var) {
            this.f4615b = i;
            this.f4616c = c0Var;
        }

        private final void b() {
            int i = this.f4617d;
            int i2 = this.f4618e;
            int i3 = i + i2 + this.f4619f;
            int i4 = this.f4615b;
            if (i3 == i4) {
                if (this.f4620g == null) {
                    if (this.f4621h) {
                        this.f4616c.f();
                        return;
                    } else {
                        this.f4616c.a((c0<Void>) null);
                        return;
                    }
                }
                c0<Void> c0Var = this.f4616c;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i2);
                sb.append(" out of ");
                sb.append(i4);
                sb.append(" underlying tasks failed");
                c0Var.a(new ExecutionException(sb.toString(), this.f4620g));
            }
        }

        @Override // c.e.a.b.g.b
        public final void a() {
            synchronized (this.f4614a) {
                this.f4619f++;
                this.f4621h = true;
                b();
            }
        }

        @Override // c.e.a.b.g.d
        public final void a(Exception exc) {
            synchronized (this.f4614a) {
                this.f4618e++;
                this.f4620g = exc;
                b();
            }
        }

        @Override // c.e.a.b.g.e
        public final void a(Object obj) {
            synchronized (this.f4614a) {
                this.f4617d++;
                b();
            }
        }
    }

    public static <TResult> h<TResult> a(Exception exc) {
        c0 c0Var = new c0();
        c0Var.a(exc);
        return c0Var;
    }

    public static <TResult> h<TResult> a(TResult tresult) {
        c0 c0Var = new c0();
        c0Var.a((c0) tresult);
        return c0Var;
    }

    public static h<Void> a(Collection<? extends h<?>> collection) {
        if (collection.isEmpty()) {
            return a((Object) null);
        }
        for (h<?> hVar : collection) {
            if (hVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        c0 c0Var = new c0();
        c cVar = new c(collection.size(), c0Var);
        for (h<?> hVar2 : collection) {
            a(hVar2, cVar);
        }
        return c0Var;
    }

    public static <TResult> h<TResult> a(Callable<TResult> callable) {
        return a(j.f4610a, callable);
    }

    public static <TResult> h<TResult> a(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.s.a(executor, "Executor must not be null");
        com.google.android.gms.common.internal.s.a(callable, "Callback must not be null");
        c0 c0Var = new c0();
        executor.execute(new d0(c0Var, callable));
        return c0Var;
    }

    public static h<Void> a(h<?>... hVarArr) {
        return hVarArr.length == 0 ? a((Object) null) : a((Collection<? extends h<?>>) Arrays.asList(hVarArr));
    }

    public static <TResult> TResult a(h<TResult> hVar) {
        com.google.android.gms.common.internal.s.a();
        com.google.android.gms.common.internal.s.a(hVar, "Task must not be null");
        if (hVar.d()) {
            return (TResult) b(hVar);
        }
        a aVar = new a(null);
        a((h<?>) hVar, (b) aVar);
        aVar.b();
        return (TResult) b(hVar);
    }

    public static <TResult> TResult a(h<TResult> hVar, long j, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.s.a();
        com.google.android.gms.common.internal.s.a(hVar, "Task must not be null");
        com.google.android.gms.common.internal.s.a(timeUnit, "TimeUnit must not be null");
        if (hVar.d()) {
            return (TResult) b(hVar);
        }
        a aVar = new a(null);
        a((h<?>) hVar, (b) aVar);
        if (!aVar.a(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return (TResult) b(hVar);
    }

    private static void a(h<?> hVar, b bVar) {
        hVar.a(j.f4611b, (e<? super Object>) bVar);
        hVar.a(j.f4611b, (d) bVar);
        hVar.a(j.f4611b, (c.e.a.b.g.b) bVar);
    }

    private static <TResult> TResult b(h<TResult> hVar) {
        if (hVar.e()) {
            return hVar.b();
        }
        if (!hVar.c()) {
            throw new ExecutionException(hVar.a());
        }
        throw new CancellationException("Task is already canceled");
    }
}
