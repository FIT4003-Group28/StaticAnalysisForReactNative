package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: nme  reason: default package */
/* loaded from: classes3.dex */
final class nme implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ nmf d;
    private final /* synthetic */ int e;

    public nme(nmf nmfVar, View view, View view2, View view3) {
        this.d = nmfVar;
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    public nme(nmf nmfVar, View view, View view2, View view3, int i) {
        this.e = i;
        this.d = nmfVar;
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.e == 0) {
            float b = nmh.b(this.a, ((Float) valueAnimator.getAnimatedValue()).floatValue() * this.d.a);
            this.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.b.setTranslationX(b);
            this.c.setTranslationX(b);
            return;
        }
        float b2 = nmh.b(this.a, 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * this.d.a;
        this.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.b.setTranslationX(b2);
        this.c.setTranslationX(b2);
    }
}
