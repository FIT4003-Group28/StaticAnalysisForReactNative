package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akry  reason: default package */
/* loaded from: classes.dex */
public enum akry {
    BASE(dxdd.VECTOR_ATLAS, "m", dmxl.GMM_VECTOR_BASE),
    SATELLITE(dxdd.SATELLITE, "satellite", dmxl.GMM_SATELLITE),
    TERRAIN(dxdd.TERRAIN_NO_LABELS, "terrain", dmxl.GMM_TERRAIN),
    TERRAIN_DARK(dxdd.TERRAIN_NO_LABELS, "terrain_dark", dmxl.GMM_TERRAIN_DARK),
    TRAFFIC_V2(dxdd.TRAFFIC_V2, "traffic", dmxl.GMM_VECTOR_TRAFFIC_V2),
    TRAFFIC_CAR(dxdd.TRAFFIC_CAR, "traffic", dmxl.GMM_TRAFFIC_CAR),
    ROAD_GRAPH(dxdd.ROAD_GRAPH_V2, "roadgraph2", dmxl.GMM_ROAD_GRAPH),
    BICYCLING_OVERLAY(dxdd.VECTOR_BICYCLING_OVERLAY, "bike", dmxl.GMM_VECTOR_BICYCLING_OVERLAY),
    TRANSIT(dxdd.VECTOR_TRANSIT, "transit", dmxl.GMM_TRANSIT),
    INDOOR(dxdd.INDOOR, "indoor", dmxl.GMM_INDOOR),
    HIGHLIGHT_RAP(dxdd.HIGHLIGHT_RAP, "rap", dmxl.GMM_HIGHLIGHT_RAP),
    LABELS_ONLY(dxdd.LABELS_ONLY, "labels_only", dmxl.GMM_LABELS_ONLY),
    MY_MAPS_TILE_OVERLAY(dxdd.MAPS_ENGINE_VECTOR, "mymaps", dmxl.GMM_MY_MAPS),
    API_TILE_OVERLAY(dxdd.API_TILE_OVERLAY, "api", null),
    PERSONALIZED_SMARTMAPS(dxdd.SPOTLIGHT_PERSONALIZED_SMARTMAPS, "psm", dmxl.GMM_SPOTLIGHT_PERSONALIZED_SMARTMAPS),
    SPOTLIGHT_HIGHLIGHTING(dxdd.SPOTLIGHT_HIGHLIGHTING, "highlighting", dmxl.GMM_SPOTLIGHT_HIGHLIGHTING),
    REALTIME(dxdd.REALTIME, "realtime", dmxl.GMM_REALTIME),
    EXPLORE_EAT_AND_DRINK(dxdd.EXPLORE_EAT_AND_DRINK, "eat", dmxl.GMM_EXPLORE_EAT_AND_DRINK),
    EXPLORE_PLAY(dxdd.EXPLORE_PLAY, "play", dmxl.GMM_EXPLORE_PLAY),
    EXPLORE_SHOP(dxdd.EXPLORE_SHOP, "shop", dmxl.GMM_EXPLORE_SHOP),
    EXPLORE_SERVICES(dxdd.EXPLORE_SERVICES, "services", dmxl.GMM_EXPLORE_SERVICES),
    BUILDING_3D(dxdd.BUILDING_3D, "building3d", dmxl.GMM_BUILDING_3D),
    MAJOR_EVENT(dxdd.MAJOR_EVENT, "major_event", dmxl.GMM_MAJOR_EVENT),
    SEARCH_RESULTS(dxdd.SEARCH_RESULTS, "search_results", dmxl.GMM_SEARCH_RESULTS),
    STREET_VIEW(dxdd.STREET_VIEW, "svv", dmxl.GMM_STREET_VIEW),
    TRAVEL_HIGHLIGHT(dxdd.TRAVEL_HIGHLIGHT, "travel-highlight", dmxl.GMM_TRAVEL_HIGHLIGHT),
    COVID19(dxdd.COVID19, "covid", dmxl.GMM_COVID19),
    LOCAL_RECOMMENDATIONS(dxdd.LOCAL_RECOMMENDATIONS, "lore-rec", dmxl.GMM_LOCAL_RECOMMENDATIONS),
    BASEMAP_PERSONALIZATION(dxdd.BASEMAP_PERSONALIZATION, "lore-p13n", dmxl.GMM_BASEMAP_PERSONALIZATION),
    CATEGORICAL_SEARCH(dxdd.CATEGORICAL_SEARCH, "categorical-search", dmxl.GMM_CATEGORICAL_SEARCH),
    CATEGORICAL_SEARCH_RESULTS_INJECTION(dxdd.CATEGORICAL_SEARCH_RESULTS_INJECTION, "categorical-search-results-injection", dmxl.GMM_CATEGORICAL_SEARCH_RESULTS_INJECTION),
    BUSYNESS(dxdd.BUSYNESS, "busyness", dmxl.GMM_BUSYNESS);
    
