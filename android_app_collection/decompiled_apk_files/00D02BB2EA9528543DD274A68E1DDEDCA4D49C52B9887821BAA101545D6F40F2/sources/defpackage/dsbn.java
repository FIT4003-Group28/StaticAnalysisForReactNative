package defpackage;
/* compiled from: PG */
/* renamed from: dsbn  reason: default package */
/* loaded from: classes6.dex */
public enum dsbn {
    IHNR_LAYOUT,
    INSAT_LAYOUT,
    TEMPORARY_MESSAGE_LAYOUT,
    LAYOUT_NOT_SET;

    public static dsbn a(int i) {
        if (i != 0) {
            if (i == 1) {
                return IHNR_LAYOUT;
            }
            if (i == 2) {
                return INSAT_LAYOUT;
            }
            if (i == 3) {
                return TEMPORARY_MESSAGE_LAYOUT;
            }
            return null;
        }
        return LAYOUT_NOT_SET;
    }
}
