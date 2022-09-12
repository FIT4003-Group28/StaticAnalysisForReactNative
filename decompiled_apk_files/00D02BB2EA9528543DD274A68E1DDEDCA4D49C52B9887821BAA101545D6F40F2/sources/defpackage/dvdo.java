package defpackage;
/* compiled from: PG */
/* renamed from: dvdo  reason: default package */
/* loaded from: classes.dex */
public enum dvdo implements dsrb {
    UNKNOWN_VIEW_MODE(0),
    FAR_VIEW_MODE(1),
    NORMAL(2),
    APPROACH(3),
    INSPECT_STEP(4),
    INSPECT_ROUTE(5);
    
    public final int g;

    dvdo(int i) {
        this.g = i;
    }

    public static dvdo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return FAR_VIEW_MODE;
            }
            if (i == 2) {
                return NORMAL;
            }
            if (i == 3) {
                return APPROACH;
            }
            if (i == 4) {
                return INSPECT_STEP;
            }
            if (i == 5) {
                return INSPECT_ROUTE;
            }
            return null;
        }
        return UNKNOWN_VIEW_MODE;
    }

    public static dsrd c() {
        return dvdn.a;
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
