package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clch  reason: default package */
/* loaded from: classes5.dex */
public final class clch extends AnimatorListenerAdapter {
    final /* synthetic */ clcl a;

    public clch(clcl clclVar) {
        this.a = clclVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        clcl clclVar = this.a;
        clclVar.l = null;
        clclVar.n();
        this.a.o(true);
    }
}
