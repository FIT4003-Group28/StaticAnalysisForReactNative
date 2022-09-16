package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: koq  reason: default package */
/* loaded from: classes3.dex */
final class koq extends AnimatorListenerAdapter {
    final /* synthetic */ kor a;

    public koq(kor korVar) {
        this.a = korVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d.setVisibility(8);
    }
}
