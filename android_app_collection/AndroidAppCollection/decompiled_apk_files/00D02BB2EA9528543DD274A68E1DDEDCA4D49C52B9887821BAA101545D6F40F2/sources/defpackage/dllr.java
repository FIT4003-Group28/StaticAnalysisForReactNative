package defpackage;
/* compiled from: PG */
/* renamed from: dllr  reason: default package */
/* loaded from: classes6.dex */
public enum dllr implements dsrb {
    UNKNOWN_MAP_LAYER(0),
    DRIVING(1),
    SATELLITE(2);
    
    private final int d;

    dllr(int i) {
        this.d = i;
    }

    public static dllr b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DRIVING;
            }
            if (i == 2) {
                return SATELLITE;
            }
            return null;
        }
        return UNKNOWN_MAP_LAYER;
    }

    public static dsrd c() {
        return dllq.a;
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
