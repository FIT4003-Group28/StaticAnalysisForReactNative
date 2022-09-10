package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxuw  reason: default package */
/* loaded from: classes5.dex */
public final class cxuw extends AnimatorListenerAdapter {
    final /* synthetic */ cxuz a;

    public cxuw(cxuz cxuzVar) {
        this.a = cxuzVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.e.setVisibility(4);
    }
}
