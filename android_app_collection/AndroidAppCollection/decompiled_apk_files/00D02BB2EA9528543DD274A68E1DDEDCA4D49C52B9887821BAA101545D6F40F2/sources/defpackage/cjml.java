package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cjml  reason: default package */
/* loaded from: classes4.dex */
final class cjml extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ cjmu b;
    final /* synthetic */ int c;
    final /* synthetic */ cjmn d;

    public cjml(cjmn cjmnVar, cjmu cjmuVar, int i) {
        this.d = cjmnVar;
        this.b = cjmuVar;
        this.c = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.d.n(this.c);
            this.d.p();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        cjmn cjmnVar = this.d;
        cjmnVar.d = this.b;
        cjmnVar.p();
    }
}
