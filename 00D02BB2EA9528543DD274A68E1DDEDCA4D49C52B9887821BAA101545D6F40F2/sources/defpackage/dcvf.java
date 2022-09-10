package defpackage;

import java.io.Serializable;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: dcvf  reason: default package */
/* loaded from: classes5.dex */
public final class dcvf implements Comparable<dcvf>, Serializable {
    public static final dcvf[] a;
    private static final int[] c = new int[1024];
    private static final int[] d = new int[1024];
    private static final dcvf e = new dcvf();
    public final long b;

    static {
        new dcvf(-1L);
        S(0, 0, 0, 0, 0, 0);
        S(0, 0, 0, 1, 0, 1);
        S(0, 0, 0, 2, 0, 2);
        S(0, 0, 0, 3, 0, 3);
        a = new dcvf[6];
        for (int i = 0; i < 6; i++) {
            a[i] = a(i);
        }
    }

    public dcvf() {
        this.b = 0L;
    }

    public dcvf(long j) {
        this.b = j;
    }

    public static long B(int i) {
        int i2 = 30 - i;
        return 1 << (i2 + i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcuv C(int i, int i2, int i3) {
        dcuv dcuvVar = new dcuv();
        int i4 = i(i3);
        R(i, i4, dcuvVar.a);
        R(i2, i4, dcuvVar.b);
        return dcuvVar;
    }

    public static boolean E(long j, long j2) {
        return j + Long.MIN_VALUE < j2 + Long.MIN_VALUE;
    }

    public static boolean F(long j, long j2) {
        return j + Long.MIN_VALUE <= j2 + Long.MIN_VALUE;
    }

    public static boolean G(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    public static boolean H(long j, long j2) {
        return j + Long.MIN_VALUE >= j2 + Long.MIN_VALUE;
    }

    public static long M(int i) {
        return (i << 61) + B(0);
    }

    public static long N(long j, int i) {
        return (j - Long.lowestOneBit(j)) + B(i);
    }

    private static final int O(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return c[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    private static final long P(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((i2 >> 2) << ((i3 + i3) * 4));
    }

    private static final int Q(int i) {
        return i & 3;
    }

    private static void R(int i, int i2, dcuu dcuuVar) {
        dcuuVar.f(dcwz.f.c(i, i2), dcwz.f.c(i + i2, i2));
    }

    private static void S(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i == 4) {
            int i7 = ((i2 << 4) + i3) << 2;
            int i8 = i5 << 2;
            c[i7 + i4] = i8 + i6;
            d[i8 + i4] = i7 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        int i12 = i5 << 2;
        for (int i13 = 0; i13 < 4; i13++) {
            int b = dcvc.b(i6, i13);
            S(i9, (b >>> 1) + i10, i11 + (b & 1), i4, i12 + i13, i6 ^ dcvc.a(i13));
        }
    }

    private static long T(long j) {
        return j - (Long.lowestOneBit(j) - 1);
    }

    private static long U(long j) {
        return j + (Long.lowestOneBit(j) - 1);
    }

    public static dcvf a(int i) {
        return new dcvf(M(i));
    }

    public static dcvf b(dcwa dcwaVar) {
        int m = dcwz.m(dcwaVar);
        dcwx j = dcwz.j(m);
        return v(m, dcwz.b(dcwz.f.e(j.a(dcwaVar.h, dcwaVar.i, dcwaVar.j))), dcwz.b(dcwz.f.e(j.b(dcwaVar.h, dcwaVar.i, dcwaVar.j))));
    }

    public static dcvf c(dcvs dcvsVar) {
        return b(dcvsVar.k());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(long j) {
        return (int) (j >> 32);
    }

    public static int i(int i) {
        return 1 << (30 - i);
    }

    public static dcvf t(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                if (length > 16 || "X".equals(str)) {
                    return e;
                }
                long j = 0;
                for (int i = 0; i < length; i++) {
                    int digit = Character.digit(str.charAt(i), 16);
                    if (digit == -1) {
                        throw new NumberFormatException(str);
                    }
                    j = (j * 16) + digit;
                }
                return new dcvf(j << ((16 - length) * 4));
            }
            throw new NumberFormatException("Empty string in S2CellId.fromToken");
        }
        throw new NumberFormatException("Null string in S2CellId.fromToken");
    }

    public static dcvf v(int i, int i2, int i3) {
        long j = i << 28;
        int i4 = i & 1;
        for (int i5 = 7; i5 >= 4; i5--) {
            int O = O(i2, i3, i5, i4);
            j = P(j, i5, O);
            i4 = Q(O);
        }
        long j2 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int O2 = O(i2, i3, i6, i4);
            j2 = P(j2, i6, O2);
            i4 = Q(O2);
        }
        long j3 = (j << 32) + j2;
        return new dcvf(j3 + j3 + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(long j) {
        return (int) (j >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(long j) {
        return (int) (j & 3);
    }

    public final long A() {
        return Long.lowestOneBit(this.b);
    }

    public final boolean I(dcvf dcvfVar) {
        return G(this.b, dcvfVar.b);
    }

    public final boolean J(dcvf dcvfVar) {
        return F(this.b, dcvfVar.b);
    }

    public final boolean K(dcvf dcvfVar) {
        return H(this.b, dcvfVar.b);
    }

    @Override // java.lang.Comparable
    /* renamed from: L */
    public final int compareTo(dcvf dcvfVar) {
        if (E(this.b, dcvfVar.b)) {
            return -1;
        }
        return !G(this.b, dcvfVar.b) ? 0 : 1;
    }

    public final dcwa d() {
        long e2 = e();
        return dcwz.f.l(g(), f(e2), (int) e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e() {
        long w = w();
        int x = x(w);
        int y = y(w);
        int i = 1;
        if (!j()) {
            i = (((((int) this.b) >>> 2) ^ x) & 1) != 0 ? 2 : 0;
        }
        return (((x + x) + i) << 32) | ((y + y + i) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dcvf) && this.b == ((dcvf) obj).b;
    }

    public final int g() {
        return (int) (this.b >>> 61);
    }

    public final int h() {
        if (j()) {
            return 30;
        }
        return 30 - (Long.numberOfTrailingZeros(this.b) >> 1);
    }

    public final int hashCode() {
        long j = this.b;
        return (int) ((j >>> 32) + j);
    }

    public final boolean j() {
        return (((int) this.b) & 1) != 0;
    }

    public final boolean k() {
        return (this.b & (B(0) + (-1))) == 0;
    }

    public final dcvf l() {
        return new dcvf(T(this.b));
    }

    public final dcvf m() {
        return new dcvf(U(this.b));
    }

    public final boolean n(dcvf dcvfVar) {
        return H(dcvfVar.b, T(this.b)) && F(dcvfVar.b, U(this.b));
    }

    public final dcvf o() {
        long j = this.b;
        long lowestOneBit = Long.lowestOneBit(j) << 2;
        return new dcvf((j & (-lowestOneBit)) | lowestOneBit);
    }

    public final dcvf p(int i) {
        long B = B(i);
        return new dcvf(B | (this.b & (-B)));
    }

    public final dcvf q() {
        long j = this.b;
        long lowestOneBit = Long.lowestOneBit(j);
        return new dcvf((j - lowestOneBit) + (lowestOneBit >>> 2));
    }

    public final dcvf r() {
        long j = this.b;
        long A = A();
        return new dcvf(j + A + A);
    }

    public final int s(dcvf dcvfVar) {
        long[] jArr = {this.b ^ dcvfVar.b, A(), dcvfVar.A()};
        dbsk.a(true);
        long a2 = decu.a(jArr[0]);
        for (int i = 1; i < 3; i++) {
            long a3 = decu.a(jArr[i]);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return Math.max(Long.numberOfLeadingZeros(decu.a(a2)) - 3, -1) >> 1;
    }

    public final String toString() {
        int g = g();
        String hexString = Long.toHexString(this.b & 2305843009213693951L);
        int h = h();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 43);
        sb.append("(face=");
        sb.append(g);
        sb.append(", pos=");
        sb.append(hexString);
        sb.append(", level=");
        sb.append(h);
        sb.append(")");
        return sb.toString();
    }

    public final void u(int i, Collection<dcvf> collection) {
        int i2;
        boolean z;
        boolean z2;
        long w = w();
        int x = x(w);
        int y = y(w);
        int i3 = i(i + 1);
        int i4 = i3 + i3;
        boolean z3 = false;
        if ((x & i3) != 0) {
            z = x + i4 < 1073741824;
            i2 = i4;
        } else {
            i2 = -i4;
            z = x - i4 >= 0;
        }
        if ((i3 & y) != 0) {
            z2 = y + i4 < 1073741824;
        } else {
            int i5 = -i4;
            boolean z4 = y - i4 >= 0;
            i4 = i5;
            z2 = z4;
        }
        int g = g();
        collection.add(p(i));
        int i6 = i2 + x;
        collection.add(D(g, i6, y, z).p(i));
        int i7 = y + i4;
        collection.add(D(g, x, i7, z2).p(i));
        if (!z) {
            if (!z2) {
                return;
            }
            z2 = true;
        }
        if (z && z2) {
            z3 = true;
        }
        collection.add(D(g, i6, i7, z3).p(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long w() {
        int g = g() & 1;
        int i = 0;
        int i2 = 0;
        int i3 = 7;
        while (i3 >= 0) {
            int i4 = i3 == 7 ? 2 : 4;
            int i5 = d[g + ((((int) (this.b >>> (((i3 + i3) * 4) + 1))) & ((1 << (i4 + i4)) - 1)) << 2)];
            int i6 = i3 * 4;
            i += (i5 >> 6) << i6;
            i2 += ((i5 >> 2) & 15) << i6;
            g = Q(i5);
            i3--;
        }
        if ((A() & 1229782938247303440L) != 0) {
            g ^= 1;
        }
        return (i << 33) | (i2 << 2) | g;
    }

    public static dcvf D(int i, int i2, int i3, boolean z) {
        if (!z) {
            int max = Math.max(-1, Math.min(1073741824, i2));
            int max2 = Math.max(-1, Math.min(1073741824, i3));
            double d2 = dcvc.c + 1.0d;
            double d3 = -d2;
            double d4 = (max + max) - 1073741823;
            Double.isNaN(d4);
            double max3 = Math.max(d3, Math.min(d2, d4 * 9.313225746154785E-10d));
            double d5 = (max2 + max2) - 1073741823;
            Double.isNaN(d5);
            double max4 = Math.max(d3, Math.min(d2, d5 * 9.313225746154785E-10d));
            dcwy g = dcwz.g(i);
            double a2 = g.a(max3, max4);
            double b = g.b(max3, max4);
            double c2 = g.c(max3, max4);
            int n = dcwz.n(a2, b, c2);
            dcwx j = dcwz.j(n);
            return v(n, dcwz.b((j.a(a2, b, c2) + 1.0d) * 0.5d), dcwz.b((j.b(a2, b, c2) + 1.0d) * 0.5d));
        }
        return v(i, i2, i3);
    }
}
