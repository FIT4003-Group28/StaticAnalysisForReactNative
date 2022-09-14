package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ViewAnimator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfhs  reason: default package */
/* loaded from: classes3.dex */
public final class bfhs implements Animation.AnimationListener {
    final /* synthetic */ ViewAnimator a;
    final /* synthetic */ bfht b;

    public bfhs(bfht bfhtVar, ViewAnimator viewAnimator) {
        this.b = bfhtVar;
        this.a = viewAnimator;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        View a;
        dbsk.s(this.b.e);
        this.b.S();
        bfht bfhtVar = this.b;
        ViewAnimator viewAnimator = this.a;
        if (!bfhtVar.l().booleanValue() || (a = cqhu.a(viewAnimator, bfzt.k)) == null) {
            return;
        }
        bfhtVar.a.q(a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
