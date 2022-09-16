package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bof  reason: default package */
/* loaded from: classes2.dex */
final class bof extends AnimatorListenerAdapter implements bnj {
    private final View b;
    private final int c;
    private final ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public bof(View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (ViewGroup) view.getParent();
        g(true);
    }

    private final void f() {
        if (!this.a) {
            bny.d(this.b, this.c);
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
        bnv.a(viewGroup, z);
    }

    @Override // defpackage.bnj
    public final void a(bnk bnkVar) {
        f();
        bnkVar.B(this);
    }

    @Override // defpackage.bnj
    public final void b() {
    }

    @Override // defpackage.bnj
    public final void c() {
        g(false);
    }

    @Override // defpackage.bnj
    public final void d() {
        g(true);
    }

    @Override // defpackage.bnj
    public final void e() {
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
            bny.d(this.b, this.c);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.a) {
            bny.d(this.b, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
