package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: alqn  reason: default package */
/* loaded from: classes.dex */
public final class alqn implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    public alqn(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.n.s(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
