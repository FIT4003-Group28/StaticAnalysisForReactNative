package com.google.android.apps.gmm.transit.go.events;
/* compiled from: PG */
@ckor
@ckol(a = "transit-compare")
/* loaded from: classes.dex */
public final class TripComparisonEvent {
    private final String tripInfo;

    public TripComparisonEvent(@ckoo(a = "tripInfo") String str) {
        this.tripInfo = str;
    }

    @ckom(a = "tripInfo")
    public String getTripInfo() {
        return this.tripInfo;
    }
}
