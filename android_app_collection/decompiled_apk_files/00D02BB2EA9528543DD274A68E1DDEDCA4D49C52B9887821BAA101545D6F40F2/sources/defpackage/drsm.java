package defpackage;
/* compiled from: PG */
/* renamed from: drsm  reason: default package */
/* loaded from: classes6.dex */
public enum drsm implements dsrb {
    UNSPECIFIED_NON_TRANSIT_MODE(0),
    WALK(1),
    DRIVE(2),
    OFFLINE_TAXI(3),
    TWO_WHEELER(4),
    ONLINE_TAXI(5),
    BICYCLE(6),
    DOCKLESS_BIKESHARING(7),
    DOCKED_BIKESHARING(8);
    
    public final int j;

    drsm(int i) {
        this.j = i;
    }

    public static drsm b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_NON_TRANSIT_MODE;
            case 1:
                return WALK;
            case 2:
                return DRIVE;
            case 3:
                return OFFLINE_TAXI;
            case 4:
                return TWO_WHEELER;
            case 5:
                return ONLINE_TAXI;
            case 6:
                return BICYCLE;
            case 7:
                return DOCKLESS_BIKESHARING;
            case 8:
                return DOCKED_BIKESHARING;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return drsl.a;
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
