package defpackage;
/* compiled from: PG */
/* renamed from: aeuh  reason: default package */
/* loaded from: classes2.dex */
public enum aeuh {
    NEUTRAL,
    LOW_CONFIDENCE,
    HIGH_CONFIDENCE,
    NO_CONFIDENCE,
    SERVER_ERROR,
    CONNECTIVITY_ERROR,
    GAIA_ERROR,
    CONFIRMED,
    CONFIRMED_CHECKIN;

    public static aeuh a(doer doerVar) {
        doer doerVar2 = doer.NO_CONFIDENCE;
        int ordinal = doerVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return LOW_CONFIDENCE;
            }
            if (ordinal == 2) {
                return HIGH_CONFIDENCE;
            }
            dcqe dcqeVar = aeui.a;
            bvoo.h("Unhandled confidence level: %s", doerVar);
            return SERVER_ERROR;
        }
        return NO_CONFIDENCE;
    }
}
