package defpackage;
/* compiled from: PG */
/* renamed from: dspq  reason: default package */
/* loaded from: classes.dex */
final class dspq {
    public final dspp a;

    public dspq(dspp dsppVar) {
        dsrk.i(dsppVar, "output");
        this.a = dsppVar;
        dsppVar.f = this;
    }

    public final void a(int i, int i2) {
        this.a.aE(i, i2);
    }

    public final void b(int i, long j) {
        this.a.aF(i, j);
    }

    public final void c(int i, long j) {
        this.a.aG(i, j);
    }

    public final void d(int i, float f) {
        this.a.H(i, f);
    }

    public final void e(int i, double d) {
        this.a.I(i, d);
    }

    public final void f(int i, int i2) {
        this.a.aC(i, i2);
    }

    public final void g(int i, long j) {
        this.a.aF(i, j);
    }

    public final void h(int i, int i2) {
        this.a.aC(i, i2);
    }

    public final void i(int i, long j) {
        this.a.aG(i, j);
    }

    public final void j(int i, int i2) {
        this.a.aE(i, i2);
    }

    public final void k(int i, boolean z) {
        this.a.i(i, z);
    }

    public final void l(int i, String str) {
        this.a.j(i, str);
    }

    public final void m(int i, dspd dspdVar) {
        this.a.k(i, dspdVar);
    }

    public final void n(int i, int i2) {
        this.a.aD(i, i2);
    }

    public final void o(int i, int i2) {
        this.a.F(i, i2);
    }

    public final void p(int i, long j) {
        this.a.G(i, j);
    }

    public final void q(int i, Object obj, dstc dstcVar) {
        this.a.m(i, (dssj) obj, dstcVar);
    }

    public final void r(int i, Object obj, dstc dstcVar) {
        dspp dsppVar = this.a;
        dsppVar.aB(i, 3);
        dstcVar.n((dssj) obj, dsppVar.f);
        dsppVar.aB(i, 4);
    }

    public final void s(int i, Object obj) {
        if (obj instanceof dspd) {
            this.a.o(i, (dspd) obj);
        } else {
            this.a.n(i, (dssj) obj);
        }
    }
}
