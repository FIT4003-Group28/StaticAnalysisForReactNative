package defpackage;
/* compiled from: PG */
/* renamed from: bwrj  reason: default package */
/* loaded from: classes4.dex */
public enum bwrj implements bwrl {
    ARRIVED_AT_PLACEMARK("ArrivedAtPlacemark"),
    AUTH_TOKEN_RECENCY("AuthTokenRecency"),
    WAYPOINTS_CHANGED_IN_NAVIGATION_DIRECTIONS("DirectionsAsChangedInNav"),
    WAYPOINTS_CHANGED_IN_NAVIGATION("WaypointsHaveChangedInNav"),
    COMPLETED_NAVIGATION("CompletedNavigation"),
    USER_PREFERENCES("UserPreferences"),
    SCALABLE_ATTRIBUTE_VALUES("ScalableAttributeValues"),
    COMMUTE_SETUP_NOTIFICATION_MODEL("CommuteSetupNotificationModel"),
    PLACE_HISTORY("PlaceHistory"),
    TRANSIT_DISMISS_TRACKER("TransitDismissTracker"),
    KNOWN_STATIONS("KnownStations"),
    SELECTED_STATION("SelectedStation"),
    TRANSIT_TRIP_PARAMS("TransitTripParams"),
    TRANSIT_EVENT_TRACKER("TransitEventTracker"),
    TRANSIT_STATION_ALIASES("TransitStationAliases"),
    TRANSIT_STATION_PATTERN("TransitStationPattern"),
    TRANSIT_STATION_TRIGGERING("TransitStationTriggering"),
    TRANSIT_NOTIFICATION_DATA("TransitNotificationData"),
    TRANSIT_SCHEMATIC_MAP_NOTIFICATION_DATA("TransitSchematicMapNotificationData"),
    GEOFENCE_DATA("GeofenceData"),
    ON_MAP_PLACE_INJECTOR_DATA("OnMapPlaceInjectorData");
    
    private final String v;

    bwrj(String str) {
        this.v = str;
    }

    @Override // defpackage.bwrl
    public final String a() {
        return this.v;
    }
}
