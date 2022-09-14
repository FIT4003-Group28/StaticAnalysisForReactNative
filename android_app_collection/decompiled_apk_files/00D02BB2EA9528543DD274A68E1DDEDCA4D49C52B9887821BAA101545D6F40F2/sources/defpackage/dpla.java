package defpackage;
/* compiled from: PG */
/* renamed from: dpla  reason: default package */
/* loaded from: classes6.dex */
public enum dpla implements dsrb {
    TEST(0),
    SAVE(1),
    BEEN_HERE(2),
    REVIEW(3),
    PLACE_VISIT(4),
    DISMISS_TODO(6),
    ALIAS(7),
    NOTE(8),
    QUESTION_ANSWER(9),
    THUMBS_VOTE(11),
    OFFERING(12),
    REPORT_OFFERING_PROBLEM(19),
    OFFERING_RECOMMENDATION(20),
    PLACE_QA_QUESTION(13),
    PLACE_QA_ANSWER(14),
    IMAGE_THUMBS_VOTE(15),
    POST_TRIP_UGC_ANSWER(16),
    GET_GDPR_NOTICE_SET_ALIAS_MESSAGE(17),
    REDSTRIPES_UPDATE(18);
    
    public final int t;

    dpla(int i) {
        this.t = i;
    }

    public static dpla b(int i) {
        switch (i) {
            case 0:
                return TEST;
            case 1:
                return SAVE;
            case 2:
                return BEEN_HERE;
            case 3:
                return REVIEW;
            case 4:
                return PLACE_VISIT;
            case 5:
            case 10:
            default:
                return null;
            case 6:
                return DISMISS_TODO;
            case 7:
                return ALIAS;
            case 8:
                return NOTE;
            case 9:
                return QUESTION_ANSWER;
            case 11:
                return THUMBS_VOTE;
            case 12:
                return OFFERING;
            case 13:
                return PLACE_QA_QUESTION;
            case 14:
                return PLACE_QA_ANSWER;
            case 15:
                return IMAGE_THUMBS_VOTE;
            case 16:
                return POST_TRIP_UGC_ANSWER;
            case 17:
                return GET_GDPR_NOTICE_SET_ALIAS_MESSAGE;
            case 18:
                return REDSTRIPES_UPDATE;
            case 19:
                return REPORT_OFFERING_PROBLEM;
            case 20:
                return OFFERING_RECOMMENDATION;
        }
    }

    public static dsrd c() {
        return dpkz.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
