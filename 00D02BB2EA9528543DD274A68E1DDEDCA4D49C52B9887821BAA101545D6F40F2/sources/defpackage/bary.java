package defpackage;
/* compiled from: PG */
/* renamed from: bary  reason: default package */
/* loaded from: classes3.dex */
class bary extends base {
    private final drix a;

    public bary(gga ggaVar, cqhn cqhnVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drix drixVar;
        if (drjsVar.a == 6) {
            drixVar = (drix) drjsVar.b;
        } else {
            drixVar = drix.f;
        }
        this.a = drixVar;
    }

    @Override // defpackage.base
    public basq h() {
        dqfu dqfuVar = this.a.d;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return new basq(dqfuVar);
    }
}
