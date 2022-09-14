package a.r;

import a.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
/* loaded from: classes.dex */
class f0 {

    /* loaded from: classes.dex */
    private static class a extends AnimatorListenerAdapter implements x.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f616a;

        /* renamed from: b  reason: collision with root package name */
        private final View f617b;

        /* renamed from: c  reason: collision with root package name */
        private final int f618c;

        /* renamed from: d  reason: collision with root package name */
        private final int f619d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f620e;

        /* renamed from: f  reason: collision with root package name */
        private float f621f;

        /* renamed from: g  reason: collision with root package name */
        private float f622g;

        /* renamed from: h  reason: collision with root package name */
        private final float f623h;
        private final float i;

        a(View view, View view2, int i, int i2, float f2, float f3) {
            this.f617b = view;
            this.f616a = view2;
            this.f618c = i - Math.round(this.f617b.getTranslationX());
            this.f619d = i2 - Math.round(this.f617b.getTranslationY());
            this.f623h = f2;
            this.i = f3;
            this.f620e = (int[]) this.f616a.getTag(s.transition_position);
            if (this.f620e != null) {
                this.f616a.setTag(s.transition_position, null);
            }
        }

        @Override // a.r.x.f
        public void a(x xVar) {
        }

        @Override // a.r.x.f
        public void b(x xVar) {
        }

        @Override // a.r.x.f
        public void c(x xVar) {
        }

        @Override // a.r.x.f
        public void d(x xVar) {
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            this.f617b.setTranslationX(this.f623h);
            this.f617b.setTranslationY(this.i);
            xVar.mo24b(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f620e == null) {
                this.f620e = new int[2];
            }
            this.f620e[0] = Math.round(this.f618c + this.f617b.getTranslationX());
            this.f620e[1] = Math.round(this.f619d + this.f617b.getTranslationY());
            this.f616a.setTag(s.transition_position, this.f620e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f621f = this.f617b.getTranslationX();
            this.f622g = this.f617b.getTranslationY();
            this.f617b.setTranslationX(this.f623h);
            this.f617b.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f617b.setTranslationX(this.f621f);
            this.f617b.setTranslationY(this.f622g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Animator a(View view, d0 d0Var, int i, int i2, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator, x xVar) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0Var.f584b.getTag(s.transition_position);
        if (iArr != null) {
            f6 = (iArr[0] - i) + translationX;
            f7 = (iArr[1] - i2) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int round = i + Math.round(f6 - translationX);
        int round2 = i2 + Math.round(f7 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f7, f5));
        a aVar = new a(view, d0Var.f584b, round, round2, translationX, translationY);
        xVar.mo20a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        a.r.a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
