package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
/* compiled from: PG */
/* renamed from: eex  reason: default package */
/* loaded from: classes6.dex */
final class eex implements Animation.AnimationListener {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ ViewGroup b;

    public eex(CharSequence charSequence, ViewGroup viewGroup) {
        this.a = charSequence;
        this.b = viewGroup;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.b.announceForAccessibility(charSequence);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
