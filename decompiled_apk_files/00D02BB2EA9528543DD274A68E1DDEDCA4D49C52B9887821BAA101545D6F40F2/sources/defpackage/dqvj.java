package defpackage;
/* compiled from: PG */
/* renamed from: dqvj  reason: default package */
/* loaded from: classes.dex */
public enum dqvj implements dsrb {
    DRIVE(0),
    BICYCLE(1),
    WALK(2),
    TRANSIT(3),
    FLY(4),
    TWO_WHEELER(9),
    MIXED(6),
    TAXI(8),
    BIKESHARING(11),
    TAXICAB(10);
    
    public final int k;

    dqvj(int i) {
        this.k = i;
    }

    public static dqvj c(int i) {
        switch (i) {
            case 0:
                return DRIVE;
            case 1:
                return BICYCLE;
            case 2:
                return WALK;
            case 3:
                return TRANSIT;
            case 4:
                return FLY;
            case 5:
            case 7:
            default:
                return null;
            case 6:
                return MIXED;
            case 8:
                return TAXI;
            case 9:
                return TWO_WHEELER;
            case 10:
                return TAXICAB;
            case 11:
                return BIKESHARING;
        }
    }

    public static dsrd d() {
        return dqvi.a;
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
