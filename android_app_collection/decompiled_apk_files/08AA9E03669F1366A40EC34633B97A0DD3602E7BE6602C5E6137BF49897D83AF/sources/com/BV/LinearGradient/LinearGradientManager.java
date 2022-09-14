package com.BV.LinearGradient;

import com.facebook.react.bridge.am;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<b> {
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public b mo170createViewInstance(af afVar) {
        return new b(afVar);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_COLORS)
    public void setColors(b bVar, am amVar) {
        bVar.setColors(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_LOCATIONS)
    public void setLocations(b bVar, am amVar) {
        if (amVar != null) {
            bVar.setLocations(amVar);
        }
    }

    @com.facebook.react.uimanager.a.a(a = PROP_START_POS)
    public void setStartPosition(b bVar, am amVar) {
        bVar.setStartPosition(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_END_POS)
    public void setEndPosition(b bVar, am amVar) {
        bVar.setEndPosition(amVar);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_BORDER_RADII)
    public void setBorderRadii(b bVar, am amVar) {
        bVar.setBorderRadii(amVar);
    }
}
