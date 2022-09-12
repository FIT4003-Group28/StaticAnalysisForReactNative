package defpackage;
/* compiled from: PG */
/* renamed from: dhfr  reason: default package */
/* loaded from: classes6.dex */
public enum dhfr implements dsrb {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    CIRCLE(3),
    EXTERNAL_ACCOUNT(6),
    DEVICE_CONTACT(9),
    GOOGLE_GROUP(10),
    UNRECOGNIZED(-1);
    
    public static final dsrc<dhfr> o = new dsrc<dhfr>() { // from class: dhfq
        @Override // defpackage.dsrc
        public final /* bridge */ /* synthetic */ dhfr a(int i) {
            return dhfr.b(i);
        }
    };
    private final int p;

    dhfr(int i) {
        this.p = i;
    }

    public static dhfr b(int i) {
        switch (i) {
            case 0:
                return REQUEST_MASK_CONTAINER_UNKNOWN;
            case 1:
                return PROFILE;
            case 2:
                return CONTACT;
            case 3:
                return CIRCLE;
            case 4:
                return PLACE;
            case 5:
                return ACCOUNT;
            case 6:
                return EXTERNAL_ACCOUNT;
            case 7:
                return DOMAIN_PROFILE;
            case 8:
                return DOMAIN_CONTACT;
            case 9:
                return DEVICE_CONTACT;
            case 10:
                return GOOGLE_GROUP;
            case 11:
                return AFFINITY;
            case 12:
            default:
                return null;
            case 13:
                return RAW_DEVICE_CONTACT;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
