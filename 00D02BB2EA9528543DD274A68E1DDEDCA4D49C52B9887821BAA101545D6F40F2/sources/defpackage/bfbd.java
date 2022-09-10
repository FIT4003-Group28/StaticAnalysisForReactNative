package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: bfbd  reason: default package */
/* loaded from: classes3.dex */
final class bfbd implements Animation.AnimationListener {
    final /* synthetic */ bfbe a;

    public bfbd(bfbe bfbeVar) {
        this.a = bfbeVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        bfbe bfbeVar = this.a;
        bfbeVar.a = false;
        cqkx.p(bfbeVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
