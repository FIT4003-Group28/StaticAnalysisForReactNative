package defpackage;
/* compiled from: PG */
/* renamed from: bwuu  reason: default package */
/* loaded from: classes4.dex */
public final class bwuu implements dfuk {
    public static final double a = Math.toRadians(5.0d);
    private final buti b;
    private final boolean c;

    public bwuu(buti butiVar, boolean z) {
        this.b = butiVar;
        this.c = z;
    }

    public static dhjy b(dlwi dlwiVar) {
        dhjy bZ = dhjz.e.bZ();
        dpum dpumVar = dlwiVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        if ((dpumVar.a & 1) != 0) {
            dpum dpumVar2 = dlwiVar.b;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            double d = dpumVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a |= 2;
            dhjzVar.c = d;
        }
        dpum dpumVar3 = dlwiVar.b;
        if (dpumVar3 == null) {
            dpumVar3 = dpum.d;
        }
        if ((dpumVar3.a & 2) != 0) {
            dpum dpumVar4 = dlwiVar.b;
            if (dpumVar4 == null) {
                dpumVar4 = dpum.d;
            }
            double d2 = dpumVar4.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = d2;
        }
        dlwe dlweVar = dlwiVar.c;
        if (dlweVar == null) {
            dlweVar = dlwe.c;
        }
        if ((dlweVar.a & 1) != 0) {
            dlwe dlweVar2 = dlwiVar.c;
            if (dlweVar2 == null) {
                dlweVar2 = dlwe.c;
            }
            double d3 = dlweVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar3 = (dhjz) bZ.b;
            dhjzVar3.a |= 4;
            dhjzVar3.d = d3;
        }
        return bZ;
    }

