package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cvwf  reason: default package */
/* loaded from: classes5.dex */
public final class cvwf extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ cvwh b;

    public cvwf(cvwh cvwhVar, Drawable drawable) {
        this.b = cvwhVar;
        this.a = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.a.setImageDrawable(this.a);
    }
}
