package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: csko  reason: default package */
/* loaded from: classes5.dex */
public final class csko extends cskm {
    protected final Animator a;
    public final Runnable b;
    public int d;
    private final cskr e = new cskn(this);
    public final int c = -1;

    private csko(Animator animator, Runnable runnable) {
        this.a = animator;
        this.b = runnable;
    }

    public static void b(Animator animator) {
        c(animator, null);
    }

    public static void c(Animator animator, Runnable runnable) {
        animator.addListener(new csko(animator, runnable));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!a(animator)) {
            cskt.c().a(this.e);
        }
    }
}
