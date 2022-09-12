package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
/* compiled from: PG */
/* renamed from: agbs  reason: default package */
/* loaded from: classes2.dex */
public final class agbs extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final RectF a;
    public RectF b;
    public RectF c;
    @dzsi
    public agbs e;
    private final View f;
    private final float g = 1.0f;
    public float d = 1.0f;
    private final RectF h = new RectF();
    private final RectF i = new RectF();
    private final Matrix j = new Matrix();
    private final Matrix k = new Matrix();

    public agbs(View view) {
        setIntValues(0);
        this.f = view;
        d(view);
        RectF e = e(view);
        this.a = e;
        this.b = e;
        this.c = e;
        setDuration(375L);
        setInterpolator(irf.a);
        addListener(this);
        addUpdateListener(this);
    }

    private final void c(RectF rectF) {
        float animatedFraction = getAnimatedFraction();
        rectF.set(this.b.left + ((this.c.left - this.b.left) * animatedFraction), this.b.top + ((this.c.top - this.b.top) * animatedFraction), this.b.right + ((this.c.right - this.b.right) * animatedFraction), this.b.bottom + ((this.c.bottom - this.b.bottom) * animatedFraction));
    }

    private static void d(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
    }

    private static RectF e(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    public final RectF a(View view, boolean z) {
        d(view);
        RectF e = e(view);
        if (!bvox.a(view)) {
            e.right = e.left + this.f.getWidth();
        } else {
            e.left = e.right - this.f.getWidth();
        }
        if (z) {
            e.bottom = e.top + this.f.getHeight();
        } else {
            e.top = e.bottom - this.f.getHeight();
        }
        return e;
    }

    public final void b(View view) {
        this.c = a(view, true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d(this.f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d(this.f);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Matrix matrix = this.j;
        Matrix matrix2 = this.k;
        agbs agbsVar = this.e;
        if (agbsVar == null) {
            matrix.reset();
            matrix2.reset();
        } else {
            RectF rectF = agbsVar.a;
            RectF rectF2 = this.h;
            agbsVar.c(rectF2);
            matrix.setTranslate(-rectF.left, -rectF.top);
            matrix2.setTranslate(rectF.left - rectF2.left, rectF.top - rectF2.top);
            matrix2.postScale(rectF.width() / rectF2.width(), rectF.height() / rectF2.height());
        }
        RectF rectF3 = this.h;
        rectF3.set(this.a);
        matrix.mapRect(rectF3);
        RectF rectF4 = this.i;
        c(rectF4);
        matrix.mapRect(rectF4);
        matrix2.mapRect(rectF4);
        this.f.setTranslationX(rectF4.left - rectF3.left);
        this.f.setTranslationY(rectF4.top - rectF3.top);
        float width = rectF4.width() / rectF3.width();
        if (!Float.isNaN(width)) {
            this.f.setScaleX(width);
        }
        float height = rectF4.height() / rectF3.height();
        if (!Float.isNaN(height)) {
            this.f.setScaleY(height);
        }
        View view = this.f;
        float f = this.g;
        view.setAlpha(f + ((this.d - f) * getAnimatedFraction()));
    }
}
