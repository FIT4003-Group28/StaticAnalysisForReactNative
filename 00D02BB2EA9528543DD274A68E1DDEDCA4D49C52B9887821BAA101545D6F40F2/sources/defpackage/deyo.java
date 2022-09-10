package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: deyo  reason: default package */
/* loaded from: classes6.dex */
final class deyo implements dyls {
    private final deyb a;
    private final deys b;

    public deyo(deyb deybVar, deys deysVar) {
        this.a = deybVar;
        this.b = deysVar;
    }

    @Override // defpackage.dyls
    public final void a(dylu dyluVar) {
        synchronized (this.a) {
            this.a.f(this.b, dyluVar);
        }
        if (this.b.f()) {
            dyluVar.f();
            try {
                synchronized (this.b) {
                    this.b.g();
                }
            } catch (dyjc e) {
                synchronized (this.a) {
                    this.a.l(e.a);
                }
            }
        }
    }

    @Override // defpackage.dyvj
    public final void b(int i) {
        synchronized (this.a) {
            this.a.m(i);
        }
    }

    @Override // defpackage.dyvj
    public final void c(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.c(inputStream);
                this.b.g();
            }
        } catch (dyjc e) {
            synchronized (this.a) {
                this.a.l(e.a);
            }
        }
    }

    @Override // defpackage.dyls
    public final void d() {
        try {
            synchronized (this.b) {
                deys deysVar = this.b;
                deysVar.d();
                deysVar.g();
            }
        } catch (dyjc e) {
            synchronized (this.a) {
                this.a.l(e.a);
            }
        }
    }

    @Override // defpackage.dyls
    public final void e(dyjb dyjbVar) {
        synchronized (this.a) {
            this.a.k(dyjbVar);
        }
    }

    @Override // defpackage.dyls
    public final dyel f() {
        throw null;
    }

    @Override // defpackage.dyvj
    public final void g() {
    }

    @Override // defpackage.dyvj
    public final void h(dyfi dyfiVar) {
    }

    @Override // defpackage.dyls
    public final void i(dyfr dyfrVar) {
    }

    @Override // defpackage.dyls
    public final void j(int i) {
    }

    @Override // defpackage.dyls
    public final void k(int i) {
    }

    @Override // defpackage.dyls
    public final void l(dypf dypfVar) {
    }

    @Override // defpackage.dyls
    public final void m(dyfu dyfuVar) {
    }

    @Override // defpackage.dyvj
    public final void n() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("MultiMessageClientStream[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
