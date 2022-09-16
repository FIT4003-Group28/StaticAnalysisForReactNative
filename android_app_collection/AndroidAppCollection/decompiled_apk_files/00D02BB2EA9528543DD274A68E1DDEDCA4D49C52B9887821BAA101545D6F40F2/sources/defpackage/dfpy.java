package defpackage;
/* compiled from: PG */
/* renamed from: dfpy  reason: default package */
/* loaded from: classes6.dex */
public enum dfpy implements dsrb {
    UNKNOWN_VIEW_TYPE(0),
    COMMODITY(1),
    RICH(2),
    LEAN(3),
    CHAIN(4),
    DINING(5),
    PARKING(6),
    HOTEL(7),
    HOTEL_CHAIN(8),
    GAS_STATION(9),
    SHOPPING(10),
    TRANSIT(11),
    ATTRACTION(12);
    
    public final int n;

    dfpy(int i) {
        this.n = i;
    }

    public static dfpy b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_VIEW_TYPE;
            case 1:
                return COMMODITY;
            case 2:
                return RICH;
            case 3:
                return LEAN;
            case 4:
                return CHAIN;
            case 5:
                return DINING;
            case 6:
                return PARKING;
            case 7:
                return HOTEL;
            case 8:
                return HOTEL_CHAIN;
            case 9:
                return GAS_STATION;
            case 10:
                return SHOPPING;
            case 11:
                return TRANSIT;
            case 12:
                return ATTRACTION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dfpx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
