package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: eey  reason: default package */
/* loaded from: classes6.dex */
final class eey implements Animation.AnimationListener {
    final /* synthetic */ ViewGroup a;

    public eey(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.removeAllViews();
        this.a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
