package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: dgh  reason: default package */
/* loaded from: classes6.dex */
final class dgh extends AnimatorListenerAdapter {
    final /* synthetic */ TextView a;

    public dgh(TextView textView) {
        this.a = textView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(4);
    }
}
