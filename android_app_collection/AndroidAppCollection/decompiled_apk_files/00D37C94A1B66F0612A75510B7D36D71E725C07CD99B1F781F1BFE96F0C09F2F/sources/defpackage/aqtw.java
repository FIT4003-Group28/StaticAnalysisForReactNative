package defpackage;
/* compiled from: PG */
/* renamed from: aqtw  reason: default package */
/* loaded from: classes2.dex */
public enum aqtw implements aopm {
    EMBEDS_AD_BREAK_TYPE_UNKNOWN(0),
    EMBEDS_AD_BREAK_TYPE_PRE_ROLL(1),
    EMBEDS_AD_BREAK_TYPE_MID_ROLL(2),
    EMBEDS_AD_BREAK_TYPE_POST_ROLL(3);
    
    public final int e;

    aqtw(int i) {
        this.e = i;
    }

    public static aopo a() {
        return aqov.m;
    }

    public static aqtw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EMBEDS_AD_BREAK_TYPE_PRE_ROLL;
            }
            if (i == 2) {
                return EMBEDS_AD_BREAK_TYPE_MID_ROLL;
            }
            if (i == 3) {
                return EMBEDS_AD_BREAK_TYPE_POST_ROLL;
            }
            return null;
        }
        return EMBEDS_AD_BREAK_TYPE_UNKNOWN;
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
