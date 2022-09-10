package defpackage;
/* compiled from: PG */
/* renamed from: auul  reason: default package */
/* loaded from: classes.dex */
public final class auul extends aujb {
    private final bypr c;

    public auul(bypr byprVar) {
        super(aujd.d(dpyv.AREA_TRAFFIC_WARM_UP.dm).a());
        this.c = byprVar;
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        dkql dkqlVar = btvoVar.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        return this.c.b(dkqlVar);
    }

    @Override // defpackage.aujb
    public final auil j() {
        return auil.c(ddda.bt, ddcu.c);
    }
}
