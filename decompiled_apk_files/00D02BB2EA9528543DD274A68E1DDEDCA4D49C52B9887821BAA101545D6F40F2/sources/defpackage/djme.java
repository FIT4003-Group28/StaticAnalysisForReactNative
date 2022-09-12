package defpackage;
/* compiled from: PG */
/* renamed from: djme  reason: default package */
/* loaded from: classes6.dex */
public enum djme implements dsrb {
    UNKNOWN_SEMANTIC_CONSTRAINT(0),
    OPEN_NOW(1),
    OPEN_24_HOURS(2);
    
    public final int d;

    djme(int i) {
        this.d = i;
    }

    public static djme b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OPEN_NOW;
            }
            if (i == 2) {
                return OPEN_24_HOURS;
            }
            return null;
        }
        return UNKNOWN_SEMANTIC_CONSTRAINT;
    }

    public static dsrd c() {
        return djmd.a;
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
