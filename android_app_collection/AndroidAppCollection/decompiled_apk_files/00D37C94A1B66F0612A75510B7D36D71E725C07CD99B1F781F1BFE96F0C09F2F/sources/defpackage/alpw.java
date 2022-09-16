package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: alpw  reason: default package */
/* loaded from: classes.dex */
final class alpw extends AnimatorListenerAdapter {
    final /* synthetic */ alpx a;

    public alpw(alpx alpxVar) {
        this.a = alpxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alpx alpxVar = this.a;
        alpxVar.m.setChecked(alpxVar.e);
        this.a.j.start();
    }
}
