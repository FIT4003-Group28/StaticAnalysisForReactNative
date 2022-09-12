package defpackage;
/* compiled from: PG */
/* renamed from: djes  reason: default package */
/* loaded from: classes6.dex */
public enum djes implements dsrb {
    UNKNOWN_COLOR(0),
    TRANSPARENT(1),
    WHITE(2),
    BLUE(3),
    ORANGE(4);
    
    public final int f;

    djes(int i) {
        this.f = i;
    }

    public static djes b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRANSPARENT;
            }
            if (i == 2) {
                return WHITE;
            }
            if (i == 3) {
                return BLUE;
            }
            if (i == 4) {
                return ORANGE;
            }
            return null;
        }
        return UNKNOWN_COLOR;
    }

    public static dsrd c() {
        return djer.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
