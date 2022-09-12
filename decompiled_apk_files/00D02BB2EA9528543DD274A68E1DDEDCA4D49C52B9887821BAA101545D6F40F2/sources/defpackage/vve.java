package defpackage;
/* compiled from: PG */
/* renamed from: vve  reason: default package */
/* loaded from: classes7.dex */
public enum vve implements dsrb {
    HOME(0),
    WORK(1),
    OTHER(2);
    
    public final int d;

    vve(int i) {
        this.d = i;
    }

    public static vve b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WORK;
            }
            if (i == 2) {
                return OTHER;
            }
            return null;
        }
        return HOME;
    }

    public static dsrd c() {
        return vvd.a;
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
