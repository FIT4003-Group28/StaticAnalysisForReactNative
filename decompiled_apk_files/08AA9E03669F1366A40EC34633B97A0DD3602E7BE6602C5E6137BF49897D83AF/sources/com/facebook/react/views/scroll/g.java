package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.n;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: ReactScrollViewHelper.java */
/* loaded from: classes.dex */
public class g {
    public static void a(ViewGroup viewGroup, float f, float f2) {
        a(viewGroup, i.SCROLL, f, f2);
    }

    public static void a(ViewGroup viewGroup) {
        a(viewGroup, i.BEGIN_DRAG);
    }

    public static void b(ViewGroup viewGroup, float f, float f2) {
        a(viewGroup, i.END_DRAG, f, f2);
    }

    public static void a(ViewGroup viewGroup, int i, int i2) {
        a(viewGroup, i.MOMENTUM_BEGIN, i, i2);
    }

    public static void b(ViewGroup viewGroup) {
        a(viewGroup, i.MOMENTUM_END);
    }

    private static void a(ViewGroup viewGroup, i iVar) {
        a(viewGroup, iVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private static void a(ViewGroup viewGroup, i iVar, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ((UIManagerModule) ((aj) viewGroup.getContext()).b(UIManagerModule.class)).getEventDispatcher().a(h.a(viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

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
        throw new n("wrong overScrollMode: " + str);
    }
}
