package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: cvwe  reason: default package */
/* loaded from: classes5.dex */
public final class cvwe extends AnimatorListenerAdapter {
    final /* synthetic */ cvwh a;

    public cvwe(cvwh cvwhVar) {
        this.a = cvwhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.setImageDrawable(null);
    }
}
