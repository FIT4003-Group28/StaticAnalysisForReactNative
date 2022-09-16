package defpackage;
/* compiled from: PG */
/* renamed from: clxt  reason: default package */
/* loaded from: classes5.dex */
final class clxt {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(cluk clukVar, boolean z) {
        boolean z2;
        int i;
        long j = clukVar.b;
        long j2 = 4096;
        long j3 = -1;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i2 = (int) j2;
        cmnk cmnkVar = new cmnk(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            cmnkVar.a(8);
            byte[] bArr = cmnkVar.a;
            int i4 = z3 ? 1 : 0;
            int i5 = z3 ? 1 : 0;
            int i6 = z3 ? 1 : 0;
            int i7 = z3 ? 1 : 0;
            if (!clukVar.e(bArr, i4, 8, true)) {
                break;
            }
            long p = cmnkVar.p();
            int r = cmnkVar.r();
            if (p == 1) {
                clukVar.f(cmnkVar.a, 8, 8);
                cmnkVar.e(16);
                p = cmnkVar.t();
                i = 16;
            } else {
                if (p == 0) {
                    long j4 = clukVar.b;
                    p = j4 != j3 ? (j4 - clukVar.j()) + 8 : p;
                }
                i = 8;
            }
            long j5 = i;
            if (p < j5) {
                return z3;
            }
            i3 += i;
            if (r == 1836019574) {
                i2 += (int) p;
                if (j != -1 && i2 > j) {
                    i2 = (int) j;
                }
                j3 = -1;
            } else if (r == 1836019558 || r == 1836475768) {
                z2 = true;
                break;
            } else if ((i3 + p) - j5 >= i2) {
                break;
            } else {
                int i8 = (int) (p - j5);
                i3 += i8;
                if (r == 1718909296) {
                    if (i8 < 8) {
                        return false;
                    }
                    cmnkVar.a(i8);
                    clukVar.f(cmnkVar.a, 0, i8);
                    int i9 = i8 >> 2;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (i10 == 1) {
                            cmnkVar.h(4);
                        } else {
                            int r2 = cmnkVar.r();
                            if ((r2 >>> 8) != 3368816) {
                                if (r2 == 1751476579) {
                                    r2 = 1751476579;
                                }
                                int[] iArr = a;
                                for (int i11 = 0; i11 < 28; i11++) {
                                    if (iArr[i11] != r2) {
                                    }
                                }
                                continue;
                            }
                            z4 = true;
                            break;
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i8 != 0) {
                    clukVar.h(i8);
                }
                j3 = -1;
                z3 = false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
