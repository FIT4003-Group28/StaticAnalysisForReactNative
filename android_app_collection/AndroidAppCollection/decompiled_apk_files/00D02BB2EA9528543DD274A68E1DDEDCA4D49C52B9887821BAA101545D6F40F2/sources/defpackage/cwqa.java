package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cwqa  reason: default package */
/* loaded from: classes5.dex */
final class cwqa extends AnimatorListenerAdapter {
    final /* synthetic */ cwql a;

    public cwqa(cwql cwqlVar) {
        this.a = cwqlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.aJ();
    }
}
