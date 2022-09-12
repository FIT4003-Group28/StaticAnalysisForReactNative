package defpackage;
/* compiled from: PG */
/* renamed from: dxby  reason: default package */
/* loaded from: classes.dex */
public enum dxby implements dsrb {
    STARRING(1),
    DEPRECATED_MAPS_ADDRESS_BOOK(2),
    RECENT_PLACES(3),
    CHECKINS(4),
    REVIEWS(5),
    DIRECTIONS(6),
    MY_MAPS(7),
    PLACE_ALIASES(8),
    SEARCH_QUERIES(9),
    SHARED_PLACES(10);
    
    public final int k;

    dxby(int i) {
        this.k = i;
    }

    public static dxby b(int i) {
        switch (i) {
            case 1:
                return STARRING;
            case 2:
                return DEPRECATED_MAPS_ADDRESS_BOOK;
            case 3:
                return RECENT_PLACES;
            case 4:
                return CHECKINS;
            case 5:
                return REVIEWS;
            case 6:
                return DIRECTIONS;
            case 7:
                return MY_MAPS;
            case 8:
                return PLACE_ALIASES;
            case 9:
                return SEARCH_QUERIES;
            case 10:
                return SHARED_PLACES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dxbx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
