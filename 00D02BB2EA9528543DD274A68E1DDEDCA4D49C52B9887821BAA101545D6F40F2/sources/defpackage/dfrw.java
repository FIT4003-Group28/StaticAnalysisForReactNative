package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dfrw  reason: default package */
/* loaded from: classes6.dex */
public final class dfrw implements Animator.AnimatorListener {
    final /* synthetic */ dfrx a;

    public dfrw(dfrx dfrxVar) {
        this.a = dfrxVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Runnable h = this.a.e.h();
        if (h != null) {
            h.run();
        }
        if (this.a.e.f()) {
            final dfrx dfrxVar = this.a;
            dfrxVar.a.execute(new Runnable(dfrxVar) { // from class: dfrv
                private final dfrx a;

                {
                    this.a = dfrxVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dfrx dfrxVar2 = this.a;
                    Animator animator2 = dfrxVar2.f;
                    if (animator2 == null || animator2.isRunning()) {
                        return;
                    }
                    dfrxVar2.f.start();
                    dfrxVar2.b.a();
                }
            });
            return;
        }
        dfrx dfrxVar2 = this.a;
        dfrxVar2.c.b = false;
        dfrxVar2.b(dfrxVar2.e.b(), null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        dfrx dfrxVar = this.a;
        dfrxVar.c.b = true;
        dfrxVar.b(dfrxVar.e.b(), this.a.e.e());
    }
}
