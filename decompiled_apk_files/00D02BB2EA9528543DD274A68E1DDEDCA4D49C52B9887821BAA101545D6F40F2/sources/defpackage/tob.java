package defpackage;
/* compiled from: PG */
/* renamed from: tob  reason: default package */
/* loaded from: classes7.dex */
public enum tob implements dsrb {
    AVOID_TOLLS(0),
    AVOID_HIGHWAYS(1),
    AVOID_FERRIES(2),
    WHEELCHAIR_ACCESSIBLE(3);
    
    public final int e;

    tob(int i) {
        this.e = i;
    }

    public static tob b(int i) {
        if (i != 0) {
            if (i == 1) {
                return AVOID_HIGHWAYS;
            }
            if (i == 2) {
                return AVOID_FERRIES;
            }
            if (i == 3) {
                return WHEELCHAIR_ACCESSIBLE;
            }
            return null;
        }
        return AVOID_TOLLS;
    }

    public static dsrd c() {
        return toa.a;
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
