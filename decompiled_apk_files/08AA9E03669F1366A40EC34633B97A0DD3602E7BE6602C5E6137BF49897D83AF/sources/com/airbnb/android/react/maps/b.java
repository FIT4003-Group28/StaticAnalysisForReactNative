package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
/* compiled from: AirMapCircle.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private CircleOptions f1370a;

    /* renamed from: b  reason: collision with root package name */
    private Circle f1371b;

    /* renamed from: c  reason: collision with root package name */
    private LatLng f1372c;

    /* renamed from: d  reason: collision with root package name */
    private double f1373d;
    private int e;
    private int f;
    private float g;
    private float h;

    public b(Context context) {
        super(context);
    }

    public void setCenter(LatLng latLng) {
        this.f1372c = latLng;
        if (this.f1371b != null) {
            this.f1371b.setCenter(this.f1372c);
        }
    }

    public void setRadius(double d2) {
        this.f1373d = d2;
        if (this.f1371b != null) {
            this.f1371b.setRadius(this.f1373d);
        }
    }

    public void setFillColor(int i) {
        this.f = i;
        if (this.f1371b != null) {
            this.f1371b.setFillColor(i);
        }
    }

    public void setStrokeColor(int i) {
        this.e = i;
        if (this.f1371b != null) {
            this.f1371b.setStrokeColor(i);
        }
    }

    public void setStrokeWidth(float f) {
        this.g = f;
        if (this.f1371b != null) {
            this.f1371b.setStrokeWidth(f);
        }
    }

    public void setZIndex(float f) {
        this.h = f;
        if (this.f1371b != null) {
            this.f1371b.setZIndex(f);
        }
    }

    public CircleOptions getCircleOptions() {
        if (this.f1370a == null) {
            this.f1370a = d();
        }
        return this.f1370a;
    }

    private CircleOptions d() {
        CircleOptions circleOptions = new CircleOptions();
        circleOptions.center(this.f1372c);
        circleOptions.radius(this.f1373d);
        circleOptions.fillColor(this.f);
        circleOptions.strokeColor(this.e);
        circleOptions.strokeWidth(this.g);
        circleOptions.zIndex(this.h);
        return circleOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f1371b;
    }

    public void a(GoogleMap googleMap) {
        this.f1371b = googleMap.addCircle(getCircleOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public void b(GoogleMap googleMap) {
        this.f1371b.remove();
    }
}
