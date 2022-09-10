package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjf  reason: default package */
/* loaded from: classes6.dex */
final class gjf extends AnimatorListenerAdapter {
    final /* synthetic */ gjg a;

    public gjf(gjg gjgVar) {
        this.a = gjgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MainLayout mainLayout = this.a.d;
        mainLayout.ad = false;
        mainLayout.ab();
    }
}
