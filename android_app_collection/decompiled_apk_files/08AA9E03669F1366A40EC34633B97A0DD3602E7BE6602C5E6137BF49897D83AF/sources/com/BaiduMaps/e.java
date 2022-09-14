package com.BaiduMaps;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.n;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: BaiduPackage.java */
/* loaded from: classes.dex */
public class e implements n {
    @Override // com.facebook.react.n
    public List<NativeModule> createNativeModules(ah ahVar) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.n
    public List<ViewManager> createViewManagers(ah ahVar) {
        BaiduMapCalloutManager baiduMapCalloutManager = new BaiduMapCalloutManager();
        BaiduMapMarkerManager baiduMapMarkerManager = new BaiduMapMarkerManager(baiduMapCalloutManager);
        return Arrays.asList(baiduMapCalloutManager, baiduMapMarkerManager, new BaiduVehicleMarkerManager(), new BaiduMapManager(baiduMapMarkerManager, ahVar.getBaseContext()));
    }
}
