package defpackage;
/* compiled from: PG */
/* renamed from: barx  reason: default package */
/* loaded from: classes3.dex */
class barx extends base {
    private final drit a;

    public barx(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drit dritVar;
        if (drjsVar.a == 8) {
            dritVar = (drit) drjsVar.b;
        } else {
            dritVar = drit.f;
        }
        this.a = dritVar;
    }

    @Override // defpackage.base
    public basq h() {
        dqfu dqfuVar = this.a.b;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        dqfu dqfuVar2 = this.a.b;
        if (dqfuVar2 == null) {
            dqfuVar2 = dqfu.d;
        }
        return new basq(dqfuVar, dqfuVar2);
    }
}
