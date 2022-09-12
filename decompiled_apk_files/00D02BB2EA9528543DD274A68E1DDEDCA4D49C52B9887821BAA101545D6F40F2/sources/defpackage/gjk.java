package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjk  reason: default package */
/* loaded from: classes6.dex */
public final class gjk extends AnimatorListenerAdapter {
    final /* synthetic */ MainLayout a;

    public gjk(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.F();
        this.a.w();
        this.a.x();
    }
}
