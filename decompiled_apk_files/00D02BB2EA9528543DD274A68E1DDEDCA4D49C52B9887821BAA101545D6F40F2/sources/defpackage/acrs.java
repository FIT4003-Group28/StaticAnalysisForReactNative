package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: acrs  reason: default package */
/* loaded from: classes2.dex */
final class acrs implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ acrt b;

    public acrs(acrt acrtVar, View view) {
        this.b = acrtVar;
        this.a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        acrt acrtVar = this.b;
        float f = acrtVar.b;
        acrtVar.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        acrt acrtVar2 = this.b;
        acrtVar2.c = acrtVar2.b > f;
        this.a.postInvalidate();
    }
}
