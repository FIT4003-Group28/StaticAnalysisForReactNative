package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: axp  reason: default package */
/* loaded from: classes3.dex */
public final class axp extends azp {
    public axp() {
    }

    private final Animator K(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        azf.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, azf.b, f2);
        ofFloat.addListener(new axo(view));
        A(new axn(view));
        return ofFloat;
    }

    private static float L(ayx ayxVar, float f) {
        Float f2;
        return (ayxVar == null || (f2 = (Float) ayxVar.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // defpackage.azp, defpackage.ayn
    public final void b(ayx ayxVar) {
        azp.J(ayxVar);
        ayxVar.a.put("android:fade:transitionAlpha", Float.valueOf(azf.b(ayxVar.b)));
    }

    @Override // defpackage.azp
    public final Animator e(ViewGroup viewGroup, View view, ayx ayxVar, ayx ayxVar2) {
        float f = 0.0f;
        float L = L(ayxVar, 0.0f);
        if (L != 1.0f) {
            f = L;
        }
        return K(view, f, 1.0f);
    }

    @Override // defpackage.azp
    public final Animator f(ViewGroup viewGroup, View view, ayx ayxVar) {
        azf.a.d();
        return K(view, L(ayxVar, 1.0f), 0.0f);
    }

    public axp(int i) {
        this.p = i;
    }
}
