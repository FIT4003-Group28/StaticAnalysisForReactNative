package defpackage;
/* compiled from: PG */
/* renamed from: bptz  reason: default package */
/* loaded from: classes4.dex */
public enum bptz implements dsrb {
    UNKNOWN_MODE(0),
    WHOLE_ROUTE(1),
    SELECTED_SEGMENTS(2);
    
    public final int d;

    bptz(int i) {
        this.d = i;
    }

    public static bptz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WHOLE_ROUTE;
            }
            if (i == 2) {
                return SELECTED_SEGMENTS;
            }
            return null;
        }
        return UNKNOWN_MODE;
    }

    public static dsrd c() {
        return bpty.a;
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
