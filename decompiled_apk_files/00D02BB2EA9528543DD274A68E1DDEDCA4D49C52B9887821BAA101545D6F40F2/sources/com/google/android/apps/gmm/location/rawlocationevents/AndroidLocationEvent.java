package com.google.android.apps.gmm.location.rawlocationevents;

import android.location.Location;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "location", b = ckok.HIGH)
/* loaded from: classes.dex */
public class AndroidLocationEvent extends ahsm {
    private AndroidLocationEvent(Location location) {
        super(location);
    }

    public static AndroidLocationEvent fromLocation(Location location) {
        return new AndroidLocationEvent(location);
    }

    public AndroidLocationEvent(@ckoo(a = "provider") String str, @ckoo(a = "lat") double d, @ckoo(a = "lng") double d2, @dzsi @ckoo(a = "time") Long l, @dzsi @ckoo(a = "altitude") Double d3, @dzsi @ckoo(a = "bearing") Float f, @dzsi @ckoo(a = "speed") Float f2, @dzsi @ckoo(a = "accuracy") Float f3, @ckoo(a = "speedAcc") float f4, @ckoo(a = "bearingAcc") float f5, @ckoo(a = "vertAcc") float f6, @dzsi @ckoo(a = "numSatellites") Integer num, @dzsi @ckoo(a = "fusedLocationType") Integer num2) {
        this(buildLocation(str, d, d2, null, d3, f, f2, f3, f4, f5, f6, num, num2));
    }
}
