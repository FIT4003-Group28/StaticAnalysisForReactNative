package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.f.e.o;
import com.facebook.react.bridge.an;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
/* compiled from: AirMapMarker.java */
/* loaded from: classes.dex */
public class d extends c {
    private final com.facebook.f.c.d<com.facebook.imagepipeline.i.e> A;

    /* renamed from: a  reason: collision with root package name */
    private MarkerOptions f1374a;

    /* renamed from: b  reason: collision with root package name */
    private Marker f1375b;

    /* renamed from: c  reason: collision with root package name */
    private int f1376c;

    /* renamed from: d  reason: collision with root package name */
    private int f1377d;
    private String e;
    private LatLng f;
    private String g;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private a l;
    private View m;
    private final Context n;
    private float o;
    private BitmapDescriptor p;
    private Bitmap q;
    private float r;
    private boolean s;
    private boolean t;
    private float u;
    private float v;
    private boolean w;
    private boolean x;
    private final com.facebook.f.i.b<?> y;
    private com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> z;

    public d(Context context) {
        super(context);
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.r = BitmapDescriptorFactory.HUE_RED;
        this.s = false;
        this.t = false;
        this.x = false;
        this.A = new com.facebook.f.c.c<com.facebook.imagepipeline.i.e>() { // from class: com.airbnb.android.react.maps.d.1
            @Override // com.facebook.f.c.c, com.facebook.f.c.d
            public void a(String str, com.facebook.imagepipeline.i.e eVar, Animatable animatable) {
                com.facebook.common.h.a aVar;
                Throwable th;
                Bitmap a2;
                try {
                    aVar = (com.facebook.common.h.a) d.this.z.d();
                    if (aVar != null) {
                        try {
                            com.facebook.imagepipeline.i.b bVar = (com.facebook.imagepipeline.i.b) aVar.a();
                            if (bVar != null && (bVar instanceof com.facebook.imagepipeline.i.c) && (a2 = ((com.facebook.imagepipeline.i.c) bVar).a()) != null) {
                                Bitmap copy = a2.copy(Bitmap.Config.ARGB_8888, true);
                                d.this.q = copy;
                                d.this.p = BitmapDescriptorFactory.fromBitmap(copy);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            d.this.z.h();
                            if (aVar != null) {
                                com.facebook.common.h.a.c(aVar);
                            }
                            throw th;
                        }
                    }
                    d.this.z.h();
                    if (aVar != null) {
                        com.facebook.common.h.a.c(aVar);
                    }
                    d.this.a();
                } catch (Throwable th3) {
                    aVar = null;
                    th = th3;
                }
            }
        };
        this.n = context;
        this.y = com.facebook.f.i.b.a(d(), context);
        this.y.b();
    }

    private com.facebook.f.f.a d() {
        return new com.facebook.f.f.b(getResources()).a(o.b.f2453c).a(0).s();
    }

    public void setCoordinate(an anVar) {
        this.f = new LatLng(anVar.getDouble("latitude"), anVar.getDouble("longitude"));
        if (this.f1375b != null) {
            this.f1375b.setPosition(this.f);
        }
        a();
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
        if (this.f1375b != null) {
            this.f1375b.setTitle(str);
        }
        a();
    }

    public void setSnippet(String str) {
        this.h = str;
        if (this.f1375b != null) {
            this.f1375b.setSnippet(str);
        }
        a();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.r = f;
        if (this.f1375b != null) {
            this.f1375b.setRotation(f);
        }
        a();
    }

    public void setFlat(boolean z) {
        this.s = z;
        if (this.f1375b != null) {
            this.f1375b.setFlat(z);
        }
        a();
    }

    public void setDraggable(boolean z) {
        this.t = z;
        if (this.f1375b != null) {
            this.f1375b.setDraggable(z);
        }
        a();
    }

    public void setMarkerHue(float f) {
        this.o = f;
        a();
    }

    public void a(double d2, double d3) {
        this.i = true;
        this.j = (float) d2;
        this.k = (float) d3;
        if (this.f1375b != null) {
            this.f1375b.setAnchor(this.j, this.k);
        }
        a();
    }

    public void b(double d2, double d3) {
        this.w = true;
        this.u = (float) d2;
        this.v = (float) d3;
        if (this.f1375b != null) {
            this.f1375b.setInfoWindowAnchor(this.u, this.v);
        }
        a();
    }

    public void setImage(String str) {
        if (str == null) {
            this.p = null;
            a();
        } else if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://")) {
            com.facebook.imagepipeline.n.b n = com.facebook.imagepipeline.n.c.a(Uri.parse(str)).n();
            this.z = com.facebook.f.a.a.c.c().b(n, this);
            this.y.a((com.facebook.f.h.a) com.facebook.f.a.a.c.a().b((com.facebook.f.a.a.e) n).a((com.facebook.f.c.d) this.A).b(this.y.d()).q());
        } else {
            this.p = b(str);
            a();
        }
    }

