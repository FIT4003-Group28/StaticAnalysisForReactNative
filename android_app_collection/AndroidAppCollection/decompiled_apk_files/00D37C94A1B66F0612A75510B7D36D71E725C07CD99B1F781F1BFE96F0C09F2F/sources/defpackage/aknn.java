package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aknn  reason: default package */
/* loaded from: classes.dex */
public final class aknn extends AnimatorListenerAdapter {
    final /* synthetic */ aknr a;

    public aknn(aknr aknrVar) {
        this.a = aknrVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.am.a(aknp.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
    }
}
