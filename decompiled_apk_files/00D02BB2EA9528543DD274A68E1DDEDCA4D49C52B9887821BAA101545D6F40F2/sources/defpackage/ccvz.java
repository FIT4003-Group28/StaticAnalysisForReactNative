package defpackage;
/* compiled from: PG */
/* renamed from: ccvz  reason: default package */
/* loaded from: classes4.dex */
public enum ccvz implements dsrb {
    UNKNOWN(0),
    OFFERING_NAME(1),
    OFFERING_RECOMMENDATION(2),
    OFFERING_PRICE(3),
    OFFERING_NAME_WITH_SUGGEST(4);
    
    public final int f;

    ccvz(int i) {
        this.f = i;
    }

    public static ccvz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFERING_NAME;
            }
            if (i == 2) {
                return OFFERING_RECOMMENDATION;
            }
            if (i == 3) {
                return OFFERING_PRICE;
            }
            if (i == 4) {
                return OFFERING_NAME_WITH_SUGGEST;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return ccvy.a;
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
