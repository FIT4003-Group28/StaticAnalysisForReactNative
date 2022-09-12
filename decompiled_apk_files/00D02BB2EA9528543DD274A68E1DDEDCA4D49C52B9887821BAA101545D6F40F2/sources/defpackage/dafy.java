package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dafy  reason: default package */
/* loaded from: classes5.dex */
public final class dafy implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ daga c;

    public dafy(daga dagaVar, View view, View view2) {
        this.c = dagaVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.b(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
