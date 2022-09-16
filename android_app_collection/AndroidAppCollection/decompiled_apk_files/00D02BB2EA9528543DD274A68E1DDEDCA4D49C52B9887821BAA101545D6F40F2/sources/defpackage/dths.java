package defpackage;
/* compiled from: PG */
/* renamed from: dths  reason: default package */
/* loaded from: classes6.dex */
public enum dths implements dsrb {
    VIEWPORT(0),
    RECT(1),
    UNION(2),
    INTERSECTION(3);
    
    private final int e;

    dths(int i) {
        this.e = i;
    }

    public static dths b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RECT;
            }
            if (i == 2) {
                return UNION;
            }
            if (i == 3) {
                return INTERSECTION;
            }
            return null;
        }
        return VIEWPORT;
    }

    public static dsrd c() {
        return dthr.a;
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
