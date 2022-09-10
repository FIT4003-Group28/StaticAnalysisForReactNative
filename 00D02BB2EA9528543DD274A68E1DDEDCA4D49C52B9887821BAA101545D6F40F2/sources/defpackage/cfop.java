package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cfop  reason: default package */
/* loaded from: classes4.dex */
public class cfop implements cfny {
    public dcdc<cfom> a;
    private final dddi b;

    public cfop(cfon cfonVar, dddi dddiVar, dieo dieoVar, final mw<dspd> mwVar) {
        this.b = dddiVar;
        this.a = dcdc.e();
        dccx F = dcdc.F();
        for (dien dienVar : dieoVar.c) {
            F.g(cfonVar.a(dddiVar, dienVar, new mw(this, mwVar) { // from class: cfoo
                private final cfop a;
                private final mw b;

                {
                    this.a = this;
                    this.b = mwVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    cfop cfopVar = this.a;
                    mw mwVar2 = this.b;
                    dspd dspdVar = (dspd) obj;
                    dcdc<cfom> dcdcVar = cfopVar.a;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        cfom cfomVar = dcdcVar.get(i);
                        cfomVar.f(cfomVar.a.b.equals(dspdVar));
                    }
                    mwVar2.a(dspdVar);
                }
            }));
        }
        this.a = F.f();
    }

    @Override // defpackage.cfny
    public List<cfnx> a() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.cfny
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtxy.nX;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddiVar.getClass();
        dddgVar.d = dddiVar;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }
}
