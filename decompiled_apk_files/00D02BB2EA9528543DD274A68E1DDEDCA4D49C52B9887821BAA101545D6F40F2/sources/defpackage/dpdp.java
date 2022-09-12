package defpackage;
/* compiled from: PG */
/* renamed from: dpdp  reason: default package */
/* loaded from: classes6.dex */
public enum dpdp implements dsrb {
    TURN_UNKNOWN(0),
    TURN_SLIGHT(1),
    TURN_NORMAL(2),
    TURN_SHARP(3),
    TURN_KEEP(4),
    TURN_UTURN(5),
    TURN_STRAIGHT(6),
    TURN_MERGE(7),
    TURN_FORK(8);
    
    public final int j;

    dpdp(int i) {
        this.j = i;
    }

    public static dpdp b(int i) {
        switch (i) {
            case 0:
                return TURN_UNKNOWN;
            case 1:
                return TURN_SLIGHT;
            case 2:
                return TURN_NORMAL;
            case 3:
                return TURN_SHARP;
            case 4:
                return TURN_KEEP;
            case 5:
                return TURN_UTURN;
            case 6:
                return TURN_STRAIGHT;
            case 7:
                return TURN_MERGE;
            case 8:
                return TURN_FORK;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpdo.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
