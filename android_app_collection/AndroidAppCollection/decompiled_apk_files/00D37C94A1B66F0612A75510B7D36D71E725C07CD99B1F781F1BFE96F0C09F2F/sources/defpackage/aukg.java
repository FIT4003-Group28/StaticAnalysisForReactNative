package defpackage;
/* compiled from: PG */
/* renamed from: aukg  reason: default package */
/* loaded from: classes2.dex */
public enum aukg implements aopm {
    REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN(0),
    REACHABILITY_DETECTION_STRATEGY_TYPE_LOGGING(1),
    REACHABILITY_DETECTION_STRATEGY_TYPE_DELAYED(2),
    REACHABILITY_DETECTION_STRATEGY_TYPE_GEN204(3),
    REACHABILITY_DETECTION_STRATEGY_TYPE_ALWAYS_ON(4);
    
    public final int f;

    aukg(int i) {
        this.f = i;
    }

    public static aopo a() {
        return auii.k;
    }

    public static aukg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return REACHABILITY_DETECTION_STRATEGY_TYPE_LOGGING;
            }
            if (i == 2) {
                return REACHABILITY_DETECTION_STRATEGY_TYPE_DELAYED;
            }
            if (i == 3) {
                return REACHABILITY_DETECTION_STRATEGY_TYPE_GEN204;
            }
            if (i == 4) {
                return REACHABILITY_DETECTION_STRATEGY_TYPE_ALWAYS_ON;
            }
            return null;
        }
        return REACHABILITY_DETECTION_STRATEGY_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
