package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gja  reason: default package */
/* loaded from: classes6.dex */
public final class gja extends AnimatorListenerAdapter {
    final /* synthetic */ egu a;

    public gja(egu eguVar) {
        this.a = eguVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.an) {
            dcqe dcqeVar = MainLayout.a;
        } else {
            dcqe dcqeVar2 = MainLayout.a;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dcqe dcqeVar = MainLayout.a;
    }
}
