package defpackage;
/* compiled from: PG */
/* renamed from: drhg  reason: default package */
/* loaded from: classes6.dex */
public enum drhg implements dsrb {
    UNKNOWN_STATE(0),
    NEUTRAL(1),
    NEGATIVE(2);
    
    private final int d;

    drhg(int i) {
        this.d = i;
    }

    public static drhg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NEUTRAL;
            }
            if (i == 2) {
                return NEGATIVE;
            }
            return null;
        }
        return UNKNOWN_STATE;
    }

    public static dsrd c() {
        return drhf.a;
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
