package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: csne  reason: default package */
/* loaded from: classes5.dex */
public final class csne extends cskm {
    final /* synthetic */ csnf a;

    public csne(csnf csnfVar) {
        this.a = csnfVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            this.a.h = null;
            return;
        }
        csnf csnfVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(csnfVar.g, false);
        this.a.d.cancel();
        this.a.d();
        Runnable runnable = this.a.h;
        if (runnable == null) {
            return;
        }
        runnable.run();
        this.a.h = null;
    }
}
