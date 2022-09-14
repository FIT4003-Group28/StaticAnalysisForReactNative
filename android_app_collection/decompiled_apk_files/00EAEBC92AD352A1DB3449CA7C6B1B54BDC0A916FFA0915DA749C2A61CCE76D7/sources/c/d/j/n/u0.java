package c.d.j.n;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class u0<T> implements j0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<T> f3590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3591b;

    /* renamed from: c  reason: collision with root package name */
    private int f3592c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<k<T>, k0>> f3593d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f3594e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends n<T, T> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Pair f3596b;

            a(Pair pair) {
                this.f3596b = pair;
            }

            @Override // java.lang.Runnable
            public void run() {
                u0 u0Var = u0.this;
                Pair pair = this.f3596b;
                u0Var.b((k) pair.first, (k0) pair.second);
            }
        }

        private b(k<T> kVar) {
            super(kVar);
        }

        private void d() {
            Pair pair;
            synchronized (u0.this) {
                pair = (Pair) u0.this.f3593d.poll();
                if (pair == null) {
                    u0.b(u0.this);
                }
            }
            if (pair != null) {
                u0.this.f3594e.execute(new a(pair));
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b() {
            c().a();
            d();
        }

        @Override // c.d.j.n.b
        protected void b(T t, int i) {
            c().a(t, i);
            if (c.d.j.n.b.a(i)) {
                d();
            }
        }

        @Override // c.d.j.n.n, c.d.j.n.b
        protected void b(Throwable th) {
            c().a(th);
            d();
        }
    }

    public u0(int i, Executor executor, j0<T> j0Var) {
        this.f3591b = i;
        c.d.d.d.i.a(executor);
        this.f3594e = executor;
        c.d.d.d.i.a(j0Var);
        this.f3590a = j0Var;
        this.f3593d = new ConcurrentLinkedQueue<>();
        this.f3592c = 0;
    }

    static /* synthetic */ int b(u0 u0Var) {
        int i = u0Var.f3592c;
        u0Var.f3592c = i - 1;
        return i;
    }

    @Override // c.d.j.n.j0
    public void a(k<T> kVar, k0 k0Var) {
        boolean z;
        k0Var.e().a(k0Var.a(), "ThrottlingProducer");
        synchronized (this) {
            z = true;
            if (this.f3592c >= this.f3591b) {
                this.f3593d.add(Pair.create(kVar, k0Var));
            } else {
                this.f3592c++;
                z = false;
            }
        }
        if (!z) {
            b(kVar, k0Var);
        }
    }

    void b(k<T> kVar, k0 k0Var) {
        k0Var.e().a(k0Var.a(), "ThrottlingProducer", (Map<String, String>) null);
        this.f3590a.a(new b(kVar), k0Var);
    }
}
