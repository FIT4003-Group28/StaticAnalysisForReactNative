package defpackage;

import android.animation.Animator;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;
/* compiled from: PG */
/* renamed from: jfn  reason: default package */
/* loaded from: classes3.dex */
final class jfn implements Animator.AnimatorListener {
    final /* synthetic */ SlimStatusBar a;
    final /* synthetic */ jfq b;

    public jfn(jfq jfqVar, SlimStatusBar slimStatusBar) {
        this.b = jfqVar;
        this.a = slimStatusBar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setBackgroundColor(this.b.a);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
