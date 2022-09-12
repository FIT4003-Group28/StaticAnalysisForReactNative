package defpackage;
/* compiled from: PG */
/* renamed from: ddos  reason: default package */
/* loaded from: classes.dex */
public enum ddos implements dsrb {
    UNKNOWN_TYPE(0),
    PHOTO_TAKEN(1),
    INITIAL_PHOTO_CONTRIBUTION(2),
    BE_THE_FIRST(3),
    AREA_TRAFFIC(4),
    POPULAR_PLACE(5),
    OPENING_HOURS(6),
    FACTUAL_MODERATION(7),
    REVIEW_AT_A_PLACE(8),
    DESTINATION_ARRIVAL_UGC(9),
    POST_TRIP_UGC(10),
    IOS_DELAYED_PHOTO_TAKEN(11),
    TODO_LIST(12),
    TODO_REVIEW(13),
    TODO_PHOTO(14),
    UGC_HOME_STREET(15),
    TRANSIT_CROWDEDNESS(16),
    SERVICE_RECOMMENDATION_POST_INTERACTION(18);
    
    public final int s;

    ddos(int i) {
        this.s = i;
    }

    public static ddos b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return PHOTO_TAKEN;
            case 2:
                return INITIAL_PHOTO_CONTRIBUTION;
            case 3:
                return BE_THE_FIRST;
            case 4:
                return AREA_TRAFFIC;
            case 5:
                return POPULAR_PLACE;
            case 6:
                return OPENING_HOURS;
            case 7:
                return FACTUAL_MODERATION;
            case 8:
                return REVIEW_AT_A_PLACE;
            case 9:
                return DESTINATION_ARRIVAL_UGC;
            case 10:
                return POST_TRIP_UGC;
            case 11:
                return IOS_DELAYED_PHOTO_TAKEN;
            case 12:
                return TODO_LIST;
            case 13:
                return TODO_REVIEW;
            case 14:
                return TODO_PHOTO;
            case 15:
                return UGC_HOME_STREET;
            case 16:
                return TRANSIT_CROWDEDNESS;
            case 17:
            default:
                return null;
            case 18:
                return SERVICE_RECOMMENDATION_POST_INTERACTION;
        }
    }

    public static dsrd c() {
        return ddor.a;
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
