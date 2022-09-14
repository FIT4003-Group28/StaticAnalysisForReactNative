package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxux  reason: default package */
/* loaded from: classes5.dex */
public final class cxux extends AnimatorListenerAdapter {
    final /* synthetic */ cxuz a;

    public cxux(cxuz cxuzVar) {
        this.a = cxuzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e.setVisibility(0);
    }
}
