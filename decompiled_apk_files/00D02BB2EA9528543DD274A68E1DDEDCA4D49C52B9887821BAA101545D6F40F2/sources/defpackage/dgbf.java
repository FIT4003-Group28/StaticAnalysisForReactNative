package defpackage;
/* compiled from: PG */
/* renamed from: dgbf  reason: default package */
/* loaded from: classes6.dex */
public enum dgbf implements dsrb {
    UNKNOWN_TYPE(0),
    DIESEL(1),
    REGULAR_UNLEADED(3),
    MIDGRADE(4),
    PREMIUM(5),
    SP91(6),
    SP91_E10(7),
    SP92(8),
    SP95(9),
    SP95_E10(10),
    SP98(11),
    SP99(12),
    SP100(13),
    LPG(14),
    E80(15),
    E85(16),
    METHANE(17),
    BIODIESEL(18),
    TRUCKDIESEL(19);
    
    private final int t;

    dgbf(int i) {
        this.t = i;
    }

    public static dgbf b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return DIESEL;
            case 2:
            default:
                return null;
            case 3:
                return REGULAR_UNLEADED;
            case 4:
                return MIDGRADE;
            case 5:
                return PREMIUM;
            case 6:
                return SP91;
            case 7:
                return SP91_E10;
            case 8:
                return SP92;
            case 9:
                return SP95;
            case 10:
                return SP95_E10;
            case 11:
                return SP98;
            case 12:
                return SP99;
            case 13:
                return SP100;
            case 14:
                return LPG;
            case 15:
                return E80;
            case 16:
                return E85;
            case 17:
                return METHANE;
            case 18:
                return BIODIESEL;
            case 19:
                return TRUCKDIESEL;
        }
    }

    public static dsrd c() {
        return dgbe.a;
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
