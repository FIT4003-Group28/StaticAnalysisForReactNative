package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alls  reason: default package */
/* loaded from: classes.dex */
final class alls extends AnimatorListenerAdapter {
    final /* synthetic */ allw a;

    public alls(allw allwVar) {
        this.a = allwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        allw allwVar = this.a;
        allwVar.g = (allwVar.g + 4) % allwVar.f.c.length;
    }
}
