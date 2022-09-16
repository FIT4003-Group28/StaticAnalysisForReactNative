package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: uny  reason: default package */
/* loaded from: classes4.dex */
public final class uny extends AnimatorListenerAdapter {
    final /* synthetic */ ExpressSignInLayout a;

    public uny(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.f.setVisibility(0);
    }
}
