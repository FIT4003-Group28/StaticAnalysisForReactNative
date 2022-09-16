package defpackage;
/* compiled from: PG */
/* renamed from: dpqj  reason: default package */
/* loaded from: classes6.dex */
public enum dpqj implements dsrb {
    UNKNOWN_ENTITY_LIST_NAMESPACE(0),
    UNIVERSAL_ENTITY_LIST(1),
    SOCIAL_PLANNING_ENTITY_LIST(2),
    LOCAL_PERSONALIZATION(6),
    TEST_ONLY(7),
    LOCAL_FOLLOWING(8),
    EVERYDAY_TRIPS(9),
    TRANSIT(10),
    LOCAL_DEAL(11);
    
    public final int j;

    dpqj(int i) {
        this.j = i;
    }

    public static dpqj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UNIVERSAL_ENTITY_LIST;
            }
            if (i == 2) {
                return SOCIAL_PLANNING_ENTITY_LIST;
            }
            switch (i) {
                case 6:
                    return LOCAL_PERSONALIZATION;
                case 7:
                    return TEST_ONLY;
                case 8:
                    return LOCAL_FOLLOWING;
                case 9:
                    return EVERYDAY_TRIPS;
                case 10:
                    return TRANSIT;
                case 11:
                    return LOCAL_DEAL;
                default:
                    return null;
            }
        }
        return UNKNOWN_ENTITY_LIST_NAMESPACE;
    }

    public static dsrd c() {
        return dpqi.a;
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
