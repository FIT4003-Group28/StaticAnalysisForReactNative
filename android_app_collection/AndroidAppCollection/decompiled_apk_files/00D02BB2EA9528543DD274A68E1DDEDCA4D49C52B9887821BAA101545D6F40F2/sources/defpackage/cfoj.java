package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfoj  reason: default package */
/* loaded from: classes4.dex */
public class cfoj implements cfnw {
    public dcdc<cfog> a;
    private final dddi b;

    public cfoj(cfoh cfohVar, dddi dddiVar, diei dieiVar, final mw<dspd> mwVar) {
        this.b = dddiVar;
        this.a = dcdc.e();
        dccx F = dcdc.F();
        for (dieh diehVar : dieiVar.b) {
            mw mwVar2 = new mw(this, mwVar) { // from class: cfoi
                private final cfoj a;
                private final mw b;

                {
                    this.a = this;
                    this.b = mwVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    cfoj cfojVar = this.a;
                    mw mwVar3 = this.b;
                    dspd dspdVar = (dspd) obj;
                    dcdc<cfog> dcdcVar = cfojVar.a;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        cfog cfogVar = dcdcVar.get(i);
                        cfogVar.f(cfogVar.a.a.equals(dspdVar));
                    }
                    mwVar3.a(dspdVar);
                }
            };
            cfoh.a(cfohVar.a.a(), 1);
            cfoh.a(dddiVar, 2);
            cfoh.a(diehVar, 3);
            cfoh.a(mwVar2, 4);
            F.g(new cfog(dddiVar, diehVar, mwVar2));
        }
        this.a = F.f();
    }

    @Override // defpackage.cfnw
    public List<cfnv> a() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.cfnw
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtxy.nV;
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
