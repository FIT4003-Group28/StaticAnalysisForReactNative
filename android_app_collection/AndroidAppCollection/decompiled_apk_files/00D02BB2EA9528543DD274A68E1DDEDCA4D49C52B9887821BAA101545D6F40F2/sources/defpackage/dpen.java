package defpackage;
/* compiled from: PG */
/* renamed from: dpen  reason: default package */
/* loaded from: classes6.dex */
public enum dpen implements dsrb {
    UNKNOWN_STYLE(0),
    SLOWER_TRAFFIC(1),
    TRAFFIC_JAM(2);
    
    public final int d;

    dpen(int i) {
        this.d = i;
    }

    public static dpen b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SLOWER_TRAFFIC;
            }
            if (i == 2) {
                return TRAFFIC_JAM;
            }
            return null;
        }
        return UNKNOWN_STYLE;
    }

    public static dsrd c() {
        return dpem.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
