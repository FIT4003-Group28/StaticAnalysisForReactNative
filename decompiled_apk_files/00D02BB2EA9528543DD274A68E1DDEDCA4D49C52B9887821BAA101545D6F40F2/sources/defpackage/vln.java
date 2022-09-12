package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: vln  reason: default package */
/* loaded from: classes7.dex */
final class vln implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ vlp a;
    private final WeakReference<View> b;

    public vln(vlp vlpVar, View view) {
        this.a = vlpVar;
        this.b = new WeakReference<>(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.b.get();
        if (view != null) {
            view.setAlpha(((Float) this.a.a.getAnimatedValue()).floatValue());
            return;
        }
        this.a.c();
        this.a.a.removeUpdateListener(this);
    }
}
