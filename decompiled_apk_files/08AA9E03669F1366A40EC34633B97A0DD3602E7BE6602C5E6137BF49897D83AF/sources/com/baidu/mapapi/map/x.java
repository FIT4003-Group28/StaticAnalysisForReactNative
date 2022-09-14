package com.baidu.mapapi.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* loaded from: classes.dex */
class x extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f1758a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WearMapView f1759b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(WearMapView wearMapView, View view) {
        this.f1759b = wearMapView;
        this.f1758a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1758a.setVisibility(4);
        super.onAnimationEnd(animator);
    }
}
