package com.airbnb.android.react.maps;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: MapsPackage.java */
/* loaded from: classes.dex */
public class i implements n {
    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        return Arrays.asList(new AirMapCalloutManager(), new AirMapMarkerManager(), new AirMapPolylineManager(ahVar), new AirMapPolygonManager(ahVar), new AirMapCircleManager(ahVar), new VehicleMarkerManager(), new AirMapManager(ahVar));
    }
}
