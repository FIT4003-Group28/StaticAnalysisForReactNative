package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dxdd  reason: default package */
/* loaded from: classes.dex */
public enum dxdd implements dsrb {
    UNKNOWN(0),
    MAP_ATLAS(2),
    SATELLITE(3),
    TRAFFIC(4),
    GIF_ATLAS(5),
    HYBRID(6),
    TERRAIN(7),
    CLICKABLE_LAYER(8),
    STREET_VIEW(9),
    VECTOR_ATLAS(10),
    ROAD_GRAPH(11),
    ROAD_GRAPH_V2(33),
    TERRAIN_NO_LABELS(12),
    VECTOR_TRANSIT(13),
    INDOOR(14),
    LABELS_ONLY(15),
    PERSONALIZED_SMARTMAPS(16),
    RELATED_PLACES(17),
    VECTOR_BICYCLING(18),
    VECTOR_ATLAS_TRANSIT_STYLED(20),
    LABELS_ONLY_TRANSIT_STYLED(21),
    VECTOR_ATLAS_DRIVEABOUT(22),
    TRAFFIC_DRIVEABOUT(23),
    HIGHLIGHT(24),
    API_TILE_OVERLAY(25),
    SPOTLIGHT(26),
    MAPS_ENGINE_VECTOR(27),
    MAPS_ENGINE_IMAGE(28),
    TRAFFIC_V2(29),
    SPOTLIGHT_PERSONALIZED_SMARTMAPS(30),
    TRAFFIC_CAR(31),
    VECTOR_BICYCLING_OVERLAY(32),
    STREET_PARKING_OVERLAY(34),
    HIGHLIGHT_RAP(35),
    REALTIME(36),
    EXPLORE_EAT_AND_DRINK(37),
    EXPLORE_PLAY(38),
    EXPLORE_SHOP(39),
    EXPLORE_SERVICES(40),
    SPOTLIGHT_HIGHLIGHTING(41),
    BUILDING_3D(42),
    MAJOR_EVENT(43),
    SEARCH_RESULTS(44),
    PERSONAL_SAFETY(45),
    TRAVEL_HIGHLIGHT(46),
    LOCAL_RECOMMENDATIONS(48),
    BASEMAP_PERSONALIZATION(49),
    CATEGORICAL_SEARCH(50),
    CATEGORICAL_SEARCH_RESULTS_INJECTION(53),
    COVID19(51),
    BUSYNESS(52);
    
    public final int Z;

    dxdd(int i) {
        this.Z = i;
    }

    public static dxdd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
            case 19:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            default:
                return null;
            case 2:
                return MAP_ATLAS;
            case 3:
                return SATELLITE;
            case 4:
                return TRAFFIC;
            case 5:
                return GIF_ATLAS;
            case 6:
                return HYBRID;
            case 7:
                return TERRAIN;
            case 8:
                return CLICKABLE_LAYER;
            case 9:
                return STREET_VIEW;
            case 10:
                return VECTOR_ATLAS;
            case 11:
                return ROAD_GRAPH;
            case 12:
                return TERRAIN_NO_LABELS;
            case 13:
                return VECTOR_TRANSIT;
            case 14:
                return INDOOR;
            case 15:
                return LABELS_ONLY;
            case 16:
                return PERSONALIZED_SMARTMAPS;
            case 17:
                return RELATED_PLACES;
            case 18:
                return VECTOR_BICYCLING;
            case 20:
                return VECTOR_ATLAS_TRANSIT_STYLED;
            case 21:
                return LABELS_ONLY_TRANSIT_STYLED;
            case 22:
                return VECTOR_ATLAS_DRIVEABOUT;
            case 23:
                return TRAFFIC_DRIVEABOUT;
            case 24:
                return HIGHLIGHT;
            case 25:
                return API_TILE_OVERLAY;
            case 26:
                return SPOTLIGHT;
            case 27:
                return MAPS_ENGINE_VECTOR;
            case 28:
                return MAPS_ENGINE_IMAGE;
            case 29:
                return TRAFFIC_V2;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return SPOTLIGHT_PERSONALIZED_SMARTMAPS;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return TRAFFIC_CAR;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return VECTOR_BICYCLING_OVERLAY;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return ROAD_GRAPH_V2;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return STREET_PARKING_OVERLAY;
            case 35:
                return HIGHLIGHT_RAP;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return REALTIME;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return EXPLORE_EAT_AND_DRINK;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return EXPLORE_PLAY;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return EXPLORE_SHOP;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return EXPLORE_SERVICES;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return SPOTLIGHT_HIGHLIGHTING;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return BUILDING_3D;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                return MAJOR_EVENT;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                return SEARCH_RESULTS;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                return PERSONAL_SAFETY;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                return TRAVEL_HIGHLIGHT;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                return LOCAL_RECOMMENDATIONS;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                return BASEMAP_PERSONALIZATION;
            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                return CATEGORICAL_SEARCH;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                return COVID19;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                return BUSYNESS;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                return CATEGORICAL_SEARCH_RESULTS_INJECTION;
        }
    }

    public static dsrd c() {
        return dxdc.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.Z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.Z);
    }
}
