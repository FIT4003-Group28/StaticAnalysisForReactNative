package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aldr  reason: default package */
/* loaded from: classes2.dex */
public final class aldr {
    public final btvo c;
    public final amub d;
    public int a = -1;
    public List<dozz> b = dcdc.e();
    public boolean e = false;
    public dcdc<Integer> f = dcdc.e();
    public float g = 0.0f;
    public final List<aldp> h = new ArrayList();

    public aldr(amub amubVar, btvo btvoVar) {
        this.d = amubVar;
        this.c = btvoVar;
    }

    public static boolean b(int i, amub amubVar, boolean z) {
        if (i == 0 || z) {
            return true;
        }
        if (amubVar.h == dqvj.DRIVE && i < amubVar.ai()) {
            return amubVar.ah(i).y;
        }
        return false;
    }

    public static int c(amub amubVar) {
        return Integer.MAX_VALUE - amubVar.z();
    }

    public static dcdc<dozr> d(List<dozz> list) {
        dozs dozsVar;
        dozs dozsVar2;
        dccx F = dcdc.F();
        for (dozz dozzVar : list) {
            if (dozzVar.b == 22) {
                dozsVar = (dozs) dozzVar.c;
            } else {
                dozsVar = dozs.q;
            }
            dozr dozrVar = dozsVar.l;
            if (dozrVar == null) {
                dozrVar = dozr.e;
            }
            if (dozrVar.b == 4) {
                if (dozzVar.b == 22) {
                    dozsVar2 = (dozs) dozzVar.c;
                } else {
                    dozsVar2 = dozs.q;
                }
                dozr dozrVar2 = dozsVar2.l;
                if (dozrVar2 == null) {
                    dozrVar2 = dozr.e;
                }
                F.g(dozrVar2);
            }
        }
        return F.f();
    }

    public static aldq e(amub amubVar, amuo amuoVar, int i, dcdc<Integer> dcdcVar, btvo btvoVar) {
        boolean z;
        int i2;
        amuq amuqVar;
        amuq amuqVar2;
        dccx F = dcdc.F();
        amuq amuqVar3 = amuoVar.b;
        dwwr vectorMapsParameters = btvoVar.getVectorMapsParameters();
        boolean z2 = vectorMapsParameters.r;
        amuq amuqVar4 = amuoVar.b;
        dpgw dpgwVar = null;
        if (amuqVar4 != null) {
            if ((amuqVar4.g().a & 2) != 0) {
                dpgwVar = amuqVar4.g().c;
                if (dpgwVar == null) {
                    dpgwVar = dpgw.r;
                }
            } else {
                amuq amuqVar5 = amuoVar.b;
                amuo amuoVar2 = amuoVar.R;
                while (true) {
                    if (amuoVar2 == null) {
                        amuqVar = null;
                        break;
                    }
                    amuqVar = amuoVar2.b;
                    if (amuqVar != amuqVar5) {
                        break;
                    }
                    amuoVar2 = amuoVar2.R;
                }
                if (amuqVar != null) {
                    if ((amuqVar.g().a & 4) == 0) {
                        amuq amuqVar6 = amuoVar.b;
                        amuo amuoVar3 = amuoVar.Q;
                        while (true) {
                            if (amuoVar3 == null) {
                                amuqVar2 = null;
                                break;
                            }
                            amuqVar2 = amuoVar3.b;
                            if (amuqVar2 != amuqVar6) {
                                break;
                            }
                            amuoVar3 = amuoVar3.Q;
                        }
                        if (amuqVar2 != null && (amuqVar2.g().a & 2) != 0 && (dpgwVar = amuqVar2.g().c) == null) {
                            dpgwVar = dpgw.r;
                        }
                    } else {
                        dpgwVar = amuqVar.g().d;
                        if (dpgwVar == null) {
                            dpgwVar = dpgw.r;
                        }
                    }
                }
            }
        }
        if (dpgwVar != null) {
            String str = dpgwVar.j;
            if (!str.isEmpty()) {
                Map unmodifiableMap = Collections.unmodifiableMap(vectorMapsParameters.s);
                if (unmodifiableMap.containsKey(str)) {
                    z2 = ((Boolean) unmodifiableMap.get(str)).booleanValue();
                }
            }
        }
        if (amuqVar3 != null) {
            z = alev.d(i, amuqVar3.b);
            if (amuqVar3.f()) {
                dphe g = amuqVar3.g();
                i2 = bvoa.c(g.f, 0);
                if (alev.c(g, dcdcVar, btvoVar) && amubVar.at(amuqVar3) != null) {
                    dcdc<amvb> at = amubVar.at(amuqVar3);
                    dbsk.s(at);
                    F.i(alev.a(at, dcdcVar));
                }
            } else {
                i2 = 0;
            }
            dpdt dpdtVar = amuqVar3.a.h;
            if (dpdtVar == null) {
                dpdtVar = dpdt.b;
            }
            dpeq dpeqVar = dpdtVar.a;
            if (dpeqVar == null) {
                dpeqVar = dpeq.m;
            }
            dpep dpepVar = dpeqVar.k;
            if (dpepVar == null) {
                dpepVar = dpep.b;
            }
            if (dpepVar.a.size() > 0) {
                F.i(dpepVar.a);
            }
        } else {
            z = true;
            i2 = 0;
        }
        if (!z2 || !amuoVar.N) {
            return new alcj(new aldo(amuoVar.j, i2, z), g(amuoVar), F.f(), false);
        }
        return new alcj(new aldo(amuoVar.j, i2, z), g(amuoVar), F.f(), true);
    }

