package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes.dex */
public class g {
    public static int a(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }

    public static void a(ViewGroup viewGroup) {
        a(viewGroup, i.BEGIN_DRAG);
    }

    public static void a(ViewGroup viewGroup, float f2, float f3) {
        a(viewGroup, i.END_DRAG, f2, f3);
    }

    public static void a(ViewGroup viewGroup, int i, int i2) {
        a(viewGroup, i.MOMENTUM_BEGIN, i, i2);
    }

    private static void a(ViewGroup viewGroup, i iVar) {
        a(viewGroup, iVar, 0.0f, 0.0f);
    }

    private static void a(ViewGroup viewGroup, i iVar, float f2, float f3) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((UIManagerModule) ((ReactContext) viewGroup.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().a(h.b(viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f2, f3, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

    public static void b(ViewGroup viewGroup) {
        a(viewGroup, i.MOMENTUM_END);
    }

    public static void b(ViewGroup viewGroup, float f2, float f3) {
        a(viewGroup, i.SCROLL, f2, f3);
    }
}
