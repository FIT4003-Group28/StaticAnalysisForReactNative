package com.airbnb.android.react.maps;

import android.view.View;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ar;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.teslamotors.plugins.biometricauthentication.BiometricAuthenticationModule;
import java.util.Map;
/* loaded from: classes.dex */
public class AirMapManager extends ViewGroupManager<g> {
    private static final int ANIMATE_TO_COORDINATE = 2;
    private static final int ANIMATE_TO_REGION = 1;
    private static final int FIT_TO_ELEMENTS = 3;
    private static final int FIT_TO_SUPPLIED_MARKERS = 4;
    private static final String REACT_CLASS = "AIRMap";
    private static final String TAG = "AirMapManager";
    private static final int TSLA_UPDATE_VEHICLE_LOCATION = 97;
    private final ah appContext;
    private aj reactContext;
    private Map<String, Integer> MAP_TYPES = com.facebook.react.b.f.a("standard", 1, "satellite", 2, "hybrid", 4, "terrain", 3);
    protected GoogleMapOptions googleMapOptions = new GoogleMapOptions();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.a.a(a = "mapPadding")
    public void setMapPadding(g gVar, an anVar) {
    }

    public AirMapManager(ah ahVar) {
        this.appContext = ahVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public g mo170createViewInstance(af afVar) {
        this.reactContext = afVar;
        try {
            MapsInitializer.initialize(this.appContext);
            com.teslamotors.plugins.client.e.a(this.appContext.i(), true);
        } catch (RuntimeException e) {
            e.printStackTrace();
            emitMapError("Map initialize error", "map_init_error");
        }
        return new g(afVar, this.appContext.i(), this, this.googleMapOptions);
    }

    private void emitMapError(String str, String str2) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString(BiometricAuthenticationModule.BIOMETRICS_BUNDLE_KEY_MESSAGE, str);
        b2.putString("type", str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.a(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onError", b2);
    }

    @com.facebook.react.uimanager.a.a(a = "region")
    public void setRegion(g gVar, an anVar) {
        gVar.setRegion(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "mapType")
    public void setMapType(g gVar, String str) {
        gVar.f1387a.setMapType(this.MAP_TYPES.get(str).intValue());
    }

    @com.facebook.react.uimanager.a.a(a = "showsUserLocation", f = false)
    public void setShowsUserLocation(g gVar, boolean z) {
        gVar.setShowsUserLocation(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsMyLocationButton", f = true)
    public void setShowsMyLocationButton(g gVar, boolean z) {
        gVar.setShowsMyLocationButton(z);
    }

    @com.facebook.react.uimanager.a.a(a = "toolbarEnabled", f = true)
    public void setToolbarEnabled(g gVar, boolean z) {
        gVar.setToolbarEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "handlePanDrag", f = false)
    public void setHandlePanDrag(g gVar, boolean z) {
        gVar.setHandlePanDrag(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsTraffic", f = false)
    public void setShowTraffic(g gVar, boolean z) {
        gVar.f1387a.setTrafficEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsBuildings", f = false)
    public void setShowBuildings(g gVar, boolean z) {
        gVar.f1387a.setBuildingsEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsIndoors", f = false)
    public void setShowIndoors(g gVar, boolean z) {
        gVar.f1387a.setIndoorEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "showsCompass", f = false)
    public void setShowsCompass(g gVar, boolean z) {
        gVar.f1387a.getUiSettings().setCompassEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "scrollEnabled", f = false)
    public void setScrollEnabled(g gVar, boolean z) {
        gVar.f1387a.getUiSettings().setScrollGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "zoomEnabled", f = false)
    public void setZoomEnabled(g gVar, boolean z) {
        gVar.f1387a.getUiSettings().setZoomGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "rotateEnabled", f = false)
    public void setRotateEnabled(g gVar, boolean z) {
        gVar.f1387a.getUiSettings().setRotateGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "cacheEnabled", f = false)
    public void setCacheEnabled(g gVar, boolean z) {
        gVar.setCacheEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "loadingEnabled", f = false)
    public void setLoadingEnabled(g gVar, boolean z) {
        gVar.a(z);
    }

    @com.facebook.react.uimanager.a.a(a = "loadingBackgroundColor", b = "Color")
    public void setLoadingBackgroundColor(g gVar, Integer num) {
        gVar.setLoadingBackgroundColor(num);
    }

    @com.facebook.react.uimanager.a.a(a = "loadingIndicatorColor", b = "Color")
    public void setLoadingIndicatorColor(g gVar, Integer num) {
        gVar.setLoadingIndicatorColor(num);
    }

    @com.facebook.react.uimanager.a.a(a = "pitchEnabled", f = false)
    public void setPitchEnabled(g gVar, boolean z) {
        gVar.f1387a.getUiSettings().setTiltGesturesEnabled(z);
    }

    @com.facebook.react.uimanager.a.a(a = "trackingType")
    public void setTrackingType(g gVar, String str) {
        gVar.setTrackingType(com.a.a.a.e.a(str));
    }

    @com.facebook.react.uimanager.a.a(a = "phoneLocation")
    public void setPhoneLocation(g gVar, an anVar) {
        if (anVar == null) {
            return;
        }
        gVar.a(Double.valueOf(anVar.getDouble("latitude")), Double.valueOf(anVar.getDouble("longitude")), Double.valueOf(System.currentTimeMillis()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i, am amVar) {
        if (i != 97) {
            switch (i) {
                case 1:
                    an c2 = amVar.c(0);
                    Integer valueOf = Integer.valueOf(amVar.getInt(1));
                    Double valueOf2 = Double.valueOf(c2.getDouble("longitude"));
                    Double valueOf3 = Double.valueOf(c2.getDouble("latitude"));
                    Double valueOf4 = Double.valueOf(c2.getDouble("longitudeDelta"));
                    Double valueOf5 = Double.valueOf(c2.getDouble("latitudeDelta"));
                    gVar.a(new LatLngBounds(new LatLng(valueOf3.doubleValue() - (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() - (valueOf4.doubleValue() / 2.0d)), new LatLng(valueOf3.doubleValue() + (valueOf5.doubleValue() / 2.0d), valueOf2.doubleValue() + (valueOf4.doubleValue() / 2.0d))), valueOf.intValue());
                    return;
                case 2:
                    an c3 = amVar.c(0);
                    Integer valueOf6 = Integer.valueOf(amVar.getInt(1));
                    gVar.a(new LatLng(Double.valueOf(c3.getDouble("latitude")).doubleValue(), Double.valueOf(c3.getDouble("longitude")).doubleValue()), valueOf6.intValue());
                    return;
                case 3:
                    gVar.b(amVar.getBoolean(0));
                    return;
                case 4:
                    gVar.a(amVar.d(0), amVar.getBoolean(1));
                    return;
                default:
                    return;
            }
        }
        an c4 = amVar.c(0);
        gVar.a(Double.valueOf(c4.getDouble("latitude")), Double.valueOf(c4.getDouble("longitude")), Double.valueOf(c4.getDouble("heading")), Double.valueOf(c4.getDouble("timestamp")));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map a2 = com.facebook.react.b.f.a("onMapReady", com.facebook.react.b.f.a("registrationName", "onMapReady"), "onPress", com.facebook.react.b.f.a("registrationName", "onPress"), "onLongPress", com.facebook.react.b.f.a("registrationName", "onLongPress"), "onMarkerPress", com.facebook.react.b.f.a("registrationName", "onMarkerPress"), "onMarkerSelect", com.facebook.react.b.f.a("registrationName", "onMarkerSelect"), "onMarkerDeselect", com.facebook.react.b.f.a("registrationName", "onMarkerDeselect"), "onCalloutPress", com.facebook.react.b.f.a("registrationName", "onCalloutPress"));
        a2.putAll(com.facebook.react.b.f.a("onMarkerDragStart", com.facebook.react.b.f.a("registrationName", "onMarkerDragStart"), "onMarkerDrag", com.facebook.react.b.f.a("registrationName", "onMarkerDrag"), "onMarkerDragEnd", com.facebook.react.b.f.a("registrationName", "onMarkerDragEnd"), "onPanDrag", com.facebook.react.b.f.a("registrationName", "onPanDrag"), "onMapTouched", com.facebook.react.b.f.a("registrationName", "onMapTouched")));
        return a2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("animateToRegion", 1, "animateToCoordinate", 2, "fitToElements", 3, "fitToSuppliedMarkers", 4, "updateVehicleLocation", 97);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(g gVar, View view, int i) {
        gVar.a(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(g gVar) {
        return gVar.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(g gVar, int i) {
        return gVar.a(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(g gVar, int i) {
        gVar.b(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(g gVar, Object obj) {
        gVar.a(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pushEvent(View view, String str, ar arVar) {
        if (view == null) {
            return;
        }
        ((RCTEventEmitter) this.reactContext.a(RCTEventEmitter.class)).receiveEvent(view.getId(), str, arVar);
    }
}
