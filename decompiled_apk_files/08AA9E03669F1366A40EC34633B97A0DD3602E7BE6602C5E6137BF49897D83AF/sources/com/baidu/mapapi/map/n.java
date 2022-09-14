package com.baidu.mapapi.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.map.SwipeDismissTouchListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f1738a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1739b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SwipeDismissTouchListener f1740c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(SwipeDismissTouchListener swipeDismissTouchListener, ViewGroup.LayoutParams layoutParams, int i) {
        this.f1740c = swipeDismissTouchListener;
        this.f1738a = layoutParams;
        this.f1739b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SwipeDismissTouchListener.DismissCallbacks dismissCallbacks;
        View view;
        Object obj;
        View view2;
        View view3;
        dismissCallbacks = this.f1740c.f;
        view = this.f1740c.e;
        obj = this.f1740c.l;
        dismissCallbacks.onDismiss(view, obj);
        view2 = this.f1740c.e;
        view2.setTranslationX(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED);
        this.f1738a.height = this.f1739b;
        view3 = this.f1740c.e;
        view3.setLayoutParams(this.f1738a);
    }
}
