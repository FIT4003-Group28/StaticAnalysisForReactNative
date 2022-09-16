package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.model.ParcelItem;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.C;
import com.baidu.platform.comapi.map.C0132e;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.E;
import com.baidu.platform.comapi.map.EnumC0135h;
import com.baidu.platform.comapi.map.GestureDetector$OnDoubleTapListenerC0136i;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class BaiduMap {
    public static final int MAP_TYPE_NONE = 3;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    private static final String e = "BaiduMap";
    private OnBaseIndoorMapListener A;
    private TileOverlay B;
    private HeatMap C;
    private Lock D;
    private Lock E;
    private InfoWindow F;
    private Marker G;
    private View H;
    private Marker I;
    private MyLocationData J;
    private MyLocationConfiguration K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private Point P;

    /* renamed from: a  reason: collision with root package name */
    MapView f1550a;

    /* renamed from: b  reason: collision with root package name */
    TextureMapView f1551b;

    /* renamed from: c  reason: collision with root package name */
    WearMapView f1552c;

    /* renamed from: d  reason: collision with root package name */
    C f1553d;
    private Projection f;
    private UiSettings g;
    private GestureDetector$OnDoubleTapListenerC0136i h;
    private C0132e i;
    private E j;
    private List<Overlay> k;
    private List<Marker> l;
    private List<Marker> m;
    private Overlay.a n;
    private OnMapStatusChangeListener o;
    private OnMapTouchListener p;
    private OnMapClickListener q;
    private OnMapLoadedCallback r;
    private OnMapDoubleClickListener s;
    private OnMapLongClickListener t;
    private CopyOnWriteArrayList<OnMarkerClickListener> u;
    private CopyOnWriteArrayList<OnPolylineClickListener> v;
    private OnMarkerDragListener w;
    private OnMyLocationClickListener x;
    private SnapshotReadyCallback y;
    private OnMapDrawFrameCallback z;

    /* loaded from: classes.dex */
    public interface OnBaseIndoorMapListener {
        void onBaseIndoorMapMode(boolean z, MapBaseIndoorMapInfo mapBaseIndoorMapInfo);
    }

    /* loaded from: classes.dex */
    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);

        boolean onMapPoiClick(MapPoi mapPoi);
    }

    /* loaded from: classes.dex */
    public interface OnMapDoubleClickListener {
        void onMapDoubleClick(LatLng latLng);
    }

    /* loaded from: classes.dex */
    public interface OnMapDrawFrameCallback {
        void onMapDrawFrame(GL10 gl10, MapStatus mapStatus);
    }

    /* loaded from: classes.dex */
    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    /* loaded from: classes.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    /* loaded from: classes.dex */
    public interface OnMapStatusChangeListener {
        void onMapStatusChange(MapStatus mapStatus);

        void onMapStatusChangeFinish(MapStatus mapStatus);

        void onMapStatusChangeStart(MapStatus mapStatus);
    }

    /* loaded from: classes.dex */
    public interface OnMapTouchListener {
        void onTouch(MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    /* loaded from: classes.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    /* loaded from: classes.dex */
    public interface OnMyLocationClickListener {
        boolean onMyLocationClick();
    }

    /* loaded from: classes.dex */
    public interface OnPolylineClickListener {
        boolean onPolylineClick(Polyline polyline);
    }

    /* loaded from: classes.dex */
    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaiduMap(E e2) {
        this.u = new CopyOnWriteArrayList<>();
        this.v = new CopyOnWriteArrayList<>();
        this.D = new ReentrantLock();
        this.E = new ReentrantLock();
        this.j = e2;
        this.i = this.j.b();
        this.f1553d = C.TextureView;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaiduMap(GestureDetector$OnDoubleTapListenerC0136i gestureDetector$OnDoubleTapListenerC0136i) {
        this.u = new CopyOnWriteArrayList<>();
        this.v = new CopyOnWriteArrayList<>();
        this.D = new ReentrantLock();
        this.E = new ReentrantLock();
        this.h = gestureDetector$OnDoubleTapListenerC0136i;
        this.i = this.h.a();
        this.f1553d = C.GLSurfaceView;
        c();
    }

    private Point a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (String str2 : str.replaceAll("^\\{", "").replaceAll("\\}$", "").split(",")) {
            String[] split = str2.replaceAll("\"", "").split(":");
            if ("x".equals(split[0])) {
                i = Integer.valueOf(split[1]).intValue();
            }
            if ("y".equals(split[0])) {
                i2 = Integer.valueOf(split[1]).intValue();
            }
        }
        return new Point(i, i2);
    }

    private D a(MapStatusUpdate mapStatusUpdate) {
        if (this.i == null) {
            return null;
        }
        return mapStatusUpdate.a(this.i, getMapStatus()).b(this.i.D());
    }

    private final void a(MyLocationData myLocationData, MyLocationConfiguration myLocationConfiguration) {
        Bundle bundle;
        MapStatus.Builder zoom;
        float f;
        if (myLocationData == null || myLocationConfiguration == null || !isMyLocationEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LatLng latLng = new LatLng(myLocationData.latitude, myLocationData.longitude);
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        try {
            jSONObject.put("type", 0);
            jSONObject2.put("ptx", ll2mc.getLongitudeE6());
            jSONObject2.put("pty", ll2mc.getLatitudeE6());
            jSONObject2.put("radius", CoordUtil.getMCDistanceByOneLatLngAndRadius(latLng, (int) myLocationData.accuracy));
            float f2 = myLocationData.direction;
            if (myLocationConfiguration.enableDirection) {
                f = myLocationData.direction % 360.0f;
                if (f > 180.0f) {
                    f -= 360.0f;
                } else if (f < -180.0f) {
                    f += 360.0f;
                }
            } else {
                f = -1.0f;
            }
            jSONObject2.put("direction", f);
            jSONObject2.put("iconarrownor", "NormalLocArrow");
            jSONObject2.put("iconarrownorid", 28);
            jSONObject2.put("iconarrowfoc", "FocusLocArrow");
            jSONObject2.put("iconarrowfocid", 29);
            jSONObject2.put("lineid", myLocationConfiguration.accuracyCircleStrokeColor);
            jSONObject2.put("areaid", myLocationConfiguration.accuracyCircleFillColor);
            jSONArray.put(jSONObject2);
            jSONObject.put(DataBufferSafeParcelable.DATA_FIELD, jSONArray);
            if (myLocationConfiguration.locationMode == MyLocationConfiguration.LocationMode.COMPASS) {
                jSONObject3.put("ptx", ll2mc.getLongitudeE6());
                jSONObject3.put("pty", ll2mc.getLatitudeE6());
                jSONObject3.put("radius", 0);
                jSONObject3.put("direction", 0);
                jSONObject3.put("iconarrownor", "direction_wheel");
                jSONObject3.put("iconarrownorid", 54);
                jSONObject3.put("iconarrowfoc", "direction_wheel");
                jSONObject3.put("iconarrowfocid", 54);
                jSONArray.put(jSONObject3);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (myLocationConfiguration.customMarker == null) {
            bundle = null;
        } else {
            ArrayList<BitmapDescriptor> arrayList = new ArrayList();
            arrayList.add(myLocationConfiguration.customMarker);
            Bundle bundle2 = new Bundle();
            ArrayList arrayList2 = new ArrayList();
            for (BitmapDescriptor bitmapDescriptor : arrayList) {
                ParcelItem parcelItem = new ParcelItem();
                Bundle bundle3 = new Bundle();
                Bitmap bitmap = bitmapDescriptor.f1560a;
                ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
                bitmap.copyPixelsToBuffer(allocate);
                bundle3.putByteArray("imgdata", allocate.array());
                bundle3.putInt("imgindex", bitmapDescriptor.hashCode());
                bundle3.putInt("imgH", bitmap.getHeight());
                bundle3.putInt("imgW", bitmap.getWidth());
                parcelItem.setBundle(bundle3);
                arrayList2.add(parcelItem);
            }
            if (arrayList2.size() > 0) {
                ParcelItem[] parcelItemArr = new ParcelItem[arrayList2.size()];
                for (int i = 0; i < arrayList2.size(); i++) {
                    parcelItemArr[i] = (ParcelItem) arrayList2.get(i);
                }
                bundle2.putParcelableArray("icondata", parcelItemArr);
            }
            bundle = bundle2;
        }
        if (this.i != null) {
            this.i.a(jSONObject.toString(), bundle);
        }
        switch (myLocationConfiguration.locationMode) {
            case COMPASS:
                zoom = new MapStatus.Builder().rotate(myLocationData.direction).overlook(-45.0f).target(new LatLng(myLocationData.latitude, myLocationData.longitude)).targetScreen(getMapStatus().targetScreen).zoom(getMapStatus().zoom);
                break;
            case FOLLOWING:
                zoom = new MapStatus.Builder().target(new LatLng(myLocationData.latitude, myLocationData.longitude)).zoom(getMapStatus().zoom).rotate(getMapStatus().rotate).overlook(getMapStatus().overlook).targetScreen(getMapStatus().targetScreen);
                break;
            case NORMAL:
                return;
            default:
                return;
        }
        animateMapStatus(MapStatusUpdateFactory.newMapStatus(zoom.build()));
    }

    private void c() {
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.P = new Point((int) (SysOSUtil.getDensity() * 40.0f), (int) (SysOSUtil.getDensity() * 40.0f));
        this.g = new UiSettings(this.i);
        this.n = new a(this);
        this.i.a(new b(this));
        this.i.a(new c(this));
        this.i.a(new d(this));
        this.L = this.i.B();
        this.M = this.i.C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.i == null) {
            return;
        }
        this.i.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(HeatMap heatMap) {
        this.D.lock();
        try {
            if (this.C != null && this.i != null && heatMap == this.C) {
                this.C.b();
                this.C.c();
                this.C.f1596a = null;
                this.i.n();
                this.C = null;
                this.i.l(false);
            }
        } finally {
            this.D.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TileOverlay tileOverlay) {
        this.E.lock();
        if (tileOverlay != null) {
            try {
                if (this.B == tileOverlay) {
                    tileOverlay.b();
                    tileOverlay.f1698a = null;
                    if (this.i != null) {
                        this.i.c(false);
                    }
                }
            } finally {
                this.B = null;
                this.E.unlock();
            }
        }
    }

    public void addHeatMap(HeatMap heatMap) {
        if (heatMap == null) {
            return;
        }
        this.D.lock();
        try {
            if (heatMap == this.C) {
                return;
            }
            if (this.C != null) {
                this.C.b();
                this.C.c();
                this.C.f1596a = null;
                this.i.n();
            }
            this.C = heatMap;
            this.C.f1596a = this;
            this.i.l(true);
        } finally {
            this.D.unlock();
        }
    }

    public final Overlay addOverlay(OverlayOptions overlayOptions) {
        if (overlayOptions == null) {
            return null;
        }
        Overlay a2 = overlayOptions.a();
        a2.listener = this.n;
        if (a2 instanceof Marker) {
            Marker marker = (Marker) a2;
            if (marker.n != null && marker.n.size() != 0) {
                this.l.add(marker);
                if (this.i != null) {
                    this.i.b(true);
                }
            }
            this.m.add(marker);
        }
        Bundle bundle = new Bundle();
        a2.a(bundle);
        if (this.i != null) {
            this.i.b(bundle);
        }
        this.k.add(a2);
        return a2;
    }

    public final List<Overlay> addOverlays(List<OverlayOptions> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Bundle[] bundleArr = new Bundle[list.size()];
        int i = 0;
        for (OverlayOptions overlayOptions : list) {
            if (overlayOptions != null) {
                Bundle bundle = new Bundle();
                Overlay a2 = overlayOptions.a();
                a2.listener = this.n;
                if (a2 instanceof Marker) {
                    Marker marker = (Marker) a2;
                    if (marker.n != null && marker.n.size() != 0) {
                        this.l.add(marker);
                        if (this.i != null) {
                            this.i.b(true);
                        }
                    }
                    this.m.add(marker);
                }
                this.k.add(a2);
                arrayList.add(a2);
                a2.a(bundle);
                bundleArr[i] = bundle;
                i++;
            }
        }
        int length = bundleArr.length / 400;
        for (int i2 = 0; i2 < length + 1; i2++) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < 400; i3++) {
                int i4 = (i2 * 400) + i3;
                if (i4 >= bundleArr.length) {
                    break;
                }
                if (bundleArr[i4] != null) {
                    arrayList2.add(bundleArr[i4]);
                }
            }
            if (this.i != null) {
                this.i.a(arrayList2);
            }
        }
        return arrayList;
    }

    public TileOverlay addTileLayer(TileOverlayOptions tileOverlayOptions) {
        if (tileOverlayOptions == null) {
            return null;
        }
        if (this.B != null) {
            this.B.b();
            this.B.f1698a = null;
        }
        if (this.i == null || !this.i.a(tileOverlayOptions.a())) {
            return null;
        }
        TileOverlay a2 = tileOverlayOptions.a(this);
        this.B = a2;
        return a2;
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate) {
        animateMapStatus(mapStatusUpdate, 300);
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate, int i) {
        if (mapStatusUpdate == null || i <= 0) {
            return;
        }
        D a2 = a(mapStatusUpdate);
        if (this.i == null) {
            return;
        }
        if (!this.O) {
            this.i.a(a2);
        } else {
            this.i.a(a2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.i == null) {
            return false;
        }
        return this.i.d();
    }

    public final void clear() {
        this.k.clear();
        this.l.clear();
        this.m.clear();
        if (this.i != null) {
            this.i.b(false);
            this.i.m();
        }
        hideInfoWindow();
    }

    public final Point getCompassPosition() {
        if (this.i != null) {
            return a(this.i.g());
        }
        return null;
    }

    public MapBaseIndoorMapInfo getFocusedBaseIndoorMapInfo() {
        return this.i.o();
    }

    public final MyLocationConfiguration getLocationConfigeration() {
        return this.K;
    }

    public final MyLocationData getLocationData() {
        return this.J;
    }

    public final MapStatus getMapStatus() {
        if (this.i == null) {
            return null;
        }
        return MapStatus.a(this.i.D());
    }

    public final LatLngBounds getMapStatusLimit() {
        if (this.i == null) {
            return null;
        }
        return this.i.E();
    }

    public final int getMapType() {
        if (this.i == null) {
            return 1;
        }
        if (!this.i.k()) {
            return 3;
        }
        return this.i.j() ? 2 : 1;
    }

    public List<Marker> getMarkersInBounds(LatLngBounds latLngBounds) {
        if (getMapStatus() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.m.size() == 0) {
            return null;
        }
        for (Marker marker : this.m) {
            if (latLngBounds.contains(marker.getPosition())) {
                arrayList.add(marker);
            }
        }
        return arrayList;
    }

    public final float getMaxZoomLevel() {
        return this.i == null ? com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED : this.i.f2056a;
    }

    public final float getMinZoomLevel() {
        return this.i == null ? com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED : this.i.f2057b;
    }

    public final Projection getProjection() {
        return this.f;
    }

    public final UiSettings getUiSettings() {
        return this.g;
    }

    public void hideInfoWindow() {
        if (this.F != null) {
            if (this.F.f1602b != null) {
                switch (this.f1553d) {
                    case TextureView:
                        if (this.f1551b != null) {
                            this.f1551b.removeView(this.H);
                            break;
                        }
                        break;
                    case GLSurfaceView:
                        if (this.h != null) {
                            this.f1550a.removeView(this.H);
                            break;
                        }
                        break;
                }
                this.H = null;
            }
            this.F = null;
            this.G.remove();
            this.G = null;
        }
    }

    public final boolean isBaiduHeatMapEnabled() {
        if (this.i == null) {
            return false;
        }
        return this.i.h();
    }

    public boolean isBaseIndoorMapMode() {
        return this.i.p();
    }

    public final boolean isBuildingsEnabled() {
        if (this.i == null) {
            return false;
        }
        return this.i.l();
    }

    public final boolean isMyLocationEnabled() {
        if (this.i == null) {
            return false;
        }
        return this.i.r();
    }

    public final boolean isSupportBaiduHeatMap() {
        if (this.i == null) {
            return false;
        }
        return this.i.i();
    }

    public final boolean isTrafficEnabled() {
        if (this.i == null) {
            return false;
        }
        return this.i.f();
    }

    public final void removeMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        if (this.u.contains(onMarkerClickListener)) {
            this.u.remove(onMarkerClickListener);
        }
    }

    public final void setBaiduHeatMapEnabled(boolean z) {
        if (this.i != null) {
            this.i.e(z);
        }
    }

    public final void setBuildingsEnabled(boolean z) {
        if (this.i != null) {
            this.i.g(z);
        }
    }

    public void setCompassIcon(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("compass's icon can not be null");
        }
        this.i.a(bitmap);
    }

    public void setCompassPosition(Point point) {
        if (this.i.a(point)) {
            this.P = point;
        }
    }

    public final void setIndoorEnable(boolean z) {
        if (this.i != null) {
            this.N = z;
            this.i.i(z);
        }
        if (this.A == null || z) {
            return;
        }
        this.A.onBaseIndoorMapMode(false, null);
    }

    public final void setMapStatus(MapStatusUpdate mapStatusUpdate) {
        if (mapStatusUpdate == null) {
            return;
        }
        D a2 = a(mapStatusUpdate);
        if (this.i == null) {
            return;
        }
        this.i.a(a2);
        if (this.o == null) {
            return;
        }
        this.o.onMapStatusChange(getMapStatus());
    }

    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
        if (this.i == null) {
            return;
        }
        this.i.a(latLngBounds);
        setMapStatus(MapStatusUpdateFactory.newLatLngBounds(latLngBounds));
    }

    public final void setMapType(int i) {
        C0132e c0132e;
        if (this.i == null) {
            return;
        }
        boolean z = false;
        switch (i) {
            case 1:
                this.i.a(false);
                this.i.q(this.L);
                this.i.r(this.M);
                this.i.d(true);
                c0132e = this.i;
                z = this.N;
                c0132e.i(z);
                break;
            case 2:
                this.i.a(true);
                this.i.q(this.L);
                this.i.r(this.M);
                this.i.d(true);
                break;
            case 3:
                if (this.i.B()) {
                    this.i.q(false);
                }
                if (this.i.C()) {
                    this.i.r(false);
                }
                this.i.d(false);
                c0132e = this.i;
                c0132e.i(z);
                break;
        }
        if (this.h == null) {
            return;
        }
        this.h.a(i);
    }

    public final void setMaxAndMinZoomLevel(float f, float f2) {
        if (f <= 21.0f && f2 >= 3.0f && f >= f2 && this.i != null) {
            this.i.a(f, f2);
        }
    }

    public final void setMyLocationConfigeration(MyLocationConfiguration myLocationConfiguration) {
        this.K = myLocationConfiguration;
        a(this.J, this.K);
    }

    public final void setMyLocationData(MyLocationData myLocationData) {
        this.J = myLocationData;
        if (this.K == null) {
            this.K = new MyLocationConfiguration(MyLocationConfiguration.LocationMode.NORMAL, false, null);
        }
        a(myLocationData, this.K);
    }

    public final void setMyLocationEnabled(boolean z) {
        if (this.i != null) {
            this.i.k(z);
        }
    }

    public final void setOnBaseIndoorMapListener(OnBaseIndoorMapListener onBaseIndoorMapListener) {
        this.A = onBaseIndoorMapListener;
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.q = onMapClickListener;
    }

    public final void setOnMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener) {
        this.s = onMapDoubleClickListener;
    }

    public final void setOnMapDrawFrameCallback(OnMapDrawFrameCallback onMapDrawFrameCallback) {
        this.z = onMapDrawFrameCallback;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
        this.r = onMapLoadedCallback;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.t = onMapLongClickListener;
    }

    public final void setOnMapStatusChangeListener(OnMapStatusChangeListener onMapStatusChangeListener) {
        this.o = onMapStatusChangeListener;
    }

    public final void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        this.p = onMapTouchListener;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null || this.u.contains(onMarkerClickListener)) {
            return;
        }
        this.u.add(onMarkerClickListener);
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        this.w = onMarkerDragListener;
    }

    public final void setOnMyLocationClickListener(OnMyLocationClickListener onMyLocationClickListener) {
        this.x = onMyLocationClickListener;
    }

    public final void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        if (onPolylineClickListener != null) {
            this.v.add(onPolylineClickListener);
        }
    }

    @Deprecated
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || this.i == null) {
            return;
        }
        this.i.D();
        switch (this.f1553d) {
            case TextureView:
                if (this.f1551b == null) {
                    return;
                }
                float width = ((this.f1551b.getWidth() - i) - i3) / this.f1551b.getWidth();
                float height = ((this.f1551b.getHeight() - i2) - i4) / this.f1551b.getHeight();
                MapStatusUpdate newMapStatus = MapStatusUpdateFactory.newMapStatus(new MapStatus.Builder().targetScreen(new Point(((this.f1551b.getWidth() + i) - i3) / 2, ((this.f1551b.getHeight() + i2) - i4) / 2)).build());
                this.i.a(new Point((int) (i + (this.P.x * width)), (int) (i2 + (this.P.y * height))));
                setMapStatus(newMapStatus);
                this.f1551b.setPadding(i, i2, i3, i4);
                this.f1551b.invalidate();
                return;
            case GLSurfaceView:
                if (this.f1550a == null) {
                    return;
                }
                float width2 = ((this.f1550a.getWidth() - i) - i3) / this.f1550a.getWidth();
                float height2 = ((this.f1550a.getHeight() - i2) - i4) / this.f1550a.getHeight();
                MapStatusUpdate newMapStatus2 = MapStatusUpdateFactory.newMapStatus(new MapStatus.Builder().targetScreen(new Point(((this.f1550a.getWidth() + i) - i3) / 2, ((this.f1550a.getHeight() + i2) - i4) / 2)).build());
                this.i.a(new Point((int) (i + (this.P.x * width2)), (int) (i2 + (this.P.y * height2))));
                setMapStatus(newMapStatus2);
                this.f1550a.setPadding(i, i2, i3, i4);
                this.f1550a.invalidate();
                return;
            default:
                return;
        }
    }

    public final void setTrafficEnabled(boolean z) {
        if (this.i != null) {
            this.i.f(z);
        }
    }

    public final void setViewPadding(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0 || this.i == null) {
            return;
        }
        switch (this.f1553d) {
            case TextureView:
                if (this.f1551b == null) {
                    return;
                }
                this.i.a(new Point((int) (i + (this.P.x * (((this.f1551b.getWidth() - i) - i3) / this.f1551b.getWidth()))), (int) (i2 + (this.P.y * (((this.f1551b.getHeight() - i2) - i4) / this.f1551b.getHeight())))));
                this.f1551b.setPadding(i, i2, i3, i4);
                this.f1551b.invalidate();
                return;
            case GLSurfaceView:
                if (this.f1550a == null) {
                    return;
                }
                this.i.a(new Point((int) (i + (this.P.x * (((this.f1550a.getWidth() - i) - i3) / this.f1550a.getWidth()))), (int) (i2 + (this.P.y * (((this.f1550a.getHeight() - i2) - i4) / this.f1550a.getHeight())))));
                this.f1550a.setPadding(i, i2, i3, i4);
                this.f1550a.invalidate();
                return;
            default:
                return;
        }
    }

    public void showInfoWindow(InfoWindow infoWindow) {
        if (infoWindow != null) {
            hideInfoWindow();
            if (infoWindow.f1602b != null) {
                this.H = infoWindow.f1602b;
                this.H.destroyDrawingCache();
                MapViewLayoutParams build = new MapViewLayoutParams.Builder().layoutMode(MapViewLayoutParams.ELayoutMode.mapMode).position(infoWindow.f1603c).yOffset(infoWindow.e).build();
                switch (this.f1553d) {
                    case TextureView:
                        if (this.f1551b != null) {
                            this.f1551b.addView(this.H, build);
                            break;
                        }
                        break;
                    case GLSurfaceView:
                        if (this.h != null) {
                            this.f1550a.addView(this.H, build);
                            break;
                        }
                        break;
                }
            }
            this.F = infoWindow;
            Overlay a2 = new MarkerOptions().perspective(false).icon(infoWindow.f1602b != null ? BitmapDescriptorFactory.fromView(infoWindow.f1602b) : infoWindow.f1601a).position(infoWindow.f1603c).zIndex(Api.BaseClientBuilder.API_PRIORITY_OTHER).a(infoWindow.e).a();
            a2.listener = this.n;
            a2.q = EnumC0135h.popup;
            Bundle bundle = new Bundle();
            a2.a(bundle);
            if (this.i != null) {
                this.i.b(bundle);
            }
            this.k.add(a2);
            this.G = (Marker) a2;
        }
    }

    public final void showMapIndoorPoi(boolean z) {
        if (this.i != null) {
            this.i.r(z);
            this.M = z;
        }
    }

    public final void showMapPoi(boolean z) {
        if (this.i != null) {
            this.i.q(z);
            this.L = z;
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        this.y = snapshotReadyCallback;
        switch (this.f1553d) {
            case TextureView:
                if (this.j == null) {
                    return;
                }
                this.j.a("anything", null);
                return;
            case GLSurfaceView:
                if (this.h == null) {
                    return;
                }
                this.h.a("anything", null);
                return;
            default:
                return;
        }
    }

    public final void snapshotScope(Rect rect, SnapshotReadyCallback snapshotReadyCallback) {
        this.y = snapshotReadyCallback;
        switch (this.f1553d) {
            case TextureView:
                if (this.j == null) {
                    return;
                }
                this.j.a("anything", rect);
                return;
            case GLSurfaceView:
                if (this.h == null) {
                    return;
                }
                this.h.a("anything", rect);
                return;
            default:
                return;
        }
    }

    public MapBaseIndoorMapInfo.SwitchFloorError switchBaseIndoorMapFloor(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_INFO_ERROR;
        }
        MapBaseIndoorMapInfo focusedBaseIndoorMapInfo = getFocusedBaseIndoorMapInfo();
        if (!str2.equals(focusedBaseIndoorMapInfo.f1607a)) {
            return MapBaseIndoorMapInfo.SwitchFloorError.FOCUSED_ID_ERROR;
        }
        ArrayList<String> floors = focusedBaseIndoorMapInfo.getFloors();
        return (floors == null || !floors.contains(str)) ? MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_OVERLFLOW : this.i.a(str, str2) ? MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_OK : MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_ERROR;
    }
}
