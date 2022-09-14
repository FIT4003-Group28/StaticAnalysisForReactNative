package defpackage;

import android.animation.TypeEvaluator;
/* compiled from: PG */
/* renamed from: baa  reason: default package */
/* loaded from: classes.dex */
final class baa implements TypeEvaluator<kf[]> {
    private kf[] a;

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ kf[] evaluate(float f, kf[] kfVarArr, kf[] kfVarArr2) {
        kf[] kfVarArr3 = kfVarArr;
        kf[] kfVarArr4 = kfVarArr2;
        if (kg.c(kfVarArr3, kfVarArr4)) {
            if (!kg.c(this.a, kfVarArr3)) {
                this.a = kg.b(kfVarArr3);
            }
            for (int i = 0; i < kfVarArr3.length; i++) {
                kf kfVar = this.a[i];
                kf kfVar2 = kfVarArr3[i];
                kf kfVar3 = kfVarArr4[i];
                kfVar.a = kfVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = kfVar2.b;
                    if (i2 < fArr.length) {
                        kfVar.b[i2] = (fArr[i2] * (1.0f - f)) + (kfVar3.b[i2] * f);
                        i2++;
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
