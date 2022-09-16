package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: lug  reason: default package */
/* loaded from: classes3.dex */
final class lug extends AnimatorListenerAdapter {
    final /* synthetic */ ImageView a;

    public lug(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.setVisibility(8);
    }
}
