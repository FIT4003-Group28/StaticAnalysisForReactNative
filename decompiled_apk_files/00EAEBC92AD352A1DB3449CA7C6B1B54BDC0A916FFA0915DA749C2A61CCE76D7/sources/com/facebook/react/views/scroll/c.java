package com.facebook.react.views.scroll;

import android.content.Context;
import android.widget.HorizontalScrollView;
/* loaded from: classes.dex */
public class c extends com.facebook.react.views.view.f {

    /* renamed from: b  reason: collision with root package name */
    private int f6205b;

    /* renamed from: c  reason: collision with root package name */
    private int f6206c;

    public c(Context context) {
        super(context);
        this.f6205b = com.facebook.react.modules.i18nmanager.a.a().b(context) ? 1 : 0;
        this.f6206c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f6205b == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.f6206c, horizontalScrollView.getScrollY());
        }
        this.f6206c = getWidth();
    }
}
