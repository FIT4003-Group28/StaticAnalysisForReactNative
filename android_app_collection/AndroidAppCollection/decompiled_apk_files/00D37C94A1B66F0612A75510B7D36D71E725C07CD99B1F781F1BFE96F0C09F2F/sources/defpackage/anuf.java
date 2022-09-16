package defpackage;
/* compiled from: PG */
/* renamed from: anuf  reason: default package */
/* loaded from: classes.dex */
public final class anuf {
    public final byte[] a;

    public anuf(int i, ahpb ahpbVar) {
        int i2;
        double d;
        double d2;
        double d3;
        double d4;
        ahpb ahpbVar2 = ahpbVar;
        this.a = new byte[i + i];
        double d5 = i - 1;
        int i3 = 0;
        double d6 = 0.0d;
        int i4 = 0;
        while (true) {
            i2 = i >> 2;
            d = 65279.0d;
            if (i3 >= i2) {
                break;
            }
            d6 = ahpbVar2.a(i3, d5) * 65279.0d;
            byte[] bArr = this.a;
            int i5 = i4 + 1;
            bArr[i4] = (byte) (d6 / 256.0d);
            i4 = i5 + 1;
            bArr[i5] = (byte) (d6 % 256.0d);
            i3++;
        }
        int i6 = i2 + 3;
        while (i6 < i) {
            double a = ((ahpbVar2.a(i6, d5) * d) - d6) / 4.0d;
            byte[] bArr2 = this.a;
            int i7 = i4 + 1;
            bArr2[i4] = (byte) (d2 / 256.0d);
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (d2 % 256.0d);
            int i9 = i8 + 1;
            double d7 = d5;
            bArr2[i8] = (byte) (d3 / 256.0d);
            int i10 = i9 + 1;
            bArr2[i9] = (byte) (d3 % 256.0d);
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (d4 / 256.0d);
            int i12 = i11 + 1;
            bArr2[i11] = (byte) (d4 % 256.0d);
            d6 = d6 + a + a + a + a;
            int i13 = i12 + 1;
            bArr2[i12] = (byte) (d6 / 256.0d);
            i4 = i13 + 1;
            bArr2[i13] = (byte) (d6 % 256.0d);
            i6 += 4;
            ahpbVar2 = ahpbVar;
            d5 = d7;
            d = 65279.0d;
        }
        double d8 = d5;
        for (int i14 = i6 - 3; i14 < i; i14++) {
            double a2 = ahpbVar.a(i14, d8) * 65279.0d;
            byte[] bArr3 = this.a;
            int i15 = i4 + 1;
            bArr3[i4] = (byte) (a2 / 256.0d);
            i4 = i15 + 1;
            bArr3[i15] = (byte) (a2 % 256.0d);
        }
    }

    public anuf(byte[] bArr) {
        this.a = bArr;
    }

    public static anuf a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new anuf(bArr, bArr.length);
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private anuf(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }
}
