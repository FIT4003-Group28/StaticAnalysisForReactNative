package com.google.android.libraries.youtube.edit.gallery;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GalleryNestedScrollView extends NestedScrollView {
    public zuv d;
    public int e;

    public GalleryNestedScrollView(Context context) {
        this(context, null);
    }

    @Override // android.support.v4.widget.NestedScrollView
    public final void i(int i) {
        if (i > 0) {
            v(false);
        } else {
            w();
        }
        lj.G(this);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (f2 > 0.0f) {
            v(true);
            return false;
        }
        zuv zuvVar = this.d;
        if (zuvVar == null) {
            return false;
        }
        zuvVar.o();
        return false;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        int scrollY = getScrollY();
        if (i2 <= 0 || scrollY >= (i3 = this.e)) {
            return;
        }
        int min = Math.min(i3 - scrollY, i2);
        scrollBy(0, min);
        iArr[1] = min;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public final void stopNestedScroll() {
        super.stopNestedScroll();
        zuv zuvVar = this.d;
        if (zuvVar != null) {
            zuvVar.o();
        }
    }

    public final void v(boolean z) {
        if (z) {
            t(this.e, false);
        } else {
            scrollTo(0, this.e);
        }
    }

    public final void w() {
        scrollTo(0, 0);
    }

    public GalleryNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GalleryNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 0;
    }
}
