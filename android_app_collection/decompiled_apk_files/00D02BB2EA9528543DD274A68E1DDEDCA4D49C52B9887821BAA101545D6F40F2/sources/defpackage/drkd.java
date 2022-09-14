package defpackage;
/* compiled from: PG */
/* renamed from: drkd  reason: default package */
/* loaded from: classes6.dex */
public enum drkd implements dsrb {
    UNKNOWN_TRANSPORTATION_TYPE(0),
    TRAIN(1),
    BUS(2),
    TAXI(3),
    FERRY(4);
    
    private final int f;

    drkd(int i) {
        this.f = i;
    }

    public static drkd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRAIN;
            }
            if (i == 2) {
                return BUS;
            }
            if (i == 3) {
                return TAXI;
            }
            if (i == 4) {
                return FERRY;
            }
            return null;
        }
        return UNKNOWN_TRANSPORTATION_TYPE;
    }

    public static dsrd c() {
        return drkc.a;
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
