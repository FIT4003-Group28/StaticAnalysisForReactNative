package a.r;

import android.animation.TypeEvaluator;
/* loaded from: classes.dex */
class g implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    private float[] f624a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(float[] fArr) {
        this.f624a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    /* renamed from: a */
    public float[] evaluate(float f2, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f624a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f3 = fArr[i];
            fArr3[i] = f3 + ((fArr2[i] - f3) * f2);
        }
        return fArr3;
    }
}
