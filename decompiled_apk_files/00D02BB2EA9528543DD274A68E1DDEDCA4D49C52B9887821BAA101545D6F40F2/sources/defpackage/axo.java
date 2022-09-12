package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axo  reason: default package */
/* loaded from: classes3.dex */
public final class axo extends AnimatorListenerAdapter {
    private final View a;
    private boolean b = false;

    public axo(View view) {
        this.a = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        azf.a(this.a, 1.0f);
        if (this.b) {
            this.a.setLayerType(0, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (!od.S(this.a) || this.a.getLayerType() != 0) {
            return;
        }
        this.b = true;
        this.a.setLayerType(2, null);
    }
}
