package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cdrw  reason: default package */
/* loaded from: classes4.dex */
final class cdrw implements cdiz {
    final /* synthetic */ cdsa a;

    public cdrw(cdsa cdsaVar) {
        this.a = cdsaVar;
    }

    @Override // defpackage.cdiz
    public final dcdc<cdji> a() {
        dccx F = dcdc.F();
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        for (dmay dmayVar : dmbgVar.d) {
            dwfl dwflVar = dmayVar.c;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            dsqp dsqpVar = (dsqp) dwflVar.cu(5);
            dsqpVar.bC(dwflVar);
            dwfi dwfiVar = (dwfi) dsqpVar;
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dghk dghkVar = dizhVar.c;
            if (dghkVar == null) {
                dghkVar = dghk.g;
            }
            if ((dghkVar.a & 2) == 0) {
                dizg bZ = dizh.j.bZ();
                dghj bZ2 = dghk.g.bZ();
                dggc dggcVar = dggc.PHOTO;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dghk dghkVar2 = (dghk) bZ2.b;
                dghkVar2.b = dggcVar.f;
                dghkVar2.a |= 2;
                dghk bK = bZ2.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dizh dizhVar2 = (dizh) bZ.b;
                bK.getClass();
                dizhVar2.c = bK;
                dizhVar2.a |= 2;
                dizh bK2 = bZ.bK();
                if (dwfiVar.c) {
                    dwfiVar.bF();
                    dwfiVar.c = false;
                }
                dwfl dwflVar2 = (dwfl) dwfiVar.b;
                bK2.getClass();
                dizh dizhVar3 = dwflVar2.p;
                if (dizhVar3 != null && dizhVar3 != dizh.j) {
                    dizg ca = dizh.j.ca(dwflVar2.p);
                    ca.bC(bK2);
                    bK2 = ca.bJ();
                }
                dwflVar2.p = bK2;
                dwflVar2.a |= 32768;
            }
            F.g(new cdqo(dwfiVar.bK()));
        }
        return F.f();
    }

    @Override // defpackage.cdiz
    public final dbsg<cdjl> b() {
        return this.a.c;
    }

    @Override // defpackage.cdiz
    public final dcdc<drew> c() {
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dmcc dmccVar = dmbgVar.c;
        if (dmccVar == null) {
            dmccVar = dmcc.i;
        }
        return dcdc.r(dmccVar.g);
    }

    @Override // defpackage.cdiz
    public final dcdc<drew> d() {
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dmcc dmccVar = dmbgVar.c;
        if (dmccVar == null) {
            dmccVar = dmcc.i;
        }
        return dcdc.r(dmccVar.h);
    }

    @Override // defpackage.cdiz
    public final dbsg<Integer> e() {
        Integer num;
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dmca dmcaVar = dmbgVar.b;
        if (dmcaVar == null) {
            dmcaVar = dmca.c;
        }
        if ((dmcaVar.a & 1) != 0) {
            dmbg dmbgVar2 = this.a.j().d;
            if (dmbgVar2 == null) {
                dmbgVar2 = dmbg.i;
            }
            dmca dmcaVar2 = dmbgVar2.b;
            if (dmcaVar2 == null) {
                dmcaVar2 = dmca.c;
            }
            num = Integer.valueOf(dmcaVar2.b);
        } else {
            num = null;
        }
        return dbsg.j(num);
    }

    @Override // defpackage.cdiz
    public final dbsg<eapy> f() {
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        dmce dmceVar = dmbgVar.e;
        if (dmceVar == null) {
            dmceVar = dmce.d;
        }
        drfu drfuVar = dmceVar.b;
        if (drfuVar == null) {
            drfuVar = drfu.c;
        }
        if ((drfuVar.a & 1) != 0) {
            dmbg dmbgVar2 = this.a.j().d;
            if (dmbgVar2 == null) {
                dmbgVar2 = dmbg.i;
            }
            dmce dmceVar2 = dmbgVar2.e;
            if (dmceVar2 == null) {
                dmceVar2 = dmce.d;
            }
            drfu drfuVar2 = dmceVar2.b;
            if (drfuVar2 == null) {
                drfuVar2 = drfu.c;
            }
            dpoj dpojVar = drfuVar2.b;
            if (dpojVar == null) {
                dpojVar = dpoj.e;
            }
            return dbsg.i(bqsq.f(dpojVar));
        }
        return dbpy.a;
    }

    @Override // defpackage.cdiz
    public final dbsg<dqwy> g() {
        dqwy dqwyVar = null;
        if ((this.a.j().a & 4) != 0) {
            dmbg dmbgVar = this.a.j().d;
            if (dmbgVar == null) {
                dmbgVar = dmbg.i;
            }
            if ((dmbgVar.a & 8) != 0) {
                dmbg dmbgVar2 = this.a.j().d;
                if (dmbgVar2 == null) {
                    dmbgVar2 = dmbg.i;
                }
                dqwyVar = dmbgVar2.f;
                if (dqwyVar == null) {
                    dqwyVar = dqwy.c;
                }
            }
        }
        return dbsg.j(dqwyVar);
    }

    @Override // defpackage.cdiz
    public final List<dreq> h() {
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        return dmbgVar.g;
    }

    @Override // defpackage.cdiz
    public final List<drfo> i() {
        dmbg dmbgVar = this.a.j().d;
        if (dmbgVar == null) {
            dmbgVar = dmbg.i;
        }
        return dmbgVar.h;
    }
}
