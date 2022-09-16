package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: zlj  reason: default package */
/* loaded from: classes4.dex */
final class zlj extends AnimatorListenerAdapter {
    final /* synthetic */ zlk a;

    public zlj(zlk zlkVar) {
        this.a = zlkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.c.setVisibility(4);
    }
}
