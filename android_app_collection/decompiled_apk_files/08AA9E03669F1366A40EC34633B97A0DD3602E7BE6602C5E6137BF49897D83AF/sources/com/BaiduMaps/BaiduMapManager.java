package com.BaiduMaps;

import android.content.Context;
import android.view.View;
import com.baidu.mapapi.map.LogoPosition;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Map;
/* loaded from: classes.dex */
public class BaiduMapManager extends ViewGroupManager<d> {
    public static final int ANIMATE_TO_COORDINATE = 2;
    public static final int ANIMATE_TO_REGION = 1;
    public static final int FIT_TO_ELEMENTS = 3;
    public static final String REACT_CLASS = "BaiduMap";
    private static final String TAG = "BaiduMapManager";
    public static final int TSLA_UPDATE_VEHICLE_LOCATION = 97;
    private Map<String, Integer> MAP_TYPES = com.facebook.react.b.f.a("standard", 1, "satellite", 2, "hybrid", 2);
    private Context appContext;
    private BaiduMapMarkerManager markerManager;
    private aj reactContext;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public BaiduMapManager(BaiduMapMarkerManager baiduMapMarkerManager, Context context) {
        this.markerManager = baiduMapMarkerManager;
        this.appContext = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo170createViewInstance(af afVar) {
        this.reactContext = afVar;
        return new d(afVar, this, this.appContext);
    }

    @com.facebook.react.uimanager.a.a(a = "region")
    public void setRegion(d dVar, an anVar) {
        if (anVar == null) {
            return;
        }
        dVar.setRegion(getBoundsFromRegion(anVar));
    }

    @com.facebook.react.uimanager.a.a(a = "mapType")
    public void setMapType(d dVar, String str) {
        dVar.f1339a.getMap().setMapType(this.MAP_TYPES.get(str).intValue());
    }

    @com.facebook.react.uimanager.a.a(a = "showsUserLocation", f = false)
    public void setShowsUserLocation(d dVar, boolean z) {
        dVar.setShowsUserLocation(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsTraffic", f = false)
    public void setShowTraffic(d dVar, boolean z) {
        dVar.f1339a.getMap().setTrafficEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsBuildings", f = false)
    public void setShowBuildings(d dVar, boolean z) {
        throw new IllegalArgumentException("Shows buildings not supported");
    }

    @com.facebook.react.uimanager.a.a(a = "showsIndoors", f = false)
    public void setShowIndoors(d dVar, boolean z) {
        throw new IllegalArgumentException("Indoors not supported");
    }

    @com.facebook.react.uimanager.a.a(a = "showsCompass", f = false)
    public void setShowsCompass(d dVar, boolean z) {
        dVar.f1339a.getMap().getUiSettings().setCompassEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollEnabled", f = false)
    public void setScrollEnabled(d dVar, boolean z) {
        dVar.f1339a.getMap().getUiSettings().setScrollGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "zoomEnabled", f = false)
    public void setZoomEnabled(d dVar, boolean z) {
        dVar.f1339a.getMap().getUiSettings().setZoomGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "rotateEnabled", f = false)
    public void setRotateEnabled(d dVar, boolean z) {
        dVar.f1339a.getMap().getUiSettings().setRotateGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "mapPadding")
    public void setMapPadding(d dVar, an anVar) {
        dVar.f1339a.setLogoPosition(LogoPosition.logoPostionleftBottom);
        dVar.f1339a.setPadding(anVar.getInt("left"), anVar.getInt("top"), anVar.getInt("right"), anVar.getInt("bottom"));
    }

    @com.facebook.react.uimanager.a.a(a = "trackingType")
    public void setTrackingType(d dVar, String str) {
        dVar.setTrackingType(com.a.a.a.e.a(str));
    }

    @com.facebook.react.uimanager.a.a(a = "phoneLocation")
    public void setPhoneLocation(d dVar, an anVar) {
        if (anVar == null) {
            return;
        }
        Double valueOf = Double.valueOf(anVar.getDouble("longitude"));
        Double valueOf2 = Double.valueOf(anVar.getDouble("latitude"));
        Float valueOf3 = Float.valueOf((float) anVar.getDouble("accuracy"));
        dVar.setShowsUserLocation(true);
        dVar.a(valueOf2, valueOf, Double.valueOf(System.currentTimeMillis()));
        LatLng a2 = g.a(valueOf2.doubleValue(), valueOf.doubleValue());
        MyLocationData.Builder builder = new MyLocationData.Builder();
        builder.latitude(a2.latitude);
        builder.longitude(a2.longitude);
        builder.accuracy(valueOf3.floatValue());
        dVar.f1339a.getMap().setMyLocationData(builder.build());
    }

    private LatLngBounds getBoundsFromRegion(an anVar) {
        Double valueOf = Double.valueOf(anVar.getDouble("longitude"));
        Double valueOf2 = Double.valueOf(anVar.getDouble("latitude"));
        Double valueOf3 = Double.valueOf(anVar.getDouble("longitudeDelta"));
        Double valueOf4 = Double.valueOf(anVar.getDouble("latitudeDelta"));
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(g.a(valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() - (valueOf3.doubleValue() / 2.0d)));
        builder.include(g.a(valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d), valueOf.doubleValue() + (valueOf3.doubleValue() / 2.0d)));
        return builder.build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, am amVar) {
        if (i != 97) {
            switch (i) {
                case 1:
                    an c2 = amVar.c(0);
                    dVar.a(getBoundsFromRegion(c2), Integer.valueOf(amVar.getInt(1)));
                    return;
                case 2:
                    an c3 = amVar.c(0);
                    dVar.a(g.a(Double.valueOf(c3.getDouble("latitude")).doubleValue(), Double.valueOf(c3.getDouble("longitude")).doubleValue()), Integer.valueOf(amVar.getInt(1)));
                    return;
                case 3:
                    dVar.a(amVar.getBoolean(0));
                    return;
                default:
                    return;
            }
        }
        an c4 = amVar.c(0);
        dVar.a(Double.valueOf(c4.getDouble("latitude")), Double.valueOf(c4.getDouble("longitude")), Double.valueOf(c4.getDouble("heading")), Double.valueOf(c4.getDouble("timestamp")));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map a2 = com.facebook.react.b.f.a("onMapReady", com.facebook.react.b.f.a("registrationName", "onMapReady"), "onPress", com.facebook.react.b.f.a("registrationName", "onPress"), "onLongPress", com.facebook.react.b.f.a("registrationName", "onLongPress"), "onMarkerPress", com.facebook.react.b.f.a("registrationName", "onMarkerPress"), "onMarkerSelect", com.facebook.react.b.f.a("registrationName", "onMarkerSelect"), "onMarkerDeselect", com.facebook.react.b.f.a("registrationName", "onMarkerDeselect"), "onCalloutPress", com.facebook.react.b.f.a("registrationName", "onCalloutPress"));
        a2.putAll(com.facebook.react.b.f.a("onMarkerDragStart", com.facebook.react.b.f.a("registrationName", "onMarkerDragStart"), "onMarkerDrag", com.facebook.react.b.f.a("registrationName", "onMarkerDrag"), "onMarkerDragEnd", com.facebook.react.b.f.a("registrationName", "onMarkerDragEnd"), "onMapTouched", com.facebook.react.b.f.a("registrationName", "onMapTouched")));
        return a2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("animateToRegion", 1, "animateToCoordinate", 2, "fitToElements", 3, "updateVehicleLocation", 97);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d dVar, View view, int i) {
        dVar.a(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(d dVar) {
        return dVar.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(d dVar, int i) {
        return dVar.a(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d dVar, int i) {
        dVar.b(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(d dVar, Object obj) {
        dVar.a(obj);
    }

    public void pushEvent(View view, String str, ar arVar) {
        if (view == null || this.reactContext == null || !this.reactContext.b()) {
            return;
        }
        ((RCTEventEmitter) this.reactContext.a(RCTEventEmitter.class)).receiveEvent(view.getId(), str, arVar);
    }
}
