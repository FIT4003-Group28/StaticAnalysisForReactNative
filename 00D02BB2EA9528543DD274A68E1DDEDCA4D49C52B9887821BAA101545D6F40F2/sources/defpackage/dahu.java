package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: dahu  reason: default package */
/* loaded from: classes5.dex */
public final class dahu implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    public dahu(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.m.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
