package defpackage;

import android.util.Pair;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oza  reason: default package */
/* loaded from: classes4.dex */
public final class oza {
    private static final int a = pcx.c("cenc");

    public static oxy a(oyt oytVar, boolean z) {
        oxy oxyVar;
        if (z) {
            return null;
        }
        pct pctVar = oytVar.a;
        pctVar.z(8);
        while (pctVar.a() >= 8) {
            int c = pctVar.c();
            if (pctVar.c() != oyu.aC) {
                pctVar.A(c - 8);
            } else {
                pctVar.z(pctVar.b - 8);
                pctVar.y(pctVar.b + c);
                pctVar.A(12);
                pct pctVar2 = new pct();
                while (pctVar.a() >= 8) {
                    int c2 = pctVar.c() - 8;
                    if (pctVar.c() == oyu.aD) {
                        pctVar2.x(pctVar.a, pctVar.b + c2);
                        pctVar2.z(pctVar.b);
                        while (true) {
                            if (pctVar2.a() <= 0) {
                                oxyVar = null;
                                break;
                            }
                            int c3 = pctVar2.b + pctVar2.c();
                            if (pctVar2.c() == oyu.aP) {
                                String str = null;
                                String str2 = null;
                                String str3 = null;
                                while (pctVar2.b < c3) {
                                    int c4 = pctVar2.c() - 12;
                                    int c5 = pctVar2.c();
                                    pctVar2.A(4);
                                    if (c5 == oyu.aE) {
                                        str3 = pctVar2.r(c4);
                                    } else if (c5 == oyu.aF) {
                                        str = pctVar2.r(c4);
                                    } else if (c5 == oyu.aG) {
                                        pctVar2.A(4);
                                        str2 = pctVar2.r(c4 - 4);
                                    } else {
                                        pctVar2.A(c4);
                                    }
                                }
                                if (str != null && str2 != null && "com.apple.iTunes".equals(str3)) {
                                    oxyVar = oxy.a(str, str2);
                                    break;
                                }
                            } else {
                                pctVar2.z(c3);
                            }
                        }
                        if (oxyVar != null) {
                            return oxyVar;
                        }
                    }
                    pctVar.A(c2);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r10 == 0) goto L431;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0882 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x04ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ozh b(defpackage.oys r45, defpackage.oyt r46, long r47, boolean r49) {
        /*
            Method dump skipped, instructions count: 2221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.b(oys, oyt, long, boolean):ozh");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0165 A[LOOP:10: B:59:0x0165->B:60:0x0167, LOOP_START, PHI: r13 r14 r23 r25 
      PHI: (r13v3 int) = (r13v1 int), (r13v10 int) binds: [B:58:0x0163, B:60:0x0167] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r14v3 int) = (r14v1 int), (r14v9 int) binds: [B:58:0x0163, B:60:0x0167] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v2 int) = (r23v1 int), (r23v5 int) binds: [B:58:0x0163, B:60:0x0167] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:58:0x0163, B:60:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ozk c(defpackage.ozh r42, defpackage.oys r43) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oza.c(ozh, oys):ozk");
    }

    private static int d(pct pctVar) {
        int h = pctVar.h();
        int i = h & 127;
        while ((h & 128) == 128) {
            h = pctVar.h();
            i = (i << 7) | (h & 127);
        }
        return i;
    }

    private static int e(pct pctVar, int i, int i2, oyx oyxVar, int i3) {
        int i4 = pctVar.b;
        while (true) {
            boolean z = false;
            if (i4 - i < i2) {
                pctVar.z(i4);
                int c = pctVar.c();
                pce.c(c > 0, "childAtomSize should be positive");
                if (pctVar.c() == oyu.Y) {
                    int i5 = i4 + 8;
                    Pair pair = null;
                    Integer num = null;
                    ozi oziVar = null;
                    boolean z2 = false;
                    while (i5 - i4 < c) {
                        pctVar.z(i5);
                        int c2 = pctVar.c();
                        int c3 = pctVar.c();
                        if (c3 == oyu.ae) {
                            num = Integer.valueOf(pctVar.c());
                        } else if (c3 == oyu.Z) {
                            pctVar.A(4);
                            z2 = pctVar.c() == a;
                        } else if (c3 == oyu.aa) {
                            int i6 = i5 + 8;
                            while (true) {
                                if (i6 - i5 >= c2) {
                                    oziVar = null;
                                    break;
                                }
                                pctVar.z(i6);
                                int c4 = pctVar.c();
                                if (pctVar.c() == oyu.ab) {
                                    pctVar.A(6);
                                    pctVar.h();
                                    int h = pctVar.h();
                                    byte[] bArr = new byte[16];
                                    pctVar.u(bArr, 0, 16);
                                    oziVar = new ozi(h, bArr);
                                    break;
                                }
                                i6 += c4;
                            }
                        }
                        i5 += c2;
                    }
                    if (z2) {
                        pce.c(num != null, "frma atom is mandatory");
                        if (oziVar != null) {
                            z = true;
                        }
                        pce.c(z, "schi->tenc atom is mandatory");
                        pair = Pair.create(num, oziVar);
                    }
                    if (pair != null) {
                        oyxVar.a[i3] = (ozi) pair.second;
                        return ((Integer) pair.first).intValue();
                    }
                }
                i4 += c;
            } else {
                return 0;
            }
        }
    }

    private static Pair f(pct pctVar, int i) {
        pctVar.z(i + 12);
        pctVar.A(1);
        d(pctVar);
        pctVar.A(2);
        int h = pctVar.h();
        if ((h & 128) != 0) {
            pctVar.A(2);
        }
        if ((h & 64) != 0) {
            pctVar.A(pctVar.k());
        }
        if ((h & 32) != 0) {
            pctVar.A(2);
        }
        pctVar.A(1);
        d(pctVar);
        int h2 = pctVar.h();
        String str = null;
        if (h2 == 32) {
            str = "video/mp4v-es";
        } else if (h2 == 33) {
            str = "video/avc";
        } else if (h2 != 35) {
            if (h2 != 64) {
                if (h2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (h2 == 165) {
                    str = "audio/ac3";
                } else if (h2 != 166) {
                    switch (h2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (h2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        pctVar.A(12);
        pctVar.A(1);
        int d = d(pctVar);
        byte[] bArr = new byte[d];
        pctVar.u(bArr, 0, d);
        return Pair.create(str, bArr);
    }
}
