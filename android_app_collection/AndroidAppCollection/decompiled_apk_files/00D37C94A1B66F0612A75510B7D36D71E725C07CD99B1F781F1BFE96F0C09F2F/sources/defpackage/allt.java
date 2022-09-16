package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: allt  reason: default package */
/* loaded from: classes.dex */
final class allt extends AnimatorListenerAdapter {
    final /* synthetic */ allw a;

    public allt(allw allwVar) {
        this.a = allwVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.a();
        bol bolVar = this.a.j;
        if (bolVar != null) {
            bolVar.a();
        }
    }
}
