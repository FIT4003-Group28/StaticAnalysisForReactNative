package defpackage;

import android.animation.ValueAnimator;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjj  reason: default package */
/* loaded from: classes6.dex */
public final class gjj implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ glg a;
    final /* synthetic */ MainLayout b;

    public gjj(MainLayout mainLayout, glg glgVar) {
        this.b = mainLayout;
        this.a = glgVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.d().setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.b.w();
        this.b.x();
    }
}
