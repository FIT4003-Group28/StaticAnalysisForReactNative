package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bijz  reason: default package */
/* loaded from: classes3.dex */
public class bijz implements bije, bega {
    private final gga a;
    private final dxio<axwy> b;
    private final dxio<afha> c;
    private final cjqy d;
    private final cjqq e;
    private final buzn f;
    private final bijw g;
    private final bijt h;
    private final dcdc<axxe> i;
    private final btvo j;
    @dzsi
    private bwrs<ilo> k;
    private List<biiy> l = dcdc.e();
    private List<biiy> m = dcdc.e();
    private List<bija> n = dcdc.e();
    private List<biiz> o = dcdc.e();
    private List<biix> p = dcdc.e();
    private List<bijf> q = dcdc.e();
    private List<biiw> r = dcdc.e();
    private List<bijb> s = dcdc.e();
    @dzsi
    private bijc t;

    public bijz(gga ggaVar, dxio<akfa> dxioVar, dxio<axwq> dxioVar2, dxio<axwy> dxioVar3, dxio<afha> dxioVar4, cjqy cjqyVar, axwg axwgVar, cjqq cjqqVar, buzn buznVar, bijw bijwVar, bijt bijtVar, btvo btvoVar) {
        this.a = ggaVar;
        this.b = dxioVar3;
        this.c = dxioVar4;
        this.d = cjqyVar;
        this.e = cjqqVar;
        this.i = dxioVar2.a().y().b().h();
        this.f = buznVar;
        this.g = bijwVar;
        this.h = bijtVar;
        this.j = btvoVar;
    }

    private final boolean n(String str) {
        return this.k.c().e != null && this.k.c().e.contains(str);
    }

    @dzsi
    private final axxe o(final dnwd dnwdVar) {
        return (axxe) dcbg.b(this.i).r(new dbsl(dnwdVar) { // from class: bijx
            private final dnwd a;

            {
                this.a = dnwdVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                final dnwd dnwdVar2 = this.a;
                return dcbg.b(((axxe) obj).b()).p(new dbsl(dnwdVar2) { // from class: bijy
                    private final dnwd a;

                    {
                        this.a = dnwdVar2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        dnwd dnwdVar3 = this.a;
                        return !dnwdVar3.a.isEmpty() && dnwdVar3.a.equals(((drjs) obj2).d.J());
                    }
                });
            }
        }).f();
    }

    @Override // defpackage.bije
    public List<biiy> a() {
        return this.l;
    }

    @Override // defpackage.bije
    public List<biiy> b() {
        return this.m;
    }

    @Override // defpackage.bije
    public List<bija> c() {
        return this.n;
    }

    @Override // defpackage.bije
    public List<biiz> d() {
        return this.o;
    }

    @Override // defpackage.bije
    public List<biix> e() {
        return this.p;
    }

    @Override // defpackage.bije
    public List<bijf> f() {
        return this.q;
    }

    @Override // defpackage.bije
    public List<biiw> g() {
        return this.r;
    }

    @Override // defpackage.bije
    public List<bijb> h() {
        if (j().intValue() + k().intValue() > 0) {
            return null;
        }
        return this.s;
    }

    @Override // defpackage.bije
    @dzsi
    public bijc i() {
        return this.t;
    }

    @Override // defpackage.bije
    public Integer j() {
        return Integer.valueOf(this.l.size() + this.p.size() + this.q.size() + this.m.size() + this.n.size() + this.o.size());
    }

    @Override // defpackage.bije
    public Integer k() {
        return Integer.valueOf(this.r.size());
    }

    @Override // defpackage.bije
    public Boolean l() {
        return w();
    }

