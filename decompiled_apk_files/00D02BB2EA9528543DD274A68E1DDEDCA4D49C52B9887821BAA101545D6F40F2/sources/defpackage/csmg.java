package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
/* compiled from: PG */
/* renamed from: csmg  reason: default package */
/* loaded from: classes5.dex */
final class csmg extends AnimatorListenerAdapter {
    private final Context a;

    public csmg(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (csla.a(this.a)) {
            animator.cancel();
        }
    }
}
