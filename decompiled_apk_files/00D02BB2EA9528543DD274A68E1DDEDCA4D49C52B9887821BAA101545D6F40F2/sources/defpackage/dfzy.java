package defpackage;
/* compiled from: PG */
/* renamed from: dfzy  reason: default package */
/* loaded from: classes6.dex */
public enum dfzy implements dsrb {
    UNKNOWN_DYNAMIC_ALLOCATION_SOURCE(0),
    CALL_TRACKING(1),
    CALL_TRACKING_CONTROL_OPTED_IN(2);
    
    private final int d;

    dfzy(int i) {
        this.d = i;
    }

    public static dfzy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CALL_TRACKING;
            }
            if (i == 2) {
                return CALL_TRACKING_CONTROL_OPTED_IN;
            }
            return null;
        }
        return UNKNOWN_DYNAMIC_ALLOCATION_SOURCE;
    }

    public static dsrd c() {
        return dfzx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
