package defpackage;
/* compiled from: PG */
/* renamed from: djuu  reason: default package */
/* loaded from: classes6.dex */
public enum djuu implements dsrb {
    UNKNOWN_SORT_CRITERIA(0),
    NEWEST_FIRST(3),
    QUALITY_SCORE(6),
    STAR_RATING_HIGH_THEN_QUALITY(7),
    STAR_RATING_LOW_THEN_QUALITY(8);
    
    public final int f;

    djuu(int i) {
        this.f = i;
    }

    public static djuu b(int i) {
        if (i != 0) {
            if (i == 3) {
                return NEWEST_FIRST;
            }
            if (i == 6) {
                return QUALITY_SCORE;
            }
            if (i == 7) {
                return STAR_RATING_HIGH_THEN_QUALITY;
            }
            if (i == 8) {
                return STAR_RATING_LOW_THEN_QUALITY;
            }
            return null;
        }
        return UNKNOWN_SORT_CRITERIA;
    }

    public static dsrd c() {
        return djut.a;
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
