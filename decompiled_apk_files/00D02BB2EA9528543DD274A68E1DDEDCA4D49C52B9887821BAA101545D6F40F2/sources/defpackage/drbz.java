package defpackage;
/* compiled from: PG */
/* renamed from: drbz  reason: default package */
/* loaded from: classes6.dex */
public enum drbz implements dsrb {
    UNKNOWN_COMPONENT(0),
    RENDER_INFO(1),
    DESCRIPTION(2),
    ATTRIBUTION(3),
    GEOLOCATION(4),
    ASSOCIATED_FEATURES(5),
    NAVIGATION_LINKS(6),
    STATISTICS(7),
    ROUTE_ANNOTATIONS(8),
    EXPERIMENTAL(9),
    PUBLICATION_INFO(10),
    OFFERING_CONTRIBUTION(11),
    STREET_VIEW(12),
    OCR_INFO(13),
    LABELS(14),
    STARBURST(15);
    
    public final int q;

    drbz(int i) {
        this.q = i;
    }

    public static drbz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMPONENT;
            case 1:
                return RENDER_INFO;
            case 2:
                return DESCRIPTION;
            case 3:
                return ATTRIBUTION;
            case 4:
                return GEOLOCATION;
            case 5:
                return ASSOCIATED_FEATURES;
            case 6:
                return NAVIGATION_LINKS;
            case 7:
                return STATISTICS;
            case 8:
                return ROUTE_ANNOTATIONS;
            case 9:
                return EXPERIMENTAL;
            case 10:
                return PUBLICATION_INFO;
            case 11:
                return OFFERING_CONTRIBUTION;
            case 12:
                return STREET_VIEW;
            case 13:
                return OCR_INFO;
            case 14:
                return LABELS;
            case 15:
                return STARBURST;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return drby.a;
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
