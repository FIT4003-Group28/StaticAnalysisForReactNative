package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayj  reason: default package */
/* loaded from: classes3.dex */
public final class ayj extends AnimatorListenerAdapter {
    final /* synthetic */ ayn a;

    public ayj(ayn aynVar) {
        this.a = aynVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s();
        animator.removeListener(this);
    }
}
