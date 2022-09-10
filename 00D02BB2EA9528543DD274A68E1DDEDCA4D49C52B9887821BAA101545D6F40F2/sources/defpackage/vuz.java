package defpackage;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vuz  reason: default package */
/* loaded from: classes7.dex */
public final class vuz {
    @dzsi
    public dqvj a;
    @dzsi
    public dspd b;
    @dzsi
    public dqtv c;
    @dzsi
    public EnumMap<vux, Integer> d;
    private final dwao e;
    private final dqvj f;
    private boolean g;
    @dzsi
    private dspd h;
    @dzsi
    private dspd i;
    private double j = -1.0d;

    public vuz(dwao dwaoVar, dqvj dqvjVar) {
        this.e = dwaoVar;
        this.f = dqvjVar;
    }

    public static void b(dowi dowiVar, Map.Entry<vux, Integer> entry) {
        vux vuxVar = vux.GOOD_TO_GO;
        int ordinal = entry.getKey().ordinal();
        if (ordinal == 4) {
            vph.h(vpc.JAKARTA, dowiVar, dowl.b(entry.getValue().intValue()));
        } else if (ordinal == 5) {
            vph.h(vpc.SAO_PAULO, dowiVar, dowl.b(entry.getValue().intValue()));
        } else if (ordinal == 6) {
            vph.h(vpc.MANILA, dowiVar, dowl.b(entry.getValue().intValue()));
        } else if (ordinal != 7) {
        } else {
            vph.h(vpc.SANTIAGO, dowiVar, dowl.b(entry.getValue().intValue()));
        }
    }

