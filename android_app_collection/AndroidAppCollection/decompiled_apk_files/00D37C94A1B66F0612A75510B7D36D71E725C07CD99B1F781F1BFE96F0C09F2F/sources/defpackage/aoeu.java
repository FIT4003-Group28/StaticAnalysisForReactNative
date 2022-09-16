package defpackage;
/* compiled from: PG */
/* renamed from: aoeu  reason: default package */
/* loaded from: classes.dex */
public enum aoeu implements aopm {
    DATA_USAGE_NOTICE_TYPE_UNSPECIFIED(0),
    DATA_USAGE_NOTICE_TYPE_LINKING_INFO(1),
    DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT(2),
    DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT(3),
    UNRECOGNIZED(-1);
    
    private final int g;

    aoeu(int i) {
        this.g = i;
    }

    public static aoeu a(int i) {
        if (i != 0) {
            if (i == 1) {
                return DATA_USAGE_NOTICE_TYPE_LINKING_INFO;
            }
            if (i == 2) {
                return DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT;
            }
            if (i == 3) {
                return DATA_USAGE_NOTICE_TYPE_LINKING_INFO_WITH_CONSENT;
            }
            return null;
        }
        return DATA_USAGE_NOTICE_TYPE_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
