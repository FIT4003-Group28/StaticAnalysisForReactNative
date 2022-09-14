package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
/* loaded from: classes.dex */
class c extends b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c(FloatingActionButton floatingActionButton, c.e.a.c.z.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(b.F);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void a(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.G, a(f2, f4));
            stateListAnimator.addState(b.H, a(f2, f3));
            stateListAnimator.addState(b.I, a(f2, f3));
            stateListAnimator.addState(b.J, a(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.F);
            stateListAnimator.addState(b.K, animatorSet);
            stateListAnimator.addState(b.L, a(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (s()) {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void a(Rect rect) {
        if (this.z.a()) {
            super.a(rect);
            return;
        }
        int sizeDimension = !t() ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void a(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.y.isEnabled()) {
                this.y.setElevation(this.f8094h);
                if (this.y.isPressed()) {
                    floatingActionButton = this.y;
                    f2 = this.j;
                } else if (this.y.isFocused() || this.y.isHovered()) {
                    floatingActionButton = this.y;
                    f2 = this.i;
                }
                floatingActionButton.setTranslationZ(f2);
            }
            this.y.setElevation(0.0f);
            floatingActionButton = this.y;
            floatingActionButton.setTranslationZ(f2);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public float b() {
        return this.y.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f8089c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(c.e.a.c.y.b.a(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.b
    public void m() {
        w();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean r() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    boolean s() {
        return this.z.a() || !t();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    void u() {
    }
}