    public MarkerOptions getMarkerOptions() {
        if (this.f1374a == null) {
            this.f1374a = e();
        }
        return this.f1374a;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        super.addView(view, i);
        if (!(view instanceof a)) {
            this.x = true;
        }
        a();
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f1375b;
    }

    public void a(GoogleMap googleMap) {
        this.f1375b = googleMap.addMarker(getMarkerOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public void b(GoogleMap googleMap) {
        this.f1375b.remove();
        this.f1375b = null;
    }

    private BitmapDescriptor getIcon() {
        if (this.x) {
            if (this.p != null) {
                Bitmap f = f();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(this.q.getWidth(), f.getWidth()), Math.max(this.q.getHeight(), f.getHeight()), this.q.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(this.q, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                canvas.drawBitmap(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                return BitmapDescriptorFactory.fromBitmap(createBitmap);
            }
            return BitmapDescriptorFactory.fromBitmap(f());
        } else if (this.p != null) {
            return this.p;
        } else {
            return BitmapDescriptorFactory.defaultMarker(this.o);
        }
    }

    private MarkerOptions e() {
        MarkerOptions position = new MarkerOptions().position(this.f);
        if (this.i) {
            position.anchor(this.j, this.k);
        }
        if (this.w) {
            position.infoWindowAnchor(this.u, this.v);
        }
        position.title(this.g);
        position.snippet(this.h);
        position.rotation(this.r);
        position.flat(this.s);
        position.draggable(this.t);
        position.icon(getIcon());
        return position;
    }

    public void a() {
        if (this.f1375b == null) {
            return;
        }
        this.f1375b.setIcon(getIcon());
        if (this.i) {
            this.f1375b.setAnchor(this.j, this.k);
        } else {
            this.f1375b.setAnchor(0.5f, 1.0f);
        }
        if (this.w) {
            this.f1375b.setInfoWindowAnchor(this.u, this.v);
        } else {
            this.f1375b.setInfoWindowAnchor(0.5f, BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void a(int i, int i2) {
        this.f1376c = i;
        this.f1377d = i2;
        a();
    }

    private Bitmap f() {
        int i = 100;
        int i2 = this.f1376c <= 0 ? 100 : this.f1376c;
        if (this.f1377d > 0) {
            i = this.f1377d;
        }
        buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public void setCalloutView(a aVar) {
        this.l = aVar;
    }

    public a getCalloutView() {
        return this.l;
    }

    public View getCallout() {
        if (this.l == null) {
            return null;
        }
        if (this.m == null) {
            g();
        }
        if (!this.l.getTooltip()) {
            return null;
        }
        return this.m;
    }

    public View getInfoContents() {
        if (this.l == null) {
            return null;
        }
        if (this.m == null) {
            g();
        }
        if (!this.l.getTooltip()) {
            return this.m;
        }
        return null;
    }

    private void g() {
        if (this.l == null || this.l.getChildCount() == 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.n);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(this.l.f1367a, this.l.f1368b, BitmapDescriptorFactory.HUE_RED));
        LinearLayout linearLayout2 = new LinearLayout(this.n);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(this.l.f1367a, this.l.f1368b, BitmapDescriptorFactory.HUE_RED));
        linearLayout.addView(linearLayout2);
        linearLayout2.addView(this.l);
        this.m = linearLayout;
    }

    private int a(String str) {
        return getResources().getIdentifier(str, "drawable", getContext().getPackageName());
    }

    private BitmapDescriptor b(String str) {
        return BitmapDescriptorFactory.fromResource(a(str));
    }
}
