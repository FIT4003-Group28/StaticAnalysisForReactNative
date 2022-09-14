package defpackage;
/* compiled from: PG */
/* renamed from: dwku  reason: default package */
/* loaded from: classes6.dex */
public enum dwku implements dsrb {
    UNKNOWN_COMPONENT(0),
    TODO_LIST_ITEM(1),
    PHOTO_ENTRY_POINT(2),
    UGC_TASK_SET(3),
    CONTRIBUTIONS_SHORTCUT_PROMO(4),
    LOCATION_HISTORY_PROMO(5),
    RIDDLER_PROMO(6),
    ADD_EVENTS_PROMO(7),
    DEPRECATED_TODO_ITEM_BUNDLE(8),
    SERVICE_AREA_BUSINESS_PROMO(9),
    CREATOR_ZONE_ENTRY_POINT(10);
    
    public final int l;

    dwku(int i) {
        this.l = i;
    }

    public static dwku b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_COMPONENT;
            case 1:
                return TODO_LIST_ITEM;
            case 2:
                return PHOTO_ENTRY_POINT;
            case 3:
                return UGC_TASK_SET;
            case 4:
                return CONTRIBUTIONS_SHORTCUT_PROMO;
            case 5:
                return LOCATION_HISTORY_PROMO;
            case 6:
                return RIDDLER_PROMO;
            case 7:
                return ADD_EVENTS_PROMO;
            case 8:
                return DEPRECATED_TODO_ITEM_BUNDLE;
            case 9:
                return SERVICE_AREA_BUSINESS_PROMO;
            case 10:
                return CREATOR_ZONE_ENTRY_POINT;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dwkt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
