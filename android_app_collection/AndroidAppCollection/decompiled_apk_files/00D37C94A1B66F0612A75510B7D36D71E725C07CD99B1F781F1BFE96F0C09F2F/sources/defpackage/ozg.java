package defpackage;
/* compiled from: PG */
/* renamed from: ozg  reason: default package */
/* loaded from: classes4.dex */
final class ozg {
    private static final int[] a = {pcx.c("isom"), pcx.c("iso2"), pcx.c("iso3"), pcx.c("iso4"), pcx.c("iso5"), pcx.c("iso6"), pcx.c("avc1"), pcx.c("hvc1"), pcx.c("hev1"), pcx.c("mp41"), pcx.c("mp42"), pcx.c("3g2a"), pcx.c("3g2b"), pcx.c("3gr6"), pcx.c("3gs6"), pcx.c("3ge6"), pcx.c("3gg6"), pcx.c("M4V "), pcx.c("M4A "), pcx.c("f4v "), pcx.c("kddi"), pcx.c("M4VP"), pcx.c("qt  "), pcx.c("MSNV")};

    public static boolean a(oxn oxnVar, boolean z) {
        boolean z2;
        int i;
        long j = oxnVar.b;
        if (j == -1 || j > 4096) {
            j = 4096;
        }
        int i2 = (int) j;
        pct pctVar = new pct(64);
        int i3 = 0;
        boolean z3 = false;
        while (i3 < i2) {
            oxnVar.g(pctVar.a, 0, 8);
            pctVar.z(0);
            long n = pctVar.n();
            int c = pctVar.c();
            if (n == 1) {
                oxnVar.g(pctVar.a, 8, 8);
                n = pctVar.o();
                i = 16;
            } else {
                i = 8;
            }
            long j2 = i;
            if (n < j2) {
                return false;
            }
            i3 += i;
            if (c != oyu.E) {
                if (c == oyu.N || c == oyu.P) {
                    z2 = true;
                    break;
                } else if ((i3 + n) - j2 >= i2) {
                    break;
                } else {
                    int i4 = (int) (n - j2);
                    i3 += i4;
                    if (c == oyu.d) {
                        if (i4 < 8) {
                            return false;
                        }
                        if (pctVar.b() < i4) {
                            pctVar.x(new byte[i4], i4);
                        }
                        oxnVar.g(pctVar.a, 0, i4);
                        int i5 = i4 >> 2;
                        for (int i6 = 0; i6 < i5; i6++) {
                            if (i6 == 1) {
                                pctVar.A(4);
                            } else {
                                int c2 = pctVar.c();
                                if ((c2 >>> 8) != pcx.c("3gp")) {
                                    int[] iArr = a;
                                    int length = iArr.length;
                                    for (int i7 = 0; i7 < 24; i7++) {
                                        if (iArr[i7] != c2) {
                                        }
                                    }
                                    continue;
                                }
                                z3 = true;
                                break;
                            }
                        }
                        if (!z3) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        oxnVar.e(i4);
                    }
                }
            }
        }
        z2 = false;
        return z3 && z == z2;
    }
}
