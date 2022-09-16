package defpackage;

import android.animation.Animator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hlx  reason: default package */
/* loaded from: classes3.dex */
public final class hlx implements Animator.AnimatorListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ hmc b;
    private final /* synthetic */ int c;

    public hlx(hmc hmcVar, boolean z) {
        this.b = hmcVar;
        this.a = z;
    }

    public hlx(hmc hmcVar, boolean z, int i) {
        this.c = i;
        this.b = hmcVar;
        this.a = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.c == 0) {
            if (this.a) {
                this.b.au.setVisibility(8);
                this.b.av.setVisibility(8);
                return;
            }
            this.b.aw.setVisibility(8);
            return;
        }
        if (!this.a) {
            this.b.au.setVisibility(8);
            this.b.av.setVisibility(8);
        } else {
            this.b.ax.setVisibility(8);
        }
        this.b.ar.setEnabled(true);
        this.b.at.setEnabled(true);
        this.b.av.setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.c == 0) {
            if (this.a) {
                this.b.aw.setVisibility(0);
                return;
            }
            this.b.au.setVisibility(0);
            this.b.av.setVisibility(0);
            return;
        }
        if (this.a) {
            this.b.au.setVisibility(0);
            this.b.av.setVisibility(0);
        } else {
            this.b.ax.setVisibility(0);
        }
        this.b.ar.setEnabled(false);
        this.b.at.setEnabled(false);
        this.b.av.setEnabled(false);
    }
}
