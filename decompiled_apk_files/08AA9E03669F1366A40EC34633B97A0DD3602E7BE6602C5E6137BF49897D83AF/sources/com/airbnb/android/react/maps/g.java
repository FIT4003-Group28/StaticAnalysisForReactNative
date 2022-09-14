package com.airbnb.android.react.maps;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.a.a.a.a;
import com.baidu.mapapi.UIMsg;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.x;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AirMapView.java */
/* loaded from: classes.dex */
public class g extends MapView implements GoogleMap.InfoWindowAdapter, GoogleMap.OnMarkerDragListener, OnMapReadyCallback {
    private static int O = 250;
    private static int P = 150;
    private static final String e = "g";
    private static final String[] s = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    private final AirMapManager A;
    private boolean B;
    private af C;
    private LatLngBounds D;
    private LatLng E;
    private float F;
    private com.a.a.a.e G;
    private com.a.a.a.e H;
    private ArrayList<com.a.a.a.b> I;
    private int J;
    private boolean K;
    private com.a.a.a.b L;
    private com.a.a.a.b M;
    private m N;
    private com.a.a.a.a Q;
    private final View.OnTouchListener R;
    private boolean S;
    private ImageView T;
    private float U;
    private LatLngBounds V;
    private final Animator.AnimatorListener W;

    /* renamed from: a  reason: collision with root package name */
    public GoogleMap f1387a;
    private final GoogleMap.CancelableCallback aa;
    private final GoogleMap.CancelableCallback ab;

    /* renamed from: b  reason: collision with root package name */
    final com.facebook.react.uimanager.events.c f1388b;

    /* renamed from: c  reason: collision with root package name */
    Handler f1389c;

    /* renamed from: d  reason: collision with root package name */
    Runnable f1390d;
    private ProgressBar f;
    private RelativeLayout g;
    private ImageView h;
    private Boolean i;
    private Integer j;
    private Integer k;
    private LatLngBounds l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private final List<c> t;
    private final Map<Marker, d> u;
    private final Map<Polyline, f> v;
    private final Map<Polygon, e> w;
    private final Map<Circle, b> x;
    private final ScaleGestureDetector y;
    private final android.support.v4.j.d z;

    public g(af afVar, Context context, AirMapManager airMapManager, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.i = false;
        this.j = null;
        this.k = null;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = new ArrayList();
        this.u = new HashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.x = new HashMap();
        this.B = false;
        this.D = null;
        this.E = null;
        this.F = 15.0f;
        this.J = 10;
        this.K = false;
        this.Q = new a.C0030a();
        this.S = false;
        this.T = null;
        this.U = 1.0f;
        this.f1389c = new Handler();
        this.f1390d = new Runnable() { // from class: com.airbnb.android.react.maps.g.5
            @Override // java.lang.Runnable
            public void run() {
                if (g.this.f1387a == null) {
                    return;
                }
                LatLngBounds latLngBounds = g.this.f1387a.getProjection().getVisibleRegion().latLngBounds;
                if (g.this.V == null || h.a(latLngBounds, g.this.V)) {
                    LatLng latLng = g.this.f1387a.getCameraPosition().target;
                    g.this.V = latLngBounds;
                    g.this.f1388b.a(new k(g.this.getId(), latLngBounds, latLng, true));
                }
                g.this.f1389c.postDelayed(this, 100L);
            }
        };
        this.W = new Animator.AnimatorListener() { // from class: com.airbnb.android.react.maps.g.7
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
                g.this.K = false;
                if (g.this.N == null || g.this.N.getFeature() == null) {
                    return;
                }
                Marker marker = (Marker) g.this.N.getFeature();
                float rotation = marker.getRotation();
                if (rotation < BitmapDescriptorFactory.HUE_RED || rotation >= 360.0f) {
                    float f = rotation % 360.0f;
                    if (f < BitmapDescriptorFactory.HUE_RED) {
                        f += 360.0f;
                    }
                    marker.setRotation(f);
                    g.this.T.setRotation(f);
                }
                g.this.N.a(g.this.L.b());
                g.this.h();
            }
        };
        this.aa = new GoogleMap.CancelableCallback() { // from class: com.airbnb.android.react.maps.g.8
            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onFinish() {
                g.this.h();
            }
        };
        this.ab = new GoogleMap.CancelableCallback() { // from class: com.airbnb.android.react.maps.g.9
            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onCancel() {
            }

            @Override // com.google.android.gms.maps.GoogleMap.CancelableCallback
            public void onFinish() {
                if (g.this.H == com.a.a.a.e.Vehicle && !g.this.o) {
                    g.this.a(g.this.H);
                }
                g.this.h();
            }
        };
        this.A = airMapManager;
        this.C = afVar;
        this.I = new ArrayList<>();
        this.U = getResources().getDisplayMetrics().density;
        super.onCreate(null);
        super.onResume();
        super.getMapAsync(this);
        this.y = new ScaleGestureDetector(afVar, new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.airbnb.android.react.maps.g.1
            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                this.a();
                g.this.S = true;
                return true;
            }

