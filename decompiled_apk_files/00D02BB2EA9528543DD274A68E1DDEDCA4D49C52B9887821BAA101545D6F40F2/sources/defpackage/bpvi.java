package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpvi  reason: default package */
/* loaded from: classes4.dex */
public final class bpvi {
    public static final dcqe a = dcqe.c("bpvi");

    public static void a(Bundle bundle, bwqv bwqvVar, bwrs<bvrt<bpuk>> bwrsVar) {
        bwqvVar.c(bundle, "ROAD_RAP_FEATURES_235085797_KEY", bwrsVar);
    }

    public static digh b(ilo iloVar) {
        digg bZ = digh.k.bZ();
        dpsn i = iloVar.ai().i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digh dighVar = (digh) bZ.b;
        i.getClass();
        dighVar.b = i;
        dighVar.a |= 1;
        dpym bZ2 = dpyn.d.bZ();
        String cg = iloVar.cg();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpyn dpynVar = (dpyn) bZ2.b;
        cg.getClass();
        dpynVar.a |= 1;
        dpynVar.b = cg;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digh dighVar2 = (digh) bZ.b;
        dpyn bK = bZ2.bK();
        bK.getClass();
        dighVar2.c = bK;
        dighVar2.a |= 2;
        dodc dodcVar = iloVar.cd().e;
        if (dodcVar == null) {
            dodcVar = dodc.i;
        }
        drlf b = drlf.b(dodcVar.c);
        if (b == null) {
            b = drlf.UNKNOWN_TRAFFIC_ACCESS;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digh dighVar3 = (digh) bZ.b;
        dighVar3.d = b.e;
        dighVar3.a |= 4;
        drku bZ3 = drkx.b.bZ();
        List k = dchl.k(iloVar.A(), bpvg.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drkx drkxVar = (drkx) bZ3.b;
        dsrj<drkw> dsrjVar = drkxVar.a;
        if (!dsrjVar.a()) {
            drkxVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(k, drkxVar.a);
        drkx bK2 = bZ3.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digh dighVar4 = (digh) bZ.b;
        bK2.getClass();
        dighVar4.j = bK2;
        dighVar4.a |= 64;
        if (iloVar.aj() != null) {
            dpum h = iloVar.aj().h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            digh dighVar5 = (digh) bZ.b;
            h.getClass();
            dighVar5.e = h;
            dighVar5.a |= 8;
        }
        dodc dodcVar2 = iloVar.cd().e;
        if (dodcVar2 == null) {
            dodcVar2 = dodc.i;
        }
        if ((dodcVar2.a & 64) != 0) {
            dodc dodcVar3 = iloVar.cd().e;
            if (dodcVar3 == null) {
                dodcVar3 = dodc.i;
            }
            doud doudVar = dodcVar3.g;
            if (doudVar == null) {
                doudVar = doud.c;
            }
            akrk g = akrk.g(doudVar);
            dpuq l = g.b().l();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            digh dighVar6 = (digh) bZ.b;
            l.getClass();
            dighVar6.i = l;
            dighVar6.a |= 32;
            dvzn j = g.j();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            digh dighVar7 = (digh) bZ.b;
            j.getClass();
            dsrj<dvzn> dsrjVar2 = dighVar7.h;
            if (!dsrjVar2.a()) {
                dighVar7.h = dsqw.cl(dsrjVar2);
            }
            dighVar7.h.add(j);
        }
        dodc dodcVar4 = iloVar.cd().e;
        if (dodcVar4 == null) {
            dodcVar4 = dodc.i;
        }
        for (dodb dodbVar : dodcVar4.f) {
            drky bZ4 = drkz.f.bZ();
            dpsn i2 = akqi.b(dodbVar.b).i();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drkz drkzVar = (drkz) bZ4.b;
            i2.getClass();
            drkzVar.b = i2;
            drkzVar.a |= 1;
            dpym bZ5 = dpyn.d.bZ();
            String str = dodbVar.c;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dpyn dpynVar2 = (dpyn) bZ5.b;
            str.getClass();
            dpynVar2.a |= 1;
            dpynVar2.b = str;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            drkz drkzVar2 = (drkz) bZ4.b;
            dpyn bK3 = bZ5.bK();
            bK3.getClass();
            drkzVar2.c = bK3;
            drkzVar2.a |= 2;
            drkz bK4 = bZ4.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            digh dighVar8 = (digh) bZ.b;
            bK4.getClass();
            dighVar8.b();
            dighVar8.g.add(bK4);
        }
        return bZ.bK();
    }

    public static dcdc<drkz> c(bpuk bpukVar) {
        dsrj<digh> dsrjVar = bpukVar.a;
        List<digh> subList = dsrjVar.subList(1, dsrjVar.size());
        dsrj<drkz> dsrjVar2 = bpukVar.a.get(0).g;
        dccx F = dcdc.F();
        for (final drkz drkzVar : dsrjVar2) {
            Iterator<digh> it = subList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!dcbg.b(it.next().g).p(new dbsl(drkzVar) { // from class: bpvh
                        private final drkz a;

                        {
                            this.a = drkzVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj) {
                            drkz drkzVar2 = this.a;
                            dpsn dpsnVar = ((drkz) obj).b;
                            if (dpsnVar == null) {
                                dpsnVar = dpsn.d;
                            }
                            dpsn dpsnVar2 = drkzVar2.b;
                            if (dpsnVar2 == null) {
                                dpsnVar2 = dpsn.d;
                            }
                            return dpsnVar.equals(dpsnVar2);
                        }
                    })) {
                        break;
                    }
                } else {
                    F.g(drkzVar);
                    break;
                }
            }
        }
        return F.f();
    }

