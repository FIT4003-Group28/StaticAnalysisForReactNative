package defpackage;
/* compiled from: PG */
/* renamed from: chtk  reason: default package */
/* loaded from: classes4.dex */
public final class chtk {
    public static dcdc<chxk> a(final chxl chxlVar, chtq chtqVar) {
        chxh chxhVar;
        chvs chvsVar;
        chvy chvyVar;
        chwl chwlVar;
        chwf chwfVar;
        dcep<chxj> b = chtqVar.b();
        dccx dccxVar = new dccx();
        dbty dbtyVar = new dbty(chxlVar) { // from class: chtd
            private final chxl a;

            {
                this.a = chxlVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dpot dpotVar = this.a.e;
                if (dpotVar == null) {
                    dpotVar = dpot.m;
                }
                try {
                    return dbsg.i(dcbg.b(dpotVar.h).D(chtj.a));
                } catch (Exception unused) {
                    dpov dpovVar = dpotVar.b;
                    if (dpovVar == null) {
                        dpovVar = dpov.f;
                    }
                    String str = dpovVar.b;
                    return dbpy.a;
                }
            }
        };
        boolean b2 = b(chxlVar);
        for (chxk chxkVar : chxlVar.u) {
            if (b.contains(chxj.a(chxkVar.b)) && (!chxkVar.d || !chtqVar.equals(chtq.d()))) {
                if (chtqVar.equals(chtq.d()) || !b2) {
                    boolean z = chxlVar.j > 0 || chxlVar.k > 0;
                    switch (chxj.a(chxkVar.b).ordinal()) {
                        case 0:
                            if (!z) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (z && !chxlVar.l) {
                                dccxVar.g(chxkVar);
                                break;
                            }
                            break;
                        case 2:
                            if (!chxlVar.q && !dcbg.b(chxlVar.o).s(chte.a).B().containsAll(dcbg.b(chxlVar.p).s(chtf.a).B())) {
                                dccxVar.g(chxkVar);
                                break;
                            }
                            break;
                        case 3:
                            if (chxlVar.r.size() > 0) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (chxkVar.b == 5) {
                                chxhVar = (chxh) chxkVar.c;
                            } else {
                                chxhVar = chxh.b;
                            }
                            if (chxhVar.a.size() > 0) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            dpot dpotVar = chxlVar.e;
                            if (dpotVar == null) {
                                dpotVar = dpot.m;
                            }
                            dpri dpriVar = dpotVar.d;
                            if (dpriVar == null) {
                                dpriVar = dpri.f;
                            }
                            int a = dpqr.a(dpriVar.c);
                            if (a != 0 && a == 3) {
                                break;
                            } else if (c(chxlVar)) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            dpot dpotVar2 = chxlVar.e;
                            if (dpotVar2 == null) {
                                dpotVar2 = dpot.m;
                            }
                            if (dpotVar2.g.isEmpty()) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            dbsg dbsgVar = (dbsg) dbtyVar.a();
                            if (dbsgVar.a()) {
                                dcdn dcdnVar = (dcdn) dbsgVar.b();
                                if (chxkVar.b == 11) {
                                    chvsVar = (chvs) chxkVar.c;
                                } else {
                                    chvsVar = chvs.f;
                                }
                                dppt dpptVar = chvsVar.b;
                                if (dpptVar == null) {
                                    dpptVar = dppt.e;
                                }
                                dppl dpplVar = (dppl) dcdnVar.get(dpptVar);
                                if (dpplVar != null && dpplVar.f.isEmpty() && dpplVar.b == 2 && (((dppv) dpplVar.c).a & 1) != 0) {
                                    dccxVar.g(chxkVar);
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                        case 9:
                            if (!c(chxlVar)) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (chxkVar.b == 9) {
                                chvyVar = (chvy) chxkVar.c;
                            } else {
                                chvyVar = chvy.b;
                            }
                            if (chvyVar.a.size() > 0) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (chxkVar.b == 17) {
                                chwlVar = (chwl) chxkVar.c;
                            } else {
                                chwlVar = chwl.c;
                            }
                            if (!chwlVar.b.u()) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (chxkVar.b == 20) {
                                chwfVar = (chwf) chxkVar.c;
                            } else {
                                chwfVar = chwf.c;
                            }
                            if ((chwfVar.a & 1) != 0) {
                                dccxVar.g(chxkVar);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            dccxVar.g(chxkVar);
                            break;
                        case 16:
                            int i = chxkVar.b;
                            break;
                    }
                }
            }
        }
        return dccxVar.f();
    }

    public static boolean b(chxl chxlVar) {
        return dcbg.b(chxlVar.u).p(chti.a);
    }

    public static boolean c(chxl chxlVar) {
        dpot dpotVar = chxlVar.e;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        return dpotVar.h.size() >= 4;
    }

    @dzsi
    public static dpvc d(chxk chxkVar) {
        chwp chwpVar;
        chvq chvqVar;
        chvs chvsVar;
        chvu chvuVar;
        chvw chvwVar;
        chxj chxjVar = chxj.RATING;
        switch (chxj.a(chxkVar.b).ordinal()) {
            case 5:
                if (chxkVar.b == 7) {
                    chwpVar = (chwp) chxkVar.c;
                } else {
                    chwpVar = chwp.c;
                }
                dpvc dpvcVar = chwpVar.b;
                return dpvcVar == null ? dpvc.c : dpvcVar;
            case 6:
                if (chxkVar.b == 10) {
                    chvqVar = (chvq) chxkVar.c;
                } else {
                    chvqVar = chvq.d;
                }
                dpvc dpvcVar2 = chvqVar.c;
                return dpvcVar2 == null ? dpvc.c : dpvcVar2;
            case 7:
                if (chxkVar.b == 11) {
                    chvsVar = (chvs) chxkVar.c;
                } else {
                    chvsVar = chvs.f;
                }
                dpvc dpvcVar3 = chvsVar.e;
                return dpvcVar3 == null ? dpvc.c : dpvcVar3;
            case 8:
                if (chxkVar.b == 13) {
                    chvuVar = (chvu) chxkVar.c;
                } else {
                    chvuVar = chvu.e;
                }
                dpvc dpvcVar4 = chvuVar.d;
                return dpvcVar4 == null ? dpvc.c : dpvcVar4;
            case 9:
                if (chxkVar.b == 12) {
                    chvwVar = (chvw) chxkVar.c;
                } else {
                    chvwVar = chvw.d;
                }
                dpvc dpvcVar5 = chvwVar.c;
                return dpvcVar5 == null ? dpvc.c : dpvcVar5;
            default:
                int i = chxkVar.b;
                return null;
        }
    }
}
