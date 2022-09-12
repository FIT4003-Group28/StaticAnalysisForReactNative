package defpackage;
/* compiled from: PG */
/* renamed from: dpwe  reason: default package */
/* loaded from: classes6.dex */
public enum dpwe implements dsrb {
    UNKNOWN_TYPE(0),
    REVIEW(1),
    RATING(2),
    PHOTO(3),
    VIDEO(4),
    DISH_OFFERING(5),
    PHOTO_ASSOCIATED_WITH_OFFERING(6),
    PUBLISHED_LIST(7),
    PUBLISHED_LIST_BONUS(8),
    PLACE_QA_ANSWER(9),
    PLACE_QA_QUESTION(10),
    QUESTION(11),
    MODERATION_VOTE(12);
    
    public final int n;

    dpwe(int i) {
        this.n = i;
    }

    public static dpwe b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return REVIEW;
            case 2:
                return RATING;
            case 3:
                return PHOTO;
            case 4:
                return VIDEO;
            case 5:
                return DISH_OFFERING;
            case 6:
                return PHOTO_ASSOCIATED_WITH_OFFERING;
            case 7:
                return PUBLISHED_LIST;
            case 8:
                return PUBLISHED_LIST_BONUS;
            case 9:
                return PLACE_QA_ANSWER;
            case 10:
                return PLACE_QA_QUESTION;
            case 11:
                return QUESTION;
            case 12:
                return MODERATION_VOTE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpwd.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
