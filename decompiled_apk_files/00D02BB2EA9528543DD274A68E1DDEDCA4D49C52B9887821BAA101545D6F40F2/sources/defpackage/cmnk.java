package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: cmnk  reason: default package */
/* loaded from: classes5.dex */
public final class cmnk {
    public byte[] a;
    public int b;
    public int c;

    public cmnk() {
        this.a = cmny.f;
    }

    public cmnk(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final String A(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String s = cmny.s(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return s;
    }

    public final String B() {
        if (d() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String s = cmny.s(bArr, i2, i - i2);
        this.b = i;
        if (i >= this.c) {
            return s;
        }
        this.b = i + 1;
        return s;
    }

    public final String C() {
        if (d() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !cmny.w(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.b = i2;
            }
        }
        String s = cmny.s(this.a, i2, i - i2);
        this.b = i;
        int i3 = this.c;
        if (i == i3) {
            return s;
        }
        byte[] bArr2 = this.a;
        if (bArr2[i] == 13) {
            i++;
            this.b = i;
            if (i == i3) {
                return s;
            }
        }
        if (bArr2[i] == 10) {
            this.b = i + 1;
        }
        return s;
    }

    public final long D() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.a[this.b];
        int i4 = 7;
        while (true) {
            i = 0;
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i = 7 - i4;
            } else if (i4 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (b & 63);
        }
        this.b += i;
        return j;
    }

    public final void a(int i) {
        c(g() < i ? new byte[i] : this.a, i);
    }

    public final void b(byte[] bArr) {
        c(bArr, bArr.length);
    }

    public final void c(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final int d() {
        return this.c - this.b;
    }

    public final void e(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        cmmn.a(z);
        this.c = i;
    }

    public final void f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        cmmn.a(z);
        this.b = i;
    }

    public final int g() {
        return this.a.length;
    }

    public final void h(int i) {
        f(this.b + i);
    }

    public final void i(cmnj cmnjVar, int i) {
        j(cmnjVar.a, 0, i);
        cmnjVar.f(0);
    }

    public final void j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int k() {
        return this.a[this.b] & 255;
    }

    public final int l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int m() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    public final int n() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    public final int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    public final long p() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 16) | ((b & 255) << 24) | ((b3 & 255) << 8) | (bArr[i4] & 255);
    }

    public final long q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((b2 & 255) << 8) | (b & 255) | ((b3 & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public final int r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int s() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    public final long t() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b7 = bArr[i7];
        this.b = i8 + 1;
        return ((b2 & 255) << 48) | ((b & 255) << 56) | ((b3 & 255) << 40) | ((b4 & 255) << 32) | ((b5 & 255) << 24) | ((b6 & 255) << 16) | ((b7 & 255) << 8) | (bArr[i8] & 255);
    }

    public final int u() {
        return (l() << 21) | (l() << 14) | (l() << 7) | l();
    }

    public final int v() {
        int r = r();
        if (r >= 0) {
            return r;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(r);
        throw new IllegalStateException(sb.toString());
    }

    public final int w() {
        int s = s();
        if (s >= 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(s);
        throw new IllegalStateException(sb.toString());
    }

    public final long x() {
        long t = t();
        if (t >= 0) {
            return t;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(t);
        throw new IllegalStateException(sb.toString());
    }

    public final String y(int i) {
        return z(i, dbrc.c);
    }

    public final String z(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public cmnk(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public cmnk(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
