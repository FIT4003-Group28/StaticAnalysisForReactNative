package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: cmnj  reason: default package */
/* loaded from: classes5.dex */
public final class cmnj {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public cmnj() {
        this.a = cmny.f;
    }

    public cmnj(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a(byte[] bArr) {
        b(bArr, bArr.length);
    }

    public final void b(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final int c() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int d() {
        return (this.b * 8) + this.c;
    }

    public final int e() {
        cmmn.c(this.c == 0);
        return this.b;
    }

    public final void f(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        n();
    }

    public final void g() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        n();
    }

    public final void h(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        n();
    }

    public final boolean i() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        g();
        return z;
    }

    public final int j(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        n();
        return i7;
    }

    public final void k() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        n();
    }

    public final void l(int i) {
        cmmn.c(this.c == 0);
        this.b += i;
        n();
    }

    public final String m(int i, Charset charset) {
        byte[] bArr = new byte[i];
        p(bArr, i);
        return new String(bArr, charset);
    }

    public final void n() {
        int i;
        int i2 = this.b;
        boolean z = true;
        if (i2 < 0 || (i2 >= (i = this.d) && (i2 != i || this.c != 0))) {
            z = false;
        }
        cmmn.c(z);
    }

    public final void o(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b = bArr2[i4];
            int i6 = this.c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i2] & (255 >> i7));
        bArr[i2] = b3;
        int i8 = this.c;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.a;
            int i9 = this.b;
            this.b = i9 + 1;
            b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            bArr[i2] = b3;
            i8 -= 8;
        }
        int i10 = i8 + i7;
        this.c = i10;
        byte[] bArr4 = this.a;
        int i11 = this.b;
        bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
        if (i10 == 8) {
            this.c = 0;
            this.b = i11 + 1;
        }
        n();
    }

    public final void p(byte[] bArr, int i) {
        cmmn.c(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i);
        this.b += i;
        n();
    }

    public cmnj(byte[] bArr) {
        this(bArr, bArr.length);
    }
}