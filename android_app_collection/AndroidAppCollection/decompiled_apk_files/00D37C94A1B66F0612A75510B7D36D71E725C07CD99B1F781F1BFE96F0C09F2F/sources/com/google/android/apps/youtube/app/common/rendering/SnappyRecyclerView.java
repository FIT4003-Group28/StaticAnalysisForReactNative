package com.google.android.apps.youtube.app.common.rendering;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SnappyRecyclerView extends RecyclerView {
    public yzq W;

    public SnappyRecyclerView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final boolean as(int i, int i2) {
        xw xwVar = this.n;
        if (xwVar instanceof fhb) {
            al(((fhb) xwVar).b(i, i2));
            return true;
        }
        return super.as(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 26 && (getContext() instanceof Activity)) {
            Activity activity = (Activity) getContext();
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                activity.getWindow().getDecorView().requestLayout();
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yzq yzqVar = this.W;
        if (yzqVar != null) {
            yzqVar.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        xw xwVar = this.n;
        if ((xwVar instanceof fhb) && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.F == 0)) {
            al(((fhb) xwVar).a());
        }
        return onTouchEvent;
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
