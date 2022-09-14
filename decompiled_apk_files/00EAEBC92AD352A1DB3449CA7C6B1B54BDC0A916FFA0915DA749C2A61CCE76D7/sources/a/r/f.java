package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class f extends v0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f613a;

        a(f fVar, View view) {
            this.f613a = view;
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            o0.a(this.f613a, 1.0f);
            o0.a(this.f613a);
            xVar.mo24b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f614a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f615b = false;

        b(View view) {
            this.f614a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0.a(this.f614a, 1.0f);
            if (this.f615b) {
                this.f614a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!a.g.m.v.E(this.f614a) || this.f614a.getLayerType() != 0) {
                return;
            }
            this.f615b = true;
            this.f614a.setLayerType(2, null);
        }
    }

    public f(int i) {
        a(i);
    }

    private static float a(d0 d0Var, float f2) {
        Float f3;
        return (d0Var == null || (f3 = (Float) d0Var.f583a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    private Animator a(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        o0.a(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o0.f670b, f3);
        ofFloat.addListener(new b(view));
        mo20a(new a(this, view));
        return ofFloat;
    }

    @Override // a.r.v0
    public Animator a(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        float f2 = 0.0f;
        float a2 = a(d0Var, 0.0f);
        if (a2 != 1.0f) {
            f2 = a2;
        }
        return a(view, f2, 1.0f);
    }

    @Override // a.r.v0
    public Animator b(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        o0.e(view);
        return a(view, a(d0Var, 1.0f), 0.0f);
    }

    @Override // a.r.v0, a.r.x
    public void c(d0 d0Var) {
        super.c(d0Var);
        d0Var.f583a.put("android:fade:transitionAlpha", Float.valueOf(o0.c(d0Var.f584b)));
    }
}
