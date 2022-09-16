package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: dabk  reason: default package */
/* loaded from: classes5.dex */
final class dabk extends AnimatorListenerAdapter {
    final /* synthetic */ dabq a;

    public dabk(dabq dabqVar) {
        this.a = dabqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dabq dabqVar = this.a;
        if (dabqVar.j) {
            dabqVar.b.setFloatValues(0.0f, 1.08f);
        }
    }
}
