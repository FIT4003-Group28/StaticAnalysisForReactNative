package com.facebook.react.uimanager;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
/* compiled from: ReactClippingViewGroupHelper.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Rect f3936a = new Rect();

    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof q) {
            q qVar = (q) parent;
            if (qVar.getRemoveClippedSubviews()) {
                qVar.a(f3936a);
                if (!f3936a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                f3936a.offset(-view.getLeft(), -view.getTop());
                f3936a.offset(view.getScrollX(), view.getScrollY());
                rect.set(f3936a);
                return;
            }
        }
        view.getDrawingRect(rect);
    }
}
