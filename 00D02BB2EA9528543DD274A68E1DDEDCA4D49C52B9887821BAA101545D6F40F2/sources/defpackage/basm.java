package defpackage;
/* compiled from: PG */
/* renamed from: basm  reason: default package */
/* loaded from: classes3.dex */
class basm extends basp {
    private final drju c;

    public basm(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drju drjuVar;
        if (drjsVar.a == 7) {
            drjuVar = (drju) drjsVar.b;
        } else {
            drjuVar = drju.d;
        }
        this.c = drjuVar;
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String l() {
        drdg drdgVar = this.c.a;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        return dbsj.f(drdgVar.h);
    }
}
