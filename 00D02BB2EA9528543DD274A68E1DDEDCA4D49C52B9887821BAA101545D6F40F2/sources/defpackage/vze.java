package defpackage;

import android.content.Context;
import android.location.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: PG */
/* renamed from: vze  reason: default package */
/* loaded from: classes7.dex */
public final class vze {
    @dzsi
    public static amte a(@dzsi vvy vvyVar, Context context) {
        return b(vvyVar, context, null);
    }

    @dzsi
    public static amte b(@dzsi vvy vvyVar, Context context, @dzsi vzd vzdVar) {
        dwbc dwbcVar = vvyVar.c;
        if (dwbcVar == null) {
            dwbcVar = dwbc.g;
        }
        amsy amsyVar = new amsy(dwbcVar, vvyVar.i);
        dwaw dwawVar = vvyVar.b;
        if (dwawVar == null) {
            dwawVar = dwaw.j;
        }
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        dsrj<dpjx> dsrjVar = dvzyVar.d;
        if (dsrjVar.size() < 2) {
            return null;
        }
        amtd amtdVar = new amtd();
        amtdVar.a = amsyVar;
        dwao dwaoVar = dvzyVar.g;
        if (dwaoVar == null) {
            dwaoVar = dwao.R;
        }
        dphq dphqVar = dwaoVar.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dqvj c = dqvj.c(dphqVar.b);
        if (c == null) {
            c = dqvj.MIXED;
        }
        amtdVar.b = c;
        if (vzdVar == vzd.SAVE_THIS_ROUTE) {
            amtdVar.j = true;
        }
        if (amsyVar.t()) {
            amtdVar.e(amvj.e(amsyVar, context));
        } else {
            amtdVar.e(amvj.d(dsrjVar, context));
        }
        dwao dwaoVar2 = dvzyVar.g;
        if (dwaoVar2 == null) {
            dwaoVar2 = dwao.R;
        }
        amtdVar.d(dwaoVar2);
        vvs vvsVar = vvyVar.e;
        if (vvsVar == null) {
            vvsVar = vvs.e;
        }
        amtdVar.g = vvsVar.b;
        amtdVar.i = vvyVar.g;
        return amtdVar.a();
    }

    public static boolean c(vvw vvwVar) {
        int a = vvv.a(vvwVar.b);
        return a != 0 && a == 9;
    }

