package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.onegoogle.accountmenu.features.obake.HighlightCircleDrawable;
/* compiled from: PG */
/* renamed from: cweq  reason: default package */
/* loaded from: classes5.dex */
public final class cweq {
    public static AnimatorSet a(HighlightCircleDrawable highlightCircleDrawable, String str, int i) {
        ObjectAnimator duration = ObjectAnimator.ofInt(highlightCircleDrawable, str, 0, i).setDuration(700L);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofInt(highlightCircleDrawable, str, i, 0).setDuration(700L);
        duration2.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        return animatorSet;
    }
}
