package defpackage;

import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: awq  reason: default package */
/* loaded from: classes3.dex */
final class awq implements Animation.AnimationListener {
    final /* synthetic */ axb a;

    public awq(axb axbVar) {
        this.a = axbVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        awz awzVar;
        axb axbVar = this.a;
        if (axbVar.b) {
            axbVar.k.setAlpha(255);
            this.a.k.start();
            axb axbVar2 = this.a;
            if (axbVar2.l && (awzVar = axbVar2.a) != null) {
                awzVar.a();
            }
            axb axbVar3 = this.a;
            axbVar3.c = axbVar3.e.getTop();
            return;
        }
        axbVar.g();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
