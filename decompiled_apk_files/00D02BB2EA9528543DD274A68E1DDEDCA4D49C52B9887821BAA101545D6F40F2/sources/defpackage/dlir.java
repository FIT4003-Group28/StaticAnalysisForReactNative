package defpackage;
/* compiled from: PG */
/* renamed from: dlir  reason: default package */
/* loaded from: classes6.dex */
public enum dlir implements dsrb {
    UNKNOWN(0),
    NO_ICON(1),
    QUANTUM_IC_RATE_REVIEW(2);
    
    private final int d;

    dlir(int i) {
        this.d = i;
    }

    public static dlir b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NO_ICON;
            }
            if (i == 2) {
                return QUANTUM_IC_RATE_REVIEW;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dliq.a;
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
