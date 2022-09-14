package defpackage;

import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cyob  reason: default package */
/* loaded from: classes5.dex */
public final class cyob {
    public static cyit a(dheh dhehVar, cylv cylvVar) {
        cymg cymgVar;
        dhea dheaVar;
        dufk dufkVar;
        cyiq bZ = cyit.d.bZ();
        for (dhdp dhdpVar : dhehVar.a) {
            int i = dhdpVar.a;
            if (i == 4) {
                cyma bZ2 = cymg.d.bZ();
                if (dhdpVar.a == 4) {
                    dufkVar = (dufk) dhdpVar.b;
                } else {
                    dufkVar = dufk.i;
                }
                cylo e = e(dufkVar);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cymg cymgVar2 = (cymg) bZ2.b;
                e.getClass();
                cymgVar2.b = e;
                cymgVar2.a = 2;
                ((cymg) bZ2.b).c = cymf.a(3);
                cymgVar = bZ2.bK();
            } else if (i == 5) {
                cyma bZ3 = cymg.d.bZ();
                if (dhdpVar.a == 5) {
                    dheaVar = (dhea) dhdpVar.b;
                } else {
                    dheaVar = dhea.e;
                }
                String str = dhdpVar.c;
                cykb bZ4 = cyke.f.bZ();
                String str2 = dheaVar.a;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                str2.getClass();
                ((cyke) bZ4.b).a = str2;
                List<cyle> i2 = i(dheaVar.b);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                cyke cykeVar = (cyke) bZ4.b;
                cykeVar.b();
                dsod.bv(i2, cykeVar.b);
                List<cyjo> j = j(dheaVar.c);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                cyke cykeVar2 = (cyke) bZ4.b;
                dsrj<cyjo> dsrjVar = cykeVar2.c;
                if (!dsrjVar.a()) {
                    cykeVar2.c = dsqw.cl(dsrjVar);
                }
                dsod.bv(j, cykeVar2.c);
                if (dheaVar.b.isEmpty() && !dbsj.d(str)) {
                    cyld bZ5 = cyle.e.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    str.getClass();
                    ((cyle) bZ5.b).a = str;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    cyke cykeVar3 = (cyke) bZ4.b;
                    cyle bK = bZ5.bK();
                    bK.getClass();
                    cykeVar3.b();
                    cykeVar3.b.add(bK);
                }
                dayp daypVar = dheaVar.d;
                if (daypVar != null) {
                    cykc bZ6 = cykd.b.bZ();
                    daxu daxuVar = daypVar.b;
                    if (daxuVar == null) {
                        daxuVar = daxu.j;
                    }
                    cyjh f = f(daxuVar);
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    f.getClass();
                    ((cykd) bZ6.b).a = f;
                    cykd bK2 = bZ6.bK();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    bK2.getClass();
                    ((cyke) bZ4.b).e = bK2;
                    dayp daypVar2 = dheaVar.d;
                    if (daypVar2 == null) {
                        daypVar2 = dayp.c;
                    }
                    if ((daypVar2.a & 1) != 0) {
                        dayp daypVar3 = dheaVar.d;
                        if (daypVar3 == null) {
                            daypVar3 = dayp.c;
                        }
                        daxu daxuVar2 = daypVar3.b;
                        if (daxuVar2 == null) {
                            daxuVar2 = daxu.j;
                        }
                        if ((daxuVar2.a & 8) != 0) {
                            dayp daypVar4 = dheaVar.d;
                            if (daypVar4 == null) {
                                daypVar4 = dayp.c;
                            }
                            daxu daxuVar3 = daypVar4.b;
                            if (daxuVar3 == null) {
                                daxuVar3 = daxu.j;
                            }
                            String str3 = daxuVar3.e;
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            str3.getClass();
                            ((cyke) bZ4.b).d = str3;
                        }
                    }
                }
                cyke bK3 = bZ4.bK();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                cymg cymgVar3 = (cymg) bZ3.b;
                bK3.getClass();
                cymgVar3.b = bK3;
                cymgVar3.a = 3;
                ((cymg) bZ3.b).c = cymf.a(3);
                cymgVar = bZ3.bK();
            } else {
                cymgVar = null;
            }
            if (cymgVar != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cyit cyitVar = (cyit) bZ.b;
                cymgVar.getClass();
                dsrj<cymg> dsrjVar2 = cyitVar.a;
                if (!dsrjVar2.a()) {
                    cyitVar.a = dsqw.cl(dsrjVar2);
                }
                cyitVar.a.add(cymgVar);
            }
        }
        cyir bZ7 = cyis.c.bZ();
        dhdn dhdnVar = dhehVar.c;
        if (dhdnVar == null) {
            dhdnVar = dhdn.b;
        }
        boolean z = dhdnVar.a;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        cyis cyisVar = (cyis) bZ7.b;
        cyisVar.a = z;
        String str4 = dhehVar.b;
        str4.getClass();
        cyisVar.b = str4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyis bK4 = bZ7.bK();
        bK4.getClass();
        ((cyit) bZ.b).b = bK4;
        cylg a = cylvVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((cyit) bZ.b).c = a;
        return bZ.bK();
    }

