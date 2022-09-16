package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ShortsEditCoordinatorLayout extends CoordinatorLayout {
    public zdt i;

    public ShortsEditCoordinatorLayout(Context context) {
        super(context);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        zdt zdtVar = this.i;
        if (zdtVar != null) {
            zdtVar.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ShortsEditCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShortsEditCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
