package com.facebook.react.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.f;
/* loaded from: classes.dex */
public abstract class ReactClippingViewManager<T extends f> extends ViewGroupManager<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i) {
        addView((ReactClippingViewManager<T>) ((f) viewGroup), view, i);
    }

    public void addView(T t, View view, int i) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.addViewWithSubviewClippingEnabled(view, i);
        } else {
            t.addView(view, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(ViewGroup viewGroup, int i) {
        return getChildAt((ReactClippingViewManager<T>) ((f) viewGroup), i);
    }

    public View getChildAt(T t, int i) {
        return t.getRemoveClippedSubviews() ? t.getChildAtWithSubviewClippingEnabled(i) : t.getChildAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(ViewGroup viewGroup) {
        return getChildCount((ReactClippingViewManager<T>) ((f) viewGroup));
    }

    public int getChildCount(T t) {
        return t.getRemoveClippedSubviews() ? t.getAllChildrenCount() : t.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeAllViews(ViewGroup viewGroup) {
        removeAllViews((ReactClippingViewManager<T>) ((f) viewGroup));
    }

    public void removeAllViews(T t) {
        UiThreadUtil.assertOnUiThread();
        if (t.getRemoveClippedSubviews()) {
            t.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t.removeAllViews();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i) {
        removeViewAt((ReactClippingViewManager<T>) ((f) viewGroup), i);
    }

    public void removeViewAt(T t, int i) {
        UiThreadUtil.assertOnUiThread();
        if (!t.getRemoveClippedSubviews()) {
            t.removeViewAt(i);
            return;
        }
        View childAt = getChildAt((ReactClippingViewManager<T>) t, i);
        if (childAt.getParent() != null) {
            t.removeView(childAt);
        }
        t.removeViewWithSubviewClippingEnabled(childAt);
    }

    @com.facebook.react.uimanager.e1.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t, boolean z) {
        UiThreadUtil.assertOnUiThread();
        t.setRemoveClippedSubviews(z);
    }
}
