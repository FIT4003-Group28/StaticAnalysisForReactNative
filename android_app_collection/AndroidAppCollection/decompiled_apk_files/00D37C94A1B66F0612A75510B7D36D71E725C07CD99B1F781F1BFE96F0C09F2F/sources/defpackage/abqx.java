package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;
/* compiled from: PG */
/* renamed from: abqx  reason: default package */
/* loaded from: classes.dex */
public final class abqx extends AnimatorListenerAdapter {
    final /* synthetic */ VerticalShimmerLoadingFrameLayout a;

    public abqx(VerticalShimmerLoadingFrameLayout verticalShimmerLoadingFrameLayout) {
        this.a = verticalShimmerLoadingFrameLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.d(false);
    }
}
