package defpackage;
/* compiled from: PG */
/* renamed from: dodx  reason: default package */
/* loaded from: classes6.dex */
public enum dodx implements dsrb {
    STARS_0_5(5),
    STARS_1(0),
    STARS_1_5(6),
    STARS_2(1),
    STARS_2_5(7),
    STARS_3(2),
    STARS_3_5(8),
    STARS_4(3),
    STARS_4_5(9),
    STARS_5(4);
    
    public final int k;

    dodx(int i) {
        this.k = i;
    }

    public static dodx b(int i) {
        switch (i) {
            case 0:
                return STARS_1;
            case 1:
                return STARS_2;
            case 2:
                return STARS_3;
            case 3:
                return STARS_4;
            case 4:
                return STARS_5;
            case 5:
                return STARS_0_5;
            case 6:
                return STARS_1_5;
            case 7:
                return STARS_2_5;
            case 8:
                return STARS_3_5;
            case 9:
                return STARS_4_5;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dodw.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
