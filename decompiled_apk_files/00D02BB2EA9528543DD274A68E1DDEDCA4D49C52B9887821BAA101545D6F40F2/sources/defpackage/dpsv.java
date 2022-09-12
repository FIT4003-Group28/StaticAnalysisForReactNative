package defpackage;
/* compiled from: PG */
/* renamed from: dpsv  reason: default package */
/* loaded from: classes.dex */
public enum dpsv implements dsrb {
    UNKNOWN_VERTICAL(0),
    DINING(1),
    FUN(2),
    SHOPPING(3),
    SERVICES(4),
    DISCOVERY(5),
    HOTELS(6),
    SHOWTIMES(7);
    
    public final int i;

    dpsv(int i) {
        this.i = i;
    }

    public static dpsv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_VERTICAL;
            case 1:
                return DINING;
            case 2:
                return FUN;
            case 3:
                return SHOPPING;
            case 4:
                return SERVICES;
            case 5:
                return DISCOVERY;
            case 6:
                return HOTELS;
            case 7:
                return SHOWTIMES;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpsu.a;
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
