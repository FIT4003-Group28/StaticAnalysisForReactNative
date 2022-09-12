package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "car-satellite-status", b = ckok.HIGH)
/* loaded from: classes.dex */
public final class CarSatelliteStatusEvent {
    private final int numInView;
    private final int numUsedInFix;

    public CarSatelliteStatusEvent(@ckoo(a = "numUsedInFix") int i, @ckoo(a = "numInView") int i2) {
        this.numUsedInFix = i;
        this.numInView = i2;
    }

    @ckom(a = "numInView")
    public int getNumInView() {
        return this.numInView;
    }

    @ckom(a = "numUsedInFix")
    public int getNumUsedInFix() {
        return this.numUsedInFix;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.f("numUsedInFix", this.numUsedInFix);
        b.f("numInView", this.numInView);
        return b.toString();
    }
}
