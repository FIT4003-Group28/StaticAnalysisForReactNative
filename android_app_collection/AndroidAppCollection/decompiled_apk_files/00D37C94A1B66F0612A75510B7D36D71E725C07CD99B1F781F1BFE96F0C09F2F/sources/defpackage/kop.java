package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: kop  reason: default package */
/* loaded from: classes3.dex */
final class kop extends AnimatorListenerAdapter {
    final /* synthetic */ kor a;

    public kop(kor korVar) {
        this.a = korVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(8);
    }
}
