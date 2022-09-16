package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfb  reason: default package */
/* loaded from: classes.dex */
public final class acfb extends AnimatorListenerAdapter {
    final /* synthetic */ acfh a;

    public acfb(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.L = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.p.setAlpha(0.0f);
        this.a.p.setVisibility(0);
        this.a.L = true;
    }
}
