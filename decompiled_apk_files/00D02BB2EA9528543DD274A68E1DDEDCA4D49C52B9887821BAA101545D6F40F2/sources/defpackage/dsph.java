package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsph  reason: default package */
/* loaded from: classes.dex */
public final class dsph extends dspj {
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public dsph(InputStream inputStream) {
        dsrk.i(inputStream, "input");
        this.e = inputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    private final void Q() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    private final void R(int i) {
        if (!S(i)) {
            if (i > (this.c - this.k) - this.i) {
                throw dsrm.h();
            }
            throw dsrm.a();
        }
    }

    private final boolean S(int i) {
        int i2 = this.i;
        int i3 = this.g;
        if (i2 + i > i3) {
            int i4 = this.c;
            int i5 = this.k;
            if (i > (i4 - i5) - i2 || i5 + i2 + i > this.l) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i5 = this.k + i2;
                this.k = i5;
                i3 = this.g - i2;
                this.g = i3;
                this.i = 0;
            }
            int read = this.e.read(this.f, i3, Math.min(4096 - i3, (this.c - i5) - i3));
            if (read == 0 || read < -1 || read > 4096) {
                String valueOf = String.valueOf(this.e.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.g += read;
                Q();
                if (this.g < i) {
                    return S(i);
                }
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte[] T(int i) {
        if (i == 0) {
            return dsrk.b;
        }
        if (i >= 0) {
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c <= 0) {
                int i5 = this.l;
                if (i4 > i5) {
                    H((i5 - i2) - i3);
                    throw dsrm.a();
                }
                int i6 = this.g - i3;
                int i7 = i - i6;
                if (i7 >= 4096 && i7 > this.e.available()) {
                    return null;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.f, this.i, bArr, 0, i6);
                this.k += this.g;
                this.i = 0;
                this.g = 0;
                while (i6 < i) {
                    int read = this.e.read(bArr, i6, i - i6);
                    if (read == -1) {
                        throw dsrm.a();
                    }
                    this.k += read;
                    i6 += read;
                }
                return bArr;
            }
            throw dsrm.h();
        }
        throw dsrm.b();
    }

    private final List<byte[]> U(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.e.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw dsrm.a();
                }
                this.k += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final byte[] V(int i) {
        byte[] T = T(i);
        if (T != null) {
            return T;
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        List<byte[]> U = U(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, i4);
        for (byte[] bArr2 : U) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final long A() {
        int i = this.i;
        if (this.g - i < 8) {
            R(8);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // defpackage.dspj
    public final int B(int i) {
        if (i >= 0) {
            int i2 = i + this.k + this.i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.l = i2;
                Q();
                return i3;
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
        return this.i == this.g && !S(1);
    }

    @Override // defpackage.dspj
    public final int E() {
        return this.k + this.i;
    }

    public final byte F() {
        if (this.i == this.g) {
            R(1);
        }
        byte[] bArr = this.f;
        int i = this.i;
        this.i = i + 1;
        return bArr[i];
    }

    @Override // defpackage.dspj
    public final byte[] G(int i) {
        throw null;
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
            int i = this.g;
            int i2 = this.i;
            if (w <= i - i2) {
                String str = new String(this.f, i2, w, dsrk.a);
                this.i += w;
                return str;
            }
        }
        if (w == 0) {
            return "";
        }
        if (w <= this.g) {
            R(w);
            String str2 = new String(this.f, this.i, w, dsrk.a);
            this.i += w;
            return str2;
        }
        return new String(V(w), dsrk.a);
    }

    @Override // defpackage.dspj
    public final String m() {
        byte[] V;
        int w = w();
        int i = this.i;
        int i2 = this.g;
        if (w <= i2 - i && w > 0) {
            V = this.f;
            this.i = i + w;
        } else if (w == 0) {
            return "";
        } else {
            if (w <= i2) {
                R(w);
                V = this.f;
                this.i = w;
            } else {
                V = V(w);
            }
            i = 0;
        }
        return dsuo.h(V, i, w);
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
        int i = this.g;
        int i2 = this.i;
        if (w <= i - i2 && w > 0) {
            dspd w2 = dspd.w(this.f, i2, w);
            this.i += w;
            return w2;
        } else if (w != 0) {
            byte[] T = T(w);
            if (T != null) {
                return dspd.x(T);
            }
            int i3 = this.i;
            int i4 = this.g;
            int i5 = i4 - i3;
            this.k += i4;
            this.i = 0;
            this.g = 0;
            List<byte[]> U = U(w - i5);
            byte[] bArr = new byte[w];
            System.arraycopy(this.f, i3, bArr, 0, i5);
            for (byte[] bArr2 : U) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return dspd.y(bArr);
        } else {
            return dspd.b;
        }
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
        int i = this.i;
        if (this.g - i < 4) {
            R(4);
            i = this.i;
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final void H(int i) {
        int i2 = this.g;
        int i3 = this.i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.i = i3 + i;
        } else if (i >= 0) {
            int i5 = this.k;
            int i6 = i5 + i3;
            int i7 = this.l;
            if (i6 + i > i7) {
                H((i7 - i5) - i3);
                throw dsrm.a();
            }
            this.k = i6;
            this.g = 0;
            this.i = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    long skip = this.e.skip(j);
                    if (skip < 0 || skip > j) {
                        String valueOf = String.valueOf(this.e.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    } else if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } finally {
                    this.k += i4;
                    Q();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i8 = this.g;
            int i9 = i8 - this.i;
            this.i = i8;
            R(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.g;
                if (i10 <= i11) {
                    this.i = i10;
                    return;
                }
                i9 += i11;
                this.i = i11;
                R(1);
            }
        } else {
            throw dsrm.b();
        }
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
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.i = r3
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
            r5.i = r1
            return r0
        L6c:
            long r0 = r5.y()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsph.w():int");
    }

    @Override // defpackage.dspj
    public final boolean c(int i) {
        int a;
        int a2 = dsut.a(i);
        int i2 = 0;
        if (a2 == 0) {
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (F() < 0) {
                        i2++;
                    }
                }
                throw dsrm.c();
            }
            while (i2 < 10) {
                byte[] bArr = this.f;
                int i3 = this.i;
                this.i = i3 + 1;
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
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
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
                                                    this.i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.i = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return y();
    }
}
