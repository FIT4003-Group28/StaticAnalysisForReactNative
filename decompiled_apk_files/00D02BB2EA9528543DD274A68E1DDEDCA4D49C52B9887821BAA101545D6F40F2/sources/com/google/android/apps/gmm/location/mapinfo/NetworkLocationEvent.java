package com.google.android.apps.gmm.location.mapinfo;
/* compiled from: PG */
@ckor
@ckol(a = "network_location", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class NetworkLocationEvent {
    private final float accuracy;
    private final double latitude;
    private final double longitude;
    private final long relativeTime;

    public NetworkLocationEvent(@ckoo(a = "lat") double d, @ckoo(a = "lng") double d2, @ckoo(a = "accuracy") float f, @ckoo(a = "time") long j) {
        this(j, d, d2, f);
    }

    public NetworkLocationEvent(long j, double d, double d2, float f) {
        this.relativeTime = j;
        this.latitude = d;
        this.longitude = d2;
        this.accuracy = f;
    }

    @ckom(a = "accuracy")
    public float getAccuracy() {
        return this.accuracy;
    }

    @ckom(a = "lat")
    public double getLatitude() {
        return this.latitude;
    }

    @ckom(a = "lng")
    public double getLongitude() {
        return this.longitude;
    }

    @ckom(a = "time")
    public long getRelativeTime() {
        return this.relativeTime;
    }
}
