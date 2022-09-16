package defpackage;
/* compiled from: PG */
/* renamed from: axae  reason: default package */
/* loaded from: classes2.dex */
public enum axae implements aopm {
    DAY_OF_WEEK_STYLE_UNSPECIFIED(0),
    DAY_OF_WEEK_NORMAL(1),
    DAY_OF_WEEK_LIGHT(2);
    
    public final int d;

    axae(int i) {
        this.d = i;
    }

    public static aopo a() {
        return awsi.o;
    }

    public static axae b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DAY_OF_WEEK_NORMAL;
            }
            if (i == 2) {
                return DAY_OF_WEEK_LIGHT;
            }
            return null;
        }
        return DAY_OF_WEEK_STYLE_UNSPECIFIED;
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
