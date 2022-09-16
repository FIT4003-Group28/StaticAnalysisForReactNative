package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bdwi  reason: default package */
/* loaded from: classes3.dex */
final class bdwi extends AnimatorListenerAdapter {
    final /* synthetic */ bdwk a;

    public bdwi(bdwk bdwkVar) {
        this.a = bdwkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setVisibility(4);
    }
}
