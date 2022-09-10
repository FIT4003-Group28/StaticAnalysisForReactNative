package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: bgyc  reason: default package */
/* loaded from: classes3.dex */
final class bgyc implements Animation.AnimationListener {
    final /* synthetic */ bgyf a;

    public bgyc(bgyf bgyfVar) {
        this.a = bgyfVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        benz benzVar = this.a.c.a;
        benzVar.c = false;
        cqkx.p(benzVar);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
