package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: vfe  reason: default package */
/* loaded from: classes4.dex */
public final class vfe extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    public vfe(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
    }
}
