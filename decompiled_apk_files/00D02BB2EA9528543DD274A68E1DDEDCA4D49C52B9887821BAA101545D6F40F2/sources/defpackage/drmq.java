package defpackage;
/* compiled from: PG */
/* renamed from: drmq  reason: default package */
/* loaded from: classes6.dex */
public enum drmq implements dsrb {
    UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER(2),
    END(3);
    
    private final int e;

    drmq(int i) {
        this.e = i;
    }

    public static drmq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return START;
            }
            if (i == 2) {
                return CENTER;
            }
            if (i == 3) {
                return END;
            }
            return null;
        }
        return UNKNOWN_IMAGE_HORIZONTAL_ALIGNMENT;
    }

    public static dsrd c() {
        return drmp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
