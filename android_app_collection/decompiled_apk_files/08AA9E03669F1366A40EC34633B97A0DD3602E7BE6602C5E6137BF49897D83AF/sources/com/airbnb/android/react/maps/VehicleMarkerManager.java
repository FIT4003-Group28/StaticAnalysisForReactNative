package com.airbnb.android.react.maps;

import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class VehicleMarkerManager extends ViewGroupManager<m> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "VehicleMarker";
    }

    @com.facebook.react.uimanager.a.a(a = "image")
    public void setImage(m mVar, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public m mo170createViewInstance(af afVar) {
        return new m(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinate")
    public void setCoordinate(m mVar, an anVar) {
        mVar.setCoordinate(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "title")
    public void setTitle(m mVar, String str) {
        mVar.setTitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "identifier")
    public void setIdentifier(m mVar, String str) {
        mVar.setIdentifier(str);
    }

    @com.facebook.react.uimanager.a.a(a = "type")
    public void setType(m mVar, String str) {
        mVar.setType(str);
    }

    @com.facebook.react.uimanager.a.a(a = "anchor")
    public void setAnchor(m mVar, an anVar) {
        mVar.a((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 1.0d : anVar.getDouble("y"));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.b.f.a("onPress", com.facebook.react.b.f.a("registrationName", "onPress"), "onCalloutPress", com.facebook.react.b.f.a("registrationName", "onCalloutPress"));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(m mVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        mVar.a((int) ((Float) hashMap.get("width")).floatValue(), (int) ((Float) hashMap.get("height")).floatValue());
    }
}
