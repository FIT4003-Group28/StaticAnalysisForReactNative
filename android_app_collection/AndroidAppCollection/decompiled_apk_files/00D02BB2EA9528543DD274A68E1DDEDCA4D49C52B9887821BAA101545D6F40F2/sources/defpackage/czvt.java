package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: PG */
/* renamed from: czvt  reason: default package */
/* loaded from: classes5.dex */
public final class czvt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BottomSheetBehavior a;

    public czvt(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        dadr dadrVar = this.a.d;
        if (dadrVar != null) {
            dadrVar.Y(floatValue);
        }
    }
}
