package defpackage;

import com.google.geo.imagery.viewer.api.ConnectivityRequestContainer;
/* compiled from: PG */
/* renamed from: bwuk  reason: default package */
/* loaded from: classes4.dex */
final class bwuk implements btzi<dwge, dwgl> {
    private final ConnectivityRequestContainer a;

    public bwuk(ConnectivityRequestContainer connectivityRequestContainer) {
        this.a = connectivityRequestContainer;
    }

    private final void c() {
        this.a.b(dfsc.g);
    }

    private static dfsu d(dpuq dpuqVar) {
        dfsu bZ = dfsv.d.bZ();
        dhjy bZ2 = dhjz.e.bZ();
        dpum dpumVar = dpuqVar.b;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        double d = dpumVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ2.b;
        dhjzVar.a |= 2;
        dhjzVar.c = d;
        dpum dpumVar2 = dpuqVar.b;
        if (dpumVar2 == null) {
            dpumVar2 = dpum.d;
        }
        double d2 = dpumVar2.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ2.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = d2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsv dfsvVar = (dfsv) bZ.b;
        dhjz bK = bZ2.bK();
        bK.getClass();
        dfsvVar.b = bK;
        dfsvVar.a |= 1;
        dhjy bZ3 = dhjz.e.bZ();
        dpum dpumVar3 = dpuqVar.c;
        if (dpumVar3 == null) {
            dpumVar3 = dpum.d;
        }
        double d3 = dpumVar3.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhjz dhjzVar3 = (dhjz) bZ3.b;
        dhjzVar3.a |= 2;
        dhjzVar3.c = d3;
        dpum dpumVar4 = dpuqVar.c;
        if (dpumVar4 == null) {
            dpumVar4 = dpum.d;
        }
        double d4 = dpumVar4.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dhjz dhjzVar4 = (dhjz) bZ3.b;
        dhjzVar4.a |= 1;
        dhjzVar4.b = d4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsv dfsvVar2 = (dfsv) bZ.b;
        dhjz bK2 = bZ3.bK();
        bK2.getClass();
        dfsvVar2.c = bK2;
        dfsvVar2.a |= 2;
        return bZ;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwge> btzrVar, btzy btzyVar) {
        c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwge> btzrVar, dwgl dwglVar) {
        dwgl dwglVar2 = dwglVar;
        if ((dwglVar2.a & 4) == 0) {
            c();
            return;
        }
        dfsb bZ = dfsc.g.bZ();
        dizb dizbVar = dwglVar2.e;
        if (dizbVar == null) {
            dizbVar = dizb.f;
        }
        dpuq dpuqVar = dizbVar.c;
        if (dpuqVar == null) {
            dpuqVar = dpuq.d;
        }
        dfsu d = d(dpuqVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar = (dfsc) bZ.b;
        dfsv bK = d.bK();
        bK.getClass();
        dfscVar.d = bK;
        dfscVar.a |= 1;
        dizb dizbVar2 = dwglVar2.e;
        if (dizbVar2 == null) {
            dizbVar2 = dizb.f;
        }
        String str = dizbVar2.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar2 = (dfsc) bZ.b;
        str.getClass();
        dfscVar2.a |= 2;
        dfscVar2.e = str;
        dizb dizbVar3 = dwglVar2.e;
        if (dizbVar3 == null) {
            dizbVar3 = dizb.f;
        }
        int i = dizbVar3.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar3 = (dfsc) bZ.b;
        dfscVar3.a |= 4;
        dfscVar3.f = i;
        int i2 = 0;
        while (true) {
            dizb dizbVar4 = dwglVar2.e;
            if (dizbVar4 == null) {
                dizbVar4 = dizb.f;
            }
            if (i2 >= dizbVar4.b.size()) {
                break;
            }
            dfsj bZ2 = dfsk.d.bZ();
            dizb dizbVar5 = dwglVar2.e;
            if (dizbVar5 == null) {
                dizbVar5 = dizb.f;
            }
            dpuq dpuqVar2 = dizbVar5.b.get(i2).b;
            if (dpuqVar2 == null) {
                dpuqVar2 = dpuq.d;
            }
            dfsu d2 = d(dpuqVar2);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfsk dfskVar = (dfsk) bZ2.b;
            dfsv bK2 = d2.bK();
            bK2.getClass();
            dfskVar.c = bK2;
            dfskVar.a |= 2;
            dizb dizbVar6 = dwglVar2.e;
            if (dizbVar6 == null) {
                dizbVar6 = dizb.f;
            }
            String str2 = dizbVar6.b.get(i2).a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dfsk dfskVar2 = (dfsk) bZ2.b;
            str2.getClass();
            dfskVar2.a |= 1;
            dfskVar2.b = str2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfsc dfscVar4 = (dfsc) bZ.b;
            dfsk bK3 = bZ2.bK();
            bK3.getClass();
            dsrj<dfsk> dsrjVar = dfscVar4.c;
            if (!dsrjVar.a()) {
                dfscVar4.c = dsqw.cl(dsrjVar);
            }
            dfscVar4.c.add(bK3);
            i2++;
        }
        dizb dizbVar7 = dwglVar2.e;
        if (dizbVar7 == null) {
            dizbVar7 = dizb.f;
        }
        diyy diyyVar = dizbVar7.a;
        if (diyyVar == null) {
            diyyVar = diyy.b;
        }
        for (int i3 = 0; i3 < diyyVar.a.size(); i3++) {
            dlxk dlxkVar = diyyVar.a.get(i3).a;
            if (dlxkVar == null) {
                dlxkVar = dlxk.e;
            }
            dhjy bZ3 = dhjz.e.bZ();
            dlwi dlwiVar = dlxkVar.c;
            if (dlwiVar == null) {
                dlwiVar = dlwi.f;
            }
            dpum dpumVar = dlwiVar.b;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            double d3 = dpumVar.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ3.b;
            dhjzVar.a |= 2;
            dhjzVar.c = d3;
            dlwi dlwiVar2 = dlxkVar.c;
            if (dlwiVar2 == null) {
                dlwiVar2 = dlwi.f;
            }
            dpum dpumVar2 = dlwiVar2.b;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            double d4 = dpumVar2.c;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ3.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = d4;
            dlwi dlwiVar3 = dlxkVar.c;
            if (dlwiVar3 == null) {
                dlwiVar3 = dlwi.f;
            }
            dlwe dlweVar = dlwiVar3.c;
            if (dlweVar == null) {
                dlweVar = dlwe.c;
            }
            if ((dlweVar.a & 1) != 0) {
                dlwi dlwiVar4 = dlxkVar.c;
                if (dlwiVar4 == null) {
                    dlwiVar4 = dlwi.f;
                }
                dlwe dlweVar2 = dlwiVar4.c;
                if (dlweVar2 == null) {
                    dlweVar2 = dlwe.c;
                }
                double d5 = dlweVar2.b;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dhjz dhjzVar3 = (dhjz) bZ3.b;
                dhjzVar3.a |= 4;
                dhjzVar3.d = d5;
            }
            dftu bZ4 = dftv.e.bZ();
            dftc bZ5 = dftd.d.bZ();
            dggg dgggVar = dlxkVar.a;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            String str3 = dgggVar.c;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dftd dftdVar = (dftd) bZ5.b;
            str3.getClass();
            dftdVar.a |= 2;
            dftdVar.c = str3;
            dggg dgggVar2 = dlxkVar.a;
            if (dgggVar2 == null) {
                dgggVar2 = dggg.d;
            }
            dgge b = dgge.b(dgggVar2.b);
            if (b == null) {
                b = dgge.IMAGE_UNKNOWN;
            }
            int ordinal = b.ordinal();
            int i4 = 3;
            if (ordinal == 2) {
                i4 = 2;
            } else if (ordinal != 3) {
                i4 = ordinal != 8 ? ordinal != 10 ? 1 : 7 : 4;
            }
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dftd dftdVar2 = (dftd) bZ5.b;
            dftdVar2.b = i4 - 1;
            dftdVar2.a |= 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dftv dftvVar = (dftv) bZ4.b;
            dftd bK4 = bZ5.bK();
            bK4.getClass();
            dftvVar.b = bK4;
            dftvVar.a |= 1;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dftv dftvVar2 = (dftv) bZ4.b;
            dhjz bK5 = bZ3.bK();
            bK5.getClass();
            dftvVar2.c = bK5;
            dftvVar2.a |= 2;
            dsrf dsrfVar = diyyVar.a.get(i3).b;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dftv dftvVar3 = (dftv) bZ4.b;
            dsrf dsrfVar2 = dftvVar3.d;
            if (!dsrfVar2.a()) {
                dftvVar3.d = dsqw.cg(dsrfVar2);
            }
            dsod.bv(dsrfVar, dftvVar3.d);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dfsc dfscVar5 = (dfsc) bZ.b;
            dftv bK6 = bZ4.bK();
            bK6.getClass();
            dsrj<dftv> dsrjVar2 = dfscVar5.b;
            if (!dsrjVar2.a()) {
                dfscVar5.b = dsqw.cl(dsrjVar2);
            }
            dfscVar5.b.add(bK6);
        }
        dizb dizbVar8 = dwglVar2.e;
        if (dizbVar8 == null) {
            dizbVar8 = dizb.f;
        }
        dpuq dpuqVar3 = dizbVar8.c;
        if (dpuqVar3 == null) {
            dpuqVar3 = dpuq.d;
        }
        dfsu bZ6 = dfsv.d.bZ();
        dhjy bZ7 = dhjz.e.bZ();
        dpum dpumVar3 = dpuqVar3.b;
        if (dpumVar3 == null) {
            dpumVar3 = dpum.d;
        }
        double d6 = dpumVar3.b;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dhjz dhjzVar4 = (dhjz) bZ7.b;
        dhjzVar4.a |= 2;
        dhjzVar4.c = d6;
        dpum dpumVar4 = dpuqVar3.b;
        if (dpumVar4 == null) {
            dpumVar4 = dpum.d;
        }
        double d7 = dpumVar4.c;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dhjz dhjzVar5 = (dhjz) bZ7.b;
        dhjzVar5.a |= 1;
        dhjzVar5.b = d7;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dfsv dfsvVar = (dfsv) bZ6.b;
        dhjz bK7 = bZ7.bK();
        bK7.getClass();
        dfsvVar.b = bK7;
        dfsvVar.a |= 1;
        dhjy bZ8 = dhjz.e.bZ();
        dpum dpumVar5 = dpuqVar3.c;
        if (dpumVar5 == null) {
            dpumVar5 = dpum.d;
        }
        double d8 = dpumVar5.b;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dhjz dhjzVar6 = (dhjz) bZ8.b;
        dhjzVar6.a |= 2;
        dhjzVar6.c = d8;
        dpum dpumVar6 = dpuqVar3.c;
        if (dpumVar6 == null) {
            dpumVar6 = dpum.d;
        }
        double d9 = dpumVar6.c;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dhjz dhjzVar7 = (dhjz) bZ8.b;
        dhjzVar7.a |= 1;
        dhjzVar7.b = d9;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dfsv dfsvVar2 = (dfsv) bZ6.b;
        dhjz bK8 = bZ8.bK();
        bK8.getClass();
        dfsvVar2.c = bK8;
        dfsvVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar6 = (dfsc) bZ.b;
        dfsv bK9 = bZ6.bK();
        bK9.getClass();
        dfscVar6.d = bK9;
        dfscVar6.a |= 1;
        dizb dizbVar9 = dwglVar2.e;
        if (dizbVar9 == null) {
            dizbVar9 = dizb.f;
        }
        String str4 = dizbVar9.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar7 = (dfsc) bZ.b;
        str4.getClass();
        dfscVar7.a |= 2;
        dfscVar7.e = str4;
        dizb dizbVar10 = dwglVar2.e;
        if (dizbVar10 == null) {
            dizbVar10 = dizb.f;
        }
        int i5 = dizbVar10.e;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfsc dfscVar8 = (dfsc) bZ.b;
        dfscVar8.a = 4 | dfscVar8.a;
        dfscVar8.f = i5;
        this.a.b(bZ.bK());
    }
}
