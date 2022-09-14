package com.facebook.react.uimanager;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.f;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends g> extends ViewManager<T, C> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String PROP_ACCESSIBILITY_COMPONENT_TYPE = "accessibilityComponentType";
    private static final String PROP_ACCESSIBILITY_LABEL = "accessibilityLabel";
    private static final String PROP_ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    private static final String PROP_BACKGROUND_COLOR = "backgroundColor";
    private static final String PROP_ELEVATION = "elevation";
    private static final String PROP_IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String PROP_NATIVE_ID = "nativeID";
    private static final String PROP_RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    private static final String PROP_ROTATION = "rotation";
    private static final String PROP_SCALE_X = "scaleX";
    private static final String PROP_SCALE_Y = "scaleY";
    public static final String PROP_TEST_ID = "testID";
    private static final String PROP_TRANSFORM = "transform";
    private static final String PROP_TRANSLATE_X = "translateX";
    private static final String PROP_TRANSLATE_Y = "translateY";
    private static final String PROP_Z_INDEX = "zIndex";
    private static h.a sMatrixDecompositionContext = new h.a();
    private static double[] sTransformDecompositionArray = new double[16];

    @com.facebook.react.uimanager.a.a(a = PROP_BACKGROUND_COLOR, b = "Color", e = 0)
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_TRANSFORM)
    public void setTransform(T t, com.facebook.react.bridge.am amVar) {
        if (amVar == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, amVar);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "opacity", d = 1.0f)
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ELEVATION)
    public void setElevation(T t, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            t.setElevation(o.a(f));
        }
    }

    @com.facebook.react.uimanager.a.a(a = PROP_Z_INDEX)
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent == null || !(parent instanceof z)) {
            return;
        }
        ((z) parent).b();
    }

    @com.facebook.react.uimanager.a.a(a = PROP_RENDER_TO_HARDWARE_TEXTURE)
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_TEST_ID)
    public void setTestId(T t, String str) {
        t.setTag(f.a.react_test_id, str);
        t.setTag(str);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_NATIVE_ID)
    public void setNativeId(T t, String str) {
        t.setTag(f.a.view_tag_native_id, str);
        com.facebook.react.uimanager.d.a.a(t);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(T t, String str) {
        t.setContentDescription(str);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ACCESSIBILITY_COMPONENT_TYPE)
    public void setAccessibilityComponentType(T t, String str) {
        a.a(t, str);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_IMPORTANT_FOR_ACCESSIBILITY)
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals("auto")) {
            t.setImportantForAccessibility(0);
        } else if (str.equals("yes")) {
            t.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            t.setImportantForAccessibility(2);
        } else if (!str.equals("no-hide-descendants")) {
        } else {
            t.setImportantForAccessibility(4);
        }
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ROTATION)
    @Deprecated
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_SCALE_X, d = 1.0f)
    @Deprecated
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_SCALE_Y, d = 1.0f)
    @Deprecated
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @com.facebook.react.uimanager.a.a(a = PROP_TRANSLATE_X, d = BitmapDescriptorFactory.HUE_RED)
    @Deprecated
    public void setTranslateX(T t, float f) {
        t.setTranslationX(o.a(f));
    }

    @com.facebook.react.uimanager.a.a(a = PROP_TRANSLATE_Y, d = BitmapDescriptorFactory.HUE_RED)
    @Deprecated
    public void setTranslateY(T t, float f) {
        t.setTranslationY(o.a(f));
    }

    @com.facebook.react.uimanager.a.a(a = PROP_ACCESSIBILITY_LIVE_REGION)
    public void setAccessibilityLiveRegion(T t, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (str == null || str.equals("none")) {
                t.setAccessibilityLiveRegion(0);
            } else if (str.equals("polite")) {
                t.setAccessibilityLiveRegion(1);
            } else if (!str.equals("assertive")) {
            } else {
                t.setAccessibilityLiveRegion(2);
            }
        }
    }

    private static void setTransformProperty(View view, com.facebook.react.bridge.am amVar) {
        ah.a(amVar, sTransformDecompositionArray);
        h.a(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(o.a((float) sMatrixDecompositionContext.f3909d[0]));
        view.setTranslationY(o.a((float) sMatrixDecompositionContext.f3909d[1]));
        view.setRotation((float) sMatrixDecompositionContext.e[2]);
        view.setRotationX((float) sMatrixDecompositionContext.e[0]);
        view.setRotationY((float) sMatrixDecompositionContext.e[1]);
        view.setScaleX((float) sMatrixDecompositionContext.f3907b[0]);
        view.setScaleY((float) sMatrixDecompositionContext.f3907b[1]);
        double[] dArr = sMatrixDecompositionContext.f3906a;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == BitmapDescriptorFactory.HUE_RED) {
                f = 7.8125E-4f;
            }
            view.setCameraDistance(b.b().density * ((-1.0f) / f) * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(o.a((float) BitmapDescriptorFactory.HUE_RED));
        view.setTranslationY(o.a((float) BitmapDescriptorFactory.HUE_RED));
        view.setRotation(BitmapDescriptorFactory.HUE_RED);
        view.setRotationX(BitmapDescriptorFactory.HUE_RED);
        view.setRotationY(BitmapDescriptorFactory.HUE_RED);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(BitmapDescriptorFactory.HUE_RED);
    }
}
