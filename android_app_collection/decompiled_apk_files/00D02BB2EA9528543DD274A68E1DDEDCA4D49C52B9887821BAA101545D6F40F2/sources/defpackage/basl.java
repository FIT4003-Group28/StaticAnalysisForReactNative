package defpackage;
/* compiled from: PG */
/* renamed from: basl  reason: default package */
/* loaded from: classes3.dex */
class basl extends basp {
    private final drjl c;

    public basl(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drjl drjlVar;
        if (drjsVar.a == 4) {
            drjlVar = (drjl) drjsVar.b;
        } else {
            drjlVar = drjl.f;
        }
        this.c = drjlVar;
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String l() {
        drdg drdgVar = this.c.b;
        if (drdgVar == null) {
            drdgVar = drdg.q;
        }
        return dbsj.f(drdgVar.h);
    }
}
