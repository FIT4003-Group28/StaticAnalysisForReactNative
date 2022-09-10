package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: gih  reason: default package */
/* loaded from: classes6.dex */
final class gih extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ Runnable c;
    final /* synthetic */ gij d;

    public gih(gij gijVar, boolean z, Runnable runnable, Runnable runnable2) {
        this.d = gijVar;
        this.a = z;
        this.b = runnable;
        this.c = runnable2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.c.run();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            for (gii giiVar : this.d.b) {
                View a = giiVar.a();
                if (a != null && a.getVisibility() == 0) {
                    a.setVisibility(4);
                }
            }
        }
        this.d.a.f();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        this.d.c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            for (gii giiVar : this.d.b) {
                View a = giiVar.a();
                if (a != null && giiVar.c == 0) {
                    a.setVisibility(0);
                }
            }
        }
    }
}
