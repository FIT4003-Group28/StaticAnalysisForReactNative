package com.a.a.a;
/* compiled from: TrackingType.java */
/* loaded from: classes.dex */
public enum e {
    None,
    Vehicle,
    Device,
    Both;

    public static e a(String str) {
        if (Device.toString().equalsIgnoreCase(str)) {
            return Device;
        }
        if (Vehicle.toString().equalsIgnoreCase(str)) {
            return Vehicle;
        }
        if (Both.toString().equalsIgnoreCase(str)) {
            return Both;
        }
        return None;
    }
}
