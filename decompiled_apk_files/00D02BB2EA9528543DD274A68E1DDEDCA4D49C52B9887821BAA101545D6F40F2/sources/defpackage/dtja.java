package defpackage;
/* compiled from: PG */
/* renamed from: dtja  reason: default package */
/* loaded from: classes6.dex */
public enum dtja implements dsrb {
    INVALID_UI_TYPE(0),
    SEARCH(1),
    DIRECTIONS_DRIVING(2),
    DIRECTIONS_TRANSIT(3),
    DIRECTIONS_WALKING(4),
    DIRECTIONS_BICYCLE(5),
    DIRECTIONS_FLYING(13),
    DIRECTIONS_MIXED(14),
    DIRECTIONS_TWO_WHEELER(26),
    TACTILE_STARTUP(15),
    PROFILE_MAIN(6),
    PROFILE_PUBLIC(7),
    MAPS_HISTORY(8),
    EDIT_HOME_WORK(10),
    GUIDE(18),
    ROVER(21),
    CAR_SEARCH(16),
    CAR_HOME(17),
    CAR_CATEGORIES(23),
    FREE_NAV_DESTINATIONS(24),
    GMM_ASSISTANT(20),
    ROVER_NOTIFICATION(22),
    ROVER_LANDING_PAGE(25),
    MAP(9),
    BANNER(19),
    AREAS_OF_INTEREST(27);
    
    public final int A;

    dtja(int i) {
        this.A = i;
    }

    public static dtja b(int i) {
        switch (i) {
            case 0:
                return INVALID_UI_TYPE;
            case 1:
                return SEARCH;
            case 2:
                return DIRECTIONS_DRIVING;
            case 3:
                return DIRECTIONS_TRANSIT;
            case 4:
                return DIRECTIONS_WALKING;
            case 5:
                return DIRECTIONS_BICYCLE;
            case 6:
                return PROFILE_MAIN;
            case 7:
                return PROFILE_PUBLIC;
            case 8:
                return MAPS_HISTORY;
            case 9:
                return MAP;
            case 10:
                return EDIT_HOME_WORK;
            case 11:
            case 12:
            default:
                return null;
            case 13:
                return DIRECTIONS_FLYING;
            case 14:
                return DIRECTIONS_MIXED;
            case 15:
                return TACTILE_STARTUP;
            case 16:
                return CAR_SEARCH;
            case 17:
                return CAR_HOME;
            case 18:
                return GUIDE;
            case 19:
                return BANNER;
            case 20:
                return GMM_ASSISTANT;
            case 21:
                return ROVER;
            case 22:
                return ROVER_NOTIFICATION;
            case 23:
                return CAR_CATEGORIES;
            case 24:
                return FREE_NAV_DESTINATIONS;
            case 25:
                return ROVER_LANDING_PAGE;
            case 26:
                return DIRECTIONS_TWO_WHEELER;
            case 27:
                return AREAS_OF_INTEREST;
        }
    }

    public static dsrd c() {
        return dtiz.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
