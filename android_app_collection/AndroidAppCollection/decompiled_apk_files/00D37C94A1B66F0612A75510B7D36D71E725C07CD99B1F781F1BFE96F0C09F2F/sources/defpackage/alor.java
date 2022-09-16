package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alor  reason: default package */
/* loaded from: classes.dex */
public final class alor implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ alot c;

    public alor(alot alotVar, View view, View view2) {
        this.c = alotVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.a(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
