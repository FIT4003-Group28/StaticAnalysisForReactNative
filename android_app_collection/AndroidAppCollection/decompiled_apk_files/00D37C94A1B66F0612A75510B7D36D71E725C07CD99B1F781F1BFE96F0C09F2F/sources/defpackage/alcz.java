package defpackage;
/* compiled from: PG */
/* renamed from: alcz  reason: default package */
/* loaded from: classes.dex */
public enum alcz implements aopm {
    PRIVATE(0),
    PUBLIC(1),
    UNLISTED(2);
    
    public final int d;

    alcz(int i) {
        this.d = i;
    }

    public static alcz a(int i) {
        if (i != 0) {
            if (i == 1) {
                return PUBLIC;
            }
            if (i == 2) {
                return UNLISTED;
            }
            return null;
        }
        return PRIVATE;
    }

    public static aopo b() {
        return adzd.i;
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
