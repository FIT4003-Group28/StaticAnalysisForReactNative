package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxtu  reason: default package */
/* loaded from: classes5.dex */
public final class cxtu extends AnimatorListenerAdapter {
    final /* synthetic */ cxtv a;

    public cxtu(cxtv cxtvVar) {
        this.a = cxtvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.f.setVisibility(8);
    }
}
