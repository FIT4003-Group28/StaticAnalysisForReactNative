package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csmz  reason: default package */
/* loaded from: classes5.dex */
public final class csmz extends cskm {
    final /* synthetic */ csnb a;

    public csmz(csnb csnbVar) {
        this.a = csnbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.h = null;
            return;
        }
        csnb csnbVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(csnbVar.f, false);
        this.a.d();
        Runnable runnable = this.a.h;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.a.h = null;
    }
}
