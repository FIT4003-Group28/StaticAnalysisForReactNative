package defpackage;
/* compiled from: PG */
/* renamed from: axbo  reason: default package */
/* loaded from: classes2.dex */
public enum axbo implements aopm {
    PREVIEW_MODE_UNSPECIFIED(0),
    PREVIEW_MODE_REGULAR(1),
    PREVIEW_MODE_MINI(2);
    
    public final int d;

    axbo(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.u;
    }

    public static axbo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PREVIEW_MODE_REGULAR;
            }
            if (i == 2) {
                return PREVIEW_MODE_MINI;
            }
            return null;
        }
        return PREVIEW_MODE_UNSPECIFIED;
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
