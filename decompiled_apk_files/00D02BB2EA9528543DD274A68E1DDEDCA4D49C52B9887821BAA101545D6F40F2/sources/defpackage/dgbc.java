package defpackage;
/* compiled from: PG */
/* renamed from: dgbc  reason: default package */
/* loaded from: classes6.dex */
public enum dgbc implements dsrb {
    UNKNOWN_ORDER_TYPE(0),
    DELIVERY(1),
    PICKUP(2);
    
    private final int d;

    dgbc(int i) {
        this.d = i;
    }

    public static dgbc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DELIVERY;
            }
            if (i == 2) {
                return PICKUP;
            }
            return null;
        }
        return UNKNOWN_ORDER_TYPE;
    }

    public static dsrd c() {
        return dgbb.a;
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
