package com.facebook.react.flat;

import android.graphics.Rect;
import android.os.Build;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import java.util.Map;
/* loaded from: classes.dex */
public final class RCTViewManager extends FlatViewManager {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    static final String REACT_CLASS = "RCTView";
    private static final int[] TMP_INT_ARRAY = new int[2];

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTView";
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void removeAllViews(s sVar) {
        super.removeAllViews(sVar);
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void setBackgroundColor(s sVar, int i) {
        super.setBackgroundColor(sVar, i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.b.f.a("hotspotUpdate", 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public ac mo168createShadowNodeInstance() {
        return new ac();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<ac> getShadowNodeClass() {
        return ac.class;
    }

    @com.facebook.react.uimanager.a.a(a = "nativeBackgroundAndroid")
    public void setHotspot(s sVar, an anVar) {
        sVar.a(anVar == null ? null : com.facebook.react.views.view.c.a(sVar.getContext(), anVar));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(s sVar, int i, am amVar) {
        switch (i) {
            case 1:
                if (amVar == null || amVar.size() != 2) {
                    throw new com.facebook.react.bridge.n("Illegal number of arguments for 'updateHotspot' command");
                }
                if (Build.VERSION.SDK_INT < 21) {
                    return;
                }
                sVar.getLocationOnScreen(TMP_INT_ARRAY);
                sVar.drawableHotspotChanged(com.facebook.react.uimanager.o.a(amVar.getDouble(0)) - TMP_INT_ARRAY[0], com.facebook.react.uimanager.o.a(amVar.getDouble(1)) - TMP_INT_ARRAY[1]);
                return;
            case 2:
                if (amVar == null || amVar.size() != 1) {
                    throw new com.facebook.react.bridge.n("Illegal number of arguments for 'setPressed' command");
                }
                sVar.setPressed(amVar.getBoolean(0));
                return;
            default:
                return;
        }
    }

    @com.facebook.react.uimanager.a.a(a = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(s sVar, boolean z) {
        sVar.a(z);
    }

    @com.facebook.react.uimanager.a.a(a = "pointerEvents")
    public void setPointerEvents(s sVar, String str) {
        sVar.a(parsePointerEvents(str));
    }

    @com.facebook.react.uimanager.a.a(a = "removeClippedSubviews")
    public void setRemoveClippedSubviews(s sVar, boolean z) {
        sVar.b(z);
    }

    private static com.facebook.react.uimanager.p parsePointerEvents(String str) {
        if (str != null) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -2089141766) {
                if (hashCode != -2089112978) {
                    if (hashCode != 3005871) {
                        if (hashCode == 3387192 && str.equals("none")) {
                            c2 = 0;
                        }
                    } else if (str.equals("auto")) {
                        c2 = 1;
                    }
                } else if (str.equals("box-only")) {
                    c2 = 3;
                }
            } else if (str.equals("box-none")) {
                c2 = 2;
            }
            switch (c2) {
                case 0:
                    return com.facebook.react.uimanager.p.NONE;
                case 1:
                    return com.facebook.react.uimanager.p.AUTO;
                case 2:
                    return com.facebook.react.uimanager.p.BOX_NONE;
                case 3:
                    return com.facebook.react.uimanager.p.BOX_ONLY;
            }
        }
        return com.facebook.react.uimanager.p.AUTO;
    }

    @com.facebook.react.uimanager.a.a(a = "hitSlop")
    public void setHitSlop(s sVar, an anVar) {
        if (anVar == null) {
            sVar.b((Rect) null);
        } else {
            sVar.b(new Rect((int) com.facebook.react.uimanager.o.a(anVar.getDouble("left")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("top")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("right")), (int) com.facebook.react.uimanager.o.a(anVar.getDouble("bottom"))));
        }
    }
}
