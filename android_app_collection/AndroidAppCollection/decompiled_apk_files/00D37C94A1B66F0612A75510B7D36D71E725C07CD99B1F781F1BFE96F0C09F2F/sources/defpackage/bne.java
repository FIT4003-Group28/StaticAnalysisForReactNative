package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
/* compiled from: PG */
/* renamed from: bne  reason: default package */
/* loaded from: classes2.dex */
public final class bne extends boh {
    public bne() {
    }

    private static float J(bnt bntVar, float f) {
        Float f2;
        return (bntVar == null || (f2 = (Float) bntVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    private final Animator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        bny.c(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, bny.a, f2);
        ofFloat.addListener(new bnd(view));
        x(new bnc(view));
        return ofFloat;
    }

    @Override // defpackage.boh, defpackage.bnk
    public final void c(bnt bntVar) {
        boh.I(bntVar);
        bntVar.a.put("android:fade:transitionAlpha", Float.valueOf(bny.a(bntVar.b)));
    }

    @Override // defpackage.boh
    public final Animator e(View view, bnt bntVar) {
        float f = 0.0f;
        float J2 = J(bntVar, 0.0f);
        if (J2 != 1.0f) {
            f = J2;
        }
        return K(view, f, 1.0f);
    }

    @Override // defpackage.boh
    public final Animator f(View view, bnt bntVar) {
        adj adjVar = bny.b;
        return K(view, J(bntVar, 1.0f), 0.0f);
    }

    public bne(int i) {
        this.p = i;
    }
}
