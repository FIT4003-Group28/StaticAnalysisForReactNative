package defpackage;
/* compiled from: PG */
/* renamed from: dpyy  reason: default package */
/* loaded from: classes6.dex */
public enum dpyy implements dsrb {
    OCCUPANCY_RATE_UNKNOWN(0),
    EMPTY(1),
    MANY_SEATS_AVAILABLE(2),
    FEW_SEATS_AVAILABLE(3),
    STANDING_ROOM_ONLY(4),
    CRUSHED_STANDING_ROOM_ONLY(5),
    FULL(6),
    NOT_ACCEPTING_PASSENGERS(7),
    NOT_BOARDABLE(8);
    
    public final int j;

    dpyy(int i) {
        this.j = i;
    }

    public static dpyy b(int i) {
        switch (i) {
            case 0:
                return OCCUPANCY_RATE_UNKNOWN;
            case 1:
                return EMPTY;
            case 2:
                return MANY_SEATS_AVAILABLE;
            case 3:
                return FEW_SEATS_AVAILABLE;
            case 4:
                return STANDING_ROOM_ONLY;
            case 5:
                return CRUSHED_STANDING_ROOM_ONLY;
            case 6:
                return FULL;
            case 7:
                return NOT_ACCEPTING_PASSENGERS;
            case 8:
                return NOT_BOARDABLE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpyx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
