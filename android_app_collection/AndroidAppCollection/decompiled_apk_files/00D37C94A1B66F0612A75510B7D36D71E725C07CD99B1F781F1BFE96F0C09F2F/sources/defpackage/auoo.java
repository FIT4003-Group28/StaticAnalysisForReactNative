package defpackage;
/* compiled from: PG */
/* renamed from: auoo  reason: default package */
/* loaded from: classes2.dex */
public enum auoo implements aopm {
    SCROLL_ORIENTATION_UNKNOWN(0),
    SCROLL_ORIENTATION_HORIZONTAL(1),
    SCROLL_ORIENTATION_VERTICAL(2);
    
    public final int d;

    auoo(int i) {
        this.d = i;
    }

    public static aopo a() {
        return aulk.u;
    }

    public static auoo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SCROLL_ORIENTATION_HORIZONTAL;
            }
            if (i == 2) {
                return SCROLL_ORIENTATION_VERTICAL;
            }
            return null;
        }
        return SCROLL_ORIENTATION_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
