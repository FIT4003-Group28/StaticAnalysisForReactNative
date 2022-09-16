package defpackage;
/* compiled from: PG */
/* renamed from: axbb  reason: default package */
/* loaded from: classes2.dex */
public enum axbb implements aopm {
    LOCATION_STYLE_UNSPECIFIED(0),
    LOCATION_NORMAL(1),
    LOCATION_LIGHT(2);
    
    public final int d;

    axbb(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.t;
    }

    public static axbb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LOCATION_NORMAL;
            }
            if (i == 2) {
                return LOCATION_LIGHT;
            }
            return null;
        }
        return LOCATION_STYLE_UNSPECIFIED;
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
