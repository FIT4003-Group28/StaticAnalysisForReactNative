package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bsqi  reason: default package */
/* loaded from: classes4.dex */
public final class bsqi {
    public static final bsqh a = new bsqh();
    public final btvo b;
    public final brat c;

    public bsqi(btvo btvoVar, brat bratVar) {
        this.b = btvoVar;
        this.c = bratVar;
    }

    private static dncc b(dkkf dkkfVar) {
        dnbz bZ = dncc.b.bZ();
        for (dkke dkkeVar : dkkfVar.a) {
            dnca bZ2 = dncb.d.bZ();
            int i = dkkeVar.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncb dncbVar = (dncb) bZ2.b;
            int i2 = dncbVar.a | 1;
            dncbVar.a = i2;
            dncbVar.b = i;
            int i3 = dkkeVar.b;
            dncbVar.a = i2 | 2;
            dncbVar.c = i3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dncc dnccVar = (dncc) bZ.b;
            dncb bK = bZ2.bK();
            bK.getClass();
            dsrj<dncb> dsrjVar = dnccVar.a;
            if (!dsrjVar.a()) {
                dnccVar.a = dsqw.cl(dsrjVar);
            }
            dnccVar.a.add(bK);
        }
        return bZ.bK();
    }

    public final dfpo a(String str, dpvf dpvfVar) {
        int a2;
        int a3;
        dfpn bZ = dfpo.h.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfpo dfpoVar = (dfpo) bZ.b;
        str.getClass();
        int i = dfpoVar.a | 2;
        dfpoVar.a = i;
        dfpoVar.c = str;
        dfpoVar.d = dpvfVar.an;
        dfpoVar.a = i | 4;
        dkks exploreMapParametersWithoutLogging = this.b.getExploreMapParametersWithoutLogging();
        dnbw bZ2 = dncj.p.bZ();
        if ((exploreMapParametersWithoutLogging.a & 4) != 0) {
            boolean z = exploreMapParametersWithoutLogging.c;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar = (dncj) bZ2.b;
            dncjVar.a |= 1;
            dncjVar.b = z;
        }
        if ((exploreMapParametersWithoutLogging.a & 8) != 0) {
            boolean z2 = exploreMapParametersWithoutLogging.d;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar2 = (dncj) bZ2.b;
            dncjVar2.a |= 2;
            dncjVar2.c = z2;
        }
        if ((exploreMapParametersWithoutLogging.a & 32) != 0) {
            int i2 = exploreMapParametersWithoutLogging.f;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar3 = (dncj) bZ2.b;
            dncjVar3.a |= 4;
            dncjVar3.d = i2;
        }
        if ((exploreMapParametersWithoutLogging.a & 128) != 0) {
            int i3 = exploreMapParametersWithoutLogging.h;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar4 = (dncj) bZ2.b;
            dncjVar4.a |= 32;
            dncjVar4.g = i3;
        }
        if ((exploreMapParametersWithoutLogging.a & 512) != 0) {
            boolean z3 = exploreMapParametersWithoutLogging.j;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar5 = (dncj) bZ2.b;
            dncjVar5.a |= 16;
            dncjVar5.f = z3;
        }
        if ((exploreMapParametersWithoutLogging.a & 64) != 0) {
            dkkf dkkfVar = exploreMapParametersWithoutLogging.g;
            if (dkkfVar == null) {
                dkkfVar = dkkf.b;
            }
            dncc b = b(dkkfVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar6 = (dncj) bZ2.b;
            b.getClass();
            dncjVar6.e = b;
            dncjVar6.a |= 8;
        }
        if ((exploreMapParametersWithoutLogging.a & 256) != 0) {
            dkkf dkkfVar2 = exploreMapParametersWithoutLogging.i;
            if (dkkfVar2 == null) {
                dkkfVar2 = dkkf.b;
            }
            dncc b2 = b(dkkfVar2);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar7 = (dncj) bZ2.b;
            b2.getClass();
            dncjVar7.h = b2;
            dncjVar7.a |= 64;
        }
        if ((exploreMapParametersWithoutLogging.a & 1024) != 0) {
            int a4 = dkjz.a(exploreMapParametersWithoutLogging.k);
            if (a4 == 0) {
                a4 = 1;
            }
            int i4 = a4 - 1;
            if (i4 == 1) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar8 = (dncj) bZ2.b;
                dncjVar8.i = 1;
                dncjVar8.a |= 128;
            } else if (i4 == 2) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar9 = (dncj) bZ2.b;
                dncjVar9.i = 2;
                dncjVar9.a |= 128;
            }
        }
        if ((exploreMapParametersWithoutLogging.a & 33554432) != 0 && (a3 = dfpw.a(exploreMapParametersWithoutLogging.C)) != 0) {
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar10 = (dncj) bZ2.b;
            dncjVar10.n = a3 - 1;
            dncjVar10.a |= 4096;
        }
        dkjt dkjtVar = exploreMapParametersWithoutLogging.l;
        if (dkjtVar == null) {
            dkjtVar = dkjt.b;
        }
        for (dkjs dkjsVar : dkjtVar.a) {
            if (new dsrh(dkjsVar.b, dkjs.c).contains(dpvfVar)) {
                if ((dkjsVar.a & 1) != 0) {
                    dkkf dkkfVar3 = dkjsVar.d;
                    if (dkkfVar3 == null) {
                        dkkfVar3 = dkkf.b;
                    }
                    dncc b3 = b(dkkfVar3);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar11 = (dncj) bZ2.b;
                    b3.getClass();
                    dncjVar11.e = b3;
                    dncjVar11.a |= 8;
                }
                if ((dkjsVar.a & 2) != 0) {
                    dkkf dkkfVar4 = dkjsVar.e;
                    if (dkkfVar4 == null) {
                        dkkfVar4 = dkkf.b;
                    }
                    dncc b4 = b(dkkfVar4);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar12 = (dncj) bZ2.b;
                    b4.getClass();
                    dncjVar12.h = b4;
                    dncjVar12.a |= 64;
                }
                if ((dkjsVar.a & 4) != 0) {
                    int a5 = dkjz.a(dkjsVar.f);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i5 = a5 - 1;
                    if (i5 == 1) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dncj dncjVar13 = (dncj) bZ2.b;
                        dncjVar13.i = 1;
                        dncjVar13.a |= 128;
                    } else if (i5 == 2) {
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dncj dncjVar14 = (dncj) bZ2.b;
                        dncjVar14.i = 2;
                        dncjVar14.a |= 128;
                    }
                }
                if ((dkjsVar.a & 8) != 0 && (a2 = dfpw.a(dkjsVar.g)) != 0) {
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar15 = (dncj) bZ2.b;
                    dncjVar15.n = a2 - 1;
                    dncjVar15.a |= 4096;
                }
            }
        }
        if ((exploreMapParametersWithoutLogging.a & 262144) != 0) {
            int a6 = dkkp.a(exploreMapParametersWithoutLogging.s);
            if (a6 == 0) {
                a6 = 1;
            }
            int i6 = a6 - 1;
            if (i6 == 1) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar16 = (dncj) bZ2.b;
                dncjVar16.j = 1;
                dncjVar16.a |= 256;
            } else if (i6 == 2) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar17 = (dncj) bZ2.b;
                dncjVar17.j = 2;
                dncjVar17.a |= 256;
            } else if (i6 == 3) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar18 = (dncj) bZ2.b;
                dncjVar18.j = 3;
                dncjVar18.a |= 256;
            } else if (i6 == 4) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar19 = (dncj) bZ2.b;
                dncjVar19.j = 4;
                dncjVar19.a |= 256;
            } else if (i6 == 5) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar20 = (dncj) bZ2.b;
                dncjVar20.j = 5;
                dncjVar20.a |= 256;
            }
        }
        if ((exploreMapParametersWithoutLogging.a & ImageMetadata.LENS_APERTURE) != 0) {
            int a7 = dkkr.a(exploreMapParametersWithoutLogging.t);
            if (a7 == 0) {
                a7 = 1;
            }
            switch (a7 - 1) {
                case 1:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar21 = (dncj) bZ2.b;
                    dncjVar21.k = 1;
                    dncjVar21.a |= 512;
                    break;
                case 2:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar22 = (dncj) bZ2.b;
                    dncjVar22.k = 2;
                    dncjVar22.a |= 512;
                    break;
                case 3:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar23 = (dncj) bZ2.b;
                    dncjVar23.k = 3;
                    dncjVar23.a |= 512;
                    break;
                case 4:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar24 = (dncj) bZ2.b;
                    dncjVar24.k = 4;
                    dncjVar24.a |= 512;
                    break;
                case 5:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar25 = (dncj) bZ2.b;
                    dncjVar25.k = 5;
                    dncjVar25.a |= 512;
                    break;
                case 6:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar26 = (dncj) bZ2.b;
                    dncjVar26.k = 6;
                    dncjVar26.a |= 512;
                    break;
                case 7:
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dncj dncjVar27 = (dncj) bZ2.b;
                    dncjVar27.k = 7;
                    dncjVar27.a |= 512;
                    break;
            }
        }
        if ((exploreMapParametersWithoutLogging.a & 4194304) != 0) {
            int a8 = dkjv.a(exploreMapParametersWithoutLogging.w);
            if (a8 == 0) {
                a8 = 1;
            }
            int i7 = a8 - 1;
            if (i7 == 1) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar28 = (dncj) bZ2.b;
                dncjVar28.l = 1;
                dncjVar28.a |= 1024;
            } else if (i7 == 2) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dncj dncjVar29 = (dncj) bZ2.b;
                dncjVar29.l = 2;
                dncjVar29.a |= 1024;
            }
        }
        if ((exploreMapParametersWithoutLogging.a & 134217728) != 0) {
            dncd bZ3 = dncg.b.bZ();
            dkkl dkklVar = exploreMapParametersWithoutLogging.F;
            if (dkklVar == null) {
                dkklVar = dkkl.b;
            }
            for (dkkk dkkkVar : dkklVar.a) {
                dnce bZ4 = dncf.f.bZ();
                int i8 = dkkkVar.a;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dncf dncfVar = (dncf) bZ4.b;
                int i9 = dncfVar.a | 1;
                dncfVar.a = i9;
                dncfVar.b = i8;
                int i10 = dkkkVar.b;
                int i11 = i9 | 2;
                dncfVar.a = i11;
                dncfVar.c = i10;
                int i12 = dkkkVar.c;
                int i13 = i11 | 4;
                dncfVar.a = i13;
                dncfVar.d = i12;
                int i14 = dkkkVar.d;
                dncfVar.a = i13 | 8;
                dncfVar.e = i14;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dncg dncgVar = (dncg) bZ3.b;
                dncf bK = bZ4.bK();
                bK.getClass();
                dsrj<dncf> dsrjVar = dncgVar.a;
                if (!dsrjVar.a()) {
                    dncgVar.a = dsqw.cl(dsrjVar);
                }
                dncgVar.a.add(bK);
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar30 = (dncj) bZ2.b;
            dncg bK2 = bZ3.bK();
            bK2.getClass();
            dncjVar30.m = bK2;
            dncjVar30.a |= 2048;
        }
        if ((exploreMapParametersWithoutLogging.a & 268435456) != 0) {
            boolean z4 = exploreMapParametersWithoutLogging.G;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dncj dncjVar31 = (dncj) bZ2.b;
            dncjVar31.a |= 8192;
            dncjVar31.o = z4;
        }
        dncj bK3 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfpo dfpoVar2 = (dfpo) bZ.b;
        bK3.getClass();
        dfpoVar2.f = bK3;
        dfpoVar2.a |= 16;
        return bZ.bK();
    }
}
