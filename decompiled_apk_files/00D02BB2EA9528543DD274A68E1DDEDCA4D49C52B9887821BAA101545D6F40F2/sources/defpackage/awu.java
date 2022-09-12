package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: awu  reason: default package */
/* loaded from: classes3.dex */
final class awu implements Animation.AnimationListener {
    final /* synthetic */ axb a;

    public awu(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        axb axbVar = this.a;
        if (!axbVar.d) {
            axbVar.i(null);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
