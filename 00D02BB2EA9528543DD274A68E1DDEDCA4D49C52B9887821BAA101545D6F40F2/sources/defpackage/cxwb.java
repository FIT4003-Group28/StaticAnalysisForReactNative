package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxwb  reason: default package */
/* loaded from: classes5.dex */
public final class cxwb extends AnimatorListenerAdapter {
    final /* synthetic */ cxwe a;

    public cxwb(cxwe cxweVar) {
        this.a = cxweVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.k.setTranslationY(0.0f);
    }
}
