package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acfc  reason: default package */
/* loaded from: classes.dex */
public final class acfc extends AnimatorListenerAdapter {
    final /* synthetic */ acfh a;

    public acfc(acfh acfhVar) {
        this.a = acfhVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.p.setVisibility(4);
        this.a.q.setText("");
        acfh acfhVar = this.a;
        acfhVar.v.removeCallbacks(acfhVar.u);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
