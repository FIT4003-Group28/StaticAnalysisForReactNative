package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxto  reason: default package */
/* loaded from: classes4.dex */
public final class bxto {
    static final Comparator<azva> a = bxtl.a;
    public final dxio<axwq> b;
    public final dxio<akfa> c;
    public final bxte d;
    public final bato e;
    public final dxio<wdy> f;
    public final ahjq g;
    public final btvo h;
    public final Executor i;
    public final bxsj j;
    public final cqat k;
    public final boolean l;
    @dzsi
    public bxtn m;
    public final HashSet<azva> n = new HashSet<>();
    public final ArrayList<azva> o = new ArrayList<>();
    private final dehp p;
    private final boolean q;

    public bxto(dxio<axwq> dxioVar, dxio<akfa> dxioVar2, bxtf bxtfVar, bato batoVar, ahjq ahjqVar, btvo btvoVar, dxio<wdy> dxioVar3, cqat cqatVar, Executor executor, dehp dehpVar, bxsj bxsjVar, boolean z, boolean z2, wfz wfzVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        cqhn a2 = bxtfVar.a.a();
        bxtf.a(a2, 1);
        dxio a3 = ((dxjh) bxtfVar.b).a();
        bxtf.a(a3, 2);
        dxio a4 = ((dxjh) bxtfVar.c).a();
        bxtf.a(a4, 3);
        dxio a5 = ((dxjh) bxtfVar.d).a();
        bxtf.a(a5, 4);
        wfx a6 = bxtfVar.e.a();
        bxtf.a(a6, 5);
        dxio a7 = ((dxjh) bxtfVar.f).a();
        bxtf.a(a7, 6);
        dxio a8 = ((dxjh) bxtfVar.g).a();
        bxtf.a(a8, 7);
        dxio a9 = ((dxjh) bxtfVar.h).a();
        bxtf.a(a9, 8);
        gga a10 = bxtfVar.i.a();
        bxtf.a(a10, 9);
        wdw a11 = bxtfVar.j.a();
        bxtf.a(a11, 10);
        wdy a12 = bxtfVar.k.a();
        bxtf.a(a12, 11);
        cjqy a13 = bxtfVar.l.a();
        bxtf.a(a13, 12);
        cjqq a14 = bxtfVar.m.a();
        bxtf.a(a14, 13);
        bxtf.a(wfzVar, 16);
        this.d = new bxte(a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, z, false, wfzVar);
        this.e = batoVar;
        this.g = ahjqVar;
        this.h = btvoVar;
        this.f = dxioVar3;
        this.j = bxsjVar;
        this.q = z;
        this.p = dehpVar;
        this.i = executor;
        this.l = false;
        this.k = cqatVar;
    }

    public static boolean b(@dzsi GmmLocation gmmLocation, @dzsi azva azvaVar, int i) {
        akqq akqqVar;
        return (gmmLocation == null || azvaVar == null || (akqqVar = azvaVar.e) == null || gmmLocation.F(akqqVar) >= ((float) i)) ? false : true;
    }

