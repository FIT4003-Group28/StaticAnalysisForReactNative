package defpackage;
/* compiled from: PG */
/* renamed from: bzlx  reason: default package */
/* loaded from: classes4.dex */
public final class bzlx {
    public static boolean a(int i, int i2) {
        while (decr.b(i, i2) < 0) {
            i2 >>>= 4;
        }
        return i == i2;
    }

    public static dqvh b(dgsn dgsnVar) {
        if (dgsnVar.equals(dgsn.VEHICLE_TYPE_RAIL)) {
            return dqvh.TRANSIT_VEHICLE_TYPE_RAIL;
        }
        if (c(dgsn.VEHICLE_TYPE_RAIL, dgsnVar)) {
            if (c(dgsn.VEHICLE_TYPE_TRAM, dgsnVar)) {
                return dqvh.TRANSIT_VEHICLE_TYPE_TRAM;
            }
            if (c(dgsn.VEHICLE_TYPE_SUBWAY, dgsnVar)) {
                return dqvh.TRANSIT_VEHICLE_TYPE_SUBWAY;
            }
            return dqvh.TRANSIT_VEHICLE_TYPE_TRAIN;
        } else if (c(dgsn.VEHICLE_TYPE_BUS, dgsnVar)) {
            return dqvh.TRANSIT_VEHICLE_TYPE_BUS;
        } else {
            if (c(dgsn.VEHICLE_TYPE_FERRY, dgsnVar)) {
                return dqvh.TRANSIT_VEHICLE_TYPE_FERRY;
            }
            return dqvh.TRANSIT_VEHICLE_TYPE_UNKNOWN;
        }
    }

    private static boolean c(dgsn dgsnVar, dgsn dgsnVar2) {
        return a(dgsnVar.v, dgsnVar2.v);
    }
}
