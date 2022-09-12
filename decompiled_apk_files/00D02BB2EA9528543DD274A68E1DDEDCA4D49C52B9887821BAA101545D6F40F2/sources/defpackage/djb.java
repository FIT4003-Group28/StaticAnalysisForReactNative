package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: djb  reason: default package */
/* loaded from: classes6.dex */
public final class djb implements egr {
    @Override // defpackage.egr
    public final Animator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 0.8f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setInterpolator(new aop());
        animatorSet.setDuration(200L);
        return animatorSet;
    }

    @Override // defpackage.egr
    public final Animator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.8f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.8f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setInterpolator(new aop());
        animatorSet.setDuration(200L);
        return animatorSet;
    }

    @Override // defpackage.egr
    public final void c(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
