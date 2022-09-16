package defpackage;
/* compiled from: PG */
/* renamed from: dvnp  reason: default package */
/* loaded from: classes6.dex */
public enum dvnp implements dsrb {
    UNKNOWN(0),
    DIRECTIONS(1),
    PLACE_DETAILS(2),
    START_PAGE(3),
    SEARCH(4),
    DEPRECATED_TILE(5),
    MAPS_ACTIVITIES_TIMELINE(6),
    RIDDLER(7),
    LOCAL_STREAM(8);
    
    public final int j;

    dvnp(int i) {
        this.j = i;
    }

    public static dvnp b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DIRECTIONS;
            case 2:
                return PLACE_DETAILS;
            case 3:
                return START_PAGE;
            case 4:
                return SEARCH;
            case 5:
                return DEPRECATED_TILE;
            case 6:
                return MAPS_ACTIVITIES_TIMELINE;
            case 7:
                return RIDDLER;
            case 8:
                return LOCAL_STREAM;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dvno.a;
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
