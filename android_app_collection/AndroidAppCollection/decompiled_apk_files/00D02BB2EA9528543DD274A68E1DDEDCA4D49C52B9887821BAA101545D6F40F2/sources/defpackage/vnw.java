package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: vnw  reason: default package */
/* loaded from: classes7.dex */
public final class vnw {
    private static final dcqe a = dcqe.c("vnw");

    public static dwaw a(vun vunVar, @dzsi dwbm dwbmVar, @dzsi List<dvxj> list, @dzsi List<Integer> list2, @dzsi dwaq dwaqVar) {
        return b(vunVar, dwbmVar, list, list2, dwaqVar, null, dcdc.e(), false);
    }

    public static dwaw b(vun vunVar, @dzsi dwbm dwbmVar, @dzsi List<dvxj> list, @dzsi List<Integer> list2, @dzsi dwaq dwaqVar, @dzsi dnwb dnwbVar, List<dwac> list3, boolean z) {
        boolean z2;
        dwal ca = dwao.R.ca(vunVar.b);
        List<Integer> e = list2 == null ? dcdc.e() : list2;
        boolean z3 = false;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        ((dwao) ca.b).r = dwao.cf();
        ca.a(e);
        dvzv dvzvVar = (dvzv) dvzy.u.bZ();
        dpaz dpazVar = vunVar.u;
        if (dpazVar == null) {
            dpazVar = dpaz.TURN_BY_TURN;
        }
        if (dvzvVar.c) {
            dvzvVar.bF();
            dvzvVar.c = false;
        }
        dvzy dvzyVar = (dvzy) dvzvVar.b;
        dvzyVar.f = dpazVar.f;
        dvzyVar.a |= 2;
        dwao bK = ca.bK();
        if (dvzvVar.c) {
            dvzvVar.bF();
            dvzvVar.c = false;
        }
        dvzy dvzyVar2 = (dvzy) dvzvVar.b;
        bK.getClass();
        dvzyVar2.g = bK;
        dvzyVar2.a |= 4;
        dcdc<amvh> dcdcVar = vunVar.l;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            dvzvVar.a(dcdcVar.get(i).I());
        }
        dcdc<amvf> dcdcVar2 = vunVar.m;
        int size2 = dcdcVar2.size();
        int i2 = 0;
        while (i2 < size2) {
            amvf amvfVar = dcdcVar2.get(i2);
            dpjc bZ = dpjd.d.bZ();
            int b = amvfVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = z3;
            }
            dpjd dpjdVar = (dpjd) bZ.b;
            dpjdVar.a |= 1;
            dpjdVar.b = b;
            dnog bZ2 = dnoh.d.bZ();
            double d = amvfVar.a().a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = z3;
            }
            dnoh dnohVar = (dnoh) bZ2.b;
            dnohVar.a |= 1;
            dnohVar.b = d;
            double d2 = amvfVar.a().b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnoh dnohVar2 = (dnoh) bZ2.b;
            dnohVar2.a |= 2;
            dnohVar2.c = d2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpjd dpjdVar2 = (dpjd) bZ.b;
            dnoh bK2 = bZ2.bK();
            bK2.getClass();
            dpjdVar2.c = bK2;
            dpjdVar2.a |= 2;
            dpjd bK3 = bZ.bK();
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar3 = (dvzy) dvzvVar.b;
            bK3.getClass();
            dsrj<dpjd> dsrjVar = dvzyVar3.i;
            if (!dsrjVar.a()) {
                dvzyVar3.i = dsqw.cl(dsrjVar);
            }
            dvzyVar3.i.add(bK3);
            i2++;
            z3 = false;
        }
        dhjx dhjxVar = vunVar.n;
        if (dhjxVar != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar4 = (dvzy) dvzvVar.b;
            dhjxVar.getClass();
            dvzyVar4.e = dhjxVar;
            dvzyVar4.a |= 1;
        }
        dowa dowaVar = vunVar.d;
        if (dowaVar != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar5 = (dvzy) dvzvVar.b;
            dvzyVar5.h = dowaVar.e;
            dvzyVar5.a |= 16;
        }
        String str = vunVar.e;
        if (str != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar6 = (dvzy) dvzvVar.b;
            str.getClass();
            dvzyVar6.b = 13;
            dvzyVar6.c = str;
        }
        dspd dspdVar = vunVar.f;
        if (dspdVar != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar7 = (dvzy) dvzvVar.b;
            dspdVar.getClass();
            dvzyVar7.b = 26;
            dvzyVar7.c = dspdVar;
        }
        dvzx dvzxVar = vunVar.g;
        if (dvzxVar != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar8 = (dvzy) dvzvVar.b;
            dvzyVar8.c = Integer.valueOf(dvzxVar.c);
            dvzyVar8.b = 28;
        }
        dquz dquzVar = vunVar.h;
        if (dquzVar != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar9 = (dvzy) dvzvVar.b;
            dvzyVar9.j = dquzVar.d;
            dvzyVar9.a |= 256;
        }
        String str2 = vunVar.i;
        if (str2 != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar10 = (dvzy) dvzvVar.b;
            str2.getClass();
            dvzyVar10.a |= 512;
            dvzyVar10.k = str2;
        }
        dspd dspdVar2 = vunVar.j;
        if (dspdVar2 != null) {
            if (dvzvVar.c) {
                dvzvVar.bF();
                dvzvVar.c = false;
            }
            dvzy dvzyVar11 = (dvzy) dvzvVar.b;
            dspdVar2.getClass();
            dvzyVar11.a |= 1024;
            dvzyVar11.l = dspdVar2;
        }
        boolean z4 = vunVar.k;
        if (dvzvVar.c) {
            dvzvVar.bF();
            dvzvVar.c = false;
        }
        dvzy dvzyVar12 = (dvzy) dvzvVar.b;
        int i3 = dvzyVar12.a | 2048;
        dvzyVar12.a = i3;
        dvzyVar12.m = z4;
        boolean z5 = vunVar.q;
        int i4 = i3 | 262144;
        dvzyVar12.a = i4;
        dvzyVar12.s = z5;
        if (!vunVar.s) {
            dvzyVar12.a = i4 | 16384;
            dvzyVar12.q = true;
            dvzy dvzyVar13 = (dvzy) dvzvVar.b;
            dvzyVar13.a |= 4096;
            dvzyVar13.n = true;
        }
        if (dwbmVar != null) {
            dvzy dvzyVar14 = (dvzy) dvzvVar.b;
            dwbmVar.getClass();
            dvzyVar14.r = dwbmVar;
            dvzyVar14.a |= 131072;
        }
        dnqh dnqhVar = vunVar.p;
        if (dnqhVar != null) {
            dvzy dvzyVar15 = (dvzy) dvzvVar.b;
            dnqhVar.getClass();
            dvzyVar15.o = dnqhVar;
            dvzyVar15.a |= 8192;
        }
        if (dnwbVar != null) {
            dvzy dvzyVar16 = (dvzy) dvzvVar.b;
            dnwbVar.getClass();
            dvzyVar16.t = dnwbVar;
            dvzyVar16.a |= ImageMetadata.SHADING_MODE;
        }
        dvzy dvzyVar17 = (dvzy) dvzvVar.b;
        dsrj<dwac> dsrjVar2 = dvzyVar17.p;
        if (!dsrjVar2.a()) {
            dvzyVar17.p = dsqw.cl(dsrjVar2);
        }
        dsod.bv(list3, dvzyVar17.p);
        dwat dwatVar = (dwat) dwaw.j.bZ();
        if (dwatVar.c) {
            dwatVar.bF();
            dwatVar.c = false;
        }
        dwaw dwawVar = (dwaw) dwatVar.b;
        dvzy dvzyVar18 = (dvzy) dvzvVar.bK();
        dvzyVar18.getClass();
        dwawVar.b = dvzyVar18;
        dwawVar.a |= 1;
        if (dwatVar.c) {
            dwatVar.bF();
            z2 = false;
            dwatVar.c = false;
        } else {
            z2 = false;
        }
        dwaw.c((dwaw) dwatVar.b);
        if (list != null) {
            if (dwatVar.c) {
                dwatVar.bF();
                dwatVar.c = z2;
            }
            dwaw dwawVar2 = (dwaw) dwatVar.b;
            dsrf dsrfVar = dwawVar2.c;
            if (!dsrfVar.a()) {
                dwawVar2.c = dsqw.cg(dsrfVar);
            }
            for (dvxj dvxjVar : list) {
                dwawVar2.c.h(dvxjVar.u);
            }
        }
        dtaq dtaqVar = vunVar.o;
        if (dtaqVar != null) {
            if (dwatVar.c) {
                dwatVar.bF();
                dwatVar.c = false;
            }
            dwaw dwawVar3 = (dwaw) dwatVar.b;
            dtaqVar.getClass();
            dwawVar3.e = dtaqVar;
            dwawVar3.a |= 2;
        }
        if (dwatVar.c) {
            dwatVar.bF();
            dwatVar.c = false;
        }
        dwaw dwawVar4 = (dwaw) dwatVar.b;
        dwawVar4.a |= 4;
        dwawVar4.f = true;
        dqvj a2 = vunVar.a();
        if (a2 == dqvj.WALK || a2 == dqvj.BICYCLE) {
            dwatVar.a(dwav.TRIP);
        } else if (a2 == dqvj.TRANSIT) {
            dwatVar.a(dwav.STEP_GROUP);
            dwbk dwbkVar = vunVar.b.f;
            if (dwbkVar == null) {
                dwbkVar = dwbk.s;
            }
            if (!dwbkVar.p) {
                bvoo.h("TransitSummary deprecated fields not suppressed.", new Object[0]);
            }
        }
        if (dwaqVar != null) {
            if (dwatVar.c) {
                dwatVar.bF();
                dwatVar.c = false;
            }
            dwaw dwawVar5 = (dwaw) dwatVar.b;
            dwaqVar.getClass();
            dwawVar5.h = dwaqVar;
            dwawVar5.a |= 64;
        }
        if (z) {
            if (dwatVar.c) {
                dwatVar.bF();
                dwatVar.c = false;
            }
            dwaw dwawVar6 = (dwaw) dwatVar.b;
            dwawVar6.a |= 128;
            dwawVar6.i = true;
        }
        return (dwaw) dwatVar.bK();
    }
}
