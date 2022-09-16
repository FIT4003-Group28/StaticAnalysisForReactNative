package defpackage;

import android.animation.Animator;
import android.view.View;
/* compiled from: PG */
/* renamed from: hpw  reason: default package */
/* loaded from: classes3.dex */
final class hpw implements Animator.AnimatorListener {
    final /* synthetic */ View a;
    final /* synthetic */ hpx b;
    final /* synthetic */ boolean c;

    public hpw(View view, hpx hpxVar, boolean z) {
        this.a = view;
        this.b = hpxVar;
        this.c = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.c) {
            this.a.setVisibility(8);
        }
        this.b.b();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        this.b.c();
    }
}