    public static final Map<String, akry> G;
    private static final Map<dmxl, akry> K;
    @dzsi
    public final dmxl H;
    public final dxdd I;
    public final String J;

    static {
        akry[] values;
        HashMap hashMap = new HashMap(values().length, 1.0f);
        dcdg q = dcdn.q(values().length);
        for (akry akryVar : values()) {
            hashMap.put(akryVar.J, akryVar);
            dmxl dmxlVar = akryVar.H;
            if (dmxlVar != null) {
                q.f(dmxlVar, akryVar);
            }
        }
        G = dcdn.r(hashMap);
        K = q.b();
    }

    akry(dxdd dxddVar, String str, @dzsi dmxl dmxlVar) {
        this.I = dxddVar;
        this.J = str;
        this.H = dmxlVar;
    }

    @dzsi
    public static akry a(dmxl dmxlVar) {
        return K.get(dmxlVar);
    }

    public final boolean b() {
        return this == SATELLITE || this == TERRAIN || this == TERRAIN_DARK || this == BICYCLING_OVERLAY || this == TRANSIT || this == INDOOR || this == MY_MAPS_TILE_OVERLAY || this == REALTIME || this == EXPLORE_EAT_AND_DRINK || this == EXPLORE_PLAY || this == EXPLORE_SHOP || this == EXPLORE_SERVICES || this == BUILDING_3D || this == SPOTLIGHT_HIGHLIGHTING || this == MAJOR_EVENT || this == STREET_VIEW || this == SEARCH_RESULTS || this == CATEGORICAL_SEARCH || this == CATEGORICAL_SEARCH_RESULTS_INJECTION || this == TRAVEL_HIGHLIGHT || this == COVID19 || this == LOCAL_RECOMMENDATIONS || this == BASEMAP_PERSONALIZATION || this == BASE || this == LABELS_ONLY || this == PERSONALIZED_SMARTMAPS;
    }

    public final boolean c() {
        return this == TRAFFIC_V2 || this == TRAFFIC_CAR;
    }

    public final boolean d() {
        return (this == SATELLITE || this == TERRAIN || this == TERRAIN_DARK || this == ROAD_GRAPH || this == API_TILE_OVERLAY) ? false : true;
    }

    public final boolean e() {
        return this == BASE || this == TRAFFIC_V2 || this == TRAFFIC_CAR || this == BICYCLING_OVERLAY || this == TRANSIT || this == INDOOR || this == LABELS_ONLY || this == PERSONALIZED_SMARTMAPS || this == SPOTLIGHT_HIGHLIGHTING || this == HIGHLIGHT_RAP || this == REALTIME || this == EXPLORE_EAT_AND_DRINK || this == EXPLORE_PLAY || this == EXPLORE_SHOP || this == EXPLORE_SERVICES || this == BUILDING_3D || this == MAJOR_EVENT || this == STREET_VIEW || this == SEARCH_RESULTS || this == CATEGORICAL_SEARCH || this == CATEGORICAL_SEARCH_RESULTS_INJECTION || this == TRAVEL_HIGHLIGHT || this == COVID19 || this == LOCAL_RECOMMENDATIONS || this == BASEMAP_PERSONALIZATION || this == BUSYNESS;
    }
}
