package defpackage;
/* compiled from: PG */
/* renamed from: dqiz  reason: default package */
/* loaded from: classes6.dex */
public enum dqiz implements dsrb {
    UNKNOWN_SCALE_TYPE(0),
    FIT_WIDTH(4),
    FIT_HEIGHT(5),
    SCALE(1),
    FIT_TOP(2),
    FIT_BOTTOM(3);
    
    private final int g;

    dqiz(int i) {
        this.g = i;
    }

    public static dqiz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SCALE;
            }
            if (i == 2) {
                return FIT_TOP;
            }
            if (i == 3) {
                return FIT_BOTTOM;
            }
            if (i == 4) {
                return FIT_WIDTH;
            }
            if (i == 5) {
                return FIT_HEIGHT;
            }
            return null;
        }
        return UNKNOWN_SCALE_TYPE;
    }

    public static dsrd c() {
        return dqiy.a;
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
