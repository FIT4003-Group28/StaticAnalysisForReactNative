package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AirMapPolyline.java */
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private PolylineOptions f1383a;

    /* renamed from: b  reason: collision with root package name */
    private Polyline f1384b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLng> f1385c;

    /* renamed from: d  reason: collision with root package name */
    private int f1386d;
    private float e;
    private boolean f;
    private float g;

    public f(Context context) {
        super(context);
    }

    public void setCoordinates(am amVar) {
        this.f1385c = new ArrayList(amVar.size());
        for (int i = 0; i < amVar.size(); i++) {
            an c2 = amVar.c(i);
            this.f1385c.add(i, new LatLng(c2.getDouble("latitude"), c2.getDouble("longitude")));
        }
        if (this.f1384b != null) {
            this.f1384b.setPoints(this.f1385c);
        }
    }

    public void setColor(int i) {
        this.f1386d = i;
        if (this.f1384b != null) {
            this.f1384b.setColor(i);
        }
    }

    public void setWidth(float f) {
        this.e = f;
        if (this.f1384b != null) {
            this.f1384b.setWidth(f);
        }
    }

    public void setZIndex(float f) {
        this.g = f;
        if (this.f1384b != null) {
            this.f1384b.setZIndex(f);
        }
    }

    public void setGeodesic(boolean z) {
        this.f = z;
        if (this.f1384b != null) {
            this.f1384b.setGeodesic(z);
        }
    }

    public PolylineOptions getPolylineOptions() {
        if (this.f1383a == null) {
            this.f1383a = d();
        }
        return this.f1383a;
    }

    private PolylineOptions d() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.addAll(this.f1385c);
        polylineOptions.color(this.f1386d);
        polylineOptions.width(this.e);
        polylineOptions.geodesic(this.f);
        polylineOptions.zIndex(this.g);
        return polylineOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f1384b;
    }

    public void a(GoogleMap googleMap) {
        this.f1384b = googleMap.addPolyline(getPolylineOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public void b(GoogleMap googleMap) {
        this.f1384b.remove();
    }
}
