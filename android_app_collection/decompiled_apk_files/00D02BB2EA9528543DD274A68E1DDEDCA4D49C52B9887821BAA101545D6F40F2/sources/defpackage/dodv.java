package defpackage;
/* compiled from: PG */
/* renamed from: dodv  reason: default package */
/* loaded from: classes6.dex */
public enum dodv implements dsrb {
    PRICE_LEVEL_1(0),
    PRICE_LEVEL_2(1),
    PRICE_LEVEL_3(2),
    PRICE_LEVEL_4(3);
    
    public final int e;

    dodv(int i) {
        this.e = i;
    }

    public static dodv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRICE_LEVEL_2;
            }
            if (i == 2) {
                return PRICE_LEVEL_3;
            }
            if (i == 3) {
                return PRICE_LEVEL_4;
            }
            return null;
        }
        return PRICE_LEVEL_1;
    }

    public static dsrd c() {
        return dodu.a;
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