    @Override // defpackage.bije
    public void m(String str) {
        bwrs<ilo> bwrsVar = this.k;
        if (bwrsVar != null) {
            ily g = bwrsVar.c().g();
            g.A.add(str);
            this.k.d(g.d());
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        bijv bijvVar;
        if (((ilo) bwrs.b(bwrsVar)) == null) {
            u();
            return;
        }
        this.k = bwrsVar;
        dnwf bX = bwrsVar.c().bX();
        dccx F = dcdc.F();
        for (dnjj dnjjVar : bX.g) {
            dnwd dnwdVar = dnjjVar.d;
            if (dnwdVar == null) {
                dnwdVar = dnwd.b;
            }
            bijn bijnVar = new bijn(dnjjVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar));
            if (!n(bijnVar.q())) {
                F.g(bijnVar);
            }
        }
        this.l = F.f();
        dccx F2 = dcdc.F();
        for (dnfu dnfuVar : bX.i) {
            dnwd dnwdVar2 = dnfuVar.i;
            if (dnwdVar2 == null) {
                dnwdVar2 = dnwd.b;
            }
            bijm bijmVar = new bijm(dnfuVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar2));
            if (!n(bijmVar.q())) {
                F2.g(bijmVar);
            }
        }
        this.p = F2.f();
        dccx F3 = dcdc.F();
        for (doqp doqpVar : bX.j) {
            dnwd dnwdVar3 = doqpVar.h;
            if (dnwdVar3 == null) {
                dnwdVar3 = dnwd.b;
            }
            bikb bikbVar = new bikb(doqpVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar3));
            if (!n(bikbVar.q())) {
                F3.g(bikbVar);
            }
        }
        this.q = F3.f();
        dccx F4 = dcdc.F();
        for (dobz dobzVar : bX.f) {
            dnwd dnwdVar4 = dobzVar.d;
            if (dnwdVar4 == null) {
                dnwdVar4 = dnwd.b;
            }
            bika bikaVar = new bika(dobzVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar4));
            if (!n(bikaVar.q())) {
                F4.g(bikaVar);
            }
        }
        this.m = F4.f();
        dccx F5 = dcdc.F();
        for (dnnz dnnzVar : bX.e) {
            dnwd dnwdVar5 = dnnzVar.f;
            if (dnwdVar5 == null) {
                dnwdVar5 = dnwd.b;
            }
            bijp bijpVar = new bijp(dnnzVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar5));
            if (!n(bijpVar.q())) {
                F5.g(bijpVar);
            }
        }
        this.n = F5.f();
        dccx F6 = dcdc.F();
        for (dnjy dnjyVar : bX.h) {
            dnwd dnwdVar6 = dnjyVar.i;
            if (dnwdVar6 == null) {
                dnwdVar6 = dnwd.b;
            }
            bijo bijoVar = new bijo(dnjyVar, this, this.a, this.d, this.e, this.f, this.b, o(dnwdVar6));
            if (!n(bijoVar.q())) {
                F6.g(bijoVar);
            }
        }
        this.o = F6.f();
        dccx F7 = dcdc.F();
        for (dnfm dnfmVar : bX.k) {
            dnwd dnwdVar7 = dnfmVar.g;
            if (dnwdVar7 == null) {
                dnwdVar7 = dnwd.b;
            }
            bijl bijlVar = new bijl(dnfmVar, this, this.a, this.d, this.e, this.f, this.c, this.b, o(dnwdVar7));
            if (!n(bijlVar.q())) {
                F7.g(bijlVar);
            }
        }
        this.r = F7.f();
        dccx F8 = dcdc.F();
        if (this.j.getPlaceSheetParameters().h() && (bX.a & 256) != 0) {
            bijt bijtVar = this.h;
            dqbe dqbeVar = bX.q;
            if (dqbeVar == null) {
                dqbeVar = dqbe.k;
            }
            F8.g(bijtVar.a(dqbeVar, this.k.c(), false));
        }
        this.s = F8.f();
        if (w().booleanValue()) {
            bijw bijwVar = this.g;
            bijw.a(this, 1);
            gga a = bijwVar.a.a();
            bijw.a(a, 2);
            cklf a2 = bijwVar.b.a();
            bijw.a(a2, 3);
            bijvVar = new bijv(this, a, a2);
        } else {
            bijvVar = null;
        }
        this.t = bijvVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.k = null;
        this.l = dcdc.e();
        this.m = dcdc.e();
        this.p = dcdc.e();
        this.q = dcdc.e();
        this.m = dcdc.e();
        this.n = dcdc.e();
        this.o = dcdc.e();
        this.r = dcdc.e();
        this.s = dcdc.e();
        this.t = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf((this.s.size() + j().intValue()) + k().intValue() > 0);
    }
}
