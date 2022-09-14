package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bzmb  reason: default package */
/* loaded from: classes.dex */
public final class bzmb implements bzmc {
    public dcdc<azxa> a = dcdc.e();
    private final akfa b;
    private final btvo c;
    private final ahjq d;
    private final axwq e;
    private final bzlz f;
    private final cqat g;

    public bzmb(akfa akfaVar, btvo btvoVar, ahjq ahjqVar, axwq axwqVar, final bzlz bzlzVar, cqat cqatVar) {
        this.b = akfaVar;
        this.c = btvoVar;
        this.d = ahjqVar;
        this.e = axwqVar;
        this.f = bzlzVar;
        this.g = cqatVar;
        deha.q(bzlzVar.b.c(new Callable(bzlzVar) { // from class: bzly
            private final bzlz a;

            {
                this.a = bzlzVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                bzlz bzlzVar2 = this.a;
                bvrj.UI_THREAD.d();
                return bzlzVar2.a.a().a();
            }
        }), new bzma(this), dege.a);
    }

    private static boolean b(@dzsi GmmLocation gmmLocation, @dzsi azva azvaVar, int i) {
        akqq akqqVar;
        return (gmmLocation == null || (akqqVar = azvaVar.e) == null || gmmLocation.F(akqqVar) >= ((float) i)) ? false : true;
    }

    private static boolean c(@dzsi GmmLocation gmmLocation, @dzsi azxa azxaVar, int i) {
        if (gmmLocation != null && azxaVar != null && azxaVar.d() != null) {
            akqq d = azxaVar.d();
            dbsk.s(d);
            if (gmmLocation.F(d) < i) {
                return true;
            }
        }
        return false;
    }

    @dzsi
    private static azva d(List<azva> list, dndr dndrVar) {
        for (azva azvaVar : list) {
            if (dndrVar.equals(azvaVar.a)) {
                return azvaVar;
            }
        }
        return null;
    }

    @dzsi
    private static azxa e(List<azxa> list, dndr dndrVar) {
        for (azxa azxaVar : list) {
            if (dndrVar.equals(azxaVar.g())) {
                return azxaVar;
            }
        }
        return null;
    }

    private static eapg f(dpoj dpojVar) {
        return new eapg(dpojVar.b, dpojVar.c, dpojVar.d);
    }

    private static boolean g(dcdc<azva> dcdcVar, dcdc<azxa> dcdcVar2) {
        return d(dcdcVar, dndr.HOME) == null && d(dcdcVar, dndr.WORK) == null && e(dcdcVar2, dndr.INFERRED_HOME) == null && e(dcdcVar2, dndr.INFERRED_WORK) == null;
    }

