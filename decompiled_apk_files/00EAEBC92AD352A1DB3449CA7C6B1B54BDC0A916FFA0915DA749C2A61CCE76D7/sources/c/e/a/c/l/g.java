package c.e.a.c.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f4743a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f4744b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f4745c = new Matrix();

    public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f4743a);
        matrix2.getValues(this.f4744b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f4744b;
            float f3 = fArr[i];
            float[] fArr2 = this.f4743a;
            fArr[i] = fArr2[i] + ((f3 - fArr2[i]) * f2);
        }
        this.f4745c.setValues(this.f4744b);
        return this.f4745c;
    }
}
