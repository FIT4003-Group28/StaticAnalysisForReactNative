package defpackage;
/* compiled from: PG */
/* renamed from: bpuh  reason: default package */
/* loaded from: classes4.dex */
public enum bpuh implements dsrb {
    UNKNOWN_MODE(0),
    INITIAL(1),
    CAROUSEL(2),
    EXTENT_PICKING(3),
    ROUTE_SELECTION(4);
    
    public final int f;

    bpuh(int i) {
        this.f = i;
    }

    public static bpuh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INITIAL;
            }
            if (i == 2) {
                return CAROUSEL;
            }
            if (i == 3) {
                return EXTENT_PICKING;
            }
            if (i == 4) {
                return ROUTE_SELECTION;
            }
            return null;
        }
        return UNKNOWN_MODE;
    }

    public static dsrd c() {
        return bpug.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
