package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
/* compiled from: PG */
/* renamed from: unm  reason: default package */
/* loaded from: classes4.dex */
public final class unm extends AnimatorListenerAdapter {
    final /* synthetic */ ExpressSignInLayout a;

    public unm(ExpressSignInLayout expressSignInLayout) {
        this.a = expressSignInLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.f.setVisibility(8);
    }
}
