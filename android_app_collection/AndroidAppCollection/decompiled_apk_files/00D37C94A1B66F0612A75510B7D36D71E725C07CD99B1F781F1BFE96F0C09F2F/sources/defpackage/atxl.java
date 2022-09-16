package defpackage;
/* compiled from: PG */
/* renamed from: atxl  reason: default package */
/* loaded from: classes2.dex */
public enum atxl implements aopm {
    PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN(0),
    PIVOT_BAR_NAVIGATION_TYPE_SELECT_TAB(1),
    PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB(2);
    
    private final int e;

    atxl(int i) {
        this.e = i;
    }

    public static aopo a() {
        return atti.k;
    }

    public static atxl b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PIVOT_BAR_NAVIGATION_TYPE_SELECT_TAB;
            }
            if (i == 2) {
                return PIVOT_BAR_NAVIGATION_TYPE_UNSELECTABLE_TAB;
            }
            return null;
        }
        return PIVOT_BAR_NAVIGATION_TYPE_UNKNOWN;
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
