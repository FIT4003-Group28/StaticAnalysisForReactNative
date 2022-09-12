package defpackage;
/* compiled from: PG */
/* renamed from: dqiv  reason: default package */
/* loaded from: classes6.dex */
public enum dqiv implements dsrb {
    UNKNOWN_FORMAT(0),
    BUTTERFLY(1),
    LOTTIE(2);
    
    private final int d;

    dqiv(int i) {
        this.d = i;
    }

    public static dqiv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BUTTERFLY;
            }
            if (i == 2) {
                return LOTTIE;
            }
            return null;
        }
        return UNKNOWN_FORMAT;
    }

    public static dsrd c() {
        return dqiu.a;
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
