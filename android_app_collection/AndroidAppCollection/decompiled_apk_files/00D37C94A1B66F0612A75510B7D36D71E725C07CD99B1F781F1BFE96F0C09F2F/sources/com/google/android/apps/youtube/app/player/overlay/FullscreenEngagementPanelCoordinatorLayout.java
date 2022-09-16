package com.google.android.apps.youtube.app.player.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class FullscreenEngagementPanelCoordinatorLayout extends kdt {
    public axxt i;
    public int j;
    public int k;
    private final DisplayMetrics l;
    private final int m;
    private final int n;

    public FullscreenEngagementPanelCoordinatorLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        long size = View.MeasureSpec.getSize(i) - View.MeasureSpec.getSize(i2);
        int i3 = zew.i(this.l, this.j);
        if (i3 <= 0) {
            i3 = this.m;
        }
        long j = i3;
        int i4 = zew.i(this.l, this.k);
        if (i4 <= 0) {
            i4 = this.n;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) zgd.O(size, j, i4), 1073741824), i2);
    }

    public FullscreenEngagementPanelCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FullscreenEngagementPanelCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = context.getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kgl.a);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
