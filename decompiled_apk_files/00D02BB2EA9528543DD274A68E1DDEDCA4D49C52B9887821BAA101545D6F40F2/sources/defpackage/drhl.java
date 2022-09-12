package defpackage;
/* compiled from: PG */
/* renamed from: drhl  reason: default package */
/* loaded from: classes6.dex */
public enum drhl implements dsrb {
    UNKNOWN_ATTRIBUTE_SOURCE(0),
    PREDICTED_BY_UGC(1),
    REALTIME_FROM_AGENCY(2),
    REALTIME_FROM_UGC(3),
    PREDICTED_BY_HULK(4),
    PREDICTED_BY_AGENCY_HISTORICAL_REALTIME(5);
    
    public final int g;

    drhl(int i) {
        this.g = i;
    }

    public static drhl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PREDICTED_BY_UGC;
            }
            if (i == 2) {
                return REALTIME_FROM_AGENCY;
            }
            if (i == 3) {
                return REALTIME_FROM_UGC;
            }
            if (i == 4) {
                return PREDICTED_BY_HULK;
            }
            if (i == 5) {
                return PREDICTED_BY_AGENCY_HISTORICAL_REALTIME;
            }
            return null;
        }
        return UNKNOWN_ATTRIBUTE_SOURCE;
    }

    public static dsrd c() {
        return drhk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
