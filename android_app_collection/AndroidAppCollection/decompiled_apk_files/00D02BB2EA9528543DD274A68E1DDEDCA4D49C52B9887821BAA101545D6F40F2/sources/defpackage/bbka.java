package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
/* renamed from: bbka  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbka implements cqfc {
    static final cqfc a = new bbka();

    private bbka() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        View a2 = cqhu.a(view, bbkw.b);
        View a3 = cqhu.a(view, bbkw.a);
        if (a2 == null || a3 == null) {
            return;
        }
        a2.setTranslationY(100.0f);
        a3.setTranslationY(25.0f);
        a3.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a2, "rotation", 0.0f, 360.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(100L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(a2, "rotation", 0.0f, 360.0f);
        ofFloat2.setInterpolator(eho.a(0.63f, 0.63f, 0.06f, 1.0f));
        ofFloat2.setDuration(250L);
        animatorSet.playSequentially(ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(animatorSet, ObjectAnimator.ofFloat(a2, "scaleX", 1.0f), ObjectAnimator.ofFloat(a2, "scaleY", 1.0f));
        animatorSet2.setDuration(350L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(a3, "translationY", 0.0f), ObjectAnimator.ofFloat(a3, "alpha", 1.0f));
        animatorSet3.setInterpolator(eho.a(0.95f, 0.01f, 0.46f, 1.0f));
        animatorSet3.setDuration(250L);
        animatorSet3.setStartDelay(100L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet2, animatorSet3);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(ObjectAnimator.ofFloat(a2, "translationY", 0.0f), animatorSet4);
        animatorSet5.setDuration(500L);
        animatorSet5.start();
    }
}
