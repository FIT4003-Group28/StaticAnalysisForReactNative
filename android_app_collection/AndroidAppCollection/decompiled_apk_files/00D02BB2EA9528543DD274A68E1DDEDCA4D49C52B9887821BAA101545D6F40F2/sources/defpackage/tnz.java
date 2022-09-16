package defpackage;
/* compiled from: PG */
/* renamed from: tnz  reason: default package */
/* loaded from: classes7.dex */
public enum tnz implements dsrb {
    DRIVE(0),
    TWO_WHEELER(1),
    BICYCLE(2),
    RAIL(3),
    TRAIN(4),
    TRAM(5),
    SUBWAY(6),
    BUS(7),
    FERRY(8),
    TAXI(9),
    BIKESHARING(10),
    FLY(11),
    WALK(12);
    
    public final int n;

    tnz(int i) {
        this.n = i;
    }

    public static tnz b(int i) {
        switch (i) {
            case 0:
                return DRIVE;
            case 1:
                return TWO_WHEELER;
            case 2:
                return BICYCLE;
            case 3:
                return RAIL;
            case 4:
                return TRAIN;
            case 5:
                return TRAM;
            case 6:
                return SUBWAY;
            case 7:
                return BUS;
            case 8:
                return FERRY;
            case 9:
                return TAXI;
            case 10:
                return BIKESHARING;
            case 11:
                return FLY;
            case 12:
                return WALK;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return tny.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
