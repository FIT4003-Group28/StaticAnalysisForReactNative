package com.google.android.apps.gmm.transit.go.events;
/* compiled from: PG */
@ckor
@ckol(a = "transit-stops", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public final class TransitGuidanceRemainingStopsEvent {
    private final int remainingStops;

    public TransitGuidanceRemainingStopsEvent(@ckoo(a = "remaining") int i) {
        this.remainingStops = i;
    }

    @ckom(a = "remaining")
    public int getRemainingStops() {
        return this.remainingStops;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.f("remaining", this.remainingStops);
        return b.toString();
    }
}
