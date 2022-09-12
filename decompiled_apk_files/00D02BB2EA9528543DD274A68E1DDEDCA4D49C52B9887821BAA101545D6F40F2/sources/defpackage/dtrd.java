package defpackage;
/* compiled from: PG */
/* renamed from: dtrd  reason: default package */
/* loaded from: classes6.dex */
public enum dtrd implements dsrb {
    LIST_LAYOUT_COMPACT_ICON_VIEW(4),
    HIERARCHICAL_ICONS(7),
    IMAGE_URL_SCHEME_SIZE_REPLACEMENT(8),
    CACHE_BY_AGE(9),
    CACHE_BY_VIEWPORT_OVERLAP(10),
    SERVER_SIDE_SIGN_IN_PROMO(11),
    PREFETCH_ON_RENDER(12),
    RESTORE_VIEWPORT_ON_BACK(13),
    SHOW_BANNER_V1(14),
    SERVER_SIDE_MY_LOCATION(15),
    GUIDE_ENTRY_POINT_ON_MAP(16),
    GALLERY_LAYOUT(1),
    LOAD_ODELAY_ACTION(2),
    MODULE_FOOTER(3),
    CATEGORY_ICONS(5),
    DIRECTIONS_ACTION(6),
    ROVER_PAGE(17),
    EXPLORE_DOGFOOD(1000),
    NON_SEARCH_PLACE_COLLECTION_DOGFOOD(1001),
    TRANSIT_ONBOARD_DOGFOOD(1002),
    NEW_GUIDE_PAGE_STYLE(1003);
    
    public final int v;

    dtrd(int i) {
        this.v = i;
    }

    public static dtrd b(int i) {
        switch (i) {
            case 1:
                return GALLERY_LAYOUT;
            case 2:
                return LOAD_ODELAY_ACTION;
            case 3:
                return MODULE_FOOTER;
            case 4:
                return LIST_LAYOUT_COMPACT_ICON_VIEW;
            case 5:
                return CATEGORY_ICONS;
            case 6:
                return DIRECTIONS_ACTION;
            case 7:
                return HIERARCHICAL_ICONS;
            case 8:
                return IMAGE_URL_SCHEME_SIZE_REPLACEMENT;
            case 9:
                return CACHE_BY_AGE;
            case 10:
                return CACHE_BY_VIEWPORT_OVERLAP;
            case 11:
                return SERVER_SIDE_SIGN_IN_PROMO;
            case 12:
                return PREFETCH_ON_RENDER;
            case 13:
                return RESTORE_VIEWPORT_ON_BACK;
            case 14:
                return SHOW_BANNER_V1;
            case 15:
                return SERVER_SIDE_MY_LOCATION;
            case 16:
                return GUIDE_ENTRY_POINT_ON_MAP;
            case 17:
                return ROVER_PAGE;
            default:
                switch (i) {
                    case 1000:
                        return EXPLORE_DOGFOOD;
                    case 1001:
                        return NON_SEARCH_PLACE_COLLECTION_DOGFOOD;
                    case 1002:
                        return TRANSIT_ONBOARD_DOGFOOD;
                    case 1003:
                        return NEW_GUIDE_PAGE_STYLE;
                    default:
                        return null;
                }
        }
    }

    public static dsrd c() {
        return dtrc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
