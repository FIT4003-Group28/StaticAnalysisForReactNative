package defpackage;
/* compiled from: PG */
/* renamed from: dmmz  reason: default package */
/* loaded from: classes6.dex */
public enum dmmz implements dsrb {
    BLEND_NORMAL(0),
    BLEND_MULTIPLY(1),
    BLEND_SCREEN(2);
    
    private final int d;

    dmmz(int i) {
        this.d = i;
    }

    public static dmmz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BLEND_MULTIPLY;
            }
            if (i == 2) {
                return BLEND_SCREEN;
            }
            return null;
        }
        return BLEND_NORMAL;
    }

    public static dsrd c() {
        return dmmy.a;
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
