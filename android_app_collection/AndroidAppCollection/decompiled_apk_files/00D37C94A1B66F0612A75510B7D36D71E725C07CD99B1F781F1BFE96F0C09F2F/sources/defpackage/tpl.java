package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tpl  reason: default package */
/* loaded from: classes4.dex */
public final class tpl extends tov {
    final /* synthetic */ tpm a;

    public tpl(tpm tpmVar) {
        this.a = tpmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        tpm tpmVar = this.a;
        super/*android.graphics.drawable.Drawable*/.setVisible(tpmVar.c, false);
        this.a.b.cancel();
        this.a.a();
    }
}
