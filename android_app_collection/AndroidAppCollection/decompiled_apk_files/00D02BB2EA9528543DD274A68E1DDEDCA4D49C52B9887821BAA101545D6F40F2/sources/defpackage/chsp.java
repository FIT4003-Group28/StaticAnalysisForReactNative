package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: chsp  reason: default package */
/* loaded from: classes4.dex */
public final class chsp {
    public static final dcqe a = dcqe.c("chsp");
    public static final Comparator<chxg> b = chso.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static chxr a(String str, dbsg<String> dbsgVar) {
        chxq bZ = chxr.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chxr chxrVar = (chxr) bZ.b;
        str.getClass();
        chxrVar.b = 1;
        chxrVar.c = str;
        if (dbsgVar.a()) {
            String b2 = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxr chxrVar2 = (chxr) bZ.b;
            b2.getClass();
            chxrVar2.a |= 8;
            chxrVar2.d = b2;
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static chxr b(String str) {
        chxq bZ = chxr.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        chxr chxrVar = (chxr) bZ.b;
        str.getClass();
        chxrVar.b = 3;
        chxrVar.c = str;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdc<chxl> c(dwmt dwmtVar, btvo btvoVar) {
        dccx dccxVar = new dccx();
        dwla dwlaVar = dwmtVar.b;
        if (dwlaVar == null) {
            dwlaVar = dwla.m;
        }
        for (dwmk dwmkVar : dwlaVar.b) {
            dccxVar.g(d(dwmkVar, btvoVar));
        }
        return dccxVar.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static chxl d(dwmk dwmkVar, final btvo btvoVar) {
        Iterable e;
        boolean z;
        chvz chvzVar;
        if ((dwmkVar.a & 4) != 0) {
            chvzVar = chxl.x.bZ();
            dpot dpotVar = dwmkVar.d;
            if (dpotVar == null) {
                dpotVar = dpot.m;
            }
            dpov dpovVar = dpotVar.b;
            if (dpovVar == null) {
                dpovVar = dpov.f;
            }
            chxr b2 = b(dpovVar.b);
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar = (chxl) chvzVar.b;
            b2.getClass();
            chxlVar.b = b2;
            chxlVar.a |= 1;
            dpot dpotVar2 = dwmkVar.d;
            if (dpotVar2 == null) {
                dpotVar2 = dpot.m;
            }
            if (chvzVar.c) {
                chvzVar.bF();
                chvzVar.c = false;
            }
            chxl chxlVar2 = (chxl) chvzVar.b;
            dpotVar2.getClass();
            chxlVar2.e = dpotVar2;
            chxlVar2.a |= 8;
        } else {
            dwlh dwlhVar = dwmkVar.c;
            if (dwlhVar == null) {
                dwlhVar = dwlh.n;
            }
            chvz bZ = chxl.x.bZ();
            dniu dniuVar = dwlhVar.b;
            if (dniuVar == null) {
                dniuVar = dniu.i;
            }
            chxr a2 = a(dniuVar.b, dbpy.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxl chxlVar3 = (chxl) bZ.b;
            a2.getClass();
            chxlVar3.b = a2;
            int i = chxlVar3.a | 1;
            chxlVar3.a = i;
            dwlhVar.getClass();
            chxlVar3.d = dwlhVar;
            chxlVar3.a = i | 4;
            if (dwmkVar.m.size() > 0) {
                e = dwmkVar.m;
            } else if ((dwmkVar.a & 512) != 0) {
                dosf dosfVar = dwmkVar.l;
                if (dosfVar == null) {
                    dosfVar = dosf.f;
                }
                e = dcdc.f(dosfVar);
            } else {
                e = dcdc.e();
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxl chxlVar4 = (chxl) bZ.b;
            chxlVar4.b();
            dsod.bv(e, chxlVar4.g);
            int i2 = dwmkVar.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxl chxlVar5 = (chxl) bZ.b;
            int i3 = chxlVar5.a | 256;
            chxlVar5.a = i3;
            chxlVar5.k = i2;
            boolean z2 = dwmkVar.h;
            int i4 = i3 | 512;
            chxlVar5.a = i4;
            chxlVar5.l = z2;
            String str = dwmkVar.i;
            str.getClass();
            int i5 = i4 | 1024;
            chxlVar5.a = i5;
            chxlVar5.m = str;
            String str2 = dwmkVar.n;
            str2.getClass();
            chxlVar5.a = i5 | 2048;
            chxlVar5.n = str2;
            dsrj<dwfl> dsrjVar = dwmkVar.p;
            chxl chxlVar6 = (chxl) bZ.b;
            dsrj<dwfl> dsrjVar2 = chxlVar6.o;
            if (!dsrjVar2.a()) {
                chxlVar6.o = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, chxlVar6.o);
            chxm bZ2 = chxp.k.bZ();
            Iterator<dwmj> it = dwmkVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dwmj next = it.next();
                if (next.b == 7) {
                    if (((dwmg) next.c).a.size() == 1) {
                        z = true;
                    }
                }
            }
            z = false;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            chxp chxpVar = (chxp) bZ2.b;
            chxpVar.a |= 8;
            chxpVar.g = z;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxl chxlVar7 = (chxl) bZ.b;
            chxp bK = bZ2.bK();
            bK.getClass();
            chxlVar7.i = bK;
            chxlVar7.a |= 64;
            boolean z3 = dwmkVar.q;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            chxl chxlVar8 = (chxl) bZ.b;
            chxlVar8.a |= 32;
            chxlVar8.h = z3;
            if ((dwmkVar.a & 128) != 0) {
                dqwy dqwyVar = dwmkVar.j;
                if (dqwyVar == null) {
                    dqwyVar = dqwy.c;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chxl chxlVar9 = (chxl) bZ.b;
                dqwyVar.getClass();
                chxlVar9.s = dqwyVar;
                chxlVar9.a |= 8192;
            }
            if ((dwmkVar.a & 256) != 0) {
                dqwy dqwyVar2 = dwmkVar.k;
                if (dqwyVar2 == null) {
                    dqwyVar2 = dqwy.c;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                chxl chxlVar10 = (chxl) bZ.b;
                dqwyVar2.getClass();
                chxlVar10.t = dqwyVar2;
                chxlVar10.a |= 16384;
            }
            chvzVar = bZ;
        }
        if (chvzVar.c) {
            chvzVar.bF();
            chvzVar.c = false;
        }
        chxl chxlVar11 = (chxl) chvzVar.b;
        chxlVar11.a |= 32768;
        chxlVar11.v = true;
        String str3 = dwmkVar.b;
        chxl chxlVar12 = (chxl) chvzVar.b;
        str3.getClass();
        int i6 = chxlVar12.a | 2;
        chxlVar12.a = i6;
        chxlVar12.c = str3;
        String str4 = dwmkVar.o;
        str4.getClass();
        chxlVar12.a = i6 | 16;
        chxlVar12.f = str4;
        chvzVar.b(dcbg.b(dwmkVar.e).t(new dbrn(btvoVar) { // from class: chsi
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final btvo btvoVar2 = this.a;
                dwmj dwmjVar = (dwmj) obj;
                chxi bZ3 = chxk.g.bZ();
                dwku dwkuVar = dwku.UNKNOWN_COMPONENT;
                int i7 = dwmjVar.b;
                int i8 = 6;
                if (i7 == 0) {
                    i8 = 15;
                } else if (i7 == 21) {
                    i8 = 14;
                } else if (i7 == 4) {
                    i8 = 1;
                } else if (i7 == 5) {
                    i8 = 2;
                } else if (i7 == 6) {
                    i8 = 3;
                } else if (i7 == 7) {
                    i8 = 4;
                } else if (i7 == 17) {
                    i8 = 12;
                } else if (i7 != 18) {
                    switch (i7) {
                        case 9:
                            i8 = 5;
                            break;
                        case 10:
                            i8 = 10;
                            break;
                        case 11:
                            break;
                        case 12:
                            i8 = 7;
                            break;
                        case 13:
                            i8 = 9;
                            break;
                        case 14:
                            i8 = 8;
                            break;
                        case 15:
                            i8 = 11;
                            break;
                        default:
                            i8 = 0;
                            break;
                    }
                } else {
                    i8 = 13;
                }
                int i9 = i8 - 1;
                if (i8 != 0) {
                    switch (i9) {
                        case 0:
                            chwr chwrVar = chwr.a;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar = (chxk) bZ3.b;
                            chwrVar.getClass();
                            chxkVar.c = chwrVar;
                            chxkVar.b = 1;
                            break;
                        case 1:
                            chwv chwvVar = chwv.a;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar2 = (chxk) bZ3.b;
                            chwvVar.getClass();
                            chxkVar2.c = chwvVar;
                            chxkVar2.b = 2;
                            break;
                        case 2:
                            chwd chwdVar = chwd.a;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar3 = (chxk) bZ3.b;
                            chwdVar.getClass();
                            chxkVar3.c = chwdVar;
                            chxkVar3.b = 4;
                            break;
                        case 3:
                            chww bZ4 = chxh.b.bZ();
                            bZ4.a(dcbg.b((dwmjVar.b == 7 ? (dwmg) dwmjVar.c : dwmg.b).a).s(new dbrn(btvoVar2) { // from class: chsm
                                private final btvo a;

                                {
                                    this.a = btvoVar2;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj2) {
                                    btvo btvoVar3 = this.a;
                                    dwmf dwmfVar = (dwmf) obj2;
                                    chwx bZ5 = chxg.e.bZ();
                                    dwfl dwflVar = dwmfVar.a;
                                    if (dwflVar == null) {
                                        dwflVar = dwfl.w;
                                    }
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    chxg chxgVar = (chxg) bZ5.b;
                                    dwflVar.getClass();
                                    chxgVar.b = dwflVar;
                                    chxgVar.a |= 1;
                                    dgfb b3 = dgfb.b(dwmfVar.b);
                                    if (b3 == null) {
                                        b3 = dgfb.UNKNOWN_OFFERING_TYPE;
                                    }
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    chxg chxgVar2 = (chxg) bZ5.b;
                                    chxgVar2.c = b3.f;
                                    chxgVar2.a |= 2;
                                    chwy bZ6 = chxf.e.bZ();
                                    dpno dpnoVar = dwmfVar.c;
                                    if (dpnoVar == null) {
                                        dpnoVar = dpno.b;
                                    }
                                    dcbg s = dcbg.b(dpnoVar.a).s(chsn.a);
                                    if (bZ6.c) {
                                        bZ6.bF();
                                        bZ6.c = false;
                                    }
                                    chxf chxfVar = (chxf) bZ6.b;
                                    dsrj<chxe> dsrjVar3 = chxfVar.b;
                                    if (!dsrjVar3.a()) {
                                        chxfVar.b = dsqw.cl(dsrjVar3);
                                    }
                                    dsod.bv(s, chxfVar.b);
                                    Collections.unmodifiableList(((chxf) bZ6.b).b);
                                    dhpt dhptVar = btvoVar3.getContributionsPageParameters().h;
                                    if (dhptVar == null) {
                                        dhptVar = dhpt.w;
                                    }
                                    boolean z4 = dhptVar.h;
                                    chxf bK2 = bZ6.bK();
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    chxg chxgVar3 = (chxg) bZ5.b;
                                    bK2.getClass();
                                    chxgVar3.d = bK2;
                                    chxgVar3.a |= 8;
                                    return bZ5.bK();
                                }
                            }).A(chsp.b));
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar4 = (chxk) bZ3.b;
                            chxh bK2 = bZ4.bK();
                            bK2.getClass();
                            chxkVar4.c = bK2;
                            chxkVar4.b = 5;
                            break;
                        case 4:
                            chwo bZ5 = chwp.c.bZ();
                            dpvc dpvcVar = (dwmjVar.b == 9 ? (dwly) dwmjVar.c : dwly.b).a;
                            if (dpvcVar == null) {
                                dpvcVar = dpvc.c;
                            }
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            chwp chwpVar = (chwp) bZ5.b;
                            dpvcVar.getClass();
                            chwpVar.b = dpvcVar;
                            chwpVar.a |= 1;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar5 = (chxk) bZ3.b;
                            chwp bK3 = bZ5.bK();
                            bK3.getClass();
                            chxkVar5.c = bK3;
                            chxkVar5.b = 7;
                            break;
                        case 5:
                            chvp bZ6 = chvq.d.bZ();
                            dpvc dpvcVar2 = (dwmjVar.b == 11 ? (dwlj) dwmjVar.c : dwlj.c).b;
                            if (dpvcVar2 == null) {
                                dpvcVar2 = dpvc.c;
                            }
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            chvq chvqVar = (chvq) bZ6.b;
                            dpvcVar2.getClass();
                            chvqVar.c = dpvcVar2;
                            chvqVar.a |= 2;
                            String str5 = (dwmjVar.b == 11 ? (dwlj) dwmjVar.c : dwlj.c).a;
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            chvq chvqVar2 = (chvq) bZ6.b;
                            str5.getClass();
                            chvqVar2.a |= 1;
                            chvqVar2.b = str5;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar6 = (chxk) bZ3.b;
                            chvq bK4 = bZ6.bK();
                            bK4.getClass();
                            chxkVar6.c = bK4;
                            chxkVar6.b = 10;
                            break;
                        case 6:
                            chvr bZ7 = chvs.f.bZ();
                            dpvc dpvcVar3 = (dwmjVar.b == 12 ? (dwll) dwmjVar.c : dwll.e).d;
                            if (dpvcVar3 == null) {
                                dpvcVar3 = dpvc.c;
                            }
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            chvs chvsVar = (chvs) bZ7.b;
                            dpvcVar3.getClass();
                            chvsVar.e = dpvcVar3;
                            chvsVar.a |= 8;
                            dppt dpptVar = (dwmjVar.b == 12 ? (dwll) dwmjVar.c : dwll.e).a;
                            if (dpptVar == null) {
                                dpptVar = dppt.e;
                            }
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            chvs chvsVar2 = (chvs) bZ7.b;
                            dpptVar.getClass();
                            chvsVar2.b = dpptVar;
                            chvsVar2.a |= 1;
                            drdg drdgVar = (dwmjVar.b == 12 ? (dwll) dwmjVar.c : dwll.e).c;
                            if (drdgVar == null) {
                                drdgVar = drdg.q;
                            }
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            chvs chvsVar3 = (chvs) bZ7.b;
                            drdgVar.getClass();
                            chvsVar3.d = drdgVar;
                            chvsVar3.a |= 4;
                            String str6 = (dwmjVar.b == 12 ? (dwll) dwmjVar.c : dwll.e).b;
                            if (bZ7.c) {
                                bZ7.bF();
                                bZ7.c = false;
                            }
                            chvs chvsVar4 = (chvs) bZ7.b;
                            str6.getClass();
                            chvsVar4.a |= 2;
                            chvsVar4.c = str6;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar7 = (chxk) bZ3.b;
                            chvs bK5 = bZ7.bK();
                            bK5.getClass();
                            chxkVar7.c = bK5;
                            chxkVar7.b = 11;
                            break;
                        case 7:
                            chvt bZ8 = chvu.e.bZ();
                            dpvc dpvcVar4 = (dwmjVar.b == 14 ? (dwln) dwmjVar.c : dwln.d).c;
                            if (dpvcVar4 == null) {
                                dpvcVar4 = dpvc.c;
                            }
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            chvu chvuVar = (chvu) bZ8.b;
                            dpvcVar4.getClass();
                            chvuVar.d = dpvcVar4;
                            chvuVar.a |= 4;
                            dppt dpptVar2 = (dwmjVar.b == 14 ? (dwln) dwmjVar.c : dwln.d).a;
                            if (dpptVar2 == null) {
                                dpptVar2 = dppt.e;
                            }
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            chvu chvuVar2 = (chvu) bZ8.b;
                            dpptVar2.getClass();
                            chvuVar2.b = dpptVar2;
                            chvuVar2.a |= 1;
                            drdg drdgVar2 = (dwmjVar.b == 14 ? (dwln) dwmjVar.c : dwln.d).b;
                            if (drdgVar2 == null) {
                                drdgVar2 = drdg.q;
                            }
                            if (bZ8.c) {
                                bZ8.bF();
                                bZ8.c = false;
                            }
                            chvu chvuVar3 = (chvu) bZ8.b;
                            drdgVar2.getClass();
                            chvuVar3.c = drdgVar2;
                            chvuVar3.a |= 2;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar8 = (chxk) bZ3.b;
                            chvu bK6 = bZ8.bK();
                            bK6.getClass();
                            chxkVar8.c = bK6;
                            chxkVar8.b = 13;
                            break;
                        case 8:
                            chvv bZ9 = chvw.d.bZ();
                            dpvc dpvcVar5 = (dwmjVar.b == 13 ? (dwlp) dwmjVar.c : dwlp.c).b;
                            if (dpvcVar5 == null) {
                                dpvcVar5 = dpvc.c;
                            }
                            if (bZ9.c) {
                                bZ9.bF();
                                bZ9.c = false;
                            }
                            chvw chvwVar = (chvw) bZ9.b;
                            dpvcVar5.getClass();
                            chvwVar.c = dpvcVar5;
                            chvwVar.a |= 1;
                            dsrj<dppl> dsrjVar3 = (dwmjVar.b == 13 ? (dwlp) dwmjVar.c : dwlp.c).a;
                            if (bZ9.c) {
                                bZ9.bF();
                                bZ9.c = false;
                            }
                            chvw chvwVar2 = (chvw) bZ9.b;
                            dsrj<dppl> dsrjVar4 = chvwVar2.b;
                            if (!dsrjVar4.a()) {
                                chvwVar2.b = dsqw.cl(dsrjVar4);
                            }
                            dsod.bv(dsrjVar3, chvwVar2.b);
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar9 = (chxk) bZ3.b;
                            chvw bK7 = bZ9.bK();
                            bK7.getClass();
                            chxkVar9.c = bK7;
                            chxkVar9.b = 12;
                            break;
                        case 9:
                            chvx bZ10 = chvy.b.bZ();
                            djai djaiVar = (dwmjVar.b == 10 ? (dwlr) dwmjVar.c : dwlr.b).a;
                            if (djaiVar == null) {
                                djaiVar = djai.g;
                            }
                            bZ10.a(djaiVar.b);
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar10 = (chxk) bZ3.b;
                            chvy bK8 = bZ10.bK();
                            bK8.getClass();
                            chxkVar10.c = bK8;
                            chxkVar10.b = 9;
                            break;
                        case 10:
                            chwm bZ11 = chwn.c.bZ();
                            dqde dqdeVar = dwmjVar.b == 15 ? (dqde) dwmjVar.c : dqde.a;
                            if (bZ11.c) {
                                bZ11.bF();
                                bZ11.c = false;
                            }
                            chwn chwnVar = (chwn) bZ11.b;
                            dqdeVar.getClass();
                            chwnVar.b = dqdeVar;
                            chwnVar.a |= 1;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar11 = (chxk) bZ3.b;
                            chwn bK9 = bZ11.bK();
                            bK9.getClass();
                            chxkVar11.c = bK9;
                            chxkVar11.b = 14;
                            break;
                        case 11:
                            chws bZ12 = chwt.c.bZ();
                            dqgp dqgpVar = dwmjVar.b == 17 ? (dqgp) dwmjVar.c : dqgp.b;
                            if (bZ12.c) {
                                bZ12.bF();
                                bZ12.c = false;
                            }
                            chwt chwtVar = (chwt) bZ12.b;
                            dqgpVar.getClass();
                            chwtVar.b = dqgpVar;
                            chwtVar.a |= 1;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar12 = (chxk) bZ3.b;
                            chwt bK10 = bZ12.bK();
                            bK10.getClass();
                            chxkVar12.c = bK10;
                            chxkVar12.b = 16;
                            break;
                        case 12:
                            if ((dwmjVar.a & 32768) != 0) {
                                String str7 = dwmjVar.e;
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                chxk chxkVar13 = (chxk) bZ3.b;
                                str7.getClass();
                                chxkVar13.a |= 131072;
                                chxkVar13.e = str7;
                            }
                            if ((dwmjVar.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                                String str8 = dwmjVar.f;
                                if (bZ3.c) {
                                    bZ3.bF();
                                    bZ3.c = false;
                                }
                                chxk chxkVar14 = (chxk) bZ3.b;
                                str8.getClass();
                                chxkVar14.a |= 262144;
                                chxkVar14.f = str8;
                            }
                            chwk bZ13 = chwl.c.bZ();
                            dspd dspdVar = (dwmjVar.b == 18 ? (dwlw) dwmjVar.c : dwlw.b).a;
                            if (bZ13.c) {
                                bZ13.bF();
                                bZ13.c = false;
                            }
                            chwl chwlVar = (chwl) bZ13.b;
                            dspdVar.getClass();
                            chwlVar.a |= 1;
                            chwlVar.b = dspdVar;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar15 = (chxk) bZ3.b;
                            chwl bK11 = bZ13.bK();
                            bK11.getClass();
                            chxkVar15.c = bK11;
                            chxkVar15.b = 17;
                            break;
                        case 13:
                            chwe bZ14 = chwf.c.bZ();
                            dnjp dnjpVar = dwmjVar.b == 21 ? (dnjp) dwmjVar.c : dnjp.b;
                            if (bZ14.c) {
                                bZ14.bF();
                                bZ14.c = false;
                            }
                            chwf chwfVar = (chwf) bZ14.b;
                            dnjpVar.getClass();
                            chwfVar.b = dnjpVar;
                            chwfVar.a |= 1;
                            if (bZ3.c) {
                                bZ3.bF();
                                bZ3.c = false;
                            }
                            chxk chxkVar16 = (chxk) bZ3.b;
                            chwf bK12 = bZ14.bK();
                            bK12.getClass();
                            chxkVar16.c = bK12;
                            chxkVar16.b = 20;
                            break;
                        default:
                            return dcdc.e();
                    }
                    int a3 = dwlu.a(dwmjVar.d);
                    if (a3 != 0 && a3 == 2) {
                        if (bZ3.c) {
                            bZ3.bF();
                            bZ3.c = false;
                        }
                        chxk chxkVar17 = (chxk) bZ3.b;
                        chxkVar17.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        chxkVar17.d = true;
                    }
                    return dcdc.f(bZ3.bK());
                }
                throw null;
            }
        }));
        return chvzVar.bK();
    }

    public static dwlh e(dvyw dvywVar) {
        dhjz dhjzVar = dvywVar.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        akqq j = akqq.j(dhjzVar);
        dwlc bZ = dwlh.n.bZ();
        String str = dvywVar.i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwlh dwlhVar = (dwlh) bZ.b;
        str.getClass();
        dwlhVar.a |= 2;
        dwlhVar.c = str;
        dpum h = j.h();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwlh dwlhVar2 = (dwlh) bZ.b;
        h.getClass();
        dwlhVar2.d = h;
        dwlhVar2.a |= 8;
        dnip bZ2 = dniu.i.bZ();
        String str2 = dvywVar.g;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniu dniuVar = (dniu) bZ2.b;
        str2.getClass();
        dniuVar.a |= 1;
        dniuVar.b = str2;
        dnoh g = j.g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniu dniuVar2 = (dniu) bZ2.b;
        g.getClass();
        dniuVar2.g = g;
        dniuVar2.a |= 64;
        dhjx dhjxVar = dvywVar.Q;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dniu dniuVar3 = (dniu) bZ2.b;
        dhjxVar.getClass();
        dniuVar3.e = dhjxVar;
        dniuVar3.a |= 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwlh dwlhVar3 = (dwlh) bZ.b;
        dniu bK = bZ2.bK();
        bK.getClass();
        dwlhVar3.b = bK;
        dwlhVar3.a |= 1;
        if (dvywVar.I.size() > 0) {
            dsrj<dwfl> dsrjVar = dvywVar.I;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwlh dwlhVar4 = (dwlh) bZ.b;
            dsrj<dwfl> dsrjVar2 = dwlhVar4.i;
            if (!dsrjVar2.a()) {
                dwlhVar4.i = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, dwlhVar4.i);
        }
        if (dvywVar.A.size() > 0) {
            dwld bZ3 = dwle.d.bZ();
            String str3 = dvywVar.A.get(0);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwle dwleVar = (dwle) bZ3.b;
            str3.getClass();
            dwleVar.a |= 1;
            dwleVar.b = str3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwlh dwlhVar5 = (dwlh) bZ.b;
            dwle bK2 = bZ3.bK();
            bK2.getClass();
            dwlhVar5.e = bK2;
            dwlhVar5.a |= 16;
        }
        return bZ.bK();
    }

    public static boolean f(chxk chxkVar) {
        return chxj.a(chxkVar.b).equals(chxj.FACTUAL_MODERATION_TASK);
    }
}
