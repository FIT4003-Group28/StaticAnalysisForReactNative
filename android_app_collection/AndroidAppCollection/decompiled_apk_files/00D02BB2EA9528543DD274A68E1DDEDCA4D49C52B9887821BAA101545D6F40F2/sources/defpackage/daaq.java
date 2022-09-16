package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: daaq  reason: default package */
/* loaded from: classes5.dex */
final class daaq extends AnimatorListenerAdapter {
    final /* synthetic */ daas a;

    public daaq(daas daasVar) {
        this.a = daasVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        daas daasVar = this.a;
        if (daasVar.c == animator) {
            daasVar.c = null;
        }
    }
}
