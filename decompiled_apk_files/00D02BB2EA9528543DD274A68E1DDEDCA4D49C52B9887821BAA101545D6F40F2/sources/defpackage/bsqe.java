package defpackage;
/* compiled from: PG */
/* renamed from: bsqe  reason: default package */
/* loaded from: classes4.dex */
class bsqe implements dbrn<dkee, dfpy> {
    @Override // defpackage.dbrn
    /* renamed from: b */
    public final dfpy a(dkee dkeeVar) {
        dkee dkeeVar2 = dkee.UNKNOWN_VIEW_TYPE;
        switch (dkeeVar.ordinal()) {
            case 0:
                return dfpy.UNKNOWN_VIEW_TYPE;
            case 1:
                return dfpy.COMMODITY;
            case 2:
                return dfpy.RICH;
            case 3:
                return dfpy.LEAN;
            case 4:
                return dfpy.CHAIN;
            case 5:
                return dfpy.DINING;
            case 6:
                return dfpy.PARKING;
            case 7:
                return dfpy.HOTEL;
            case 8:
                return dfpy.HOTEL_CHAIN;
            case 9:
                return dfpy.GAS_STATION;
            case 10:
                return dfpy.SHOPPING;
            case 11:
                return dfpy.TRANSIT;
            default:
                return c();
        }
    }

    public dfpy c() {
        throw null;
    }
}
