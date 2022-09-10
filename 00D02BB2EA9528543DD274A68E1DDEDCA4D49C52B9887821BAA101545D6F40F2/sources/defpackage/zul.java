package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zul  reason: default package */
/* loaded from: classes7.dex */
public final class zul extends AnimatorListenerAdapter {
    final /* synthetic */ zut a;

    public zul(zut zutVar) {
        this.a = zutVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zut zutVar = this.a;
        zutVar.d = null;
        zutVar.B(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Animator animator2 = this.a.d;
        if (animator2 != null) {
            animator2.cancel();
        }
        zut zutVar = this.a;
        zutVar.d = animator;
        zutVar.B(2);
    }
}
