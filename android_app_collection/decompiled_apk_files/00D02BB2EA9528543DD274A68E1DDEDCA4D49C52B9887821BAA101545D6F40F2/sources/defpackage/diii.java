package defpackage;
/* compiled from: PG */
/* renamed from: diii  reason: default package */
/* loaded from: classes6.dex */
public enum diii implements dsrb {
    UNKNOWN_ALIGNMENT(0),
    FIT_CENTER(1),
    FIT_LEFT(2),
    FIT_RIGHT(3),
    FULL_WIDTH_CROP(4),
    FULL_WIDTH_NO_CROP(5);
    
    private final int g;

    diii(int i) {
        this.g = i;
    }

    public static diii b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FIT_CENTER;
            }
            if (i == 2) {
                return FIT_LEFT;
            }
            if (i == 3) {
                return FIT_RIGHT;
            }
            if (i == 4) {
                return FULL_WIDTH_CROP;
            }
            if (i == 5) {
                return FULL_WIDTH_NO_CROP;
            }
            return null;
        }
        return UNKNOWN_ALIGNMENT;
    }

    public static dsrd c() {
        return diih.a;
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
