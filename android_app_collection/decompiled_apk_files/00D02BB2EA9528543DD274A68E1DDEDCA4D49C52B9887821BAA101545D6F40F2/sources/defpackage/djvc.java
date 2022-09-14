package defpackage;
/* compiled from: PG */
/* renamed from: djvc  reason: default package */
/* loaded from: classes6.dex */
public enum djvc implements dsrb {
    UNKNOWN_TYPE(0),
    MAJOR_TYPE(1),
    MINOR_TYPE(2);
    
    public final int d;

    djvc(int i) {
        this.d = i;
    }

    public static djvc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAJOR_TYPE;
            }
            if (i == 2) {
                return MINOR_TYPE;
            }
            return null;
        }
        return UNKNOWN_TYPE;
    }

    public static dsrd c() {
        return djvb.a;
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
