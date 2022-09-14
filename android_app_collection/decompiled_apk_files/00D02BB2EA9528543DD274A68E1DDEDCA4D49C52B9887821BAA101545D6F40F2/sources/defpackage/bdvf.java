package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: bdvf  reason: default package */
/* loaded from: classes3.dex */
final class bdvf implements TypeEvaluator<Matrix> {
    private final float[] a = new float[9];
    private final float[] b = new float[9];
    private final Matrix c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.a);
        matrix2.getValues(this.b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.b;
            fArr[i] = ((1.0f - f) * this.a[i]) + (fArr[i] * f);
        }
        this.c.setValues(this.b);
        return this.c;
    }
}
