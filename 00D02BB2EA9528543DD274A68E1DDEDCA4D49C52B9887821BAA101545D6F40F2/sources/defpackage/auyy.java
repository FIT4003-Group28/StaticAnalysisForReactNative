package defpackage;
/* compiled from: PG */
/* renamed from: auyy  reason: default package */
/* loaded from: classes.dex */
public final class auyy extends aujb {
    public auyy() {
        super(aujd.d(dpyv.TRANSIT_STATION.dm).a());
    }

    @Override // defpackage.aujb
    public final auil j() {
        return auil.c(ddda.ca, ddcu.JK);
    }

    @Override // defpackage.aujb
    public final boolean n(btvo btvoVar) {
        dkqz dkqzVar = btvoVar.getNotificationsParameters().m;
        if (dkqzVar == null) {
            dkqzVar = dkqz.ap;
        }
        dkhd dkhdVar = dkqzVar.a;
        if (dkhdVar == null) {
            dkhdVar = dkhd.h;
        }
        return dkhdVar.c || !dkqzVar.d;
    }
}
