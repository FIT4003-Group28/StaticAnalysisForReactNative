package com.BaiduMaps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.android.react.maps.j;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;
import com.facebook.f.e.o;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: BaiduMapMarker.java */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1333a = "c";

    /* renamed from: b  reason: collision with root package name */
    private MarkerOptions f1334b;

    /* renamed from: c  reason: collision with root package name */
    private Marker f1335c;

    /* renamed from: d  reason: collision with root package name */
    private int f1336d;
    private int e;
    private LatLng f;
    private String g;
    private boolean h;
    private float i;
    private float j;
    private a k;
    private View l;
    private Context m;
    private float n;
    private BitmapDescriptor o;
    private float p;
    private boolean q;
    private boolean r;
    private float s;
    private float t;
    private boolean u;
    private String v;
    private boolean w;
    private final com.facebook.f.i.b x;
    private com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> y;
    private final com.facebook.f.c.d<com.facebook.imagepipeline.i.e> z;

    public c(Context context) {
        super(context);
        this.n = BitmapDescriptorFactory.HUE_RED;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.q = false;
        this.r = false;
        this.w = false;
        this.z = new com.facebook.f.c.c<com.facebook.imagepipeline.i.e>() { // from class: com.BaiduMaps.c.1
            @Override // com.facebook.f.c.c, com.facebook.f.c.d
            public void a(String str, com.facebook.imagepipeline.i.e eVar, Animatable animatable) {
                com.facebook.common.h.a aVar;
                Throwable th;
                Bitmap a2;
                try {
                    aVar = (com.facebook.common.h.a) c.this.y.d();
                    if (aVar != null) {
                        try {
                            com.facebook.imagepipeline.i.b bVar = (com.facebook.imagepipeline.i.b) aVar.a();
                            if (bVar != null && (bVar instanceof com.facebook.imagepipeline.i.c) && (a2 = ((com.facebook.imagepipeline.i.c) bVar).a()) != null) {
                                c.this.o = com.baidu.mapapi.map.BitmapDescriptorFactory.fromBitmap(a2.copy(Bitmap.Config.ARGB_8888, true));
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c.this.y.h();
                            if (aVar != null) {
                                com.facebook.common.h.a.c(aVar);
                            }
                            throw th;
                        }
                    }
                    c.this.y.h();
                    if (aVar != null) {
                        com.facebook.common.h.a.c(aVar);
                    }
                    c.this.a();
                } catch (Throwable th3) {
                    aVar = null;
                    th = th3;
                }
            }
        };
        this.m = context;
        this.x = com.facebook.f.i.b.a(d(), context);
        this.x.b();
    }

    private com.facebook.f.f.a d() {
        return new com.facebook.f.f.b(getResources()).a(o.b.f2453c).a(0).s();
    }

    public void setCoordinate(an anVar) {
        this.f = g.a(anVar.getDouble("latitude"), anVar.getDouble("longitude"));
        if (this.f1335c != null) {
            this.f1335c.setPosition(this.f);
        }
        a();
    }

    public void setTitle(String str) {
        this.g = str;
        if (this.f1335c != null) {
            this.f1335c.setTitle(str);
        }
        a();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.p = 360.0f - f;
        if (this.f1335c != null) {
            this.f1335c.setRotate(this.p);
        }
        a();
    }

    public void setFlat(boolean z) {
        this.q = z;
        if (this.f1335c != null) {
            this.f1335c.setFlat(z);
        }
        a();
    }

    public void setDraggable(boolean z) {
        this.r = z;
        if (this.f1335c != null) {
            this.f1335c.setDraggable(z);
        }
        a();
    }

    public void setMarkerHue(float f) {
        this.n = f;
        a();
    }

    public void a(double d2, double d3) {
        this.h = true;
        this.i = (float) d2;
        this.j = (float) d3;
        if (this.f1335c != null) {
            this.f1335c.setAnchor(this.i, this.j);
        }
        a();
    }

    public void b(double d2, double d3) {
        this.u = true;
        this.s = (float) d2;
        this.t = (float) d3;
        if (this.f1335c != null) {
            this.f1335c.setAnchor(this.s, this.t);
        }
        a();
    }

    public void setImage(String str) {
        if (str == null) {
            this.o = null;
            a();
        } else if (str.startsWith("http://") || str.startsWith("https://")) {
            com.facebook.imagepipeline.n.b n = com.facebook.imagepipeline.n.c.a(Uri.parse(str)).n();
            this.y = com.facebook.f.a.a.c.c().b(n, this);
            this.x.a(com.facebook.f.a.a.c.a().b((com.facebook.f.a.a.e) n).a((com.facebook.f.c.d) this.z).b(this.x.d()).q());
        } else {
            this.o = b(str);
            a();
        }
    }

    public OverlayOptions getMarkerOptions() {
        if (this.f1334b == null) {
            this.f1334b = e();
        }
        return this.f1334b;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        if (!(view instanceof a)) {
            this.w = true;
        }
        a();
    }

    @Override // com.BaiduMaps.b
    public Object getFeature() {
        return this.f1335c;
    }

    public void b(BaiduMap baiduMap) {
        this.f1335c = (Marker) baiduMap.addOverlay(getMarkerOptions());
    }

    @Override // com.BaiduMaps.b
    public void a(BaiduMap baiduMap) {
        this.f1335c.remove();
        this.f1335c = null;
    }

    private BitmapDescriptor getIcon() {
        if (this.w) {
            return com.baidu.mapapi.map.BitmapDescriptorFactory.fromBitmap(f());
        }
        if (this.o != null) {
            return this.o;
        }
        return com.baidu.mapapi.map.BitmapDescriptorFactory.fromResource(j.a.location_marker_baidu_default2x);
    }

    private MarkerOptions e() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(this.f);
        if (this.h) {
            markerOptions.anchor(this.i, this.j);
        }
        markerOptions.title(this.g);
        markerOptions.rotate(this.p);
        markerOptions.icon(getIcon());
        return markerOptions;
    }

    public void a() {
        if (this.f1335c == null) {
            return;
        }
        this.f1335c.setIcon(getIcon());
    }

    public void a(int i, int i2) {
        this.f1336d = i;
        this.e = i2;
        a();
    }

    private Bitmap f() {
        int i = 100;
        int i2 = this.f1336d <= 0 ? 100 : this.f1336d;
        if (this.e > 0) {
            i = this.e;
        }
        buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void setCalloutView(a aVar) {
        this.k = aVar;
    }

    public a getCalloutView() {
        return this.k;
    }

    public View getCallout() {
        if (this.k == null) {
            return null;
        }
        if (this.l == null) {
            g();
        }
        if (!this.k.getTooltip()) {
            return null;
        }
        return this.l;
    }

    public View getInfoContents() {
        if (this.k == null) {
            return null;
        }
        if (this.l == null) {
            g();
        }
        if (!this.k.getTooltip()) {
            return this.l;
        }
        return null;
    }

    private void g() {
        if (this.k == null || this.k.getChildCount() == 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.m);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.k.f1330a, this.k.f1331b, BitmapDescriptorFactory.HUE_RED));
        LinearLayout linearLayout2 = new LinearLayout(this.m);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(this.k.f1330a, this.k.f1331b, BitmapDescriptorFactory.HUE_RED));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.k);
        this.l = linearLayout;
    }

    private int a(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private BitmapDescriptor b(String str) {
        return com.baidu.mapapi.map.BitmapDescriptorFactory.fromResource(a(str));
    }

    public String getIdentifier() {
        return this.v;
    }

    public void setIdentifier(String str) {
        this.v = str;
    }
}
