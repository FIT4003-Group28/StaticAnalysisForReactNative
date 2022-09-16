package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
/* compiled from: PG */
/* renamed from: ftw  reason: default package */
/* loaded from: classes3.dex */
public final class ftw extends AnimatorListenerAdapter {
    boolean a = false;
    final /* synthetic */ BottomUiContainer b;

    public ftw(BottomUiContainer bottomUiContainer) {
        this.b = bottomUiContainer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        BottomUiContainer bottomUiContainer = this.b;
        bottomUiContainer.e = null;
        bottomUiContainer.f = null;
        if (!this.a) {
            bottomUiContainer.n(null, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BottomUiContainer bottomUiContainer = this.b;
        bottomUiContainer.e = bottomUiContainer.d;
    }
}
