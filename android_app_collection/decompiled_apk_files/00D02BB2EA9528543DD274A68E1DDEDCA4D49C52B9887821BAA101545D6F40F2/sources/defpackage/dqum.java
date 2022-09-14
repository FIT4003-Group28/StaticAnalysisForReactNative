package defpackage;
/* compiled from: PG */
/* renamed from: dqum  reason: default package */
/* loaded from: classes6.dex */
public enum dqum implements dsrb {
    REROUTE_TYPE_BETTER_ETA(1),
    REROUTE_TYPE_AVOIDS_CLOSURE(2),
    REROUTE_TYPE_AVOIDS_VEHICLE_RESTRICTION(3),
    REROUTE_TYPE_AVOIDS_DYNAMIC_CLOSURE(4);
    
    public final int e;

    dqum(int i) {
        this.e = i;
    }

    public static dqum b(int i) {
        if (i != 1) {
            if (i == 2) {
                return REROUTE_TYPE_AVOIDS_CLOSURE;
            }
            if (i == 3) {
                return REROUTE_TYPE_AVOIDS_VEHICLE_RESTRICTION;
            }
            if (i == 4) {
                return REROUTE_TYPE_AVOIDS_DYNAMIC_CLOSURE;
            }
            return null;
        }
        return REROUTE_TYPE_BETTER_ETA;
    }

    public static dsrd c() {
        return dqul.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
