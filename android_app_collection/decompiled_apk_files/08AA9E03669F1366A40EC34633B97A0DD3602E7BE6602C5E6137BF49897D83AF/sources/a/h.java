package a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* compiled from: Task.java */
/* loaded from: classes.dex */
public class h<TResult> {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f21d;
    private boolean f;
    private boolean g;
    private TResult h;
    private Exception i;
    private boolean j;
    private j k;

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f18a = b.a();

    /* renamed from: c  reason: collision with root package name */
    private static final Executor f20c = b.b();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f19b = a.a.b();
    private static h<?> m = new h<>((Object) null);
    private static h<Boolean> n = new h<>(true);
    private static h<Boolean> o = new h<>(false);
    private static h<?> p = new h<>(true);
    private final Object e = new Object();
    private List<f<TResult, Void>> l = new ArrayList();

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(h<?> hVar, k kVar);
    }

    public static a a() {
        return f21d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
    }

    private h(TResult tresult) {
        b((h<TResult>) tresult);
    }

    private h(boolean z) {
        if (z) {
            g();
        } else {
            b((h<TResult>) null);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.e) {
            z = this.f;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.e) {
            z = this.g;
        }
        return z;
    }

    public boolean d() {
        boolean z;
        synchronized (this.e) {
            z = f() != null;
        }
        return z;
    }

    public TResult e() {
        TResult tresult;
        synchronized (this.e) {
            tresult = this.h;
        }
        return tresult;
    }

    public Exception f() {
        Exception exc;
        synchronized (this.e) {
            if (this.i != null) {
                this.j = true;
                if (this.k != null) {
                    this.k.a();
                    this.k = null;
                }
            }
            exc = this.i;
        }
        return exc;
    }

    public static <TResult> h<TResult> a(TResult tresult) {
        if (tresult == null) {
            return (h<TResult>) m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (h<TResult>) n : (h<TResult>) o;
        }
        i iVar = new i();
        iVar.b((i) tresult);
        return iVar.a();
    }

    public static <TResult> h<TResult> a(Exception exc) {
        i iVar = new i();
        iVar.b(exc);
        return iVar.a();
    }

    public static <TResult> h<TResult> a(Callable<TResult> callable, Executor executor) {
        return a(callable, executor, (c) null);
    }

    public static <TResult> h<TResult> a(final Callable<TResult> callable, Executor executor, final c cVar) {
        final i iVar = new i();
        try {
            executor.execute(new Runnable() { // from class: a.h.5
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this != null && c.this.a()) {
                        iVar.c();
                        return;
                    }
                    try {
                        iVar.b((i) callable.call());
                    } catch (CancellationException unused) {
                        iVar.c();
                    } catch (Exception e) {
                        iVar.b(e);
                    }
                }
            });
        } catch (Exception e) {
            iVar.b((Exception) new g(e));
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> a(final f<TResult, TContinuationResult> fVar, final Executor executor, final c cVar) {
        boolean b2;
        final i iVar = new i();
        synchronized (this.e) {
            b2 = b();
            if (!b2) {
                this.l.add(new f<TResult, Void>() { // from class: a.h.1
                    @Override // a.f
                    /* renamed from: b */
                    public Void a(h<TResult> hVar) {
                        h.c(iVar, fVar, hVar, executor, cVar);
                        return null;
                    }
                });
            }
        }
        if (b2) {
            c(iVar, fVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> a(f<TResult, TContinuationResult> fVar) {
        return a(fVar, f20c, (c) null);
    }

    public <TContinuationResult> h<TContinuationResult> b(final f<TResult, h<TContinuationResult>> fVar, final Executor executor, final c cVar) {
        boolean b2;
        final i iVar = new i();
        synchronized (this.e) {
            b2 = b();
            if (!b2) {
                this.l.add(new f<TResult, Void>() { // from class: a.h.2
                    @Override // a.f
                    /* renamed from: b */
                    public Void a(h<TResult> hVar) {
                        h.d(iVar, fVar, hVar, executor, cVar);
                        return null;
                    }
                });
            }
        }
        if (b2) {
            d(iVar, fVar, this, executor, cVar);
        }
        return iVar.a();
    }

    public <TContinuationResult> h<TContinuationResult> b(f<TResult, h<TContinuationResult>> fVar) {
        return b(fVar, f20c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void c(final i<TContinuationResult> iVar, final f<TResult, TContinuationResult> fVar, final h<TResult> hVar, Executor executor, final c cVar) {
        try {
            executor.execute(new Runnable() { // from class: a.h.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this != null && c.this.a()) {
                        iVar.c();
                        return;
                    }
                    try {
                        iVar.b((i) fVar.a(hVar));
                    } catch (CancellationException unused) {
                        iVar.c();
                    } catch (Exception e) {
                        iVar.b(e);
                    }
                }
            });
        } catch (Exception e) {
            iVar.b(new g(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(final i<TContinuationResult> iVar, final f<TResult, h<TContinuationResult>> fVar, final h<TResult> hVar, Executor executor, final c cVar) {
        try {
            executor.execute(new Runnable() { // from class: a.h.4
                @Override // java.lang.Runnable
                public void run() {
                    if (c.this != null && c.this.a()) {
                        iVar.c();
                        return;
                    }
                    try {
                        h hVar2 = (h) fVar.a(hVar);
                        if (hVar2 == null) {
                            iVar.b((i) null);
                        } else {
                            hVar2.a((f) new f<TContinuationResult, Void>() { // from class: a.h.4.1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // a.f
                                /* renamed from: b */
                                public Void a(h<TContinuationResult> hVar3) {
                                    if (c.this != null && c.this.a()) {
                                        iVar.c();
                                        return null;
                                    }
                                    if (hVar3.c()) {
                                        iVar.c();
                                    } else if (hVar3.d()) {
                                        iVar.b(hVar3.f());
                                    } else {
                                        iVar.b((i) hVar3.e());
                                    }
                                    return null;
                                }
                            });
                        }
                    } catch (CancellationException unused) {
                        iVar.c();
                    } catch (Exception e) {
                        iVar.b(e);
                    }
                }
            });
        } catch (Exception e) {
            iVar.b(new g(e));
        }
    }

    private void h() {
        synchronized (this.e) {
            for (f<TResult, Void> fVar : this.l) {
                try {
                    fVar.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.l = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        synchronized (this.e) {
            if (this.f) {
                return false;
            }
            this.f = true;
            this.g = true;
            this.e.notifyAll();
            h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(TResult tresult) {
        synchronized (this.e) {
            if (this.f) {
                return false;
            }
            this.f = true;
            this.h = tresult;
            this.e.notifyAll();
            h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(Exception exc) {
        synchronized (this.e) {
            if (this.f) {
                return false;
            }
            this.f = true;
            this.i = exc;
            this.j = false;
            this.e.notifyAll();
            h();
            if (!this.j && a() != null) {
                this.k = new j(this);
            }
            return true;
        }
    }
}
