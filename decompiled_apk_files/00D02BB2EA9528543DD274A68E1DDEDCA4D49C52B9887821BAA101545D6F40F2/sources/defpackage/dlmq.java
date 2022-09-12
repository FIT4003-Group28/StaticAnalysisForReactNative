package defpackage;
/* compiled from: PG */
/* renamed from: dlmq  reason: default package */
/* loaded from: classes6.dex */
public enum dlmq implements dsrb {
    UNKNOWN_ICON(0),
    VERY_HAPPY_FACE(1),
    HAPPY_FACE(2),
    NEUTRAL_FACE(3),
    SAD_FACE(4),
    VERY_SAD_FACE(5);
    
    public final int g;

    dlmq(int i) {
        this.g = i;
    }

    public static dlmq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VERY_HAPPY_FACE;
            }
            if (i == 2) {
                return HAPPY_FACE;
            }
            if (i == 3) {
                return NEUTRAL_FACE;
            }
            if (i == 4) {
                return SAD_FACE;
            }
            if (i == 5) {
                return VERY_SAD_FACE;
            }
            return null;
        }
        return UNKNOWN_ICON;
    }

    public static dsrd c() {
        return dlmp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
