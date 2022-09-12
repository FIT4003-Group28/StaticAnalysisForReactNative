package defpackage;
/* compiled from: PG */
/* renamed from: asld  reason: default package */
/* loaded from: classes2.dex */
public enum asld {
    FOLLOWING,
    FREE_MOVEMENT,
    OVERVIEW,
    INSPECT_STEP,
    INSPECT_RESULTS_ON_MAP_WITH_LOCATION,
    INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION,
    INSPECT_POINT_ON_ROUTE,
    INSPECT_ROUTE_SECTION,
    INSPECT_POINT_ON_MAP;

    public final boolean a() {
        return (this == FREE_MOVEMENT || this == INSPECT_POINT_ON_ROUTE) ? false : true;
    }

    public final boolean b() {
        return this == FOLLOWING || this == INSPECT_POINT_ON_ROUTE;
    }

    public final boolean c() {
        return this == FOLLOWING || this == FREE_MOVEMENT || this == OVERVIEW || this == INSPECT_STEP || this == INSPECT_ROUTE_SECTION || this == INSPECT_POINT_ON_ROUTE || this == INSPECT_RESULTS_ON_MAP_WITH_LOCATION || this == INSPECT_RESULTS_ON_MAP_WITHOUT_LOCATION;
    }
}
