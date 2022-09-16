package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csmt  reason: default package */
/* loaded from: classes5.dex */
public final class csmt extends cskm {
    final /* synthetic */ csmu a;

    public csmt(csmu csmuVar) {
        this.a = csmuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.c = null;
            return;
        }
        csmu csmuVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(csmuVar.a, false);
        Runnable runnable = this.a.c;
        if (runnable != null) {
            runnable.run();
            this.a.c = null;
        }
        this.a.d();
    }
}
