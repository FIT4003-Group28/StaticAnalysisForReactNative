package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.LinearInterpolator;
/* renamed from: afbf  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afbf implements cqfc {
    static final cqfc a = new afbf();

    private afbf() {
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        View a2 = cqhu.a(view, afbg.a);
        if (a2 != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a2, "alpha", 0.3f, 1.0f);
            ofFloat.setDuration(400L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofFloat("scaleX", (a2.getWidth() + 6) / a2.getWidth()), PropertyValuesHolder.ofFloat("scaleY", (a2.getHeight() + 6) / a2.getHeight()));
            ofPropertyValuesHolder.setDuration(1600L);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            ofPropertyValuesHolder.setStartDelay(200L);
            animatorSet.play(ofFloat).with(ofPropertyValuesHolder);
            animatorSet.start();
        }
    }
}
