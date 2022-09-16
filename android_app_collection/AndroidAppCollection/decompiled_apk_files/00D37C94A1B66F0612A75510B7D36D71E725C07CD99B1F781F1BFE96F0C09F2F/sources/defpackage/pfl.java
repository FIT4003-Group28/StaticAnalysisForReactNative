package defpackage;

import android.util.Pair;
/* compiled from: PG */
/* renamed from: pfl  reason: default package */
/* loaded from: classes4.dex */
final class pfl {
    private static final byte[] a = pxi.U("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (r24 == 0) goto L456;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x087e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pft a(defpackage.pfh r42, defpackage.pfi r43, long r44, com.google.android.exoplayer2.drm.DrmInitData r46) {
        /*
            Method dump skipped, instructions count: 2219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfl.a(pfh, pfi, long, com.google.android.exoplayer2.drm.DrmInitData):pft");
    }

    private static int b(pwu pwuVar) {
        int i = pwuVar.i();
        int i2 = i & 127;
        while ((i & 128) == 128) {
            i = pwuVar.i();
            i2 = (i2 << 7) | (i & 127);
        }
        return i2;
    }

    private static Pair c(pwu pwuVar, int i) {
        pwuVar.G(i + 12);
        pwuVar.H(1);
        b(pwuVar);
        pwuVar.H(2);
        int i2 = pwuVar.i();
        if ((i2 & 128) != 0) {
            pwuVar.H(2);
        }
        if ((i2 & 64) != 0) {
            pwuVar.H(pwuVar.m());
        }
        if ((i2 & 32) != 0) {
            pwuVar.H(2);
        }
        pwuVar.H(1);
        b(pwuVar);
        String f = pwl.f(pwuVar.i());
        if ("audio/mpeg".equals(f) || "audio/vnd.dts".equals(f) || "audio/vnd.dts.hd".equals(f)) {
            return Pair.create(f, null);
        }
        pwuVar.H(12);
        pwuVar.H(1);
        int b = b(pwuVar);
        byte[] bArr = new byte[b];
        pwuVar.B(bArr, 0, b);
        return Pair.create(f, bArr);
    }

    private static Pair d(pwu pwuVar, int i, int i2) {
        Integer num;
        pfu pfuVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int i5 = pwuVar.b;
        while (i5 - i < i2) {
            pwuVar.G(i5);
            int d = pwuVar.d();
            ptx.f(d > 0, "childAtomSize should be positive");
            if (pwuVar.d() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < d) {
                    pwuVar.G(i6);
                    int d2 = pwuVar.d();
                    int d3 = pwuVar.d();
                    if (d3 == 1718775137) {
                        num2 = Integer.valueOf(pwuVar.d());
                    } else if (d3 == 1935894637) {
                        pwuVar.H(4);
                        str = pwuVar.v(4);
                    } else if (d3 == 1935894633) {
                        i7 = i6;
                        i8 = d2;
                    }
                    i6 += d2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    ptx.h(num2, "frma atom is mandatory");
                    ptx.f(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            pfuVar = null;
                            break;
                        }
                        pwuVar.G(i9);
                        int d4 = pwuVar.d();
                        if (pwuVar.d() == 1952804451) {
                            int d5 = pwuVar.d();
                            pwuVar.H(1);
                            if (pfj.d(d5) == 0) {
                                pwuVar.H(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int i10 = pwuVar.i();
                                i3 = i10 & 15;
                                i4 = (i10 & 240) >> 4;
                            }
                            boolean z = pwuVar.i() == 1;
                            int i11 = pwuVar.i();
                            byte[] bArr2 = new byte[16];
                            pwuVar.B(bArr2, 0, 16);
                            if (!z || i11 != 0) {
                                bArr = null;
                            } else {
                                int i12 = pwuVar.i();
                                byte[] bArr3 = new byte[i12];
                                pwuVar.B(bArr3, 0, i12);
                                bArr = bArr3;
                            }
                            num = num2;
                            pfuVar = new pfu(z, str, i11, bArr2, i4, i3, bArr);
                        } else {
                            i9 += d4;
                        }
                    }
                    ptx.h(pfuVar, "tenc atom is mandatory");
                    create = Pair.create(num, pfuVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += d;
        }
        return null;
    }
}
