package com.th3rdwave.safeareacontext;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
/* loaded from: classes.dex */
class f {
    private static a a(View view) {
        if (Build.VERSION.SDK_INT < 23) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            return new a(rect.top, view.getWidth() - rect.right, view.getHeight() - rect.bottom, rect.left);
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            return new a(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getStableInsetBottom(), rootWindowInsets.getSystemWindowInsetLeft());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(ViewGroup viewGroup, View view) {
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new c(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a b(View view) {
        View rootView;
        a a2;
        if (view.getHeight() == 0 || (a2 = a((rootView = view.getRootView()))) == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        a2.f10086a = Math.max(a2.f10086a - rect.top, 0.0f);
        a2.f10089d = Math.max(a2.f10089d - rect.left, 0.0f);
        a2.f10088c = Math.max(((rect.top + view.getHeight()) + a2.f10088c) - rootView.getHeight(), 0.0f);
        a2.f10087b = Math.max(((rect.left + view.getWidth()) + a2.f10087b) - rootView.getWidth(), 0.0f);
        return a2;
    }
}
