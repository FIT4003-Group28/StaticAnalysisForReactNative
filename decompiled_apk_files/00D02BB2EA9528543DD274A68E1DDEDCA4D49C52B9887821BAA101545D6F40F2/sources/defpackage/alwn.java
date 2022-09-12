package defpackage;

import java.util.EnumMap;
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* JADX WARN: Init of enum j can be incorrect */
/* JADX WARN: Init of enum k can be incorrect */
/* JADX WARN: Init of enum l can be incorrect */
/* JADX WARN: Init of enum n can be incorrect */
/* JADX WARN: Init of enum o can be incorrect */
/* JADX WARN: Init of enum p can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum r can be incorrect */
/* JADX WARN: Init of enum s can be incorrect */
/* JADX WARN: Init of enum t can be incorrect */
/* JADX WARN: Init of enum u can be incorrect */
/* JADX WARN: Init of enum v can be incorrect */
/* JADX WARN: Init of enum w can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* compiled from: PG */
/* renamed from: alwn  reason: default package */
/* loaded from: classes.dex */
public enum alwn {
    ROADMAP("Roadmap", -987675, dmyo.ROADMAP, true, false),
    ROADMAP_DARK("RoadmapDark", -15592942, dmyo.ROADMAP_DARK, true, true),
    BASEMAP_EDITING("BasemapEditing", r8.z, dmyo.BASEMAP_EDITING, false, false),
    BASEMAP_EDITING_SATELLITE("BasemapEditingSatellite", r8.z, dmyo.BASEMAP_EDITING_SATELLITE, false, false),
    NAVIGATION("Navigation", -1973791, dmyo.NAVIGATION, true, false),
    NAVIGATION_EMBEDDED_AUTO("NavigationEmbeddedAuto", -4341306, dmyo.NAVIGATION_EMBEDDED_AUTO, false, false),
    NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT("NavigationEmbeddedAutoLowLight", -14803167, dmyo.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT, false, true),
    NAVIGATION_LOW_LIGHT("NavigationLowLight", -15525081, dmyo.NAVIGATION_LOW_LIGHT, true, true),
    NAVIGATION_SATELLITE("NavigationSatellite", r6.z, dmyo.NAVIGATION_SATELLITE, true, false),
    RESULTS_FOCUSED("CategoricalSearch", r8.z, dmyo.CATEGORICAL_RESULTS_FOCUSED, true, false),
    RESULTS_FOCUSED_DARK("CategoricalSearchDark", r0.z, dmyo.CATEGORICAL_RESULTS_FOCUSED_DARK, false, true),
    ROADMAP_AMBIACTIVE("RoadmapAmbiactive", r8.z, dmyo.ROADMAP_AMBIACTIVE, false, false),
    ROADMAP_AMBIACTIVE_LOW_BIT("RoadmapAmbiactiveLowBit", 0, dmyo.ROADMAP_AMBIACTIVE_LOW_BIT, false, false),
    ROADMAP_INFO_LAYER("RoadmapInfoLayer", r8.z, dmyo.ROADMAP_INFO_LAYER, true, false),
    ROADMAP_INFO_LAYER_DARK("RoadmapInfoLayerDark", r0.z, dmyo.ROADMAP_INFO_LAYER_DARK, false, true),
    ROADMAP_SATELLITE("RoadmapSatellite", r6.z, dmyo.ROADMAP_SATELLITE, true, false),
    ROUTE_OVERVIEW("RouteOverview", r8.z, dmyo.ROUTE_OVERVIEW, true, false),
    ROUTE_OVERVIEW_DARK("RouteOverviewDark", r0.z, dmyo.ROUTE_OVERVIEW_DARK, true, true),
    SAFETY("Safety", r8.z, dmyo.SAFETY, false, false),
    SAFETY_DARK("SafetyDark", r0.z, dmyo.SAFETY_DARK, false, true),
    TERRAIN("Terrain", r8.z, dmyo.TERRAIN, true, false),
    TERRAIN_DARK("TerrainDark", r0.z, dmyo.TERRAIN_DARK, true, true),
    TRANSIT_FOCUSED("TransitFocused", r8.z, dmyo.TRANSIT_FOCUSED, true, false),
    TRANSIT_FOCUSED_DARK("TransitFocusedDark", r0.z, dmyo.TRANSIT_FOCUSED_DARK, true, true);
    
    private static final dcdn<dmyo, alwn> D;
    public final dmyo A;
    public final boolean B;
    public final boolean C;
    public final String y;
    public final int z;

    static {
        alwn[] values;
        alwn alwnVar = ROADMAP;
        alwn alwnVar2 = ROADMAP_DARK;
        alwn alwnVar3 = NAVIGATION_LOW_LIGHT;
        EnumMap enumMap = new EnumMap(dmyo.class);
        for (alwn alwnVar4 : values()) {
            enumMap.put((EnumMap) alwnVar4.A, (dmyo) alwnVar4);
        }
        D = dcjz.c(enumMap);
        int length = values().length;
    }

    alwn(String str, int i, dmyo dmyoVar, boolean z, boolean z2) {
        this.y = str;
        this.z = i;
        this.A = dmyoVar;
        this.B = z;
        this.C = z2;
    }

    public static alwn a(dmyo dmyoVar) {
        alwn alwnVar = D.get(dmyoVar);
        if (alwnVar != null) {
            return alwnVar;
        }
        String valueOf = String.valueOf(dmyoVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Can not convert VersatileMapStyle: ");
        sb.append(valueOf);
        throw new UnsupportedOperationException(sb.toString());
    }
}
