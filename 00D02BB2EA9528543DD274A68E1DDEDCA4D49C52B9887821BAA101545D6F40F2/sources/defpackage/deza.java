package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: deza  reason: default package */
/* loaded from: classes6.dex */
final class deza implements dyls {
    private final deyb a;
    private final deys b;
    @dzsi
    private InputStream c;

    public deza(deyb deybVar, deys deysVar) {
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
        if (this.c == null) {
            this.c = inputStream;
            return;
        }
        synchronized (this.a) {
            this.a.l(dyjb.l.g("too many messages"));
        }
    }

    @Override // defpackage.dyls
    public final void d() {
        try {
            synchronized (this.b) {
                deys deysVar = this.b;
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    deysVar.c(inputStream);
                }
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28 + String.valueOf(valueOf2).length());
        sb.append("SingleMessageClientStream[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
