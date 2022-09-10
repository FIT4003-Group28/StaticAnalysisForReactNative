package defpackage;

import android.animation.Animator;
/* compiled from: PG */
/* renamed from: atod  reason: default package */
/* loaded from: classes2.dex */
final class atod implements Animator.AnimatorListener {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ atog c;
    final /* synthetic */ int d;
    private boolean e;

    public atod(atog atogVar, float f, float f2, int i) {
        this.c = atogVar;
        this.a = f;
        this.b = f2;
        this.d = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.e = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.e) {
            this.c.setTranslationX(this.a * this.b);
            atof atofVar = this.c.r;
            if (atofVar != null) {
                int i = this.d;
                if (i == 2) {
                    atofVar.w();
                } else if (i == 3) {
                    atofVar.x();
                }
            }
        }
        this.c.u = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.c.u = animator;
    }
}
