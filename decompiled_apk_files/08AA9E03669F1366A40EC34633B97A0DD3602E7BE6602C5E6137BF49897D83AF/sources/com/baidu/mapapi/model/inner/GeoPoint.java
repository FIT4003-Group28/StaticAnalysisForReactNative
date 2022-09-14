package com.baidu.mapapi.model.inner;
/* loaded from: classes.dex */
public class GeoPoint {

    /* renamed from: a  reason: collision with root package name */
    private double f1766a;

    /* renamed from: b  reason: collision with root package name */
    private double f1767b;

    public GeoPoint(double d2, double d3) {
        this.f1766a = d2;
        this.f1767b = d3;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            GeoPoint geoPoint = (GeoPoint) obj;
            return this.f1766a == geoPoint.f1766a && this.f1767b == geoPoint.f1767b;
        }
        return false;
    }

    public double getLatitudeE6() {
        return this.f1766a;
    }

    public double getLongitudeE6() {
        return this.f1767b;
    }

    public void setLatitudeE6(double d2) {
        this.f1766a = d2;
    }

    public void setLongitudeE6(double d2) {
        this.f1767b = d2;
    }

    public String toString() {
        return "GeoPoint: Latitude: " + this.f1766a + ", Longitude: " + this.f1767b;
    }
}
