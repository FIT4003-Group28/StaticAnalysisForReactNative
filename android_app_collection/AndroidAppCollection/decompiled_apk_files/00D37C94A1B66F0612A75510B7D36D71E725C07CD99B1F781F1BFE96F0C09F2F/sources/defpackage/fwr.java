package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: fwr  reason: default package */
/* loaded from: classes3.dex */
final class fwr implements Animation.AnimationListener {
    final /* synthetic */ fwt a;

    public fwr(fwt fwtVar) {
        this.a = fwtVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.a = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.a = true;
    }
}
