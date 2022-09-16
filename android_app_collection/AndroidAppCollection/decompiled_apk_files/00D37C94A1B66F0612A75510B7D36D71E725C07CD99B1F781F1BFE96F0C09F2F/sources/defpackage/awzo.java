package defpackage;
/* compiled from: PG */
/* renamed from: awzo  reason: default package */
/* loaded from: classes2.dex */
public enum awzo implements aopm {
    ALIGN_HORIZONTAL_UNSPECIFIED(0),
    ALIGN_LEFT(1),
    ALIGN_CENTER(2),
    ALIGN_RIGHT(3);
    
    public final int e;

    awzo(int i) {
        this.e = i;
    }

    public static aopo a() {
        return awsi.k;
    }

    public static awzo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ALIGN_LEFT;
            }
            if (i == 2) {
                return ALIGN_CENTER;
            }
            if (i == 3) {
                return ALIGN_RIGHT;
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
