package defpackage;
/* compiled from: PG */
/* renamed from: dpge  reason: default package */
/* loaded from: classes6.dex */
public enum dpge implements dsrb {
    UNKNOWN_RECOMMENDATION_REASON(0),
    FASTEST_EXIT(1),
    FASTEST_TRANSFER(2);
    
    private final int d;

    dpge(int i) {
        this.d = i;
    }

    public static dpge b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FASTEST_EXIT;
            }
            if (i == 2) {
                return FASTEST_TRANSFER;
            }
            return null;
        }
        return UNKNOWN_RECOMMENDATION_REASON;
    }

    public static dsrd c() {
        return dpgd.a;
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
