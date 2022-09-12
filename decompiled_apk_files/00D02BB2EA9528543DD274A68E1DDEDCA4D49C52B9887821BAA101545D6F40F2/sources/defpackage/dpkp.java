package defpackage;
/* compiled from: PG */
/* renamed from: dpkp  reason: default package */
/* loaded from: classes6.dex */
public enum dpkp implements dsrb {
    UNKNOWN_LABEL_CONTENT_TYPE(0),
    GAS_PRICE(1),
    RATING(2);
    
    public final int d;

    dpkp(int i) {
        this.d = i;
    }

    public static dpkp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GAS_PRICE;
            }
            if (i == 2) {
                return RATING;
            }
            return null;
        }
        return UNKNOWN_LABEL_CONTENT_TYPE;
    }

    public static dsrd c() {
        return dpko.a;
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
