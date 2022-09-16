package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: awfa  reason: default package */
/* loaded from: classes3.dex */
final class awfa implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ awfc b;

    public awfa(awfc awfcVar, View view) {
        this.b = awfcVar;
        this.a = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.postDelayed(new Runnable(this) { // from class: awez
            private final awfa a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.c();
            }
        }, 800L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
