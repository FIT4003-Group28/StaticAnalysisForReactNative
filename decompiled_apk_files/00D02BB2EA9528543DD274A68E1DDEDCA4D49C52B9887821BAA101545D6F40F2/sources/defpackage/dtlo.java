package defpackage;
/* compiled from: PG */
/* renamed from: dtlo  reason: default package */
/* loaded from: classes6.dex */
public enum dtlo implements dsrb {
    INVALID_PAGE(0),
    MAPS_ACTIVITIES_SUMMARY_PAGE(1),
    TODO_LIST_PAGE(2),
    VIEW_ALL_ALIASES_PAGE(3),
    VISITED_PLACES_LIST_PAGE(4),
    VIEW_ALL_SAVED_PLACES_PAGE(5);
    
    private final int g;

    dtlo(int i) {
        this.g = i;
    }

    public static dtlo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MAPS_ACTIVITIES_SUMMARY_PAGE;
            }
            if (i == 2) {
                return TODO_LIST_PAGE;
            }
            if (i == 3) {
                return VIEW_ALL_ALIASES_PAGE;
            }
            if (i == 4) {
                return VISITED_PLACES_LIST_PAGE;
            }
            if (i == 5) {
                return VIEW_ALL_SAVED_PLACES_PAGE;
            }
            return null;
        }
        return INVALID_PAGE;
    }

    public static dsrd c() {
        return dtln.a;
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
