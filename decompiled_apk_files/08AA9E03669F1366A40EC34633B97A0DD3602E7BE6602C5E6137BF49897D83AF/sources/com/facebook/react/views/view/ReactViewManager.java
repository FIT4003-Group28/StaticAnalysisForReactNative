package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.o;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class ReactViewManager extends ViewGroupManager<f> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.a.a(a = "collapsable")
    public void setCollapsable(f fVar, boolean z) {
    }

    @com.facebook.react.uimanager.a.a(a = "accessible")
    public void setAccessible(f fVar, boolean z) {
        fVar.setFocusable(z);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"}, c = Float.NaN)
    public void setBorderRadius(f fVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f) && f < BitmapDescriptorFactory.HUE_RED) {
            f = Float.NaN;
        }
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        if (i == 0) {
            fVar.setBorderRadius(f);
        } else {
            fVar.a(f, i - 1);
        }
    }

    @com.facebook.react.uimanager.a.a(a = "borderStyle")
    public void setBorderStyle(f fVar, String str) {
        fVar.setBorderStyle(str);
    }

    @com.facebook.react.uimanager.a.a(a = "hitSlop")
    public void setHitSlop(f fVar, an anVar) {
        if (anVar == null) {
            fVar.setHitSlopRect(null);
            return;
        }
        int i = 0;
        int a2 = anVar.hasKey("left") ? (int) o.a(anVar.getDouble("left")) : 0;
        int a3 = anVar.hasKey("top") ? (int) o.a(anVar.getDouble("top")) : 0;
        int a4 = anVar.hasKey("right") ? (int) o.a(anVar.getDouble("right")) : 0;
        if (anVar.hasKey("bottom")) {
            i = (int) o.a(anVar.getDouble("bottom"));
        }
        fVar.setHitSlopRect(new Rect(a2, a3, a4, i));
    }

    @com.facebook.react.uimanager.a.a(a = "pointerEvents")
    public void setPointerEvents(f fVar, String str) {
        if (str == null) {
            fVar.setPointerEvents(p.AUTO);
        } else {
            fVar.setPointerEvents(p.valueOf(str.toUpperCase(Locale.US).replace("-", b.a.a.a.a.d.b.ROLL_OVER_FILE_NAME_SEPARATOR)));
        }
    }

    @com.facebook.react.uimanager.a.a(a = "nativeBackgroundAndroid")
    public void setNativeBackground(f fVar, an anVar) {
        fVar.setTranslucentBackgroundDrawable(anVar == null ? null : c.a(fVar.getContext(), anVar));
    }

    @com.facebook.react.uimanager.a.a(a = "nativeForegroundAndroid")
    @TargetApi(23)
    public void setNativeForeground(f fVar, an anVar) {
        fVar.setForeground(anVar == null ? null : c.a(fVar.getContext(), anVar));
    }

    @com.facebook.react.uimanager.a.a(a = "removeClippedSubviews")
    public void setRemoveClippedSubviews(f fVar, boolean z) {
        fVar.setRemoveClippedSubviews(z);
    }

    @com.facebook.react.uimanager.a.a(a = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(f fVar, boolean z) {
        fVar.setNeedsOffscreenAlphaCompositing(z);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"}, c = Float.NaN)
    public void setBorderWidth(f fVar, int i, float f) {
        if (!com.facebook.yoga.a.a(f) && f < BitmapDescriptorFactory.HUE_RED) {
            f = Float.NaN;
        }
        if (!com.facebook.yoga.a.a(f)) {
            f = o.a(f);
        }
        fVar.a(SPACING_TYPES[i], f);
    }

    @com.facebook.react.uimanager.a.b(a = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"}, b = "Color")
    public void setBorderColor(f fVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : num.intValue() & 16777215;
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        fVar.a(SPACING_TYPES[i], intValue, f);
    }

    @com.facebook.react.uimanager.a.a(a = "overflow")
    public void setOverflow(f fVar, String str) {
        fVar.setOverflow(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public f mo170createViewInstance(af afVar) {
        return new f(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("hotspotUpdate", 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(f fVar, int i, am amVar) {
        switch (i) {
            case 1:
                if (amVar == null || amVar.size() != 2) {
                    throw new n("Illegal number of arguments for 'updateHotspot' command");
                }
                if (Build.VERSION.SDK_INT < 21) {
                    return;
                }
                fVar.drawableHotspotChanged(o.a(amVar.getDouble(0)), o.a(amVar.getDouble(1)));
                return;
            case 2:
                if (amVar == null || amVar.size() != 1) {
                    throw new n("Illegal number of arguments for 'setPressed' command");
                }
                fVar.setPressed(amVar.getBoolean(0));
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(f fVar, View view, int i) {
        if (fVar.getRemoveClippedSubviews()) {
            fVar.a(view, i);
        } else {
            fVar.addView(view, i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(f fVar) {
        if (fVar.getRemoveClippedSubviews()) {
            return fVar.getAllChildrenCount();
        }
        return fVar.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(f fVar, int i) {
        if (fVar.getRemoveClippedSubviews()) {
            return fVar.b(i);
        }
        return fVar.getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(f fVar, int i) {
        if (fVar.getRemoveClippedSubviews()) {
            View childAt = getChildAt(fVar, i);
            if (childAt.getParent() != null) {
                fVar.removeView(childAt);
            }
            fVar.a(childAt);
            return;
        }
        fVar.removeViewAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(f fVar) {
        if (fVar.getRemoveClippedSubviews()) {
            fVar.c();
        } else {
            fVar.removeAllViews();
        }
    }
}
