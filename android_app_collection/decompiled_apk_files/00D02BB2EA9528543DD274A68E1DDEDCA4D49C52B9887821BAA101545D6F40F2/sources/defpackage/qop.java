package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: qop  reason: default package */
/* loaded from: classes7.dex */
public class qop extends acoi implements qnd {
    private static final dcqe y = dcqe.c("qop");
    private static final dcdc<zdu> z = dcdc.e();
    private final acnw A;
    private final qpr B;
    private final Context C;
    private final xlu D;
    private final vox E;
    private final xmg F;
    private final akpm G;
    private final qkc H;
    private final boolean I;
    @dzsi
    private final rjz J;
    @dzsi
    private amub K;
    private int L;
    private boolean M;
    @dzsi
    private alad N;
    public final qok a;
    public final qcl b;
    public final qcl c;
    public final qcz d;
    public final qoh e;
    public final qpe f;
    public final qnm g;
    public final qnl h;
    public final cjqy i;
    @dzsi
    public acyu j;
    @dzsi
    public cqkp k;
    public List<qoj> l;
    public List<Integer> m;
    public dcdc<zdu> n;
    public boolean o;
    @dzsi
    public amte p;
    public int q;
    public boolean r;
    @dzsi
    public amte s;
    public int t;
    public final qom u;

    public qop(Application application, qok qokVar, xlu xluVar, vox voxVar, xmg xmgVar, akpm akpmVar, qkc qkcVar, cjqy cjqyVar, qpe qpeVar, qcl qclVar, qcl qclVar2, qcz qczVar, qoh qohVar, @dzsi dspd dspdVar, @dzsi List<dpce> list, @dzsi amte amteVar, @dzsi Integer num, @dzsi Bundle bundle, @dzsi rjz rjzVar, qnm qnmVar, qnl qnlVar) {
        amub amubVar;
        dpie dpieVar;
        dpbp dpbpVar;
        eapd eapdVar;
        qom qomVar = new qom(this);
        this.u = qomVar;
        qon qonVar = new qon(this);
        this.A = qonVar;
        this.B = new qoo();
        boolean z2 = true;
        this.M = true;
        int i = 0;
        this.r = false;
        this.N = null;
        this.s = null;
        this.C = application;
        this.a = qokVar;
        this.J = rjzVar;
        this.D = xluVar;
        this.E = voxVar;
        this.F = xmgVar;
        this.G = akpmVar;
        this.H = qkcVar;
        this.i = cjqyVar;
        this.b = qclVar;
        this.c = qclVar2;
        this.d = qczVar;
        this.e = qohVar;
        this.f = qpeVar;
        this.g = qnmVar;
        if (bundle != null) {
            this.I = bundle.containsKey("route-token");
            if (bundle.containsKey("camera-position")) {
                this.N = (alad) bundle.getSerializable("camera-position");
            }
        } else {
            this.I = dspdVar != null ? false : z2;
        }
        this.h = qnlVar;
        if (amteVar == null || num == null) {
            this.l = dcdc.f(qokVar.a(this, qclVar, qclVar2, qczVar, qohVar, dspdVar, null, null, qomVar, bundle, qpeVar, qnmVar, qnlVar));
            this.m = dcdc.f(-1);
            this.n = list == null ? z : zsa.b(list, vtj.TRANSIT_AUTO);
            this.o = false;
            this.v = qonVar;
            this.t = 2;
            if (this.s == null) {
                return;
            }
            qomVar.a(A(), this.s);
            this.s = null;
            return;
        }
        amub b = amteVar.b(num.intValue(), application);
        dbsk.s(b);
        dpie dpieVar2 = b.d.a;
        dpbp dpbpVar2 = dpieVar2.e.get(0);
        dccx dccxVar = new dccx();
        dccx F = dcdc.F();
        while (i < dpbpVar2.c.size()) {
            dpdy dpdyVar = dpbpVar2.c.get(i);
            dpec dpecVar = dpbpVar2.c.get(i).c;
            dqvj c = dqvj.c((dpecVar == null ? dpec.o : dpecVar).b);
            if ((c == null ? dqvj.DRIVE : c) == dqvj.TRANSIT) {
                dphe dpheVar = dpdyVar.e;
                dpgw dpgwVar = (dpheVar == null ? dphe.x : dpheVar).c;
                dgaw dgawVar = (dpgwVar == null ? dpgw.r : dpgwVar).f;
                long j = (dgawVar == null ? dgaw.g : dgawVar).b;
                qok qokVar2 = this.a;
                qcl qclVar3 = this.b;
                qcl qclVar4 = this.c;
                qcz qczVar2 = this.d;
                qoh qohVar2 = this.e;
                dpbpVar = dpbpVar2;
                dspd dspdVar2 = dpieVar2.g;
                dspd dspdVar3 = dpdyVar.f;
                dpieVar = dpieVar2;
                if (!this.h.j() || j == 0) {
                    amubVar = b;
                    eapdVar = null;
                } else {
                    amubVar = b;
                    eapdVar = new eapd(deba.c(j, 1000L));
                }
                dccxVar.g(qokVar2.a(this, qclVar3, qclVar4, qczVar2, qohVar2, dspdVar2, dspdVar3, eapdVar, this.u, null, this.f, this.g, this.h));
                F.g(Integer.valueOf(i));
            } else {
                amubVar = b;
                dpieVar = dpieVar2;
                dpbpVar = dpbpVar2;
            }
            i++;
            dpbpVar2 = dpbpVar;
            dpieVar2 = dpieVar;
            b = amubVar;
        }
        this.l = dccxVar.f();
        this.m = F.f();
        this.n = zsa.b(b.d.b().n, vtj.TRANSIT_AUTO);
        this.p = amteVar;
        this.q = num.intValue();
        this.v = this.A;
        this.t = 3;
    }

