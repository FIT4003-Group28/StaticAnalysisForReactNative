package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpcx  reason: default package */
/* loaded from: classes.dex */
public final class cpcx<TResult> extends cpcq<TResult> {
    public final Object a = new Object();
    public final cpcs<TResult> b = new cpcs<>();
    public boolean c;
    public volatile boolean d;
    public TResult e;
    public Exception f;

    private final void y() {
        String str;
        if (this.c) {
            if (a()) {
                Exception e = e();
                if (e != null) {
                    str = "failure";
                } else if (b()) {
                    String valueOf = String.valueOf(d());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("result ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else {
                    str = this.d ? "cancellation" : "unknown issue";
                }
                String valueOf2 = String.valueOf(str);
                throw new cpbz(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), e);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    private final void z() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            this.b.b(this);
        }
    }

    @Override // defpackage.cpcq
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.cpcq
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.cpcq
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.cpcq
    public final TResult d() {
        TResult tresult;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.f;
            if (exc == null) {
                tresult = this.e;
            } else {
                throw new cpco(exc);
            }
        }
        return tresult;
    }

    @Override // defpackage.cpcq
    public final Exception e() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> cpcq<TContinuationResult> f(cpbu<TResult, TContinuationResult> cpbuVar) {
        return g(cpcw.a, cpbuVar);
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> cpcq<TContinuationResult> g(Executor executor, cpbu<TResult, TContinuationResult> cpbuVar) {
        cpcx cpcxVar = new cpcx();
        this.b.a(new cpbw(executor, cpbuVar, cpcxVar));
        z();
        return cpcxVar;
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> cpcq<TContinuationResult> h(Executor executor, cpbu<TResult, cpcq<TContinuationResult>> cpbuVar) {
        cpcx cpcxVar = new cpcx();
        this.b.a(new cpby(executor, cpbuVar, cpcxVar));
        z();
        return cpcxVar;
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> cpcq<TContinuationResult> i(cpcp<TResult, TContinuationResult> cpcpVar) {
        return j(cpcw.a, cpcpVar);
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> cpcq<TContinuationResult> j(Executor executor, cpcp<TResult, TContinuationResult> cpcpVar) {
        cpcx cpcxVar = new cpcx();
        this.b.a(new cpcn(executor, cpcpVar, cpcxVar));
        z();
        return cpcxVar;
    }

    @Override // defpackage.cpcq
    public final void k(cpcc cpccVar) {
        l(cpcw.a, cpccVar);
    }

    @Override // defpackage.cpcq
    public final void l(Executor executor, cpcc cpccVar) {
        this.b.a(new cpcb(executor, cpccVar));
        z();
    }

    @Override // defpackage.cpcq
    public final void m(cpcf<TResult> cpcfVar) {
        n(cpcw.a, cpcfVar);
    }

    @Override // defpackage.cpcq
    public final void n(Executor executor, cpcf<TResult> cpcfVar) {
        this.b.a(new cpce(executor, cpcfVar));
        z();
    }

    @Override // defpackage.cpcq
    public final void o(Executor executor, cpci cpciVar) {
        this.b.a(new cpch(executor, cpciVar));
        z();
    }

    @Override // defpackage.cpcq
    public final void p(Executor executor, cpcl<? super TResult> cpclVar) {
        this.b.a(new cpck(executor, cpclVar));
        z();
    }

    @Override // defpackage.cpcq
    public final <TContinuationResult> void q(cpbu<TResult, cpcq<TContinuationResult>> cpbuVar) {
        h(cpcw.a, cpbuVar);
    }

    @Override // defpackage.cpcq
    public final void r(cpci cpciVar) {
        o(cpcw.a, cpciVar);
    }

    @Override // defpackage.cpcq
    public final void s(cpcl<? super TResult> cpclVar) {
        p(cpcw.a, cpclVar);
    }

    public final void t(TResult tresult) {
        synchronized (this.a) {
            y();
            this.c = true;
            this.e = tresult;
        }
        this.b.b(this);
    }

    public final void u(Exception exc) {
        cnwc.n(exc, "Exception must not be null");
        synchronized (this.a) {
            y();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void v() {
        cnwc.c(this.c, "Task is not yet complete");
    }

    public final void w() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    public final void x() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
        }
    }
}
