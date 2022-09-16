package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: eic  reason: default package */
/* loaded from: classes.dex */
final class eic extends AnimatorListenerAdapter {
    final /* synthetic */ eif a;

    public eic(eif eifVar) {
        this.a = eifVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eif eifVar = this.a;
        if (!eifVar.b || eifVar.c) {
            return;
        }
        eifVar.a.start();
    }
}
