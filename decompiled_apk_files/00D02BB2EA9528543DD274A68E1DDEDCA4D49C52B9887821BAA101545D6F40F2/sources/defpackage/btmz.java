package defpackage;
/* compiled from: PG */
/* renamed from: btmz  reason: default package */
/* loaded from: classes.dex */
public enum btmz {
    ALL_LRU("All Lru Caches", 0),
    CURVED_SEGMENTS("Curved Segments Cache", 1),
    INDOOR_ACTIVE_LEVELS("Indoor Active Levels Cache", 2),
    PERSONAL_LABEL_FACTORY("Personal Label Factory Cache", 3),
    STALE_TILE("Stale Tile Cache", 4),
    RECENTLY_UPDATED_TILE("Recently Updated Tile Cache", 5),
    FETCHED_VIEWPORT("Fetched Viewport Cache", 6),
    IN_MEMORY_TILE("In Memory Tile Cache", 7),
    SOFT_IN_MEMORY_TILE("Soft In Memory Tile Cache", 8),
    DASH_ALPHA("Dash Alpha Cache", 9),
    DASH_TEXTURE("Dash Texture Cache", 10),
    PERSONAL_PLACE_LABEL_GENERATOR("Personal Place Label Generator Cache", 11),
    SVG_PICTURE("Svg Picture Cache", 12),
    SVG_BITMAP("Svg Bitmap Cache", 13),
    ODELAY("Odelay Cache", 14),
    PREFETCH_UPGRADES("Prefetch Upgrades Cache", 15),
    INDOOR_METADATA("Indoor Metadata Cache", 16),
    INDOOR_BUILDING("Indoor Building Cache", 17),
    INDOOR_LEVEL("Indoor Level Cache", 18),
    RESOURCE_MANAGER_BITMAP("Resource Manager Bitmap Cache", 19),
    RESOURCE_MANAGER_RESOURCE("Resource Manager Resource Cache", 20),
    RESOURCE_MANAGER_SOFT_RESOURCE("Resource Manager Soft Resource Cache", 21),
    TRAFFIC_TO_PLACE_MINI_MAP_BITMAP("TrafficToPlace Mini-Map Cache", 23),
    IN_MEMORY_VMS_TILE("In Memory VmsTile Cache", 24),
    OTHER("Other Caches", 22);
    
    public final int A;
    public final String z;

    btmz(String str, int i) {
        this.z = str;
        this.A = i;
    }
}
