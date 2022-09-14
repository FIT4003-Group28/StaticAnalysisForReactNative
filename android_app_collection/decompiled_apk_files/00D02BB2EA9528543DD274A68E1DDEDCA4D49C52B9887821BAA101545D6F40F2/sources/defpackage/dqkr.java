package defpackage;
/* compiled from: PG */
/* renamed from: dqkr  reason: default package */
/* loaded from: classes6.dex */
public enum dqkr implements dsrb {
    UNKNOWN_INCIDENT_TYPE(0),
    INCIDENT_ROAD_CLOSED(1),
    INCIDENT_CRASH(2),
    INCIDENT_CONSTRUCTION(3),
    INCIDENT_FIXED_CAMERA(4),
    INCIDENT_MOBILE_CAMERA(5),
    INCIDENT_SUSPECTED_JAM(6),
    INCIDENT_SPEED_LIMIT(7),
    INCIDENT_SUSPECTED_CLOSURE(8),
    INCIDENT_LANE_CLOSURE(9),
    INCIDENT_STALLED_VEHICLE(10),
    INCIDENT_OBJECT_ON_ROAD(11),
    INCIDENT_ICE(22),
    INCIDENT_SNOW(23),
    INCIDENT_FOG(24),
    INCIDENT_FLOOD(25);
    
    public final int q;

    dqkr(int i) {
        this.q = i;
    }

    public static dqkr b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_INCIDENT_TYPE;
            case 1:
                return INCIDENT_ROAD_CLOSED;
            case 2:
                return INCIDENT_CRASH;
            case 3:
                return INCIDENT_CONSTRUCTION;
            case 4:
                return INCIDENT_FIXED_CAMERA;
            case 5:
                return INCIDENT_MOBILE_CAMERA;
            case 6:
                return INCIDENT_SUSPECTED_JAM;
            case 7:
                return INCIDENT_SPEED_LIMIT;
            case 8:
                return INCIDENT_SUSPECTED_CLOSURE;
            case 9:
                return INCIDENT_LANE_CLOSURE;
            case 10:
                return INCIDENT_STALLED_VEHICLE;
            case 11:
                return INCIDENT_OBJECT_ON_ROAD;
            default:
                switch (i) {
                    case 22:
                        return INCIDENT_ICE;
                    case 23:
                        return INCIDENT_SNOW;
                    case 24:
                        return INCIDENT_FOG;
                    case 25:
                        return INCIDENT_FLOOD;
                    default:
                        return null;
                }
        }
    }

    public static dsrd c() {
        return dqkq.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
