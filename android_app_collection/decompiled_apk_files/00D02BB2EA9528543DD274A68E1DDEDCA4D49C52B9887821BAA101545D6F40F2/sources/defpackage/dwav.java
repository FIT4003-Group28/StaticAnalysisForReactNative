package defpackage;
/* compiled from: PG */
/* renamed from: dwav  reason: default package */
/* loaded from: classes6.dex */
public enum dwav implements dsrb {
    TRIP(1),
    PATH(2),
    STEP_GROUP(3),
    STEP(4);
    
    public final int e;

    dwav(int i) {
        this.e = i;
    }

    public static dwav b(int i) {
        if (i != 1) {
            if (i == 2) {
                return PATH;
            }
            if (i == 3) {
                return STEP_GROUP;
            }
            if (i == 4) {
                return STEP;
            }
            return null;
        }
        return TRIP;
    }

    public static dsrd c() {
        return dwau.a;
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
