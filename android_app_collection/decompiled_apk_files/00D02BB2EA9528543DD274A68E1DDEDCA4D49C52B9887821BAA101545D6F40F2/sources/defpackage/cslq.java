package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cslq  reason: default package */
/* loaded from: classes5.dex */
public final class cslq extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ csme b;

    public cslq(csme csmeVar, Runnable runnable) {
        this.b = csmeVar;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        csme csmeVar = this.b;
        csmeVar.o = false;
        if (csmeVar.l()) {
            csme csmeVar2 = this.b;
            ((TextView) csmeVar2.i).setTextColor(csmeVar2.j);
        }
        if (this.b.k()) {
            csme csmeVar3 = this.b;
            csmeVar3.i.setDrawingCacheEnabled(csmeVar3.k);
        }
        this.b.setVisibility(8);
        this.b.m = null;
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.o = true;
    }
}
