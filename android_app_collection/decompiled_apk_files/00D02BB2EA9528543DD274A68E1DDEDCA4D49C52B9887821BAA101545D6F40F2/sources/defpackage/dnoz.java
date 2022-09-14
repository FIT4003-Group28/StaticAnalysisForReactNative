package defpackage;
/* compiled from: PG */
/* renamed from: dnoz  reason: default package */
/* loaded from: classes.dex */
public enum dnoz implements dsrb {
    UNKNOWN_PROVIDER(0),
    TRAFFICCAST(1),
    WAZE(2),
    TOMTOM(3),
    GT(4),
    USER_REPORT(16);
    
    private final int g;

    dnoz(int i) {
        this.g = i;
    }

    public static dnoz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRAFFICCAST;
            }
            if (i == 2) {
                return WAZE;
            }
            if (i == 3) {
                return TOMTOM;
            }
            if (i == 4) {
                return GT;
            }
            if (i == 16) {
                return USER_REPORT;
            }
            return null;
        }
        return UNKNOWN_PROVIDER;
    }

    public static dsrd c() {
        return dnoy.a;
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
