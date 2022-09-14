package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
/* compiled from: ReactHorizontalScrollContainerView.java */
/* loaded from: classes.dex */
public class c extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f4022a;

    public c(Context context) {
        super(context);
        this.f4022a = com.facebook.react.modules.i18nmanager.a.a().a(context) ? 1 : 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f4022a == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            int computeHorizontalScrollRange = computeHorizontalScrollRange() - getScrollX();
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo(computeHorizontalScrollRange, horizontalScrollView.getScrollY());
        }
    }
}
