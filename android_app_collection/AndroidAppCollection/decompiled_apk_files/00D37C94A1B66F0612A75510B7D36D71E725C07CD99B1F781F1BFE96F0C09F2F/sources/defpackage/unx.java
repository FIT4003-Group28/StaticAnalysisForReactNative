package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unx  reason: default package */
/* loaded from: classes4.dex */
public final class unx extends AnimatorListenerAdapter {
    final /* synthetic */ ExpressSignInLayout a;

    public unx(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.n.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.m.setVisibility(0);
        this.a.l.setVisibility(0);
    }
}
