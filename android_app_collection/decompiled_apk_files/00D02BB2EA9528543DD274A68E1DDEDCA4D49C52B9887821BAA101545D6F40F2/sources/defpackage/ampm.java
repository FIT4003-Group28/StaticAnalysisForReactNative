package defpackage;
/* compiled from: PG */
/* renamed from: ampm  reason: default package */
/* loaded from: classes2.dex */
public final class ampm {
    public final int[] a;
    public final int[] b;
    public final float[] c;
    @dzsi
    public int[] d;
    @dzsi
    public int[] e;
    @dzsi
    public float[] f;
    @dzsi
    public float[] g;
    public float h;
    public final int[] i;
    public final alxp[] j;

    public ampm(int[] iArr, int[] iArr2, int[] iArr3, float[] fArr) {
        int[] iArr4;
        int length;
        int i;
        this.a = iArr;
        this.i = iArr2;
        this.j = new alxp[iArr2.length];
        int length2 = iArr3.length;
        if (length2 > 0) {
            int i2 = iArr.length == 0 ? length2 >> 1 : iArr[0];
            bvok bvokVar = new bvok(length2);
            bvok bvokVar2 = new bvok();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                length = iArr3.length;
                i = length - 2;
                if (i3 >= i) {
                    break;
                }
                int i5 = iArr3[i3];
                int i6 = iArr3[i3 + 1];
                bvokVar.a(i5);
                bvokVar.a(i6);
                int i7 = 1;
                if ((i3 / 2) + 1 == i2) {
                    i4++;
                    i2 = i4 < iArr.length ? iArr[i4] : length >> 1;
                } else {
                    int i8 = iArr3[i3 + 2];
                    int i9 = iArr3[i3 + 3];
                    int N = akra.N(i8 - i5);
                    int abs = Math.abs(N) / 153391689;
                    if (abs > 0) {
                        float f = 1.0f / (abs + 1);
                        while (i7 <= abs) {
                            float f2 = i7 * f;
                            bvokVar.a(akra.N(((int) (N * f2)) + i5));
                            bvokVar.a(((int) (f2 * (i9 - i6))) + i6);
                            bvokVar2.a(bvokVar.b / 2);
                            i7++;
                            i2 = i2;
                        }
                    }
                    i2 = i2;
                }
                i3 += 2;
            }
            bvokVar.a(iArr3[i]);
            bvokVar.a(iArr3[length - 1]);
            for (int i10 = 0; i10 < bvokVar2.b; i10++) {
                int b = bvokVar2.b(i10);
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    int i12 = iArr[i11];
                    if (i12 >= b) {
                        iArr[i11] = i12 + 1;
                    }
                }
            }
            iArr4 = bvokVar.c();
        } else {
            iArr4 = iArr3;
        }
        this.b = iArr4;
        this.c = fArr;
    }

    public static float a(float[] fArr) {
        akse akseVar = new akse();
        akse akseVar2 = new akse();
        akse akseVar3 = new akse();
        float f = 0.0f;
        int i = 0;
        while (i < fArr.length - 2) {
            akseVar.b = fArr[i];
            akseVar.c = fArr[i + 1];
            int i2 = i + 2;
            akseVar2.b = fArr[i2];
            akseVar2.c = fArr[i + 3];
            akse.t(akseVar2, akseVar, akseVar3);
            f += akseVar3.c();
            i = i2;
        }
        return f;
    }
}
