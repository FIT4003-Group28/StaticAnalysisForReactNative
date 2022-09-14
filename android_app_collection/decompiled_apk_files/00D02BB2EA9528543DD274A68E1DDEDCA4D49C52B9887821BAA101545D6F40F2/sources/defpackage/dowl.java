package defpackage;
/* compiled from: PG */
/* renamed from: dowl  reason: default package */
/* loaded from: classes6.dex */
public enum dowl implements dsrb {
    UNKNOWN_LICENSE_PLATE_TYPE(0),
    UNSET(1),
    JAKARTA_ODD(2),
    JAKARTA_EVEN(3),
    SAO_PAULO_RODIZIO_1_2(4),
    SAO_PAULO_RODIZIO_3_4(5),
    SAO_PAULO_RODIZIO_5_6(6),
    SAO_PAULO_RODIZIO_7_8(7),
    SAO_PAULO_RODIZIO_9_0(8),
    MANILA_NUMBER_CODING_1_2(9),
    MANILA_NUMBER_CODING_3_4(10),
    MANILA_NUMBER_CODING_5_6(11),
    MANILA_NUMBER_CODING_7_8(12),
    MANILA_NUMBER_CODING_9_0(13),
    SANTIAGO_SELLO_VERDE_0_1(14),
    SANTIAGO_SELLO_VERDE_2_3(15),
    SANTIAGO_SELLO_VERDE_4_5(16),
    SANTIAGO_SELLO_VERDE_6_7(17),
    SANTIAGO_SELLO_VERDE_8_9(18);
    
    public final int t;

    dowl(int i) {
        this.t = i;
    }

    public static dowl b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LICENSE_PLATE_TYPE;
            case 1:
                return UNSET;
            case 2:
                return JAKARTA_ODD;
            case 3:
                return JAKARTA_EVEN;
            case 4:
                return SAO_PAULO_RODIZIO_1_2;
            case 5:
                return SAO_PAULO_RODIZIO_3_4;
            case 6:
                return SAO_PAULO_RODIZIO_5_6;
            case 7:
                return SAO_PAULO_RODIZIO_7_8;
            case 8:
                return SAO_PAULO_RODIZIO_9_0;
            case 9:
                return MANILA_NUMBER_CODING_1_2;
            case 10:
                return MANILA_NUMBER_CODING_3_4;
            case 11:
                return MANILA_NUMBER_CODING_5_6;
            case 12:
                return MANILA_NUMBER_CODING_7_8;
            case 13:
                return MANILA_NUMBER_CODING_9_0;
            case 14:
                return SANTIAGO_SELLO_VERDE_0_1;
            case 15:
                return SANTIAGO_SELLO_VERDE_2_3;
            case 16:
                return SANTIAGO_SELLO_VERDE_4_5;
            case 17:
                return SANTIAGO_SELLO_VERDE_6_7;
            case 18:
                return SANTIAGO_SELLO_VERDE_8_9;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dowk.a;
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
