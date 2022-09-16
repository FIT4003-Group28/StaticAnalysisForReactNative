package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: begw  reason: default package */
/* loaded from: classes3.dex */
public final class begw implements Animator.AnimatorListener {
    final /* synthetic */ begx a;

    public begw(begx begxVar) {
        this.a = begxVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        begx begxVar = this.a;
        ilo iloVar = begxVar.f;
        if (iloVar != null) {
            begxVar.b.e(iloVar);
            this.a.a().setScrollX(0);
            this.a.c.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
