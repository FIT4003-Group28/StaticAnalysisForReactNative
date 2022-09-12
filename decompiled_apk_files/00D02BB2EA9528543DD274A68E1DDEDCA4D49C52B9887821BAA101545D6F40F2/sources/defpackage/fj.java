package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fj  reason: default package */
/* loaded from: classes.dex */
public final class fj extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ fd c;
    final /* synthetic */ akq d;
    final /* synthetic */ fy e;

    public fj(ViewGroup viewGroup, View view, fd fdVar, fy fyVar, akq akqVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = fdVar;
        this.e = fyVar;
        this.d = akqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        fd fdVar = this.c;
        fa faVar = fdVar.S;
        Animator animator2 = faVar == null ? null : faVar.b;
        fdVar.aA(null);
        if (animator2 == null || this.a.indexOfChild(this.b) >= 0) {
            return;
        }
        this.e.b(this.c, this.d);
    }
}
