package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
/* compiled from: PG */
/* renamed from: alib  reason: default package */
/* loaded from: classes.dex */
public final class alib implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ almx a;
    final /* synthetic */ AppBarLayout b;

    public alib(AppBarLayout appBarLayout, almx almxVar) {
        this.b = appBarLayout;
        this.a = almxVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.k(floatValue);
        Drawable drawable = this.b.g;
        if (drawable instanceof almx) {
            ((almx) drawable).k(floatValue);
        }
        for (alij alijVar : this.b.f) {
            int i = this.a.f;
            alijVar.a();
        }
    }
}
