package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: plu  reason: default package */
/* loaded from: classes7.dex */
public class plu implements pll {
    private final dqsq a;
    private final dcdc<cqix<?>> b;

    public plu(pmc pmcVar, String str, dqsq dqsqVar) {
        this.a = dqsqVar;
        dccx F = dcdc.F();
        for (dqso dqsoVar : dqsqVar.b) {
            pkf pkfVar = new pkf();
            gga a = pmcVar.a.a();
            pmc.a(a, 1);
            dxio a2 = ((dxjh) pmcVar.b).a();
            pmc.a(a2, 2);
            brba a3 = pmcVar.c.a();
            pmc.a(a3, 3);
            pmc.a(str, 4);
            pmc.a(dqsoVar, 5);
            F.g(cqgr.fT(pkfVar, new pmb(a, a2, a3, str, dqsoVar)));
        }
        this.b = F.f();
    }

    @Override // defpackage.pll
    public CharSequence a() {
        return this.a.a;
    }

    @Override // defpackage.pll
    public List<cqix<?>> b() {
        return this.b;
    }
}
