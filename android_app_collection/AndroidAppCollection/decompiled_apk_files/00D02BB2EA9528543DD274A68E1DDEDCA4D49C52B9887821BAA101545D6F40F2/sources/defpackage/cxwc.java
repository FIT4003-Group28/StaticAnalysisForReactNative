package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxwc  reason: default package */
/* loaded from: classes5.dex */
public final class cxwc extends AnimatorListenerAdapter {
    final /* synthetic */ cxwe a;

    public cxwc(cxwe cxweVar) {
        this.a = cxweVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.k.setVisibility(8);
    }
}
