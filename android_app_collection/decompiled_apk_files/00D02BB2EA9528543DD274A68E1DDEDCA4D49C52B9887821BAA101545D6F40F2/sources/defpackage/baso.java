package defpackage;
/* compiled from: PG */
/* renamed from: baso  reason: default package */
/* loaded from: classes3.dex */
class baso extends basp {
    private final drke c;

    public baso(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drke drkeVar;
        if (drjsVar.a == 5) {
            drkeVar = (drke) drjsVar.b;
        } else {
            drkeVar = drke.k;
        }
        this.c = drkeVar;
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String c() {
        dqfu dqfuVar = this.c.f;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return s(dqfuVar);
    }
}
