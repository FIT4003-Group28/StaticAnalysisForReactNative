package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bwst  reason: default package */
/* loaded from: classes4.dex */
final class bwst extends AnimatorListenerAdapter {
    final /* synthetic */ bwsw a;

    public bwst(bwsw bwswVar) {
        this.a = bwswVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        for (bwvi bwviVar : this.a.a.values()) {
            bwviVar.c(true);
        }
        this.a.d = null;
    }
}
