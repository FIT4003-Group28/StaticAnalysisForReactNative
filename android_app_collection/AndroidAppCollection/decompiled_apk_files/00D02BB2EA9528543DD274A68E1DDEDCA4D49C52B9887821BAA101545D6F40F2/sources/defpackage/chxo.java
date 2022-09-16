package defpackage;
/* compiled from: PG */
/* renamed from: chxo  reason: default package */
/* loaded from: classes4.dex */
public enum chxo implements dsrb {
    DEFAULT(0),
    RATING(1),
    REVIEW(2),
    PLACE_REOPEN(3),
    FACTUAL_MODERATION(4);
    
    public final int f;

    chxo(int i) {
        this.f = i;
    }

    public static chxo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RATING;
            }
            if (i == 2) {
                return REVIEW;
            }
            if (i == 3) {
                return PLACE_REOPEN;
            }
            if (i == 4) {
                return FACTUAL_MODERATION;
            }
            return null;
        }
        return DEFAULT;
    }

    public static dsrd c() {
        return chxn.a;
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
