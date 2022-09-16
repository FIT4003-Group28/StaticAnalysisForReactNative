package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: lvh  reason: default package */
/* loaded from: classes3.dex */
final class lvh extends AnimatorListenerAdapter {
    final /* synthetic */ lvj a;

    public lvh(lvj lvjVar) {
        this.a = lvjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.m();
    }
}
