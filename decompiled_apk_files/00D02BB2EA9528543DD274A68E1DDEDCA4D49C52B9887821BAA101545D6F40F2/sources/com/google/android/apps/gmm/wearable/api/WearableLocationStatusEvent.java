package com.google.android.apps.gmm.wearable.api;
/* compiled from: PG */
@btsb
@ckol(a = "wearable-location-status")
/* loaded from: classes.dex */
public class WearableLocationStatusEvent {
    private final boolean isUsingWearableLocation;

    public WearableLocationStatusEvent(@ckoo(a = "is-using-wearable-location") boolean z) {
        this.isUsingWearableLocation = z;
    }

    @ckom(a = "is-using-wearable-location")
    public boolean isUsingWearableLocation() {
        return this.isUsingWearableLocation;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.h("isUsingWearableLocation", this.isUsingWearableLocation);
        return b.toString();
    }
}
