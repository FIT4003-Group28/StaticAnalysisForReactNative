package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: tph  reason: default package */
/* loaded from: classes4.dex */
public final class tph extends AnimatorListenerAdapter {
    final /* synthetic */ tpj a;

    public tph(tpj tpjVar) {
        this.a = tpjVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!this.a.a.isStarted()) {
            this.a.a.start();
        }
    }
}
