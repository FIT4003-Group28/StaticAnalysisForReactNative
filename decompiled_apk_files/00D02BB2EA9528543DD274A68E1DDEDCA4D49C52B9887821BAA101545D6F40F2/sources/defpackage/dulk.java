package defpackage;
/* compiled from: PG */
/* renamed from: dulk  reason: default package */
/* loaded from: classes6.dex */
public enum dulk implements dsrb {
    INVALID_STYLE(0),
    VERTICAL_LIST(1),
    VERTICAL_LIST_NO_BACKGROUND_NO_MARGIN(2),
    VERTICAL_LIST_NO_MARGIN(3),
    HORIZONTAL_LIST_SCROLLABLE(4),
    EXPERIMENTAL_Z_STACKED_LIST(1000);
    
    public final int g;

    dulk(int i) {
        this.g = i;
    }

    public static dulk b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VERTICAL_LIST;
            }
            if (i == 2) {
                return VERTICAL_LIST_NO_BACKGROUND_NO_MARGIN;
            }
            if (i == 3) {
                return VERTICAL_LIST_NO_MARGIN;
            }
            if (i == 4) {
                return HORIZONTAL_LIST_SCROLLABLE;
            }
            if (i == 1000) {
                return EXPERIMENTAL_Z_STACKED_LIST;
            }
            return null;
        }
        return INVALID_STYLE;
    }

    public static dsrd c() {
        return dulj.a;
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
