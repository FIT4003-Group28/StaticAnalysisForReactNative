package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: aihi  reason: default package */
/* loaded from: classes.dex */
final class aihi extends AnimatorListenerAdapter {
    final /* synthetic */ aihj a;

    public aihi(aihj aihjVar) {
        this.a = aihjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.getAlpha() == 0.0f) {
            zag.o(this.a, false);
            this.a.a.setImageBitmap(null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zag.o(this.a, true);
    }
}
