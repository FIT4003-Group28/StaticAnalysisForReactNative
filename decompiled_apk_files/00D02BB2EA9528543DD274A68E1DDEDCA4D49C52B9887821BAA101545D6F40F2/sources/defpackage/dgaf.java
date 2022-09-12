package defpackage;
/* compiled from: PG */
/* renamed from: dgaf  reason: default package */
/* loaded from: classes6.dex */
public enum dgaf implements dsrb {
    DISABLE_REASON_UNSPECIFIED(0),
    BUSINESS_UNRESPONSIVE(1),
    BUSINESS_ABUSE(2),
    BUSINESS_OPT_OUT(3),
    MAPS_DISCONNECTED(4),
    MERCHANT_UNREACHABLE_AUTO_DETECTED(5),
    MERCHANT_UNRESPONSIVE_AUTO_DETECTED(6);
    
    public final int h;

    dgaf(int i2) {
        this.h = i2;
    }

    public static dgaf b(int i2) {
        switch (i2) {
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

    public static dsrd c() {
        return dgae.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
