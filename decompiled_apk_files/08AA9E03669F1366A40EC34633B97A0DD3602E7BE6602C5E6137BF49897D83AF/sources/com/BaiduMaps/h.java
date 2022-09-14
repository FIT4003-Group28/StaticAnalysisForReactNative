package com.BaiduMaps;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: BaiduVehicleMarker.java */
/* loaded from: classes.dex */
public class h extends b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1350a = "h";

    /* renamed from: b  reason: collision with root package name */
    private MarkerOptions f1351b;

    /* renamed from: c  reason: collision with root package name */
    private Marker f1352c;

    /* renamed from: d  reason: collision with root package name */
    private int f1353d;
    private int e;
    private LatLng f;
    private String g;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private Context l;
    private float m;
    private float n;
    private boolean o;
    private boolean p;
    private boolean q;
    private String r;
    private String s;
    private ImageView t;

    public h(Context context) {
        super(context);
        this.m = BitmapDescriptorFactory.HUE_RED;
        this.n = BitmapDescriptorFactory.HUE_RED;
        this.o = false;
        this.p = false;
        this.q = false;
        this.l = context;
    }

    public void setCoordinate(an anVar) {
        this.f = g.a(anVar.getDouble("latitude"), anVar.getDouble("longitude"));
        a();
    }

    public void setIdentifier(String str) {
        this.s = str;
    }

    public void setTitle(String str) {
        this.g = str;
        if (this.f1352c != null) {
            this.f1352c.setTitle(str);
        }
        a();
    }

    public void setSnippet(String str) {
        this.h = str;
        a();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.n = 360.0f - f;
        if (this.f1352c != null) {
            this.f1352c.setRotate(this.n);
        }
        a();
    }

    public void a(double d2, double d3) {
        this.i = true;
        this.j = (float) d2;
        this.k = (float) d3;
        if (this.f1352c != null) {
            this.f1352c.setAnchor(this.j, this.k);
        }
        a();
    }

    public OverlayOptions getMarkerOptions() {
        if (this.f1351b == null) {
            this.f1351b = d();
        }
        return this.f1351b;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        if (!(view instanceof a)) {
            this.q = true;
        }
        a();
    }

    @Override // com.BaiduMaps.b
    public Object getFeature() {
        return this.f1352c;
    }

    public void b(BaiduMap baiduMap) {
        this.f1352c = (Marker) baiduMap.addOverlay(getMarkerOptions());
    }

    @Override // com.BaiduMaps.b
    public void a(BaiduMap baiduMap) {
        this.f1352c.remove();
        this.f1352c = null;
    }

    private BitmapDescriptor getIcon() {
        return com.baidu.mapapi.map.BitmapDescriptorFactory.fromResource(com.a.a.a.d.a(this.r));
    }

    private MarkerOptions d() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(this.f);
        if (this.i) {
            markerOptions.anchor(this.j, this.k);
        }
        markerOptions.title(this.g);
        markerOptions.rotate(this.n);
        markerOptions.icon(getIcon());
        return markerOptions;
    }

    public void a() {
        if (this.f1352c == null) {
            return;
        }
        this.f1352c.setIcon(getIcon());
    }

    public void a(int i, int i2) {
        this.f1353d = i;
        this.e = i2;
        a();
    }

    public void setType(String str) {
        this.r = str;
        e();
        a();
    }

    private void e() {
        if (this.t != null) {
            this.t.setImageDrawable(getResources().getDrawable(com.a.a.a.d.a(this.r)));
        }
    }

    public void setCenterMarker(ImageView imageView) {
        this.t = imageView;
        e();
    }

    public String getType() {
        return this.r;
    }

    public com.a.a.a.b getLocationInfo() {
        return new com.a.a.a.b(this.f.latitude, this.f.longitude, 360.0f - this.n, Double.valueOf(com.a.a.a.d.b(this.r)));
    }
}
