package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bdwd  reason: default package */
/* loaded from: classes3.dex */
final class bdwd extends AnimatorListenerAdapter {
    final /* synthetic */ bdwe a;

    public bdwd(bdwe bdweVar) {
        this.a = bdweVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(4);
    }
}
