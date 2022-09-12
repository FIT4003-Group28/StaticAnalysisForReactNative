package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: amff  reason: default package */
/* loaded from: classes.dex */
public final class amff {
    public final int a;
    public final int b;
    public final int[] c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public amff(Bitmap bitmap) {
        int i;
        int i2;
        this.l = 0;
        this.m = 0;
        dbsk.l(bitmap.getWidth() > 0 && (bitmap.getHeight() + (-2)) % 4 == 0);
        dbsk.l(bitmap.getWidth() > 0 && (bitmap.getHeight() + (-2)) % 4 == 0);
        int width = bitmap.getWidth();
        this.a = width;
        int height = bitmap.getHeight();
        this.b = height;
        int[] iArr = new int[width * height];
        this.c = iArr;
        this.d = width - 2;
        this.e = height - 2;
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        bvok bvokVar = new bvok();
        int i3 = 1;
        int i4 = 0;
        boolean z = false;
        while (true) {
            int i5 = this.a;
            if (i3 >= i5 - 1) {
                break;
            }
            int[] iArr2 = this.c;
            boolean z2 = iArr2[i3] == -16777216;
            int i6 = iArr2[((this.b - 1) * i5) + i3];
            if (z2 != z) {
                bvokVar.a(i4);
                z = z2;
                i4 = 0;
            }
            i4++;
            if (z2) {
                this.i++;
            } else {
                this.h++;
            }
            if (i6 == -16777216) {
                if (this.l == 0) {
                    this.l = i3 - 1;
                }
                this.n++;
            }
            i3++;
        }
        bvokVar.a(i4);
        this.f = bvokVar.c();
        bvokVar.d();
        int i7 = 0;
        boolean z3 = false;
        for (int i8 = 1; i8 < this.b - 1; i8++) {
            int[] iArr3 = this.c;
            boolean z4 = iArr3[i8 * this.a] == -16777216;
            int i9 = iArr3[(i2 + i) - 1];
            if (z4 != z3) {
                bvokVar.a(i7);
                z3 = z4;
                i7 = 0;
            }
            i7++;
            if (z4) {
                this.k++;
            } else {
                this.j++;
            }
            if (i9 == -16777216) {
                if (this.m == 0) {
                    this.m = i8 - 1;
                }
                this.o++;
            }
        }
        bvokVar.a(i7);
        this.g = bvokVar.c();
    }

    public static float[] e(int[] iArr, float f) {
        int length = iArr.length + 1;
        float[] fArr = new float[length + length];
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = i + i;
            int i3 = i2 + 2;
            fArr[i3] = fArr[i2];
            int i4 = i2 + 3;
            fArr[i4] = fArr[i2 + 1];
            float f2 = iArr[i];
            fArr[i3] = fArr[i3] + ((i & 1) == 0 ? f2 : f2 * f);
            fArr[i4] = fArr[i4] + f2;
        }
        return fArr;
    }

    public static float f(float[] fArr, float f) {
        int i = 0;
        if (f <= fArr[0]) {
            return fArr[1];
        }
        int length = fArr.length;
        if (f >= fArr[length - 2]) {
            return fArr[length - 1];
        }
        while (true) {
            int length2 = fArr.length;
            if (i < length2 - 2) {
                float f2 = fArr[i];
                float f3 = fArr[i + 1];
                int i2 = i + 2;
                float f4 = fArr[i2];
                float f5 = fArr[i + 3];
                if (f >= f2 && f <= f4) {
                    return f3 + ((f5 - f3) * ((f - f2) / (f4 - f2)));
                }
                i = i2;
            } else {
                return fArr[length2 - 1];
            }
        }
    }

    private static float g(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        if (i4 >= i) {
            return 1.0f;
        }
        return ((((float) Math.ceil((((((i - i4) + f) / f) * f) + f2) / 4.0f)) * 4.0f) - i3) / i2;
    }

    public final float a(int i) {
        return g(i, this.i, this.h, this.n);
    }

    public final float b(int i) {
        return g(i, this.k, this.j, this.o);
    }

    public final int c(float f) {
        return Math.round(this.h + (this.i * f));
    }

    public final int d(float f) {
        return Math.round(this.j + (this.k * f));
    }
}
