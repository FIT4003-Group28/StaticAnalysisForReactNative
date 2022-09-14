package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjg  reason: default package */
/* loaded from: classes.dex */
public final class gjg extends AnimatorListenerAdapter {
    final /* synthetic */ acyu a;
    final /* synthetic */ acyu b;
    final /* synthetic */ egu c;
    final /* synthetic */ MainLayout d;

    public gjg(MainLayout mainLayout, acyu acyuVar, acyu acyuVar2, egu eguVar) {
        this.d = mainLayout;
        this.a = acyuVar;
        this.b = acyuVar2;
        this.c = eguVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.aa.b.removeView(this.a.o());
        this.a.m(this.d.ac);
        MainLayout mainLayout = this.d;
        acyu acyuVar = this.b;
        mainLayout.ab = acyuVar;
        mainLayout.aa.b.addView(acyuVar.o());
        this.b.l(this.d.ac);
        this.d.ao(this.c);
        int c = this.b.c() - this.b.u();
        int B = MainLayout.B(this.c, c, this.d.aa.c.height());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c, 0.0f);
        ofFloat.setInterpolator(irf.b);
        ofFloat.setDuration(B);
        final acyu acyuVar2 = this.b;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, acyuVar2) { // from class: gje
            private final gjg a;
            private final acyu b;

            {
                this.a = this;
                this.b = acyuVar2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                gjg gjgVar = this.a;
                this.b.o().setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                gjgVar.d.D();
            }
        });
        ofFloat.addListener(new gjf(this));
        ofFloat.start();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.ad = true;
    }
}
