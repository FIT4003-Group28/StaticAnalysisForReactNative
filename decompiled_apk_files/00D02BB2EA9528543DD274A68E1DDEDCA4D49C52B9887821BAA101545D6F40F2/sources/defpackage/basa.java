package defpackage;
/* compiled from: PG */
/* renamed from: basa  reason: default package */
/* loaded from: classes3.dex */
class basa extends base {
    private final drjl a;

    public basa(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drjl drjlVar;
        if (drjsVar.a == 4) {
            drjlVar = (drjl) drjsVar.b;
        } else {
            drjlVar = drjl.f;
        }
        this.a = drjlVar;
    }

    @Override // defpackage.base
    public basq h() {
        dqfu dqfuVar = this.a.c;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        dqfu dqfuVar2 = this.a.d;
        if (dqfuVar2 == null) {
            dqfuVar2 = dqfu.d;
        }
        return new basq(dqfuVar, batk.m(dqfuVar2));
    }

    @Override // defpackage.base
    @dzsi
    public String l() {
        drdg drdgVar = this.a.b;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        if (drdgVar.i.isEmpty()) {
            return null;
        }
        drdg drdgVar2 = this.a.b;
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
