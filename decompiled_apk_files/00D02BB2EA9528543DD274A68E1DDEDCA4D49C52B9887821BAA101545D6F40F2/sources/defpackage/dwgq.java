package defpackage;
/* compiled from: PG */
/* renamed from: dwgq  reason: default package */
/* loaded from: classes6.dex */
public enum dwgq implements dsrb {
    UNKNOWN_UGC_COMPLAINT_CATEGORY(0),
    UGC_LOCATION(1),
    UGC_SPAM(2),
    UGC_COPYRIGHT(3),
    UGC_HATE(4),
    UGC_NUDITY(5),
    UGC_IMAGE_QUALITY(6),
    UGC_IRRELEVANT_BUSINESS(7),
    UGC_HARASSMENT(8),
    UGC_IRRELEVANT_OFFERING(9),
    UGC_PRIVATE(10),
    UGC_PROFANE_OR_OBSCENE(12),
    UGC_PROMOTION_OF_REGULATED_GOODS(13),
    UGC_ILLEGAL_ACTIVITY(14),
    UGC_OFFENSIVE(15),
    UGC_OTHER(16);
    
    public final int q;

    dwgq(int i) {
        this.q = i;
    }

    public static dwgq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_UGC_COMPLAINT_CATEGORY;
            case 1:
                return UGC_LOCATION;
            case 2:
                return UGC_SPAM;
            case 3:
                return UGC_COPYRIGHT;
            case 4:
                return UGC_HATE;
            case 5:
                return UGC_NUDITY;
            case 6:
                return UGC_IMAGE_QUALITY;
            case 7:
                return UGC_IRRELEVANT_BUSINESS;
            case 8:
                return UGC_HARASSMENT;
            case 9:
                return UGC_IRRELEVANT_OFFERING;
            case 10:
                return UGC_PRIVATE;
            case 11:
            default:
                return null;
            case 12:
                return UGC_PROFANE_OR_OBSCENE;
            case 13:
                return UGC_PROMOTION_OF_REGULATED_GOODS;
            case 14:
                return UGC_ILLEGAL_ACTIVITY;
            case 15:
                return UGC_OFFENSIVE;
            case 16:
                return UGC_OTHER;
        }
    }

    public static dsrd c() {
        return dwgp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
