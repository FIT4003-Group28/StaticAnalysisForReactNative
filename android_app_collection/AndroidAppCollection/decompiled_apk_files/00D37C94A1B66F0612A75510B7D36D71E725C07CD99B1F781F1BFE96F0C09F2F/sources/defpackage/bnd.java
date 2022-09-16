package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnd  reason: default package */
/* loaded from: classes2.dex */
public final class bnd extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    public bnd(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bny.c(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!lj.ah(this.a) || this.a.getLayerType() != 0) {
            return;
        }
        this.b = true;
        this.a.setLayerType(2, null);
    }
}
