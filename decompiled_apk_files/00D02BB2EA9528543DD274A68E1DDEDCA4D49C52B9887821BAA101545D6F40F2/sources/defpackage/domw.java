package defpackage;
/* compiled from: PG */
/* renamed from: domw  reason: default package */
/* loaded from: classes6.dex */
public enum domw implements dsrb {
    UNKNOWN_COMMUTE_TIME_MIXING_POLICY(0),
    USE_ONLY_FREQUENT_TRIPS(1),
    COMBINE_FREQUENT_TRIPS_WITH_LOCATION_HISTORY(2);
    
    public final int d;

    domw(int i) {
        this.d = i;
    }

    public static domw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return USE_ONLY_FREQUENT_TRIPS;
            }
            if (i == 2) {
                return COMBINE_FREQUENT_TRIPS_WITH_LOCATION_HISTORY;
            }
            return null;
        }
        return UNKNOWN_COMMUTE_TIME_MIXING_POLICY;
    }

    public static dsrd c() {
        return domv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
