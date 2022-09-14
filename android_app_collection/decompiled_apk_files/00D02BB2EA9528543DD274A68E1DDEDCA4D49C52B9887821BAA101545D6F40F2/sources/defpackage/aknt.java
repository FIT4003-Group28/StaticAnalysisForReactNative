package defpackage;
/* compiled from: PG */
/* renamed from: aknt  reason: default package */
/* loaded from: classes2.dex */
public enum aknt implements dsrb {
    UNKNOWN_DETAIL_LEVEL(0),
    MINIMAL(1),
    AMBIENT(2),
    COMPLETE(3);
    
    public final int e;

    aknt(int i) {
        this.e = i;
    }

    public static aknt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MINIMAL;
            }
            if (i == 2) {
                return AMBIENT;
            }
            if (i == 3) {
                return COMPLETE;
            }
            return null;
        }
        return UNKNOWN_DETAIL_LEVEL;
    }

    public static dsrd c() {
        return akns.a;
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
