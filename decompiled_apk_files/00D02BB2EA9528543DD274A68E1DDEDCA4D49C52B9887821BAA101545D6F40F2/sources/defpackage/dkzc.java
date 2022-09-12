package defpackage;
/* compiled from: PG */
/* renamed from: dkzc  reason: default package */
/* loaded from: classes6.dex */
public enum dkzc implements dsrb {
    UNKNOWN_FEEDBACK_TYPE(0),
    STAR_RATING(1),
    YOUR_TYPE_OF_PLACE(2);
    
    private final int d;

    dkzc(int i) {
        this.d = i;
    }

    public static dkzc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STAR_RATING;
            }
            if (i == 2) {
                return YOUR_TYPE_OF_PLACE;
            }
            return null;
        }
        return UNKNOWN_FEEDBACK_TYPE;
    }

    public static dsrd c() {
        return dkzb.a;
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
