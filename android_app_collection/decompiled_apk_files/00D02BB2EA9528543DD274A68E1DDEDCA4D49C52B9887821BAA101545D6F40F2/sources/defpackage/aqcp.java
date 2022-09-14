package defpackage;
/* compiled from: PG */
/* renamed from: aqcp  reason: default package */
/* loaded from: classes2.dex */
public enum aqcp {
    UNKNOWN(0),
    CONVERSATION_ON_SCREEN(1),
    RECEIVER_SIGNED_OUT(2),
    SUPPRESSED_BY_SYSTEM(3),
    SUPPRESSED_FOR_OPTOUT(4),
    SUPPRESSED_FOR_COUNTERFACTUAL(5),
    UNSUPPORTED_NOTIFICATION_TYPE(6),
    BUSINESS_MESSAGING_NOT_SUPPORTED(7),
    EXCEPTION_THROWN(8),
    MESSAGE_READ(9);
    
    public final int k;

    aqcp(int i) {
        this.k = i;
    }
}
