package defpackage;
/* compiled from: PG */
/* renamed from: dksg  reason: default package */
/* loaded from: classes.dex */
public enum dksg implements dsrb {
    UNKNOWN_SUGGEST_SPINNER_VARIANT(0),
    BLUE_SPINNER_INLINE(1),
    GRAY_SPINNER_INLINE(2),
    BLUE_SPINNER_INDENTED(3),
    GRAY_SPINNER_INDENTED(4),
    NO_SPINNER_CARD(5);
    
    private final int g;

    dksg(int i) {
        this.g = i;
    }

    public static dksg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BLUE_SPINNER_INLINE;
            }
            if (i == 2) {
                return GRAY_SPINNER_INLINE;
            }
            if (i == 3) {
                return BLUE_SPINNER_INDENTED;
            }
            if (i == 4) {
                return GRAY_SPINNER_INDENTED;
            }
            if (i == 5) {
                return NO_SPINNER_CARD;
            }
            return null;
        }
        return UNKNOWN_SUGGEST_SPINNER_VARIANT;
    }

    public static dsrd c() {
        return dksf.a;
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
