package defpackage;
/* compiled from: PG */
/* renamed from: vut  reason: default package */
/* loaded from: classes7.dex */
public abstract class vut {
    private static void R(dccx<akqq> dccxVar, dpgw dpgwVar) {
        if ((dpgwVar.a & 128) != 0) {
            dnoh dnohVar = dpgwVar.i;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            double d = dnohVar.b;
            dnoh dnohVar2 = dpgwVar.i;
            if (dnohVar2 == null) {
                dnohVar2 = dnoh.d;
            }
            dccxVar.g(new akqq(d, dnohVar2.c));
        }
    }

    public abstract void A(amuh amuhVar);

    public abstract void B(boolean z);

    public abstract void C();

    public abstract void D(boolean z);

    public abstract void E(boolean z);

    public abstract void F(boolean z);

    public abstract void G(boolean z);

    public abstract void H(vtp vtpVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void I(dcdc<vto> dcdcVar);

    public abstract void J(boolean z);

    public abstract void K(dcdc<akqq> dcdcVar);

    public abstract void L();

    protected abstract int M();

    public abstract void N(int i);

    public final vuv O() {
        dcdc<akpp> f;
        dcdc<akqq> b = b();
        akps d = d();
        int M = M();
        if (M == vuu.a) {
            f = dcdc.e();
        } else if (b == null) {
            dcqe.b.v(dcqz.SMALL);
            f = dcdc.e();
        } else if (b.isEmpty()) {
            dcqe.b.v(dcqz.SMALL);
            f = dcdc.e();
        } else {
            int i = M - 1;
            if (M == 0) {
                throw null;
            }
            if (i == 1) {
                b = dcdc.f(b.get(0));
            } else if (i == 2) {
                b = dcdc.f((akqq) dcft.s(b));
            }
            dccx F = dcdc.F();
            boolean z = d == akps.NORMAL && b.size() > 1;
            for (int i2 = 0; i2 < b.size(); i2++) {
                if (z) {
                    F.g(akpp.l(b.get(i2), i2));
                } else {
                    F.g(akpp.m(b.get(i2), d));
                }
            }
            f = F.f();
        }
        u(f);
        amuh a = a();
        vtp h = h();
        dccx F2 = dcdc.F();
        int i3 = 0;
        while (i3 < a.m()) {
            F2.g(h.a(a.l(i3).h, i3 == a.b()));
            i3++;
        }
        I(F2.f());
        dcdc<akqq> b2 = b();
        boolean e = e();
        amuh a2 = a();
        int f2 = f();
        int g = g();
        dcdc<akqq> c = c();
        dccx F3 = dcdc.F();
        dccx F4 = dcdc.F();
        if (!b2.isEmpty()) {
            if (e) {
                F4.i(b2);
            } else if (g == -1) {
                int i4 = f2 - 1;
                if (i4 >= 0 && i4 < b2.size()) {
                    F4.g(b2.get(i4));
                }
                if (f2 >= 0 && f2 < b2.size()) {
                    F4.g(b2.get(f2));
                }
                g = -1;
            }
        }
        F3.i(F4.f());
        amub k = a2.k();
        if (k == null) {
            c = dcdc.e();
        } else {
            amve amveVar = k.d;
            if (g != -1 && k.h == dqvj.TRANSIT) {
                dccx F5 = dcdc.F();
                amtr d2 = amveVar.d(f2);
                amuq d3 = d2.d(g);
                dqvj c2 = dqvj.c(d3.a().b);
                if (c2 == null) {
                    c2 = dqvj.DRIVE;
                }
                if (c2 == dqvj.TRANSIT) {
                    dpgw dpgwVar = d3.g().c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    R(F5, dpgwVar);
                    dpgw dpgwVar2 = d3.g().d;
                    if (dpgwVar2 == null) {
                        dpgwVar2 = dpgw.r;
                    }
                    R(F5, dpgwVar2);
                    F5.i(c);
                } else {
                    if (g > 0) {
                        dpgw dpgwVar3 = d2.d(g - 1).g().d;
                        if (dpgwVar3 == null) {
                            dpgwVar3 = dpgw.r;
                        }
                        R(F5, dpgwVar3);
                    } else {
                        akqq akqqVar = k.ah(f2).e;
                        if (akqqVar != null) {
                            F5.g(akqqVar);
                        }
                    }
                    if (g < d2.e() - 1) {
                        dpgw dpgwVar4 = d2.d(g + 1).g().c;
                        if (dpgwVar4 == null) {
                            dpgwVar4 = dpgw.r;
                        }
                        R(F5, dpgwVar4);
                    } else {
                        akqq akqqVar2 = k.ah(f2 + 1).e;
                        if (akqqVar2 != null) {
                            F5.g(akqqVar2);
                        }
                    }
                }
                c = F5.f();
            }
        }
        F3.i(c);
        z(F3.f());
        return i();
    }

    public final void P(alfb alfbVar) {
        n(dbud.b(alfbVar));
    }

    public final void Q(alfa alfaVar) {
        m(dbud.b(alfaVar));
    }

    protected abstract amuh a();

    protected abstract dcdc<akqq> b();

    protected abstract dcdc<akqq> c();

    protected abstract akps d();

    protected abstract boolean e();

    protected abstract int f();

    protected abstract int g();

    protected abstract vtp h();

    protected abstract vuv i();

    public abstract void j(int i);

    public abstract void k(boolean z);

    public abstract void l(boolean z);

    public abstract void m(dbty<alfa> dbtyVar);

    public abstract void n(dbty<alfb> dbtyVar);

    public abstract void o(dcdc<akqq> dcdcVar);

    public abstract void p(boolean z);

    public abstract void q(boolean z);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(boolean z);

    protected abstract void u(dcdc<akpp> dcdcVar);

    public abstract void v(boolean z);

    public abstract void w(int i);

    public abstract void x(boolean z);

    public abstract void y(akps akpsVar);

    protected abstract void z(dcdc<akqq> dcdcVar);
}
