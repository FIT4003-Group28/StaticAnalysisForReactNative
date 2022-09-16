package defpackage;
/* compiled from: PG */
/* renamed from: axgp  reason: default package */
/* loaded from: classes2.dex */
public enum axgp implements aopm {
    NONE(0),
    FRAMERATE(1),
    DYNAMIC(2);
    
    public final int d;

    axgp(int i) {
        this.d = i;
    }

    public static aopo a() {
        return axce.f;
    }

    public static axgp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FRAMERATE;
            }
            if (i == 2) {
                return DYNAMIC;
            }
            return null;
        }
        return NONE;
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
