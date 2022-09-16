package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: azn  reason: default package */
/* loaded from: classes3.dex */
final class azn extends AnimatorListenerAdapter implements aym {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public azn(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        g(true);
    }

    private final void f() {
        if (!this.a) {
            azf.c(this.b, this.c);
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    private final void g(boolean z) {
        ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        azc.a(viewGroup, z);
    }

    @Override // defpackage.aym
    public final void a(ayn aynVar) {
        f();
        aynVar.E(this);
    }

    @Override // defpackage.aym
    public final void b() {
    }

    @Override // defpackage.aym
    public final void c() {
        g(false);
    }

    @Override // defpackage.aym
    public final void d() {
        g(true);
    }

    @Override // defpackage.aym
    public final void e(ayn aynVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.a) {
            azf.c(this.b, this.c);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.a) {
            azf.c(this.b, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
