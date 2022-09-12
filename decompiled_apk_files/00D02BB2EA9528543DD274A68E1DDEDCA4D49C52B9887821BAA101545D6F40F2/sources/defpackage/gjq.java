package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: gjq  reason: default package */
/* loaded from: classes6.dex */
public final class gjq extends AnimatorListenerAdapter {
    boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ View c;

    public gjq(boolean z, View view) {
        this.b = z;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a || this.b) {
            return;
        }
        this.c.setVisibility(4);
    }
}
