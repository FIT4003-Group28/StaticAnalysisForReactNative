package defpackage;
/* compiled from: PG */
/* renamed from: dpwz  reason: default package */
/* loaded from: classes.dex */
public enum dpwz implements dsrb {
    UNKNOWN_MAP_CONTENT_TYPE(0),
    MAP_CONTENT_EXPLORE(1),
    MAP_CONTENT_DRIVING(2),
    MAP_CONTENT_TRANSIT(3),
    MAP_CONTENT_SEARCH(8),
    MAP_CONTENT_BROWSE(9),
    MAP_CONTENT_DIRECTIONS_OVERVIEW(10),
    MAP_CONTENT_PLACE_DETAILS(11),
    MAP_CONTENT_BIKE(4),
    MAP_CONTENT_TERRAIN(5),
    MAP_CONTENT_SATELLITE(6),
    MAP_CONTENT_INDOOR(7),
    MAP_CONTENT_SAFETY(12),
    MAP_CONTENT_THREE_DIMENSIONAL(13),
    MAP_CONTENT_STREET_VIEW(15),
    MAP_CONTENT_COVID19(14);
    
    public final int q;

    dpwz(int i) {
        this.q = i;
    }

    public static dpwz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MAP_CONTENT_TYPE;
            case 1:
                return MAP_CONTENT_EXPLORE;
            case 2:
                return MAP_CONTENT_DRIVING;
            case 3:
                return MAP_CONTENT_TRANSIT;
            case 4:
                return MAP_CONTENT_BIKE;
            case 5:
                return MAP_CONTENT_TERRAIN;
            case 6:
                return MAP_CONTENT_SATELLITE;
            case 7:
                return MAP_CONTENT_INDOOR;
            case 8:
                return MAP_CONTENT_SEARCH;
            case 9:
                return MAP_CONTENT_BROWSE;
            case 10:
                return MAP_CONTENT_DIRECTIONS_OVERVIEW;
            case 11:
                return MAP_CONTENT_PLACE_DETAILS;
            case 12:
                return MAP_CONTENT_SAFETY;
            case 13:
                return MAP_CONTENT_THREE_DIMENSIONAL;
            case 14:
                return MAP_CONTENT_COVID19;
            case 15:
                return MAP_CONTENT_STREET_VIEW;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpwy.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