    public final dwao a() {
        dphq dphqVar = this.e.e;
        if (dphqVar == null) {
            dphqVar = dphq.m;
        }
        dqvj dqvjVar = this.a;
        if (dqvjVar == null) {
            int a = dpho.a(dphqVar.c);
            if (a != 0 && a == 3) {
                dqvjVar = dqvj.c(dphqVar.b);
                if (dqvjVar == null) {
                    dqvjVar = dqvj.MIXED;
                }
            } else {
                dqvjVar = this.f;
            }
        }
        dwal ca = dwao.R.ca(this.e);
        dphm ca2 = dphq.m.ca(dphqVar);
        if (ca2.c) {
            ca2.bF();
            ca2.c = false;
        }
        dphq dphqVar2 = (dphq) ca2.b;
        dphqVar2.b = dqvjVar.k;
        dphqVar2.a |= 1;
        dphq dphqVar3 = (dphq) ca2.b;
        dphqVar3.c = 3;
        int i = dphqVar3.a | 2;
        dphqVar3.a = i;
        int i2 = i | 1024;
        dphqVar3.a = i2;
        dphqVar3.l = false;
        dphqVar3.a = i2 | 8;
        dphqVar3.e = false;
        dphq bK = ca2.bK();
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar = (dwao) ca.b;
        bK.getClass();
        dwaoVar.e = bK;
        dwaoVar.a |= 1;
        dqtv dqtvVar = this.c;
        if (dqtvVar != null) {
            dqtvVar.getClass();
            dwaoVar.L = dqtvVar;
            dwaoVar.b |= 32768;
        }
        if (this.g) {
            if (this.h != null) {
                dpbc bZ = dpbd.c.bZ();
                dspd dspdVar = this.h;
                dbsk.s(dspdVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpbd dpbdVar = (dpbd) bZ.b;
                dspdVar.getClass();
                dpbdVar.a |= 1;
                dpbdVar.b = dspdVar;
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dwao dwaoVar2 = (dwao) ca.b;
                dpbd bK2 = bZ.bK();
                bK2.getClass();
                dwaoVar2.y = bK2;
                dwaoVar2.a |= 16777216;
            }
        } else if (this.i != null) {
            dpbg bZ2 = dpbh.d.bZ();
            dspd dspdVar2 = this.i;
            dbsk.s(dspdVar2);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dpbh dpbhVar = (dpbh) bZ2.b;
            dspdVar2.getClass();
            int i3 = dpbhVar.a | 1;
            dpbhVar.a = i3;
            dpbhVar.b = dspdVar2;
            double d = this.j;
            if (d >= dcyn.a) {
                dpbhVar.a = i3 | 2;
                dpbhVar.c = (int) d;
            }
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            dwao dwaoVar3 = (dwao) ca.b;
            dpbh bK3 = bZ2.bK();
            bK3.getClass();
            dwaoVar3.w = bK3;
            dwaoVar3.a |= 4194304;
        }
        dowr dowrVar = ((dwao) ca.b).g;
        if (dowrVar == null) {
            dowrVar = dowr.m;
        }
        dowi ca3 = dowr.m.ca(dowrVar);
        if (this.d != null) {
            if (ca3.c) {
                ca3.bF();
                ca3.c = false;
            }
            ((dowr) ca3.b).i = dowr.ck();
            EnumMap<vux, Integer> enumMap = this.d;
            dbsk.s(enumMap);
            for (Map.Entry<vux, Integer> entry : enumMap.entrySet()) {
                vux key = entry.getKey();
                dbsk.s(key);
                Integer value = entry.getValue();
                dbsk.s(value);
                int intValue = value.intValue();
                switch (key.ordinal()) {
                    case 0:
                        dqut dqutVar = dqut.US_WA_GOOD_TO_GO;
                        dquw dquwVar = ((dowr) ca3.b).l;
                        if (dquwVar == null) {
                            dquwVar = dquw.b;
                        }
                        if (intValue == 1) {
                            Iterator<dquv> it = dquwVar.a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    dqut b = dqut.b(it.next().b);
                                    if (b == null) {
                                        b = dqut.UNKNOWN_PASS_TYPE;
                                        continue;
                                    }
                                    if (b == dqutVar) {
                                        break;
                                    }
                                } else {
                                    dquu bZ3 = dquv.c.bZ();
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dquv dquvVar = (dquv) bZ3.b;
                                    dquvVar.b = dqutVar.c;
                                    dquvVar.a |= 1;
                                    dqur ca4 = dquw.b.ca(dquwVar);
                                    ca4.a(bZ3.bK());
                                    dquw bK4 = ca4.bK();
                                    if (ca3.c) {
                                        ca3.bF();
                                        ca3.c = false;
                                    }
                                    dowr dowrVar2 = (dowr) ca3.b;
                                    bK4.getClass();
                                    dowrVar2.l = bK4;
                                    dowrVar2.a |= 32768;
                                    break;
                                }
                            }
                        } else if (intValue == 0) {
                            dqur ca5 = dquw.b.ca(dquwVar);
                            for (int i4 = 0; i4 < dquwVar.a.size(); i4++) {
                                dqut b2 = dqut.b(dquwVar.a.get(i4).b);
                                if (b2 == null) {
                                    b2 = dqut.UNKNOWN_PASS_TYPE;
                                }
                                if (b2 == dqutVar) {
                                    ca5.b(i4);
                                }
                            }
                            dquw bK5 = ca5.bK();
                            if (ca3.c) {
                                ca3.bF();
                                ca3.c = false;
                            }
                            dowr dowrVar3 = (dowr) ca3.b;
                            bK5.getClass();
                            dowrVar3.l = bK5;
                            dowrVar3.a |= 32768;
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 1:
                        boolean z = intValue != 0;
                        if (ca3.c) {
                            ca3.bF();
                            ca3.c = false;
                        }
                        dowr dowrVar4 = (dowr) ca3.b;
                        dowrVar4.a |= 1;
                        dowrVar4.b = z;
                        break;
                    case 2:
                        boolean z2 = intValue != 0;
                        if (ca3.c) {
                            ca3.bF();
                            ca3.c = false;
                        }
                        dowr dowrVar5 = (dowr) ca3.b;
                        dowrVar5.a |= 2;
                        dowrVar5.c = z2;
                        break;
                    case 3:
                        boolean z3 = intValue != 0;
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        dwao dwaoVar4 = (dwao) ca.b;
                        dwaoVar4.a |= 1024;
                        dwaoVar4.o = z3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        b(ca3, entry);
                        break;
                    case 8:
                        int a2 = dwan.a(intValue);
                        if (ca.c) {
                            ca.bF();
                            ca.c = false;
                        }
                        dwao dwaoVar5 = (dwao) ca.b;
                        int i5 = a2 - 1;
                        if (a2 == 0) {
                            throw null;
                        }
                        dwaoVar5.n = i5;
                        dwaoVar5.a |= 512;
                        break;
                    case 9:
                        if (intValue <= 0) {
                            if (ca.c) {
                                ca.bF();
                                ca.c = false;
                            }
                            dwao dwaoVar6 = (dwao) ca.b;
                            dwaoVar6.a &= -257;
                            dwaoVar6.m = 0;
                            break;
                        } else {
                            if (ca.c) {
                                ca.bF();
                                ca.c = false;
                            }
                            dwao dwaoVar7 = (dwao) ca.b;
                            dwaoVar7.a |= 256;
                            dwaoVar7.m = intValue;
                            break;
                        }
                }
            }
        }
        dpev dpevVar = ((dowr) ca3.b).g;
        if (dpevVar == null) {
            dpevVar = dpev.g;
        }
        dper ca6 = dpev.g.ca(dpevVar);
        if (ca6.c) {
            ca6.bF();
            ca6.c = false;
        }
        dpev dpevVar2 = (dpev) ca6.b;
        dpevVar2.d = 2;
        int i6 = dpevVar2.a | 64;
        dpevVar2.a = i6;
        int i7 = i6 & (-257);
        dpevVar2.a = i7;
        dpevVar2.f = 0;
        dspd dspdVar3 = this.b;
        if (dspdVar3 != null) {
            dspdVar3.getClass();
            dpevVar2.a = i7 | 1;
            dpevVar2.b = dspdVar3;
        }
        if (ca3.c) {
            ca3.bF();
            ca3.c = false;
        }
        dowr dowrVar6 = (dowr) ca3.b;
        dpev bK6 = ca6.bK();
        bK6.getClass();
        dowrVar6.g = bK6;
        dowrVar6.a |= 128;
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dwao dwaoVar8 = (dwao) ca.b;
        dowr bK7 = ca3.bK();
        bK7.getClass();
        dwaoVar8.g = bK7;
        dwaoVar8.a |= 4;
        return ca.bK();
    }

    public final void c(@dzsi dspd dspdVar) {
        this.g = true;
        this.h = dspdVar;
    }

    public final void d(@dzsi dspd dspdVar, double d) {
        this.i = dspdVar;
        this.j = d;
    }
}
