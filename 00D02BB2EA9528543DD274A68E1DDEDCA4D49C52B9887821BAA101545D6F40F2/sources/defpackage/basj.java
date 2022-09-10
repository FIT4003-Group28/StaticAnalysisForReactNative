package defpackage;
/* compiled from: PG */
/* renamed from: basj  reason: default package */
/* loaded from: classes3.dex */
class basj extends basp {
    private final drix c;

    public basj(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drix drixVar;
        if (drjsVar.a == 6) {
            drixVar = (drix) drjsVar.b;
        } else {
            drixVar = drix.f;
        }
        this.c = drixVar;
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String d() {
        dqfu dqfuVar = this.c.d;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return s(dqfuVar);
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String g() {
        dqfu dqfuVar = this.c.e;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return s(dqfuVar);
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String i() {
        drdg drdgVar = this.c.c;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        return dbsj.f(drdgVar.h);
    }
}
