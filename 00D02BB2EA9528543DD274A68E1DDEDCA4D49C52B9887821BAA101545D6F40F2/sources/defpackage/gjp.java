package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjp  reason: default package */
/* loaded from: classes6.dex */
public final class gjp extends AnimatorListenerAdapter {
    final /* synthetic */ MainLayout a;

    public gjp(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.ax = null;
    }
}
