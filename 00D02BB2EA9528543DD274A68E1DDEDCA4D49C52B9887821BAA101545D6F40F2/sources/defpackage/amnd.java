package defpackage;
/* compiled from: PG */
/* renamed from: amnd  reason: default package */
/* loaded from: classes.dex */
public final class amnd extends amoa {
    public static final int a = amnh.d;
    private final byte[] h;
    private final byte[] i;

    public amnd(float f, int i, boolean z) {
        super(f, i, z);
        this.h = new byte[64];
        this.i = new byte[64];
        for (int i2 = 0; i2 < 64; i2++) {
            this.h[i2] = -1;
        }
    }

    public final byte[] a() {
        byte[] bArr = new byte[a * 256];
        for (int i = 0; i < this.c.size() && i < 8; i++) {
            for (int i2 = 0; i2 < 22; i2++) {
                alxo c = this.c.get(i).c(i2);
                for (int i3 = 0; i3 < h(c) && i3 < 4; i3++) {
                    alxl g = g(c, i3);
                    int i4 = g.a;
                    int i5 = g.b;
                    int i6 = (i * 4) + i3;
                    int i7 = i6 + i6;
                    int i8 = a;
                    int i9 = ((i7 * i8) + i2) * 4;
                    int i10 = (((i7 + 1) * i8) + i2) * 4;
                    int i11 = i9 + 1;
                    bArr[i9] = (byte) ((i4 >> 16) & 255);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) ((i4 >> 8) & 255);
                    bArr[i12] = (byte) (i4 & 255);
                    bArr[i12 + 1] = (byte) ((i4 >> 24) & 255);
                    int i13 = i10 + 1;
                    bArr[i10] = (byte) ((i5 >> 16) & 255);
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) ((i5 >> 8) & 255);
                    bArr[i14] = (byte) (i5 & 255);
                    bArr[i14 + 1] = (byte) ((i5 >> 24) & 255);
                }
            }
        }
        return bArr;
    }

    public final byte[] b(int i) {
        byte[] bArr;
        byte[] bArr2 = new byte[2048];
        for (int i2 = 0; i2 < this.c.size() && i2 < 8; i2++) {
            alxo c = this.c.get(i2).c(i);
            for (int i3 = 0; i3 < h(c) && i3 < 4; i3++) {
                alxl g = g(c, i3);
                int[] iArr = g.d;
                if (iArr == null || iArr.length == 0) {
                    bArr = this.h;
                } else {
                    bArr = new byte[64];
                    int i4 = g.e;
                    int i5 = g.f;
                    while (i4 / i5 > 64) {
                        i5 += i5;
                    }
                    int i6 = 0;
                    for (int i7 = 0; i7 < iArr.length; i7++) {
                        byte[] bArr3 = (i7 & 1) == 0 ? this.h : this.i;
                        int i8 = iArr[i7] / i5;
                        System.arraycopy(bArr3, 0, bArr, i6, i8);
                        i6 += i8;
                    }
                    if (i6 != 64) {
                        bArr[i6] = bArr[0];
                        bArr[63] = bArr[i6 - 1];
                    }
                }
                System.arraycopy(bArr, 0, bArr2, ((i2 * 4) + i3) * 64, 64);
            }
        }
        return bArr2;
    }
}
