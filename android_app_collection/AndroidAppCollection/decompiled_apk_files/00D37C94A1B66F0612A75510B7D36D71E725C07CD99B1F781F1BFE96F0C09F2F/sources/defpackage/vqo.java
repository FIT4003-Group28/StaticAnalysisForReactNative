package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vqo  reason: default package */
/* loaded from: classes4.dex */
public final class vqo extends AnimatorListenerAdapter {
    final /* synthetic */ vqp a;
    private final vql b;

    public vqo(vqp vqpVar, vql vqlVar) {
        this.a = vqpVar;
        this.b = vqlVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vqp vqpVar = this.a;
        vqpVar.d = this.b;
        vqpVar.e = null;
        for (vqm vqmVar : vqpVar.f) {
            vqmVar.H();
        }
    }
}
