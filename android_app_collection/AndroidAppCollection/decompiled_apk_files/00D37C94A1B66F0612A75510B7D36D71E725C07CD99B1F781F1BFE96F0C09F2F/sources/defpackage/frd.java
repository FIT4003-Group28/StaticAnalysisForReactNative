package defpackage;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: frd  reason: default package */
/* loaded from: classes3.dex */
public final class frd extends bnk {
    private static final void e(bnt bntVar) {
        bntVar.a.put("RotateTransition:rotation", Float.valueOf(bntVar.b.getRotation()));
    }

    @Override // defpackage.bnk
    public final Animator a(ViewGroup viewGroup, bnt bntVar, bnt bntVar2) {
        if (bntVar == null || bntVar2 == null) {
            return null;
        }
        View view = bntVar2.b;
        float floatValue = ((Float) bntVar.a.get("RotateTransition:rotation")).floatValue();
        float floatValue2 = ((Float) bntVar2.a.get("RotateTransition:rotation")).floatValue();
        if (floatValue == floatValue2) {
            return null;
        }
        view.setRotation(floatValue);
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(floatValue), Float.valueOf(floatValue2));
        frc frcVar = new frc(view, floatValue, floatValue2);
        ofObject.addUpdateListener(frcVar);
        ofObject.addListener(frcVar);
        return ofObject;
    }

    @Override // defpackage.bnk
    public final void b(bnt bntVar) {
        e(bntVar);
    }

    @Override // defpackage.bnk
    public final void c(bnt bntVar) {
        e(bntVar);
    }
}
