package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.inner.GeoPoint;
import com.baidu.platform.comapi.map.C0132e;
import com.baidu.platform.comapi.map.D;
import com.baidu.platform.comapi.map.InterfaceC0138k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements InterfaceC0138k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaiduMap f1719a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(BaiduMap baiduMap) {
        this.f1719a = baiduMap;
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a() {
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(Bitmap bitmap) {
        BaiduMap.SnapshotReadyCallback snapshotReadyCallback;
        BaiduMap.SnapshotReadyCallback snapshotReadyCallback2;
        snapshotReadyCallback = this.f1719a.y;
        if (snapshotReadyCallback != null) {
            snapshotReadyCallback2 = this.f1719a.y;
            snapshotReadyCallback2.onSnapshotReady(bitmap);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(MotionEvent motionEvent) {
        BaiduMap.OnMapTouchListener onMapTouchListener;
        BaiduMap.OnMapTouchListener onMapTouchListener2;
        onMapTouchListener = this.f1719a.p;
        if (onMapTouchListener != null) {
            onMapTouchListener2 = this.f1719a.p;
            onMapTouchListener2.onTouch(motionEvent);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(GeoPoint geoPoint) {
        BaiduMap.OnMapClickListener onMapClickListener;
        BaiduMap.OnMapClickListener onMapClickListener2;
        onMapClickListener = this.f1719a.q;
        if (onMapClickListener != null) {
            LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
            onMapClickListener2 = this.f1719a.q;
            onMapClickListener2.onMapClick(mc2ll);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(D d2) {
        View view;
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener;
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener2;
        View view2;
        view = this.f1719a.H;
        if (view != null) {
            view2 = this.f1719a.H;
            view2.setVisibility(4);
        }
        onMapStatusChangeListener = this.f1719a.o;
        if (onMapStatusChangeListener != null) {
            MapStatus a2 = MapStatus.a(d2);
            onMapStatusChangeListener2 = this.f1719a.o;
            onMapStatusChangeListener2.onMapStatusChangeStart(a2);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(String str) {
        List<Overlay> list;
        CopyOnWriteArrayList copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        InfoWindow infoWindow;
        List<Overlay> list2;
        CopyOnWriteArrayList copyOnWriteArrayList3;
        CopyOnWriteArrayList copyOnWriteArrayList4;
        Marker marker;
        InfoWindow infoWindow2;
        C0132e c0132e;
        C0132e c0132e2;
        C0132e c0132e3;
        BaiduMap.OnMyLocationClickListener onMyLocationClickListener;
        BaiduMap.OnMyLocationClickListener onMyLocationClickListener2;
        BaiduMap.OnMapClickListener onMapClickListener;
        BaiduMap.OnMapClickListener onMapClickListener2;
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONArray("dataset").optJSONObject(0);
            int optInt = optJSONObject.optInt("ty");
            if (optInt == 17) {
                onMapClickListener = this.f1719a.q;
                if (onMapClickListener == null) {
                    return;
                }
                MapPoi mapPoi = new MapPoi();
                mapPoi.a(optJSONObject);
                onMapClickListener2 = this.f1719a.q;
                onMapClickListener2.onMapPoiClick(mapPoi);
            } else if (optInt == 18) {
                onMyLocationClickListener = this.f1719a.x;
                if (onMyLocationClickListener == null) {
                    return;
                }
                onMyLocationClickListener2 = this.f1719a.x;
                onMyLocationClickListener2.onMyLocationClick();
            } else if (optInt == 19) {
                c0132e = this.f1719a.i;
                if (c0132e == null) {
                    return;
                }
                c0132e2 = this.f1719a.i;
                D D = c0132e2.D();
                D.f2028c = 0;
                D.f2027b = 0;
                c0132e3 = this.f1719a.i;
                c0132e3.a(D, 300);
            } else if (optInt != 90909) {
                if (optInt != 90910) {
                    return;
                }
                String optString = optJSONObject.optString("polyline_id");
                list = this.f1719a.k;
                for (Overlay overlay : list) {
                    if ((overlay instanceof Polyline) && overlay.p.equals(optString)) {
                        copyOnWriteArrayList = this.f1719a.v;
                        if (copyOnWriteArrayList != null) {
                            copyOnWriteArrayList2 = this.f1719a.v;
                            Iterator it = copyOnWriteArrayList2.iterator();
                            while (it.hasNext()) {
                                ((BaiduMap.OnPolylineClickListener) it.next()).onPolylineClick((Polyline) overlay);
                            }
                        }
                    }
                }
            } else {
                String optString2 = optJSONObject.optString("marker_id");
                infoWindow = this.f1719a.F;
                if (infoWindow != null) {
                    marker = this.f1719a.G;
                    if (optString2.equals(marker.p)) {
                        infoWindow2 = this.f1719a.F;
                        InfoWindow.OnInfoWindowClickListener onInfoWindowClickListener = infoWindow2.f1604d;
                        if (onInfoWindowClickListener == null) {
                            return;
                        }
                        onInfoWindowClickListener.onInfoWindowClick();
                        return;
                    }
                }
                list2 = this.f1719a.k;
                for (Overlay overlay2 : list2) {
                    if ((overlay2 instanceof Marker) && overlay2.p.equals(optString2)) {
                        copyOnWriteArrayList3 = this.f1719a.u;
                        if (copyOnWriteArrayList3 != null) {
                            copyOnWriteArrayList4 = this.f1719a.u;
                            Iterator it2 = copyOnWriteArrayList4.iterator();
                            while (it2.hasNext()) {
                                ((BaiduMap.OnMarkerClickListener) it2.next()).onMarkerClick((Marker) overlay2);
                            }
                            return;
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(GL10 gl10, D d2) {
        BaiduMap.OnMapDrawFrameCallback onMapDrawFrameCallback;
        BaiduMap.OnMapDrawFrameCallback onMapDrawFrameCallback2;
        onMapDrawFrameCallback = this.f1719a.z;
        if (onMapDrawFrameCallback != null) {
            MapStatus a2 = MapStatus.a(d2);
            onMapDrawFrameCallback2 = this.f1719a.z;
            onMapDrawFrameCallback2.onMapDrawFrame(gl10, a2);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void a(boolean z) {
        BaiduMap.OnBaseIndoorMapListener onBaseIndoorMapListener;
        BaiduMap.OnBaseIndoorMapListener onBaseIndoorMapListener2;
        onBaseIndoorMapListener = this.f1719a.A;
        if (onBaseIndoorMapListener != null) {
            MapBaseIndoorMapInfo focusedBaseIndoorMapInfo = this.f1719a.getFocusedBaseIndoorMapInfo();
            onBaseIndoorMapListener2 = this.f1719a.A;
            onBaseIndoorMapListener2.onBaseIndoorMapMode(z, focusedBaseIndoorMapInfo);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b() {
        C0132e c0132e;
        BaiduMap.OnMapLoadedCallback onMapLoadedCallback;
        BaiduMap.OnMapLoadedCallback onMapLoadedCallback2;
        BaiduMap baiduMap = this.f1719a;
        c0132e = this.f1719a.i;
        baiduMap.f = new Projection(c0132e);
        this.f1719a.O = true;
        onMapLoadedCallback = this.f1719a.r;
        if (onMapLoadedCallback != null) {
            onMapLoadedCallback2 = this.f1719a.r;
            onMapLoadedCallback2.onMapLoaded();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b(GeoPoint geoPoint) {
        BaiduMap.OnMapDoubleClickListener onMapDoubleClickListener;
        BaiduMap.OnMapDoubleClickListener onMapDoubleClickListener2;
        onMapDoubleClickListener = this.f1719a.s;
        if (onMapDoubleClickListener != null) {
            LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
            onMapDoubleClickListener2 = this.f1719a.s;
            onMapDoubleClickListener2.onMapDoubleClick(mc2ll);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void b(D d2) {
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener;
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener2;
        onMapStatusChangeListener = this.f1719a.o;
        if (onMapStatusChangeListener != null) {
            MapStatus a2 = MapStatus.a(d2);
            onMapStatusChangeListener2 = this.f1719a.o;
            onMapStatusChangeListener2.onMapStatusChange(a2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r2 = (com.baidu.mapapi.map.Marker) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r2.f == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        r4.f1719a.I = r2;
        r5 = r4.f1719a.f;
        r1 = r4.f1719a.I;
        r5 = r5.toScreenLocation(r1.f1641a);
        r1 = new android.graphics.Point(r5.x, r5.y - 60);
        r5 = r4.f1719a.f;
        r5 = r5.fromScreenLocation(r1);
        r1 = r4.f1719a.I;
        r1.setPosition(r5);
        r5 = r4.f1719a.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
        r5 = r4.f1719a.w;
        r1 = r4.f1719a.I;
        r5.onMarkerDragStart(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ab, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r5.equals(r1.p) == false) goto L9;
     */
    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lad
            r1.<init>(r5)     // Catch: org.json.JSONException -> Lad
            java.lang.String r5 = "dataset"
            org.json.JSONArray r5 = r1.optJSONArray(r5)     // Catch: org.json.JSONException -> Lad
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: org.json.JSONException -> Lad
            java.lang.String r1 = "ty"
            int r1 = r5.optInt(r1)     // Catch: org.json.JSONException -> Lad
            r2 = 90909(0x1631d, float:1.2739E-40)
            if (r1 != r2) goto Lb1
            java.lang.String r1 = "marker_id"
            java.lang.String r5 = r5.optString(r1)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Marker r1 = com.baidu.mapapi.map.BaiduMap.o(r1)     // Catch: org.json.JSONException -> Lad
            if (r1 == 0) goto L37
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Marker r1 = com.baidu.mapapi.map.BaiduMap.o(r1)     // Catch: org.json.JSONException -> Lad
            java.lang.String r1 = r1.p     // Catch: org.json.JSONException -> Lad
            boolean r1 = r5.equals(r1)     // Catch: org.json.JSONException -> Lad
            if (r1 != 0) goto Lb1
        L37:
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            java.util.List r1 = com.baidu.mapapi.map.BaiduMap.a(r1)     // Catch: org.json.JSONException -> Lad
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> Lad
        L41:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> Lad
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Overlay r2 = (com.baidu.mapapi.map.Overlay) r2     // Catch: org.json.JSONException -> Lad
            boolean r3 = r2 instanceof com.baidu.mapapi.map.Marker     // Catch: org.json.JSONException -> Lad
            if (r3 == 0) goto L41
            java.lang.String r3 = r2.p     // Catch: org.json.JSONException -> Lad
            boolean r3 = r3.equals(r5)     // Catch: org.json.JSONException -> Lad
            if (r3 == 0) goto L41
            com.baidu.mapapi.map.Marker r2 = (com.baidu.mapapi.map.Marker) r2     // Catch: org.json.JSONException -> Lad
            boolean r5 = r2.f     // Catch: org.json.JSONException -> Lad
            if (r5 == 0) goto Lb1
            com.baidu.mapapi.map.BaiduMap r5 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap.a(r5, r2)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r5 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Projection r5 = com.baidu.mapapi.map.BaiduMap.s(r5)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Marker r1 = com.baidu.mapapi.map.BaiduMap.r(r1)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.model.LatLng r1 = r1.f1641a     // Catch: org.json.JSONException -> Lad
            android.graphics.Point r5 = r5.toScreenLocation(r1)     // Catch: org.json.JSONException -> Lad
            android.graphics.Point r1 = new android.graphics.Point     // Catch: org.json.JSONException -> Lad
            int r2 = r5.x     // Catch: org.json.JSONException -> Lad
            int r5 = r5.y     // Catch: org.json.JSONException -> Lad
            int r5 = r5 + (-60)
            r1.<init>(r2, r5)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r5 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Projection r5 = com.baidu.mapapi.map.BaiduMap.s(r5)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.model.LatLng r5 = r5.fromScreenLocation(r1)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Marker r1 = com.baidu.mapapi.map.BaiduMap.r(r1)     // Catch: org.json.JSONException -> Lad
            r1.setPosition(r5)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r5 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap$OnMarkerDragListener r5 = com.baidu.mapapi.map.BaiduMap.t(r5)     // Catch: org.json.JSONException -> Lad
            if (r5 == 0) goto Lab
            com.baidu.mapapi.map.BaiduMap r5 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap$OnMarkerDragListener r5 = com.baidu.mapapi.map.BaiduMap.t(r5)     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.BaiduMap r1 = r4.f1719a     // Catch: org.json.JSONException -> Lad
            com.baidu.mapapi.map.Marker r1 = com.baidu.mapapi.map.BaiduMap.r(r1)     // Catch: org.json.JSONException -> Lad
            r5.onMarkerDragStart(r1)     // Catch: org.json.JSONException -> Lad
        Lab:
            r0 = 1
            return r0
        Lad:
            r5 = move-exception
            r5.printStackTrace()
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.map.b.b(java.lang.String):boolean");
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c() {
        Lock lock;
        Lock lock2;
        HeatMap heatMap;
        HeatMap heatMap2;
        lock = this.f1719a.D;
        lock.lock();
        try {
            heatMap = this.f1719a.C;
            if (heatMap != null) {
                heatMap2 = this.f1719a.C;
                heatMap2.a();
            }
        } finally {
            lock2 = this.f1719a.D;
            lock2.unlock();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c(GeoPoint geoPoint) {
        BaiduMap.OnMapLongClickListener onMapLongClickListener;
        BaiduMap.OnMapLongClickListener onMapLongClickListener2;
        onMapLongClickListener = this.f1719a.t;
        if (onMapLongClickListener != null) {
            LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
            onMapLongClickListener2 = this.f1719a.t;
            onMapLongClickListener2.onMapLongClick(mc2ll);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void c(D d2) {
        View view;
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener;
        BaiduMap.OnMapStatusChangeListener onMapStatusChangeListener2;
        View view2;
        view = this.f1719a.H;
        if (view != null) {
            view2 = this.f1719a.H;
            view2.setVisibility(0);
        }
        onMapStatusChangeListener = this.f1719a.o;
        if (onMapStatusChangeListener != null) {
            MapStatus a2 = MapStatus.a(d2);
            onMapStatusChangeListener2 = this.f1719a.o;
            onMapStatusChangeListener2.onMapStatusChangeFinish(a2);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void d() {
        Lock lock;
        Lock lock2;
        HeatMap heatMap;
        HeatMap heatMap2;
        C0132e c0132e;
        lock = this.f1719a.D;
        lock.lock();
        try {
            heatMap = this.f1719a.C;
            if (heatMap != null) {
                heatMap2 = this.f1719a.C;
                heatMap2.a();
                c0132e = this.f1719a.i;
                c0132e.n();
            }
        } finally {
            lock2 = this.f1719a.D;
            lock2.unlock();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void d(GeoPoint geoPoint) {
        Marker marker;
        Marker marker2;
        Projection projection;
        Projection projection2;
        Marker marker3;
        BaiduMap.OnMarkerDragListener onMarkerDragListener;
        Marker marker4;
        BaiduMap.OnMarkerDragListener onMarkerDragListener2;
        Marker marker5;
        marker = this.f1719a.I;
        if (marker != null) {
            marker2 = this.f1719a.I;
            if (!marker2.f) {
                return;
            }
            LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
            projection = this.f1719a.f;
            Point screenLocation = projection.toScreenLocation(mc2ll);
            Point point = new Point(screenLocation.x, screenLocation.y - 60);
            projection2 = this.f1719a.f;
            LatLng fromScreenLocation = projection2.fromScreenLocation(point);
            marker3 = this.f1719a.I;
            marker3.setPosition(fromScreenLocation);
            onMarkerDragListener = this.f1719a.w;
            if (onMarkerDragListener == null) {
                return;
            }
            marker4 = this.f1719a.I;
            if (!marker4.f) {
                return;
            }
            onMarkerDragListener2 = this.f1719a.w;
            marker5 = this.f1719a.I;
            onMarkerDragListener2.onMarkerDrag(marker5);
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void e() {
        C0132e c0132e;
        Lock lock;
        Lock lock2;
        HeatMap heatMap;
        HeatMap heatMap2;
        c0132e = this.f1719a.i;
        c0132e.b(false);
        lock = this.f1719a.D;
        lock.lock();
        try {
            heatMap = this.f1719a.C;
            if (heatMap != null) {
                BaiduMap baiduMap = this.f1719a;
                heatMap2 = this.f1719a.C;
                baiduMap.a(heatMap2);
            }
        } finally {
            lock2 = this.f1719a.D;
            lock2.unlock();
        }
    }

    @Override // com.baidu.platform.comapi.map.InterfaceC0138k
    public void e(GeoPoint geoPoint) {
        Marker marker;
        Marker marker2;
        Projection projection;
        Projection projection2;
        Marker marker3;
        BaiduMap.OnMarkerDragListener onMarkerDragListener;
        Marker marker4;
        BaiduMap.OnMarkerDragListener onMarkerDragListener2;
        Marker marker5;
        marker = this.f1719a.I;
        if (marker != null) {
            marker2 = this.f1719a.I;
            if (!marker2.f) {
                return;
            }
            LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
            projection = this.f1719a.f;
            Point screenLocation = projection.toScreenLocation(mc2ll);
            Point point = new Point(screenLocation.x, screenLocation.y - 60);
            projection2 = this.f1719a.f;
            LatLng fromScreenLocation = projection2.fromScreenLocation(point);
            marker3 = this.f1719a.I;
            marker3.setPosition(fromScreenLocation);
            onMarkerDragListener = this.f1719a.w;
            if (onMarkerDragListener != null) {
                marker4 = this.f1719a.I;
                if (marker4.f) {
                    onMarkerDragListener2 = this.f1719a.w;
                    marker5 = this.f1719a.I;
                    onMarkerDragListener2.onMarkerDragEnd(marker5);
                }
            }
            this.f1719a.I = null;
        }
    }
}
