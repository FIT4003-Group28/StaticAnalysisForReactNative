package defpackage;
/* compiled from: PG */
/* renamed from: dumt  reason: default package */
/* loaded from: classes6.dex */
public enum dumt implements dsrb {
    UNKNOWN_LOCATION_SHARING_STATE(0),
    NOT_SHARING(1),
    SHARING_BUT_NOT_REPORTING(2),
    SHARING_AND_REPORTING(3);
    
    public final int e;

    dumt(int i) {
        this.e = i;
    }

    public static dumt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NOT_SHARING;
            }
            if (i == 2) {
                return SHARING_BUT_NOT_REPORTING;
            }
            if (i == 3) {
                return SHARING_AND_REPORTING;
            }
            return null;
        }
        return UNKNOWN_LOCATION_SHARING_STATE;
    }

    public static dsrd c() {
        return dums.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
