package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abom  reason: default package */
/* loaded from: classes.dex */
public final class abom extends AnimatorListenerAdapter {
    final /* synthetic */ abop a;

    public abom(abop abopVar) {
        this.a = abopVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.s().setVisibility(8);
    }
}
