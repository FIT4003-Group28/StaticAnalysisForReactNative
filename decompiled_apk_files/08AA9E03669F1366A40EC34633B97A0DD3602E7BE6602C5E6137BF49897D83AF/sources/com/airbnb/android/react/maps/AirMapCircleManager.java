package com.airbnb.android.react.maps;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.google.android.gms.maps.model.LatLng;
/* loaded from: classes.dex */
public class AirMapCircleManager extends ViewGroupManager<b> {
    private final DisplayMetrics metrics;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCircle";
    }

    public AirMapCircleManager(ah ahVar) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.metrics = new DisplayMetrics();
            ((WindowManager) ahVar.getSystemService("window")).getDefaultDisplay().getRealMetrics(this.metrics);
            return;
        }
        this.metrics = ahVar.getResources().getDisplayMetrics();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public b mo170createViewInstance(af afVar) {
        return new b(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = "center")
    public void setCenter(b bVar, an anVar) {
        bVar.setCenter(new LatLng(anVar.getDouble("latitude"), anVar.getDouble("longitude")));
    }

    @com.facebook.react.uimanager.a.a(a = "radius", c = 0.0d)
    public void setRadius(b bVar, double d2) {
        bVar.setRadius(d2);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeWidth", d = 1.0f)
    public void setStrokeWidth(b bVar, float f) {
        bVar.setStrokeWidth(this.metrics.density * f);
    }

    @com.facebook.react.uimanager.a.a(a = "fillColor", b = "Color", e = -65536)
    public void setFillColor(b bVar, int i) {
        bVar.setFillColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = "strokeColor", b = "Color", e = -65536)
    public void setStrokeColor(b bVar, int i) {
        bVar.setStrokeColor(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @com.facebook.react.uimanager.a.a(a = "zIndex", d = 1.0f)
    public void setZIndex(b bVar, float f) {
        bVar.setZIndex(f);
    }
}