    public static Set<alyh> d(vvy vvyVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        dwbc dwbcVar = vvyVar.c;
        if (dwbcVar == null) {
            dwbcVar = dwbc.g;
        }
        dwaa dwaaVar = dwbcVar.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dvzu dvzuVar = dwaaVar.b;
        if (dvzuVar == null) {
            dvzuVar = dvzu.F;
        }
        Iterator<dvzn> it = dvzuVar.p.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dvzn next = it.next();
            int size = next.b.size();
            if (size != 0) {
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    i3 += next.b.f(i5);
                    i4 += next.c.f(i5);
                    arrayList2.add(akra.b(i3, i4));
                }
                arrayList.add(arrayList2);
            }
        }
        TreeSet treeSet = new TreeSet();
        while (i <= i2) {
            int i6 = (int) (akqx.b[i] * 256.0f);
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                List list = (List) arrayList.get(i7);
                if (list.size() != 1) {
                    for (int i8 = 1; i8 < list.size(); i8++) {
                        i(treeSet, new alwp((akra) list.get(i8 - 1), (akra) list.get(i8), i, i6));
                    }
                } else {
                    i(treeSet, alwp.a((akra) list.get(0), i, i6));
                }
            }
            i++;
        }
        return treeSet;
    }

    public static File e(Context context) {
        return new File(context.getCacheDir(), "save_this_route_icons");
    }

    @dzsi
    public static vvy f(long j, vun vunVar, amte amteVar, int i, int i2, vzd vzdVar) {
        int i3;
        amsy amsyVar = amteVar.a;
        if (amsyVar == null || amsyVar.n() == 0 || vunVar.a() == dqvj.TAXI) {
            return null;
        }
        vum vumVar = new vum(vunVar);
        vumVar.a = vxi.a(vunVar.b);
        dwaw a = vnw.a(vumVar.a(), null, null, null, null);
        dwbc dwbcVar = amsyVar.a;
        if (vzdVar == vzd.SAVE_THIS_ROUTE) {
            dwaa dwaaVar = dwbcVar.b;
            if (dwaaVar == null) {
                dwaaVar = dwaa.g;
            }
            dvzu dvzuVar = dwaaVar.b;
            if (dvzuVar == null) {
                dvzuVar = dvzu.F;
            }
            dvzo ca = dvzu.F.ca(dvzuVar);
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dvzu dvzuVar2 = (dvzu) ca.b;
            dvzuVar2.A = null;
            dvzuVar2.a &= -262145;
            dvzuVar2.s = dvzu.ck();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dvzu) ca.b).e = dvzu.ck();
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            ((dvzu) ca.b).w = dvzu.ck();
            dwaa dwaaVar2 = dwbcVar.b;
            if (dwaaVar2 == null) {
                dwaaVar2 = dwaa.g;
            }
            dvzu dvzuVar3 = dwaaVar2.b;
            if (dvzuVar3 == null) {
                dvzuVar3 = dvzu.F;
            }
            Iterator<dovh> it = dvzuVar3.w.iterator();
            while (true) {
                i3 = 5;
                if (!it.hasNext()) {
                    break;
                }
                dovh next = it.next();
                dsqp dsqpVar = (dsqp) next.cu(5);
                dsqpVar.bC(next);
                dovc dovcVar = (dovc) dsqpVar;
                if (next.e.size() == 0) {
                    if (dovcVar.c) {
                        dovcVar.bF();
                        dovcVar.c = false;
                    }
                    dovh dovhVar = (dovh) dovcVar.b;
                    dovhVar.d = null;
                    int i4 = dovhVar.a & (-5);
                    dovhVar.a = i4;
                    dovhVar.a = i4 & (-3);
                    dovhVar.c = false;
                }
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dvzu dvzuVar4 = (dvzu) ca.b;
                dovh bK = dovcVar.bK();
                bK.getClass();
                dsrj<dovh> dsrjVar = dvzuVar4.w;
                if (!dsrjVar.a()) {
                    dvzuVar4.w = dsqw.cl(dsrjVar);
                }
                dvzuVar4.w.add(bK);
            }
            dwaa dwaaVar3 = dwbcVar.b;
            if (dwaaVar3 == null) {
                dwaaVar3 = dwaa.g;
            }
            dvzu dvzuVar5 = dwaaVar3.b;
            if (dvzuVar5 == null) {
                dvzuVar5 = dvzu.F;
            }
            for (dpie dpieVar : dvzuVar5.e) {
                dsqp dsqpVar2 = (dsqp) dpieVar.cu(i3);
                dsqpVar2.bC(dpieVar);
                dphr dphrVar = (dphr) dsqpVar2;
                if (dphrVar.c) {
                    dphrVar.bF();
                    dphrVar.c = false;
                }
                dpie dpieVar2 = (dpie) dphrVar.b;
                dpie dpieVar3 = dpie.C;
                dpieVar2.f = null;
                int i5 = dpieVar2.a & (-17);
                dpieVar2.a = i5;
                dpieVar2.r = null;
                dpieVar2.a = i5 & (-131073);
                dpec dpecVar = dpieVar.d;
                if (dpecVar == null) {
                    dpecVar = dpec.o;
                }
                if ((dpecVar.a & 256) != 0) {
                    dpec dpecVar2 = dpieVar.d;
                    if (dpecVar2 == null) {
                        dpecVar2 = dpec.o;
                    }
                    doxd doxdVar = dpecVar2.k;
                    if (doxdVar == null) {
                        doxdVar = doxd.l;
                    }
                    dows ca2 = doxd.l.ca(doxdVar);
                    dpej dpejVar = dpej.DELAY_NODATA;
                    if (ca2.c) {
                        ca2.bF();
                        ca2.c = false;
                    }
                    doxd doxdVar2 = (doxd) ca2.b;
                    doxdVar2.c = dpejVar.e;
                    doxdVar2.a |= 4;
                    dpec dpecVar3 = dpieVar.d;
                    if (dpecVar3 == null) {
                        dpecVar3 = dpec.o;
                    }
                    dpeb ca3 = dpec.o.ca(dpecVar3);
                    if (ca3.c) {
                        ca3.bF();
                        ca3.c = false;
                    }
                    dpec dpecVar4 = (dpec) ca3.b;
                    doxd bK2 = ca2.bK();
                    bK2.getClass();
                    dpecVar4.k = bK2;
                    dpecVar4.a |= 256;
                    if (dphrVar.c) {
                        dphrVar.bF();
                        dphrVar.c = false;
                    }
                    dpie dpieVar4 = (dpie) dphrVar.b;
                    dpec bK3 = ca3.bK();
                    bK3.getClass();
                    dpieVar4.d = bK3;
                    dpieVar4.a |= 8;
                    if (dphrVar.c) {
                        dphrVar.bF();
                        dphrVar.c = false;
                    }
                    ((dpie) dphrVar.b).e = dpie.ck();
                    for (dpbp dpbpVar : dpieVar.e) {
                        dpbm ca4 = dpbp.i.ca(dpbpVar);
                        dpec dpecVar5 = dpbpVar.b;
                        if (dpecVar5 == null) {
                            dpecVar5 = dpec.o;
                        }
                        if ((dpecVar5.a & 256) != 0) {
                            dpec dpecVar6 = dpbpVar.b;
                            if (dpecVar6 == null) {
                                dpecVar6 = dpec.o;
                            }
                            doxd doxdVar3 = dpecVar6.k;
                            if (doxdVar3 == null) {
                                doxdVar3 = doxd.l;
                            }
                            dows ca5 = doxd.l.ca(doxdVar3);
                            dpej dpejVar2 = dpej.DELAY_NODATA;
                            if (ca5.c) {
                                ca5.bF();
                                ca5.c = false;
                            }
                            doxd doxdVar4 = (doxd) ca5.b;
                            doxdVar4.c = dpejVar2.e;
                            doxdVar4.a |= 4;
                            dpec dpecVar7 = dpbpVar.b;
                            if (dpecVar7 == null) {
                                dpecVar7 = dpec.o;
                            }
                            dpeb ca6 = dpec.o.ca(dpecVar7);
                            if (ca6.c) {
                                ca6.bF();
                                ca6.c = false;
                            }
                            dpec dpecVar8 = (dpec) ca6.b;
                            doxd bK4 = ca5.bK();
                            bK4.getClass();
                            dpecVar8.k = bK4;
                            dpecVar8.a |= 256;
                            if (ca4.c) {
                                ca4.bF();
                                ca4.c = false;
                            }
                            dpbp dpbpVar2 = (dpbp) ca4.b;
                            dpec bK5 = ca6.bK();
                            bK5.getClass();
                            dpbpVar2.b = bK5;
                            dpbpVar2.a |= 1;
                        }
                        dphrVar.b(ca4);
                    }
                }
                ca.d(dphrVar);
                i3 = 5;
            }
            dwaa dwaaVar4 = dwbcVar.b;
            if (dwaaVar4 == null) {
                dwaaVar4 = dwaa.g;
            }
            dvzz ca7 = dwaa.g.ca(dwaaVar4);
            if (ca7.c) {
                ca7.bF();
                ca7.c = false;
            }
            dwaa dwaaVar5 = (dwaa) ca7.b;
            dvzu bK6 = ca.bK();
            bK6.getClass();
            dwaaVar5.b = bK6;
            dwaaVar5.a |= 1;
            dwaz dwazVar = (dwaz) dwbc.g.ca(dwbcVar);
            if (dwazVar.c) {
                dwazVar.bF();
                dwazVar.c = false;
            }
            dwbc dwbcVar2 = (dwbc) dwazVar.b;
            dwaa bK7 = ca7.bK();
            bK7.getClass();
            dwbcVar2.b = bK7;
            dwbcVar2.a |= 1;
            dwbcVar = (dwbc) dwazVar.bK();
        }
        long j2 = amteVar.g;
        vvr bZ = vvs.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        vvs vvsVar = (vvs) bZ.b;
        int i6 = vvsVar.a | 1;
        vvsVar.a = i6;
        vvsVar.b = j2;
        vvsVar.c = i - 1;
        vvsVar.a = i6 | 2;
        vvt bZ2 = vvw.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        vvw vvwVar = (vvw) bZ2.b;
        vvwVar.b = 1;
        vvwVar.a |= 1;
        vvx bZ3 = vvy.j.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        vvy vvyVar = (vvy) bZ3.b;
        a.getClass();
        vvyVar.b = a;
        int i7 = vvyVar.a | 1;
        vvyVar.a = i7;
        dwbcVar.getClass();
        vvyVar.c = dwbcVar;
        int i8 = i7 | 2;
        vvyVar.a = i8;
        vvyVar.a = i8 | 8;
        vvyVar.d = j;
        vvs bK8 = bZ.bK();
        bK8.getClass();
        vvyVar.e = bK8;
        vvyVar.a |= 16;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        vvy vvyVar2 = (vvy) bZ3.b;
        vvw bK9 = bZ2.bK();
        bK9.getClass();
        vvyVar2.f = bK9;
        vvyVar2.a |= 32;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        vvy vvyVar3 = (vvy) bZ3.b;
        int i9 = vvyVar3.a | 64;
        vvyVar3.a = i9;
        vvyVar3.g = i2;
        int i10 = i9 | 128;
        vvyVar3.a = i10;
        vvyVar3.h = false;
        String str = amsyVar.c;
        str.getClass();
        vvyVar3.a = i10 | 256;
        vvyVar3.i = str;
        return bZ3.bK();
    }

    @dzsi
    public static vvy g(vvy vvyVar, long j, @dzsi amuh amuhVar, @dzsi int i, @dzsi Location location) {
        vvx ca = vvy.j.ca(vvyVar);
        if (amuhVar != null) {
            dwbc aq = amub.aq(amuhVar);
            if (aq == null) {
                return null;
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            vvy vvyVar2 = (vvy) ca.b;
            aq.getClass();
            vvyVar2.c = aq;
            vvyVar2.a |= 2;
        }
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        vvy vvyVar3 = (vvy) ca.b;
        vvyVar3.a |= 8;
        vvyVar3.d = j;
        if (i == 0) {
            if (location != null) {
                i = 0;
            }
            return ca.bK();
        }
        vvw vvwVar = vvyVar.f;
        if (vvwVar == null) {
            vvwVar = vvw.d;
        }
        vvt ca2 = vvw.d.ca(vvwVar);
        if (i != 0) {
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            vvw vvwVar2 = (vvw) ca2.b;
            vvwVar2.b = i - 1;
            vvwVar2.a |= 1;
        }
        if (location != null) {
            dnog bZ = dnoh.d.bZ();
            double latitude = location.getLatitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnoh dnohVar = (dnoh) bZ.b;
            dnohVar.a |= 1;
            dnohVar.b = latitude;
            double longitude = location.getLongitude();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnoh dnohVar2 = (dnoh) bZ.b;
            dnohVar2.a |= 2;
            dnohVar2.c = longitude;
            if (ca2.c) {
                ca2.bF();
                ca2.c = false;
            }
            vvw vvwVar3 = (vvw) ca2.b;
            dnoh bK = bZ.bK();
            bK.getClass();
            vvwVar3.c = bK;
            vvwVar3.a |= 2;
        }
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        vvy vvyVar4 = (vvy) ca.b;
        vvw bK2 = ca2.bK();
        bK2.getClass();
        vvyVar4.f = bK2;
        vvyVar4.a |= 32;
        return ca.bK();
    }

    @dzsi
    public static vvy h(long j, amuh amuhVar, int i, int i2, @dzsi Location location, boolean z) {
        amvh[] amvhVarArr;
        if (amuhVar.n() || !amuhVar.j()) {
            return null;
        }
        dwbc aq = amub.aq(amuhVar);
        dbsk.a(!amuhVar.n());
        dbsk.a(amuhVar.j());
        amub k = amuhVar.k();
        dbsk.s(k);
        dvzv dvzvVar = (dvzv) dvzy.u.bZ();
        dwaa dwaaVar = k.b.b;
        if (dwaaVar == null) {
            dwaaVar = dwaa.g;
        }
        dhjx dhjxVar = dwaaVar.c;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if (dvzvVar.c) {
            dvzvVar.bF();
            dvzvVar.c = false;
        }
        dvzy dvzyVar = (dvzy) dvzvVar.b;
        dhjxVar.getClass();
        dvzyVar.e = dhjxVar;
        int i3 = dvzyVar.a | 1;
        dvzyVar.a = i3;
        dwao dwaoVar = k.J;
        dwaoVar.getClass();
        dvzyVar.g = dwaoVar;
        dvzyVar.a = i3 | 4;
        for (amvh amvhVar : k.o) {
            dpjx I = amvhVar.I();
            akqq akqqVar = amvhVar.e;
            if (akqqVar != null) {
                dpjq ca = dpjx.n.ca(I);
                dnoh g = akqqVar.g();
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dpjx dpjxVar = (dpjx) ca.b;
                g.getClass();
                dpjxVar.d = g;
                dpjxVar.a |= 4;
                I = ca.bK();
            }
            dvzvVar.a(I);
        }
        dwat dwatVar = (dwat) dwaw.j.bZ();
        if (dwatVar.c) {
            dwatVar.bF();
            dwatVar.c = false;
        }
        dwaw.c((dwaw) dwatVar.b);
        if (dwatVar.c) {
            dwatVar.bF();
            dwatVar.c = false;
        }
        dwaw dwawVar = (dwaw) dwatVar.b;
        dvzy dvzyVar2 = (dvzy) dvzvVar.bK();
        dvzyVar2.getClass();
        dwawVar.b = dvzyVar2;
        dwawVar.a |= 1;
        dwaw dwawVar2 = (dwaw) dwatVar.bK();
        vvr bZ = vvs.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        vvs vvsVar = (vvs) bZ.b;
        int i4 = vvsVar.a | 1;
        vvsVar.a = i4;
        vvsVar.b = j;
        int i5 = i - 1;
        if (i == 0) {
            throw null;
        }
        vvsVar.c = i5;
        int i6 = i4 | 2;
        vvsVar.a = i6;
        vvsVar.a = i6 | 4;
        vvsVar.d = "";
        vvt bZ2 = vvw.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        vvw vvwVar = (vvw) bZ2.b;
        vvwVar.b = i2 - 1;
        vvwVar.a |= 1;
        if (location != null) {
            dnog bZ3 = dnoh.d.bZ();
            double latitude = location.getLatitude();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnoh dnohVar = (dnoh) bZ3.b;
            dnohVar.a |= 1;
            dnohVar.b = latitude;
            double longitude = location.getLongitude();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnoh dnohVar2 = (dnoh) bZ3.b;
            dnohVar2.a |= 2;
            dnohVar2.c = longitude;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            vvw vvwVar2 = (vvw) bZ2.b;
            dnoh bK = bZ3.bK();
            bK.getClass();
            vvwVar2.c = bK;
            vvwVar2.a |= 2;
        }
        vvx bZ4 = vvy.j.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        vvy vvyVar = (vvy) bZ4.b;
        dwawVar2.getClass();
        vvyVar.b = dwawVar2;
        int i7 = vvyVar.a | 1;
        vvyVar.a = i7;
        aq.getClass();
        vvyVar.c = aq;
        int i8 = i7 | 2;
        vvyVar.a = i8;
        vvyVar.a = i8 | 8;
        vvyVar.d = j;
        vvs bK2 = bZ.bK();
        bK2.getClass();
        vvyVar.e = bK2;
        vvyVar.a |= 16;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        vvy vvyVar2 = (vvy) bZ4.b;
        vvw bK3 = bZ2.bK();
        bK3.getClass();
        vvyVar2.f = bK3;
        vvyVar2.a |= 32;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        vvy vvyVar3 = (vvy) bZ4.b;
        vvyVar3.a |= 128;
        vvyVar3.h = z;
        return bZ4.bK();
    }

    private static void i(Set<alyh> set, alyi alyiVar) {
        while (true) {
            alyh b = alyiVar.b();
            if (b != null) {
                set.add(b);
            } else {
                return;
            }
        }
    }
}
