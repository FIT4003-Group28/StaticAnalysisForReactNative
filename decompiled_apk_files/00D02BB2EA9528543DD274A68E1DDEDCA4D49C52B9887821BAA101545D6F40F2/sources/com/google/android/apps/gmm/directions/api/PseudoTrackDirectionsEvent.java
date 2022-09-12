package com.google.android.apps.gmm.directions.api;
/* compiled from: PG */
@ckol(a = "directions")
/* loaded from: classes.dex */
public class PseudoTrackDirectionsEvent {
    @dzsi
    private final String from;
    @dzsi
    private final Double lat;
    @dzsi
    private final Double lng;
    @dzsi
    private final String mode;
    private final boolean startNavigation;
    private final String to;

    public PseudoTrackDirectionsEvent(@ckoo(a = "to") String str, @dzsi @ckoo(a = "lat") Double d, @dzsi @ckoo(a = "lng") Double d2, @dzsi @ckoo(a = "mode") String str2, @dzsi @ckoo(a = "from") String str3, @dzsi @ckoo(a = "start-navigation") Boolean bool) {
        this.to = str;
        this.lat = d;
        this.lng = d2;
        this.mode = str2;
        this.from = str3;
        boolean z = true;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        }
        this.startNavigation = z;
    }

    @ckom(a = "from")
    @dzsi
    public String getFrom() {
        return this.from;
    }

    @ckom(a = "lat")
    @dzsi
    public Double getLat() {
        return this.lat;
    }

    @ckom(a = "lng")
    @dzsi
    public Double getLng() {
        return this.lng;
    }

    @ckom(a = "mode")
    @dzsi
    public String getMode() {
        return this.mode;
    }

    @ckom(a = "start-navigation")
    public Boolean getStartNavigation() {
        return Boolean.valueOf(this.startNavigation);
    }

    @ckom(a = "to")
    public String getTo() {
        return this.to;
    }

    @ckon(a = "from")
    public boolean hasFrom() {
        return this.from != null;
    }

    @ckon(a = "lat")
    public boolean hasLat() {
        return this.lat != null;
    }

    @ckon(a = "lng")
    public boolean hasLng() {
        return this.lng != null;
    }

    @ckon(a = "mode")
    public boolean hasMode() {
        return this.mode != null;
    }

    @ckon(a = "start-navigation")
    public boolean hasStartNavigation() {
        return true;
    }
}
