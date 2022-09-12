package defpackage;
/* compiled from: PG */
/* renamed from: dkzq  reason: default package */
/* loaded from: classes6.dex */
public enum dkzq implements dsrb {
    UNKNOWN_AREA_FEEDBACK_TYPE(0),
    POSITIVE(1),
    NEGATIVE(2);
    
    public final int d;

    dkzq(int i) {
        this.d = i;
    }

    public static dkzq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return POSITIVE;
            }
            if (i == 2) {
                return NEGATIVE;
            }
            return null;
        }
        return UNKNOWN_AREA_FEEDBACK_TYPE;
    }

    public static dsrd c() {
        return dkzp.a;
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
