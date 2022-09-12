package defpackage;
/* compiled from: PG */
/* renamed from: dkgc  reason: default package */
/* loaded from: classes6.dex */
public enum dkgc implements dsrb {
    UNKNOWN_TYPE(0),
    TODO_LIST(1),
    RED_STRIPES(2);
    
    private final int d;

    dkgc(int i) {
        this.d = i;
    }

    public static dkgc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TODO_LIST;
            }
            if (i == 2) {
                return RED_STRIPES;
            }
            return null;
        }
        return UNKNOWN_TYPE;
    }

    public static dsrd c() {
        return dkgb.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
