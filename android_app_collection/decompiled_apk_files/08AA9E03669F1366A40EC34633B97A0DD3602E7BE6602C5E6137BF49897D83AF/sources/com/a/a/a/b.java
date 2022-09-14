package com.a.a.a;

import com.google.android.gms.maps.model.LatLng;
/* compiled from: LocationInfo.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final double f1354a;

    /* renamed from: b  reason: collision with root package name */
    private final double f1355b;

    /* renamed from: c  reason: collision with root package name */
    private final double f1356c;

    /* renamed from: d  reason: collision with root package name */
    private final double f1357d;

    public b(double d2, double d3, double d4, Double d5) {
        this.f1354a = d2;
        this.f1355b = d3;
        this.f1356c = d4;
        this.f1357d = d5.doubleValue();
    }

    public double a() {
        return this.f1357d;
    }

    public double b() {
        return this.f1356c;
    }

    public double c() {
        return this.f1355b;
    }

    public double d() {
        return this.f1354a;
    }

    public LatLng e() {
        return new LatLng(this.f1354a, this.f1355b);
    }

    public com.baidu.mapapi.model.LatLng f() {
        return new com.baidu.mapapi.model.LatLng(this.f1354a, this.f1355b);
    }
}
