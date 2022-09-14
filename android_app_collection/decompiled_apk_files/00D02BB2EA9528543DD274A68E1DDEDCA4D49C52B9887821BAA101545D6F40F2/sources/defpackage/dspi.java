package defpackage;

import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dspi  reason: default package */
/* loaded from: classes.dex */
public final class dspi extends dspj {
    private final ByteBuffer e;
    private final long f;
    private long g;
    private long h;
    private final long i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public dspi(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
        long q = dsui.q(byteBuffer);
        this.f = q;
        this.g = byteBuffer.limit() + q;
        long position = q + byteBuffer.position();
        this.h = position;
        this.i = position;
    }

    private final void Q() {
        long j = this.g + this.j;
        this.g = j;
        int i = (int) (j - this.i);
        int i2 = this.l;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.g = j - i3;
    }

    private final int R() {
        return (int) (this.g - this.h);
    }

    private final int S(long j) {
        return (int) (j - this.f);
    }

    public final long A() {
        long j = this.h;
        if (this.g - j >= 8) {
            this.h = 8 + j;
            return ((dsui.p(j + 7) & 255) << 56) | (dsui.p(j) & 255) | ((dsui.p(1 + j) & 255) << 8) | ((dsui.p(2 + j) & 255) << 16) | ((dsui.p(3 + j) & 255) << 24) | ((dsui.p(4 + j) & 255) << 32) | ((dsui.p(5 + j) & 255) << 40) | ((dsui.p(6 + j) & 255) << 48);
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final int B(int i) {
        if (i >= 0) {
            int E = i + E();
            int i2 = this.l;
            if (E <= i2) {
                this.l = E;
                Q();
                return i2;
            }
            throw dsrm.a();
        }
        throw dsrm.b();
    }

    @Override // defpackage.dspj
    public final void C(int i) {
        this.l = i;
        Q();
    }

    @Override // defpackage.dspj
    public final boolean D() {
        return this.h == this.g;
    }

    @Override // defpackage.dspj
    public final int E() {
        return (int) (this.h - this.i);
    }

    public final byte F() {
        long j = this.h;
        if (j != this.g) {
            this.h = 1 + j;
            return dsui.p(j);
        }
        throw dsrm.a();
    }

    @Override // defpackage.dspj
    public final byte[] G(int i) {
        throw null;
    }

    @Override // defpackage.dspj
    public final int a() {
        if (D()) {
            this.k = 0;
            return 0;
        }
        int w = w();
        this.k = w;
        if (dsut.b(w) == 0) {
            throw dsrm.d();
        }
        return this.k;
    }

    @Override // defpackage.dspj
    public final void b(int i) {
        if (this.k == i) {
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
        if (w <= 0 || w > R()) {
            if (w == 0) {
                return "";
            }
            if (w < 0) {
                throw dsrm.b();
            }
            throw dsrm.a();
        }
        byte[] bArr = new byte[w];
        long j = w;
        dsui.y(this.h, bArr, j);
        String str = new String(bArr, dsrk.a);
        this.h += j;
        return str;
    }

    @Override // defpackage.dspj
    public final String m() {
        String d;
        int w = w();
        if (w <= 0 || w > R()) {
            if (w == 0) {
                return "";
            }
            if (w <= 0) {
                throw dsrm.b();
            }
            throw dsrm.a();
        }
        int S = S(this.h);
        ByteBuffer byteBuffer = this.e;
        dsuk dsukVar = dsuo.a;
        if (byteBuffer.hasArray()) {
            d = dsukVar.c(byteBuffer.array(), byteBuffer.arrayOffset() + S, w);
        } else {
            d = byteBuffer.isDirect() ? dsukVar.d(byteBuffer, S, w) : dsuk.f(byteBuffer, S, w);
        }
        this.h += w;
        return d;
    }

    @Override // defpackage.dspj
    public final void n(dssi dssiVar, dsqa dsqaVar) {
        throw null;
    }

    @Override // defpackage.dspj
    public final <T extends dssj> T o(dssr<T> dssrVar, dsqa dsqaVar) {
        throw null;
    }

    @Override // defpackage.dspj
    public final dspd p() {
        int w = w();
        if (w <= 0 || w > R()) {
            if (w == 0) {
                return dspd.b;
            }
            if (w < 0) {
                throw dsrm.b();
            }
            throw dsrm.a();
        }
        byte[] bArr = new byte[w];
        long j = w;
        dsui.y(this.h, bArr, j);
        this.h += j;
        return dspd.y(bArr);
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
        if (defpackage.dsui.p(r4) >= 0) goto L13;
     */
    @Override // defpackage.dspj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w() {
        /*
            r10 = this;
            long r0 = r10.h
            long r2 = r10.g
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L87
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = defpackage.dsui.p(r0)
            if (r0 < 0) goto L17
            r10.h = r4
            return r0
        L17:
            long r6 = r10.g
            long r6 = r6 - r4
            r8 = 9
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L87
            long r6 = r4 + r2
            byte r1 = defpackage.dsui.p(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L2e
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L84
        L2e:
            long r4 = r6 + r2
            byte r1 = defpackage.dsui.p(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L3d
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L3b:
            r6 = r4
            goto L84
        L3d:
            long r6 = r4 + r2
            byte r1 = defpackage.dsui.p(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L4d
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L84
        L4d:
            long r4 = r6 + r2
            byte r1 = defpackage.dsui.p(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.dsui.p(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.dsui.p(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.dsui.p(r4)
            if (r1 >= 0) goto L84
            long r4 = r6 + r2
            byte r1 = defpackage.dsui.p(r6)
            if (r1 >= 0) goto L3b
            long r6 = r4 + r2
            byte r1 = defpackage.dsui.p(r4)
            if (r1 < 0) goto L87
        L84:
            r10.h = r6
            return r0
        L87:
            long r0 = r10.y()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspi.w():int");
    }

    public final long x() {
        long p;
        long j;
        long j2;
        int i;
        long j3 = this.h;
        if (this.g != j3) {
            long j4 = j3 + 1;
            byte p2 = dsui.p(j3);
            if (p2 >= 0) {
                this.h = j4;
                return p2;
            } else if (this.g - j4 >= 9) {
                long j5 = j4 + 1;
                int p3 = p2 ^ (dsui.p(j4) << 7);
                if (p3 >= 0) {
                    long j6 = j5 + 1;
                    int p4 = p3 ^ (dsui.p(j5) << 14);
                    if (p4 >= 0) {
                        p = p4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int p5 = p4 ^ (dsui.p(j6) << 21);
                        if (p5 < 0) {
                            i = p5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long p6 = p5 ^ (dsui.p(j5) << 28);
                            if (p6 < 0) {
                                long j7 = j6 + 1;
                                long p7 = p6 ^ (dsui.p(j6) << 35);
                                if (p7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    p6 = p7 ^ (dsui.p(j7) << 42);
                                    if (p6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        p7 = p6 ^ (dsui.p(j6) << 49);
                                        if (p7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            p = (p7 ^ (dsui.p(j7) << 56)) ^ 71499008037633920L;
                                            if (p < 0) {
                                                long j8 = 1 + j6;
                                                if (dsui.p(j6) >= 0) {
                                                    j5 = j8;
                                                    this.h = j5;
                                                    return p;
                                                }
                                            }
                                        }
                                    }
                                }
                                p = p7 ^ j;
                                j5 = j7;
                                this.h = j5;
                                return p;
                            }
                            j2 = 266354560;
                            p = p6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.h = j5;
                    return p;
                }
                i = p3 ^ (-128);
                p = i;
                this.h = j5;
                return p;
            }
        }
        return y();
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
        long j = this.h;
        if (this.g - j >= 4) {
            this.h = 4 + j;
            return ((dsui.p(j + 3) & 255) << 24) | (dsui.p(j) & 255) | ((dsui.p(1 + j) & 255) << 8) | ((dsui.p(2 + j) & 255) << 16);
        }
        throw dsrm.a();
    }

    public final void H(int i) {
        if (i >= 0 && i <= R()) {
            this.h += i;
        } else if (i < 0) {
            throw dsrm.b();
        } else {
            throw dsrm.a();
        }
    }

    @Override // defpackage.dspj
    public final boolean c(int i) {
        int a;
        int a2 = dsut.a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (R() < 10) {
                while (i2 < 10) {
                    if (F() < 0) {
                        i2++;
                    }
                }
                throw dsrm.c();
            }
            while (i2 < 10) {
                long j = this.h;
                this.h = 1 + j;
                if (dsui.p(j) < 0) {
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
}
