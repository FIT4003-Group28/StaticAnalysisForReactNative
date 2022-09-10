package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.FusedLocationProviderApi;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daac  reason: default package */
/* loaded from: classes5.dex */
public final class daac extends daaa {
    public daac(czzp czzpVar, czzo czzoVar) {
        super(czzpVar, czzoVar);
    }

    private final Animator w(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.B, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.daaa
    public final void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        this.c = u();
        this.c.setTintList(colorStateList);
        if (mode != null) {
            this.c.setTintMode(mode);
        }
        this.c.W(this.B.getContext());
        if (i > 0) {
            Context context = this.B.getContext();
            dadx dadxVar = this.b;
            nb.b(dadxVar);
            czzc czzcVar = new czzc(dadxVar);
            int c = akm.c(context, R.color.design_fab_stroke_top_outer_color);
            int c2 = akm.c(context, R.color.design_fab_stroke_top_inner_color);
            int c3 = akm.c(context, R.color.design_fab_stroke_end_inner_color);
            int c4 = akm.c(context, R.color.design_fab_stroke_end_outer_color);
            czzcVar.c = c;
            czzcVar.d = c2;
            czzcVar.e = c3;
            czzcVar.f = c4;
            float f = i;
            if (czzcVar.b != f) {
                czzcVar.b = f;
                czzcVar.a.setStrokeWidth(f * 1.3333f);
                czzcVar.g = true;
                czzcVar.invalidateSelf();
            }
            czzcVar.a(colorStateList);
            this.e = czzcVar;
            czzc czzcVar2 = this.e;
            nb.b(czzcVar2);
            dadr dadrVar = this.c;
            nb.b(dadrVar);
            drawable = new LayerDrawable(new Drawable[]{czzcVar2, dadrVar});
        } else {
            this.e = null;
            drawable = this.c;
        }
        this.d = new RippleDrawable(dadg.a(colorStateList2), drawable, null);
        this.f = this.d;
    }

    @Override // defpackage.daaa
    public final void b(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(dadg.a(colorStateList));
        } else {
            super.b(colorStateList);
        }
    }

    @Override // defpackage.daaa
    public final float d() {
        return this.B.getElevation();
    }

    @Override // defpackage.daaa
    public final void k(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.B.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(v, w(f, f3));
            stateListAnimator.addState(w, w(f, f2));
            stateListAnimator.addState(x, w(f, f2));
            stateListAnimator.addState(y, w(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.B, FusedLocationProviderApi.EXTRA_KEY_ELEVATION_WGS84_M, f).setDuration(0L));
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, this.B.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.B, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(z, animatorSet);
            stateListAnimator.addState(A, w(0.0f, 0.0f));
            this.B.setStateListAnimator(stateListAnimator);
        }
        if (s()) {
            q();
        }
    }

    @Override // defpackage.daaa
    public final void m(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.B.isEnabled()) {
                this.B.setElevation(this.i);
                if (this.B.isPressed()) {
                    this.B.setTranslationZ(this.k);
                    return;
                } else if (this.B.isFocused() || this.B.isHovered()) {
                    this.B.setTranslationZ(this.j);
                    return;
                } else {
                    this.B.setTranslationZ(0.0f);
                    return;
                }
            }
            this.B.setElevation(0.0f);
            this.B.setTranslationZ(0.0f);
        }
    }

    @Override // defpackage.daaa
    public final void n() {
    }

    @Override // defpackage.daaa
    public final void p() {
        q();
    }

    @Override // defpackage.daaa
    public final void r(Rect rect) {
        if (this.D.b()) {
            super.r(rect);
        } else if (!j()) {
            int b = (this.l - this.B.b()) / 2;
            rect.set(b, b, b, b);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.daaa
    public final boolean s() {
        return this.D.b() || !j();
    }

    @Override // defpackage.daaa
    public final boolean t() {
        return false;
    }

    @Override // defpackage.daaa
    public final dadr u() {
        dadx dadxVar = this.b;
        nb.b(dadxVar);
        return new daab(dadxVar);
    }
}
