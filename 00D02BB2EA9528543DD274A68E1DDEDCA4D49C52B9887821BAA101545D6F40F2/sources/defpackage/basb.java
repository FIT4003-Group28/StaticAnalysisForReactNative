package defpackage;
/* compiled from: PG */
/* renamed from: basb  reason: default package */
/* loaded from: classes3.dex */
class basb extends base {
    private final drju a;

    public basb(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drju drjuVar;
        if (drjsVar.a == 7) {
            drjuVar = (drju) drjsVar.b;
        } else {
            drjuVar = drju.d;
        }
        this.a = drjuVar;
    }

    @Override // defpackage.base
    public basq h() {
        dqfu dqfuVar = this.a.b;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return new basq(dqfuVar);
    }

    @Override // defpackage.base
    @dzsi
    public String l() {
        drdg drdgVar = this.a.a;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        if (drdgVar.i.isEmpty()) {
            return null;
        }
        drdg drdgVar2 = this.a.a;
        if (drdgVar2 == null) {
            drdgVar2 = drdg.q;
        }
        drcx drcxVar = drdgVar2.i.get(0).d;
        if (drcxVar == null) {
            drcxVar = drcx.d;
        }
        return drcxVar.c;
    }
}
