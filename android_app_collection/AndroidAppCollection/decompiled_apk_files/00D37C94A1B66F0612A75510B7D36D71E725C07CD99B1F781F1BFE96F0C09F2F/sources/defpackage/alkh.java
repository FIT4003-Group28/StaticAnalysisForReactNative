package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alkh  reason: default package */
/* loaded from: classes.dex */
public final class alkh extends AnimatorListenerAdapter {
    final /* synthetic */ alkr a;
    private boolean b;

    public alkh(alkr alkrVar) {
        this.a = alkrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alkr alkrVar = this.a;
        alkrVar.w = 0;
        alkrVar.r = null;
        if (!this.b) {
            alkrVar.x.g(4, false);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        alkr alkrVar = this.a;
        alkrVar.w = 1;
        alkrVar.r = animator;
        this.b = false;
    }
}
