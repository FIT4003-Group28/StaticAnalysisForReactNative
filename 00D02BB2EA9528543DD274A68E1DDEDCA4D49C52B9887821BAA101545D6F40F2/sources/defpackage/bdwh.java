package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: bdwh  reason: default package */
/* loaded from: classes3.dex */
final class bdwh extends AnimatorListenerAdapter {
    final /* synthetic */ bdwk a;

    public bdwh(bdwk bdwkVar) {
        this.a = bdwkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.invalidate();
    }
}
