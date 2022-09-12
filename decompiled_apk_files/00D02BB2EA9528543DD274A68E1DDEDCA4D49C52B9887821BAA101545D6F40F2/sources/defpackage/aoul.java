package defpackage;
/* compiled from: PG */
/* renamed from: aoul  reason: default package */
/* loaded from: classes2.dex */
public enum aoul implements dsrb {
    NONE_TARGET(0),
    DAY_VIEW(1),
    SEGMENT_EDITING(2),
    VISITED_PLACES(3),
    VISITED_CITIES(4),
    VISITED_COUNTRIES(5),
    TRIPS(7),
    EXPERIENCES_IN_PLACE(6);
    
    public final int i;

    aoul(int i) {
        this.i = i;
    }

    public static aoul b(int i) {
        switch (i) {
            case 0:
                return NONE_TARGET;
            case 1:
                return DAY_VIEW;
            case 2:
                return SEGMENT_EDITING;
            case 3:
                return VISITED_PLACES;
            case 4:
                return VISITED_CITIES;
            case 5:
                return VISITED_COUNTRIES;
            case 6:
                return EXPERIENCES_IN_PLACE;
            case 7:
                return TRIPS;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return aouk.a;
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
