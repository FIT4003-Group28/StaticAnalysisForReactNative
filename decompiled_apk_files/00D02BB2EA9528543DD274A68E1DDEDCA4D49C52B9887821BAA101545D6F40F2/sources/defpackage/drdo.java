package defpackage;
/* compiled from: PG */
/* renamed from: drdo  reason: default package */
/* loaded from: classes6.dex */
public enum drdo implements dsrb {
    UNKNOWN_TOPIC_TRAIT_TYPE(0),
    SENTIMENT_NEGATIVE(1),
    SENTIMENT_NEUTRAL(2),
    SENTIMENT_POSITIVE(3),
    TRENDING(4);
    
    private final int f;

    drdo(int i) {
        this.f = i;
    }

    public static drdo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SENTIMENT_NEGATIVE;
            }
            if (i == 2) {
                return SENTIMENT_NEUTRAL;
            }
            if (i == 3) {
                return SENTIMENT_POSITIVE;
            }
            if (i == 4) {
                return TRENDING;
            }
            return null;
        }
        return UNKNOWN_TOPIC_TRAIT_TYPE;
    }

    public static dsrd c() {
        return drdn.a;
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
