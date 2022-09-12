package defpackage;
/* compiled from: PG */
/* renamed from: ctzd  reason: default package */
/* loaded from: classes5.dex */
public enum ctzd {
    UNKNOWN(0),
    SEND_MESSAGE(1),
    PREFILL_MESSAGE(2),
    CUSTOM_ACTION(3),
    WEB_ACTION(4),
    OVERLAY_ACTION(5),
    NO_OP_ACTION(6),
    CALL_ACTION(7),
    TOMBSTONE_ACTION(8),
    COMPOSED_OVERLAY_ACTION(9),
    URL_ACTION(10);
    
    public final int l;

    ctzd(int i) {
        this.l = i;
    }

    public static ctzd b(int i) {
        switch (i) {
            case 1:
                return SEND_MESSAGE;
            case 2:
                return PREFILL_MESSAGE;
            case 3:
                return CUSTOM_ACTION;
            case 4:
                return WEB_ACTION;
            case 5:
                return OVERLAY_ACTION;
            case 6:
                return NO_OP_ACTION;
            case 7:
                return CALL_ACTION;
            case 8:
                return TOMBSTONE_ACTION;
            case 9:
                return COMPOSED_OVERLAY_ACTION;
            case 10:
                return URL_ACTION;
            default:
                return UNKNOWN;
        }
    }
}
