package defpackage;
/* compiled from: PG */
/* renamed from: dpdn  reason: default package */
/* loaded from: classes6.dex */
public enum dpdn implements dsrb {
    SIDE_LEFT(1),
    SIDE_RIGHT(2),
    SIDE_UNSPECIFIED(3);
    
    public final int d;

    dpdn(int i) {
        this.d = i;
    }

    public static dpdn b(int i) {
        if (i != 1) {
            if (i == 2) {
                return SIDE_RIGHT;
            }
            if (i == 3) {
                return SIDE_UNSPECIFIED;
            }
            return null;
        }
        return SIDE_LEFT;
    }

    public static dsrd c() {
        return dpdm.a;
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
