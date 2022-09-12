package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: bgyh  reason: default package */
/* loaded from: classes3.dex */
final class bgyh implements Animation.AnimationListener {
    final /* synthetic */ bgyi a;

    public bgyh(bgyi bgyiVar) {
        this.a = bgyiVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
