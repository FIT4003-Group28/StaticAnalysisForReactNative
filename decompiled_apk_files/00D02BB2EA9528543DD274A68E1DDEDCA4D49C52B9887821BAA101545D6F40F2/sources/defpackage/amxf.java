package defpackage;

import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: amxf  reason: default package */
/* loaded from: classes.dex */
public enum amxf {
    NO_MAP(1, amzz.b, alwn.ROADMAP, alwn.ROADMAP),
    ROADMAP(2, amzz.a, alwn.ROADMAP, alwn.ROADMAP_DARK),
    NAVIGATION(2, amzz.a, alwn.NAVIGATION, alwn.NAVIGATION),
    NAVIGATION_EMBEDDED_AUTO(2, amzz.a, alwn.NAVIGATION_EMBEDDED_AUTO, alwn.NAVIGATION_EMBEDDED_AUTO),
    NAVIGATION_LOW_LIGHT(2, amzz.a, alwn.NAVIGATION_LOW_LIGHT, alwn.NAVIGATION_LOW_LIGHT),
    NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT(2, amzz.a, alwn.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT, alwn.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT),
    HYBRID_LEGEND(4, amzz.a, alwn.ROADMAP_SATELLITE, alwn.ROADMAP_SATELLITE),
    SATELLITE_LEGEND(3, amzz.a(6), alwn.ROADMAP_SATELLITE, alwn.ROADMAP_SATELLITE),
    TERRAIN_LEGEND(5, amzz.a(8, 11, 7), alwn.TERRAIN, alwn.TERRAIN_DARK),
    TRANSIT_FOCUSED(2, amzz.a, alwn.TRANSIT_FOCUSED, alwn.TRANSIT_FOCUSED_DARK),
    BASEMAP_EDITING(2, amzz.a, alwn.BASEMAP_EDITING, alwn.BASEMAP_EDITING),
    HYBRID_BASEMAP_EDITING(4, amzz.a, alwn.BASEMAP_EDITING_SATELLITE, alwn.BASEMAP_EDITING_SATELLITE),
    ROUTE_OVERVIEW(2, amzz.a, alwn.ROUTE_OVERVIEW, alwn.ROUTE_OVERVIEW_DARK),
    ROADMAP_AMBIACTIVE(2, amzz.a, alwn.ROADMAP_AMBIACTIVE, alwn.ROADMAP_AMBIACTIVE),
    ROADMAP_AMBIACTIVE_LOW_BIT(2, amzz.a, alwn.ROADMAP_AMBIACTIVE_LOW_BIT, alwn.ROADMAP_AMBIACTIVE_LOW_BIT),
    RESULTS_FOCUSED(2, amzz.a, alwn.RESULTS_FOCUSED, alwn.RESULTS_FOCUSED_DARK),
    ROADMAP_INFO_LAYER(2, amzz.a, alwn.ROADMAP_INFO_LAYER, alwn.ROADMAP_INFO_LAYER_DARK);
    
    public final amzz r;
    public final int s;
    private final alwn t;
    private final alwn u;

    static {
        amxf[] values;
        EnumMap enumMap = new EnumMap(alwn.class);
        for (amxf amxfVar : values()) {
            enumMap.put((EnumMap) amxfVar.a(true), (alwn) amxfVar);
            enumMap.put((EnumMap) amxfVar.a(false), (alwn) amxfVar);
        }
        enumMap.put((EnumMap) alwn.ROADMAP, (alwn) ROADMAP);
        enumMap.put((EnumMap) alwn.ROADMAP_SATELLITE, (alwn) HYBRID_LEGEND);
        dcjz.c(enumMap);
        int length = values().length;
    }

    amxf(int i, amzz amzzVar, alwn alwnVar, alwn alwnVar2) {
        this.s = i;
        this.r = amzzVar;
        this.t = alwnVar;
        this.u = alwnVar2;
    }

    public final alwn a(boolean z) {
        return z ? this.u : this.t;
    }
}
