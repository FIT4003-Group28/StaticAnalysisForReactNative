package com.baidu.mapapi.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeDismissTouchListener f1737a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(SwipeDismissTouchListener swipeDismissTouchListener) {
        this.f1737a = swipeDismissTouchListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1737a.a();
    }
}
