package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import java.util.Locale;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactViewManager extends ReactClippingViewManager<f> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f6379b;

        a(ReactViewManager reactViewManager, f fVar) {
            this.f6379b = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((UIManagerModule) ((ReactContext) this.f6379b.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(new g(this.f6379b.getId()));
        }
    }

    private void handleHotspotUpdate(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 2) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
        }
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        fVar.drawableHotspotChanged(q.a(readableArray.getDouble(0)), q.a(readableArray.getDouble(1)));
    }

    private void handleSetPressed(f fVar, ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() != 1) {
            throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
        }
        fVar.setPressed(readableArray.getBoolean(0));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public f mo345createViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.f.a(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(f fVar, int i) {
        fVar.setNextFocusDownId(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(f fVar, int i) {
        fVar.setNextFocusForwardId(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(f fVar, int i) {
        fVar.setNextFocusLeftId(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(f fVar, int i) {
        fVar.setNextFocusRightId(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(f fVar, int i) {
        fVar.setNextFocusUpId(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            handleHotspotUpdate(fVar, readableArray);
        } else if (i != 2) {
        } else {
            handleSetPressed(fVar, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, String str, ReadableArray readableArray) {
        char c2;
        int hashCode = str.hashCode();
        if (hashCode != -1639565984) {
            if (hashCode == -399823752 && str.equals(HOTSPOT_UPDATE_KEY)) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (str.equals("setPressed")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            handleHotspotUpdate(fVar, readableArray);
        } else if (c2 != 1) {
        } else {
            handleSetPressed(fVar, readableArray);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "accessible")
    public void setAccessible(f fVar, boolean z) {
        fVar.setFocusable(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(f fVar, String str) {
        fVar.setBackfaceVisibility(str);
    }

    @com.facebook.react.uimanager.e1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(f fVar, int i, Integer num) {
        float f2 = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f2 = num.intValue() >>> 24;
        }
        fVar.setBorderColor(SPACING_TYPES[i], intValue, f2);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(f fVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2) && f2 < 0.0f) {
            f2 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        if (i == 0) {
            fVar.setBorderRadius(f2);
        } else {
            fVar.setBorderRadius(f2, i - 1);
        }
    }

    @com.facebook.react.uimanager.e1.a(name = "borderStyle")
    public void setBorderStyle(f fVar, String str) {
        fVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.e1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(f fVar, int i, float f2) {
        if (!com.facebook.yoga.g.a(f2) && f2 < 0.0f) {
            f2 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f2)) {
            f2 = q.b(f2);
        }
        fVar.setBorderWidth(SPACING_TYPES[i], f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "collapsable")
    public void setCollapsable(f fVar, boolean z) {
    }

    @com.facebook.react.uimanager.e1.a(name = "focusable")
    public void setFocusable(f fVar, boolean z) {
        if (z) {
            fVar.setOnClickListener(new a(this, fVar));
            fVar.setFocusable(true);
            return;
        }
        fVar.setOnClickListener(null);
        fVar.setClickable(false);
    }

    @com.facebook.react.uimanager.e1.a(name = "hitSlop")
    public void setHitSlop(f fVar, ReadableMap readableMap) {
        if (readableMap == null) {
            fVar.setHitSlopRect(null);
            return;
        }
        int i = 0;
        int a2 = readableMap.hasKey("left") ? (int) q.a(readableMap.getDouble("left")) : 0;
        int a3 = readableMap.hasKey("top") ? (int) q.a(readableMap.getDouble("top")) : 0;
        int a4 = readableMap.hasKey("right") ? (int) q.a(readableMap.getDouble("right")) : 0;
        if (readableMap.hasKey("bottom")) {
            i = (int) q.a(readableMap.getDouble("bottom"));
        }
        fVar.setHitSlopRect(new Rect(a2, a3, a4, i));
    }

    @com.facebook.react.uimanager.e1.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(f fVar, ReadableMap readableMap) {
        fVar.setTranslucentBackgroundDrawable(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @com.facebook.react.uimanager.e1.a(name = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(f fVar, ReadableMap readableMap) {
        fVar.setForeground(readableMap == null ? null : c.a(fVar.getContext(), readableMap));
    }

    @com.facebook.react.uimanager.e1.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(f fVar, boolean z) {
        fVar.setNeedsOffscreenAlphaCompositing(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setOpacity(f fVar, float f2) {
        fVar.setOpacityIfPossible(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "pointerEvents")
    public void setPointerEvents(f fVar, String str) {
        fVar.setPointerEvents(str == null ? r.AUTO : r.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @com.facebook.react.uimanager.e1.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(f fVar, boolean z) {
        if (z) {
            fVar.setFocusable(true);
            fVar.setFocusableInTouchMode(true);
            fVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setTransform(f fVar, ReadableArray readableArray) {
        super.setTransform((ReactViewManager) fVar, readableArray);
        fVar.setBackfaceVisibilityDependantOpacity();
    }
}
