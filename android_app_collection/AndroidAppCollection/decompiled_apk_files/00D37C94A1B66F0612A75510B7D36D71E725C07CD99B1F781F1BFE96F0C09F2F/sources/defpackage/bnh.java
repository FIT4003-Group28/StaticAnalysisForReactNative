package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnh  reason: default package */
/* loaded from: classes2.dex */
public final class bnh extends AnimatorListenerAdapter {
    final /* synthetic */ bnk a;

    public bnh(bnk bnkVar) {
        this.a = bnkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p();
        animator.removeListener(this);
    }
}
