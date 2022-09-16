package defpackage;
/* compiled from: PG */
/* renamed from: dquz  reason: default package */
/* loaded from: classes6.dex */
public enum dquz implements dsrb {
    UNKNOWN_TRANSIT_PATTERN_MATCHING_MODE(0),
    SOFT_MATCHING(1),
    STRICT_MATCHING(2);
    
    public final int d;

    dquz(int i) {
        this.d = i;
    }

    public static dquz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SOFT_MATCHING;
            }
            if (i == 2) {
                return STRICT_MATCHING;
            }
            return null;
        }
        return UNKNOWN_TRANSIT_PATTERN_MATCHING_MODE;
    }

    public static dsrd c() {
        return dquy.a;
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
