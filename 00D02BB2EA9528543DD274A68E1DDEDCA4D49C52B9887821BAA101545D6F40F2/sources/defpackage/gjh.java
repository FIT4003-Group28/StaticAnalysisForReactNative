package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjh  reason: default package */
/* loaded from: classes6.dex */
public final class gjh extends AnimatorListenerAdapter {
    final /* synthetic */ MainLayout a;

    public gjh(MainLayout mainLayout) {
        this.a = mainLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.C();
    }
}
