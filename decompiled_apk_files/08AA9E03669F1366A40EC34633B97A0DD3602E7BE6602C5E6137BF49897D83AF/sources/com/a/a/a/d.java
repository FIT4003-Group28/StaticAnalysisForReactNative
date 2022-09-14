package com.a.a.a;

import com.airbnb.android.react.maps.j;
/* compiled from: MarkerType.java */
/* loaded from: classes.dex */
public class d {
    public static int a(String str) {
        if ("stale".equalsIgnoreCase(str)) {
            return j.a.location_marker_stale2x;
        }
        return j.a.location_marker2x;
    }

    public static double b(String str) {
        double currentTimeMillis = System.currentTimeMillis() - 300000;
        return "stale".equalsIgnoreCase(str) ? currentTimeMillis - 5000.0d : currentTimeMillis + 5000.0d;
    }
}
