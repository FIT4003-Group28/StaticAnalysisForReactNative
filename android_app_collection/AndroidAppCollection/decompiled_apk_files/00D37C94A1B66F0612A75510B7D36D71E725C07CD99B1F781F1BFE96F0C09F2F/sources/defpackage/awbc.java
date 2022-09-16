package defpackage;
/* compiled from: PG */
/* renamed from: awbc  reason: default package */
/* loaded from: classes2.dex */
public enum awbc implements aopm {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_HORIZONTAL_ALIGN_LEFT(1),
    ALIGN_HORIZONTAL_ALIGN_CENTER(2),
    ALIGN_HORIZONTAL_ALIGN_RIGHT(3);
    
    public final int e;

    awbc(int i) {
        this.e = i;
    }

    public static aopo a() {
        return avxs.p;
    }

    public static awbc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ALIGN_HORIZONTAL_ALIGN_LEFT;
            }
            if (i == 2) {
                return ALIGN_HORIZONTAL_ALIGN_CENTER;
            }
            if (i == 3) {
                return ALIGN_HORIZONTAL_ALIGN_RIGHT;
            }
            return null;
        }
        return ALIGN_HORIZONTAL_UNSPECIFIED;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
