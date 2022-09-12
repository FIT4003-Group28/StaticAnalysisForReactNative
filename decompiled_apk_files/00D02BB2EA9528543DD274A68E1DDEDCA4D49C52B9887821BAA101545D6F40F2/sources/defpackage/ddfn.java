package defpackage;
/* compiled from: PG */
/* renamed from: ddfn  reason: default package */
/* loaded from: classes5.dex */
public enum ddfn implements dsrb {
    UNKNOWN(0),
    ASSISTIVE_SHORTCUTS(1),
    EXPLORE_TAB_HEADER(2),
    MORE_QUERIES_LEAF_PAGE(3),
    ZERO_SUGGEST_HEADER(4),
    EXPERIENCE(5),
    SHOPPING(6),
    NO_RESULTS_PAGE(7),
    PLACE_ASSISTIVE_SHORTCUTS(8),
    PLACE_SEARCH_NEARBY(9);
    
    public final int k;

    ddfn(int i) {
        this.k = i;
    }

    public static ddfn b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ASSISTIVE_SHORTCUTS;
            case 2:
                return EXPLORE_TAB_HEADER;
            case 3:
                return MORE_QUERIES_LEAF_PAGE;
            case 4:
                return ZERO_SUGGEST_HEADER;
            case 5:
                return EXPERIENCE;
            case 6:
                return SHOPPING;
            case 7:
                return NO_RESULTS_PAGE;
            case 8:
                return PLACE_ASSISTIVE_SHORTCUTS;
            case 9:
                return PLACE_SEARCH_NEARBY;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return ddfm.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
