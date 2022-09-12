package defpackage;
/* compiled from: PG */
/* renamed from: dbdz  reason: default package */
/* loaded from: classes5.dex */
public final class dbdz {
    public static final float[] a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final float[] b = new float[16];

    public dbdz() {
        a(a);
    }

    public static void h(dbdz dbdzVar, dbdz dbdzVar2, dbdz dbdzVar3) {
        dbdz dbdzVar4 = dbdzVar;
        dbjb.d(dbdzVar4, "Parameter \"lhs\" was null.");
        dbjb.d(dbdzVar2, "Parameter \"rhs\" was null.");
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            float f17 = f13;
            if (i < 4) {
                float[] fArr = dbdzVar4.b;
                int i2 = i * 4;
                float f18 = fArr[i2];
                float f19 = fArr[i2 + 1];
                float f20 = fArr[i2 + 2];
                float f21 = fArr[i2 + 3];
                float[] fArr2 = dbdzVar2.b;
                float f22 = fArr2[i];
                float f23 = fArr2[i + 4];
                float f24 = fArr2[i + 8];
                float f25 = fArr2[i + 12];
                f += f18 * f22;
                f2 += f19 * f22;
                f3 += f20 * f22;
                f4 += f22 * f21;
                f5 += f18 * f23;
                f6 += f19 * f23;
                f7 += f20 * f23;
                f8 += f23 * f21;
                f9 += f18 * f24;
                f10 += f19 * f24;
                f11 += f20 * f24;
                f12 += f24 * f21;
                f14 += f19 * f25;
                f15 += f20 * f25;
                f16 += f21 * f25;
                i++;
                dbdzVar4 = dbdzVar;
                f13 = f17 + (f18 * f25);
            } else {
                float[] fArr3 = dbdzVar3.b;
                fArr3[0] = f;
                fArr3[1] = f2;
                fArr3[2] = f3;
                fArr3[3] = f4;
                fArr3[4] = f5;
                fArr3[5] = f6;
                fArr3[6] = f7;
                fArr3[7] = f8;
                fArr3[8] = f9;
                fArr3[9] = f10;
                fArr3[10] = f11;
                fArr3[11] = f12;
                fArr3[12] = f17;
                fArr3[13] = f14;
                fArr3[14] = f15;
                fArr3[15] = f16;
                return;
            }
        }
    }

    public static void j(dbdz dbdzVar, dbdz dbdzVar2) {
        dbjb.d(dbdzVar2, "Parameter \"dest\" was null.");
        float[] fArr = dbdzVar.b;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float[] fArr2 = dbdzVar2.b;
        fArr2[0] = ((((((f6 * f11) * f16) - ((f6 * f12) * f15)) - ((f10 * f7) * f16)) + ((f10 * f8) * f15)) + ((f14 * f7) * f12)) - ((f14 * f8) * f11);
        float f17 = -f5;
        float f18 = f5 * f12;
        float f19 = f9 * f7;
        float f20 = f9 * f8;
        float f21 = f13 * f7;
        float f22 = f13 * f8;
        fArr2[4] = ((((((f17 * f11) * f16) + (f18 * f15)) + (f19 * f16)) - (f20 * f15)) - (f21 * f12)) + (f22 * f11);
        float f23 = f9 * f6;
        float f24 = f13 * f6;
        fArr2[8] = ((((((f5 * f10) * f16) - (f18 * f14)) - (f23 * f16)) + (f20 * f14)) + (f24 * f12)) - (f22 * f10);
        fArr2[12] = ((((((f17 * f10) * f15) + ((f5 * f11) * f14)) + (f23 * f15)) - (f19 * f14)) - (f24 * f11)) + (f21 * f10);
        float f25 = -f2;
        float f26 = f10 * f3;
        float f27 = f10 * f4;
        float f28 = f14 * f3;
        float f29 = f14 * f4;
        fArr2[1] = ((((((f25 * f11) * f16) + ((f2 * f12) * f15)) + (f26 * f16)) - (f27 * f15)) - (f28 * f12)) + (f29 * f11);
        float f30 = f * f11;
        float f31 = f * f12;
        float f32 = f9 * f3;
        float f33 = f9 * f4;
        float f34 = f13 * f3;
        float f35 = f13 * f4;
        fArr2[5] = (((((f30 * f16) - (f31 * f15)) - (f32 * f16)) + (f33 * f15)) + (f34 * f12)) - (f35 * f11);
        float f36 = -f;
        float f37 = f9 * f2;
        float f38 = f13 * f2;
        fArr2[9] = ((((((f36 * f10) * f16) + (f31 * f14)) + (f37 * f16)) - (f33 * f14)) - (f38 * f12)) + (f35 * f10);
        fArr2[13] = ((((((f * f10) * f15) - (f30 * f14)) - (f37 * f15)) + (f32 * f14)) + (f38 * f11)) - (f34 * f10);
        float f39 = f2 * f8;
        float f40 = f6 * f3;
        float f41 = f6 * f4;
        fArr2[2] = ((((((f2 * f7) * f16) - (f39 * f15)) - (f40 * f16)) + (f41 * f15)) + (f28 * f8)) - (f29 * f7);
        float f42 = f * f8;
        float f43 = f5 * f3;
        float f44 = f5 * f4;
        fArr2[6] = ((((((f36 * f7) * f16) + (f42 * f15)) + (f43 * f16)) - (f44 * f15)) - (f34 * f8)) + (f35 * f7);
        float f45 = f * f6;
        float f46 = f5 * f2;
        fArr2[10] = (((((f45 * f16) - (f42 * f14)) - (f16 * f46)) + (f44 * f14)) + (f38 * f8)) - (f35 * f6);
        float f47 = f36 * f6;
        float f48 = f * f7;
        fArr2[14] = (((((f47 * f15) + (f48 * f14)) + (f15 * f46)) - (f14 * f43)) - (f38 * f7)) + (f34 * f6);
        fArr2[3] = ((((((f25 * f7) * f12) + (f39 * f11)) + (f40 * f12)) - (f41 * f11)) - (f26 * f8)) + (f27 * f7);
        fArr2[7] = (((((f48 * f12) - (f42 * f11)) - (f43 * f12)) + (f44 * f11)) + (f32 * f8)) - (f33 * f7);
        fArr2[11] = (((((f47 * f12) + (f42 * f10)) + (f12 * f46)) - (f44 * f10)) - (f8 * f37)) + (f33 * f6);
        fArr2[15] = (((((f45 * f11) - (f48 * f10)) - (f46 * f11)) + (f43 * f10)) + (f37 * f7)) - (f32 * f6);
        float f49 = (f * fArr2[0]) + (f2 * fArr2[4]) + (f3 * fArr2[8]) + (f4 * fArr2[12]);
        if (f49 == 0.0f) {
            return;
        }
        float f50 = 1.0f / f49;
        for (int i = 0; i < 16; i++) {
            float[] fArr3 = dbdzVar2.b;
            fArr3[i] = fArr3[i] * f50;
        }
    }

    public final void a(float[] fArr) {
        for (int i = 0; i < 16; i++) {
            this.b[i] = fArr[i];
        }
    }

    public final void b(dbeb dbebVar) {
        float[] fArr = this.b;
        dbebVar.a = fArr[12];
        dbebVar.b = fArr[13];
        dbebVar.c = fArr[14];
    }

    public final void c(dbeb dbebVar) {
        float[] fArr = this.b;
        dbeb dbebVar2 = new dbeb(fArr[0], fArr[1], fArr[2]);
        dbebVar.a = dbebVar2.d();
        float[] fArr2 = this.b;
        dbebVar2.b(fArr2[4], fArr2[5], fArr2[6]);
        dbebVar.b = dbebVar2.d();
        float[] fArr3 = this.b;
        dbebVar2.b(fArr3[8], fArr3[9], fArr3[10]);
        dbebVar.c = dbebVar2.d();
    }

    public final void d(dbeb dbebVar, dbea dbeaVar) {
        float[] fArr = this.b;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        e(dbebVar, this);
        f(dbeaVar);
        float[] fArr2 = this.b;
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        fArr2[3] = f4;
        fArr2[4] = f5;
        fArr2[5] = f6;
        fArr2[6] = f7;
        fArr2[7] = f8;
        fArr2[8] = f9;
        fArr2[9] = f10;
        fArr2[10] = f11;
        fArr2[11] = f12;
        fArr2[12] = f13;
        fArr2[13] = f14;
        fArr2[14] = f15;
        fArr2[15] = f16;
    }

    public final void e(dbeb dbebVar, dbdz dbdzVar) {
        if (dbebVar.a != 0.0f) {
            for (int i = 0; i < 3; i++) {
                dbdzVar.b[i] = this.b[i] / dbebVar.a;
            }
        }
        dbdzVar.b[3] = 0.0f;
        if (dbebVar.b != 0.0f) {
            for (int i2 = 4; i2 < 7; i2++) {
                dbdzVar.b[i2] = this.b[i2] / dbebVar.b;
            }
        }
        dbdzVar.b[7] = 0.0f;
        if (dbebVar.c != 0.0f) {
            for (int i3 = 8; i3 < 11; i3++) {
                dbdzVar.b[i3] = this.b[i3] / dbebVar.c;
            }
        }
        float[] fArr = dbdzVar.b;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public final void f(dbea dbeaVar) {
        float f;
        float f2;
        float f3;
        float[] fArr = this.b;
        float f4 = fArr[0];
        float f5 = fArr[5];
        float f6 = fArr[10];
        float f7 = f4 + f5 + f6;
        if (f7 > 0.0f) {
            double d = f7;
            Double.isNaN(d);
            float sqrt = (float) Math.sqrt(d + 1.0d);
            float f8 = sqrt + sqrt;
            dbeaVar.d = 0.25f * f8;
            float[] fArr2 = this.b;
            dbeaVar.a = (fArr2[6] - fArr2[9]) / f8;
            dbeaVar.b = (fArr2[8] - fArr2[2]) / f8;
            dbeaVar.c = (fArr2[1] - fArr2[4]) / f8;
        } else {
            if (f4 > f5 && f4 > f6) {
                float sqrt2 = (float) Math.sqrt(((f4 + 1.0f) - f5) - f6);
                f = sqrt2 + sqrt2;
                float[] fArr3 = this.b;
                dbeaVar.d = (fArr3[6] - fArr3[9]) / f;
                dbeaVar.a = 0.25f * f;
                dbeaVar.b = (fArr3[4] + fArr3[1]) / f;
                f2 = fArr3[8];
                f3 = fArr3[2];
            } else if (f5 > f6) {
                float sqrt3 = (float) Math.sqrt(((f5 + 1.0f) - f4) - f6);
                f = sqrt3 + sqrt3;
                float[] fArr4 = this.b;
                dbeaVar.d = (fArr4[8] - fArr4[2]) / f;
                dbeaVar.a = (fArr4[4] + fArr4[1]) / f;
                dbeaVar.b = 0.25f * f;
                f2 = fArr4[9];
                f3 = fArr4[6];
            } else {
                float sqrt4 = (float) Math.sqrt(((f6 + 1.0f) - f4) - f5);
                float f9 = sqrt4 + sqrt4;
                float[] fArr5 = this.b;
                dbeaVar.d = (fArr5[1] - fArr5[4]) / f9;
                dbeaVar.a = (fArr5[8] + fArr5[2]) / f9;
                dbeaVar.b = (fArr5[9] + fArr5[6]) / f9;
                dbeaVar.c = f9 * 0.25f;
            }
            dbeaVar.c = (f2 + f3) / f;
        }
        dbeaVar.f();
    }

    public final void g(dbeb dbebVar) {
        float[] fArr = this.b;
        fArr[12] = dbebVar.a;
        fArr[13] = dbebVar.b;
        fArr[14] = dbebVar.c;
    }

    public final dbeb i(dbeb dbebVar) {
        dbjb.d(dbebVar, "Parameter \"vector\" was null.");
        dbeb dbebVar2 = new dbeb();
        float f = dbebVar.a;
        float f2 = dbebVar.b;
        float f3 = dbebVar.c;
        float[] fArr = this.b;
        dbebVar2.a = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        dbebVar2.b = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        dbebVar2.c = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        return dbebVar2;
    }
}
