package defpackage;
/* compiled from: PG */
/* renamed from: dqfg  reason: default package */
/* loaded from: classes6.dex */
public enum dqfg implements dsrb {
    UNKNOWN_QUERY_INTENT_TYPE(0),
    OPENING_HOURS(1),
    FOOD_PICKUP(2),
    FOOD_DELIVERY(3),
    RESERVE_RESTAURANTS(4);
    
    private final int f;

    dqfg(int i) {
        this.f = i;
    }

    public static dqfg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OPENING_HOURS;
            }
            if (i == 2) {
                return FOOD_PICKUP;
            }
            if (i == 3) {
                return FOOD_DELIVERY;
            }
            if (i == 4) {
                return RESERVE_RESTAURANTS;
            }
            return null;
        }
        return UNKNOWN_QUERY_INTENT_TYPE;
    }

    public static dsrd c() {
        return dqff.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
