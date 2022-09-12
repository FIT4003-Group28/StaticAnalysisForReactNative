package defpackage;
/* compiled from: PG */
/* renamed from: dgcq  reason: default package */
/* loaded from: classes6.dex */
public enum dgcq implements dsrb {
    UNKNOWN_ACTION_TYPE(0),
    ADS_CREATION(1),
    ADS_MANAGEMENT(2),
    BUSINESS_INFORMATION(3),
    CALLS(15),
    COVER_PHOTO(17),
    EVENTS(4),
    HOURS(5),
    LOGO(18),
    MENU(6),
    MESSAGES(21),
    OFFERS(7),
    PERFORMANCE(8),
    PHOTOS(9),
    PLACE_QA(14),
    PRODUCTS(10),
    PROFILE_SHARING(19),
    REVIEW_SOLICITATION(16),
    REVIEWS(11),
    SERVICES(12),
    SERVICES_SUBSCRIPTION_BUNDLE(20),
    UPDATES(13);
    
    private final int w;

    dgcq(int i) {
        this.w = i;
    }

    public static dgcq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ACTION_TYPE;
            case 1:
                return ADS_CREATION;
            case 2:
                return ADS_MANAGEMENT;
            case 3:
                return BUSINESS_INFORMATION;
            case 4:
                return EVENTS;
            case 5:
                return HOURS;
            case 6:
                return MENU;
            case 7:
                return OFFERS;
            case 8:
                return PERFORMANCE;
            case 9:
                return PHOTOS;
            case 10:
                return PRODUCTS;
            case 11:
                return REVIEWS;
            case 12:
                return SERVICES;
            case 13:
                return UPDATES;
            case 14:
                return PLACE_QA;
            case 15:
                return CALLS;
            case 16:
                return REVIEW_SOLICITATION;
            case 17:
                return COVER_PHOTO;
            case 18:
                return LOGO;
            case 19:
                return PROFILE_SHARING;
            case 20:
                return SERVICES_SUBSCRIPTION_BUNDLE;
            case 21:
                return MESSAGES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dgcp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
