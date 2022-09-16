package defpackage;
/* compiled from: PG */
/* renamed from: dphv  reason: default package */
/* loaded from: classes6.dex */
public enum dphv implements dsrb {
    UNKNOWN_LICENSE_PLATE_RESTRICTION(0),
    NONE(1),
    EVEN_ONLY(2),
    ODD_ONLY(3),
    RODIZIO_1_2(4),
    RODIZIO_3_4(5),
    RODIZIO_5_6(6),
    RODIZIO_7_8(7),
    RODIZIO_9_0(8),
    MANILA_1_2(9),
    MANILA_3_4(10),
    MANILA_5_6(11),
    MANILA_7_8(12),
    MANILA_9_0(13),
    SANTIAGO_4_5(14),
    SANTIAGO_6_7(15),
    SANTIAGO_8_9(16),
    SANTIAGO_0_1(17),
    SANTIAGO_2_3(18);
    
    private final int t;

    dphv(int i) {
        this.t = i;
    }

    public static dphv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LICENSE_PLATE_RESTRICTION;
            case 1:
                return NONE;
            case 2:
                return EVEN_ONLY;
            case 3:
                return ODD_ONLY;
            case 4:
                return RODIZIO_1_2;
            case 5:
                return RODIZIO_3_4;
            case 6:
                return RODIZIO_5_6;
            case 7:
                return RODIZIO_7_8;
            case 8:
                return RODIZIO_9_0;
            case 9:
                return MANILA_1_2;
            case 10:
                return MANILA_3_4;
            case 11:
                return MANILA_5_6;
            case 12:
                return MANILA_7_8;
            case 13:
                return MANILA_9_0;
            case 14:
                return SANTIAGO_4_5;
            case 15:
                return SANTIAGO_6_7;
            case 16:
                return SANTIAGO_8_9;
            case 17:
                return SANTIAGO_0_1;
            case 18:
                return SANTIAGO_2_3;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dphu.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
