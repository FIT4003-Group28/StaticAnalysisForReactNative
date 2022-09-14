package com.BaiduMaps;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.j.i;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.a.a.a.a;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BaiduMapOptions;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.x;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.asn1.x509.DisplayText;
/* compiled from: BaiduMapView.java */
/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    private static final String f1338b = "d";
    private static int t = 250;
    private float A;
    private final BaiduMap.OnMapStatusChangeListener B;
    private final Animator.AnimatorListener C;

    /* renamed from: a  reason: collision with root package name */
    public MapView f1339a;

    /* renamed from: c  reason: collision with root package name */
    private final ScaleGestureDetector f1340c;

    /* renamed from: d  reason: collision with root package name */
    private final android.support.v4.j.d f1341d;
    private ArrayList<b> e;
    private HashMap<Marker, c> f;
    private final BaiduMapManager g;
    private boolean h;
    private LatLngBounds i;
    private boolean j;
    private af k;
    private boolean l;
    private com.a.a.a.e m;
    private ArrayList<com.a.a.a.b> n;
    private int o;
    private boolean p;
    private com.a.a.a.b q;
    private com.a.a.a.b r;
    private h s;
    private com.a.a.a.a u;
    private boolean v;
    private boolean w;
    private com.a.a.a.e x;
    private ImageView y;
    private Handler z;

    public d(af afVar, BaiduMapManager baiduMapManager, Context context) {
        super(context);
        this.e = new ArrayList<>();
        this.f = new HashMap<>();
        this.h = false;
        this.j = false;
        this.l = false;
        this.o = 10;
        this.p = false;
        this.u = new a.C0030a();
        this.v = false;
        this.w = false;
        this.y = null;
        this.A = 17.0f;
        this.B = new BaiduMap.OnMapStatusChangeListener() { // from class: com.BaiduMaps.d.6
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
            public void onMapStatusChange(MapStatus mapStatus) {
            }

            @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
            public void onMapStatusChangeStart(MapStatus mapStatus) {
            }

            @Override // com.baidu.mapapi.map.BaiduMap.OnMapStatusChangeListener
            public void onMapStatusChangeFinish(MapStatus mapStatus) {
                if (d.this.m == com.a.a.a.e.None && d.this.x == null) {
                    d.this.A = Math.max(mapStatus.zoom, 5.0f);
                    LatLngBounds latLngBounds = mapStatus.bound;
                }
                d.this.b();
            }
        };
        this.C = new Animator.AnimatorListener() { // from class: com.BaiduMaps.d.7
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                d.this.p = false;
                d.this.b();
            }
        };
        this.g = baiduMapManager;
        BaiduMapOptions baiduMapOptions = new BaiduMapOptions();
        baiduMapOptions.compassEnabled(false);
        baiduMapOptions.zoomControlsEnabled(false);
        baiduMapOptions.overlookingGesturesEnabled(false);
        baiduMapOptions.rotateGesturesEnabled(false);
        this.k = afVar;
        this.z = new Handler(Looper.getMainLooper());
        this.n = new ArrayList<>();
        this.f1339a = new MapView(afVar, baiduMapOptions);
        x xVar = new x() { // from class: com.BaiduMaps.d.1
            @Override // com.facebook.react.bridge.x
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.x
            public void onHostResume() {
                d.this.f1339a.getMap().setMyLocationEnabled(d.this.h);
                synchronized (d.this.f1339a) {
                    d.this.f1339a.onResume();
                    d.this.l = false;
                }
            }

            @Override // com.facebook.react.bridge.x
            public void onHostPause() {
                d.this.f1339a.getMap().setMyLocationEnabled(false);
                d.this.l = true;
            }
        };
        this.f1340c = new ScaleGestureDetector(afVar, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.BaiduMaps.d.2
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                return false;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                d.this.v = true;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                super.onScaleEnd(scaleGestureDetector);
                d.this.v = false;
            }
        });
        this.f1341d = new android.support.v4.j.d(afVar, new GestureDetector.SimpleOnGestureListener() { // from class: com.BaiduMaps.d.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                d.this.v = true;
                return false;
            }
        });
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.BaiduMaps.d.4
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                d.this.g.pushEvent(view, "onMapReady", new WritableNativeMap());
                d.this.removeOnLayoutChangeListener(this);
            }
        });
        afVar.a(xVar);
        this.f1339a.getMap().setOnMapLoadedCallback(new BaiduMap.OnMapLoadedCallback() { // from class: com.BaiduMaps.d.5
            @Override // com.baidu.mapapi.map.BaiduMap.OnMapLoadedCallback
            public void onMapLoaded() {
                d.this.j = true;
                d.this.a((Object) null);
                d.this.f1339a.getMap().setOnMapStatusChangeListener(d.this.B);
            }
        });
        addView(this.f1339a);
        this.y = new ImageView(getContext());
        this.y.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.y.setVisibility(0);
        this.y.setImageDrawable(getResources().getDrawable(com.a.a.a.d.a(null), null));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.y.getDrawable().getIntrinsicWidth(), this.y.getDrawable().getIntrinsicHeight());
        layoutParams.gravity = 17;
        this.y.setLayoutParams(layoutParams);
        addView(this.y);
    }

    private boolean a() {
        return this.f1339a.getHeight() > 0 && this.f1339a.getWidth() > 0;
    }

    public void setRegion(LatLngBounds latLngBounds) {
        if (!a() || !this.j) {
            this.i = latLngBounds;
            return;
        }
        this.i = null;
        this.f1339a.getMap().setMapStatus(MapStatusUpdateFactory.newLatLngBounds(latLngBounds));
    }

    public void setShowsUserLocation(boolean z) {
        this.h = z;
        if (this.j) {
            this.f1339a.getMap().setMyLocationEnabled(z);
        }
    }

    public void a(LatLngBounds latLngBounds, Integer num) {
        MapStatusUpdate newLatLngBounds = MapStatusUpdateFactory.newLatLngBounds(latLngBounds);
        if (this.j) {
            this.f1339a.getMap().animateMapStatus(newLatLngBounds, num.intValue());
        }
    }

    public void a(LatLng latLng, Integer num) {
        MapStatusUpdate newLatLng = MapStatusUpdateFactory.newLatLng(latLng);
        if (this.j) {
            this.f1339a.getMap().animateMapStatus(newLatLng, num.intValue());
        }
    }

    public void a(boolean z) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<b> it = this.e.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            builder.include(((Marker) it.next().getFeature()).getPosition());
            z2 = true;
        }
        if (!z2) {
            return;
        }
        MapStatusUpdate newLatLngBounds = MapStatusUpdateFactory.newLatLngBounds(builder.build());
        if (z) {
            this.f1339a.getMap().animateMapStatus(newLatLngBounds, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        } else {
            this.f1339a.getMap().setMapStatus(newLatLngBounds);
        }
    }

    public void a(View view, int i) {
        BaiduMap map = this.f1339a.getMap();
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.b(map);
            this.e.add(i, cVar);
            this.f.put((Marker) cVar.getFeature(), cVar);
        } else if (view instanceof h) {
            this.s = (h) view;
            this.s.b(map);
            this.e.add(i, this.s);
            if (this.y != null) {
                this.s.setCenterMarker(this.y);
                this.s.setType(this.s.getType());
                this.y.setRotation((float) this.s.getLocationInfo().b());
            }
            if (this.q != null) {
                return;
            }
            this.q = this.s.getLocationInfo();
        } else {
            throw new RuntimeException("Failed to add feature: " + view);
        }
    }

    public int getFeatureCount() {
        return this.e.size();
    }

    public View a(int i) {
        return this.e.get(i);
    }

    public void b(int i) {
        b bVar = this.e.get(i);
        bVar.a(this.f1339a.getMap());
        if (bVar instanceof c) {
            this.f.remove(bVar.getFeature());
        }
    }

    public void a(Object obj) {
        if (this.i == null || !this.j || !a()) {
            return;
        }
        setRegion(this.i);
        this.i = null;
    }

    public void a(Double d2, Double d3, Double d4, Double d5) {
        if (d2 == null || d3 == null || d4 == null || d5 == null) {
            Log.e(f1338b, "Got null data in vehicle update");
            return;
        }
        LatLng a2 = g.a(d2.doubleValue(), d3.doubleValue());
        com.a.a.a.b bVar = new com.a.a.a.b(a2.latitude, a2.longitude, d4.doubleValue(), d5);
        this.n.add(bVar);
        while (this.n.size() >= this.o) {
            this.n.remove(0);
        }
        if (this.q == null) {
            this.q = bVar;
        }
        if (this.p || this.s == null || !this.j) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LatLngBounds c2;
        if (this.n.size() == 0 || this.p) {
            return;
        }
        com.a.a.a.b remove = this.n.remove(0);
        while (true) {
            com.a.a.a.b bVar = remove;
            if (bVar.a() < this.q.a()) {
                if (this.n.size() <= 0) {
                    return;
                }
                remove = this.n.remove(0);
            } else {
                int a2 = (int) (bVar.a() - this.q.a());
                if (a2 > 1000 || a2 <= 0) {
                    a2 = t;
                }
                a(bVar, a2);
                if (this.m == com.a.a.a.e.Vehicle || this.x == com.a.a.a.e.Vehicle) {
                    b(bVar, a2);
                    return;
                } else if (this.m == com.a.a.a.e.Device) {
                    c(this.r, a2);
                    return;
                } else if (this.m == com.a.a.a.e.None || this.m != com.a.a.a.e.Both || (c2 = c()) == null || this.w) {
                    return;
                } else {
                    this.f1339a.getMap().animateMapStatus(MapStatusUpdateFactory.newLatLngBounds(c2), a2);
                    return;
                }
            }
        }
    }

    private void a(com.a.a.a.b bVar, int i) {
        if (this.s == null || this.s.getFeature() == null) {
            return;
        }
        this.p = true;
        LatLng latLng = new LatLng(bVar.d(), bVar.c());
        this.q = bVar;
        Marker marker = (Marker) this.s.getFeature();
        float f = 1.0f;
        marker.setAlpha(this.m == com.a.a.a.e.Vehicle ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        if (this.y != null) {
            ImageView imageView = this.y;
            if (this.m != com.a.a.a.e.Vehicle) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            imageView.setAlpha(f);
            this.y.setRotation((float) bVar.b());
        }
        com.a.a.a.c.a(marker, latLng, (float) bVar.b(), this.u, i, this.C);
    }

    private void b(com.a.a.a.b bVar, int i) {
        if (this.w) {
            return;
        }
        LatLng latLng = new LatLng(bVar.d(), bVar.c());
        this.q = bVar;
        this.f1339a.getMap().animateMapStatus(MapStatusUpdateFactory.newLatLngZoom(latLng, this.A), i);
        c(i);
    }

    private void c(com.a.a.a.b bVar, int i) {
        if (this.w || bVar == null) {
            return;
        }
        this.f1339a.getMap().animateMapStatus(MapStatusUpdateFactory.newLatLngZoom(new LatLng(bVar.d(), bVar.c()), this.A), i);
    }

    public void a(Double d2, Double d3, Double d4) {
        if (d2 == null || d3 == null || d4 == null) {
            Log.e(f1338b, "Got null data in device update");
            return;
        }
        if (this.r != null) {
            if (this.r.a() > d4.doubleValue()) {
                return;
            }
            if (this.r.d() == d2.doubleValue() && this.r.c() == d3.doubleValue()) {
                return;
            }
        }
        LatLng a2 = g.a(d2.doubleValue(), d3.doubleValue());
        this.r = new com.a.a.a.b(a2.latitude, a2.longitude, 0.0d, d4);
        if (this.m != com.a.a.a.e.Device && this.m != com.a.a.a.e.Both) {
            return;
        }
        if (this.n.size() == 0 && this.q != null) {
            this.n.add(this.q);
        }
        b();
    }

    public void setTrackingType(com.a.a.a.e eVar) {
        if (this.m == eVar) {
            return;
        }
        if (eVar == com.a.a.a.e.Vehicle) {
            this.x = com.a.a.a.e.Vehicle;
        } else {
            this.x = null;
            this.m = eVar;
        }
        if (this.q == null || this.s == null) {
            return;
        }
        this.n.add(this.q);
        b();
    }

    private LatLngBounds c() {
        boolean z;
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (this.r != null) {
            builder.include(this.r.f());
            z = true;
        } else {
            z = false;
        }
        if (this.q != null) {
            builder.include(this.q.f());
            z = true;
        }
        if (!z) {
            return null;
        }
        return builder.build();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f1340c.onTouchEvent(motionEvent);
        this.f1341d.a(motionEvent);
        switch (i.a(motionEvent)) {
            case 0:
                getParent().requestDisallowInterceptTouchEvent(true);
                this.w = true;
                a(com.a.a.a.e.None);
                this.g.pushEvent(this, "onMapTouched", new WritableNativeMap());
                break;
            case 1:
                getParent().requestDisallowInterceptTouchEvent(false);
                this.w = false;
                break;
        }
        this.f1339a.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.a.a.a.e eVar) {
        this.x = null;
        this.m = eVar;
        if (this.y == null || this.s == null) {
            return;
        }
        ImageView imageView = this.y;
        com.a.a.a.e eVar2 = com.a.a.a.e.Vehicle;
        float f = BitmapDescriptorFactory.HUE_RED;
        imageView.setAlpha(eVar == eVar2 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        Marker marker = (Marker) this.s.getFeature();
        if (marker == null) {
            return;
        }
        if (eVar != com.a.a.a.e.Vehicle) {
            f = 1.0f;
        }
        marker.setAlpha(f);
    }

    private void c(int i) {
        this.z.postDelayed(new Runnable() { // from class: com.BaiduMaps.d.8
            @Override // java.lang.Runnable
            public void run() {
                if (d.this.x != com.a.a.a.e.Vehicle || d.this.w) {
                    return;
                }
                d.this.a(d.this.x);
            }
        }, i);
    }
}