    @Override // defpackage.bzmc
    public final int a() {
        int i;
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drjj drjjVar2;
        drjl drjlVar2;
        drke drkeVar2;
        btlu j = this.b.j();
        if (j == null || !j.u()) {
            return 1;
        }
        GmmLocation a = this.d.a();
        if (!this.e.f().isDone()) {
            return 4;
        }
        dcdc<azva> n = this.e.n();
        dcdc<axxe> h = this.e.y().a().h();
        dbsk.s(h);
        if (h.isEmpty()) {
            int i2 = this.c.getSuggestParameters().g;
            i = this.c.getSuggestParameters().f;
            if (g(n, this.a)) {
                return 5;
            }
        } else {
            int i3 = this.c.getSuggestParameters().f;
            if (g(n, this.a)) {
                dcdc<axxe> h2 = this.e.y().a().h();
                dbsk.s(h2);
                eapg eapgVar = new eapg(this.g.b());
                long b = this.g.b() / 1000;
                for (axxe axxeVar : h2) {
                    dpoj dpojVar = axxeVar.a().e;
                    if (dpojVar == null) {
                        dpojVar = dpoj.e;
                    }
                    boolean D = f(dpojVar).D(eapgVar);
                    dpoj dpojVar2 = axxeVar.a().f;
                    if (dpojVar2 == null) {
                        dpojVar2 = dpoj.e;
                    }
                    boolean D2 = f(dpojVar2).D(eapgVar);
                    int i4 = 0;
                    if (!D) {
                        if (D2) {
                            dcdc<drjs> b2 = axxeVar.b();
                            int size = b2.size();
                            while (i4 < size) {
                                drjs drjsVar = b2.get(i4);
                                drjr drjrVar = drjr.FLIGHT_RESERVATION;
                                int ordinal = drjr.a(drjsVar.a).ordinal();
                                if (ordinal == 0) {
                                    if (drjsVar.a == 3) {
                                        drjjVar2 = (drjj) drjsVar.b;
                                    } else {
                                        drjjVar2 = drjj.c;
                                    }
                                    drjh drjhVar = drjjVar2.a;
                                    if (drjhVar == null) {
                                        drjhVar = drjh.j;
                                    }
                                    dqfu dqfuVar = drjhVar.d;
                                    if (dqfuVar == null) {
                                        dqfuVar = dqfu.d;
                                    }
                                    drjh drjhVar2 = (drjsVar.a == 3 ? (drjj) drjsVar.b : drjj.c).a;
                                    if (drjhVar2 == null) {
                                        drjhVar2 = drjh.j;
                                    }
                                    if ((drjhVar2.a & 4) != 0 && dqfuVar.b > b) {
                                    }
                                    i4++;
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        if (drjsVar.a == 5) {
                                            drkeVar2 = (drke) drjsVar.b;
                                        } else {
                                            drkeVar2 = drke.k;
                                        }
                                        dqfu dqfuVar2 = drkeVar2.f;
                                        if (dqfuVar2 == null) {
                                            dqfuVar2 = dqfu.d;
                                        }
                                        if (((drjsVar.a == 5 ? (drke) drjsVar.b : drke.k).a & 32) != 0 && dqfuVar2.b > b) {
                                        }
                                    } else {
                                        continue;
                                    }
                                    i4++;
                                } else {
                                    if (drjsVar.a == 4) {
                                        drjlVar2 = (drjl) drjsVar.b;
                                    } else {
                                        drjlVar2 = drjl.f;
                                    }
                                    dqfu dqfuVar3 = drjlVar2.d;
                                    if (dqfuVar3 == null) {
                                        dqfuVar3 = dqfu.d;
                                    }
                                    if (((drjsVar.a == 4 ? (drjl) drjsVar.b : drjl.f).a & 8) != 0 && dqfuVar3.b > b) {
                                    }
                                    i4++;
                                }
                            }
                            continue;
                        }
                    }
                    dcdc<drjs> b3 = axxeVar.b();
                    int size2 = b3.size();
                    while (i4 < size2) {
                        drjs drjsVar2 = b3.get(i4);
                        drjr drjrVar2 = drjr.FLIGHT_RESERVATION;
                        int ordinal2 = drjr.a(drjsVar2.a).ordinal();
                        if (ordinal2 == 0) {
                            if (drjsVar2.a == 3) {
                                drjjVar = (drjj) drjsVar2.b;
                            } else {
                                drjjVar = drjj.c;
                            }
                            drjh drjhVar3 = drjjVar.a;
                            if (drjhVar3 == null) {
                                drjhVar3 = drjh.j;
                            }
                            dqfu dqfuVar4 = drjhVar3.e;
                            if (dqfuVar4 == null) {
                                dqfuVar4 = dqfu.d;
                            }
                            drjh drjhVar4 = (drjsVar2.a == 3 ? (drjj) drjsVar2.b : drjj.c).a;
                            if (drjhVar4 == null) {
                                drjhVar4 = drjh.j;
                            }
                            if ((drjhVar4.a & 8) != 0 && dqfuVar4.b < b) {
                            }
                            i4++;
                        } else if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                if (drjsVar2.a == 5) {
                                    drkeVar = (drke) drjsVar2.b;
                                } else {
                                    drkeVar = drke.k;
                                }
                                dqfu dqfuVar5 = drkeVar.i;
                                if (dqfuVar5 == null) {
                                    dqfuVar5 = dqfu.d;
                                }
                                if (((drjsVar2.a == 5 ? (drke) drjsVar2.b : drke.k).a & 256) != 0 && dqfuVar5.b < b) {
                                }
                            } else {
                                continue;
                            }
                            i4++;
                        } else {
                            if (drjsVar2.a == 4) {
                                drjlVar = (drjl) drjsVar2.b;
                            } else {
                                drjlVar = drjl.f;
                            }
                            dqfu dqfuVar6 = drjlVar.c;
                            if (dqfuVar6 == null) {
                                dqfuVar6 = dqfu.d;
                            }
                            if (((drjsVar2.a == 4 ? (drjl) drjsVar2.b : drjl.f).a & 2) != 0 && dqfuVar6.b < b) {
                            }
                            i4++;
                        }
                    }
                    continue;
                }
                return 5;
            }
            i = i3;
        }
        dcdc<azxa> dcdcVar = this.a;
        azva d = d(n, dndr.HOME);
        azva d2 = d(n, dndr.WORK);
        azxa e = e(dcdcVar, dndr.INFERRED_HOME);
        azxa e2 = e(dcdcVar, dndr.INFERRED_WORK);
        if (d == null ? c(a, e, i) : b(a, d, i)) {
            return 3;
        }
        return (d2 == null ? c(a, e2, i) : b(a, d2, i)) ? 3 : 2;
    }
}
