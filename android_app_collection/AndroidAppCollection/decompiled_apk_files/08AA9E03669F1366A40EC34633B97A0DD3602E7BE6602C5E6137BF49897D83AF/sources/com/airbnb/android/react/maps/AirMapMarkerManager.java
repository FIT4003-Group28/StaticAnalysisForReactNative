package com.airbnb.android.react.maps;

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
public class AirMapMarkerManager extends ViewGroupManager<d> {
    public static final int HIDE_INFO_WINDOW = 2;
    public static final int SHOW_INFO_WINDOW = 1;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapMarker";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo170createViewInstance(af afVar) {
        return new d(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinate")
    public void setCoordinate(d dVar, an anVar) {
        dVar.setCoordinate(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "title")
    public void setTitle(d dVar, String str) {
        dVar.setTitle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "identifier")
    public void setIdentifier(d dVar, String str) {
        dVar.setIdentifier(str);
    }

    @com.facebook.react.uimanager.a.a(a = "description")
    public void setDescription(d dVar, String str) {
        dVar.setSnippet(str);
    }

    @com.facebook.react.uimanager.a.a(a = "anchor")
    public void setAnchor(d dVar, an anVar) {
        dVar.a((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 1.0d : anVar.getDouble("y"));
    }

    @com.facebook.react.uimanager.a.a(a = "calloutAnchor")
    public void setCalloutAnchor(d dVar, an anVar) {
        dVar.b((anVar == null || !anVar.hasKey("x")) ? 0.5d : anVar.getDouble("x"), (anVar == null || !anVar.hasKey("y")) ? 0.0d : anVar.getDouble("y"));
    }

    @com.facebook.react.uimanager.a.a(a = "image")
    public void setImage(d dVar, String str) {
        dVar.setImage(str);
    }

    @com.facebook.react.uimanager.a.a(a = "pinColor", b = "Color", e = -65536)
    public void setPinColor(d dVar, int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        dVar.setMarkerHue(fArr[0]);
    }

    @com.facebook.react.uimanager.a.a(a = "rotation", d = BitmapDescriptorFactory.HUE_RED)
    public void setMarkerRotation(d dVar, float f) {
        dVar.setRotation(f);
    }

    @com.facebook.react.uimanager.a.a(a = "flat", f = false)
    public void setFlat(d dVar, boolean z) {
        dVar.setFlat(z);
    }

    @com.facebook.react.uimanager.a.a(a = "draggable", f = false)
    public void setDraggable(d dVar, boolean z) {
        dVar.setDraggable(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d dVar, View view, int i) {
        if (view instanceof a) {
            dVar.setCalloutView((a) view);
            return;
        }
        super.addView((AirMapMarkerManager) dVar, view, i);
        dVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d dVar, int i) {
        super.removeViewAt((AirMapMarkerManager) dVar, i);
        dVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("showCallout", 1, "hideCallout", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i, am amVar) {
        switch (i) {
            case 1:
                ((Marker) dVar.getFeature()).showInfoWindow();
                return;
            case 2:
                ((Marker) dVar.getFeature()).hideInfoWindow();
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
        return new l();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(d dVar, Object obj) {
        HashMap hashMap = (HashMap) obj;
        dVar.a((int) ((Float) hashMap.get("width")).floatValue(), (int) ((Float) hashMap.get("height")).floatValue());
    }
}
