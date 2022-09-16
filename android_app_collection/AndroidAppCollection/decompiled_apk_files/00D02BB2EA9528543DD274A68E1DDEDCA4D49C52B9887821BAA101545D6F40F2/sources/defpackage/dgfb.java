package defpackage;
/* compiled from: PG */
/* renamed from: dgfb  reason: default package */
/* loaded from: classes.dex */
public enum dgfb implements dsrb {
    UNKNOWN_OFFERING_TYPE(0),
    DISH(1),
    PRODUCT_CATEGORY(2),
    ACTIVITY(3),
    DEAL(4);
    
    public final int f;

    dgfb(int i) {
        this.f = i;
    }

    public static dgfb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return DISH;
            }
            if (i == 2) {
                return PRODUCT_CATEGORY;
            }
            if (i == 3) {
                return ACTIVITY;
            }
            if (i == 4) {
                return DEAL;
            }
            return null;
        }
        return UNKNOWN_OFFERING_TYPE;
    }

    public static dsrd c() {
        return dgfa.a;
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
