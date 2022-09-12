package defpackage;
/* compiled from: PG */
/* renamed from: dgjw  reason: default package */
/* loaded from: classes6.dex */
public enum dgjw implements dsrb {
    UNKNOWN(0),
    ANY_TIME(1),
    AFTER_RATING_OR_REVIEW(2),
    AFTER_PHONE_CALL(3),
    BEFORE_RATING_OR_REVIEW(4),
    AFTER_ANSWERING(5);
    
    private final int g;

    dgjw(int i) {
        this.g = i;
    }

    public static dgjw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ANY_TIME;
            }
            if (i == 2) {
                return AFTER_RATING_OR_REVIEW;
            }
            if (i == 3) {
                return AFTER_PHONE_CALL;
            }
            if (i == 4) {
                return BEFORE_RATING_OR_REVIEW;
            }
            if (i == 5) {
                return AFTER_ANSWERING;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dgjv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
