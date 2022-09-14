package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: attu  reason: default package */
/* loaded from: classes2.dex */
final class attu implements Animator.AnimatorListener {
    final /* synthetic */ attw a;

    public attu(attw attwVar) {
        this.a = attwVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.b.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.postDelayed(new Runnable(this) { // from class: attt
            private final attu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.a();
            }
        }, 600L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
