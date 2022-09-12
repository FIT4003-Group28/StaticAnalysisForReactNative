package defpackage;
/* compiled from: PG */
/* renamed from: datl  reason: default package */
/* loaded from: classes5.dex */
public final class datl extends datn {
    static final byte[] a = {13, 10};
    private static final byte[] d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    private final byte[] f;
    private final byte[] g;
    private final byte[] h;
    private final int i;
    private final int j;

    public datl() {
        throw null;
    }

    public datl(byte[] bArr) {
        super(bArr.length);
        this.g = e;
        for (byte b : bArr) {
            if (b == 61 || (b >= 0 && b < 123 && this.g[b] != -1)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + dato.a(bArr) + "]");
            }
        }
        this.j = 4;
        this.h = null;
        this.i = 3;
        this.f = d;
    }

    public static String a(byte[] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            datl datlVar = new datl(a);
            long j = ((length + 2) / 3) * 4;
            if (j <= 2147483647L) {
                datm datmVar = new datm();
                datlVar.d(bArr, length, datmVar);
                datlVar.d(bArr, -1, datmVar);
                int i = datmVar.c - datmVar.d;
                byte[] bArr2 = new byte[i];
                datn.f(bArr2, i, datmVar);
                bArr = bArr2;
            } else {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + j + ") than the specified maximum size of 2147483647");
            }
        }
        return dato.a(bArr);
    }

    public static byte[] b(String str) {
        int length;
        datl datlVar = new datl(a);
        byte[] bytes = str == null ? null : str.getBytes(datk.a);
        if (bytes == null || (length = bytes.length) == 0) {
            return bytes;
        }
        datm datmVar = new datm();
        datlVar.c(bytes, length, datmVar);
        datlVar.c(bytes, -1, datmVar);
        int i = datmVar.c;
        byte[] bArr = new byte[i];
        datn.f(bArr, i, datmVar);
        return bArr;
    }

    @Override // defpackage.datn
    public final void c(byte[] bArr, int i, datm datmVar) {
        byte b;
        if (datmVar.e) {
            return;
        }
        int i2 = 0;
        if (i < 0) {
            datmVar.e = true;
        }
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            byte[] e2 = e(this.i, datmVar);
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 == 61) {
                datmVar.e = true;
                break;
            }
            if (b2 >= 0 && b2 < 123 && (b = e[b2]) >= 0) {
                int i5 = 3 & (datmVar.g + 1);
                datmVar.g = i5;
                int i6 = (datmVar.a << 6) + b;
                datmVar.a = i6;
                if (i5 == 0) {
                    int i7 = datmVar.c;
                    int i8 = i7 + 1;
                    datmVar.c = i8;
                    e2[i7] = (byte) ((i6 >> 16) & 255);
                    int i9 = i8 + 1;
                    datmVar.c = i9;
                    e2[i8] = (byte) ((i6 >> 8) & 255);
                    datmVar.c = i9 + 1;
                    e2[i9] = (byte) (i6 & 255);
                }
            }
            i2++;
            i3 = i4;
        }
        if (!datmVar.e || datmVar.g == 0) {
            return;
        }
        byte[] e3 = e(this.i, datmVar);
        int i10 = datmVar.g;
        if (i10 == 1) {
            return;
        }
        if (i10 == 2) {
            int i11 = datmVar.a >> 4;
            datmVar.a = i11;
            int i12 = datmVar.c;
            datmVar.c = i12 + 1;
            e3[i12] = (byte) (i11 & 255);
        } else if (i10 == 3) {
            int i13 = datmVar.a >> 2;
            datmVar.a = i13;
            int i14 = datmVar.c;
            int i15 = i14 + 1;
            datmVar.c = i15;
            e3[i14] = (byte) ((i13 >> 8) & 255);
            datmVar.c = i15 + 1;
            e3[i15] = (byte) (i13 & 255);
        } else {
            throw new IllegalStateException("Impossible modulus " + datmVar.g);
        }
    }

    @Override // defpackage.datn
    public final void d(byte[] bArr, int i, datm datmVar) {
        if (datmVar.e) {
            return;
        }
        if (i >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                byte[] e2 = e(this.j, datmVar);
                int i4 = (datmVar.g + 1) % 3;
                datmVar.g = i4;
                int i5 = i3 + 1;
                int i6 = bArr[i3];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (datmVar.a << 8) + i6;
                datmVar.a = i7;
                if (i4 == 0) {
                    int i8 = datmVar.c;
                    int i9 = i8 + 1;
                    datmVar.c = i9;
                    byte[] bArr2 = this.f;
                    e2[i8] = bArr2[(i7 >> 18) & 63];
                    int i10 = i9 + 1;
                    datmVar.c = i10;
                    e2[i9] = bArr2[(i7 >> 12) & 63];
                    int i11 = i10 + 1;
                    datmVar.c = i11;
                    e2[i10] = bArr2[(i7 >> 6) & 63];
                    datmVar.c = i11 + 1;
                    e2[i11] = bArr2[i7 & 63];
                    datmVar.f += 4;
                }
                i2++;
                i3 = i5;
            }
            return;
        }
        datmVar.e = true;
        if (datmVar.g == 0) {
            return;
        }
        byte[] e3 = e(this.j, datmVar);
        int i12 = datmVar.c;
        int i13 = datmVar.g;
        if (i13 != 0) {
            if (i13 == 1) {
                int i14 = i12 + 1;
                datmVar.c = i14;
                byte[] bArr3 = this.f;
                int i15 = datmVar.a;
                e3[i12] = bArr3[(i15 >> 2) & 63];
                datmVar.c = i14 + 1;
                e3[i14] = bArr3[(i15 << 4) & 63];
                if (bArr3 == d) {
                    int i16 = datmVar.c;
                    int i17 = i16 + 1;
                    datmVar.c = i17;
                    e3[i16] = 61;
                    datmVar.c = i17 + 1;
                    e3[i17] = 61;
                }
            } else if (i13 == 2) {
                int i18 = i12 + 1;
                datmVar.c = i18;
                byte[] bArr4 = this.f;
                int i19 = datmVar.a;
                e3[i12] = bArr4[(i19 >> 10) & 63];
                int i20 = i18 + 1;
                datmVar.c = i20;
                e3[i18] = bArr4[(i19 >> 4) & 63];
                datmVar.c = i20 + 1;
                e3[i20] = bArr4[(i19 << 2) & 63];
                if (bArr4 == d) {
                    int i21 = datmVar.c;
                    datmVar.c = i21 + 1;
                    e3[i21] = 61;
                }
            } else {
                throw new IllegalStateException("Impossible modulus " + datmVar.g);
            }
        }
        datmVar.f += datmVar.c - i12;
    }
}
