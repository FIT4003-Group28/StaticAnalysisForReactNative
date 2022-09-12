package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: dful  reason: default package */
/* loaded from: classes6.dex */
final class dful implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ dfum a;

    public dful(dfum dfumVar) {
        this.a = dfumVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a.a();
    }
}
