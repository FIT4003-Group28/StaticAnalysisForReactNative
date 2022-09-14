package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcah  reason: default package */
/* loaded from: classes3.dex */
public final class bcah {
    private final View a;
    @dzsi
    private Animator b = null;

    public bcah(View view) {
        this.a = view;
    }

    public final void a(bcad<bcag> bcadVar) {
        bcag bcagVar = new bcag(this.a);
        bcadVar.a(bcagVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setTarget(bcagVar.a);
        animatorSet.playTogether((Animator[]) dcbg.b(bcagVar.b).s(bcae.a).E(Animator.class));
        Animator.AnimatorListener animatorListener = bcagVar.c;
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        Animator animator = this.b;
        if (animator != null && animator.isRunning()) {
            this.b.cancel();
        }
        this.b = animatorSet;
        animatorSet.start();
    }
}
