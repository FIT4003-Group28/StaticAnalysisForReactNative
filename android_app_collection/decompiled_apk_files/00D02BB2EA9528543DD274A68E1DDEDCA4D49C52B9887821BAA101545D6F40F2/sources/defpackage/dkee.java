package defpackage;
/* compiled from: PG */
/* renamed from: dkee  reason: default package */
/* loaded from: classes.dex */
public enum dkee implements dsrb {
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
    TRANSIT(11);
    
    private final int m;

    dkee(int i) {
        this.m = i;
    }

    public static dkee b(int i) {
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
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dked.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
