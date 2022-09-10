package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: giz  reason: default package */
/* loaded from: classes6.dex */
public final class giz extends AnimatorListenerAdapter {
    final /* synthetic */ egu a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ MainLayout c;

    public giz(MainLayout mainLayout, egu eguVar, ViewGroup viewGroup) {
        this.c = mainLayout;
        this.a = eguVar;
        this.b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.an) {
            dcqe dcqeVar = MainLayout.a;
            return;
        }
        this.b.setVisibility(4);
        this.c.setAllowLayoutDuringAnimation(true);
        this.c.am(this.b, null);
        this.c.r(null);
        this.c.setAllowLayoutDuringAnimation(false);
        this.c.aq = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dcqe dcqeVar = MainLayout.a;
    }
}
