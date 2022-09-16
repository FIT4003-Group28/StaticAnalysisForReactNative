package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: ahvj  reason: default package */
/* loaded from: classes.dex */
final class ahvj implements Animation.AnimationListener {
    final /* synthetic */ ahvm a;

    public ahvj(ahvm ahvmVar) {
        this.a = ahvmVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
