package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csmx  reason: default package */
/* loaded from: classes5.dex */
public final class csmx extends cskm {
    final /* synthetic */ csmy a;

    public csmx(csmy csmyVar) {
        this.a = csmyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.i = null;
            return;
        }
        csmy csmyVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(csmyVar.h, false);
        Runnable runnable = this.a.i;
        if (runnable != null) {
            runnable.run();
            this.a.i = null;
        }
        this.a.f();
    }
}
