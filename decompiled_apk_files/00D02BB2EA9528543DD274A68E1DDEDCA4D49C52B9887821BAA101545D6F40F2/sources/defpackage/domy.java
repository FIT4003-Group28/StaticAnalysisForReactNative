package defpackage;
/* compiled from: PG */
/* renamed from: domy  reason: default package */
/* loaded from: classes6.dex */
public enum domy implements dsrb {
    UNKNOWN_TRAVEL_MODE(0),
    DRIVE(1),
    TRANSIT(2),
    WALKING(3),
    BIKING(4),
    TWO_WHEELER(5),
    MULTIMODAL(6);
    
    public final int h;

    domy(int i2) {
        this.h = i2;
    }

    public static domy b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN_TRAVEL_MODE;
            case 1:
                return DRIVE;
            case 2:
                return TRANSIT;
            case 3:
                return WALKING;
            case 4:
                return BIKING;
            case 5:
                return TWO_WHEELER;
            case 6:
                return MULTIMODAL;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return domx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
