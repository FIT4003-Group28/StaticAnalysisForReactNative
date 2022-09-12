package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: cslu  reason: default package */
/* loaded from: classes5.dex */
final class cslu implements View.OnLayoutChangeListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ csme b;

    public cslu(csme csmeVar, Runnable runnable) {
        this.b = csmeVar;
        this.a = runnable;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.run();
        this.b.b();
        csme csmeVar = this.b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(csmeVar.h.a(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(csmeVar.i(csku.a, 0.0f));
        float exactCenterX = csmeVar.b.exactCenterX();
        float f = csmeVar.f.h;
        float exactCenterY = csmeVar.b.exactCenterY();
        csmj csmjVar = csmeVar.f;
        Animator e = csmjVar.e(exactCenterX - f, exactCenterY - csmjVar.i, 0.0f);
        Animator c = csmeVar.g.c(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, e, c);
        animatorSet.addListener(new cslx(csmeVar));
        csmeVar.e(animatorSet);
        this.b.removeOnLayoutChangeListener(this);
    }
}
