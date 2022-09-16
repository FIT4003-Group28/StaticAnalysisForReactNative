package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: aljc  reason: default package */
/* loaded from: classes.dex */
public final class aljc implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BottomSheetBehavior a;

    public aljc(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        almx almxVar = this.a.c;
        if (almxVar != null) {
            almxVar.m(floatValue);
        }
    }
}
