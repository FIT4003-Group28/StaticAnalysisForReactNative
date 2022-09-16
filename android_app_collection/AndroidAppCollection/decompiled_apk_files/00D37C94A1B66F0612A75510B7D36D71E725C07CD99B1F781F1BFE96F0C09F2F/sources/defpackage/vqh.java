package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: vqh  reason: default package */
/* loaded from: classes4.dex */
final class vqh extends AnimatorListenerAdapter {
    final /* synthetic */ vqg a;
    final /* synthetic */ vqi b;

    public vqh(vqi vqiVar, vqg vqgVar) {
        this.b = vqiVar;
        this.a = vqgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.b.remove(this.a);
    }
}
