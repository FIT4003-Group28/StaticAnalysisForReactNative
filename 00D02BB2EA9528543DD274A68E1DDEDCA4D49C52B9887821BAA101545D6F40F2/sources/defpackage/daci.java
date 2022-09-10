package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daci  reason: default package */
/* loaded from: classes5.dex */
public final class daci extends AnimatorListenerAdapter {
    final /* synthetic */ dacn a;

    public daci(dacn dacnVar) {
        this.a = dacnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        dacn dacnVar = this.a;
        if (dacnVar.e) {
            dacnVar.e = false;
            dacnVar.f.b();
            this.a.e();
        } else if (dacnVar.m.isVisible()) {
            this.a.i();
            this.a.b();
        } else {
            this.a.e();
        }
    }
}
