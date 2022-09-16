package defpackage;

import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dmvw  reason: default package */
/* loaded from: classes.dex */
public class dmvw {
    protected static final Charset n = Charset.forName("UTF-8");
    protected static final byte[] o = new byte[0];
    public byte[] p = o;
    public int q;
    public int r;

    public static int J(byte[] bArr, dmvu dmvuVar) {
        int i = dmvuVar.a;
        dmvuVar.a = i + 1;
        return bArr[i] & 255;
    }

    public static int K(byte[] bArr, dmvu dmvuVar) {
        int J = J(bArr, dmvuVar);
        if (J < 128) {
            return J;
        }
        int J2 = J(bArr, dmvuVar);
        int i = (J & 127) | ((J2 & 127) << 7);
        if (J2 < 128) {
            return i;
        }
        int J3 = J(bArr, dmvuVar);
        int i2 = i | ((J3 & 127) << 14);
        if (J3 < 128) {
            return i2;
        }
        int J4 = J(bArr, dmvuVar);
        int i3 = i2 | ((J4 & 127) << 21);
        if (J4 < 128) {
            return i3;
        }
        int J5 = J(bArr, dmvuVar);
        int i4 = i3 | ((J5 & 127) << 28);
        if (J5 >= 128) {
            while (J5 >= 128) {
                J5 = J(bArr, dmvuVar);
            }
        }
        return i4;
    }

    public static long L(byte[] bArr, dmvu dmvuVar) {
        long J = J(bArr, dmvuVar);
        if (J < 128) {
            return J;
        }
        long j = J & 127;
        int i = 7;
        while (true) {
            long J2 = J(bArr, dmvuVar);
            j |= (J2 & 127) << i;
            if (J2 < 128) {
                return j;
            }
            i += 7;
        }
    }

    public static int M(byte[] bArr, dmvu dmvuVar) {
        int i = dmvuVar.a;
        dmvuVar.a = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static long N(byte[] bArr, dmvu dmvuVar) {
        int i = dmvuVar.a;
        dmvuVar.a = i + 8;
        return (bArr[i] & 255) | ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    public static int O(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static void P(byte[] bArr, int i, int i2, dmvr dmvrVar) {
        dmvu dmvuVar = new dmvu(i);
        int i3 = i + i2;
        while (dmvuVar.a < i3) {
            dmvrVar.a(K(bArr, dmvuVar));
        }
    }

    public static void Q(byte[] bArr, int i, int i2, dmvp dmvpVar) {
        dmvu dmvuVar = new dmvu(i);
        int i3 = i + i2;
        while (dmvuVar.a < i3) {
            dmvpVar.a(M(bArr, dmvuVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (T(r2) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        U(r2, L(r7, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        b(r2, K(r7, r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            byte[] r0 = r6.p
            if (r0 != r7) goto La
            int r0 = r6.q
            if (r0 == r8) goto L9
            goto La
        L9:
            return
        La:
            r6.a()
            r6.p = r7
            r6.q = r8
            r6.r = r9
            dmvu r0 = new dmvu
            r0.<init>(r8)
            int r8 = r8 + r9
            r9 = 8
            r1 = 0
            r2 = 0
            r3 = 0
        L1e:
            r4 = 0
        L1f:
            int r5 = r0.a
            if (r5 >= r8) goto L72
            int r2 = K(r7, r0)
            r3 = r2 & 7
            int r2 = r2 >> 3
            if (r3 == 0) goto L5a
            r5 = 1
            if (r3 == r5) goto L4f
            r5 = 2
            if (r3 == r5) goto L40
            r5 = 5
            if (r3 == r5) goto L37
            goto L1f
        L37:
            int r4 = M(r7, r0)
            r6.b(r2, r4)
            r4 = 4
            goto L1f
        L40:
            int r4 = K(r7, r0)
            int r5 = r0.a
            r6.c(r2, r5, r4)
            int r5 = r0.a
            int r5 = r5 + r4
            r0.a = r5
            goto L1f
        L4f:
            long r4 = N(r7, r0)
            boolean r4 = r6.U(r2, r4)
            r4 = 8
            goto L1f
        L5a:
            boolean r4 = r6.T(r2)
            if (r4 == 0) goto L69
            long r4 = L(r7, r0)
            boolean r4 = r6.U(r2, r4)
            goto L1e
        L69:
            int r4 = K(r7, r0)
            boolean r4 = r6.b(r2, r4)
            goto L1e
        L72:
            if (r5 > r8) goto L75
            return
        L75:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 139(0x8b, float:1.95E-43)
            r9.<init>(r0)
            java.lang.String r0 = "Proto parsing overran buffer (ended at "
            r9.append(r0)
            r9.append(r5)
            java.lang.String r0 = ", past "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = ", last tag was "
            r9.append(r8)
            r9.append(r2)
            java.lang.String r8 = " of type "
            r9.append(r8)
            r9.append(r3)
            java.lang.String r8 = " with length "
            r9.append(r8)
            r9.append(r4)
            java.lang.String r8 = ")"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            goto Lb4
        Lb3:
            throw r7
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmvw.R(byte[], int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long S(int i, int i2) {
        dmvu dmvuVar = new dmvu(i);
        int i3 = i + i2;
        while (dmvuVar.a < i3) {
            int K = K(this.p, dmvuVar);
            int i4 = K >> 3;
            int i5 = K & 7;
            if (i5 == 0) {
                long L = L(this.p, dmvuVar);
                if (i4 == 1) {
                    return L;
                }
            } else if (i5 != 1) {
                if (i5 == 2) {
                    dmvuVar.a += K(this.p, dmvuVar);
                } else if (i5 != 5) {
                    continue;
                } else if (i4 == 1) {
                    return M(this.p, dmvuVar);
                } else {
                    dmvuVar.a += 4;
                }
            } else if (i4 == 1) {
                return N(this.p, dmvuVar);
            } else {
                dmvuVar.a += 8;
            }
        }
        return -1L;
    }

    protected boolean T(int i) {
        return false;
    }

    protected boolean U(int i, long j) {
        return false;
    }

    public void a() {
        this.p = o;
        this.q = 0;
        this.r = 0;
    }

    protected boolean b(int i, int i2) {
        return false;
    }

    protected void c(int i, int i2, int i3) {
    }
}
