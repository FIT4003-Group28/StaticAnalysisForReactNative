package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: dace  reason: default package */
/* loaded from: classes5.dex */
final class dace extends AnimatorListenerAdapter {
    final /* synthetic */ dach a;

    public dace(dach dachVar) {
        this.a = dachVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        dach dachVar = this.a;
        float f = dachVar.a;
        if (f <= 0.0f || f >= 1.0f) {
            return;
        }
        dachVar.i();
    }
}
