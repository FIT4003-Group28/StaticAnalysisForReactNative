package defpackage;
/* compiled from: PG */
/* renamed from: dtzs  reason: default package */
/* loaded from: classes6.dex */
public enum dtzs implements dsrb {
    COMPLETION_STYLE_UNKNOWN(0),
    COMPLETION_STYLE_CARD(1),
    COMPLETION_STYLE_TOAST(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    dtzs(int i) {
        this.e = i;
    }

    public static dtzs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return COMPLETION_STYLE_CARD;
            }
            if (i == 2) {
                return COMPLETION_STYLE_TOAST;
            }
            return null;
        }
        return COMPLETION_STYLE_UNKNOWN;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
