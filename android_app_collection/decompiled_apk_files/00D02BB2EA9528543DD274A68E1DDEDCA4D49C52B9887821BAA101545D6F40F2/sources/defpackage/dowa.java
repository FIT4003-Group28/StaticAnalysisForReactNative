package defpackage;
/* compiled from: PG */
/* renamed from: dowa  reason: default package */
/* loaded from: classes.dex */
public enum dowa implements dsrb {
    KILOMETERS(0),
    MILES(1),
    MILES_YARDS(3),
    REGIONAL(2);
    
    public final int e;

    dowa(int i) {
        this.e = i;
    }

    public static dowa b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MILES;
            }
            if (i == 2) {
                return REGIONAL;
            }
            if (i == 3) {
                return MILES_YARDS;
            }
            return null;
        }
        return KILOMETERS;
    }

    public static dsrd c() {
        return dovz.a;
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
