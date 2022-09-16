package defpackage;

import android.animation.Animator;
import android.view.Choreographer;
/* compiled from: PG */
/* renamed from: tow  reason: default package */
/* loaded from: classes4.dex */
public final class tow extends tov {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final toz e = new toz(this);
    public final int c = -1;

    private tow(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    public static void b(Animator animator, Runnable runnable) {
        animator.addListener(new tow(animator, runnable));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            final toz tozVar = this.e;
            Choreographer choreographer = ((tpa) tpa.a.get()).b;
            if (tozVar.a == null) {
                tozVar.a = new Choreographer.FrameCallback() { // from class: toy
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        toz tozVar2 = toz.this;
                        tow towVar = tozVar2.b;
                        towVar.d++;
                        if (towVar.a(towVar.a) || tozVar2.b.a.isStarted()) {
                            return;
                        }
                        tow towVar2 = tozVar2.b;
                        if (towVar2.c != -1 && towVar2.d >= 0) {
                            return;
                        }
                        Runnable runnable = towVar2.b;
                        if (runnable != null) {
                            runnable.run();
                        }
                        tozVar2.b.a.start();
                    }
                };
            }
            choreographer.postFrameCallback(tozVar.a);
        }
    }
}
