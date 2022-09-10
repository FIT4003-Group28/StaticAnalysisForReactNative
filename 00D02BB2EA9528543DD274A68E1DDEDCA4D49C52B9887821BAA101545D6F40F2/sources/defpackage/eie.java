package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: eie  reason: default package */
/* loaded from: classes.dex */
final class eie implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ eif a;
    private final WeakReference<View> b;

    public eie(eif eifVar, View view) {
        this.a = eifVar;
        this.b = new WeakReference<>(view);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.b.get();
        if (view == null || !od.ak(view)) {
            this.a.c();
        } else {
            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }
}
