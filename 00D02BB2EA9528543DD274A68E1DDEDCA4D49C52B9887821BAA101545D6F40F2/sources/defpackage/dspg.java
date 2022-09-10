package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dspg  reason: default package */
/* loaded from: classes.dex */
public final class dspg extends dspj {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private final int i;
    private int j;
    private int k = Integer.MAX_VALUE;

    public dspg(byte[] bArr, int i, int i2) {
        this.e = bArr;
        this.f = i2 + i;
        this.h = i;
        this.i = i;
    }

    private final void Q() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = i - this.i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }

    public final long A() {
        int i = this.h;
        if (this.f - i >= 8) {
            byte[] bArr = this.e;
            this.h = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final int B(int i) {
        if (i >= 0) {
            int E = i + E();
            int i2 = this.k;
            if (E <= i2) {
                this.k = E;
                Q();
                return i2;
            }
            throw dsrm.a();
        }
        throw dsrm.b();
    }

    @Override // defpackage.dspj
    public final void C(int i) {
        this.k = i;
        Q();
    }

    @Override // defpackage.dspj
    public final boolean D() {
        return this.h == this.f;
    }

    @Override // defpackage.dspj
    public final int E() {
        return this.h - this.i;
    }

    public final byte F() {
        int i = this.h;
        if (i != this.f) {
            byte[] bArr = this.e;
            this.h = i + 1;
            return bArr[i];
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final int a() {
        if (D()) {
            this.j = 0;
            return 0;
        }
        int w = w();
        this.j = w;
        if (dsut.b(w) == 0) {
            throw dsrm.d();
        }
        return this.j;
    }

    @Override // defpackage.dspj
    public final void b(int i) {
        if (this.j == i) {
            return;
        }
        throw dsrm.e();
    }

    @Override // defpackage.dspj
    public final double d() {
        return Double.longBitsToDouble(A());
    }

    @Override // defpackage.dspj
    public final float e() {
        return Float.intBitsToFloat(z());
    }

    @Override // defpackage.dspj
    public final long f() {
        return x();
    }

    @Override // defpackage.dspj
    public final long g() {
        return x();
    }

    @Override // defpackage.dspj
    public final int h() {
        return w();
    }

    @Override // defpackage.dspj
    public final long i() {
        return A();
    }

    @Override // defpackage.dspj
    public final int j() {
        return z();
    }

    @Override // defpackage.dspj
    public final boolean k() {
        return x() != 0;
    }

    @Override // defpackage.dspj
    public final String l() {
        int w = w();
        if (w > 0) {
            int i = this.f;
            int i2 = this.h;
            if (w <= i - i2) {
                String str = new String(this.e, i2, w, dsrk.a);
                this.h += w;
                return str;
            }
        }
        if (w == 0) {
            return "";
        }
        if (w < 0) {
            throw dsrm.b();
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final String m() {
        int w = w();
        if (w > 0) {
            int i = this.f;
            int i2 = this.h;
            if (w <= i - i2) {
                String h = dsuo.h(this.e, i2, w);
                this.h += w;
                return h;
            }
        }
        if (w == 0) {
            return "";
        }
        if (w <= 0) {
            throw dsrm.b();
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final void n(dssi dssiVar, dsqa dsqaVar) {
        int w = w();
        if (this.a >= 100) {
            throw dsrm.g();
        }
        int B = B(w);
        this.a++;
        ((dsqp) dssiVar).bA(this, dsqaVar);
        b(0);
        this.a--;
        C(B);
    }

    @Override // defpackage.dspj
    public final <T extends dssj> T o(dssr<T> dssrVar, dsqa dsqaVar) {
        int w = w();
        if (this.a >= 100) {
            throw dsrm.g();
        }
        int B = B(w);
        this.a++;
        T o = dssrVar.o(this, dsqaVar);
        b(0);
        this.a--;
        C(B);
        return o;
    }

    @Override // defpackage.dspj
    public final dspd p() {
        int w = w();
        if (w > 0) {
            int i = this.f;
            int i2 = this.h;
            if (w <= i - i2) {
                dspd w2 = dspd.w(this.e, i2, w);
                this.h += w;
                return w2;
            }
        }
        if (w == 0) {
            return dspd.b;
        }
        return dspd.y(G(w));
    }

    @Override // defpackage.dspj
    public final int q() {
        return w();
    }

    @Override // defpackage.dspj
    public final int r() {
        return w();
    }

    @Override // defpackage.dspj
    public final int s() {
        return z();
    }

    @Override // defpackage.dspj
    public final long t() {
        return A();
    }

    @Override // defpackage.dspj
    public final int u() {
        return L(w());
    }

    @Override // defpackage.dspj
    public final long v() {
        return M(x());
    }

    final long y() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte F = F();
            j |= (F & Byte.MAX_VALUE) << i;
            if ((F & 128) == 0) {
                return j;
            }
        }
        throw dsrm.c();
    }

    public final int z() {
        int i = this.h;
        if (this.f - i >= 4) {
            byte[] bArr = this.e;
            this.h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw dsrm.a();
    }

    public final void H(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw dsrm.b();
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final byte[] G(int i) {
        if (i > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                int i4 = i + i3;
                this.h = i4;
                return Arrays.copyOfRange(this.e, i3, i4);
            }
        }
        if (i <= 0) {
            if (i == 0) {
                return dsrk.b;
            }
            throw dsrm.b();
        }
        throw dsrm.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    @Override // defpackage.dspj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.e
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.h = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.h = r1
            return r0
        L6c:
            long r0 = r5.y()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspg.w():int");
    }

    @Override // defpackage.dspj
    public final boolean c(int i) {
        int a;
        int a2 = dsut.a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (this.f - this.h < 10) {
                while (i2 < 10) {
                    if (F() < 0) {
                        i2++;
                    }
                }
                throw dsrm.c();
            }
            while (i2 < 10) {
                byte[] bArr = this.e;
                int i3 = this.h;
                this.h = i3 + 1;
                if (bArr[i3] < 0) {
                    i2++;
                }
            }
            throw dsrm.c();
            return true;
        } else if (a2 == 1) {
            H(8);
            return true;
        } else if (a2 == 2) {
            H(w());
            return true;
        } else if (a2 != 3) {
            if (a2 == 4) {
                return false;
            }
            if (a2 == 5) {
                H(4);
                return true;
            }
            throw dsrm.f();
        } else {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (c(a));
            b(dsut.c(dsut.b(i), 4));
            return true;
        }
    }

    public final long x() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.h = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.h = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.h = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.h = i5;
                return j2;
            }
        }
        return y();
    }
}
