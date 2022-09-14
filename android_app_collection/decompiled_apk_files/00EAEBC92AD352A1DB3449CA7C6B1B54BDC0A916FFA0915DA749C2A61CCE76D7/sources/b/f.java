package b;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class f<TResult> {
    private static final Executor i;
    private static volatile d j;
    private static f<?> k;
    private static f<Boolean> l;
    private static f<Boolean> m;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2179b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2180c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f2181d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f2182e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2183f;

    /* renamed from: g  reason: collision with root package name */
    private h f2184g;

    /* renamed from: a  reason: collision with root package name */
    private final Object f2178a = new Object();

    /* renamed from: h  reason: collision with root package name */
    private List<b.d<TResult, Void>> f2185h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b.d<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f2186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.d f2187b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f2188c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.c f2189d;

        a(f fVar, g gVar, b.d dVar, Executor executor, b.c cVar) {
            this.f2186a = gVar;
            this.f2187b = dVar;
            this.f2188c = executor;
            this.f2189d = cVar;
        }

        @Override // b.d
        public Void a(f<TResult> fVar) {
            f.b(this.f2186a, this.f2187b, fVar, this.f2188c, this.f2189d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.c f2190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f2191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b.d f2192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f2193e;

        b(b.c cVar, g gVar, b.d dVar, f fVar) {
            this.f2190b = cVar;
            this.f2191c = gVar;
            this.f2192d = dVar;
            this.f2193e = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            b.c cVar = this.f2190b;
            if (cVar != null) {
                cVar.a();
                throw null;
            }
            try {
                this.f2191c.a((g) this.f2192d.a(this.f2193e));
            } catch (CancellationException unused) {
                this.f2191c.b();
            } catch (Exception e2) {
                this.f2191c.a(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.c f2194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f2195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callable f2196d;

        c(b.c cVar, g gVar, Callable callable) {
            this.f2194b = cVar;
            this.f2195c = gVar;
            this.f2196d = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            b.c cVar = this.f2194b;
            if (cVar != null) {
                cVar.a();
                throw null;
            }
            try {
                this.f2195c.a((g) this.f2196d.call());
            } catch (CancellationException unused) {
                this.f2195c.b();
            } catch (Exception e2) {
                this.f2195c.a(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(f<?> fVar, i iVar);
    }

    static {
        b.b.a();
        i = b.b.b();
        b.a.b();
        k = new f<>((Object) null);
        l = new f<>(true);
        m = new f<>(false);
        new f(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
    }

    private f(TResult tresult) {
        a((f<TResult>) tresult);
    }

    private f(boolean z) {
        if (z) {
            f();
        } else {
            a((f<TResult>) null);
        }
    }

    public static <TResult> f<TResult> a(Callable<TResult> callable, Executor executor) {
        return a(callable, executor, (b.c) null);
    }

    public static <TResult> f<TResult> a(Callable<TResult> callable, Executor executor, b.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e2) {
            gVar.a((Exception) new e(e2));
        }
        return gVar.a();
    }

    public static <TResult> f<TResult> b(Exception exc) {
        g gVar = new g();
        gVar.a(exc);
        return gVar.a();
    }

    public static <TResult> f<TResult> b(TResult tresult) {
        if (tresult == null) {
            return (f<TResult>) k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (f<TResult>) l : (f<TResult>) m;
        }
        g gVar = new g();
        gVar.a((g) tresult);
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void b(g<TContinuationResult> gVar, b.d<TResult, TContinuationResult> dVar, f<TResult> fVar, Executor executor, b.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e2) {
            gVar.a(new e(e2));
        }
    }

    public static d g() {
        return j;
    }

    private void h() {
        synchronized (this.f2178a) {
            for (b.d<TResult, Void> dVar : this.f2185h) {
                try {
                    dVar.a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f2185h = null;
        }
    }

    public <TContinuationResult> f<TContinuationResult> a(b.d<TResult, TContinuationResult> dVar) {
        return a(dVar, i, (b.c) null);
    }

    public <TContinuationResult> f<TContinuationResult> a(b.d<TResult, TContinuationResult> dVar, Executor executor, b.c cVar) {
        boolean d2;
        g gVar = new g();
        synchronized (this.f2178a) {
            d2 = d();
            if (!d2) {
                this.f2185h.add(new a(this, gVar, dVar, executor, cVar));
            }
        }
        if (d2) {
            b(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception a() {
        Exception exc;
        synchronized (this.f2178a) {
            if (this.f2182e != null) {
                this.f2183f = true;
                if (this.f2184g != null) {
                    this.f2184g.a();
                    this.f2184g = null;
                }
            }
            exc = this.f2182e;
        }
        return exc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Exception exc) {
        synchronized (this.f2178a) {
            if (this.f2179b) {
                return false;
            }
            this.f2179b = true;
            this.f2182e = exc;
            this.f2183f = false;
            this.f2178a.notifyAll();
            h();
            if (!this.f2183f && g() != null) {
                this.f2184g = new h(this);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(TResult tresult) {
        synchronized (this.f2178a) {
            if (this.f2179b) {
                return false;
            }
            this.f2179b = true;
            this.f2181d = tresult;
            this.f2178a.notifyAll();
            h();
            return true;
        }
    }

    public TResult b() {
        TResult tresult;
        synchronized (this.f2178a) {
            tresult = this.f2181d;
        }
        return tresult;
    }

    public boolean c() {
        boolean z;
        synchronized (this.f2178a) {
            z = this.f2180c;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.f2178a) {
            z = this.f2179b;
        }
        return z;
    }

    public boolean e() {
        boolean z;
        synchronized (this.f2178a) {
            z = a() != null;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        synchronized (this.f2178a) {
            if (this.f2179b) {
                return false;
            }
            this.f2179b = true;
            this.f2180c = true;
            this.f2178a.notifyAll();
            h();
            return true;
        }
    }
}