    public static dftc c(dggg dgggVar) {
        dftc bZ = dftd.d.bZ();
        dgge b = dgge.b(dgggVar.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        int g = g(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftd dftdVar = (dftd) bZ.b;
        dftdVar.b = g - 1;
        int i = dftdVar.a | 1;
        dftdVar.a = i;
        String str = dgggVar.c;
        str.getClass();
        dftdVar.a = i | 2;
        dftdVar.c = str;
        return bZ;
    }

    public static dftg d(dspd dspdVar) {
        int c = dspdVar.c();
        if (c < 8) {
            throw new IllegalStateException("Planar depth map too small.");
        }
        try {
            byte a2 = dspdVar.a(0);
            int h = h(dspdVar, 1);
            int h2 = h(dspdVar, 3);
            int h3 = h(dspdVar, 5);
            byte a3 = dspdVar.a(7);
            int i = (h2 * h3) + a3;
            int i2 = (h * 16) + i;
            if (a2 == 8 && h != 0 && h2 != 0 && h3 != 0 && a3 == 8 && i <= c && i2 <= c) {
                dftg bZ = dfth.d.bZ();
                dfsw bZ2 = dfsx.e.bZ();
                dspd i3 = dspdVar.i(8, i);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar = (dfsx) bZ2.b;
                i3.getClass();
                dfsxVar.a |= 1;
                dfsxVar.b = i3;
                dhkc bZ3 = dhkd.d.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dhkd dhkdVar = (dhkd) bZ3.b;
                int i4 = dhkdVar.a | 1;
                dhkdVar.a = i4;
                dhkdVar.b = h2;
                dhkdVar.a = i4 | 2;
                dhkdVar.c = h3;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar2 = (dfsx) bZ2.b;
                dhkd bK = bZ3.bK();
                bK.getClass();
                dfsxVar2.c = bK;
                dfsxVar2.a |= 2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar3 = (dfsx) bZ2.b;
                dfsxVar3.a |= 4;
                dfsxVar3.d = 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfth dfthVar = (dfth) bZ.b;
                dfsx bK2 = bZ2.bK();
                bK2.getClass();
                dfthVar.b = bK2;
                dfthVar.a |= 1;
                while (i < i2) {
                    float i5 = i(dspdVar, i);
                    float i6 = i(dspdVar, i + 4);
                    float i7 = i(dspdVar, i + 8);
                    float i8 = i(dspdVar, i + 12);
                    dfti bZ4 = dftj.f.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dftj dftjVar = (dftj) bZ4.b;
                    int i9 = dftjVar.a | 1;
                    dftjVar.a = i9;
                    dftjVar.b = i5;
                    int i10 = i9 | 2;
                    dftjVar.a = i10;
                    dftjVar.c = i6;
                    int i11 = i10 | 4;
                    dftjVar.a = i11;
                    dftjVar.d = i7;
                    dftjVar.a = i11 | 8;
                    dftjVar.e = i8;
                    bZ.a(bZ4);
                    i += 16;
                }
                return bZ;
            }
            throw new IllegalStateException("Planar depth map initialization parameters invalid.");
        } catch (ArrayIndexOutOfBoundsException unused) {
            return dfth.d.bZ();
        }
    }

    public static dfsh e(dspd dspdVar) {
        dftc dftcVar;
        int c = dspdVar.c();
        if (c < 8) {
            throw new IllegalStateException("Target map too small.");
        }
        try {
            byte a2 = dspdVar.a(0);
            int h = h(dspdVar, 1);
            int h2 = h(dspdVar, 3);
            int h3 = h(dspdVar, 5);
            byte a3 = dspdVar.a(7);
            int i = (h2 * h3) + a3;
            int i2 = ((h - 1) * 22) + i;
            if (a2 == 8 && h != 0 && h2 != 0 && h3 != 0 && a3 == 8 && i <= c && i2 <= c) {
                dfsh bZ = dfsi.d.bZ();
                dfsw bZ2 = dfsx.e.bZ();
                dspd i3 = dspdVar.i(8, i);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar = (dfsx) bZ2.b;
                i3.getClass();
                dfsxVar.a |= 1;
                dfsxVar.b = i3;
                dhkc bZ3 = dhkd.d.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dhkd dhkdVar = (dhkd) bZ3.b;
                int i4 = dhkdVar.a | 1;
                dhkdVar.a = i4;
                dhkdVar.b = h2;
                dhkdVar.a = i4 | 2;
                dhkdVar.c = h3;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar2 = (dfsx) bZ2.b;
                dhkd bK = bZ3.bK();
                bK.getClass();
                dfsxVar2.c = bK;
                dfsxVar2.a |= 2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dfsx dfsxVar3 = (dfsx) bZ2.b;
                dfsxVar3.a |= 4;
                dfsxVar3.d = 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfsi dfsiVar = (dfsi) bZ.b;
                dfsx bK2 = bZ2.bK();
                bK2.getClass();
                dfsiVar.b = bK2;
                dfsiVar.a |= 1;
                dftd dftdVar = dftd.d;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfsi dfsiVar2 = (dfsi) bZ.b;
                dftdVar.getClass();
                dfsiVar2.b();
                dfsiVar2.c.add(dftdVar);
                while (i < i2) {
                    String j = j(dspdVar, i);
                    if (!dbsj.d(j)) {
                        dftc bZ4 = dftd.d.bZ();
                        if (bZ4.c) {
                            bZ4.bF();
                            bZ4.c = false;
                        }
                        dftd dftdVar2 = (dftd) bZ4.b;
                        dftdVar2.b = 1;
                        int i5 = dftdVar2.a | 1;
                        dftdVar2.a = i5;
                        j.getClass();
                        dftdVar2.a = i5 | 2;
                        dftdVar2.c = j;
                        dftcVar = bZ4;
                    } else {
                        dftcVar = dftd.d.bZ();
                    }
                    bZ.a(dftcVar);
                    i += 22;
                }
                return bZ;
            }
            throw new IllegalStateException("Target map initialization parameters invalid.");
        } catch (ArrayIndexOutOfBoundsException unused) {
            return dfsi.d.bZ();
        }
    }

    public static int g(dgge dggeVar) {
        if (dggeVar == dgge.IMAGE_ALLEYCAT) {
            return 2;
        }
        if (dggeVar == dgge.IMAGE_FIFE) {
            return 3;
        }
        if (dggeVar == dgge.IMAGE_CONTENT_FIFE) {
            return 4;
        }
        return dggeVar == dgge.MEDIA_GUESSABLE_FIFE ? 7 : 1;
    }

    private static int h(dspd dspdVar, int i) {
        try {
            return ((dspdVar.a(i + 1) << 8) & 65280) | (dspdVar.a(i) & 255);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0;
        }
    }

    private static float i(dspd dspdVar, int i) {
        try {
            return Float.intBitsToFloat(((dspdVar.a(i + 3) << 24) & (-16777216)) | (dspdVar.a(i) & 255) | ((dspdVar.a(i + 1) << 8) & 65280) | ((dspdVar.a(i + 2) << 16) & 16711680));
        } catch (ArrayIndexOutOfBoundsException unused) {
            return 0.0f;
        }
    }

    private static String j(dspd dspdVar, int i) {
        try {
            return dspdVar.i(i, i + 22).J();
        } catch (ArrayIndexOutOfBoundsException unused) {
            return "";
        }
    }

    @Override // defpackage.dfuk
    public final void a(dftd dftdVar, dhjz dhjzVar, dfui dfuiVar) {
        dwfs bZ = dwfv.m.bZ();
        dwev bZ2 = dwew.e.bZ();
        drcf bZ3 = drcg.e.bZ();
        dgge dggeVar = dgge.IMAGE_ALLEYCAT;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar = (drcg) bZ3.b;
        drcgVar.b = dggeVar.l;
        int i = drcgVar.a | 1;
        drcgVar.a = i;
        drcgVar.a = i | 2;
        drcgVar.c = true;
        dggc dggcVar = dggc.PANO;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drcg drcgVar2 = (drcg) bZ3.b;
        drcgVar2.d = dggcVar.f;
        drcgVar2.a |= 4;
        bZ2.a(bZ3);
        drcf bZ4 = drcg.e.bZ();
        dgge dggeVar2 = dgge.IMAGE_FIFE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar3 = (drcg) bZ4.b;
        drcgVar3.b = dggeVar2.l;
        int i2 = drcgVar3.a | 1;
        drcgVar3.a = i2;
        drcgVar3.a = i2 | 2;
        drcgVar3.c = true;
        dggc dggcVar2 = dggc.PANO;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        drcg drcgVar4 = (drcg) bZ4.b;
        drcgVar4.d = dggcVar2.f;
        drcgVar4.a |= 4;
        bZ2.a(bZ4);
        drcf bZ5 = drcg.e.bZ();
        dgge dggeVar3 = dgge.IMAGE_CONTENT_FIFE;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar5 = (drcg) bZ5.b;
        drcgVar5.b = dggeVar3.l;
        int i3 = drcgVar5.a | 1;
        drcgVar5.a = i3;
        drcgVar5.a = i3 | 2;
        drcgVar5.c = true;
        dggc dggcVar3 = dggc.PANO;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        drcg drcgVar6 = (drcg) bZ5.b;
        drcgVar6.d = dggcVar3.f;
        drcgVar6.a |= 4;
        bZ2.a(bZ5);
        drcf bZ6 = drcg.e.bZ();
        dgge dggeVar4 = dgge.MEDIA_GUESSABLE_FIFE;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drcg drcgVar7 = (drcg) bZ6.b;
        drcgVar7.b = dggeVar4.l;
        int i4 = drcgVar7.a | 1;
        drcgVar7.a = i4;
        drcgVar7.a = i4 | 2;
        drcgVar7.c = true;
        dggc dggcVar4 = dggc.PANO;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        drcg drcgVar8 = (drcg) bZ6.b;
        drcgVar8.d = dggcVar4.f;
        drcgVar8.a |= 4;
        bZ2.a(bZ6);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar = (dwfv) bZ.b;
        dwew bK = bZ2.bK();
        bK.getClass();
        dwfvVar.b = bK;
        dwfvVar.a |= 1;
        dwfp bZ7 = dwfr.h.bZ();
        bZ7.a(drbz.RENDER_INFO);
        bZ7.a(drbz.DESCRIPTION);
        bZ7.a(drbz.ATTRIBUTION);
        bZ7.a(drbz.GEOLOCATION);
        bZ7.a(drbz.ASSOCIATED_FEATURES);
        bZ7.a(drbz.NAVIGATION_LINKS);
        bZ7.a(drbz.ROUTE_ANNOTATIONS);
        dlxl bZ8 = dlxo.c.bZ();
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dlxo dlxoVar = (dlxo) bZ8.b;
        dlxoVar.b = 2;
        dlxoVar.a |= 1;
        bZ7.c(bZ8);
        dlxl bZ9 = dlxo.c.bZ();
        if (bZ9.c) {
            bZ9.bF();
            bZ9.c = false;
        }
        dlxo dlxoVar2 = (dlxo) bZ9.b;
        dlxoVar2.b = 1;
        dlxoVar2.a |= 1;
        bZ7.c(bZ9);
        dlvx bZ10 = dlwa.c.bZ();
        if (bZ10.c) {
            bZ10.bF();
            bZ10.c = false;
        }
        dlwa dlwaVar = (dlwa) bZ10.b;
        dlwaVar.b = 2;
        dlwaVar.a |= 1;
        bZ7.b(bZ10);
        dlvx bZ11 = dlwa.c.bZ();
        if (bZ11.c) {
            bZ11.bF();
            bZ11.c = false;
        }
        dlwa dlwaVar2 = (dlwa) bZ11.b;
        dlwaVar2.b = 1;
        dlwaVar2.a |= 1;
        bZ7.b(bZ11);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar2 = (dwfv) bZ.b;
        dwfr bK2 = bZ7.bK();
        bK2.getClass();
        dwfvVar2.c = bK2;
        dwfvVar2.a |= 2;
        dwfe bZ12 = dwff.c.bZ();
        boolean z = this.c;
        if (bZ12.c) {
            bZ12.bF();
            bZ12.c = false;
        }
        dwff dwffVar = (dwff) bZ12.b;
        dwffVar.a |= 2;
        dwffVar.b = z;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwfv dwfvVar3 = (dwfv) bZ.b;
        dwff bK3 = bZ12.bK();
        bK3.getClass();
        dwfvVar3.d = bK3;
        dwfvVar3.a |= 4;
        dwfv bK4 = bZ.bK();
        dwfy bZ13 = dwge.m.bZ();
        dhjy bZ14 = dhjz.e.bZ();
        double d = dhjzVar.b;
        if (bZ14.c) {
            bZ14.bF();
            bZ14.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ14.b;
        int i5 = dhjzVar2.a | 1;
        dhjzVar2.a = i5;
        dhjzVar2.b = d;
        double d2 = dhjzVar.c;
        dhjzVar2.a = i5 | 2;
        dhjzVar2.c = d2;
        if (bZ13.c) {
            bZ13.bF();
            bZ13.c = false;
        }
        dwge dwgeVar = (dwge) bZ13.b;
        dhjz bK5 = bZ14.bK();
        bK5.getClass();
        dwgeVar.e = bK5;
        dwgeVar.a |= 32;
        if (bZ13.c) {
            bZ13.bF();
            bZ13.c = false;
        }
        dwge dwgeVar2 = (dwge) bZ13.b;
        int i6 = dwgeVar2.a | 64;
        dwgeVar2.a = i6;
        dwgeVar2.g = 50.0d;
        bK4.getClass();
        dwgeVar2.h = bK4;
        dwgeVar2.a = i6 | 128;
        if (!dftdVar.c.isEmpty()) {
            dggf bZ15 = dggg.d.bZ();
            int a2 = dfsm.a(dftdVar.b);
            if (a2 == 0) {
                a2 = 1;
            }
            dgge f = f(a2);
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dggg dgggVar = (dggg) bZ15.b;
            dgggVar.b = f.l;
            int i7 = dgggVar.a | 1;
            dgggVar.a = i7;
            String str = dftdVar.c;
            str.getClass();
            dgggVar.a = i7 | 2;
            dgggVar.c = str;
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            dwge dwgeVar3 = (dwge) bZ13.b;
            dggg bK6 = bZ15.bK();
            bK6.getClass();
            dwgeVar3.c();
            dwgeVar3.d.add(bK6);
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            dwge dwgeVar4 = (dwge) bZ13.b;
            dwgeVar4.b = 4;
            dwgeVar4.a |= 1;
        } else {
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            dwge dwgeVar5 = (dwge) bZ13.b;
            dwgeVar5.b = 3;
            dwgeVar5.a |= 1;
        }
        this.b.a(bZ13.bK(), new bwut(dfuiVar), bvrj.BACKGROUND_THREADPOOL);
    }

    public static dgge f(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                return dgge.IMAGE_FIFE;
            }
            if (i2 == 3) {
                return dgge.IMAGE_CONTENT_FIFE;
            }
            if (i2 == 6) {
                return dgge.MEDIA_GUESSABLE_FIFE;
            }
            return dgge.IMAGE_UNKNOWN;
        }
        return dgge.IMAGE_ALLEYCAT;
    }
}
