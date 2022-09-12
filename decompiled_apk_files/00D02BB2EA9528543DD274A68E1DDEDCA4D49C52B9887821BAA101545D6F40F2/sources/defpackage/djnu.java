package defpackage;
/* compiled from: PG */
/* renamed from: djnu  reason: default package */
/* loaded from: classes6.dex */
public enum djnu implements dsrb {
    UNKNOWN_NUMERIC_RATING(0),
    RATING_0_5(1),
    RATING_1_0(2),
    RATING_1_5(3),
    RATING_2_0(4),
    RATING_2_5(5),
    RATING_3_0(6),
    RATING_3_5(7),
    RATING_4_0(8),
    RATING_4_5(9),
    RATING_5_0(10);
    
    public final int l;

    djnu(int i) {
        this.l = i;
    }

    public static djnu b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_NUMERIC_RATING;
            case 1:
                return RATING_0_5;
            case 2:
                return RATING_1_0;
            case 3:
                return RATING_1_5;
            case 4:
                return RATING_2_0;
            case 5:
                return RATING_2_5;
            case 6:
                return RATING_3_0;
            case 7:
                return RATING_3_5;
            case 8:
                return RATING_4_0;
            case 9:
                return RATING_4_5;
            case 10:
                return RATING_5_0;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return djnt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
