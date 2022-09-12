package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjd  reason: default package */
/* loaded from: classes.dex */
public final class gjd extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ MainLayout b;

    public gjd(MainLayout mainLayout, ViewGroup viewGroup) {
        this.b = mainLayout;
        this.a = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setLayerType(0, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.B.b.setVisibility(0);
    }
}
