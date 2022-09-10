package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bnrk  reason: default package */
/* loaded from: classes.dex */
public final class bnrk {
    public static final /* synthetic */ int k = 0;
    private static final float[] l = {0.0f, 0.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f};
    private static final float[] n = {0.0f, 1.0f, 0.0f};
    @dzsi
    public bntb a;
    public final bnrn b = new bnrn();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public static void b(int[] iArr, int i, int i2, int i3, float f, int i4, bvok bvokVar, bvpa bvpaVar) {
        int i5 = i * 3;
        float f2 = iArr[i5] * f;
        float f3 = iArr[i5 + 1] * f;
        float f4 = iArr[i5 + 2] * f;
        int i6 = i2 * 3;
        float f5 = iArr[i6] * f;
        float f6 = iArr[i6 + 1] * f;
        float f7 = iArr[i6 + 2] * f;
        int i7 = i3 * 3;
        float f8 = iArr[i7] * f;
        float f9 = iArr[i7 + 1] * f;
        float f10 = iArr[i7 + 2] * f;
        float f11 = f8 - f5;
        float f12 = f9 - f6;
        float f13 = f10 - f7;
        float f14 = f2 - f5;
        float f15 = f3 - f6;
        float f16 = f4 - f7;
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f16 * f11);
        float f19 = (f11 * f15) - (f12 * f14);
        float sqrt = (float) Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
        float f20 = f17 / sqrt;
        float f21 = f18 / sqrt;
        float f22 = f19 / sqrt;
        float[] fArr = l;
        float[] fArr2 = m;
        float[] fArr3 = n;
        float min = Math.min(((Math.abs((fArr[0] * f20) + (fArr[1] * f21) + (fArr[2] * f22)) + (Math.abs((fArr2[0] * f20) + (fArr2[1] * f21) + (fArr2[2] * f22)) * 0.8f) + (Math.abs((fArr3[0] * f20) + (fArr3[1] * f21) + (fArr3[2] * f22)) * 0.5f)) * 0.65f) + 0.35f, 1.0f);
        int[] e = bvokVar.e(12);
        int i8 = bvokVar.b;
        int i9 = i8 / 4;
        int i10 = i8 + 1;
        e[i8] = ((char) f2) | (((int) f3) << 16);
        int i11 = i10 + 1;
        e[i10] = (char) f4;
        int i12 = i11 + 1;
        e[i11] = i4;
        int i13 = i12 + 1;
        e[i12] = Float.floatToIntBits(min);
        int i14 = i13 + 1;
        e[i13] = (((int) f6) << 16) | ((char) f5);
        int i15 = i14 + 1;
        e[i14] = (char) f7;
        int i16 = i15 + 1;
        e[i15] = i4;
        int i17 = i16 + 1;
        e[i16] = Float.floatToIntBits(min);
        int i18 = i17 + 1;
        e[i17] = (((int) f9) << 16) | ((char) f8);
        int i19 = i18 + 1;
        e[i18] = (char) f10;
        int i20 = i19 + 1;
        e[i19] = i4;
        e[i20] = Float.floatToIntBits(min);
        bvokVar.b = i20 + 1;
        bvpaVar.a((short) i9);
        bvpaVar.a((short) (i9 + 1));
        bvpaVar.a((short) (i9 + 2));
    }

    public static int c(int i) {
        int i2 = i - 1;
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 == 4) {
                return -1;
            }
            if (i2 == 5) {
                return -2;
            }
            return i2 != 6 ? 0 : -3;
        }
        return 2;
    }

    public final void a(ArrayList<bnsa> arrayList, bnrr bnrrVar) {
        int i;
        bntb bntbVar;
        int i2;
        int i3;
        float f;
        int i4;
        bntb bntbVar2 = this.a;
        dbsk.s(bntbVar2);
        int i5 = bnrrVar.i();
        int j = bnrrVar.j();
        int i6 = bnrrVar.g.get().j;
        float k2 = bnrrVar.k();
        float s = bnrrVar.s();
        int i7 = this.e;
        int i8 = this.f;
        int i9 = this.h;
        int i10 = this.g;
        int i11 = this.i;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            bnrj bnrjVar = (bnrj) arrayList.get(i12);
            if (!bnrjVar.j) {
                bntbVar = bntbVar2;
                i2 = i5;
                i3 = j;
                i = size;
            } else {
                int i13 = bnrjVar.c % 2;
                i = size;
                float f2 = i13 + i13 + (bnrjVar.b % 2);
                bntbVar2.q(f2, f2);
                bnro bnroVar = bnrjVar.h;
                bntbVar = bntbVar2;
                i2 = i5;
                i3 = j;
                GLES20.glUniform4f(i7, ((((bnrjVar.f - i5) + 536870912) & 1073741823) - 536870912) * s, (bnrjVar.g - j) * s, (-i6) * s, bnrjVar.e * s * 2.4414062E-4f);
                float f3 = bnroVar.h;
                float f4 = 1.0f;
                if (bnrjVar.i) {
                    float f5 = (19.0f - k2) / 2.0f;
                    if (f5 < 0.1f) {
                        f5 = 0.1f;
                    }
                    if (f5 <= 1.0f) {
                        f4 = f5;
                    }
                    f = 0.001f;
                } else {
                    f = 0.0f;
                }
                GLES20.glUniform1f(i8, f4);
                GLES20.glUniform1f(i9, f);
                GLES20.glUniform1f(i10, f3);
                if (bnrjVar.i) {
                    i4 = 0;
                    GLES20.glUniform4iv(i11, bnroVar.d, bnroVar.c, 0);
                } else {
                    GLES20.glUniform4iv(i11, bnroVar.b, bnroVar.a, 0);
                    i4 = 0;
                }
                while (i4 < bnrjVar.m.size()) {
                    bntc bntcVar = bnrjVar.m.get(i4);
                    bntc bntcVar2 = bnrjVar.n.get(i4);
                    int intValue = bnrjVar.o.get(i4).intValue();
                    if (bntcVar.f && bntcVar2.f) {
                        GLES20.glBindBuffer(34962, bntcVar.d);
                        GLES20.glVertexAttribPointer(0, 3, 5122, false, 16, 0);
                        GLES20.glVertexAttribPointer(1, 4, 5121, false, 16, 8);
                        GLES20.glVertexAttribPointer(2, 1, 5126, false, 16, 12);
                        GLES20.glBindBuffer(34963, bntcVar2.d);
                        GLES20.glDrawElements(4, intValue, 5123, 0);
                    }
                    i4++;
                }
            }
            i12++;
            size = i;
            bntbVar2 = bntbVar;
            i5 = i2;
            j = i3;
        }
    }
}
