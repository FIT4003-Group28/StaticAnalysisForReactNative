package defpackage;
/* compiled from: PG */
/* renamed from: dpbw  reason: default package */
/* loaded from: classes6.dex */
public enum dpbw implements dsrb {
    UNKNOWN(0),
    ON_TIME(1),
    EARLY(2),
    LATE(3),
    REALTIME_ONLY(4);
    
    public final int f;

    dpbw(int i) {
        this.f = i;
    }

    public static dpbw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ON_TIME;
            }
            if (i == 2) {
                return EARLY;
            }
            if (i == 3) {
                return LATE;
            }
            if (i == 4) {
                return REALTIME_ONLY;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dpbv.a;
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
