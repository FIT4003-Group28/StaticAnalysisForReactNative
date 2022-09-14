package com.airbnb.android.react.maps;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
/* compiled from: VehicleMarker.java */
/* loaded from: classes.dex */
public class m extends c {

    /* renamed from: a  reason: collision with root package name */
    private MarkerOptions f1423a;

    /* renamed from: b  reason: collision with root package name */
    private Marker f1424b;

    /* renamed from: c  reason: collision with root package name */
    private int f1425c;

    /* renamed from: d  reason: collision with root package name */
    private int f1426d;
    private String e;
    private LatLng f;
    private String g;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private final Context l;
    private float m;
    private boolean n;
    private boolean o;
    private boolean p;
    private String q;
    private ImageView r;

    public m(Context context) {
        super(context);
        this.m = BitmapDescriptorFactory.HUE_RED;
        this.n = true;
        this.o = false;
        this.p = false;
        this.l = context;
    }

    public void setCoordinate(an anVar) {
        this.f = new LatLng(anVar.getDouble("latitude"), anVar.getDouble("longitude"));
    }

    public void setIdentifier(String str) {
        this.e = str;
        a();
    }

    public String getIdentifier() {
        return this.e;
    }

    public void setTitle(String str) {
        this.g = str;
        if (this.f1424b != null) {
            this.f1424b.setTitle(str);
        }
        a();
    }

    public void setSnippet(String str) {
        this.h = str;
        if (this.f1424b != null) {
            this.f1424b.setSnippet(str);
        }
        a();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.m = f;
    }

    public MarkerOptions getMarkerOptions() {
        if (this.f1423a == null) {
            this.f1423a = d();
        }
        return this.f1423a;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        if (!(view instanceof a)) {
            this.p = true;
        }
        a();
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f1424b;
    }

    public void a(GoogleMap googleMap) {
        this.f1424b = googleMap.addMarker(getMarkerOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public void b(GoogleMap googleMap) {
        this.f1424b.remove();
        this.f1424b = null;
    }

    private BitmapDescriptor getIcon() {
        return BitmapDescriptorFactory.fromResource(com.a.a.a.d.a(this.q));
    }

    private MarkerOptions d() {
        MarkerOptions position = new MarkerOptions().position(this.f);
        if (this.i) {
            position.anchor(this.j, this.k);
        }
        position.title(this.g);
        position.snippet(this.h);
        position.rotation(this.m);
        position.flat(this.n);
        position.draggable(this.o);
        position.icon(getIcon());
        return position;
    }

    public void a() {
        if (this.f1424b == null) {
            return;
        }
        this.f1424b.setIcon(getIcon());
        if (this.i) {
            this.f1424b.setAnchor(this.j, this.k);
        } else {
            this.f1424b.setAnchor(0.5f, 1.0f);
        }
    }

    public void a(int i, int i2) {
        this.f1425c = i;
        this.f1426d = i2;
        a();
    }

    public void a(double d2, double d3) {
        this.i = true;
        this.j = (float) d2;
        this.k = (float) d3;
        if (this.f1424b != null) {
            this.f1424b.setAnchor(this.j, this.k);
        }
        a();
    }

    public void setType(String str) {
        this.q = str;
        e();
        a();
    }

    private void e() {
        if (this.r != null) {
            this.r.setImageDrawable(getResources().getDrawable(com.a.a.a.d.a(this.q), null));
        }
    }

    public void setCenterMarker(ImageView imageView) {
        this.r = imageView;
        e();
    }

    public void a(double d2) {
        double sin = (Math.sin(((-d2) * 3.141592653589793d) / 180.0d) * 0.5d) + 0.5d;
        double d3 = -((Math.cos((d2 * 3.141592653589793d) / 180.0d) * 0.5d) - 0.5d);
        if (this.f1424b != null) {
            this.f1424b.setInfoWindowAnchor((float) sin, (float) d3);
        }
    }

    public com.a.a.a.b getLocationInfo() {
        return new com.a.a.a.b(this.f.latitude, this.f.longitude, this.m, Double.valueOf(com.a.a.a.d.b(this.q)));
    }

    public String getType() {
        return this.q;
    }
}
