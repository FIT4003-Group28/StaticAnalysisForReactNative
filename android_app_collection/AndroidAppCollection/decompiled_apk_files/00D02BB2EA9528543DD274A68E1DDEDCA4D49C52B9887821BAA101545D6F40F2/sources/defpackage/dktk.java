package defpackage;
/* compiled from: PG */
/* renamed from: dktk  reason: default package */
/* loaded from: classes.dex */
public enum dktk implements dsrb {
    UNKNOWN_ASSISTIVE_TAB_TYPE(0),
    EXPLORE(1),
    DRIVING(2),
    TRANSIT(3),
    FEED(4),
    COMMUTE(5),
    INBOX(7),
    INFORMAL_TRANSIT(8),
    MAPPERS_COMMUNITY(9),
    SAVED_TRIPS(10),
    CONTRIBUTE(11),
    SAVED_LISTS(12),
    UPDATES(13),
    TRANSPORTATION(14);
    
    public final int o;

    dktk(int i) {
        this.o = i;
    }

    public static dktk b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ASSISTIVE_TAB_TYPE;
            case 1:
                return EXPLORE;
            case 2:
                return DRIVING;
            case 3:
                return TRANSIT;
            case 4:
                return FEED;
            case 5:
                return COMMUTE;
            case 6:
            default:
                return null;
            case 7:
                return INBOX;
            case 8:
                return INFORMAL_TRANSIT;
            case 9:
                return MAPPERS_COMMUNITY;
            case 10:
                return SAVED_TRIPS;
            case 11:
                return CONTRIBUTE;
            case 12:
                return SAVED_LISTS;
            case 13:
                return UPDATES;
            case 14:
                return TRANSPORTATION;
        }
    }

    public static dsrd c() {
        return dktj.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
