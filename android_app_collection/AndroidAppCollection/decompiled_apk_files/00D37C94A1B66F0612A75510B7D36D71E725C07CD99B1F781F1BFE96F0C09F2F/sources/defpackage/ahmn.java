package defpackage;
/* compiled from: PG */
/* renamed from: ahmn  reason: default package */
/* loaded from: classes.dex */
final class ahmn implements Runnable {
    final /* synthetic */ float[] a;
    final /* synthetic */ long b;
    final /* synthetic */ ahmp c;

    public ahmn(ahmp ahmpVar, float[] fArr, long j) {
        this.c = ahmpVar;
        this.a = fArr;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float sqrt;
        float[] fArr;
        ahmp ahmpVar = this.c;
        float[] fArr2 = this.a;
        long j = this.b;
        char c = 1;
        aqxo.p(true);
        int i = 3;
        float[] fArr3 = new float[3];
        char c2 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            fArr3[i2] = -fArr2[(i2 * 4) + 2];
        }
        ahnj ahnjVar = new ahnj(fArr3, j);
        if (ahmpVar.e != null) {
            long j2 = ahmpVar.f + 200;
            while (true) {
                long j3 = ahnjVar.b;
                if (j2 > j3) {
                    break;
                }
                ahnj ahnjVar2 = ahmpVar.e;
                aqxo.p(j2 <= j3 && j2 >= ahnjVar2.b);
                aqxo.p(ahnjVar.b >= ahnjVar2.b);
                long j4 = ahnjVar.b;
                long j5 = ahnjVar2.b;
                long j6 = j4 - j5;
                if (j6 != 0) {
                    float f2 = ((float) (j2 - j5)) / ((float) j6);
                    if (f2 >= 0.0f) {
                        if (f2 <= 1.0f) {
                            float[] fArr4 = ahnjVar2.a;
                            float[] fArr5 = ahnjVar.a;
                            float[] fArr6 = new float[i];
                            float b = ahnj.b(fArr4);
                            float b2 = ahnj.b(fArr5);
                            float a = ahnj.a(fArr4, fArr5) / (b * b2);
                            float acos = (float) Math.acos((a <= 1.0f || a > 1.000001f) ? a : 1.0f);
                            if (acos < 1.0E-6f) {
                                for (int i3 = 0; i3 < i; i3++) {
                                    float f3 = fArr5[i3];
                                    float f4 = fArr4[i3];
                                    fArr6[i3] = ((f3 - f4) * f2) + f4;
                                }
                                fArr = fArr6;
                            } else {
                                float[] fArr7 = fArr5;
                                if (acos > 3.1415916535897956d) {
                                    float[] fArr8 = new float[i];
                                    float f5 = (b + b2) / 2.0f;
                                    if (Math.abs(fArr4[c2]) <= 1.0E-6f) {
                                        float f6 = fArr4[2];
                                        float f7 = fArr4[c];
                                        double d = f5;
                                        double sqrt2 = Math.sqrt((f6 * f6) + f7 + f7);
                                        Double.isNaN(d);
                                        float f8 = (float) (d / sqrt2);
                                        fArr8[c2] = 0.0f;
                                        fArr8[1] = (-fArr4[2]) * f8;
                                        fArr8[2] = fArr4[1] * f8;
                                    } else {
                                        float f9 = fArr4[c2];
                                        float f10 = fArr4[1];
                                        double d2 = f5;
                                        double sqrt3 = Math.sqrt((f9 * f9) + f10 + f10);
                                        Double.isNaN(d2);
                                        float f11 = (float) (d2 / sqrt3);
                                        c2 = 0;
                                        fArr8[0] = (-fArr4[1]) * f11;
                                        fArr8[1] = fArr4[0] * f11;
                                        fArr8[2] = 0.0f;
                                        f2 = f2;
                                    }
                                    if (f2 <= 0.5d) {
                                        f2 += f2;
                                        fArr7 = fArr8;
                                        b2 = b;
                                    } else {
                                        f2 = (f2 + f2) - 1.0f;
                                        fArr4 = fArr8;
                                    }
                                    acos = 1.5707964f;
                                    sqrt = 1.0f;
                                } else {
                                    sqrt = (float) Math.sqrt(1.0f - (f * f));
                                }
                                double d3 = sqrt;
                                fArr = fArr6;
                                double d4 = f2;
                                Double.isNaN(d4);
                                double d5 = 1.0d - d4;
                                double d6 = acos;
                                Double.isNaN(d6);
                                double sin = Math.sin(d5 * d6);
                                Double.isNaN(d3);
                                float f12 = ((float) (sin / d3)) / b;
                                double sin2 = Math.sin(acos * f2);
                                Double.isNaN(d3);
                                float f13 = ((float) (sin2 / d3)) / b2;
                                float f14 = ((1.0f - f2) * b) + (f2 * b2);
                                for (int i4 = 0; i4 < 3; i4++) {
                                    fArr[i4] = ((fArr4[i4] * f12) + (fArr7[i4] * f13)) * f14;
                                }
                            }
                            ahnjVar2 = new ahnj(fArr, j2);
                            byte[] c3 = ahnjVar2.c();
                            long j7 = ahnjVar2.b;
                            ahmpVar.f = j7;
                            ahmpVar.b(c3, j7);
                            j2 += 200;
                            c = 1;
                            i = 3;
                        }
                    }
                    byte[] c32 = ahnjVar2.c();
                    long j72 = ahnjVar2.b;
                    ahmpVar.f = j72;
                    ahmpVar.b(c32, j72);
                    j2 += 200;
                    c = 1;
                    i = 3;
                }
                ahnjVar2 = ahnjVar;
                byte[] c322 = ahnjVar2.c();
                long j722 = ahnjVar2.b;
                ahmpVar.f = j722;
                ahmpVar.b(c322, j722);
                j2 += 200;
                c = 1;
                i = 3;
            }
        } else {
            byte[] c4 = ahnjVar.c();
            long j8 = ahnjVar.b;
            ahmpVar.f = j8;
            ahmpVar.b(c4, j8);
        }
        ahmpVar.e = ahnjVar;
    }
}
