package com.airbnb.android.react.maps;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import java.util.Map;
/* loaded from: classes.dex */
public class AirMapCalloutManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCallout";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo170createViewInstance(af afVar) {
        return new a(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "tooltip", f = false)
    public void setTooltip(a aVar, boolean z) {
        aVar.setTooltip(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.b.f.a("onPress", com.facebook.react.b.f.a("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(a aVar, Object obj) {
        Map map = (Map) obj;
        float floatValue = ((Float) map.get("width")).floatValue();
        float floatValue2 = ((Float) map.get("height")).floatValue();
        aVar.f1367a = (int) floatValue;
        aVar.f1368b = (int) floatValue2;
    }
}
