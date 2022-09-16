package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acez  reason: default package */
/* loaded from: classes.dex */
public final class acez extends AnimatorListenerAdapter {
    final /* synthetic */ acfh a;

    public acez(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        acfh acfhVar = this.a;
        acfhVar.b.setVisibility(8);
        acfhVar.e(false);
        this.a.b.setAlpha(1.0f);
        this.a.K = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.K = true;
    }
}
