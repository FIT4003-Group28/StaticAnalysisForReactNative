package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: eeh  reason: default package */
/* loaded from: classes.dex */
final class eeh extends AnimatorListenerAdapter {
    final /* synthetic */ egu a;
    final /* synthetic */ eeo b;

    public eeh(eeo eeoVar, egu eguVar) {
        this.b = eeoVar;
        this.a = eguVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getDuration();
        this.b.e = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getDuration();
        this.b.e = null;
        Handler handler = new Handler(Looper.getMainLooper());
        final egu eguVar = this.a;
        handler.post(new Runnable(this, eguVar) { // from class: eeg
            private final eeh a;
            private final egu b;

            {
                this.a = this;
                this.b = eguVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                eeh eehVar = this.a;
                eehVar.b.e(this.b);
            }
        });
    }
}
