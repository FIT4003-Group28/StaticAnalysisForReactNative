package defpackage;
/* compiled from: PG */
/* renamed from: asuk  reason: default package */
/* loaded from: classes2.dex */
public enum asuk implements aopm {
    LIVE_ONLY_PEG_STRATEGY_UNKNOWN(0),
    LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG(1),
    LIVE_ONLY_PEG_STRATEGY_SEEK_ON_RESUME(3),
    LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION(6);
    
    private final int f;

    asuk(int i) {
        this.f = i;
    }

    public static aopo a() {
        return asut.b;
    }

    public static asuk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG;
            }
            if (i == 3) {
                return LIVE_ONLY_PEG_STRATEGY_SEEK_ON_RESUME;
            }
            if (i == 6) {
                return LIVE_ONLY_PEG_STRATEGY_SEEK_ON_REBUFFER_ESTIMATE_DURATION;
            }
            return null;
        }
        return LIVE_ONLY_PEG_STRATEGY_UNKNOWN;
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
