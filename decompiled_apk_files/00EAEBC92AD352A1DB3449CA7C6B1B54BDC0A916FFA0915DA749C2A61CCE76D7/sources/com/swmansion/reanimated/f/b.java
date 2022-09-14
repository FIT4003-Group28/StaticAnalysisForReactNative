package com.swmansion.reanimated.f;

import a.r.d0;
import a.r.v0;
import a.r.x;
import a.r.y;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class b extends v0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f9978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f9979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f9980c;

        a(b bVar, View view, float f2, float f3) {
            this.f9978a = view;
            this.f9979b = f2;
            this.f9980c = f3;
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            this.f9978a.setScaleX(this.f9979b);
            this.f9978a.setScaleY(this.f9980c);
            xVar.mo24b(this);
        }
    }

    private Animator a(View view, float f2, float f3, d0 d0Var) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float f4 = scaleX * f2;
        float f5 = scaleX * f3;
        float f6 = f2 * scaleY;
        float f7 = f3 * scaleY;
        if (d0Var != null) {
            Float f8 = (Float) d0Var.f583a.get("scale:scaleX");
            Float f9 = (Float) d0Var.f583a.get("scale:scaleY");
            if (f8 != null && f8.floatValue() != scaleX) {
                f4 = f8.floatValue();
            }
            if (f9 != null && f9.floatValue() != scaleY) {
                f6 = f9.floatValue();
            }
        }
        view.setScaleX(f4);
        view.setScaleY(f6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, f4, f5), ObjectAnimator.ofFloat(view, View.SCALE_Y, f6, f7));
        mo20a(new a(this, view, scaleX, scaleY));
        return animatorSet;
    }

    @Override // a.r.v0
    public Animator a(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return a(view, 0.0f, 1.0f, d0Var);
    }

    @Override // a.r.v0
    public Animator b(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return a(view, 1.0f, 0.0f, d0Var);
    }

    @Override // a.r.v0, a.r.x
    public void c(d0 d0Var) {
        super.c(d0Var);
        d0Var.f583a.put("scale:scaleX", Float.valueOf(d0Var.f584b.getScaleX()));
        d0Var.f583a.put("scale:scaleY", Float.valueOf(d0Var.f584b.getScaleY()));
    }
}