    private final qoj B() {
        return this.l.get(Os().intValue());
    }

    private final void C() {
        this.N = alad.c(this.G.aa());
    }

    public static Boolean l(zdu zduVar) {
        zvb c = zduVar.c();
        if (c != null) {
            return Boolean.valueOf(!dcft.w(alcf.o(c.c())));
        }
        return false;
    }

    public final qoj A() {
        return this.l.get(0);
    }

    @Override // defpackage.qnb
    public cqqw a() {
        throw null;
    }

    @Override // defpackage.qnd
    public List<? extends qnc> b() {
        return this.l;
    }

    @Override // defpackage.qnd
    public qpr c() {
        return this.B;
    }

    @Override // defpackage.qnd
    @dzsi
    public jam d() {
        if (this.h.c()) {
            return null;
        }
        return B().k();
    }

    @Override // defpackage.qnd
    public Boolean e(Integer num) {
        return l(t().get(num.intValue()));
    }

    @Override // defpackage.qnb
    public Boolean f() {
        throw null;
    }

    @Override // defpackage.qnb
    public Boolean g() {
        throw null;
    }

    @Override // defpackage.qnd
    @dzsi
    public rjz h() {
        return this.J;
    }

    @Override // defpackage.qnd
    public Boolean i() {
        return Boolean.valueOf(this.h.f());
    }

    @Override // defpackage.qnd
    @dzsi
    public qvm j() {
        return null;
    }

    public void k(Bundle bundle) {
        C();
        alad aladVar = this.N;
        if (aladVar != null) {
            bundle.putSerializable("camera-position", aladVar);
        }
        A().B(bundle);
    }

    public qoh m() {
        return A().C();
    }

    public final void n() {
        this.n = z;
        this.o = true;
        cqkx.p(this);
    }

