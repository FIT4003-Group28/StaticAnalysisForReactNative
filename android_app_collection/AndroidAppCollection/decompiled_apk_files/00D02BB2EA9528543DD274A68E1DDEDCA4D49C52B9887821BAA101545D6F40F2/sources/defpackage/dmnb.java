package defpackage;
/* compiled from: PG */
/* renamed from: dmnb  reason: default package */
/* loaded from: classes6.dex */
public enum dmnb implements dsrb {
    OFFSET_NONE(0),
    OFFSET_HALF_VERTICAL(1),
    OFFSET_HALF_HORIZONTAL(2);
    
    private final int d;

    dmnb(int i) {
        this.d = i;
    }

    public static dmnb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFSET_HALF_VERTICAL;
            }
            if (i == 2) {
                return OFFSET_HALF_HORIZONTAL;
            }
            return null;
        }
        return OFFSET_NONE;
    }

    public static dsrd c() {
        return dmna.a;
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