    public final float f() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        aldp aldpVar = (aldp) dcft.s(this.h);
        return aldpVar.j + aldpVar.a();
    }

    private static dqvj g(amuo amuoVar) {
        dpec a;
        dpec dpecVar = amuoVar.a;
        if (dpecVar != null) {
            dqvj c = dqvj.c(dpecVar.b);
            return c == null ? dqvj.DRIVE : c;
        }
        amuq amuqVar = amuoVar.b;
        if (amuqVar == null || (a = amuqVar.a()) == null) {
            return dqvj.WALK;
        }
        if ((a.a & 1) != 0) {
            dqvj c2 = dqvj.c(a.b);
            return c2 == null ? dqvj.DRIVE : c2;
        }
        return dqvj.WALK;
    }

    public static dcdc<akra> a(akra akraVar, akra akraVar2) {
        akra akraVar3 = akraVar;
        int i = akraVar3.a;
        int i2 = akraVar2.a;
        boolean z = i > i2;
        akra akraVar4 = i > i2 ? akraVar3 : akraVar2;
        if (i > i2) {
            akraVar3 = akraVar2;
        }
        double d = akraVar3.a;
        double d2 = akraVar4.a;
        double d3 = akraVar3.b;
        double d4 = akraVar4.b;
        if (d != d2 || d3 != d4) {
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d3);
            Double.isNaN(d4);
            akra akraVar5 = akraVar4;
            double hypot = Math.hypot(d - d2, d3 - d4);
            double sqrt = (Math.sqrt(3.0d) * hypot) / 4.0d;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d4);
            Double.isNaN(d3);
            akra akraVar6 = akraVar3;
            Double.isNaN(d3);
            Double.isNaN(d4);
            Double.isNaN(d2);
            Double.isNaN(d);
            akra akraVar7 = new akra((int) Math.round(((d + d2) / 2.0d) + ((-((d4 - d3) / hypot)) * sqrt)), (int) Math.round(((d3 + d4) / 2.0d) + (((d2 - d) / hypot) * sqrt)));
            ArrayList arrayList = new ArrayList(11);
            arrayList.add(akraVar6);
            for (int i3 = 1; i3 < 10; i3++) {
                akra akraVar8 = new akra(0, 0);
                double d5 = i3;
                Double.isNaN(d5);
                akro.b(akraVar6, akraVar7, akraVar5, 1, (d5 / 10.0d) * hypot, akraVar8);
                arrayList.add(akraVar8);
            }
            arrayList.add(akraVar5);
            if (z) {
                Collections.reverse(arrayList);
            }
            return dcdc.r(arrayList);
        }
        return dcdc.e();
    }
}
