package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
/* compiled from: PG */
/* renamed from: dof  reason: default package */
/* loaded from: classes6.dex */
final class dof {
    public final View a;
    public final View b;
    public final ObjectAnimator c;
    public final ObjectAnimator d;
    public final AnimatorSet e;
    public final AnimatorSet f;
    public int g;
    public int h = 17170445;

    public dof(View view, View view2) {
        this.a = view;
        this.b = view2;
        doe.c(17170445, view, view2);
        int integer = view.getResources().getInteger(17694720);
        this.g = view2.getHeight();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, this.g, 0.0f);
        this.c = ofFloat3;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f, this.g);
        this.d = ofFloat4;
        AnimatorSet b = b(integer, ofFloat, ofFloat4);
        this.e = b;
        AnimatorSet b2 = b(integer, ofFloat2, ofFloat3);
        this.f = b2;
        view2.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: doc
            private final dof a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                dof dofVar = this.a;
                int i9 = i4 - i2;
                if (dofVar.g == i9) {
                    return;
                }
                dofVar.g = i9;
                dofVar.c.setFloatValues(i9, 0.0f);
                dofVar.d.setFloatValues(0.0f, dofVar.g);
            }
        });
        dod dodVar = new dod(this, view, view2);
        b.addListener(dodVar);
        b2.addListener(dodVar);
    }

    private static AnimatorSet b(int i, ObjectAnimator... objectAnimatorArr) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorArr);
        animatorSet.setDuration(i);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final void a() {
        if (this.e.isRunning()) {
            this.e.cancel();
        }
        if (this.f.isRunning()) {
            this.f.cancel();
        }
    }
}