    @dzsi
    public static azva c(dcdc<azva> dcdcVar, dcdc<azva> dcdcVar2, dndr dndrVar) {
        int size = dcdcVar2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            azva azvaVar = dcdcVar2.get(i2);
            i2++;
            if (azvaVar.a.equals(dndrVar)) {
                return azvaVar;
            }
        }
        int size2 = dcdcVar.size();
        while (i < size2) {
            azva azvaVar2 = dcdcVar.get(i);
            i++;
            if (azvaVar2.a.equals(dndrVar)) {
                return azvaVar2;
            }
        }
        return null;
    }

    @dzsi
    public static azva f(List<azva> list, dndr dndrVar) {
        for (azva azvaVar : list) {
            if (dndrVar.equals(azvaVar.a)) {
                return azvaVar;
            }
        }
        return null;
    }

    public final dehn<Void> a() {
        return this.p.c(new Callable(this) { // from class: bxtg
            private final bxto a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dcdc<azva> f;
                dcdc dcdcVar;
                bxto bxtoVar;
                drjs drjsVar;
                drjs drjsVar2;
                final dcdc<drjs> e;
                final bxto bxtoVar2;
                final dcdc<azva> e2;
                azva azvaVar;
                azva azvaVar2;
                EnumMap enumMap;
                eapg eapgVar;
                drjl drjlVar;
                drjl drjlVar2;
                bxto bxtoVar3 = this.a;
                EnumMap k = dcjz.k(dndr.class);
                if (bxtoVar3.l) {
                    if (bxtoVar3.o.isEmpty()) {
                        f = bxtoVar3.b.a().n();
                    } else {
                        dcdc<azva> n = bxtoVar3.b.a().n();
                        dccx dccxVar = new dccx();
                        azva c = bxto.c(n, dcdc.r(bxtoVar3.o), dndr.HOME);
                        if (c != null) {
                            dccxVar.g(c);
                        }
                        azva c2 = bxto.c(n, dcdc.r(bxtoVar3.o), dndr.WORK);
                        if (c2 != null) {
                            dccxVar.g(c2);
                        }
                        for (azva azvaVar3 : n) {
                            if (!azvaVar3.a.equals(dndr.WORK) && !azvaVar3.a.equals(dndr.HOME) && bxtoVar3.d(azvaVar3) == null) {
                                dccxVar.g(azvaVar3);
                            }
                        }
                        for (azva azvaVar4 : bxtoVar3.o) {
                            if (!azvaVar4.a.equals(dndr.WORK) && !azvaVar4.a.equals(dndr.HOME)) {
                                dccxVar.g(azvaVar4);
                            }
                        }
                        f = dccxVar.f();
                    }
                } else if (bxtoVar3.n.isEmpty()) {
                    f = bxtoVar3.b.a().n();
                } else {
                    dcdc<azva> n2 = bxtoVar3.b.a().n();
                    dccx dccxVar2 = new dccx();
                    dccxVar2.i(n2);
                    Iterator<azva> it = bxtoVar3.n.iterator();
                    while (it.hasNext()) {
                        azva next = it.next();
                        if (bxto.f(n2, next.a) == null) {
                            dccxVar2.g(next);
                        }
                    }
                    f = dccxVar2.f();
                }
                azva f2 = bxto.f(f, dndr.HOME);
                azva f3 = bxto.f(f, dndr.WORK);
                int i = bxtoVar3.h.getSuggestParameters().f;
                GmmLocation a2 = bxtoVar3.g.a();
                boolean z = bxto.b(a2, f2, i) || bxto.b(a2, f3, i);
                dcdc<axxe> h = bxtoVar3.b.a().y().a().h();
                dbsk.s(h);
                final eapg eapgVar2 = new eapg(bxtoVar3.k.b());
                boolean p = dcbg.b(h).s(bxtj.a).o(dbss.NOT_NULL).p(new dbsl(eapgVar2) { // from class: bxtk
                    private final eapg a;

                    {
                        this.a = eapgVar2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        eapg eapgVar3 = this.a;
                        drki drkiVar = (drki) obj;
                        if ((drkiVar.a & 4) != 0) {
                            dpoj dpojVar = drkiVar.e;
                            if (dpojVar == null) {
                                dpojVar = dpoj.e;
                            }
                            return batk.p(dpojVar).D(eapgVar3);
                        }
                        return false;
                    }
                });
                bato batoVar = bxtoVar3.e;
                v<dcdc<drjs>> c3 = bxtoVar3.b.a().y().c();
                if (c3 == null) {
                    dcdcVar = dcdc.e();
                } else {
                    dcdcVar = (dcdc) dbsc.a(c3.h(), dcdc.e());
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                eapg eapgVar3 = new eapg(batoVar.a.b());
                eapg p2 = eapgVar3.p(2);
                long b = batoVar.a.b() / 1000;
                long j = b + 3600;
                Iterator<E> it2 = dcdcVar.iterator();
                drjs drjsVar3 = null;
                drjs drjsVar4 = null;
                while (true) {
                    bxtoVar = bxtoVar3;
                    if (!it2.hasNext()) {
                        break;
                    }
                    drjs drjsVar5 = (drjs) it2.next();
                    drjr drjrVar = drjr.FLIGHT_RESERVATION;
                    dcdc<azva> dcdcVar2 = f;
                    int ordinal = drjr.a(drjsVar5.a).ordinal();
                    if (ordinal != 0) {
                        azvaVar2 = f3;
                        if (ordinal == 1) {
                            enumMap = k;
                            if (drjsVar5.a == 4) {
                                drjlVar = (drjl) drjsVar5.b;
                            } else {
                                drjlVar = drjl.f;
                            }
                            dqfu dqfuVar = drjlVar.c;
                            if (dqfuVar == null) {
                                dqfuVar = dqfu.d;
                            }
                            eapg q = batk.q(dqfuVar);
                            azvaVar = f2;
                            if (drjsVar5.a == 4) {
                                drjlVar2 = (drjl) drjsVar5.b;
                            } else {
                                drjlVar2 = drjl.f;
                            }
                            dqfu dqfuVar2 = drjlVar2.d;
                            if (dqfuVar2 == null) {
                                dqfuVar2 = dqfu.d;
                            }
                            eapg q2 = batk.q(dqfuVar2);
                            if (q.D(eapgVar3)) {
                                arrayList3.add(drjsVar5);
                            } else if (q2.D(eapgVar3)) {
                                arrayList.add(drjsVar5);
                            } else if (q.C(eapgVar3) && q2.B(eapgVar3)) {
                                arrayList2.add(drjsVar5);
                            }
                        } else if (ordinal == 2 || ordinal == 3) {
                            enumMap = k;
                            azvaVar = f2;
                        } else {
                            if ((ordinal == 4 || ordinal == 6) && bato.c(drjsVar5, b)) {
                                enumMap = k;
                                if (batk.c(drjsVar5).b < j && bato.b(batk.e(drjsVar5)) && bato.d(drjsVar4, drjsVar5)) {
                                    drjsVar4 = drjsVar5;
                                }
                            } else {
                                enumMap = k;
                            }
                            azvaVar = f2;
                        }
                        eapgVar = p2;
                        p2 = eapgVar;
                        k = enumMap;
                        f3 = azvaVar2;
                        bxtoVar3 = bxtoVar;
                        f = dcdcVar2;
                        f2 = azvaVar;
                    } else {
                        azvaVar = f2;
                        azvaVar2 = f3;
                        enumMap = k;
                    }
                    if (bato.c(drjsVar5, b)) {
                        eapgVar = p2;
                        if (batk.q(batk.c(drjsVar5)).C(eapgVar) && bato.b(batk.e(drjsVar5)) && bato.d(drjsVar3, drjsVar5)) {
                            drjsVar3 = drjsVar5;
                        }
                        p2 = eapgVar;
                        k = enumMap;
                        f3 = azvaVar2;
                        bxtoVar3 = bxtoVar;
                        f = dcdcVar2;
                        f2 = azvaVar;
                    }
                    eapgVar = p2;
                    p2 = eapgVar;
                    k = enumMap;
                    f3 = azvaVar2;
                    bxtoVar3 = bxtoVar;
                    f = dcdcVar2;
                    f2 = azvaVar;
                }
                dcdc<azva> dcdcVar3 = f;
                azva azvaVar5 = f2;
                azva azvaVar6 = f3;
                final EnumMap enumMap2 = k;
                if (arrayList2.isEmpty()) {
                    if (new eaph(batoVar.a.b()).q() >= 12) {
                        drjsVar = bato.a(arrayList3);
                    } else {
                        drjsVar = bato.a(arrayList);
                        if (drjsVar == null) {
                            drjsVar = bato.a(arrayList3);
                        } else {
                            drjsVar2 = bato.a(arrayList3);
                        }
                    }
                    drjsVar2 = null;
                } else if (arrayList2.size() != 1 || !arrayList3.isEmpty() || !arrayList.isEmpty()) {
                    arrayList2.size();
                    arrayList.size();
                    arrayList3.size();
                    drjsVar = null;
                    drjsVar2 = null;
                } else {
                    drjsVar = bato.a(arrayList2);
                    drjsVar2 = null;
                }
                if (p && !batk.q(batk.c(drjsVar3)).D(eapgVar3)) {
                    drjsVar3 = null;
                }
                if (drjsVar4 == null || !bato.d(drjsVar3, drjsVar4)) {
                    drjs drjsVar6 = drjsVar4;
                    drjsVar4 = drjsVar3;
                    drjsVar3 = drjsVar6;
                }
                if (z) {
                    e = bato.e(drjsVar4, drjsVar, drjsVar2, drjsVar3);
                } else {
                    e = bato.e(drjsVar, drjsVar4, drjsVar3, drjsVar2);
                }
                if (e.isEmpty()) {
                    bxtoVar2 = bxtoVar;
                    enumMap2.put((EnumMap) dndr.HOME, (dndr) azvaVar5);
                    enumMap2.put((EnumMap) dndr.WORK, (dndr) azvaVar6);
                    e2 = bxtoVar2.e(dcdcVar3);
                } else if (z) {
                    enumMap2.put((EnumMap) dndr.HOME, (dndr) azvaVar5);
                    if (!p) {
                        enumMap2.put((EnumMap) dndr.WORK, (dndr) azvaVar6);
                    }
                    bxtoVar2 = bxtoVar;
                    e2 = bxtoVar2.e(dcdcVar3);
                } else {
                    bxtoVar2 = bxtoVar;
                    e2 = dcdc.e();
                }
                bxtoVar2.i.execute(new Runnable(bxtoVar2, enumMap2, e, e2) { // from class: bxth
                    private final bxto a;
                    private final EnumMap b;
                    private final dcdc c;
                    private final dcdc d;

                    {
                        this.a = bxtoVar2;
                        this.b = enumMap2;
                        this.c = e;
                        this.d = e2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bxto bxtoVar4 = this.a;
                        EnumMap<dndr, azva> enumMap3 = this.b;
                        dcdc dcdcVar4 = this.c;
                        dcdc dcdcVar5 = this.d;
                        bxte bxteVar = bxtoVar4.d;
                        if (bxtoVar4.m == null) {
                            bxtoVar4.m = new bxtn(bxtoVar4);
                        }
                        bxteVar.f(enumMap3, dcdcVar4, dcdcVar5, bxtoVar4.m, bxtoVar4.j);
                    }
                });
                return null;
            }
        });
    }

    @dzsi
    public final azva d(azva azvaVar) {
        ArrayList<azva> arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            azva azvaVar2 = arrayList.get(i);
            if (akqi.d(azvaVar.c) && azvaVar.c.equals(azvaVar2.c)) {
                return azvaVar2;
            }
            i++;
            if (azvaVar.j(azvaVar2.e)) {
                return azvaVar2;
            }
        }
        return null;
    }

    public final dcdc<azva> e(List<azva> list) {
        if (this.q) {
            dcdc A = dcbg.b(list).o(new dbsl(this) { // from class: bxti
                private final bxto a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    azva azvaVar = (azva) obj;
                    return azvaVar.a == dndr.NICKNAME && this.a.f.a().b(wdv.g(azvaVar.b.longValue()));
                }
            }).A(a);
            return A.subList(0, Math.min(A.size(), 20));
        }
        return dcdc.e();
    }
}
