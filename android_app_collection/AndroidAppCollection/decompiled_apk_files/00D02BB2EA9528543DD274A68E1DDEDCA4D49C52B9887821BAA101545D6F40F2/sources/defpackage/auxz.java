package defpackage;
/* compiled from: PG */
/* renamed from: auxz  reason: default package */
/* loaded from: classes.dex */
public final class auxz extends auye {
    public auxz() {
        super(dpyv.REVIEW_AT_A_PLACE);
    }

    @Override // defpackage.aujb
    public final auil j() {
        return auil.c(ddda.bR, ddcu.Jr);
    }

    @Override // defpackage.auje
    public final dkhd y(btvo btvoVar) {
        dkvn dkvnVar = btvoVar.getNotificationsParameters().n;
        if (dkvnVar == null) {
            dkvnVar = dkvn.e;
        }
        dkhd dkhdVar = dkvnVar.b;
        return dkhdVar == null ? dkhd.h : dkhdVar;
    }

    @Override // defpackage.auje
    public final auik z(dkpm dkpmVar) {
        ddos ddosVar = ddos.REVIEW_AT_A_PLACE;
        dkpi dkpiVar = dkpmVar.e;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(ddosVar, dkpiVar);
    }
}
