package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: aknh  reason: default package */
/* loaded from: classes.dex */
final class aknh extends AnimatorListenerAdapter {
    final /* synthetic */ akni a;

    public aknh(akni akniVar) {
        this.a = akniVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.am.a(aknp.ENTER_FROM_BELOW_ANIMATION);
    }
}
