package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: eif  reason: default package */
/* loaded from: classes.dex */
public final class eif {
    private static final Interpolator d = new LinearInterpolator();
    private static final Interpolator e = pq.a(0.8f, 0.0f, 1.0f, 1.0f);
    public final AnimatorSet a;
    public boolean b = false;
    public boolean c = false;
    private final ValueAnimator f;
    private final ValueAnimator g;
    @dzsi
    private ViewTreeObserver.OnGlobalLayoutListener h;

    public eif() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.4f, 1.0f);
        this.f = ofFloat;
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(d);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.4f);
        this.g = ofFloat2;
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(e);
        AnimatorSet animatorSet = new AnimatorSet();
        this.a = animatorSet;
        animatorSet.playSequentially(ofFloat2, ofFloat);
        animatorSet.addListener(new eic(this));
    }

    public final void a(View view) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c = false;
        this.f.addUpdateListener(new eie(this, view));
        this.g.addUpdateListener(new eie(this, view));
        eid eidVar = new eid(this, view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(eidVar);
        this.h = eidVar;
        this.a.start();
    }

    public final void b(View view) {
        if (!this.b) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.h;
        if (onGlobalLayoutListener != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        this.h = null;
        c();
    }

    public final void c() {
        this.b = false;
        this.c = false;
        this.a.cancel();
        this.f.removeAllUpdateListeners();
        this.g.removeAllUpdateListeners();
    }
}
