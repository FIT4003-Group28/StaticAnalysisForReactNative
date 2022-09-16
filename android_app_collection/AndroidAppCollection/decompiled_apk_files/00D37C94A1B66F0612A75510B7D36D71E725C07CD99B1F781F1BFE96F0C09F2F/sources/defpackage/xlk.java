package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: xlk  reason: default package */
/* loaded from: classes4.dex */
final class xlk extends AnimatorListenerAdapter {
    private final Handler a = new Handler();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler = this.a;
        animator.getClass();
        handler.post(new xll(animator, 1));
    }
}
