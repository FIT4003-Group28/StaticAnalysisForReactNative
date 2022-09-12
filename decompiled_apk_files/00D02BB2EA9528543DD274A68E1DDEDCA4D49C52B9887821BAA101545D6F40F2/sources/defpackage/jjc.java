package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: jjc  reason: default package */
/* loaded from: classes7.dex */
final class jjc extends AnimatorListenerAdapter {
    final /* synthetic */ jjd a;

    public jjc(jjd jjdVar) {
        this.a = jjdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.b.c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        jjd jjdVar = this.a.b.c;
        if (jjdVar != null) {
            jjdVar.cancel();
        }
        this.a.b.c = (jjd) animator;
    }
}
