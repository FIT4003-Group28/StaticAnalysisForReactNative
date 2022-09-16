package defpackage;
/* compiled from: PG */
/* renamed from: auon  reason: default package */
/* loaded from: classes2.dex */
public enum auon implements aopm {
    SCROLL_DIRECTION_UNKNOWN(0),
    SCROLL_DIRECTION_FORWARD(1),
    SCROLL_DIRECTION_BACKWARDS(2);
    
    public final int d;

    auon(int i) {
        this.d = i;
    }

    public static aopo a() {
        return aulk.t;
    }

    public static auon b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SCROLL_DIRECTION_FORWARD;
            }
            if (i == 2) {
                return SCROLL_DIRECTION_BACKWARDS;
            }
            return null;
        }
        return SCROLL_DIRECTION_UNKNOWN;
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
