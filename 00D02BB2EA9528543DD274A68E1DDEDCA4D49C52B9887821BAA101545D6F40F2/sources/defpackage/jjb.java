package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: jjb  reason: default package */
/* loaded from: classes7.dex */
final class jjb implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ jjd a;

    public jjb(jjd jjdVar) {
        this.a = jjdVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View j;
        jjf jjfVar = this.a.b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = jjfVar.a;
        if (i == intValue) {
            return;
        }
        jjfVar.a = intValue;
        jjfVar.l(jjfVar.b, jjfVar.k());
        View i2 = jjfVar.i();
        if (i2 != null) {
            if (bvox.a(jjfVar)) {
                i2.offsetLeftAndRight(i - jjfVar.a);
            } else {
                i2.offsetLeftAndRight(jjfVar.a - i2.getRight());
            }
        }
        if (jjfVar.d && (j = jjfVar.j()) != null) {
            float k = (jjfVar.a - jjfVar.b) / (jjfVar.k() - jjfVar.b);
            int e = cqrp.d(5.0d).e(jjfVar.getContext());
            if (bvox.a(jjfVar)) {
                j.offsetLeftAndRight(((int) ((jjfVar.getRight() - jjfVar.a) - ((j.getWidth() - e) * k))) - j.getLeft());
            } else {
                j.offsetLeftAndRight(((int) (jjfVar.a + ((j.getWidth() - e) * k))) - j.getRight());
            }
        }
        jjfVar.m();
    }
}
