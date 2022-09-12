package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxqw  reason: default package */
/* loaded from: classes5.dex */
public final class cxqw {
    public static AnimatorSet a(List<View> list) {
        AnimatorSet animatorSet = new AnimatorSet();
        int i = 200;
        for (int i2 = 0; i2 < list.size(); i2++) {
            View view = list.get(i2);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.5f);
            ofFloat.setDuration(300L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f);
            ofFloat2.setDuration(300L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat2).after(ofFloat);
            animatorSet2.setStartDelay(i);
            i += 50;
            animatorSet.play(animatorSet2);
        }
        animatorSet.addListener(new cxqu(animatorSet));
        animatorSet.start();
        return animatorSet;
    }
}