    public static cyka b(dhdy dhdyVar, cylv cylvVar) {
        cyjw bZ = cyka.c.bZ();
        for (dhfi dhfiVar : dhdyVar.a) {
            dtyp dtypVar = dhfiVar.c;
            if (dtypVar == null) {
                dtypVar = dtyp.d;
            }
            if (dtypVar.a == dtyn.a(2)) {
                String str = dhfiVar.a;
                cyjx bZ2 = cyjy.b.bZ();
                dufk dufkVar = dhfiVar.b;
                if (dufkVar == null) {
                    dufkVar = dufk.i;
                }
                cylo e = e(dufkVar);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                e.getClass();
                ((cyjy) bZ2.b).a = e;
                cyjy bK = bZ2.bK();
                str.getClass();
                bK.getClass();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cyka cykaVar = (cyka) bZ.b;
                dssd<String, cyjy> dssdVar = cykaVar.a;
                if (!dssdVar.a) {
                    cykaVar.a = dssdVar.a();
                }
                cykaVar.a.put(str, bK);
            }
        }
        cylg a = cylvVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((cyka) bZ.b).b = a;
        return bZ.bK();
    }

    public static cykt c(dhep dhepVar, cylv cylvVar) {
        cykp bZ = cykt.d.bZ();
        for (dhen dhenVar : dhepVar.a) {
            cykq bZ2 = cykr.c.bZ();
            String str = dhenVar.a;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            str.getClass();
            ((cykr) bZ2.b).a = str;
            dsrj<String> dsrjVar = dhenVar.b;
            cykr cykrVar = (cykr) bZ2.b;
            dsrj<String> dsrjVar2 = cykrVar.b;
            if (!dsrjVar2.a()) {
                cykrVar.b = dsqw.cl(dsrjVar2);
            }
            dsod.bv(dsrjVar, cykrVar.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cykt cyktVar = (cykt) bZ.b;
            cykr bK = bZ2.bK();
            bK.getClass();
            dsrj<cykr> dsrjVar3 = cyktVar.a;
            if (!dsrjVar3.a()) {
                cyktVar.a = dsqw.cl(dsrjVar3);
            }
            cyktVar.a.add(bK);
        }
        for (Map.Entry entry : Collections.unmodifiableMap(dhepVar.b).entrySet()) {
            String str2 = (String) entry.getKey();
            cylo e = e((dufk) entry.getValue());
            str2.getClass();
            e.getClass();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            cykt cyktVar2 = (cykt) bZ.b;
            dssd<String, cylo> dssdVar = cyktVar2.b;
            if (!dssdVar.a) {
                cyktVar2.b = dssdVar.a();
            }
            cyktVar2.b.put(str2, e);
        }
        cylg a = cylvVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((cykt) bZ.b).c = a;
        return bZ.bK();
    }

    public static cylc d(dhet dhetVar, cylv cylvVar) {
        final dcdn D = dcbg.b(dhetVar.a).o(cynt.a).s(cynu.a).D(cynv.a);
        cylb bZ = cylc.d.bZ();
        dcbg o = dcbg.b(dhetVar.a).x(dhetVar.b).s(new dbrn(D) { // from class: cynk
            private final Map a;

            {
                this.a = D;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Map map = this.a;
                dhfk dhfkVar = (dhfk) obj;
                int i = dhfkVar.a;
                if (i == 2) {
                    cyma bZ2 = cymg.d.bZ();
                    cylo cyloVar = (cylo) map.get((dhfkVar.a == 2 ? (dufk) dhfkVar.b : dufk.i).a);
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    cymg cymgVar = (cymg) bZ2.b;
                    cyloVar.getClass();
                    cymgVar.b = cyloVar;
                    cymgVar.a = 2;
                    ((cymg) bZ2.b).c = cymf.a(4);
                    return bZ2.bK();
                }
                int i2 = 1;
                if (i != 1) {
                    return null;
                }
                cyma bZ3 = cymg.d.bZ();
                duge dugeVar = dhfkVar.a == 1 ? (duge) dhfkVar.b : duge.e;
                cymb bZ4 = cyme.f.bZ();
                String str = dugeVar.b;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                str.getClass();
                ((cyme) bZ4.b).a = str;
                for (dugg duggVar : dugeVar.c) {
                    if (duggVar.a == 2) {
                        dufw dufwVar = ((dufs) duggVar.b).a;
                        if (dufwVar == null) {
                            dufwVar = dufw.b;
                        }
                        if (map.containsKey(dufwVar.a)) {
                            dufw dufwVar2 = (duggVar.a == 2 ? (dufs) duggVar.b : dufs.c).a;
                            if (dufwVar2 == null) {
                                dufwVar2 = dufw.b;
                            }
                            cylo cyloVar2 = (cylo) map.get(dufwVar2.a);
                            dsrj<dufr> dsrjVar = (duggVar.a == 2 ? (dufs) duggVar.b : dufs.c).b;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            for (dufr dufrVar : dsrjVar) {
                                if (dufrVar.a == 2 && ((Integer) dufrVar.b).intValue() >= 0) {
                                    int a = dufq.a(dufrVar.c);
                                    if (a == 0) {
                                        a = 1;
                                    }
                                    int i3 = a - 1;
                                    if (i3 == i2) {
                                        if ((dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0) < cyloVar2.d.size()) {
                                            arrayList.add(cyloVar2.d.get(dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0));
                                        }
                                    } else if (i3 == 2) {
                                        if ((dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0) < cyloVar2.e.size()) {
                                            arrayList2.add(cyloVar2.e.get(dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0));
                                        }
                                    } else if (i3 == 3) {
                                        if ((dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0) < cyloVar2.f.size()) {
                                            arrayList3.add(cyloVar2.f.get(dufrVar.a == 2 ? ((Integer) dufrVar.b).intValue() : 0));
                                        }
                                    }
                                    i2 = 1;
                                }
                            }
                            if (!arrayList.isEmpty() || !arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                                dsqp dsqpVar = (dsqp) cyloVar2.cu(5);
                                dsqpVar.bC(cyloVar2);
                                cyll cyllVar = (cyll) dsqpVar;
                                if (cyllVar.c) {
                                    cyllVar.bF();
                                    cyllVar.c = false;
                                }
                                cylo cyloVar3 = cylo.k;
                                ((cylo) cyllVar.b).d = cylo.ck();
                                if (cyllVar.c) {
                                    cyllVar.bF();
                                    cyllVar.c = false;
                                }
                                ((cylo) cyllVar.b).e = cylo.ck();
                                if (cyllVar.c) {
                                    cyllVar.bF();
                                    cyllVar.c = false;
                                }
                                ((cylo) cyllVar.b).f = cylo.ck();
                                cyllVar.a(arrayList);
                                cyllVar.c(arrayList2);
                                cyllVar.b(arrayList3);
                                cyloVar2 = cyllVar.bK();
                            }
                            cyma bZ5 = cymg.d.bZ();
                            if (bZ5.c) {
                                bZ5.bF();
                                bZ5.c = false;
                            }
                            cymg cymgVar2 = (cymg) bZ5.b;
                            cyloVar2.getClass();
                            cymgVar2.b = cyloVar2;
                            cymgVar2.a = 2;
                            ((cymg) bZ5.b).c = cymf.a(4);
                            if (bZ4.c) {
                                bZ4.bF();
                                bZ4.c = false;
                            }
                            cyme cymeVar = (cyme) bZ4.b;
                            cymg bK = bZ5.bK();
                            bK.getClass();
                            dsrj<cymg> dsrjVar2 = cymeVar.b;
                            if (!dsrjVar2.a()) {
                                cymeVar.b = dsqw.cl(dsrjVar2);
                            }
                            cymeVar.b.add(bK);
                            i2 = 1;
                        }
                    }
                }
                for (dugm dugmVar : dugeVar.d) {
                    cymc bZ6 = cymd.d.bZ();
                    cyld bZ7 = cyle.e.bZ();
                    dugk dugkVar = dugmVar.b;
                    if (dugkVar == null) {
                        dugkVar = dugk.b;
                    }
                    String str2 = dugkVar.a;
                    if (bZ7.c) {
                        bZ7.bF();
                        bZ7.c = false;
                    }
                    str2.getClass();
                    ((cyle) bZ7.b).a = str2;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    cyle bK2 = bZ7.bK();
                    bK2.getClass();
                    ((cymd) bZ6.b).a = bK2;
                    cylr bZ8 = cyls.d.bZ();
                    dugo dugoVar = dugmVar.c;
                    if (dugoVar == null) {
                        dugoVar = dugo.b;
                    }
                    String str3 = dugoVar.a;
                    if (bZ8.c) {
                        bZ8.bF();
                        bZ8.c = false;
                    }
                    str3.getClass();
                    ((cyls) bZ8.b).a = str3;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    cyls bK3 = bZ8.bK();
                    bK3.getClass();
                    ((cymd) bZ6.b).b = bK3;
                    String str4 = dugmVar.a;
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    str4.getClass();
                    ((cymd) bZ6.b).c = str4;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    cyme cymeVar2 = (cyme) bZ4.b;
                    cymd bK4 = bZ6.bK();
                    bK4.getClass();
                    dsrj<cymd> dsrjVar3 = cymeVar2.c;
                    if (!dsrjVar3.a()) {
                        cymeVar2.c = dsqw.cl(dsrjVar3);
                    }
                    cymeVar2.c.add(bK4);
                }
                dugi dugiVar = dugeVar.a;
                if (dugiVar == null) {
                    dugiVar = dugi.c;
                }
                duef duefVar = dugiVar.a;
                if (duefVar == null) {
                    duefVar = duef.e;
                }
                cyil h = cyob.h(duefVar);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                h.getClass();
                ((cyme) bZ4.b).d = h;
                dugi dugiVar2 = dugeVar.a;
                if (dugiVar2 == null) {
                    dugiVar2 = dugi.c;
                }
                long j = dugiVar2.b;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                ((cyme) bZ4.b).e = j;
                cyme bK5 = bZ4.bK();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                cymg cymgVar3 = (cymg) bZ3.b;
                bK5.getClass();
                cymgVar3.b = bK5;
                cymgVar3.a = 4;
                ((cymg) bZ3.b).c = cymf.a(4);
                return bZ3.bK();
            }
        }).o(dbss.NOT_NULL);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylc cylcVar = (cylc) bZ.b;
        dsrj<cymg> dsrjVar = cylcVar.a;
        if (!dsrjVar.a()) {
            cylcVar.a = dsqw.cl(dsrjVar);
        }
        dsod.bv(o, cylcVar.a);
        cykw bZ2 = cyla.c.bZ();
        dudy dudyVar = dhetVar.c;
        if (dudyVar == null) {
            dudyVar = dudy.d;
        }
        int i = dudyVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyla) bZ2.b).a = i;
        dudy dudyVar2 = dhetVar.c;
        if (dudyVar2 == null) {
            dudyVar2 = dudy.d;
        }
        dcbg s = dcbg.b(dudyVar2.c).s(cyns.a);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        cyla cylaVar = (cyla) bZ2.b;
        dsrj<cykz> dsrjVar2 = cylaVar.b;
        if (!dsrjVar2.a()) {
            cylaVar.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(s, cylaVar.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyla bK = bZ2.bK();
        bK.getClass();
        ((cylc) bZ.b).b = bK;
        cylg a = cylvVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        a.getClass();
        ((cylc) bZ.b).c = a;
        return bZ.bK();
    }

    public static cylo e(dufk dufkVar) {
        int i;
        boolean z;
        int i2;
        List<cyjo> j = j(dufkVar.e);
        dcdc z2 = dcbg.b(dufkVar.f).s(cynn.a).z();
        cyll bZ = cylo.k.bZ();
        String str = dufkVar.a;
        boolean z3 = false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        str.getClass();
        ((cylo) bZ.b).a = str;
        List<cyle> i3 = i(dufkVar.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylo cyloVar = (cylo) bZ.b;
        dsrj<cyle> dsrjVar = cyloVar.b;
        if (!dsrjVar.a()) {
            cyloVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(i3, cyloVar.b);
        bZ.a(j);
        bZ.c(z2);
        dufu dufuVar = dufkVar.b;
        if (dufuVar == null) {
            dufuVar = dufu.d;
        }
        duev duevVar = dufuVar.b;
        if (duevVar == null) {
            duevVar = duev.b;
        }
        Iterable s = dcbg.b(duevVar.a).o(cynw.a).s(cynx.a);
        dufu dufuVar2 = dufkVar.b;
        if (dufuVar2 == null) {
            dufuVar2 = dufu.d;
        }
        String str2 = dufuVar2.c;
        if (!s.iterator().hasNext()) {
            if (str2.isEmpty() || str2.equals("0")) {
                s = dcdc.e();
            } else {
                s = dcdc.f(str2);
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylo cyloVar2 = (cylo) bZ.b;
        dsrj<String> dsrjVar2 = cyloVar2.g;
        if (!dsrjVar2.a()) {
            cyloVar2.g = dsqw.cl(dsrjVar2);
        }
        dsod.bv(s, cyloVar2.g);
        dufu dufuVar3 = dufkVar.b;
        if (dufuVar3 == null) {
            dufuVar3 = dufu.d;
        }
        duev duevVar2 = dufuVar3.b;
        if (duevVar2 == null) {
            duevVar2 = duev.b;
        }
        dcbg s2 = dcbg.b(duevVar2.a).s(cyny.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylo cyloVar3 = (cylo) bZ.b;
        dsrj<cylz> dsrjVar3 = cyloVar3.h;
        if (!dsrjVar3.a()) {
            cyloVar3.h = dsqw.cl(dsrjVar3);
        }
        dsod.bv(s2, cyloVar3.h);
        dcbg s3 = dcbg.b(dufkVar.d).s(cynz.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylo cyloVar4 = (cylo) bZ.b;
        dsrj<cyls> dsrjVar4 = cyloVar4.c;
        if (!dsrjVar4.a()) {
            cyloVar4.c = dsqw.cl(dsrjVar4);
        }
        dsod.bv(s3, cyloVar4.c);
        dsrj<dufg> dsrjVar5 = dufkVar.h;
        dccx F = dcdc.F();
        for (dufg dufgVar : dsrjVar5) {
            cykh bZ2 = cykl.g.bZ();
            dcbg<cykg> s4 = dcbg.b(new dsrh(dufgVar.b, dufg.c)).s(cyno.a);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = z3;
            }
            cykl cyklVar = (cykl) bZ2.b;
            dsrf dsrfVar = cyklVar.a;
            if (!dsrfVar.a()) {
                cyklVar.a = dsqw.cg(dsrfVar);
            }
            for (cykg cykgVar : s4) {
                cyklVar.a.h(cykgVar.a());
            }
            int a = duff.a(dufgVar.d);
            int i4 = 1;
            if (a == 0) {
                a = 1;
            }
            dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
            duey dueyVar = duey.UNKNOWN;
            duej duejVar = duej.UNKNOWN_CONTAINER;
            int i5 = a - 1;
            int i6 = 2;
            int i7 = i5 != 1 ? i5 != 2 ? i5 != 3 ? 2 : 5 : 4 : 3;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = z3;
            }
            ((cykl) bZ2.b).c = cykk.a(i7);
            String str3 = dufgVar.e;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = z3;
            }
            str3.getClass();
            ((cykl) bZ2.b).d = str3;
            dsrj<dufd> dsrjVar6 = dufgVar.f;
            dccx F2 = dcdc.F();
            for (dufd dufdVar : dsrjVar6) {
                cyjq bZ3 = cyjt.g.bZ();
                int a2 = dufc.a(dufdVar.b);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i8 = a2 - 1;
                if (i8 != i4) {
                    if (i8 == i6 && (dufdVar.a & i6) != 0 && (i2 = dufdVar.c) >= 0 && i2 < j.size()) {
                        cyjt cyjtVar = j.get(dufdVar.c).d;
                        if (cyjtVar == null) {
                            cyjtVar = cyjt.g;
                        }
                        bZ3.bC(cyjtVar);
                    }
                } else if ((dufdVar.a & i6) != 0 && (i = dufdVar.c) >= 0 && i < z2.size()) {
                    cyjt cyjtVar2 = ((cylq) z2.get(dufdVar.c)).c;
                    if (cyjtVar2 == null) {
                        cyjtVar2 = cyjt.g;
                    }
                    bZ3.bC(cyjtVar2);
                }
                cyki bZ4 = cykj.d.bZ();
                int a3 = dufc.a(dufdVar.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i9 = a3 - 1;
                int i10 = i9 != i4 ? i9 != i6 ? 2 : 5 : 3;
                if (bZ4.c) {
                    bZ4.bF();
                    z = false;
                    bZ4.c = false;
                } else {
                    z = false;
                }
                ((cykj) bZ4.b).a = cykk.a(i10);
                String str4 = dufdVar.d;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = z;
                }
                cykj cykjVar = (cykj) bZ4.b;
                str4.getClass();
                cykjVar.b = str4;
                cyjt bK = bZ3.bK();
                bK.getClass();
                cykjVar.c = bK;
                F2.g(bZ4.bK());
                i4 = 1;
                i6 = 2;
            }
            dcdc f = F2.f();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            cykl cyklVar2 = (cykl) bZ2.b;
            dsrj<cykj> dsrjVar7 = cyklVar2.e;
            if (!dsrjVar7.a()) {
                cyklVar2.e = dsqw.cl(dsrjVar7);
            }
            dsod.bv(f, cyklVar2.e);
            dufm dufmVar = dufgVar.a;
            if (dufmVar == null) {
                dufmVar = dufm.g;
            }
            cyjt g = g(dufmVar);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            g.getClass();
            ((cykl) bZ2.b).f = g;
            F.g(bZ2.bK());
            z3 = false;
        }
        bZ.b(F.f());
        dufu dufuVar4 = dufkVar.b;
        if (dufuVar4 == null) {
            dufuVar4 = dufu.d;
        }
        dcbg s5 = dcbg.b(dufuVar4.a).s(cyoa.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cylo cyloVar5 = (cylo) bZ.b;
        dsrj<cyil> dsrjVar8 = cyloVar5.i;
        if (!dsrjVar8.a()) {
            cyloVar5.i = dsqw.cl(dsrjVar8);
        }
        dsod.bv(s5, cyloVar5.i);
        dayr dayrVar = dufkVar.g;
        if (dayrVar == null) {
            dayrVar = dayr.c;
        }
        cylm bZ5 = cyln.c.bZ();
        boolean z4 = dayrVar.b;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        ((cyln) bZ5.b).a = z4;
        daxu daxuVar = dayrVar.a;
        if (daxuVar == null) {
            daxuVar = daxu.j;
        }
        cyjh f2 = f(daxuVar);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        f2.getClass();
        ((cyln) bZ5.b).b = f2;
        cyln bK2 = bZ5.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bK2.getClass();
        ((cylo) bZ.b).j = bK2;
        return bZ.bK();
    }

    static cyjh f(daxu daxuVar) {
        dawh dawhVar;
        dawh dawhVar2;
        cyiv bZ = cyjh.g.bZ();
        long j = daxuVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjh cyjhVar = (cyjh) bZ.b;
        cyjhVar.b = j;
        String str = daxuVar.e;
        str.getClass();
        cyjhVar.c = str;
        int a = daxt.a(daxuVar.c);
        if (a == 0) {
            a = 1;
        }
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        int i = a - 1;
        int i2 = 4;
        int i3 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? 2 : 6 : 5 : 4 : 3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjh) bZ.b).a = cyjg.a(i3);
        int a2 = daxr.a(daxuVar.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i4 = a2 - 1;
        int i5 = i4 != 1 ? i4 != 2 ? 2 : 4 : 3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjh) bZ.b).d = cyix.a(i5);
        int a3 = daxp.a(daxuVar.h);
        if (a3 == 0) {
            a3 = 1;
        }
        int i6 = a3 - 1;
        if (i6 == 1) {
            i2 = 3;
        } else if (i6 != 2) {
            i2 = 2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjh) bZ.b).e = cyiw.a(i2);
        if ((daxuVar.a & 128) != 0) {
            dawi dawiVar = daxuVar.i;
            if (dawiVar == null) {
                dawiVar = dawi.c;
            }
            cyjf cyjfVar = null;
            String str2 = null;
            if (dawiVar.a == 1) {
                cyiy bZ2 = cyjf.c.bZ();
                cyja cyjaVar = cyja.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                cyjf cyjfVar2 = (cyjf) bZ2.b;
                cyjaVar.getClass();
                cyjfVar2.b = cyjaVar;
                cyjfVar2.a = 1;
                cyjfVar = bZ2.bK();
            } else {
                dawi dawiVar2 = daxuVar.i;
                if (dawiVar2 == null) {
                    dawiVar2 = dawi.c;
                }
                if (dawiVar2.a == 2) {
                    dawi dawiVar3 = daxuVar.i;
                    if (dawiVar3 == null) {
                        dawiVar3 = dawi.c;
                    }
                    if (dawiVar3.a == 2) {
                        dawhVar = (dawh) dawiVar3.b;
                    } else {
                        dawhVar = dawh.c;
                    }
                    if ((dawhVar.a & 1) != 0) {
                        dawi dawiVar4 = daxuVar.i;
                        if (dawiVar4 == null) {
                            dawiVar4 = dawi.c;
                        }
                        if (dawiVar4.a == 2) {
                            dawhVar2 = (dawh) dawiVar4.b;
                        } else {
                            dawhVar2 = dawh.c;
                        }
                        dawc dawcVar = dawhVar2.b;
                        if (dawcVar == null) {
                            dawcVar = dawc.c;
                        }
                        str2 = dawcVar.b;
                    }
                    cyiy bZ3 = cyjf.c.bZ();
                    cyjb bZ4 = cyje.b.bZ();
                    cyjc bZ5 = cyjd.b.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    str2.getClass();
                    ((cyjd) bZ5.b).a = str2;
                    cyjd bK = bZ5.bK();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    bK.getClass();
                    ((cyje) bZ4.b).a = bK;
                    cyje bK2 = bZ4.bK();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    cyjf cyjfVar3 = (cyjf) bZ3.b;
                    bK2.getClass();
                    cyjfVar3.b = bK2;
                    cyjfVar3.a = 2;
                    cyjfVar = bZ3.bK();
                }
            }
            if (cyjfVar != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cyjfVar.getClass();
                ((cyjh) bZ.b).f = cyjfVar;
            }
        }
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyjt g(dufm dufmVar) {
        cyjq bZ = cyjt.g.bZ();
        duej b = duej.b(dufmVar.a);
        if (b == null) {
            b = duej.UNKNOWN_CONTAINER;
        }
        int a = cynb.a(b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyjt) bZ.b).a = cyiu.a(a);
        String str = dufmVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjt cyjtVar = (cyjt) bZ.b;
        str.getClass();
        cyjtVar.b = str;
        cyjtVar.c = dufmVar.c;
        cyjtVar.d = dufmVar.e;
        dcbg s = dcbg.b(dufmVar.d).s(cynp.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjt cyjtVar2 = (cyjt) bZ.b;
        dsrj<cyjs> dsrjVar = cyjtVar2.e;
        if (!dsrjVar.a()) {
            cyjtVar2.e = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, cyjtVar2.e);
        dcbg s2 = dcbg.b(dufmVar.f).s(cynq.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyjt cyjtVar3 = (cyjt) bZ.b;
        dsrj<cyil> dsrjVar2 = cyjtVar3.f;
        if (!dsrjVar2.a()) {
            cyjtVar3.f = dsqw.cl(dsrjVar2);
        }
        dsod.bv(s2, cyjtVar3.f);
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyil h(duef duefVar) {
        int i;
        cyih bZ = cyil.f.bZ();
        dued b = dued.b(duefVar.a);
        if (b == null) {
            b = dued.AFFINITY_TYPE_UNKNOWN;
        }
        duey dueyVar = duey.UNKNOWN;
        duej duejVar = duej.UNKNOWN_CONTAINER;
        switch (b.ordinal()) {
            case 12:
                i = 8;
                break;
            case 13:
                i = 41;
                break;
            case 14:
                i = 6;
                break;
            case 20:
                i = 35;
                break;
            case 23:
                i = 13;
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                i = 20;
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                i = 21;
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                i = 24;
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                i = 25;
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                i = 9;
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                i = 29;
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                i = 30;
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                i = 32;
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                i = 37;
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                i = 50;
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                i = 33;
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                i = 44;
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                i = 46;
                break;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                i = 42;
                break;
            case 104:
                i = 40;
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                i = 47;
                break;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                i = 48;
                break;
            case 145:
                i = 49;
                break;
            default:
                i = 2;
                break;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((cyil) bZ.b).a = cyik.a(i);
        double d = duefVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyil cyilVar = (cyil) bZ.b;
        cyilVar.b = d;
        String str = duefVar.c;
        str.getClass();
        cyilVar.c = str;
        boolean z = true;
        cyilVar.d = true;
        cyii bZ2 = cyij.f.bZ();
        duds dudsVar = duefVar.d;
        if (dudsVar == null) {
            dudsVar = duds.e;
        }
        if ((dudsVar.a & 1) == 0) {
            duds dudsVar2 = duefVar.d;
            if (dudsVar2 == null) {
                dudsVar2 = duds.e;
            }
            if ((2 & dudsVar2.a) == 0) {
                duds dudsVar3 = duefVar.d;
                if (dudsVar3 == null) {
                    dudsVar3 = duds.e;
                }
                if ((dudsVar3.a & 4) == 0) {
                    z = false;
                }
            }
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyij) bZ2.b).a = z;
        duds dudsVar4 = duefVar.d;
        if (dudsVar4 == null) {
            dudsVar4 = duds.e;
        }
        dudr dudrVar = dudsVar4.b;
        if (dudrVar == null) {
            dudrVar = dudr.c;
        }
        boolean z2 = dudrVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyij) bZ2.b).b = z2;
        duds dudsVar5 = duefVar.d;
        if (dudsVar5 == null) {
            dudsVar5 = duds.e;
        }
        dudp dudpVar = dudsVar5.c;
        if (dudpVar == null) {
            dudpVar = dudp.b;
        }
        boolean z3 = dudpVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyij) bZ2.b).c = z3;
        duds dudsVar6 = duefVar.d;
        if (dudsVar6 == null) {
            dudsVar6 = duds.e;
        }
        double d2 = dudsVar6.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyij) bZ2.b).d = d2;
        duds dudsVar7 = duefVar.d;
        if (dudsVar7 == null) {
            dudsVar7 = duds.e;
        }
        dudr dudrVar2 = dudsVar7.b;
        if (dudrVar2 == null) {
            dudrVar2 = dudr.c;
        }
        double d3 = dudrVar2.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ((cyij) bZ2.b).e = d3;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cyij bK = bZ2.bK();
        bK.getClass();
        ((cyil) bZ.b).e = bK;
        return bZ.bK();
    }

    private static List<cyle> i(Iterable<dufi> iterable) {
        return dcbg.b(iterable).s(cynl.a).z();
    }

    private static List<cyjo> j(Iterable<duet> iterable) {
        return dcbg.b(iterable).s(cynm.a).z();
    }
}
