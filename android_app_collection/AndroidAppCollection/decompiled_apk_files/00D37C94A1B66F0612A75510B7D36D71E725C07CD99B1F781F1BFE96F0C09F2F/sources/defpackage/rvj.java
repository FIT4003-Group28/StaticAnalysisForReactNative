package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rvj  reason: default package */
/* loaded from: classes4.dex */
public final class rvj extends rve {
    public final Object a = new Object();
    public final rvg b = new rvg();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    private final void v() {
        qnm.k(this.c, "Task is not yet complete");
    }

    private final void w() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    private final void x() {
        String str;
        if (this.c) {
            if (j()) {
                Exception f = f();
                if (f != null) {
                    str = "failure";
                } else if (k()) {
                    String valueOf = String.valueOf(g());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("result ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else {
                    str = this.d ? "cancellation" : "unknown issue";
                }
                String valueOf2 = String.valueOf(str);
                throw new run(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), f);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            this.b.b(this);
        }
    }

    @Override // defpackage.rve
    public final rve a(rui ruiVar) {
        return b(rvi.a, ruiVar);
    }

    @Override // defpackage.rve
    public final rve b(Executor executor, rui ruiVar) {
        rvj rvjVar = new rvj();
        this.b.a(new ruk(executor, ruiVar, rvjVar));
        y();
        return rvjVar;
    }

    @Override // defpackage.rve
    public final rve c(Executor executor, rui ruiVar) {
        rvj rvjVar = new rvj();
        this.b.a(new rum(executor, ruiVar, rvjVar));
        y();
        return rvjVar;
    }

    @Override // defpackage.rve
    public final rve d(rvd rvdVar) {
        return e(rvi.a, rvdVar);
    }

    @Override // defpackage.rve
    public final rve e(Executor executor, rvd rvdVar) {
        rvj rvjVar = new rvj();
        this.b.a(new rvb(executor, rvdVar, rvjVar));
        y();
        return rvjVar;
    }

    @Override // defpackage.rve
    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.rve
    public final Object g() {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.f;
            if (exc == null) {
                obj = this.e;
            } else {
                throw new rvc(exc);
            }
        }
        return obj;
    }

    @Override // defpackage.rve
    public final Object h(Class cls) {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            if (!cls.isInstance(this.f)) {
                Exception exc = this.f;
                if (exc == null) {
                    obj = this.e;
                } else {
                    throw new rvc(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f));
            }
        }
        return obj;
    }

    @Override // defpackage.rve
    public final boolean i() {
        return this.d;
    }

    @Override // defpackage.rve
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.rve
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rve
    public final void l(Executor executor, ruq ruqVar) {
        this.b.a(new rup(executor, ruqVar));
        y();
    }

    @Override // defpackage.rve
    public final void m(Executor executor, rut rutVar) {
        this.b.a(new rus(executor, rutVar));
        y();
    }

    @Override // defpackage.rve
    public final void n(ruw ruwVar) {
        o(rvi.a, ruwVar);
    }

    @Override // defpackage.rve
    public final void o(Executor executor, ruw ruwVar) {
        this.b.a(new ruv(executor, ruwVar));
        y();
    }

    @Override // defpackage.rve
    public final void p(Executor executor, ruz ruzVar) {
        this.b.a(new ruy(executor, ruzVar));
        y();
    }

    @Override // defpackage.rve
    public final void q(rut rutVar) {
        m(rvi.a, rutVar);
    }

    @Override // defpackage.rve
    public final void r(ruz ruzVar) {
        p(rvi.a, ruzVar);
    }

    public final void s(Exception exc) {
        qnm.n(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void t(Object obj) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final void u() {
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
