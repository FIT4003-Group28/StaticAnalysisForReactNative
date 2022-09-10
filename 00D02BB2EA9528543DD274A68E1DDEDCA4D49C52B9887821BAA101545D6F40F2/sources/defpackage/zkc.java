package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: zkc  reason: default package */
/* loaded from: classes7.dex */
final class zkc extends AnimatorListenerAdapter {
    final /* synthetic */ zke a;

    public zkc(zke zkeVar) {
        this.a = zkeVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a.a = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
    }
}
