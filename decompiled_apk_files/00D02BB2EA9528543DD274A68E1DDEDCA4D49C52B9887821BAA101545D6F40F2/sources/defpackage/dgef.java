package defpackage;
/* compiled from: PG */
/* renamed from: dgef  reason: default package */
/* loaded from: classes6.dex */
public enum dgef implements dsrb {
    UNKNOWN_RECOMMENDATION_TYPE(0),
    ADD_BASIC_INFO(1),
    START_AWX_SETUP(2),
    COMPLETE_AWX_SETUP(3),
    ADD_MERCHANT_PHOTOS(4),
    CHECK_CUSTOMER_PHOTOS(5),
    CHECK_NEW_REVIEWS(6),
    SOLICIT_REVIEWS(7),
    CHECK_INSIGHTS(8),
    HOTELIER_ACTIVATION(9),
    HOTELIER_INSIGHTS(10),
    ENABLE_MESSAGING(11),
    CREATE_LOCAL_POSTS(12),
    UPDATE_BUSINESS_ATTRIBUTES_FLOW(13),
    CREATE_POST_WITH_SUGGESTED_TOPIC(14),
    COMPLETE_BUSINESS_PROFILE(15),
    AWX_PROMO_RUNNING(16),
    AWX_GENERAL_ISSUES(17),
    CALLS_ONBOARDING(18),
    ANNOUNCEMENT(19),
    SERVICES_BUNDLE_UPSELL(20),
    SERVICES_BUNDLE_IN_PROGRESS(21),
    GET_VERIFIED(22);
    
    public final int x;

    dgef(int i) {
        this.x = i;
    }

    public static dgef b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RECOMMENDATION_TYPE;
            case 1:
                return ADD_BASIC_INFO;
            case 2:
                return START_AWX_SETUP;
            case 3:
                return COMPLETE_AWX_SETUP;
            case 4:
                return ADD_MERCHANT_PHOTOS;
            case 5:
                return CHECK_CUSTOMER_PHOTOS;
            case 6:
                return CHECK_NEW_REVIEWS;
            case 7:
                return SOLICIT_REVIEWS;
            case 8:
                return CHECK_INSIGHTS;
            case 9:
                return HOTELIER_ACTIVATION;
            case 10:
                return HOTELIER_INSIGHTS;
            case 11:
                return ENABLE_MESSAGING;
            case 12:
                return CREATE_LOCAL_POSTS;
            case 13:
                return UPDATE_BUSINESS_ATTRIBUTES_FLOW;
            case 14:
                return CREATE_POST_WITH_SUGGESTED_TOPIC;
            case 15:
                return COMPLETE_BUSINESS_PROFILE;
            case 16:
                return AWX_PROMO_RUNNING;
            case 17:
                return AWX_GENERAL_ISSUES;
            case 18:
                return CALLS_ONBOARDING;
            case 19:
                return ANNOUNCEMENT;
            case 20:
                return SERVICES_BUNDLE_UPSELL;
            case 21:
                return SERVICES_BUNDLE_IN_PROGRESS;
            case 22:
                return GET_VERIFIED;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgee.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.x;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.x);
    }
}
