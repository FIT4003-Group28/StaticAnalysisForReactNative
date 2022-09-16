package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cu  reason: default package */
/* loaded from: classes3.dex */
public final class cu extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fx d;
    final /* synthetic */ cz e;

    public cu(ViewGroup viewGroup, View view, boolean z, fx fxVar, cz czVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = fxVar;
        this.e = czVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        if (this.c) {
            iy.E(this.d.e, this.b);
        }
        this.e.b();
    }
}
