package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ViewAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfhl  reason: default package */
/* loaded from: classes3.dex */
public final class bfhl implements Animation.AnimationListener {
    final /* synthetic */ ViewAnimator a;
    final /* synthetic */ bfhm b;

    public bfhl(bfhm bfhmVar, ViewAnimator viewAnimator) {
        this.b = bfhmVar;
        this.a = viewAnimator;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View a;
        dbsk.s(this.b.g);
        this.b.aN();
        bfhm bfhmVar = this.b;
        ViewAnimator viewAnimator = this.a;
        if (bfhmVar.l().booleanValue() && (a = cqhu.a(viewAnimator, bfzt.i)) != null) {
            bfhmVar.a.a().K(a, bfhmVar.b);
        }
        this.b.aM(this.a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
