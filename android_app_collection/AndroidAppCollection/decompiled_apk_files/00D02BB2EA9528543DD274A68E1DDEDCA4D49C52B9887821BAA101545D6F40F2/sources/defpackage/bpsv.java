package defpackage;
/* compiled from: PG */
/* renamed from: bpsv  reason: default package */
/* loaded from: classes4.dex */
public abstract class bpsv {
    public static bpsv e(digh dighVar) {
        dbsg dbsgVar;
        dpsn dpsnVar = dighVar.b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        String o = akqi.j(dpsnVar).o();
        dpyn dpynVar = dighVar.c;
        if (dpynVar == null) {
            dpynVar = dpyn.d;
        }
        String str = dpynVar.b;
        if ((dighVar.a & 8) != 0) {
            dpum dpumVar = dighVar.e;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            dbsgVar = dbsg.i(akqq.f(dpumVar));
        } else {
            dbsgVar = dbpy.a;
        }
        dbrz f = dbrz.f(' ');
        drkx drkxVar = dighVar.j;
        if (drkxVar == null) {
            drkxVar = drkx.b;
        }
        return new bpsg(o, str, dbsgVar, f.g(dchl.k(drkxVar.a, bpsu.a)));
    }

    public abstract String a();

    public abstract String b();

    public abstract dbsg<akqq> c();

    public abstract String d();
}
