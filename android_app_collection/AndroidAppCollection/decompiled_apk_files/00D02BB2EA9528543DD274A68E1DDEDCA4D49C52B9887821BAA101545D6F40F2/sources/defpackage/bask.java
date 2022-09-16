package defpackage;
/* compiled from: PG */
/* renamed from: bask  reason: default package */
/* loaded from: classes3.dex */
class bask extends basp {
    private final drjh c;

    public bask(gga ggaVar, bakx bakxVar, gdc gdcVar, drjs drjsVar, @dzsi bruv bruvVar) {
        super(ggaVar, bakxVar, gdcVar, drjsVar, bruvVar);
        drjj drjjVar;
        if (drjsVar.a == 3) {
            drjjVar = (drjj) drjsVar.b;
        } else {
            drjjVar = drjj.c;
        }
        drjh drjhVar = drjjVar.a;
        this.c = drjhVar == null ? drjh.j : drjhVar;
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String b() {
        dqfu dqfuVar = this.c.d;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return t(dqfuVar);
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String e() {
        dqfu dqfuVar = this.c.e;
        if (dqfuVar == null) {
            dqfuVar = dqfu.d;
        }
        return t(dqfuVar);
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String f() {
        int i = this.c.i;
        String u = u(i);
        if (i == 0 || u == null) {
            return null;
        }
        return (i < 0 || u.contains("+")) ? u : u.replaceFirst("(\\d+)", "+$1");
    }

    @Override // defpackage.basp, defpackage.baqi
    @dzsi
    public String h() {
        return u(this.c.h);
    }

    @Override // defpackage.basp, defpackage.baqi
    public String j() {
        drir drirVar = this.c.b;
        if (drirVar == null) {
            drirVar = drir.d;
        }
        return drirVar.a;
    }

    @Override // defpackage.basp, defpackage.baqi
    public String k() {
        drir drirVar = this.c.c;
        if (drirVar == null) {
            drirVar = drir.d;
        }
        return drirVar.a;
    }
}
