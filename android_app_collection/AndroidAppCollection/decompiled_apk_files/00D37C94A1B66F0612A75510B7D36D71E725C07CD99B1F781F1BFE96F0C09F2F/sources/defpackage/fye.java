package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: fye  reason: default package */
/* loaded from: classes3.dex */
public final class fye extends AnimatorListenerAdapter {
    final /* synthetic */ fyg a;

    public fye(fyg fygVar) {
        this.a = fygVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Optional.ofNullable(this.a.d).ifPresent(fyb.e);
        this.a.d();
    }
}
