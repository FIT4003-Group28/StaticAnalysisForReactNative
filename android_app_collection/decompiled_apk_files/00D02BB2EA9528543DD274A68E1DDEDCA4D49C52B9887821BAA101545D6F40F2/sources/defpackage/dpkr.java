package defpackage;
/* compiled from: PG */
/* renamed from: dpkr  reason: default package */
/* loaded from: classes6.dex */
public enum dpkr implements dsrb {
    UNKNOWN_PERSONAL_APPEARANCE(0),
    GEO_PORTRAIT(1),
    RATED(2),
    RECOMMENDED(3),
    HOME(4),
    WORK(5),
    PERSONAL_SEARCH_RESULT(6),
    STARRED(7),
    CHECKIN(8),
    EVENT(9),
    HAPTIC_PLACE(10),
    HAPTIC_PLACE_LIST(11),
    PLACE_LIST_FAVORITES(12),
    PLACE_LIST_WANT_TO_GO(13),
    PLACE_LIST_CUSTOM(14),
    LOCATION_HISTORY(15),
    PERSONAL_BOOSTED(16),
    RECENTLY_VIEWED_PLACE(17);
    
    public final int s;

    dpkr(int i) {
        this.s = i;
    }

    public static dpkr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PERSONAL_APPEARANCE;
            case 1:
                return GEO_PORTRAIT;
            case 2:
                return RATED;
            case 3:
                return RECOMMENDED;
            case 4:
                return HOME;
            case 5:
                return WORK;
            case 6:
                return PERSONAL_SEARCH_RESULT;
            case 7:
                return STARRED;
            case 8:
                return CHECKIN;
            case 9:
                return EVENT;
            case 10:
                return HAPTIC_PLACE;
            case 11:
                return HAPTIC_PLACE_LIST;
            case 12:
                return PLACE_LIST_FAVORITES;
            case 13:
                return PLACE_LIST_WANT_TO_GO;
            case 14:
                return PLACE_LIST_CUSTOM;
            case 15:
                return LOCATION_HISTORY;
            case 16:
                return PERSONAL_BOOSTED;
            case 17:
                return RECENTLY_VIEWED_PLACE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpkq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
