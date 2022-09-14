package defpackage;
/* compiled from: PG */
/* renamed from: dwnk  reason: default package */
/* loaded from: classes6.dex */
public enum dwnk implements dsrb {
    INCIDENT_ROAD_CLOSED(1),
    INCIDENT_ACCIDENT(2),
    INCIDENT_CONSTRUCTION(3),
    INCIDENT_SPEED_TRAP(4),
    INCIDENT_SPEED_CAMERA(5),
    INCIDENT_SUSPECTED_JAM(6),
    INCIDENT_SPEED_LIMIT(7),
    INCIDENT_SUSPECTED_CLOSURE(8),
    INCIDENT_LANE_CLOSURE(9),
    INCIDENT_STALLED_VEHICLE(10),
    INCIDENT_OBJECT_ON_ROAD(11),
    INCIDENT_JAM(16),
    INCIDENT_ICE(22),
    INCIDENT_SNOW(23),
    INCIDENT_FOG(24),
    INCIDENT_FLOOD(25),
    INCIDENT_CHECKPOINT(26),
    INCIDENT_OTHER(127);
    
    public final int s;

    dwnk(int i) {
        this.s = i;
    }

    public static dwnk b(int i) {
        if (i != 16) {
            if (i == 127) {
                return INCIDENT_OTHER;
            }
            switch (i) {
                case 1:
                    return INCIDENT_ROAD_CLOSED;
                case 2:
                    return INCIDENT_ACCIDENT;
                case 3:
                    return INCIDENT_CONSTRUCTION;
                case 4:
                    return INCIDENT_SPEED_TRAP;
                case 5:
                    return INCIDENT_SPEED_CAMERA;
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
                        case 26:
                            return INCIDENT_CHECKPOINT;
                        default:
                            return null;
                    }
            }
        }
        return INCIDENT_JAM;
    }

    public static dsrd c() {
        return dwnj.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
