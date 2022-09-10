package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bptw  reason: default package */
/* loaded from: classes4.dex */
public abstract class bptw {
    private static final dcqe a = dcqe.c("bptw");
    static final dcco<bptv, bptz> f;

    static {
        dccm b = dcco.b();
        b.d(bptv.UNKNOWN_MODE, bptz.UNKNOWN_MODE);
        b.d(bptv.WHOLE_ROUTE, bptz.WHOLE_ROUTE);
        b.d(bptv.SELECTED_SEGMENTS, bptz.SELECTED_SEGMENTS);
        f = b.b();
    }

    public static bptu g() {
        bptq bptqVar = new bptq();
        bptqVar.b(dcdc.e());
        bptqVar.b = new bokk("", false);
        return bptqVar;
    }

    public static bptw i(bpua bpuaVar) {
        bptu g = g();
        bokm bokmVar = bpuaVar.b;
        if (bokmVar == null) {
            bokmVar = bokm.n;
        }
        bptq bptqVar = (bptq) g;
        bptqVar.a = bokk.a(bokmVar);
        bokm bokmVar2 = bpuaVar.c;
        if (bokmVar2 == null) {
            bokmVar2 = bokm.n;
        }
        bptqVar.b = bokk.a(bokmVar2);
        dbyy dbyyVar = ((dcmh) f).e;
        Object b = bptz.b(bpuaVar.f);
        if (b == null) {
            b = bptz.UNKNOWN_MODE;
        }
        bptv bptvVar = (bptv) dbyyVar.get(b);
        dbsk.s(bptvVar);
        g.c(bptvVar);
        g.b(dchl.k(bpuaVar.d, bptt.a));
        if ((bpuaVar.a & 4) != 0) {
            dpsn dpsnVar = bpuaVar.e;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            bptqVar.c = dbsg.i(akqi.j(dpsnVar));
        }
        return g.d();
    }

    public static bptw j(dbsg<drkz> dbsgVar, List<digh> list, List<drkz> list2, boolean z) {
        akqi akqiVar;
        String str;
        if (dbsgVar.a()) {
            dpyn dpynVar = dbsgVar.b().c;
            if (dpynVar == null) {
                dpynVar = dpyn.d;
            }
            str = dpynVar.b;
            dpsn dpsnVar = dbsgVar.b().b;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            akqiVar = akqi.j(dpsnVar);
        } else {
            if (!list2.isEmpty()) {
                dpsn dpsnVar2 = list2.get(0).b;
                if (dpsnVar2 == null) {
                    dpsnVar2 = dpsn.d;
                }
                akqiVar = akqi.j(dpsnVar2);
                if (list2.size() > 1) {
                    bvoo.h("Unexpected number of parent routes. Should have been 1", new Object[0]);
                } else if (list2.get(0).e == list.size()) {
                    z = true;
                }
            } else {
                akqiVar = null;
            }
            if (z) {
                dpyn dpynVar2 = list2.get(0).c;
                if (dpynVar2 == null) {
                    dpynVar2 = dpyn.d;
                }
                str = dpynVar2.b;
            } else {
                dpyn dpynVar3 = list.get(0).c;
                if (dpynVar3 == null) {
                    dpynVar3 = dpyn.d;
                }
                str = dpynVar3.b;
            }
        }
        dccx F = dcdc.F();
        for (digh dighVar : list) {
            dpsn dpsnVar3 = dighVar.b;
            if (dpsnVar3 == null) {
                dpsnVar3 = dpsn.d;
            }
            F.g(akqi.j(dpsnVar3));
        }
        bokk bokkVar = new bokk(true, str, false);
        bptu g = g();
        bptq bptqVar = (bptq) g;
        bptqVar.a = bokkVar;
        g.b(F.f());
        bptqVar.c = dbsg.j(akqiVar);
        g.c(z ? bptv.WHOLE_ROUTE : bptv.SELECTED_SEGMENTS);
        return g.d();
    }

    public abstract bokk a();

    public abstract dcdc<akqi> b();

    public abstract bokk c();

    public abstract dbsg<akqi> d();

    public abstract bptv e();

    public abstract bptu f();

    public final bptx h() {
        bptx bZ = bpua.g.bZ();
        bokl b = a().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpua bpuaVar = (bpua) bZ.b;
        bokm bK = b.bK();
        bK.getClass();
        bpuaVar.b = bK;
        bpuaVar.a |= 1;
        bokl b2 = c().b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpua bpuaVar2 = (bpua) bZ.b;
        bokm bK2 = b2.bK();
        bK2.getClass();
        bpuaVar2.c = bK2;
        bpuaVar2.a |= 2;
        bptz bptzVar = f.get(e());
        dbsk.s(bptzVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpua bpuaVar3 = (bpua) bZ.b;
        bpuaVar3.f = bptzVar.d;
        bpuaVar3.a |= 8;
        List k = dchl.k(b(), bpts.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bpua bpuaVar4 = (bpua) bZ.b;
        dsrj<dpsn> dsrjVar = bpuaVar4.d;
        if (!dsrjVar.a()) {
            bpuaVar4.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(k, bpuaVar4.d);
        if (d().a()) {
            dpsn i = d().b().i();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bpua bpuaVar5 = (bpua) bZ.b;
            i.getClass();
            bpuaVar5.e = i;
            bpuaVar5.a |= 4;
        }
        return bZ;
    }
}
