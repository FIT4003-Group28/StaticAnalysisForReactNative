package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: audl  reason: default package */
/* loaded from: classes2.dex */
final class audl implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;

    public audl(View view) {
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = intValue;
        this.a.setLayoutParams(layoutParams);
    }
}
