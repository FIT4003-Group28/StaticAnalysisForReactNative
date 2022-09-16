package defpackage;
/* compiled from: PG */
/* renamed from: ahnj  reason: default package */
/* loaded from: classes.dex */
public final class ahnj {
    public final float[] a;
    public final long b;

    public ahnj(float[] fArr, long j) {
        aqxo.p(true);
        this.a = fArr;
        float b = b(fArr);
        for (int i = 0; i < 3; i++) {
            fArr[i] = fArr[i] / b;
        }
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(float[] fArr, float[] fArr2) {
        aqxo.p(true);
        float f = 0.0f;
        for (int i = 0; i < 3; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float b(float[] fArr) {
        return (float) Math.sqrt(a(fArr, fArr));
    }

    public final byte[] c() {
        byte[] bArr = new byte[2];
        float[] fArr = new float[2];
        float[] fArr2 = this.a;
        aqxo.p(true);
        aqxo.p(true);
        float abs = Math.abs(fArr2[0]) + Math.abs(fArr2[1]) + Math.abs(fArr2[2]);
        float f = (-fArr2[2]) / abs;
        float[] fArr3 = {fArr2[0] / abs, (-fArr2[1]) / abs, f};
        double d = f;
        float f2 = 0.0f;
        if (d < 0.0d) {
            float[] fArr4 = new float[2];
            float f3 = 1.0f;
            float abs2 = 1.0f - Math.abs(fArr3[1]);
            float f4 = fArr3[0];
            fArr4[0] = abs2 * (f4 > 0.0f ? 1.0f : -1.0f);
            float abs3 = 1.0f - Math.abs(f4);
            if (fArr3[1] <= 0.0f) {
                f3 = -1.0f;
            }
            fArr4[1] = abs3 * f3;
            fArr3[0] = fArr4[0];
            fArr3[1] = fArr4[1];
        }
        fArr[0] = (fArr3[0] * 0.5f) + 0.5f;
        fArr[1] = (fArr3[1] * 0.5f) + 0.5f;
        if (Float.isNaN(fArr[0]) || Float.isNaN(fArr[1])) {
            zep.l("One or both of the oct16 vectors components is NaN. Setting to zero.");
            fArr[0] = Float.isNaN(fArr[0]) ? 0.0f : fArr[0];
            if (!Float.isNaN(fArr[1])) {
                f2 = fArr[1];
            }
            fArr[1] = f2;
        }
        int i = (int) (fArr[0] * 256.0f);
        int i2 = (int) (fArr[1] * 256.0f);
        byte b = (byte) i;
        byte b2 = (byte) i2;
        if (i >= 256) {
            b = -1;
        }
        if (i2 >= 256) {
            b2 = -1;
        }
        bArr[0] = b;
        bArr[1] = b2;
        return bArr;
    }
}
