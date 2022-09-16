package com.BaiduMaps;

import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BaiduVehicleMarkerManager extends ViewGroupManager<h> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BaiduVehicleMarker";
    }

    @com.facebook.react.uimanager.a.a(a = "image")
    public void setImage(h hVar, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public h mo170createViewInstance(af afVar) {
        return new h(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinate")
    public void setCoordinate(h hVar, an anVar) {
        hVar.setCoordinate(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "title")
    public void setTitle(h hVar, String str) {
        hVar.setTitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "identifier")
    public void setIdentifier(h hVar, String str) {
        hVar.setIdentifier(str);
    }

    @com.facebook.react.uimanager.a.a(a = "type")
    public void setType(h hVar, String str) {
        hVar.setType(str);
    }

    @com.facebook.react.uimanager.a.a(a = "anchor")
    public void setAnchor(h hVar, an anVar) {
        hVar.a((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 1.0d : anVar.getDouble("y"));
    }

    @com.facebook.react.uimanager.a.a(a = "rotation", d = BitmapDescriptorFactory.HUE_RED)
    public void setMarkerRotation(h hVar, float f) {
        hVar.setRotation(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.b.f.a("onPress", com.facebook.react.b.f.a("registrationName", "onPress"), "onCalloutPress", com.facebook.react.b.f.a("registrationName", "onCalloutPress"));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(h hVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        hVar.a((int) ((Float) hashMap.get("width")).floatValue(), (int) ((Float) hashMap.get("height")).floatValue());
    }
}
