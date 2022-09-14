package defpackage;
/* compiled from: PG */
/* renamed from: dxdh  reason: default package */
/* loaded from: classes6.dex */
public enum dxdh implements dsrb {
    INCLUDE_COPYRIGHTS(0),
    INCLUDE_CLICKABLE_AREAS(1),
    TILE_IN_LOCAL_LANGUAGE_ONLY(2),
    ONLY_RASTER_TILES_AND_LABELS(3),
    CHECK_PER_TILE(4),
    TACTILE_STYLE(5),
    INCLUDE_NON_TRANSIT_FULL_FEATURE_IDS(6),
    INCLUDE_FEATURE_MAPS(7),
    DISABLE_ZOOM_14_LEGACY_ROAD_WIDTHS(8),
    DISABLE_INDOOR_BLANKING(9),
    DISABLE_GEOMETRY_CLIPPING(10),
    USE_SERVER_LABEL_PLACEMENT(11),
    USE_IMPORTANCE_BASED_RASTERIZATION(12),
    USE_IMPORTANCE_BASED_RASTERIZATION_ON_ANDROID(16),
    USE_FULL_SPOTLIGHT(13),
    USE_DEBUG_SPOTLIGHT_PERSONALIZED_SMARTMAPS_STYLING(14),
    DISABLE_SPOTLIGHT_PERSONALIZED_SMARTMAPS_STARS(15),
    USE_LEGEND_STYLE_IDS(17),
    MULTIPLE_UWF_TILE_RESOLUTIONS(18),
    INCLUDE_ROAD_GRAPH_V2_METADATA(19),
    STRONG_TRANSIT_STYLING(20),
    USE_ALL_VECTOR(21),
    USE_SMART_TRAFFIC_LAYER(22),
    SUPPORTS_INLINE_LEGEND_STYLES(23),
    USE_THICK_TILES_AT_Z14(24),
    ENABLE_BUILDINGS_IN_NAVIGATION(25);
    
    public final int A;

    dxdh(int i) {
        this.A = i;
    }

    public static dxdh b(int i) {
        switch (i) {
            case 0:
                return INCLUDE_COPYRIGHTS;
            case 1:
                return INCLUDE_CLICKABLE_AREAS;
            case 2:
                return TILE_IN_LOCAL_LANGUAGE_ONLY;
            case 3:
                return ONLY_RASTER_TILES_AND_LABELS;
            case 4:
                return CHECK_PER_TILE;
            case 5:
                return TACTILE_STYLE;
            case 6:
                return INCLUDE_NON_TRANSIT_FULL_FEATURE_IDS;
            case 7:
                return INCLUDE_FEATURE_MAPS;
            case 8:
                return DISABLE_ZOOM_14_LEGACY_ROAD_WIDTHS;
            case 9:
                return DISABLE_INDOOR_BLANKING;
            case 10:
                return DISABLE_GEOMETRY_CLIPPING;
            case 11:
                return USE_SERVER_LABEL_PLACEMENT;
            case 12:
                return USE_IMPORTANCE_BASED_RASTERIZATION;
            case 13:
                return USE_FULL_SPOTLIGHT;
            case 14:
                return USE_DEBUG_SPOTLIGHT_PERSONALIZED_SMARTMAPS_STYLING;
            case 15:
                return DISABLE_SPOTLIGHT_PERSONALIZED_SMARTMAPS_STARS;
            case 16:
                return USE_IMPORTANCE_BASED_RASTERIZATION_ON_ANDROID;
            case 17:
                return USE_LEGEND_STYLE_IDS;
            case 18:
                return MULTIPLE_UWF_TILE_RESOLUTIONS;
            case 19:
                return INCLUDE_ROAD_GRAPH_V2_METADATA;
            case 20:
                return STRONG_TRANSIT_STYLING;
            case 21:
                return USE_ALL_VECTOR;
            case 22:
                return USE_SMART_TRAFFIC_LAYER;
            case 23:
                return SUPPORTS_INLINE_LEGEND_STYLES;
            case 24:
                return USE_THICK_TILES_AT_Z14;
            case 25:
                return ENABLE_BUILDINGS_IN_NAVIGATION;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dxdg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
