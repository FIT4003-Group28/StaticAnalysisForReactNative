package com.facebook.react.uimanager;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class BaseViewManager<T extends View, C extends i> extends ViewManager<T, C> implements b<T> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static j.a sMatrixDecompositionContext = new j.a();
    private static double[] sTransformDecompositionArray = new double[16];
    public static final Map<String, Integer> sStateDescription = new HashMap();

    static {
        sStateDescription.put(STATE_BUSY, Integer.valueOf(com.facebook.react.j.state_busy_description));
        sStateDescription.put(STATE_EXPANDED, Integer.valueOf(com.facebook.react.j.state_expanded_description));
        sStateDescription.put("collapsed", Integer.valueOf(com.facebook.react.j.state_collapsed_description));
    }

    private void logUnsupportedPropertyWarning(String str) {
        c.d.d.e.a.c("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(q.b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setTranslationY(q.b(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        view.setRotation(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationX(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setRotationY(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    private static float sanitizeFloatPropertyValue(float f2) {
        if (f2 < -3.4028235E38f || f2 > Float.MAX_VALUE) {
            if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
                return -3.4028235E38f;
            }
            if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
                return Float.MAX_VALUE;
            }
            if (Float.isNaN(f2)) {
                return CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            throw new IllegalStateException("Invalid float property value: " + f2);
        }
        return f2;
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.a();
        m0.a(readableArray, sTransformDecompositionArray);
        j.a(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(q.b(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5993d[0])));
        view.setTranslationY(q.b(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5993d[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5994e[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5994e[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5994e[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5991b[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f5991b[1]));
        double[] dArr = sMatrixDecompositionContext.f5990a;
        if (dArr.length > 2) {
            float f2 = (float) dArr[2];
            if (f2 == CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f2 = 7.8125E-4f;
            }
            float f3 = (-1.0f) / f2;
            float f4 = c.a().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f4 * f4 * f3 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t) {
        s.d(t);
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        Context context;
        int i;
        String str = (String) t.getTag(com.facebook.react.h.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(com.facebook.react.h.accessibility_state);
        String str2 = (String) t.getTag(com.facebook.react.h.accessibility_hint);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(com.facebook.react.h.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    context = t.getContext();
                    i = com.facebook.react.j.state_mixed_description;
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    context = t.getContext();
                    i = com.facebook.react.j.state_busy_description;
                } else if (nextKey.equals(STATE_EXPANDED) && dynamic2.getType() == ReadableType.Boolean) {
                    context = t.getContext();
                    i = dynamic2.asBoolean() ? com.facebook.react.j.state_expanded_description : com.facebook.react.j.state_collapsed_description;
                }
                arrayList.add(context.getString(i));
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        f.b a2 = com.facebook.react.common.f.a();
        a2.a("topAccessibilityAction", com.facebook.react.common.f.a("registrationName", "onAccessibilityAction"));
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(com.facebook.react.h.accessibility_actions, readableArray);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(com.facebook.react.h.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(com.facebook.react.h.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        int i;
        if (str == null || str.equals("none")) {
            i = 0;
        } else if (str.equals("polite")) {
            i = 1;
        } else if (!str.equals("assertive")) {
            return;
        } else {
            i = 2;
        }
        a.g.m.v.g(t, i);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            return;
        }
        t.setTag(com.facebook.react.h.accessibility_role, s.c.a(str));
    }

    @com.facebook.react.uimanager.e1.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t.setTag(com.facebook.react.h.accessibility_value, readableMap);
        if (!readableMap.hasKey("text")) {
            return;
        }
        updateViewContentDescription(t);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        t.setBackgroundColor(i);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomLeftRadius(T t, float f2) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomRightRadius(T t, float f2) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderRadius(T t, float f2) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopLeftRadius(T t, float f2) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopRightRadius(T t, float f2) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "elevation")
    public void setElevation(T t, float f2) {
        a.g.m.v.a(t, q.b(f2));
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        int i;
        if (str == null || str.equals("auto")) {
            i = 0;
        } else if (str.equals("yes")) {
            i = 1;
        } else if (str.equals("no")) {
            i = 2;
        } else if (!str.equals("no-hide-descendants")) {
            return;
        } else {
            i = 4;
        }
        a.g.m.v.h(t, i);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(com.facebook.react.h.view_tag_native_id, str);
        com.facebook.react.uimanager.i1.a.b(t);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f2) {
        t.setAlpha(f2);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setLayerType(z ? 2 : 0, null);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "rotation")
    @Deprecated
    public void setRotation(T t, float f2) {
        t.setRotation(f2);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t, float f2) {
        t.setScaleX(f2);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t, float f2) {
        t.setScaleY(f2);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(com.facebook.react.h.react_test_id, str);
        t.setTag(str);
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t);
        } else {
            setTransformProperty(t, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateX")
    @Deprecated
    public void setTranslateX(T t, float f2) {
        t.setTranslationX(q.b(f2));
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, name = "translateY")
    @Deprecated
    public void setTranslateY(T t, float f2) {
        t.setTranslationY(q.b(f2));
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t.setTag(com.facebook.react.h.accessibility_state, readableMap);
        t.setSelected(false);
        t.setEnabled(true);
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals(STATE_BUSY) || nextKey.equals(STATE_EXPANDED) || (nextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            } else if (t.isAccessibilityFocused()) {
                t.sendAccessibilityEvent(1);
            }
        }
    }

    @Override // com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(name = "zIndex")
    public void setZIndex(T t, float f2) {
        ViewGroupManager.setViewZIndex(t, Math.round(f2));
        ViewParent parent = t.getParent();
        if (parent instanceof e0) {
            ((e0) parent).updateDrawingOrder();
        }
    }
}
