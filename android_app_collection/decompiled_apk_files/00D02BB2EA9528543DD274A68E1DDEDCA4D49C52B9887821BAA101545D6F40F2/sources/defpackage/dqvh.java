package defpackage;
/* compiled from: PG */
/* renamed from: dqvh  reason: default package */
/* loaded from: classes6.dex */
public enum dqvh implements dsrb {
    TRANSIT_VEHICLE_TYPE_UNKNOWN(0),
    TRANSIT_VEHICLE_TYPE_BUS(1),
    TRANSIT_VEHICLE_TYPE_RAIL(2),
    TRANSIT_VEHICLE_TYPE_SUBWAY(3),
    TRANSIT_VEHICLE_TYPE_TRAIN(4),
    TRANSIT_VEHICLE_TYPE_TRAM(5),
    TRANSIT_VEHICLE_TYPE_FERRY(6);
    
    public final int h;

    dqvh(int i2) {
        this.h = i2;
    }

    public static dqvh b(int i2) {
        switch (i2) {
            case 0:
                return TRANSIT_VEHICLE_TYPE_UNKNOWN;
            case 1:
                return TRANSIT_VEHICLE_TYPE_BUS;
            case 2:
                return TRANSIT_VEHICLE_TYPE_RAIL;
            case 3:
                return TRANSIT_VEHICLE_TYPE_SUBWAY;
            case 4:
                return TRANSIT_VEHICLE_TYPE_TRAIN;
            case 5:
                return TRANSIT_VEHICLE_TYPE_TRAM;
            case 6:
                return TRANSIT_VEHICLE_TYPE_FERRY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqvg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
