package com.google.android.apps.gmm.transit.go.events;
/* compiled from: PG */
@ckor
@ckol(a = "transit-guidance-action", b = ckok.LOW)
/* loaded from: classes.dex */
public final class TransitGuidanceUserActionEvent {
    private final byzf action;
    private final int selectedRouteIndex;

    public TransitGuidanceUserActionEvent(@ckoo(a = "action") byzf byzfVar, @ckoo(a = "route-index") int i) {
        this.action = byzfVar;
        this.selectedRouteIndex = i;
    }

    @ckom(a = "action")
    public byzf getAction() {
        return this.action;
    }

    @ckom(a = "route-index")
    public int getSelectedRouteIndex() {
        return this.selectedRouteIndex;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("action", this.action);
        b.f("route-index", this.selectedRouteIndex);
        return b.toString();
    }
}
