package defpackage;
/* compiled from: PG */
/* renamed from: bcb  reason: default package */
/* loaded from: classes2.dex */
final class bcb {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(azf azfVar, boolean z) {
        boolean z2;
        long c = azfVar.c();
        long j = 4096;
        long j2 = -1;
        if (c != -1 && c <= 4096) {
            j = c;
        }
        int i = (int) j;
        pwu pwuVar = new pwu(64);
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        while (i2 < i) {
            pwuVar.C(8);
            byte[] bArr = pwuVar.a;
            int i3 = z3 ? 1 : 0;
            int i4 = z3 ? 1 : 0;
            int i5 = z3 ? 1 : 0;
            int i6 = z3 ? 1 : 0;
            if (!azfVar.o(bArr, i3, 8, true)) {
                break;
            }
            long p = pwuVar.p();
            int d = pwuVar.d();
            int i7 = 16;
            if (p == 1) {
                azfVar.j(pwuVar.a, 8, 8);
                pwuVar.F(16);
                p = pwuVar.o();
            } else {
                if (p == 0) {
                    long c2 = azfVar.c();
                    if (c2 != j2) {
                        p = 8 + (c2 - azfVar.d());
                    }
                }
                i7 = 8;
            }
            long j3 = i7;
            if (p < j3) {
                return z3;
            }
            i2 += i7;
            if (d == 1836019574) {
                i += (int) p;
                if (c != -1 && i > c) {
                    i = (int) c;
                }
                j2 = -1;
            } else if (d == 1836019558 || d == 1836475768) {
                z2 = true;
                break;
            } else {
                long j4 = c;
                if ((i2 + p) - j3 >= i) {
                    break;
                }
                int i8 = (int) (p - j3);
                i2 += i8;
                if (d == 1718909296) {
                    if (i8 < 8) {
                        return false;
                    }
                    pwuVar.C(i8);
                    azfVar.j(pwuVar.a, 0, i8);
                    int i9 = i8 >> 2;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (i10 == 1) {
                            pwuVar.H(4);
                        } else {
                            int d2 = pwuVar.d();
                            if ((d2 >>> 8) != 3368816) {
                                if (d2 == 1751476579) {
                                    d2 = 1751476579;
                                }
                                int[] iArr = a;
                                for (int i11 = 0; i11 < 29; i11++) {
                                    if (iArr[i11] != d2) {
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
                    azfVar.f(i8);
                }
                j2 = -1;
                c = j4;
                z3 = false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
