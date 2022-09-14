package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class AirMapPolylineManager extends ViewGroupManager<f> {
    private final DisplayMetrics metrics;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolyline";
    }

    public AirMapPolylineManager(ah ahVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) ahVar.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = ahVar.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public f mo170createViewInstance(af afVar) {
        return new f(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "coordinates")
    public void setCoordinate(f fVar, am amVar) {
        fVar.setCoordinates(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeWidth", d = 1.0f)
    public void setStrokeWidth(f fVar, float f) {
        fVar.setWidth(this.metrics.density * f);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeColor", b = "Color", e = -65536)
    public void setStrokeColor(f fVar, int i) {
        fVar.setColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "geodesic", f = false)
    public void setGeodesic(f fVar, boolean z) {
        fVar.setGeodesic(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @com.facebook.react.uimanager.a.a(a = "zIndex", d = 1.0f)
    public void setZIndex(f fVar, float f) {
        fVar.setZIndex(f);
    }
}
