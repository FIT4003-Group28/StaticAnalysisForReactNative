package com.airbnb.android.react.maps;

import android.content.Context;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AirMapPolygon.java */
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    private PolygonOptions f1379a;

    /* renamed from: b  reason: collision with root package name */
    private Polygon f1380b;

    /* renamed from: c  reason: collision with root package name */
    private List<LatLng> f1381c;

    /* renamed from: d  reason: collision with root package name */
    private int f1382d;
    private int e;
    private float f;
    private boolean g;
    private float h;

    public e(Context context) {
        super(context);
    }

    public void setCoordinates(am amVar) {
        this.f1381c = new ArrayList(amVar.size());
        for (int i = 0; i < amVar.size(); i++) {
            an c2 = amVar.c(i);
            this.f1381c.add(i, new LatLng(c2.getDouble("latitude"), c2.getDouble("longitude")));
        }
        if (this.f1380b != null) {
            this.f1380b.setPoints(this.f1381c);
        }
    }

    public void setFillColor(int i) {
        this.e = i;
        if (this.f1380b != null) {
            this.f1380b.setFillColor(i);
        }
    }

    public void setStrokeColor(int i) {
        this.f1382d = i;
        if (this.f1380b != null) {
            this.f1380b.setStrokeColor(i);
        }
    }

    public void setStrokeWidth(float f) {
        this.f = f;
        if (this.f1380b != null) {
            this.f1380b.setStrokeWidth(f);
        }
    }

    public void setGeodesic(boolean z) {
        this.g = z;
        if (this.f1380b != null) {
            this.f1380b.setGeodesic(z);
        }
    }

    public void setZIndex(float f) {
        this.h = f;
        if (this.f1380b != null) {
            this.f1380b.setZIndex(f);
        }
    }

    public PolygonOptions getPolygonOptions() {
        if (this.f1379a == null) {
            this.f1379a = d();
        }
        return this.f1379a;
    }

    private PolygonOptions d() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.addAll(this.f1381c);
        polygonOptions.fillColor(this.e);
        polygonOptions.strokeColor(this.f1382d);
        polygonOptions.strokeWidth(this.f);
        polygonOptions.geodesic(this.g);
        polygonOptions.zIndex(this.h);
        return polygonOptions;
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f1380b;
    }

    public void a(GoogleMap googleMap) {
        this.f1380b = googleMap.addPolygon(getPolygonOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public void b(GoogleMap googleMap) {
        this.f1380b.remove();
    }
}
