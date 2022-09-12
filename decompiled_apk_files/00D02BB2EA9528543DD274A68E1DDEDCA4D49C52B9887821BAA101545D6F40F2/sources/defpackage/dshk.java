package defpackage;
/* compiled from: PG */
/* renamed from: dshk  reason: default package */
/* loaded from: classes6.dex */
public enum dshk {
    EMAIL,
    PHONE,
    PROFILE_ID,
    ID_NOT_SET;

    public static dshk a(int i) {
        if (i != 0) {
            if (i == 1) {
                return EMAIL;
            }
            if (i == 2) {
                return PHONE;
            }
            if (i == 3) {
                return PROFILE_ID;
            }
            return null;
        }
        return ID_NOT_SET;
    }
}
