package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: dog  reason: default package */
/* loaded from: classes6.dex */
final class dog implements Animation.AnimationListener {
    final /* synthetic */ doh a;

    public dog(doh dohVar) {
        this.a = dohVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a.setVisibility(4);
        this.a.a.setAlpha(1.0f);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
