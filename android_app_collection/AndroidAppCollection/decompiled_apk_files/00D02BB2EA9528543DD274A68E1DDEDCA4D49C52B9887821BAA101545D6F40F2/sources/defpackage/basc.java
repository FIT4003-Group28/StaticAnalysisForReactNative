package defpackage;
/* compiled from: PG */
/* renamed from: basc  reason: default package */
/* loaded from: classes3.dex */
class basc extends base {
    private final drka a;

    public basc(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drka drkaVar;
        if (drjsVar.a == 11) {
            drkaVar = (drka) drjsVar.b;
        } else {
            drkaVar = drka.f;
        }
        this.a = drkaVar;
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
