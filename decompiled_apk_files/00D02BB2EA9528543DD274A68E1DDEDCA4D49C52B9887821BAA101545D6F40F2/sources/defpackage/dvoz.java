package defpackage;
/* compiled from: PG */
/* renamed from: dvoz  reason: default package */
/* loaded from: classes6.dex */
public enum dvoz implements dsrb {
    UNKNOWN_RELEASE_LEVEL(0),
    DEV(100),
    FISHFOOD(200),
    DOGFOOD(cpnx.a),
    PREVIEW(400),
    RELEASE(500);
    
    public final int g;

    dvoz(int i) {
        this.g = i;
    }

    public static dvoz b(int i) {
        if (i != 0) {
            if (i == 100) {
                return DEV;
            }
            if (i == 200) {
                return FISHFOOD;
            }
            if (i == 300) {
                return DOGFOOD;
            }
            if (i == 400) {
                return PREVIEW;
            }
            if (i == 500) {
                return RELEASE;
            }
            return null;
        }
        return UNKNOWN_RELEASE_LEVEL;
    }

    public static dsrd c() {
        return dvoy.a;
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
