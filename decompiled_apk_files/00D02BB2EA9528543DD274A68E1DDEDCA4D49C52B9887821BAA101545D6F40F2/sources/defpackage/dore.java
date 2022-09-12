package defpackage;
/* compiled from: PG */
/* renamed from: dore  reason: default package */
/* loaded from: classes6.dex */
public enum dore implements dsrb {
    UNKNOWN(1),
    REROUTE_FROM_NEW_LOCATION(2),
    REROUTE_AND_ALTERNATES_FROM_NEW_LOCATION(5),
    TRAFFIC_UPDATE(3),
    TRAFFIC_UPDATE_AND_BETTER_TRIP(4),
    TRAFFIC_UPDATE_AND_ALTERNATES_AND_BETTER_TRIP(6),
    TRIP_UPDATE_AND_ALTERNATES(7),
    OFFLINE_TRIP_UPDATE_AND_ALTERNATES(8);
    
    public final int i;

    dore(int i) {
        this.i = i;
    }

    public static dore b(int i) {
        switch (i) {
            case 1:
                return UNKNOWN;
            case 2:
                return REROUTE_FROM_NEW_LOCATION;
            case 3:
                return TRAFFIC_UPDATE;
            case 4:
                return TRAFFIC_UPDATE_AND_BETTER_TRIP;
            case 5:
                return REROUTE_AND_ALTERNATES_FROM_NEW_LOCATION;
            case 6:
                return TRAFFIC_UPDATE_AND_ALTERNATES_AND_BETTER_TRIP;
            case 7:
                return TRIP_UPDATE_AND_ALTERNATES;
            case 8:
                return OFFLINE_TRIP_UPDATE_AND_ALTERNATES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dord.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
