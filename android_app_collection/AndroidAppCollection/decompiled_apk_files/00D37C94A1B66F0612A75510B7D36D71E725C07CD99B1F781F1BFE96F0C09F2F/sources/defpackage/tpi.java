package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tpi  reason: default package */
/* loaded from: classes4.dex */
public final class tpi extends tov {
    final /* synthetic */ tpj a;

    public tpi(tpj tpjVar) {
        this.a = tpjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        tpj tpjVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(tpjVar.h, false);
        this.a.a();
    }
}
