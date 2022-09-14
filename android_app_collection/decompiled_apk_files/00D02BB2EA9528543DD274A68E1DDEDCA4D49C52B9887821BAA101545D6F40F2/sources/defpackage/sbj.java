package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: sbj  reason: default package */
/* loaded from: classes7.dex */
final class sbj extends AnimatorListenerAdapter {
    final /* synthetic */ sbl a;

    public sbj(sbl sblVar) {
        this.a = sblVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView t = this.a.t();
        if (t != null) {
            t.setTextColor(this.a.c);
            this.a.n(false);
        }
    }
}
