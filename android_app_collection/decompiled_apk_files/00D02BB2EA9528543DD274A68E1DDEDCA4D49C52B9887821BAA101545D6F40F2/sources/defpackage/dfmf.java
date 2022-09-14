package defpackage;
/* compiled from: PG */
/* renamed from: dfmf  reason: default package */
/* loaded from: classes6.dex */
public enum dfmf implements dsrb {
    TYPE_UNSPECIFIED(0),
    STAIRCASE(1),
    ESCALATOR(2),
    ELEVATOR(3);
    
    private final int e;

    dfmf(int i) {
        this.e = i;
    }

    public static dfmf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STAIRCASE;
            }
            if (i == 2) {
                return ESCALATOR;
            }
            if (i == 3) {
                return ELEVATOR;
            }
            return null;
        }
        return TYPE_UNSPECIFIED;
    }

    public static dsrd c() {
        return dfme.a;
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
