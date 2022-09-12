package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjb  reason: default package */
/* loaded from: classes6.dex */
public final class gjb extends AnimatorListenerAdapter {
    final /* synthetic */ MainLayout a;

    public gjb(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.ay = null;
    }
}
