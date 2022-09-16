package defpackage;
/* compiled from: PG */
/* renamed from: dno  reason: default package */
/* loaded from: classes3.dex */
public enum dno implements aopm {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);
    
    public final int d;

    dno(int i) {
        this.d = i;
    }

    public static dno a(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENABLED;
            }
            if (i == 2) {
                return DISABLED;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static aopo b() {
        return dnn.a;
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
