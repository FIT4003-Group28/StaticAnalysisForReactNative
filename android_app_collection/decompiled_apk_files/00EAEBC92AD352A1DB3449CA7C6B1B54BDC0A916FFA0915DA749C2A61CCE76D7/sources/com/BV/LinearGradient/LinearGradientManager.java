package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.k0;
import com.horcrux.svg.BuildConfig;
/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public b mo345createViewInstance(k0 k0Var) {
        return new b(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(b bVar, float f2) {
        bVar.setAngle(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_BORDER_RADII)
    public void setBorderRadii(b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_COLORS)
    public void setColors(b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_END_POS)
    public void setEndPosition(b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_LOCATIONS)
    public void setLocations(b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = PROP_START_POS)
    public void setStartPosition(b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = BuildConfig.DEBUG, name = PROP_USE_ANGLE)
    public void setUseAngle(b bVar, boolean z) {
        bVar.setUseAngle(z);
    }
}
