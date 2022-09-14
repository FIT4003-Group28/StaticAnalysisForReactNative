package defpackage;
/* compiled from: PG */
/* renamed from: dpfe  reason: default package */
/* loaded from: classes6.dex */
public enum dpfe implements dsrb {
    DEFAULT_NONE(0),
    DING_DAH(6),
    DING_DEE(7),
    DING_DONG(8),
    DRING_DRING(9),
    TAH_LAH_LAH(10),
    TOO_LOO(11),
    DEPRECATED_BUM_DEE_DOO(1),
    DEPRECATED_TICKLE_TICKLE(2),
    DEPRECATED_DAH_DOO_DEE(3),
    DEPRECATED_BA_BONK(4),
    DEPRECATED_TWIDDLE(5);
    
    private final int m;

    dpfe(int i) {
        this.m = i;
    }

    public static dpfe b(int i) {
        switch (i) {
            case 0:
                return DEFAULT_NONE;
            case 1:
                return DEPRECATED_BUM_DEE_DOO;
            case 2:
                return DEPRECATED_TICKLE_TICKLE;
            case 3:
                return DEPRECATED_DAH_DOO_DEE;
            case 4:
                return DEPRECATED_BA_BONK;
            case 5:
                return DEPRECATED_TWIDDLE;
            case 6:
                return DING_DAH;
            case 7:
                return DING_DEE;
            case 8:
                return DING_DONG;
            case 9:
                return DRING_DRING;
            case 10:
                return TAH_LAH_LAH;
            case 11:
                return TOO_LOO;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dpfd.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
