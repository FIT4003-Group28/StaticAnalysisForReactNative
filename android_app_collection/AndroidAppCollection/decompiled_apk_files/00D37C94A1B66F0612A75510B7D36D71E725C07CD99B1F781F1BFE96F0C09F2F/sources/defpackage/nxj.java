package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nxj  reason: default package */
/* loaded from: classes3.dex */
public final class nxj extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public final ValueAnimator a;
    public boolean b;
    final /* synthetic */ nxk c;
    private final float d;
    private final nzw e;

    public nxj(nxk nxkVar, long j, float f, nzw nzwVar) {
        this.c = nxkVar;
        this.d = f;
        this.e = nzwVar;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.a = ofFloat;
        ofFloat.setDuration(j);
        if (nxkVar.b != 128 || nxkVar.c != 2) {
            ofFloat.setInterpolator(f > 0.0f ? new DecelerateInterpolator() : new fqy());
        } else {
            ofFloat.setInterpolator(kt.o(0.05f, 0.0f, 0.0f, 1.0f));
        }
    }

    private final void a() {
        if (this.b) {
            return;
        }
        nzw nzwVar = this.e;
        if (nzwVar != null) {
            nzwVar.a.p(nys.a(this.c.c));
            nzwVar.a.e.a.c(0);
        }
        this.c.e = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.b) {
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.d;
        this.c.d(f + ((1.0f - f) * floatValue));
    }
}
