package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class AirMapPolygonManager extends ViewGroupManager<e> {
    private final DisplayMetrics metrics;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolygon";
    }

    public AirMapPolygonManager(ah ahVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) ahVar.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = ahVar.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public e mo170createViewInstance(af afVar) {
        return new e(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinates")
    public void setCoordinate(e eVar, am amVar) {
        eVar.setCoordinates(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeWidth", d = 1.0f)
    public void setStrokeWidth(e eVar, float f) {
        eVar.setStrokeWidth(this.metrics.density * f);
    }

    @com.facebook.react.uimanager.a.a(a = "fillColor", b = "Color", e = -65536)
    public void setFillColor(e eVar, int i) {
        eVar.setFillColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeColor", b = "Color", e = -65536)
    public void setStrokeColor(e eVar, int i) {
        eVar.setStrokeColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "geodesic", f = false)
    public void setGeodesic(e eVar, boolean z) {
        eVar.setGeodesic(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @com.facebook.react.uimanager.a.a(a = "zIndex", d = 1.0f)
    public void setZIndex(e eVar, float f) {
        eVar.setZIndex(f);
    }
}
