package defpackage;
/* compiled from: PG */
/* renamed from: aqxh  reason: default package */
/* loaded from: classes2.dex */
public enum aqxh implements dsrb {
    DISABLE_REASON_UNSPECIFIED(0),
    BUSINESS_UNRESPONSIVE(1),
    BUSINESS_ABUSE(2),
    BUSINESS_OPT_OUT(3),
    MAPS_DISCONNECTED(4),
    MERCHANT_UNREACHABLE_AUTO_DETECTED(5),
    MERCHANT_UNRESPONSIVE_AUTO_DETECTED(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    aqxh(int i) {
        this.i = i;
    }

    public static aqxh b(int i) {
        switch (i) {
            case 0:
                return DISABLE_REASON_UNSPECIFIED;
            case 1:
                return BUSINESS_UNRESPONSIVE;
            case 2:
                return BUSINESS_ABUSE;
            case 3:
                return BUSINESS_OPT_OUT;
            case 4:
                return MAPS_DISCONNECTED;
            case 5:
                return MERCHANT_UNREACHABLE_AUTO_DETECTED;
            case 6:
                return MERCHANT_UNRESPONSIVE_AUTO_DETECTED;
            default:
                return null;
        }
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
