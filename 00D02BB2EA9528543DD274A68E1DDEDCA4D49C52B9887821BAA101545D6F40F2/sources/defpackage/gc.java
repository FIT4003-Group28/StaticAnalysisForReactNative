package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gc  reason: default package */
/* loaded from: classes.dex */
public final class gc extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ fd c;

    public gc(ViewGroup viewGroup, View view, fd fdVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = fdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        fd fdVar = this.c;
        View view = fdVar.P;
        if (view == null || !fdVar.H) {
            return;
        }
        view.setVisibility(8);
    }
}
