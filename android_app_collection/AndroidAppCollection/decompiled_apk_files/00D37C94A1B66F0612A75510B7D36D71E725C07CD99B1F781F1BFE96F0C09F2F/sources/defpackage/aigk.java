package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aigk  reason: default package */
/* loaded from: classes.dex */
public final class aigk extends AnimatorListenerAdapter {
    final /* synthetic */ aigl a;

    public aigk(aigl aiglVar) {
        this.a = aiglVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.g();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.setVisibility(0);
    }
}
