package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfa  reason: default package */
/* loaded from: classes.dex */
public final class acfa extends AnimatorListenerAdapter {
    final /* synthetic */ acfh a;

    public acfa(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f26J = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        acfh acfhVar = this.a;
        acfhVar.f26J = true;
        acfhVar.b.setVisibility(0);
        this.a.g.setVisibility(0);
    }
}
