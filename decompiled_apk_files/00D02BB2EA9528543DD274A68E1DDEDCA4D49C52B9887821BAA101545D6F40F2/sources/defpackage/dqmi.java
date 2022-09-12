package defpackage;
/* compiled from: PG */
/* renamed from: dqmi  reason: default package */
/* loaded from: classes6.dex */
public enum dqmi implements dsrb {
    UNKNOWN_RANKING_STRATEGY(0),
    LATEST(1),
    BEST(2);
    
    public final int d;

    dqmi(int i) {
        this.d = i;
    }

    public static dqmi b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LATEST;
            }
            if (i == 2) {
                return BEST;
            }
            return null;
        }
        return UNKNOWN_RANKING_STRATEGY;
    }

    public static dsrd c() {
        return dqmh.a;
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
