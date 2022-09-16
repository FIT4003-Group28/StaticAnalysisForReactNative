package defpackage;

import android.animation.Animator;
import android.graphics.ColorFilter;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: abpg  reason: default package */
/* loaded from: classes.dex */
final class abpg implements Animator.AnimatorListener {
    final /* synthetic */ ImageView a;

    public abpg(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setColorFilter((ColorFilter) null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
