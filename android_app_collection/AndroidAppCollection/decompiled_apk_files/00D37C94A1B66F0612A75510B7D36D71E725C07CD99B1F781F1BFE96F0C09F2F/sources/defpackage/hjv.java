package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
/* compiled from: PG */
/* renamed from: hjv  reason: default package */
/* loaded from: classes3.dex */
public final class hjv extends AnimatorListenerAdapter {
    final /* synthetic */ vvk a;
    final /* synthetic */ ShortsVideoTrimView2 b;

    public hjv(ShortsVideoTrimView2 shortsVideoTrimView2, vvk vvkVar) {
        this.b = shortsVideoTrimView2;
        this.a = vvkVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.l(this.a);
    }
}
