package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alki  reason: default package */
/* loaded from: classes.dex */
public final class alki extends AnimatorListenerAdapter {
    final /* synthetic */ alkr a;

    public alki(alkr alkrVar) {
        this.a = alkrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alkr alkrVar = this.a;
        alkrVar.w = 0;
        alkrVar.r = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.x.g(0, false);
        alkr alkrVar = this.a;
        alkrVar.w = 2;
        alkrVar.r = animator;
    }
}
