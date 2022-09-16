package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abov  reason: default package */
/* loaded from: classes.dex */
public final class abov extends AnimatorListenerAdapter {
    final /* synthetic */ abow a;

    public abov(abow abowVar) {
        this.a = abowVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.g.setVisibility(0);
    }
}
