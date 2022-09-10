package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: dahd  reason: default package */
/* loaded from: classes5.dex */
final class dahd extends AnimatorListenerAdapter {
    final /* synthetic */ dahe a;

    public dahd(dahe daheVar) {
        this.a = daheVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        dahe daheVar = this.a;
        daheVar.m.setChecked(daheVar.e);
        this.a.j.start();
    }
}
