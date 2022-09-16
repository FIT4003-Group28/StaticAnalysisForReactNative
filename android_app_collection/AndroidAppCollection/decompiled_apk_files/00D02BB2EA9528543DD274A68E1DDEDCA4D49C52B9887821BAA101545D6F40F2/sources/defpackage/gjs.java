package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* compiled from: PG */
/* renamed from: gjs  reason: default package */
/* loaded from: classes.dex */
public final class gjs extends AnimatorListenerAdapter {
    final /* synthetic */ egu a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ MainLayout c;

    public gjs(MainLayout mainLayout, egu eguVar, ViewGroup viewGroup) {
        this.c = mainLayout;
        this.a = eguVar;
        this.b = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a.an) {
            return;
        }
        this.c.setAllowLayoutDuringAnimation(true);
        MainLayout.an(this.b, null);
        this.c.setAllowLayoutDuringAnimation(false);
        this.c.ao = false;
    }
}
