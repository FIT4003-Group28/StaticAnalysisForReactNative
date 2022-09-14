package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: cvvp  reason: default package */
/* loaded from: classes5.dex */
final class cvvp extends AnimatorListenerAdapter {
    final /* synthetic */ Drawable a;
    final /* synthetic */ cvvq b;

    public cvvp(cvvq cvvqVar, Drawable drawable) {
        this.b = cvvqVar;
        this.a = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a.setImageDrawable(this.a);
        this.b.b = null;
    }
}
