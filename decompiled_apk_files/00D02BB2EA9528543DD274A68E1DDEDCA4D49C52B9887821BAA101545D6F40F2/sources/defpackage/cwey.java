package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.accountmenu.features.obake.HighlightCircleDrawable;
/* compiled from: PG */
/* renamed from: cwey  reason: default package */
/* loaded from: classes5.dex */
final class cwey extends AnimatorListenerAdapter {
    final /* synthetic */ HighlightCircleDrawable a;
    final /* synthetic */ cvxj b;
    final /* synthetic */ cwfa c;

    public cwey(cwfa cwfaVar, HighlightCircleDrawable highlightCircleDrawable, cvxj cvxjVar) {
        this.c = cwfaVar;
        this.a = highlightCircleDrawable;
        this.b = cvxjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.b.setRingRetriever(null);
        this.a.a = true;
        this.c.d.k(this.b);
        this.c.c.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.f.b(37);
        this.c.e.run();
    }
}
