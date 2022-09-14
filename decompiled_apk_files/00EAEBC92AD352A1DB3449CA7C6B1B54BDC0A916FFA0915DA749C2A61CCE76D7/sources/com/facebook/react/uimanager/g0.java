package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
/* loaded from: classes.dex */
public class g0 {
    public static f0 a(View view) {
        while (!(view instanceof f0)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            c.d.k.a.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (f0) view;
    }
}
