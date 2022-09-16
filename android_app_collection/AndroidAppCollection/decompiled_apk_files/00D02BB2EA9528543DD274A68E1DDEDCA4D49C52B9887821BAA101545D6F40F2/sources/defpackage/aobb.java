package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* compiled from: PG */
/* renamed from: aobb  reason: default package */
/* loaded from: classes2.dex */
final class aobb extends AnimatorListenerAdapter {
    final /* synthetic */ aobd a;

    public aobb(aobd aobdVar) {
        this.a = aobdVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.a.c = null;
    }
}
