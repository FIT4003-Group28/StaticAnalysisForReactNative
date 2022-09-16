package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dmxl  reason: default package */
/* loaded from: classes.dex */
public enum dmxl implements dsrb {
    UNKNOWN(0),
    GMM_VECTOR_BASE(1),
    GMM_VECTOR_TRAFFIC_V2(2),
    GMM_VECTOR_BICYCLING_OVERLAY(3),
    GMM_LABELS_ONLY(4),
    GMM_REALTIME(5),
    GMM_HIGHLIGHT_RAP(6),
    GMM_TRAFFIC_CAR(7),
    GMM_TRANSIT(8),
    GMM_INDOOR(9),
    GMM_MY_MAPS(10),
    GMM_EXPLORE_EAT_AND_DRINK(11),
    GMM_EXPLORE_PLAY(12),
    GMM_EXPLORE_SHOP(13),
    GMM_EXPLORE_SERVICES(14),
    GMM_SATELLITE(15),
    GMM_TERRAIN(16),
    GMM_TERRAIN_DARK(26),
    GMM_ROAD_GRAPH(17),
    GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS(18),
    GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS_PER_TILE(19),
    GMM_SPOTLIGHT_HIGHLIGHTING(20),
    GMM_BUILDING_3D(21),
    GMM_MAJOR_EVENT(22),
    GMM_STREET_VIEW(23),
    GMM_SEARCH_RESULTS(24),
    GMM_PERSONAL_SAFETY(25),
    GMM_TRAVEL_HIGHLIGHT(27),
    GMM_LOCAL_RECOMMENDATIONS(29),
    GMM_BASEMAP_PERSONALIZATION(30),
    GMM_CATEGORICAL_SEARCH(31),
    GMM_CATEGORICAL_SEARCH_RESULTS_INJECTION(34),
    GMM_COVID19(32),
    GMM_BUSYNESS(33);
    
    private final int I;

    dmxl(int i) {
        this.I = i;
    }

    public static dmxl b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return GMM_VECTOR_BASE;
            case 2:
                return GMM_VECTOR_TRAFFIC_V2;
            case 3:
                return GMM_VECTOR_BICYCLING_OVERLAY;
            case 4:
                return GMM_LABELS_ONLY;
            case 5:
                return GMM_REALTIME;
            case 6:
                return GMM_HIGHLIGHT_RAP;
            case 7:
                return GMM_TRAFFIC_CAR;
            case 8:
                return GMM_TRANSIT;
            case 9:
                return GMM_INDOOR;
            case 10:
                return GMM_MY_MAPS;
            case 11:
                return GMM_EXPLORE_EAT_AND_DRINK;
            case 12:
                return GMM_EXPLORE_PLAY;
            case 13:
                return GMM_EXPLORE_SHOP;
            case 14:
                return GMM_EXPLORE_SERVICES;
            case 15:
                return GMM_SATELLITE;
            case 16:
                return GMM_TERRAIN;
            case 17:
                return GMM_ROAD_GRAPH;
            case 18:
                return GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS;
            case 19:
                return GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS_PER_TILE;
            case 20:
                return GMM_SPOTLIGHT_HIGHLIGHTING;
            case 21:
                return GMM_BUILDING_3D;
            case 22:
                return GMM_MAJOR_EVENT;
            case 23:
                return GMM_STREET_VIEW;
            case 24:
                return GMM_SEARCH_RESULTS;
            case 25:
                return GMM_PERSONAL_SAFETY;
            case 26:
                return GMM_TERRAIN_DARK;
            case 27:
                return GMM_TRAVEL_HIGHLIGHT;
            case 28:
            default:
                return null;
            case 29:
                return GMM_LOCAL_RECOMMENDATIONS;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return GMM_BASEMAP_PERSONALIZATION;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return GMM_CATEGORICAL_SEARCH;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return GMM_COVID19;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return GMM_BUSYNESS;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return GMM_CATEGORICAL_SEARCH_RESULTS_INJECTION;
        }
    }

    public static dsrd c() {
        return dmxk.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.I;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.I);
    }
}
