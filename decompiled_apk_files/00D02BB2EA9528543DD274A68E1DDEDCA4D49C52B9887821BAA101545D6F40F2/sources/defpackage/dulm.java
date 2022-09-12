package defpackage;
/* compiled from: PG */
/* renamed from: dulm  reason: default package */
/* loaded from: classes6.dex */
public enum dulm implements dsrb {
    GENERIC_ITEM_DATA(1),
    TILED_ITEM_DATA(2),
    PLACE_ITEM_DATA(3),
    PROFILE_SUMMARY_ITEM_DATA(4),
    PROFILE_ACTIVITY_ITEM_DATA(5),
    DIRECTIONS_ITEM_DATA(6),
    NEARBY_STATION_ITEM_DATA(7),
    TRANSIT_TRIP_ITEM_DATA(8),
    HEADED_LIST_ITEM_DATA(9),
    LIST_GENERIC_ITEM_DATA(10),
    LIST_PLACE_ITEM_DATA(11),
    TRANSIT_ALERT_ITEM_DATA(12),
    TRANSIT_SCHEMATIC_MAP_ITEM_DATA(13),
    PHOTOS_ITEM_DATA(14),
    USER_FACTUAL_EDIT_ITEM_DATA(15),
    KNOWLEDGE_ENTITY_EDIT_ITEM_DATA(16),
    OFFERING_EDIT_ITEM_DATA(17);
    
    public final int r;

    dulm(int i) {
        this.r = i;
    }

    public static dulm b(int i) {
        switch (i) {
            case 1:
                return GENERIC_ITEM_DATA;
            case 2:
                return TILED_ITEM_DATA;
            case 3:
                return PLACE_ITEM_DATA;
            case 4:
                return PROFILE_SUMMARY_ITEM_DATA;
            case 5:
                return PROFILE_ACTIVITY_ITEM_DATA;
            case 6:
                return DIRECTIONS_ITEM_DATA;
            case 7:
                return NEARBY_STATION_ITEM_DATA;
            case 8:
                return TRANSIT_TRIP_ITEM_DATA;
            case 9:
                return HEADED_LIST_ITEM_DATA;
            case 10:
                return LIST_GENERIC_ITEM_DATA;
            case 11:
                return LIST_PLACE_ITEM_DATA;
            case 12:
                return TRANSIT_ALERT_ITEM_DATA;
            case 13:
                return TRANSIT_SCHEMATIC_MAP_ITEM_DATA;
            case 14:
                return PHOTOS_ITEM_DATA;
            case 15:
                return USER_FACTUAL_EDIT_ITEM_DATA;
            case 16:
                return KNOWLEDGE_ENTITY_EDIT_ITEM_DATA;
            case 17:
                return OFFERING_EDIT_ITEM_DATA;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dull.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
