package defpackage;
/* compiled from: PG */
/* renamed from: dsfq  reason: default package */
/* loaded from: classes6.dex */
public enum dsfq {
    WEIGHTED_AVERAGE_SCHEDULE,
    TYPE_NOT_SET;

    public static dsfq a(int i) {
        if (i != 0) {
            if (i == 2) {
                return WEIGHTED_AVERAGE_SCHEDULE;
            }
            return null;
        }
        return TYPE_NOT_SET;
    }
}
