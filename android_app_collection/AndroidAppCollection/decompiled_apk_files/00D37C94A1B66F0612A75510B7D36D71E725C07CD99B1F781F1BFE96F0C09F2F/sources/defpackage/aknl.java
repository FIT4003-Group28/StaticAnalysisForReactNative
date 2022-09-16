package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: aknl  reason: default package */
/* loaded from: classes.dex */
final class aknl extends AnimatorListenerAdapter {
    final /* synthetic */ aknr a;

    public aknl(aknr aknrVar) {
        this.a = aknrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.am.a(aknp.CONTENTS_ENTER_ANIMATION);
    }
}