    public final void o(amte amteVar, int i) {
        vow vowVar;
        amub b = amteVar.b(i, this.C);
        if (b == null) {
            bvoo.h("RouteDescription was null for trip index %d", Integer.valueOf(i));
            return;
        }
        if (this.h.b()) {
            List<akqq> h = this.D.h();
            boolean z2 = !h.isEmpty();
            boolean z3 = this.M || (this.r && this.F.b(h, true));
            if (z2) {
                this.M = false;
                this.r = false;
                if (z3) {
                    this.F.a(h, this.h.h());
                }
            }
        }
        int intValue = this.m.get(Os().intValue()).intValue();
        if (this.K != null && ((!this.h.g() || b.equals(this.K)) && this.L == intValue)) {
            return;
        }
        this.K = b;
        this.L = intValue;
        this.H.c(b);
        vow vowVar2 = vow.f;
        if (this.M) {
            vow f = vow.f(0);
            this.M = false;
            this.r = false;
            vowVar = f;
        } else {
            if (this.r) {
                amuq d = b.d.d(0).d(intValue);
                dpgw dpgwVar = d.g().c;
                if (dpgwVar == null) {
                    dpgwVar = dpgw.r;
                }
                dnoh dnohVar = dpgwVar.i;
                if (dnohVar == null) {
                    dnohVar = dnoh.d;
                }
                akqq e = akqq.e(dnohVar);
                if (this.h.h()) {
                    if (this.F.b(dcdc.f(e), true)) {
                        this.F.a(dcdc.f(e), true);
                    }
                } else {
                    dpgw dpgwVar2 = d.g().d;
                    if (dpgwVar2 == null) {
                        dpgwVar2 = dpgw.r;
                    }
                    dnoh dnohVar2 = dpgwVar2.i;
                    if (dnohVar2 == null) {
                        dnohVar2 = dnoh.d;
                    }
                    dcdc g = dcdc.g(e, akqq.e(dnohVar2));
                    if (this.F.b(g, false)) {
                        this.F.a(g, false);
                    }
                }
                this.r = false;
            }
            vowVar = vowVar2;
        }
        this.E.d(amteVar, dcdc.e(), i, intValue, vov.SINGLE_ROUTE, vowVar, null);
    }

    public final void p() {
        amte amteVar = this.p;
        if (amteVar != null) {
            o(amteVar, this.q);
        }
    }

    public final void q() {
        if (this.K != null) {
            this.E.e();
            this.K = null;
            this.H.c(null);
        }
    }

    public void r(@dzsi acyu acyuVar) {
        this.j = acyuVar;
        for (qoj qojVar : this.l) {
            qojVar.w(acyuVar);
        }
        this.E.a();
    }

    public void s(cqkp cqkpVar) {
        this.k = cqkpVar;
        B().x(cqkpVar);
    }

    @Override // defpackage.qne
    public dcdc<zdu> t() {
        return this.n;
    }

    @Override // defpackage.qne
    public Boolean u() {
        return Boolean.valueOf(this.o);
    }

    public void v() {
        alad aladVar;
        B().y();
        if (!this.M && (aladVar = this.N) != null) {
            this.G.p(akyt.e(aladVar));
            this.N = null;
        }
        p();
    }

    public void w() {
        C();
        q();
        B().z();
        this.k = null;
    }

    public void x() {
        this.E.b();
        for (qoj qojVar : this.l) {
            qojVar.A();
        }
        this.j = null;
    }

    public void y() {
        if (this.I) {
            B().z();
            for (qoj qojVar : this.l) {
                qojVar.A();
            }
            Z(0);
            this.n = z;
            this.o = false;
            this.l = dcdc.f(this.a.a(this, this.b, this.c, this.d, this.e, null, null, null, this.u, null, this.f, this.g, this.h));
            this.t = 2;
            qoj A = A();
            acyu acyuVar = this.j;
            dbsk.s(acyuVar);
            A.w(acyuVar);
            qoj A2 = A();
            cqkp cqkpVar = this.k;
            dbsk.s(cqkpVar);
            A2.x(cqkpVar);
            A().y();
            cqkx.p(this);
        }
    }

    public float z() {
        return ((Float) dcln.a.m(dcbg.b(this.l).s(qol.a))).floatValue();
    }
}
