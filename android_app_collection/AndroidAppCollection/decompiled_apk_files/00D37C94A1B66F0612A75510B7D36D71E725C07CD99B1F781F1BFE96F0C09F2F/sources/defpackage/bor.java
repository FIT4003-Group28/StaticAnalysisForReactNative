package defpackage;

import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: bor  reason: default package */
/* loaded from: classes2.dex */
public final class bor implements TypeEvaluator {
    private hb[] a;

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        hb[] hbVarArr = (hb[]) obj;
        hb[] hbVarArr2 = (hb[]) obj2;
        if (!iy.u(hbVarArr, hbVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!iy.u(this.a, hbVarArr)) {
            this.a = iy.w(hbVarArr);
        }
        for (int i = 0; i < hbVarArr.length; i++) {
            hb hbVar = this.a[i];
            hb hbVar2 = hbVarArr[i];
            hb hbVar3 = hbVarArr2[i];
            hbVar.a = hbVar2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = hbVar2.b;
                if (i2 < fArr.length) {
                    hbVar.b[i2] = (fArr[i2] * (1.0f - f)) + (hbVar3.b[i2] * f);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