    public static dodb d(drkz drkzVar) {
        doda bZ = dodb.d.bZ();
        dpsn dpsnVar = drkzVar.b;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        String o = akqi.j(dpsnVar).o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dodb dodbVar = (dodb) bZ.b;
        o.getClass();
        dodbVar.a |= 1;
        dodbVar.b = o;
        dpyn dpynVar = drkzVar.c;
        if (dpynVar == null) {
            dpynVar = dpyn.d;
        }
        String str = dpynVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dodb dodbVar2 = (dodb) bZ.b;
        str.getClass();
        dodbVar2.a |= 2;
        dodbVar2.c = str;
        return bZ.bK();
    }

    public static drkz e(dodb dodbVar) {
        drky bZ = drkz.f.bZ();
        dpsn i = akqi.b(dodbVar.b).i();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkz drkzVar = (drkz) bZ.b;
        i.getClass();
        drkzVar.b = i;
        drkzVar.a |= 1;
        dpym bZ2 = dpyn.d.bZ();
        String str = dodbVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dpyn dpynVar = (dpyn) bZ2.b;
        str.getClass();
        dpynVar.a |= 1;
        dpynVar.b = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drkz drkzVar2 = (drkz) bZ.b;
        dpyn bK = bZ2.bK();
        bK.getClass();
        drkzVar2.c = bK;
        drkzVar2.a |= 2;
        return bZ.bK();
    }

    public static bpuk f(bpuk bpukVar, digi digiVar) {
        if (!bpukVar.a.isEmpty()) {
            dpsn dpsnVar = bpukVar.a.get(0).b;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            long j = dpsnVar.c;
            digh dighVar = digiVar.a;
            if (dighVar == null) {
                dighVar = digh.k;
            }
            dpsn dpsnVar2 = dighVar.b;
            if (dpsnVar2 == null) {
                dpsnVar2 = dpsn.d;
            }
            if (j == dpsnVar2.c) {
                bpuj bZ = bpuk.c.bZ();
                digh dighVar2 = digiVar.a;
                if (dighVar2 == null) {
                    dighVar2 = digh.k;
                }
                bZ.b(dighVar2);
                dsrj<digh> dsrjVar = bpukVar.a;
                bZ.a(dsrjVar.subList(1, dsrjVar.size()));
                return bZ.bK();
            }
            bvoo.h("Trying to augment mismatched features ", new Object[0]);
            return bpukVar;
        }
        bvoo.h("Trying to augment empty RoadRapFeatures ", new Object[0]);
        return bpukVar;
    }
}
