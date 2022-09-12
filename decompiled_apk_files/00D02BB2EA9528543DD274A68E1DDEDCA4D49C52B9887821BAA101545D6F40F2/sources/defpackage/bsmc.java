package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bsmc  reason: default package */
/* loaded from: classes4.dex */
public final class bsmc {
    private static final dcqe c = dcqe.c("bsmc");
    public List<dqer> a = dcdc.e();
    public dbsg<String> b = dbpy.a;
    private final dxio<aaap> d;
    private final dxio<brba> e;
    private final dxio<axwy> f;
    private final djrm g;
    private final cjqm h;

    public bsmc(dxio<aaap> dxioVar, dxio<brba> dxioVar2, dxio<axwy> dxioVar3, djrm djrmVar, cjqm cjqmVar) {
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.g = djrmVar;
        this.h = cjqmVar;
    }

    public final void a() {
        if (this.g.n.isEmpty()) {
            djrm djrmVar = this.g;
            if ((djrmVar.a & 16384) != 0) {
                dpvg dpvgVar = djrmVar.p;
                if (dpvgVar == null) {
                    dpvgVar = dpvg.d;
                }
                dpvg dpvgVar2 = dpvgVar;
                dnqg bZ = dnqh.p.bZ();
                int i = ddda.aA.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar = (dnqh) bZ.b;
                dnqhVar.a |= 64;
                dnqhVar.g = i;
                String b = this.h.a().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnqh dnqhVar2 = (dnqh) bZ.b;
                b.getClass();
                dnqhVar2.a |= 2;
                dnqhVar2.c = b;
                dnqh bK = bZ.bK();
                dqen bZ2 = dqep.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dqep dqepVar = (dqep) bZ2.b;
                dqepVar.b = 5;
                dqepVar.a = 1 | dqepVar.a;
                this.e.a().N(dpvgVar2, 4, null, bK, null, bZ2.bK(), null);
                return;
            }
            dprx dprxVar = djrmVar.o;
            if (dprxVar == null) {
                dprxVar = dprx.h;
            }
            if ((dprxVar.a & 4) != 0) {
                aaap a = this.d.a();
                dprx dprxVar2 = this.g.o;
                if (dprxVar2 == null) {
                    dprxVar2 = dprx.h;
                }
                String str = dprxVar2.g;
                dprx dprxVar3 = this.g.o;
                if (dprxVar3 == null) {
                    dprxVar3 = dprx.h;
                }
                a.e(str, dprxVar3, this.h);
                return;
            }
            djrm djrmVar2 = this.g;
            if ((djrmVar2.a & 2048) != 0) {
                axwy a2 = this.f.a();
                drco drcoVar = this.g.m;
                if (drcoVar == null) {
                    drcoVar = drco.d;
                }
                a2.E(drcoVar.c);
                return;
            } else if (djrmVar2.e.size() > 0) {
                djrm djrmVar3 = this.g;
                String str2 = djrmVar3.b;
                dcdc z = dcbg.b(djrmVar3.e).s(bsmb.a).z();
                bray d = braz.d();
                d.b(this.h);
                d.c(true);
                this.e.a().t(str2, z, d.a());
                return;
            } else {
                bvoo.h("Can't open set without query or place feature IDs.", new Object[0]);
                return;
            }
        }
        dwim bZ3 = dwir.R.bZ();
        String str3 = this.g.n;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwir dwirVar = (dwir) bZ3.b;
        str3.getClass();
        dwirVar.a |= 1;
        dwirVar.c = str3;
        dqgx bZ4 = dqgy.e.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dqgy dqgyVar = (dqgy) bZ4.b;
        dqgyVar.a |= 2;
        dqgyVar.d = true;
        List<dqer> list = this.a;
        dqgy dqgyVar2 = (dqgy) bZ4.b;
        dsrj<dqer> dsrjVar = dqgyVar2.c;
        if (!dsrjVar.a()) {
            dqgyVar2.c = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, dqgyVar2.c);
        dqgy bK2 = bZ4.bK();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dwir dwirVar2 = (dwir) bZ3.b;
        bK2.getClass();
        dwirVar2.M = bK2;
        dwirVar2.b |= 2097152;
        dwir.e(dwirVar2);
        if (this.b.a()) {
            dwip bZ5 = dwiq.e.bZ();
            String b2 = this.b.b();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dwiq dwiqVar = (dwiq) bZ5.b;
            b2.getClass();
            dwiqVar.a |= 4;
            dwiqVar.d = b2;
            dwiq.c(dwiqVar);
            dwiq bK3 = bZ5.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwir dwirVar3 = (dwir) bZ3.b;
            bK3.getClass();
            dwirVar3.u = bK3;
            dwirVar3.a |= 134217728;
        }
        if (this.h.a().a()) {
            dnqg bZ6 = dnqh.p.bZ();
            int i2 = ddda.aA.b;
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnqh dnqhVar3 = (dnqh) bZ6.b;
            dnqhVar3.a |= 64;
            dnqhVar3.g = i2;
            String b3 = this.h.a().b();
            if (bZ6.c) {
                bZ6.bF();
                bZ6.c = false;
            }
            dnqh dnqhVar4 = (dnqh) bZ6.b;
            b3.getClass();
            dnqhVar4.a |= 2;
            dnqhVar4.c = b3;
            dnqh bK4 = bZ6.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwir dwirVar4 = (dwir) bZ3.b;
            bK4.getClass();
            dwirVar4.s = bK4;
            dwirVar4.a |= 33554432;
        }
        iqy iqyVar = new iqy();
        iqyVar.l = this.g.b;
        this.e.a().m(bZ3, iqyVar);
    }
}
