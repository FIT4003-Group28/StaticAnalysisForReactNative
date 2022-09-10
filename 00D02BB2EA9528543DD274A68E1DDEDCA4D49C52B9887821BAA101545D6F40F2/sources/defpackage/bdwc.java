package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bdwc  reason: default package */
/* loaded from: classes3.dex */
final class bdwc extends AnimatorListenerAdapter {
    final /* synthetic */ bdwe a;

    public bdwc(bdwe bdweVar) {
        this.a = bdweVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.invalidate();
    }
}