            @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                g.this.S = false;
            }
        });
        this.z = new android.support.v4.j.d(afVar, new GestureDetector.SimpleOnGestureListener() { // from class: com.airbnb.android.react.maps.g.10
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                this.a();
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                g.this.S = true;
                if (g.this.p) {
                    g.this.a(motionEvent2);
                }
                this.a();
                return false;
            }
        });
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.airbnb.android.react.maps.g.11
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (!g.this.B) {
                    g.this.g();
                }
            }
        });
        this.R = new View.OnTouchListener() { // from class: com.airbnb.android.react.maps.g.12
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (g.this.z.a(motionEvent)) {
                    return true;
                }
                if (motionEvent.getAction() == 1 && g.this.S) {
                    g.this.S = false;
                    g.this.h();
                }
                return false;
            }
        };
        this.f1388b = ((UIManagerModule) afVar.b(UIManagerModule.class)).getEventDispatcher();
        this.T = new ImageView(getContext());
        this.T.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.T.setVisibility(0);
        this.T.setImageDrawable(getResources().getDrawable(com.a.a.a.d.a(null), null));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.T.getDrawable().getIntrinsicWidth(), this.T.getDrawable().getIntrinsicHeight());
        layoutParams.gravity = 17;
        this.T.setLayoutParams(layoutParams);
        addView(this.T);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(final GoogleMap googleMap) {
        this.f1387a = googleMap;
        this.f1387a.setInfoWindowAdapter(this);
        this.f1387a.setOnMarkerDragListener(this);
        this.f1387a.getUiSettings().setMyLocationButtonEnabled(false);
        this.f1387a.getUiSettings().setMapToolbarEnabled(false);
        this.A.pushEvent(this, "onMapReady", new WritableNativeMap());
        int round = Math.round(this.U);
        int i = round * 4;
        int i2 = round * 84;
        this.f1387a.setPadding(i, i2, i, i2);
        googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: com.airbnb.android.react.maps.g.13
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public boolean onMarkerClick(Marker marker) {
                ar a2 = g.this.a(marker.getPosition());
                a2.putString("action", "marker-press");
                g.this.A.pushEvent(this, "onMarkerPress", a2);
                ar a3 = g.this.a(marker.getPosition());
                a3.putString("action", "marker-press");
                g.this.A.pushEvent((View) g.this.u.get(marker), "onPress", a3);
                return false;
            }
        });
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() { // from class: com.airbnb.android.react.maps.g.14
            @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
            public void onInfoWindowClick(Marker marker) {
                ar a2 = g.this.a(marker.getPosition());
                a2.putString("action", "callout-press");
                g.this.A.pushEvent(this, "onCalloutPress", a2);
                ar a3 = g.this.a(marker.getPosition());
                a3.putString("action", "callout-press");
                d dVar = (d) g.this.u.get(marker);
                g.this.A.pushEvent(dVar, "onCalloutPress", a3);
                ar a4 = g.this.a(marker.getPosition());
                a4.putString("action", "callout-press");
                if (dVar != null) {
                    g.this.A.pushEvent(dVar.getCalloutView(), "onPress", a4);
                }
            }
        });
        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() { // from class: com.airbnb.android.react.maps.g.15
            @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
            public void onMapClick(LatLng latLng) {
                ar a2 = g.this.a(latLng);
                a2.putString("action", "press");
                g.this.A.pushEvent(this, "onPress", a2);
            }
        });
        googleMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() { // from class: com.airbnb.android.react.maps.g.16
            @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
            public void onMapLongClick(LatLng latLng) {
                g.this.a(latLng).putString("action", "long-press");
                g.this.A.pushEvent(this, "onLongPress", g.this.a(latLng));
            }
        });
        googleMap.setOnCameraChangeListener(new GoogleMap.OnCameraChangeListener() { // from class: com.airbnb.android.react.maps.g.17
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
            public void onCameraChange(CameraPosition cameraPosition) {
                LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
                LatLng latLng = cameraPosition.target;
                g.this.V = latLngBounds;
                g.this.f1388b.a(new k(g.this.getId(), latLngBounds, latLng, g.this.o));
                this.b();
            }
        });
        googleMap.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback() { // from class: com.airbnb.android.react.maps.g.2
            @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
            public void onMapLoaded() {
                g.this.i = true;
                g.this.g();
            }
        });
        googleMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.airbnb.android.react.maps.g.3
            @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
            public void onCameraMove() {
                if (g.this.G != com.a.a.a.e.None || g.this.H != null || googleMap == null || googleMap.getCameraPosition() == null) {
                    return;
                }
                g.this.F = Math.max(googleMap.getCameraPosition().zoom, 5.0f);
                LatLngBounds latLngBounds = googleMap.getProjection().getVisibleRegion().latLngBounds;
            }
        });
        x xVar = new x() { // from class: com.airbnb.android.react.maps.g.4
            @Override // com.facebook.react.bridge.x
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.x
            public void onHostResume() {
                if (g.this.c()) {
                    googleMap.setMyLocationEnabled(g.this.m);
                }
                synchronized (g.this) {
                    g.this.onResume();
                    g.this.B = false;
                }
            }

            @Override // com.facebook.react.bridge.x
            public void onHostPause() {
                if (g.this.c()) {
                    googleMap.setMyLocationEnabled(false);
                }
                g.this.B = true;
            }
        };
        if (this.D != null) {
            a(this.D, UIMsg.d_ResultType.SHORT_URL);
        } else if (this.E != null) {
            a(this.E, UIMsg.d_ResultType.SHORT_URL);
        }
        this.C.a(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return android.support.v4.a.d.a(getContext(), s[0]) == 0 || android.support.v4.a.d.a(getContext(), s[1]) == 0;
    }

    public void setRegion(an anVar) {
        if (anVar == null) {
            return;
        }
        Double valueOf = Double.valueOf(anVar.getDouble("longitude"));
        Double valueOf2 = Double.valueOf(anVar.getDouble("latitude"));
        Double valueOf3 = Double.valueOf(anVar.getDouble("longitudeDelta"));
        Double valueOf4 = Double.valueOf(anVar.getDouble("latitudeDelta"));
        if (Math.abs(valueOf2.doubleValue()) > 90.0d || Math.abs(valueOf.doubleValue()) > 180.0d) {
            return;
        }
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() - (valueOf3.doubleValue() / 2.0d)), new LatLng(valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() + (valueOf3.doubleValue() / 2.0d)));
        if (super.getHeight() <= 0 || super.getWidth() <= 0) {
            this.f1387a.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(valueOf2.doubleValue(), valueOf.doubleValue()), 10.0f));
            this.l = latLngBounds;
            return;
        }
        this.f1387a.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
        this.l = null;
    }

    public void setShowsUserLocation(boolean z) {
        this.m = z;
        if (c()) {
            this.f1387a.setMyLocationEnabled(z);
        }
    }

    public void setShowsMyLocationButton(boolean z) {
        if (c()) {
            this.f1387a.getUiSettings().setMyLocationButtonEnabled(z);
        }
    }

    public void setToolbarEnabled(boolean z) {
        if (c()) {
            this.f1387a.getUiSettings().setMapToolbarEnabled(z);
        }
    }

    public void setCacheEnabled(boolean z) {
        this.q = z;
        g();
    }

    public void a(boolean z) {
        if (!z || this.i.booleanValue()) {
            return;
        }
        getMapLoadingLayoutView().setVisibility(0);
    }

    public void setLoadingBackgroundColor(Integer num) {
        this.j = num;
        if (this.g != null) {
            if (num == null) {
                this.g.setBackgroundColor(-1);
            } else {
                this.g.setBackgroundColor(this.j.intValue());
            }
        }
    }

    public void setLoadingIndicatorColor(Integer num) {
        this.k = num;
        if (this.f != null) {
            Integer valueOf = num == null ? Integer.valueOf(Color.parseColor("#606060")) : num;
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList valueOf2 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf3 = ColorStateList.valueOf(num.intValue());
                ColorStateList valueOf4 = ColorStateList.valueOf(num.intValue());
                this.f.setProgressTintList(valueOf2);
                this.f.setSecondaryProgressTintList(valueOf3);
                this.f.setIndeterminateTintList(valueOf4);
                return;
            }
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            if (Build.VERSION.SDK_INT <= 10) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (this.f.getIndeterminateDrawable() != null) {
                this.f.getIndeterminateDrawable().setColorFilter(valueOf.intValue(), mode);
            }
            if (this.f.getProgressDrawable() == null) {
                return;
            }
            this.f.getProgressDrawable().setColorFilter(valueOf.intValue(), mode);
        }
    }

    public void setHandlePanDrag(boolean z) {
        this.p = z;
    }

    public void a(View view, int i) {
        if (view instanceof d) {
            d dVar = (d) view;
            dVar.a(this.f1387a);
            this.t.add(i, dVar);
            this.u.put((Marker) dVar.getFeature(), dVar);
        } else if (view instanceof f) {
            f fVar = (f) view;
            fVar.a(this.f1387a);
            this.t.add(i, fVar);
            this.v.put((Polyline) fVar.getFeature(), fVar);
        } else if (view instanceof e) {
            e eVar = (e) view;
            eVar.a(this.f1387a);
            this.t.add(i, eVar);
            this.w.put((Polygon) eVar.getFeature(), eVar);
        } else if (view instanceof b) {
            b bVar = (b) view;
            bVar.a(this.f1387a);
            this.t.add(i, bVar);
            this.x.put((Circle) bVar.getFeature(), bVar);
        } else if (!(view instanceof m)) {
        } else {
            this.N = (m) view;
            this.N.a(this.f1387a);
            this.t.add(i, this.N);
            if (this.T != null) {
                this.N.setCenterMarker(this.T);
                this.N.setType(this.N.getType());
                this.T.setRotation((float) this.N.getLocationInfo().b());
            }
            if (this.L != null) {
                return;
            }
            this.L = this.N.getLocationInfo();
        }
    }

    public int getFeatureCount() {
        return this.t.size();
    }

    public View a(int i) {
        return this.t.get(i);
    }

    public void b(int i) {
        c remove = this.t.remove(i);
        if (remove instanceof d) {
            this.u.remove(remove.getFeature());
        }
        remove.b(this.f1387a);
    }

    public ar a(LatLng latLng) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("latitude", latLng.latitude);
        writableNativeMap2.putDouble("longitude", latLng.longitude);
        writableNativeMap.a("coordinate", writableNativeMap2);
        Point screenLocation = this.f1387a.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putDouble("x", screenLocation.x);
        writableNativeMap3.putDouble("y", screenLocation.y);
        writableNativeMap.a("position", writableNativeMap3);
        return writableNativeMap;
    }

    public void a(Object obj) {
        if (this.l != null) {
            HashMap hashMap = (HashMap) obj;
            this.f1387a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.l, (int) ((Float) hashMap.get("width")).floatValue(), (int) ((Float) hashMap.get("height")).floatValue(), 0));
            this.l = null;
        }
    }

    public void a(LatLngBounds latLngBounds, int i) {
        if (super.getHeight() <= 0 || super.getWidth() <= 0 || this.f1387a == null) {
            this.D = latLngBounds;
            return;
        }
        a();
        this.f1387a.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0), i, null);
    }

    public void a(LatLng latLng, int i) {
        if (super.getHeight() <= 0 || super.getWidth() <= 0 || this.f1387a == null) {
            this.E = latLng;
            return;
        }
        a();
        this.f1387a.animateCamera(CameraUpdateFactory.newLatLng(latLng), i, null);
    }

    public void b(boolean z) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        boolean z2 = false;
        for (c cVar : this.t) {
            if (cVar instanceof d) {
                builder.include(((Marker) cVar.getFeature()).getPosition());
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), P);
        if (z) {
            a();
            this.f1387a.animateCamera(newLatLngBounds);
            return;
        }
        this.f1387a.moveCamera(newLatLngBounds);
    }

    public void a(am amVar, boolean z) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        String[] strArr = new String[amVar.size()];
        boolean z2 = false;
        for (int i = 0; i < amVar.size(); i++) {
            strArr[i] = amVar.getString(i);
        }
        List asList = Arrays.asList(strArr);
        for (c cVar : this.t) {
            if (cVar instanceof d) {
                String identifier = ((d) cVar).getIdentifier();
                Marker marker = (Marker) cVar.getFeature();
                if (asList.contains(identifier)) {
                    builder.include(marker.getPosition());
                    z2 = true;
                }
            }
        }
        if (z2) {
            CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), 50);
            if (z) {
                a();
                this.f1387a.animateCamera(newLatLngBounds);
                return;
            }
            this.f1387a.moveCamera(newLatLngBounds);
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        d dVar = this.u.get(marker);
        if (dVar != null) {
            return dVar.getCallout();
        }
        return null;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        d dVar = this.u.get(marker);
        if (dVar != null) {
            return dVar.getInfoContents();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.y.onTouchEvent(motionEvent);
        this.z.a(motionEvent);
        switch (android.support.v4.j.i.a(motionEvent)) {
            case 0:
                getParent().requestDisallowInterceptTouchEvent(true);
                this.o = true;
                a(com.a.a.a.e.None);
                this.A.pushEvent(this, "onMapTouched", new WritableNativeMap());
                break;
            case 1:
                getParent().requestDisallowInterceptTouchEvent(false);
                this.o = false;
                break;
            case 2:
                a();
                break;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public void a() {
        if (this.n) {
            return;
        }
        this.f1389c.postDelayed(this.f1390d, 100L);
        this.n = true;
    }

    public void b() {
        if (!this.n) {
            return;
        }
        this.f1389c.removeCallbacks(this.f1390d);
        this.n = false;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(Marker marker) {
        this.A.pushEvent(this, "onMarkerDragStart", a(marker.getPosition()));
        ar a2 = a(marker.getPosition());
        this.A.pushEvent(this.u.get(marker), "onDragStart", a2);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(Marker marker) {
        this.A.pushEvent(this, "onMarkerDrag", a(marker.getPosition()));
        ar a2 = a(marker.getPosition());
        this.A.pushEvent(this.u.get(marker), "onDrag", a2);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(Marker marker) {
        this.A.pushEvent(this, "onMarkerDragEnd", a(marker.getPosition()));
        ar a2 = a(marker.getPosition());
        this.A.pushEvent(this.u.get(marker), "onDragEnd", a2);
    }

    private ProgressBar getMapLoadingProgressBar() {
        if (this.f == null) {
            this.f = new ProgressBar(getContext());
            this.f.setIndeterminate(true);
        }
        if (this.k != null) {
            setLoadingIndicatorColor(this.k);
        }
        return this.f;
    }

    private RelativeLayout getMapLoadingLayoutView() {
        if (this.g == null) {
            this.g = new RelativeLayout(getContext());
            this.g.setBackgroundColor(-3355444);
            addView(this.g, new ViewGroup.LayoutParams(-1, -1));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.g.addView(getMapLoadingProgressBar(), layoutParams);
            this.g.setVisibility(4);
        }
        setLoadingBackgroundColor(this.j);
        return this.g;
    }

    private ImageView getCacheImageView() {
        if (this.h == null) {
            this.h = new ImageView(getContext());
            addView(this.h, new ViewGroup.LayoutParams(-1, -1));
            this.h.setVisibility(4);
        }
        return this.h;
    }

    private void d() {
        if (this.h != null) {
            ((ViewGroup) this.h.getParent()).removeView(this.h);
            this.h = null;
        }
    }

    private void e() {
        if (this.f != null) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
            this.f = null;
        }
    }

    private void f() {
        e();
        if (this.g != null) {
            ((ViewGroup) this.g.getParent()).removeView(this.g);
            this.g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.q) {
            final ImageView cacheImageView = getCacheImageView();
            final RelativeLayout mapLoadingLayoutView = getMapLoadingLayoutView();
            cacheImageView.setVisibility(4);
            mapLoadingLayoutView.setVisibility(0);
            if (!this.i.booleanValue()) {
                return;
            }
            this.f1387a.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: com.airbnb.android.react.maps.g.6
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public void onSnapshotReady(Bitmap bitmap) {
                    cacheImageView.setImageBitmap(bitmap);
                    cacheImageView.setVisibility(0);
                    mapLoadingLayoutView.setVisibility(4);
                }
            });
            return;
        }
        d();
        if (!this.i.booleanValue()) {
            return;
        }
        f();
    }

    public void a(MotionEvent motionEvent) {
        this.A.pushEvent(this, "onPanDrag", a(this.f1387a.getProjection().fromScreenLocation(new Point((int) motionEvent.getX(), (int) motionEvent.getY()))));
    }

    public void a(Double d2, Double d3, Double d4, Double d5) {
        if (d2 == null || d3 == null || d4 == null || d5 == null) {
            Log.e(e, "Got null data in vehicle update");
            return;
        }
        com.a.a.a.b bVar = new com.a.a.a.b(d2.doubleValue(), d3.doubleValue(), d4.doubleValue(), d5);
        this.I.add(bVar);
        while (this.I.size() >= this.J) {
            this.I.remove(0);
        }
        if (this.L == null) {
            this.L = bVar;
        }
        if (this.K || this.N == null || !this.i.booleanValue()) {
            return;
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        LatLngBounds i;
        if (this.I.size() == 0 || this.K) {
            return;
        }
        com.a.a.a.b remove = this.I.remove(0);
        while (true) {
            com.a.a.a.b bVar = remove;
            if (bVar.a() < this.L.a()) {
                if (this.I.size() <= 0) {
                    return;
                }
                remove = this.I.remove(0);
            } else {
                int a2 = (int) (bVar.a() - this.L.a());
                if (a2 > 1000 || a2 <= 0) {
                    a2 = O;
                }
                a(bVar, a2);
                if (this.G == com.a.a.a.e.Vehicle || this.H == com.a.a.a.e.Vehicle) {
                    b(bVar, a2);
                    return;
                } else if (this.G == com.a.a.a.e.Device) {
                    c(this.M, a2);
                    return;
                } else if (this.G == com.a.a.a.e.None || this.G != com.a.a.a.e.Both || (i = i()) == null || this.o) {
                    return;
                } else {
                    if (i.southwest.equals(i.northeast)) {
                        this.f1387a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(i.southwest.latitude, i.southwest.longitude), this.F));
                        return;
                    } else {
                        this.f1387a.animateCamera(CameraUpdateFactory.newLatLngBounds(i, P), a2, this.aa);
                        return;
                    }
                }
            }
        }
    }

    private void a(com.a.a.a.b bVar, int i) {
        if (this.N == null || this.N.getFeature() == null) {
            return;
        }
        this.K = true;
        LatLng latLng = new LatLng(bVar.d(), bVar.c());
        this.L = bVar;
        Marker marker = (Marker) this.N.getFeature();
        float b2 = (float) bVar.b();
        if (marker.getRotation() > 270.0f && b2 < 90.0f) {
            b2 += 360.0f;
        }
        if (marker.getRotation() < 90.0f && b2 > 270.0f) {
            b2 -= 360.0f;
        }
        float f = 1.0f;
        marker.setAlpha(this.G == com.a.a.a.e.Vehicle ? BitmapDescriptorFactory.HUE_RED : 1.0f);
        if (this.T != null) {
            ImageView imageView = this.T;
            if (this.G != com.a.a.a.e.Vehicle) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            imageView.setAlpha(f);
            com.a.a.a.c.a(this.T, Float.valueOf(b2), null, i);
        }
        com.a.a.a.c.a(marker, latLng, Float.valueOf(b2), this.Q, this.W, i);
    }

    private void b(com.a.a.a.b bVar, int i) {
        if (this.o) {
            return;
        }
        LatLng latLng = new LatLng(bVar.d(), bVar.c());
        this.L = bVar;
        this.f1387a.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, this.F), i, this.ab);
    }

    private void c(com.a.a.a.b bVar, int i) {
        if (this.o || bVar == null) {
            return;
        }
        this.f1387a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(bVar.d(), bVar.c()), this.F), i, this.aa);
    }

    public void a(Double d2, Double d3, Double d4) {
        if (d2 == null || d3 == null || d4 == null) {
            return;
        }
        if (this.M != null) {
            if (this.M.a() > d4.doubleValue()) {
                return;
            }
            if (this.M.d() == d2.doubleValue() && this.M.c() == d3.doubleValue()) {
                return;
            }
        }
        this.M = new com.a.a.a.b(d2.doubleValue(), d3.doubleValue(), 0.0d, d4);
        if (this.G != com.a.a.a.e.Device && this.G != com.a.a.a.e.Both) {
            return;
        }
        if (this.I.size() == 0 && this.L != null) {
            this.I.add(this.L);
        }
        h();
    }

    public void setTrackingType(com.a.a.a.e eVar) {
        if (this.G == eVar) {
            return;
        }
        if (eVar == com.a.a.a.e.Vehicle) {
            this.H = com.a.a.a.e.Vehicle;
        } else {
            this.H = null;
            this.G = eVar;
        }
        if (this.L == null || this.N == null) {
            return;
        }
        this.I.add(this.L);
        h();
    }

    private LatLngBounds i() {
        boolean z;
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (this.M != null) {
            builder.include(this.M.e());
            z = true;
        } else {
            z = false;
        }
        if (this.L != null) {
            builder.include(this.L.e());
            z = true;
        }
        if (!z) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.a.a.a.e eVar) {
        this.H = null;
        this.G = eVar;
        if (this.T == null || this.N == null) {
            return;
        }
        ImageView imageView = this.T;
        com.a.a.a.e eVar2 = com.a.a.a.e.Vehicle;
        float f = BitmapDescriptorFactory.HUE_RED;
        imageView.setAlpha(eVar == eVar2 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        Marker marker = (Marker) this.N.getFeature();
        if (marker == null) {
            return;
        }
        if (eVar != com.a.a.a.e.Vehicle) {
            f = 1.0f;
        }
        marker.setAlpha(f);
    }
}
