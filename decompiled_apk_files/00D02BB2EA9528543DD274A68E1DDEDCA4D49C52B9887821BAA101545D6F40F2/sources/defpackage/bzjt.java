package defpackage;
/* compiled from: PG */
/* renamed from: bzjt  reason: default package */
/* loaded from: classes4.dex */
public enum bzjt implements dsrb {
    UNKNOWN_VEHICLE_TYPE(0),
    BUS(1),
    TRAIN(2),
    SUBWAY(3),
    FERRY(4);
    
    public final int f;

    bzjt(int i) {
        this.f = i;
    }

    public static bzjt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return BUS;
            }
            if (i == 2) {
                return TRAIN;
            }
            if (i == 3) {
                return SUBWAY;
            }
            if (i == 4) {
                return FERRY;
            }
            return null;
        }
        return UNKNOWN_VEHICLE_TYPE;
    }

    public static dsrd c() {
        return bzjs.a;
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
