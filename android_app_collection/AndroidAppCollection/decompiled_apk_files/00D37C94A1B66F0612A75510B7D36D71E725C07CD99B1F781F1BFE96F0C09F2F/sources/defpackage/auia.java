package defpackage;
/* compiled from: PG */
/* renamed from: auia  reason: default package */
/* loaded from: classes2.dex */
public enum auia implements aopm {
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN(0),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP(1),
    PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD(3);
    
    private final int e;

    auia(int i) {
        this.e = i;
    }

    public static aopo a() {
        return auca.s;
    }

    public static auia b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_NOOP;
            }
            if (i == 3) {
                return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_OPEN_AD;
            }
            return null;
        }
        return PROMOTED_SPARKLES_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
