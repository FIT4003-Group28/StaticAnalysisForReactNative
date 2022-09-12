package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bwss  reason: default package */
/* loaded from: classes4.dex */
final class bwss extends AnimatorListenerAdapter {
    final /* synthetic */ bwsw a;

    public bwss(bwsw bwswVar) {
        this.a = bwswVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d = null;
    }
}
