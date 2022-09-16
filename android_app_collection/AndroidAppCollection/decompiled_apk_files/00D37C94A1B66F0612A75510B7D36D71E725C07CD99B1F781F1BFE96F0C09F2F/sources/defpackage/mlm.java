package defpackage;

import android.view.View;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: mlm  reason: default package */
/* loaded from: classes3.dex */
final class mlm implements Animation.AnimationListener {
    private final mln a;
    private final boolean b;

    public mlm(mln mlnVar, boolean z) {
        this.a = mlnVar;
        this.b = z;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        mln mlnVar = this.a;
        boolean z = this.b;
        mkl mklVar = (mkl) mlnVar;
        if (!zdg.e(mklVar.a) || !z) {
            return;
        }
        View childAt = mklVar.b.getChildAt(0);
        if (!mh.c(childAt.createAccessibilityNodeInfo()).b.isAccessibilityFocused()) {
            return;
        }
        childAt.performAccessibilityAction(128, null);
        childAt.sendAccessibilityEvent(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
