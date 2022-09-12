package defpackage;
/* compiled from: PG */
/* renamed from: bntn  reason: default package */
/* loaded from: classes.dex */
public enum bntn implements bnrz {
    OVERLAY_LABELS,
    MY_MAPS_LABELS,
    AR_MAPS_LABELS,
    NAVIGATION_ADS,
    STARS,
    TRAFFIC_INCIDENTS,
    SEARCH_RESULT_MEASLES,
    SEARCH_RESULT_ICONS,
    ADS,
    CLIENT_INJECTED_AREAS_ABOVE_LABELS,
    BIKESHARING_VEHICLE,
    TRANSIT_VEHICLE,
    DEBUG_TILE_BOUNDS,
    CALLOUT_LABEL,
    DEBUG_LABELS,
    CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS,
    BLUE_DOT_CALLOUT,
    VISUAL_EXPLORE_CLUSTER,
    FRIEND_ACCURACY_CIRCLE,
    FRIEND,
    FRIEND_CLUSTER,
    PLACEMARK_LABELS,
    PLACEMARK,
    CALLOUT_LABEL_OVER_PLACEMARKS;
    
    private static final int y = bntm.b + bntm.values().length;

    @Override // defpackage.bnrz
    public final bnuo a() {
        return bnuo.NON_PORTED_CLIENT_INJECTED_PASS;
    }

    @Override // defpackage.bnrz
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.bnrz
    public final int c() {
        return y + ordinal();
    }
}
