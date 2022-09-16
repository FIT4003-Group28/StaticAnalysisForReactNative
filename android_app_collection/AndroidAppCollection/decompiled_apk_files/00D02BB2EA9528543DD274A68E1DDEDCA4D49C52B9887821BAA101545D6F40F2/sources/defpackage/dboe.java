package defpackage;
/* compiled from: PG */
/* renamed from: dboe  reason: default package */
/* loaded from: classes5.dex */
public enum dboe implements dsrb {
    POST_TOPIC_TYPE_UNSPECIFIED(0),
    STANDARD(1),
    EVENT(2),
    OFFER(3),
    PRODUCT(4),
    WELCOME_OFFER(5),
    MEDIA(6),
    COVID_19(7),
    FUNDRAISER(8),
    FRESHNESS(9);
    
    private final int k;

    dboe(int i) {
        this.k = i;
    }

    public static dboe b(int i) {
        switch (i) {
            case 0:
                return POST_TOPIC_TYPE_UNSPECIFIED;
            case 1:
                return STANDARD;
            case 2:
                return EVENT;
            case 3:
                return OFFER;
            case 4:
                return PRODUCT;
            case 5:
                return WELCOME_OFFER;
            case 6:
                return MEDIA;
            case 7:
                return COVID_19;
            case 8:
                return FUNDRAISER;
            default:
                return FRESHNESS;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
