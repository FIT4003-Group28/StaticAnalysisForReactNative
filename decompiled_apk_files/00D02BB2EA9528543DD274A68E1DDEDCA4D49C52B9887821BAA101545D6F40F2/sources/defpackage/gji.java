package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gji  reason: default package */
/* loaded from: classes6.dex */
public final class gji implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ MainLayout b;

    public gji(MainLayout mainLayout, View view) {
        this.b = mainLayout;
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.b.w();
        this.b.x();
    }
}
