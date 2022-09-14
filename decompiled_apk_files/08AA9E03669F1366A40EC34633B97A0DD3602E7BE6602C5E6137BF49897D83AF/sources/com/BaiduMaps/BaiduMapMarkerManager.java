package com.BaiduMaps;

import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BaiduMapMarkerManager extends ViewGroupManager<c> {
    public static final int HIDE_INFO_WINDOW = 2;
    public static final int SHOW_INFO_WINDOW = 1;
    private static final String TAG = "BaiduMapMarkerManager";
    private BaiduMapCalloutManager calloutManager;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BaiduMapMarker";
    }

    public BaiduMapMarkerManager(BaiduMapCalloutManager baiduMapCalloutManager) {
        this.calloutManager = baiduMapCalloutManager;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo170createViewInstance(af afVar) {
        return new c(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinate")
    public void setCoordinate(c cVar, an anVar) {
        cVar.setCoordinate(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "title")
    public void setTitle(c cVar, String str) {
        cVar.setTitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "anchor")
    public void setAnchor(c cVar, an anVar) {
        cVar.a((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 1.0d : anVar.getDouble("y"));
    }

    @com.facebook.react.uimanager.a.a(a = "calloutAnchor")
    public void setCalloutAnchor(c cVar, an anVar) {
        cVar.b((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 0.0d : anVar.getDouble("y"));
    }

    @com.facebook.react.uimanager.a.a(a = "image")
    public void setImage(c cVar, String str) {
        cVar.setImage(str);
    }

    @com.facebook.react.uimanager.a.a(a = "identifier")
    public void setIdentifier(c cVar, String str) {
        cVar.setIdentifier(str);
    }

    @com.facebook.react.uimanager.a.a(a = "pinColor", b = "Color", e = -65536)
    public void setPinColor(c cVar, int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        cVar.setMarkerHue(fArr[0]);
    }

    @com.facebook.react.uimanager.a.a(a = "rotation", d = BitmapDescriptorFactory.HUE_RED)
    public void setMarkerRotation(c cVar, float f) {
        cVar.setRotation(f);
    }

    @com.facebook.react.uimanager.a.a(a = "flat", f = false)
    public void setFlat(c cVar, boolean z) {
        cVar.setFlat(z);
    }

    @com.facebook.react.uimanager.a.a(a = "draggable", f = false)
    public void setDraggable(c cVar, boolean z) {
        cVar.setDraggable(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(c cVar, View view, int i) {
        if (view instanceof a) {
            cVar.setCalloutView((a) view);
            return;
        }
        super.addView((BaiduMapMarkerManager) cVar, view, i);
        cVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(c cVar, int i) {
        super.removeViewAt((BaiduMapMarkerManager) cVar, i);
        cVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("showCallout", 1, "hideCallout", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c cVar, int i, am amVar) {
        switch (i) {
            case 1:
                ((Marker) cVar.getFeature()).showInfoWindow();
                return;
            case 2:
                ((Marker) cVar.getFeature()).hideInfoWindow();
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map a2 = com.facebook.react.b.f.a("onPress", com.facebook.react.b.f.a("registrationName", "onPress"), "onCalloutPress", com.facebook.react.b.f.a("registrationName", "onCalloutPress"), "onDragStart", com.facebook.react.b.f.a("registrationName", "onDragStart"), "onDrag", com.facebook.react.b.f.a("registrationName", "onDrag"), "onDragEnd", com.facebook.react.b.f.a("registrationName", "onDragEnd"));
        a2.putAll(com.facebook.react.b.f.a("onDragStart", com.facebook.react.b.f.a("registrationName", "onDragStart"), "onDrag", com.facebook.react.b.f.a("registrationName", "onDrag"), "onDragEnd", com.facebook.react.b.f.a("registrationName", "onDragEnd")));
        return a2;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(c cVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        cVar.a((int) ((Float) hashMap.get("width")).floatValue(), (int) ((Float) hashMap.get("height")).floatValue());
    }
}
