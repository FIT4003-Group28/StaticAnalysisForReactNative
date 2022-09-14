package defpackage;

import android.animation.ValueAnimator;
/* compiled from: PG */
/* renamed from: zkb  reason: default package */
/* loaded from: classes7.dex */
final class zkb implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ zke a;

    public zkb(zke zkeVar) {
        this.a = zkeVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.OT();
    }
}
