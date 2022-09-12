package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* compiled from: PG */
/* renamed from: gjm  reason: default package */
/* loaded from: classes6.dex */
public final class gjm extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ boolean b;

    public gjm(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(0, null);
        if (!this.b) {
            this.a.setVisibility(8);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setLayerType(2, null);
        if (this.b) {
            this.a.setVisibility(0);
        }
    }
}
