package c.e.a.b.g;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0<TResult> extends h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4601a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final a0<TResult> f4602b = new a0<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f4603c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f4604d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f4605e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f4606f;

    private final void g() {
        com.google.android.gms.common.internal.s.b(this.f4603c, "Task is not yet complete");
    }

    private final void h() {
        com.google.android.gms.common.internal.s.b(!this.f4603c, "Task is already complete");
    }

    private final void i() {
        if (!this.f4604d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    private final void j() {
        synchronized (this.f4601a) {
            if (!this.f4603c) {
                return;
            }
            this.f4602b.a(this);
        }
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> a(a<TResult, TContinuationResult> aVar) {
        return a(j.f4610a, aVar);
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(c<TResult> cVar) {
        a(j.f4610a, cVar);
        return this;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(d dVar) {
        a(j.f4610a, dVar);
        return this;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(e<? super TResult> eVar) {
        a(j.f4610a, eVar);
        return this;
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> a(g<TResult, TContinuationResult> gVar) {
        return a(j.f4610a, gVar);
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        c0 c0Var = new c0();
        this.f4602b.a(new l(executor, aVar, c0Var));
        j();
        return c0Var;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f4602b.a(new p(executor, bVar));
        j();
        return this;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(Executor executor, c<TResult> cVar) {
        this.f4602b.a(new r(executor, cVar));
        j();
        return this;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(Executor executor, d dVar) {
        this.f4602b.a(new t(executor, dVar));
        j();
        return this;
    }

    @Override // c.e.a.b.g.h
    public final h<TResult> a(Executor executor, e<? super TResult> eVar) {
        this.f4602b.a(new v(executor, eVar));
        j();
        return this;
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> a(Executor executor, g<TResult, TContinuationResult> gVar) {
        c0 c0Var = new c0();
        this.f4602b.a(new x(executor, gVar, c0Var));
        j();
        return c0Var;
    }

    @Override // c.e.a.b.g.h
    public final Exception a() {
        Exception exc;
        synchronized (this.f4601a) {
            exc = this.f4606f;
        }
        return exc;
    }

    @Override // c.e.a.b.g.h
    public final <X extends Throwable> TResult a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f4601a) {
            g();
            i();
            if (cls.isInstance(this.f4606f)) {
                throw cls.cast(this.f4606f);
            }
            if (this.f4606f != null) {
                throw new f(this.f4606f);
            }
            tresult = this.f4605e;
        }
        return tresult;
    }

    public final void a(Exception exc) {
        com.google.android.gms.common.internal.s.a(exc, "Exception must not be null");
        synchronized (this.f4601a) {
            h();
            this.f4603c = true;
            this.f4606f = exc;
        }
        this.f4602b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.f4601a) {
            h();
            this.f4603c = true;
            this.f4605e = tresult;
        }
        this.f4602b.a(this);
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> b(a<TResult, h<TContinuationResult>> aVar) {
        return b(j.f4610a, aVar);
    }

    @Override // c.e.a.b.g.h
    public final <TContinuationResult> h<TContinuationResult> b(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        c0 c0Var = new c0();
        this.f4602b.a(new n(executor, aVar, c0Var));
        j();
        return c0Var;
    }

    @Override // c.e.a.b.g.h
    public final TResult b() {
        TResult tresult;
        synchronized (this.f4601a) {
            g();
            i();
            if (this.f4606f != null) {
                throw new f(this.f4606f);
            }
            tresult = this.f4605e;
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        com.google.android.gms.common.internal.s.a(exc, "Exception must not be null");
        synchronized (this.f4601a) {
            if (this.f4603c) {
                return false;
            }
            this.f4603c = true;
            this.f4606f = exc;
            this.f4602b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.f4601a) {
            if (this.f4603c) {
                return false;
            }
            this.f4603c = true;
            this.f4605e = tresult;
            this.f4602b.a(this);
            return true;
        }
    }

    @Override // c.e.a.b.g.h
    public final boolean c() {
        return this.f4604d;
    }

    @Override // c.e.a.b.g.h
    public final boolean d() {
        boolean z;
        synchronized (this.f4601a) {
            z = this.f4603c;
        }
        return z;
    }

    @Override // c.e.a.b.g.h
    public final boolean e() {
        boolean z;
        synchronized (this.f4601a) {
            z = this.f4603c && !this.f4604d && this.f4606f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.f4601a) {
            if (this.f4603c) {
                return false;
            }
            this.f4603c = true;
            this.f4604d = true;
            this.f4602b.a(this);
            return true;
        }
    }
}
