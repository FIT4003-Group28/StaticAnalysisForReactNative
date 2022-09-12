package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aksc  reason: default package */
/* loaded from: classes.dex */
public final class aksc {
    public final int[] a;
    public final float[] b;
    public final float[] c;
    public final int[] d;
    public final int e;
    private static final int[] g = {0, 2, 1, 0, 3, 2};
    public static final float[] f = new float[0];

    public aksc(int[] iArr, float[] fArr, float[] fArr2, int[] iArr2, int i) {
        this.a = iArr;
        this.b = fArr;
        this.c = fArr2;
        this.d = iArr2;
        this.e = i;
    }

    public final akra c(int i) {
        int i2 = i + i;
        int[] iArr = this.a;
        return new akra(iArr[i2], iArr[i2 + 1], 0);
    }

    public final void d(int i, akra akraVar, akra akraVar2, akra akraVar3) {
        int[] e = e(i);
        int[] iArr = this.a;
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        int i2 = e[0];
        int i3 = i2 + 1;
        e[0] = i3;
        akraVar.a = iArr[i2];
        e[0] = i3 + 1;
        akraVar.b = iArr[i3];
        akraVar.c = 0;
        int i4 = e[1];
        int i5 = i4 + 1;
        e[1] = i5;
        akraVar2.a = iArr[i4];
        e[1] = i5 + 1;
        akraVar2.b = iArr[i5];
        akraVar2.c = 0;
        int i6 = e[2];
        int i7 = i6 + 1;
        e[2] = i7;
        akraVar3.a = iArr[i6];
        e[2] = i7 + 1;
        akraVar3.b = iArr[i7];
        akraVar3.c = 0;
    }

    public final int[] e(int i) {
        int[] iArr = {0, 0, 0};
        int[] iArr2 = this.d;
        if (iArr2 == null || iArr2.length <= 0) {
            int i2 = i * 6;
            iArr[0] = i2;
            int i3 = i2 + 2;
            iArr[1] = i3;
            iArr[2] = i3 + 2;
        } else {
            int i4 = i * 3;
            int i5 = iArr2[i4];
            iArr[0] = i5 + i5;
            int i6 = iArr2[i4 + 1];
            iArr[1] = i6 + i6;
            int i7 = iArr2[i4 + 2];
            iArr[2] = i7 + i7;
        }
        return iArr;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof aksc) {
            aksc akscVar = (aksc) obj;
            if (Arrays.equals(this.a, akscVar.a) && Arrays.equals(this.d, akscVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + Arrays.hashCode(this.d);
    }

    public final int b() {
        int i;
        int length;
        int[] iArr = this.d;
        if (iArr == null || (length = iArr.length) <= 0) {
            int length2 = this.a.length;
            i = length2 > 0 ? length2 / 6 : 0;
        } else {
            i = length / 3;
        }
        return i == 0 ? this.b.length / 6 : i;
    }

    public static int[] a(int i, int i2) {
        int i3 = 0;
        if (i2 < 3) {
            return new int[0];
        }
        if (i2 == 4) {
            if (i == 0) {
                return g;
            }
            i2 = 4;
        }
        int i4 = i2 - 2;
        int[] iArr = new int[i4 * 3];
        int i5 = 0;
        while (i3 < i4) {
            int i6 = i5 + 1;
            iArr[i5] = i;
            int i7 = i6 + 1;
            int i8 = i + i3;
            iArr[i6] = (i8 + 2) % i2;
            iArr[i7] = (i8 + 1) % i2;
            i3++;
            i5 = i7 + 1;
        }
        return iArr;
    }
}
