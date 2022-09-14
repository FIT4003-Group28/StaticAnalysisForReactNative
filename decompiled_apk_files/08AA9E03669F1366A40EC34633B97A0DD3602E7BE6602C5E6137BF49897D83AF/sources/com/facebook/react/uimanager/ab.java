package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
/* compiled from: RootViewUtil.java */
/* loaded from: classes.dex */
public class ab {
    public static aa a(View view) {
        while (!(view instanceof aa)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            com.facebook.j.a.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (aa) view;
    }
}
