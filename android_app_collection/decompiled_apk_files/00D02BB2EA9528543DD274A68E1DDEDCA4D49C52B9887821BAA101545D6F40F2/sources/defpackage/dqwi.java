package defpackage;
/* compiled from: PG */
/* renamed from: dqwi  reason: default package */
/* loaded from: classes6.dex */
public enum dqwi implements dsrb {
    UNKNOWN_ATTRIBUTE_TYPE(0),
    ROOMS(1),
    BEDS(2),
    POOL(3),
    SERVICE(4),
    LOCATION(5),
    FITNESS_CENTER(6),
    FOOD(7);
    
    public final int i;

    dqwi(int i) {
        this.i = i;
    }

    public static dqwi b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ATTRIBUTE_TYPE;
            case 1:
                return ROOMS;
            case 2:
                return BEDS;
            case 3:
                return POOL;
            case 4:
                return SERVICE;
            case 5:
                return LOCATION;
            case 6:
                return FITNESS_CENTER;
            case 7:
                return FOOD;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dqwh.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
