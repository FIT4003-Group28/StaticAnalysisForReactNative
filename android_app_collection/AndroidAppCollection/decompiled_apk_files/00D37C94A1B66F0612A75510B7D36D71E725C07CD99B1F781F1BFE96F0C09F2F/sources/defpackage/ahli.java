package defpackage;

import android.opengl.Matrix;
/* compiled from: PG */
/* renamed from: ahli  reason: default package */
/* loaded from: classes.dex */
public final class ahli {
    public final ahoo a;
    public float b;
    public float c;
    private final float[] d;
    private final float[] e;
    private final float[][] f;

    public ahli(ahoo ahooVar, float f, float f2) {
        this.a = ahooVar;
        b(f, f2);
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[6];
        for (int i = 0; i < 6; i++) {
            this.f[i] = new float[4];
        }
    }

    public final void b(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final ahlg a(ahjy ahjyVar) {
        float f = 0.0f;
        if (this.b == 0.0f || this.c == 0.0f) {
            return new ahlg(this, new ahlh(new float[]{0.0f, 0.0f}, 2));
        }
        Matrix.multiplyMM(this.e, 0, ahjyVar.a, 0, this.a.a, 0);
        Matrix.invertM(this.d, 0, this.e, 0);
        float[] fArr = this.f[0];
        fArr[2] = -1.0f;
        ahlh ahlhVar = new ahlh(fArr, 4);
        ahlh ahlhVar2 = new ahlh(this.f[1], 4);
        float[] fArr2 = this.d;
        if (ahlhVar.b != 4) {
            throw new RuntimeException("Cannot be multiplied by matrix unless the vector size is 4");
        }
        Matrix.multiplyMV(ahlhVar2.a, 0, fArr2, 0, ahlhVar.a, 0);
        float[] fArr3 = this.f[2];
        float[] fArr4 = this.d;
        fArr3[0] = -fArr4[12];
        fArr3[1] = -fArr4[13];
        fArr3[2] = -fArr4[14];
        ahlh ahlhVar3 = new ahlh(fArr3, 4);
        float a = ahlhVar2.a(ahlhVar);
        if (a != 0.0f) {
            f = ahlhVar3.a(ahlhVar) / a;
        }
        ahlh ahlhVar4 = new ahlh(this.f[3], 4);
        float[] fArr5 = ahlhVar4.a;
        for (int i = 0; i < ahlhVar2.b; i++) {
            fArr5[i] = ahlhVar2.a[i] * f;
        }
        System.arraycopy(this.d, 12, this.f[4], 0, 3);
        ahlh ahlhVar5 = new ahlh(this.f[4], 4);
        ahlh ahlhVar6 = new ahlh(this.f[5], 4);
        for (int i2 = 0; i2 < ahlhVar4.b; i2++) {
            ahlhVar6.a[i2] = ahlhVar4.a[i2] + ahlhVar5.a[i2];
        }
        float[] fArr6 = ahlhVar6.a;
        return new ahlg(this, new ahlh(new float[]{fArr6[0], fArr6[1]}, 2));
    }
}
