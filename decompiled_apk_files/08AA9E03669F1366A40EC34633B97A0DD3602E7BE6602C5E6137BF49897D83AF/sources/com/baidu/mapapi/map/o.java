package com.baidu.mapapi.map;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f1741a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SwipeDismissTouchListener f1742b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams) {
        this.f1742b = swipeDismissTouchListener;
        this.f1741a = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        this.f1741a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view = this.f1742b.e;
        view.setLayoutParams(this.f1741a);
    }
}
