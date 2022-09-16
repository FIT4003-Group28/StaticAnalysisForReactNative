package defpackage;
/* compiled from: PG */
/* renamed from: dfqc  reason: default package */
/* loaded from: classes6.dex */
public enum dfqc implements dsrb {
    UNKNOWN_FOLLOWEE_SOURCE(0),
    PROFILE(1),
    SELF_FOLLOWER_LIST(2),
    OTHERS_FOLLOWER_LIST(3),
    SELF_FOLLOWING_LIST(4),
    OTHERS_FOLLOWING_LIST(5),
    STREAM_CONTENT_CARD(6),
    STREAM_RECOMMENDATION_CARD(7),
    PROFILE_RECOMMENDATION_CARD(8),
    PLACESHEET_REVIEW(9),
    YOUR_EXPLORE_CONTENT(10),
    FOLLOW_FEED_CONTENT(11);
    
    public final int m;

    dfqc(int i) {
        this.m = i;
    }

    public static dfqc b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FOLLOWEE_SOURCE;
            case 1:
                return PROFILE;
            case 2:
                return SELF_FOLLOWER_LIST;
            case 3:
                return OTHERS_FOLLOWER_LIST;
            case 4:
                return SELF_FOLLOWING_LIST;
            case 5:
                return OTHERS_FOLLOWING_LIST;
            case 6:
                return STREAM_CONTENT_CARD;
            case 7:
                return STREAM_RECOMMENDATION_CARD;
            case 8:
                return PROFILE_RECOMMENDATION_CARD;
            case 9:
                return PLACESHEET_REVIEW;
            case 10:
                return YOUR_EXPLORE_CONTENT;
            case 11:
                return FOLLOW_FEED_CONTENT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dfqb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
