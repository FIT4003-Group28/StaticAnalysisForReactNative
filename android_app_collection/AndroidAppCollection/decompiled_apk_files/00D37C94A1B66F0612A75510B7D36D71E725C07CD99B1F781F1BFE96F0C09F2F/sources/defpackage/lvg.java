package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: lvg  reason: default package */
/* loaded from: classes3.dex */
final class lvg extends AnimatorListenerAdapter {
    final /* synthetic */ lvj a;

    public lvg(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.m();
    }
}
