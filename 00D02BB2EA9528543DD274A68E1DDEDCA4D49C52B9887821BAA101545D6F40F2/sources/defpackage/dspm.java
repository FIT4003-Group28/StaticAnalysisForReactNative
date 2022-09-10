package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dspm  reason: default package */
/* loaded from: classes.dex */
public final class dspm extends dspp {
    private final byte[] a;
    private final int b;
    private int c;

    public dspm(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            int length = bArr.length;
            int i3 = i + i2;
            if ((i | i2 | (length - i3)) >= 0) {
                this.a = bArr;
                this.c = i;
                this.b = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        throw new NullPointerException("buffer");
    }

    @Override // defpackage.dspp, defpackage.dsor
    public final void a(byte[] bArr, int i, int i2) {
        w(bArr, i, i2);
    }

    @Override // defpackage.dspp
    public final void aB(int i, int i2) {
        s(dsut.c(i, i2));
    }

    @Override // defpackage.dspp
    public final void aC(int i, int i2) {
        aB(i, 0);
        r(i2);
    }

    @Override // defpackage.dspp
    public final void aD(int i, int i2) {
        aB(i, 0);
        s(i2);
    }

    @Override // defpackage.dspp
    public final void aE(int i, int i2) {
        aB(i, 5);
        t(i2);
    }

    @Override // defpackage.dspp
    public final void aF(int i, long j) {
        aB(i, 0);
        u(j);
    }

    @Override // defpackage.dspp
    public final void aG(int i, long j) {
        aB(i, 1);
        v(j);
    }

    @Override // defpackage.dspp
    public final int b() {
        return this.b - this.c;
    }

    @Override // defpackage.dspp
    public final void i(int i, boolean z) {
        aB(i, 0);
        q(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.dspp
    public final void j(int i, String str) {
        aB(i, 2);
        x(str);
    }

    @Override // defpackage.dspp
    public final void k(int i, dspd dspdVar) {
        aB(i, 2);
        l(dspdVar);
    }

    @Override // defpackage.dspp
    public final void l(dspd dspdVar) {
        s(dspdVar.c());
        dspdVar.m(this);
    }

    @Override // defpackage.dspp
    public final void m(int i, dssj dssjVar, dstc dstcVar) {
        aB(i, 2);
        dsoe dsoeVar = (dsoe) dssjVar;
        int bV = dsoeVar.bV();
        if (bV == -1) {
            bV = dstcVar.e(dsoeVar);
            dsoeVar.bW(bV);
        }
        s(bV);
        dstcVar.n(dssjVar, this.f);
    }

    @Override // defpackage.dspp
    public final void n(int i, dssj dssjVar) {
        aB(1, 3);
        aD(2, i);
        aB(3, 2);
        p(dssjVar);
        aB(1, 4);
    }

    @Override // defpackage.dspp
    public final void o(int i, dspd dspdVar) {
        aB(1, 3);
        aD(2, i);
        k(3, dspdVar);
        aB(1, 4);
    }

    @Override // defpackage.dspp
    public final void p(dssj dssjVar) {
        s(dssjVar.cb());
        dssjVar.Pv(this);
    }

    @Override // defpackage.dspp
    public final void r(int i) {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    @Override // defpackage.dspp
    public final void s(int i) {
        if (!dspp.e || dsoi.a() || b() < 5) {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
                }
            }
            byte[] bArr2 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) i;
        } else if ((i & (-128)) == 0) {
            byte[] bArr3 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            dsui.o(bArr3, i4, (byte) i);
        } else {
            byte[] bArr4 = this.a;
            int i5 = this.c;
            this.c = i5 + 1;
            dsui.o(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.a;
                int i7 = this.c;
                this.c = i7 + 1;
                dsui.o(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.a;
            int i8 = this.c;
            this.c = i8 + 1;
            dsui.o(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.a;
                int i10 = this.c;
                this.c = i10 + 1;
                dsui.o(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.a;
            int i11 = this.c;
            this.c = i11 + 1;
            dsui.o(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.a;
                int i13 = this.c;
                this.c = i13 + 1;
                dsui.o(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.a;
            int i14 = this.c;
            this.c = i14 + 1;
            dsui.o(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.a;
            int i15 = this.c;
            this.c = i15 + 1;
            dsui.o(bArr11, i15, (byte) (i12 >>> 7));
        }
    }

    @Override // defpackage.dspp
    public final void t(int i) {
        try {
            byte[] bArr = this.a;
            int i2 = this.c;
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.c = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.dspp
    public final void v(long j) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            this.c = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            this.c = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            this.c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.c = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    @Override // defpackage.dspp
    public final void y() {
    }

    @Override // defpackage.dspp
    public final void z(byte[] bArr, int i) {
        s(i);
        w(bArr, 0, i);
    }

    @Override // defpackage.dspp
    public final void q(byte b) {
        try {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
        }
    }

    public final void w(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.a, this.c, i2);
            this.c += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(i2)), e);
        }
    }

    @Override // defpackage.dspp
    public final void x(String str) {
        int i = this.c;
        try {
            int aa = aa(str.length() * 3);
            int aa2 = aa(str.length());
            if (aa2 != aa) {
                s(dsuo.f(str));
                this.c = dsuo.g(str, this.a, this.c, b());
                return;
            }
            int i2 = i + aa2;
            this.c = i2;
            int g = dsuo.g(str, this.a, i2, b());
            this.c = i;
            s((g - i) - aa2);
            this.c = g;
        } catch (dsum e) {
            this.c = i;
            ao(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new dspn(e2);
        }
    }

    @Override // defpackage.dspp
    public final void u(long j) {
        if (!dspp.e || b() < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new dspn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.c), Integer.valueOf(this.b), 1), e);
                }
            }
            byte[] bArr2 = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr3 = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            dsui.o(bArr3, i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        dsui.o(bArr4, i4, (byte) j);
    }
}
