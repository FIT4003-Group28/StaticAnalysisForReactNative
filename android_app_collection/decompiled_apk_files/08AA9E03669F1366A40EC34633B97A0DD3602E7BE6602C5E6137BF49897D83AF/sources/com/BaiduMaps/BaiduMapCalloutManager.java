package com.BaiduMaps;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BaiduMapCalloutManager extends ViewGroupManager<a> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BaiduMapCallout";
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
        return new f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(a aVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        float floatValue = ((Float) hashMap.get("width")).floatValue();
        float floatValue2 = ((Float) hashMap.get("height")).floatValue();
        aVar.f1330a = (int) floatValue;
        aVar.f1331b = (int) floatValue2;
    }
}
