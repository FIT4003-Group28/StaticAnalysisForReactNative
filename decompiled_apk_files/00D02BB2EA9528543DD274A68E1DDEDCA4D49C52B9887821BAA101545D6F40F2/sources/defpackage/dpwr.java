package defpackage;
/* compiled from: PG */
/* renamed from: dpwr  reason: default package */
/* loaded from: classes.dex */
public enum dpwr implements dsrb {
    UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT(0),
    HOMESCREEN_EXPLORE_PROMINENT(1),
    HOMESCREEN_EXPLORE(4),
    HOMESCREEN_DRIVING_PROMINENT(2),
    HOMESCREEN_EXPLORE_HERO(15),
    HOMESCREEN_DRIVING(5),
    HOMESCREEN_TRANSIT_PROMINENT(3),
    HOMESCREEN_TRANSIT(6),
    PLACESHEET_PROMINENT_EVENTS(7),
    PLACESHEET_EVENTS(8),
    EVENTSHEET_RELATED_EVENTS(9),
    EVENTS_CONTRIBUTIONS_TAB(11),
    EXPERIENCE_CATEGORICAL_RESULTS(14),
    EXPERIENCE_ON_MAP_CARD(19),
    SEARCH_SUPPLEMENTAL(16),
    LOCAL_STREAM(17),
    PLACESHEET_COLLAPSED_EVENTS(18);
    
    public final int r;

    dpwr(int i) {
        this.r = i;
    }

    public static dpwr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MAJOR_EVENT_CARD_PLACEMENT;
            case 1:
                return HOMESCREEN_EXPLORE_PROMINENT;
            case 2:
                return HOMESCREEN_DRIVING_PROMINENT;
            case 3:
                return HOMESCREEN_TRANSIT_PROMINENT;
            case 4:
                return HOMESCREEN_EXPLORE;
            case 5:
                return HOMESCREEN_DRIVING;
            case 6:
                return HOMESCREEN_TRANSIT;
            case 7:
                return PLACESHEET_PROMINENT_EVENTS;
            case 8:
                return PLACESHEET_EVENTS;
            case 9:
                return EVENTSHEET_RELATED_EVENTS;
            case 10:
            case 12:
            case 13:
            default:
                return null;
            case 11:
                return EVENTS_CONTRIBUTIONS_TAB;
            case 14:
                return EXPERIENCE_CATEGORICAL_RESULTS;
            case 15:
                return HOMESCREEN_EXPLORE_HERO;
            case 16:
                return SEARCH_SUPPLEMENTAL;
            case 17:
                return LOCAL_STREAM;
            case 18:
                return PLACESHEET_COLLAPSED_EVENTS;
            case 19:
                return EXPERIENCE_ON_MAP_CARD;
        }
    }

    public static dsrd c() {
        return dpwq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
