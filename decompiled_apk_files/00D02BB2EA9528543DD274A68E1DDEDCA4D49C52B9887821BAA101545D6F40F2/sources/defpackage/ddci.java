package defpackage;
/* compiled from: PG */
/* renamed from: ddci  reason: default package */
/* loaded from: classes5.dex */
public enum ddci implements dsrb {
    UNKNOWN(0),
    CONVERSATION_ON_SCREEN(1),
    RECEIVER_SIGNED_OUT(2),
    SUPPRESSED_BY_SYSTEM(3),
    SUPPRESSED_FOR_OPTOUT(4),
    SUPPRESSED_FOR_COUNTERFACTUAL(5),
    UNSUPPORTED_NOTIFICATION_TYPE(6),
    BUSINESS_MESSAGING_NOT_SUPPORTED(7),
    EXCEPTION_THROWN(8),
    MESSAGE_READ(9),
    SUPPRESSED_FOR_MERCHANT_DEDUP(10);
    
    public final int l;

    ddci(int i) {
        this.l = i;
    }

    public static ddci b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONVERSATION_ON_SCREEN;
            case 2:
                return RECEIVER_SIGNED_OUT;
            case 3:
                return SUPPRESSED_BY_SYSTEM;
            case 4:
                return SUPPRESSED_FOR_OPTOUT;
            case 5:
                return SUPPRESSED_FOR_COUNTERFACTUAL;
            case 6:
                return UNSUPPORTED_NOTIFICATION_TYPE;
            case 7:
                return BUSINESS_MESSAGING_NOT_SUPPORTED;
            case 8:
                return EXCEPTION_THROWN;
            case 9:
                return MESSAGE_READ;
            case 10:
                return SUPPRESSED_FOR_MERCHANT_DEDUP;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return ddch.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
