package defpackage;
/* compiled from: PG */
/* renamed from: basd  reason: default package */
/* loaded from: classes3.dex */
class basd extends base {
    private final drke a;

    public basd(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drke drkeVar;
        if (drjsVar.a == 5) {
            drkeVar = (drke) drjsVar.b;
        } else {
            drkeVar = drke.k;
        }
        this.a = drkeVar;
    }

    @Override // defpackage.base
    public basq h() {
        dqfu dqfuVar = this.a.f;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return new basq(dqfuVar);
    }
}
