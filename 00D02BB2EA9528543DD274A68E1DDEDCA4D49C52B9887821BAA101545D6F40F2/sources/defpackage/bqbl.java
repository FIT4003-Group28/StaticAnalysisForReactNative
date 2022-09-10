package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bqbl  reason: default package */
/* loaded from: classes4.dex */
class bqbl extends ivn {
    final /* synthetic */ bqbm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqbl(bqbm bqbmVar, Activity activity) {
        super(activity.getString(R.string.REPORT_MISSING_ROAD), 2, null, activity.getString(R.string.REPORT_MAP_ISSUE_SUBMIT), cjtd.a(dtya.cq), cjtd.a(dtya.cr), false, false, true, true);
        this.a = bqbmVar;
    }

    @Override // defpackage.ivn, defpackage.jbk
    public jib NC() {
        jhz e = super.NC().e();
        e.x = true;
        e.F = 1;
        return e.b();
    }

    @Override // defpackage.ivn
    public void a() {
        this.a.d();
    }

    @Override // defpackage.ivn, defpackage.jbh
    public void b(cjqm cjqmVar) {
        if (!this.a.c.b()) {
            return;
        }
        jmw.d(this.a.b, new Runnable(this) { // from class: bqbk
            private final bqbl a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bptn bptnVar;
                bqhg bqhgVar;
                dnqe dnqeVar;
                String str;
                bpyk bpykVar;
                boolean z;
                dwgz bK;
                bptn bptnVar2;
                String str2;
                bpyk bpykVar2;
                dnqe dnqeVar2;
                dbsg dbsgVar;
                ArrayList<bqdn> arrayList;
                ArrayList c;
                Long b;
                bqcw g;
                bqdg bqdgVar;
                String str3;
                bptn bptnVar3;
                bpyk bpykVar3;
                bqhg bqhgVar2;
                dnqe dnqeVar3;
                Iterator<bqcw> it;
                ArrayList arrayList2;
                ArrayList arrayList3;
                bptn bptnVar4;
                dbsg dbsgVar2;
                dbsg dbsgVar3;
                bqhp bqhpVar;
                bqbm bqbmVar = this.a.a;
                bptn bptnVar5 = bqbmVar.g;
                bpyk bpykVar4 = bqbmVar.a;
                bqhg bqhgVar3 = bqbmVar.d;
                dnqe dnqeVar4 = bqbmVar.e;
                String a = bqbmVar.h.a();
                if (bpykVar4.c.a) {
                    if (bqhgVar3.a().size() == 1) {
                        bpyl bpylVar = bpykVar4.a;
                        bqgw bqgwVar = bqhgVar3.a().get(0);
                        if (!bpylVar.c.a || (bqhpVar = bqgwVar.d) == null) {
                            dbsgVar3 = dbpy.a;
                        } else {
                            String str4 = bqgwVar.b.f;
                            String str5 = bqhpVar.c;
                            if (str4.isEmpty() || str4.equals(str5)) {
                                dbsgVar3 = dbpy.a;
                            } else {
                                dnqe a2 = bpun.a(dnqeVar4, dnpv.RENAME_IN_REPORT_MISSING_ROAD, "Yes");
                                dwgy bZ = dwgz.h.bZ();
                                dngl bZ2 = dngm.d.bZ();
                                dhjx Z = bpylVar.b.Z();
                                if (bZ2.c) {
                                    bZ2.bF();
                                    bZ2.c = false;
                                }
                                dngm dngmVar = (dngm) bZ2.b;
                                Z.getClass();
                                dngmVar.c = Z;
                                dngmVar.a |= 4;
                                dngm bK2 = bZ2.bK();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dwgz dwgzVar = (dwgz) bZ.b;
                                bK2.getClass();
                                dwgzVar.d = bK2;
                                dwgzVar.a |= 4;
                                dniw bZ3 = dniz.f.bZ();
                                dner bZ4 = dnet.h.bZ();
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                dnet dnetVar = (dnet) bZ4.b;
                                dnetVar.a |= 1;
                                dnetVar.b = 1;
                                dneu bZ5 = dnfe.p.bZ();
                                String str6 = bqhpVar.c;
                                if (bZ5.c) {
                                    bZ5.bF();
                                    bZ5.c = false;
                                }
                                dnfe dnfeVar = (dnfe) bZ5.b;
                                str6.getClass();
                                dnfeVar.a |= 2;
                                dnfeVar.c = str6;
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                dnet dnetVar2 = (dnet) bZ4.b;
                                dnfe bK3 = bZ5.bK();
                                bK3.getClass();
                                dnetVar2.c = bK3;
                                dnetVar2.a |= 2;
                                dneu bZ6 = dnfe.p.bZ();
                                if (bZ6.c) {
                                    bZ6.bF();
                                    bZ6.c = false;
                                }
                                dnfe dnfeVar2 = (dnfe) bZ6.b;
                                str4.getClass();
                                dnfeVar2.a |= 2;
                                dnfeVar2.c = str4;
                                if (bZ4.c) {
                                    bZ4.bF();
                                    bZ4.c = false;
                                }
                                dnet dnetVar3 = (dnet) bZ4.b;
                                dnfe bK4 = bZ6.bK();
                                bK4.getClass();
                                dnetVar3.d = bK4;
                                dnetVar3.a |= 4;
                                bZ3.c(bZ4.bK());
                                if (!a.isEmpty()) {
                                    dner bZ7 = dnet.h.bZ();
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dnet dnetVar4 = (dnet) bZ7.b;
                                    int i = dnetVar4.a | 1;
                                    dnetVar4.a = i;
                                    dnetVar4.b = 13;
                                    a.getClass();
                                    dnetVar4.a = i | 16;
                                    dnetVar4.f = a;
                                    bZ3.c(bZ7.bK());
                                }
                                for (Long l : bqhpVar.b) {
                                    long longValue = l.longValue();
                                    String str7 = bqhpVar.c;
                                    dnip bZ8 = dniu.i.bZ();
                                    String valueOf = String.valueOf(Long.toHexString(longValue));
                                    String concat = valueOf.length() != 0 ? "0x0:0x".concat(valueOf) : new String("0x0:0x");
                                    if (bZ8.c) {
                                        bZ8.bF();
                                        bZ8.c = false;
                                    }
                                    dniu dniuVar = (dniu) bZ8.b;
                                    concat.getClass();
                                    dniuVar.a |= 1;
                                    dniuVar.b = concat;
                                    dhjx Z2 = bpylVar.b.Z();
                                    if (bZ8.c) {
                                        bZ8.bF();
                                        bZ8.c = false;
                                    }
                                    dniu dniuVar2 = (dniu) bZ8.b;
                                    Z2.getClass();
                                    dniuVar2.e = Z2;
                                    int i2 = dniuVar2.a | 16;
                                    dniuVar2.a = i2;
                                    str7.getClass();
                                    dniuVar2.a = i2 | 4;
                                    dniuVar2.d = str7;
                                    dniu bK5 = bZ8.bK();
                                    if (bZ3.c) {
                                        bZ3.bF();
                                        bZ3.c = false;
                                    }
                                    dniz dnizVar = (dniz) bZ3.b;
                                    bK5.getClass();
                                    dnizVar.b();
                                    dnizVar.c.add(bK5);
                                }
                                doaq bZ9 = doar.c.bZ();
                                if (bZ9.c) {
                                    bZ9.bF();
                                    bZ9.c = false;
                                }
                                doar doarVar = (doar) bZ9.b;
                                dniz bK6 = bZ3.bK();
                                bK6.getClass();
                                doarVar.b = bK6;
                                doarVar.a |= 1;
                                doar bK7 = bZ9.bK();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dwgz dwgzVar2 = (dwgz) bZ.b;
                                bK7.getClass();
                                dwgzVar2.b = bK7;
                                dwgzVar2.a |= 1;
                                dnqe e = bpyh.e(bpylVar.a.a(), bpylVar.b, a2);
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dwgz dwgzVar3 = (dwgz) bZ.b;
                                e.getClass();
                                dwgzVar3.c = e;
                                dwgzVar3.a |= 2;
                                djgw a3 = chiw.a();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dwgz dwgzVar4 = (dwgz) bZ.b;
                                a3.getClass();
                                dwgzVar4.e = a3;
                                dwgzVar4.a |= 8;
                                dbsgVar3 = dbsg.i(bZ.bK());
                            }
                        }
                        if (dbsgVar3.a()) {
                            bK = (dwgz) dbsgVar3.b();
                            bptnVar2 = bptnVar5;
                            bptnVar2.a(bK, true);
                        }
                    }
                    bqdg bqdgVar2 = bpykVar4.d;
                    dcdc<bqgw> a4 = bqhgVar3.a();
                    bqdh bqdhVar = bqdgVar2.b;
                    if (bqdhVar.b.a && bqdhVar.a.a() && !bqdhVar.e && bqdhVar.d.containsAll(bqdhVar.c)) {
                        ArrayList arrayList4 = new ArrayList(dchl.k(a4, bqdd.a));
                        List<bqcw> a5 = bqdg.a(arrayList4, arrayList4);
                        if (!bqdgVar2.a.a()) {
                            arrayList = dchl.a();
                        } else {
                            arrayList = new ArrayList();
                            dcdc<cflx> e2 = bqdgVar2.a.b().e();
                            int size = e2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                cflx cflxVar = e2.get(i3);
                                if (cflxVar.b().l() >= 2) {
                                    arrayList.add(bqdn.e(cflxVar));
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (bqcw bqcwVar : a5) {
                            if (bqcwVar.b() != null && bqcwVar.a().size() >= 2) {
                                List k = dchl.k(bqcwVar.a(), bqdf.a);
                                bqgw b2 = bqcwVar.b();
                                dbsk.s(b2);
                                arrayList5.add(bqdn.f(b2.c, akrk.e(k)));
                            }
                        }
                        arrayList.addAll(arrayList5);
                        ArrayList<bqcw> arrayList6 = new ArrayList();
                        Iterator<bqcw> it2 = a5.iterator();
                        while (it2.hasNext()) {
                            bqcw next = it2.next();
                            dcdc<bqhj> a6 = next.a();
                            if (a6.isEmpty()) {
                                arrayList3 = new ArrayList();
                                bqdgVar = bqdgVar2;
                                str3 = a;
                                bptnVar3 = bptnVar5;
                                bpykVar3 = bpykVar4;
                                bqhgVar2 = bqhgVar3;
                                dnqeVar3 = dnqeVar4;
                                it = it2;
                                arrayList2 = arrayList;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                int i4 = 1;
                                while (i4 < a6.size()) {
                                    int i5 = i4 - 1;
                                    bqhj bqhjVar = a6.get(i5);
                                    bqhj bqhjVar2 = a6.get(i4);
                                    Iterator<bqcw> it3 = it2;
                                    TreeMap treeMap = new TreeMap();
                                    for (bqdn bqdnVar : arrayList) {
                                        ArrayList arrayList8 = arrayList;
                                        int i6 = 1;
                                        while (true) {
                                            bptnVar4 = bptnVar5;
                                            if (i6 < bqdnVar.a().l()) {
                                                akrk a7 = bqdnVar.a();
                                                bqhg bqhgVar4 = bqhgVar3;
                                                akra m = a7.m(i6 - 1);
                                                akra m2 = a7.m(i6);
                                                String str8 = a;
                                                akqq a8 = bqhjVar.a();
                                                dnqe dnqeVar5 = dnqeVar4;
                                                akqq a9 = bqhjVar2.a();
                                                bpyk bpykVar5 = bpykVar4;
                                                akqq S = m.S();
                                                bqdg bqdgVar3 = bqdgVar2;
                                                akqq S2 = m2.S();
                                                if ((!bqda.a(a8, S) || !bqda.a(a9, S2)) && (!bqda.a(a9, S) || !bqda.a(a8, S2))) {
                                                    if (akrb.c(akra.f(bqhjVar.a()), akra.f(bqhjVar2.a()), m, m2)) {
                                                        akra akraVar = new akra(0, 0);
                                                        akrb.i(akra.f(bqhjVar.a()), akra.f(bqhjVar2.a()), m, m2, akraVar);
                                                        dbsgVar2 = dbsg.i(akraVar.S());
                                                    } else {
                                                        dbsgVar2 = dbpy.a;
                                                    }
                                                    if (dbsgVar2.a() && !bqda.a(bqhjVar.a(), (akqq) dbsgVar2.b()) && !bqda.a(bqhjVar2.a(), (akqq) dbsgVar2.b()) && !bqda.a(m.S(), (akqq) dbsgVar2.b()) && !bqda.a(m2.S(), (akqq) dbsgVar2.b())) {
                                                        Double valueOf2 = Double.valueOf(akrb.b(m, m2, akra.f(bqhjVar.a()), akra.f(bqhjVar2.a())));
                                                        bqhh f = bqhj.f();
                                                        f.c((akqq) dbsgVar2.b());
                                                        if (bqdnVar.c().a()) {
                                                            f.e(bqdnVar.c().b());
                                                        } else if (bqdnVar.b().a()) {
                                                            f.d(bqdnVar.b().b().longValue());
                                                        }
                                                        treeMap.put(valueOf2, f.a());
                                                    }
                                                }
                                                i6++;
                                                bqhgVar3 = bqhgVar4;
                                                bptnVar5 = bptnVar4;
                                                a = str8;
                                                dnqeVar4 = dnqeVar5;
                                                bpykVar4 = bpykVar5;
                                                bqdgVar2 = bqdgVar3;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        bptnVar5 = bptnVar4;
                                    }
                                    bqdg bqdgVar4 = bqdgVar2;
                                    dcdc r = dcdc.r(treeMap.values());
                                    arrayList7.add(a6.get(i5));
                                    arrayList7.addAll(r);
                                    i4++;
                                    it2 = it3;
                                    a = a;
                                    bqdgVar2 = bqdgVar4;
                                }
                                bqdgVar = bqdgVar2;
                                str3 = a;
                                bptnVar3 = bptnVar5;
                                bpykVar3 = bpykVar4;
                                bqhgVar2 = bqhgVar3;
                                dnqeVar3 = dnqeVar4;
                                it = it2;
                                arrayList2 = arrayList;
                                arrayList7.add((bqhj) dcft.s(a6));
                                arrayList3 = arrayList7;
                            }
                            arrayList6.add(next.h(dcdc.r(arrayList3)));
                            it2 = it;
                            arrayList = arrayList2;
                            bqhgVar3 = bqhgVar2;
                            bptnVar5 = bptnVar3;
                            a = str3;
                            dnqeVar4 = dnqeVar3;
                            bpykVar4 = bpykVar3;
                            bqdgVar2 = bqdgVar;
                        }
                        str2 = a;
                        bptnVar = bptnVar5;
                        bpykVar2 = bpykVar4;
                        bqhgVar = bqhgVar3;
                        dnqeVar2 = dnqeVar4;
                        if (!bqdgVar2.a.a()) {
                            c = dchl.a();
                        } else {
                            HashMap hashMap = new HashMap();
                            for (bqcw bqcwVar2 : arrayList6) {
                                dcdc<bqhj> a10 = bqcwVar2.a();
                                int size2 = a10.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    bqhj bqhjVar3 = a10.get(i7);
                                    if (bqhjVar3.b().a()) {
                                        long longValue2 = bqhjVar3.b().b().longValue();
                                        dbsg<cflx> b3 = bqdgVar2.a.b().b(longValue2);
                                        Long valueOf3 = Long.valueOf(longValue2);
                                        if (!hashMap.containsKey(valueOf3) && b3.a() && b3.b().b().l() >= 2) {
                                            hashMap.put(valueOf3, bqcw.g(dcdc.r(dchl.k(b3.b().b().q(), bqde.a)), b3.b(), bqcv.d(b3.b().b().m(0).S(), b3.b().e()), bqcv.d(b3.b().b().p().S(), b3.b().f())));
                                        }
                                    }
                                }
                            }
                            c = dchl.c(hashMap.values());
                        }
                        List<bqcw> a11 = bqdg.a(c, arrayList6);
                        ArrayList<bqcw> arrayList9 = new ArrayList();
                        arrayList9.addAll(arrayList6);
                        arrayList9.addAll(a11);
                        bqcu bqcuVar = new bqcu();
                        for (bqcw bqcwVar3 : arrayList9) {
                            dcdc<bqhj> a12 = bqcwVar3.a();
                            if (a12.size() > 1) {
                                bqcv c2 = bqcuVar.c(bqcwVar3.a().get(0), bqcwVar3.d().b());
                                int i8 = 1;
                                int i9 = 0;
                                while (i8 < a12.size()) {
                                    if (a12.get(i8).g() || i8 == a12.size() - 1) {
                                        if (bqcwVar3.a().get(i8).c().a()) {
                                            b = bqcwVar3.a().get(i8).c().b();
                                        } else {
                                            b = i8 == bqcwVar3.a().size() + (-1) ? bqcwVar3.e().b() : null;
                                        }
                                        bqcv c3 = bqcuVar.c(bqcwVar3.a().get(i8), b);
                                        if (bqcwVar3.b() != null) {
                                            dcdc<bqhj> subList = bqcwVar3.a().subList(i9, i8 + 1);
                                            bqgw b4 = bqcwVar3.b();
                                            dbsk.s(b4);
                                            g = bqcw.f(subList, b4, c2, c3);
                                        } else if (bqcwVar3.c() != null) {
                                            dcdc<bqhj> subList2 = bqcwVar3.a().subList(i9, i8 + 1);
                                            cflx c4 = bqcwVar3.c();
                                            dbsk.s(c4);
                                            g = bqcw.g(subList2, c4, c2, c3);
                                        } else {
                                            bvoo.h("OriginalRoadModel or ExistingRoadSegment not found in roadSegment. RmrMultiRoadGraphSegment should always contain either an OriginalRoadModel or ExistingRoadSegment.", new Object[0]);
                                            i9 = i8;
                                            c2 = c3;
                                        }
                                        bqcuVar.b.n(c2, g);
                                        bqcuVar.b.n(c3, g);
                                        bqcuVar.c.add(g);
                                        i9 = i8;
                                        c2 = c3;
                                    }
                                    i8++;
                                }
                            }
                        }
                        dbsgVar = dbsg.i(bqcuVar);
                    } else {
                        str2 = a;
                        bptnVar = bptnVar5;
                        bpykVar2 = bpykVar4;
                        bqhgVar = bqhgVar3;
                        dnqeVar2 = dnqeVar4;
                        dbsgVar = dbpy.a;
                    }
                    if (dbsgVar.a()) {
                        bqcu bqcuVar2 = (bqcu) dbsgVar.b();
                        dccx F = dcdc.F();
                        ArrayList arrayList10 = new ArrayList();
                        dcep<bqcv> J = bqcuVar2.a().J();
                        dcdc<bqcw> b5 = bqcuVar2.b();
                        int size3 = b5.size();
                        for (int i10 = 0; i10 < size3; i10++) {
                            bqcw bqcwVar4 = b5.get(i10);
                            if (!J.contains(bqcwVar4.d())) {
                                bqcx d = bqcy.d();
                                ((bqcs) d).a = 3;
                                d.e(bqcwVar4);
                                d.d(bqcwVar4.d());
                                arrayList10.add(d.c());
                            }
                            if (!J.contains(bqcwVar4.e())) {
                                bqcx d2 = bqcy.d();
                                ((bqcs) d2).a = 3;
                                d2.e(bqcwVar4);
                                d2.d(bqcwVar4.e());
                                arrayList10.add(d2.c());
                            }
                        }
                        F.i(arrayList10);
                        ArrayList arrayList11 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        dcpd<bqcv> it4 = bqcuVar2.a().J().iterator();
                        while (it4.hasNext()) {
                            bqcv next2 = it4.next();
                            if (hashSet.contains(next2.a())) {
                                bqcx d3 = bqcy.d();
                                ((bqcs) d3).a = 1;
                                d3.d(next2);
                                arrayList11.add(d3.c());
                            }
                            hashSet.add(next2.a());
                        }
                        F.i(arrayList11);
                        ArrayList arrayList12 = new ArrayList();
                        dcpd<Map.Entry<bqcv, bqcw>> it5 = bqcuVar2.a().I().iterator();
                        while (it5.hasNext()) {
                            Map.Entry<bqcv, bqcw> next3 = it5.next();
                            bqcw value = next3.getValue();
                            bqcv key = next3.getKey();
                            if (value.d() != key && value.e() != key) {
                                bqcx d4 = bqcy.d();
                                ((bqcs) d4).a = 2;
                                d4.d(key);
                                d4.e(value);
                                arrayList12.add(d4.c());
                            }
                        }
                        F.i(arrayList12);
                        ArrayList arrayList13 = new ArrayList();
                        dcdc<bqcw> b6 = bqcuVar2.b();
                        int size4 = b6.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            bqcw bqcwVar5 = b6.get(i11);
                            if (bqcwVar5.a().size() < 2) {
                                bqcx d5 = bqcy.d();
                                ((bqcs) d5).a = 4;
                                d5.e(bqcwVar5);
                                arrayList13.add(d5.c());
                            }
                        }
                        F.i(arrayList13);
                        ArrayList arrayList14 = new ArrayList();
                        dcdc<bqcw> b7 = bqcuVar2.b();
                        int size5 = b7.size();
                        for (int i12 = 0; i12 < size5; i12++) {
                            bqcw bqcwVar6 = b7.get(i12);
                            boolean z2 = true;
                            for (int i13 = 1; i13 < bqcwVar6.a().size(); i13++) {
                                z2 &= akqq.v(bqcwVar6.a().get(i13 - 1).a(), bqcwVar6.a().get(i13).a(), 1.0E-6d);
                            }
                            if (z2 && bqcwVar6.a().size() >= 2) {
                                bqcx d6 = bqcy.d();
                                ((bqcs) d6).a = 5;
                                d6.e(bqcwVar6);
                                arrayList14.add(d6.c());
                            }
                        }
                        F.i(arrayList14);
                        dcdc f2 = F.f();
                        if (!f2.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Encountered stitching errors when building missing road report: ");
                            for (bqcy bqcyVar : new HashSet(f2)) {
                                sb.append("\n");
                                sb.append((Object) bqcz.a(bqcyVar.c()));
                            }
                            sb.toString();
                        }
                        bK = bpykVar2.b.a((bqcu) dbsgVar.b(), dnqeVar2, str2);
                        bptnVar2 = bptnVar;
                        bptnVar2.a(bK, true);
                    }
                    str = str2;
                    dnqeVar = dnqeVar2;
                    bpykVar = bpykVar2;
                    z = true;
                } else {
                    bptnVar = bptnVar5;
                    bqhgVar = bqhgVar3;
                    dnqeVar = dnqeVar4;
                    str = a;
                    bpykVar = bpykVar4;
                    z = false;
                }
                bpyh bpyhVar = bpykVar.b;
                ArrayList a13 = dchl.a();
                dnsm bZ10 = dnta.f.bZ();
                if (z) {
                    dnsn bZ11 = dnsp.c.bZ();
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    dnsp dnspVar = (dnsp) bZ11.b;
                    dnspVar.b = 1;
                    dnspVar.a |= 1;
                    if (bZ10.c) {
                        bZ10.bF();
                        bZ10.c = false;
                    }
                    dnta dntaVar = (dnta) bZ10.b;
                    dnsp bK8 = bZ11.bK();
                    bK8.getClass();
                    dntaVar.e = bK8;
                    dntaVar.a |= 1;
                }
                dcdc<bqgw> a14 = bqhgVar.a();
                int size6 = a14.size();
                int i14 = 2;
                for (int i15 = 0; i15 < size6; i15++) {
                    bqgw bqgwVar2 = a14.get(i15);
                    douc g2 = bpyh.g(bqgwVar2.f());
                    dnsy bZ12 = dnsz.h.bZ();
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dnsz dnszVar = (dnsz) bZ12.b;
                    doud bK9 = g2.bK();
                    bK9.getClass();
                    dnszVar.c = bK9;
                    dnszVar.a |= 2;
                    dnsq bZ13 = dnsr.c.bZ();
                    long j = i14;
                    if (bZ13.c) {
                        bZ13.bF();
                        bZ13.c = false;
                    }
                    dnsr dnsrVar = (dnsr) bZ13.b;
                    dnsrVar.a |= 1;
                    dnsrVar.b = j;
                    if (bZ12.c) {
                        bZ12.bF();
                        bZ12.c = false;
                    }
                    dnsz dnszVar2 = (dnsz) bZ12.b;
                    dnsr bK10 = bZ13.bK();
                    bK10.getClass();
                    dnszVar2.b = bK10;
                    dnszVar2.a |= 1;
                    int i16 = bqgwVar2.f;
                    if (i16 != 0) {
                        if (i16 != 1) {
                            if (bZ12.c) {
                                bZ12.bF();
                                bZ12.c = false;
                            }
                            dnsz dnszVar3 = (dnsz) bZ12.b;
                            dnszVar3.d = i16 - 1;
                            dnszVar3.a |= 4;
                        }
                        dnsu bZ14 = dnsx.d.bZ();
                        dnsr dnsrVar2 = ((dnsz) bZ12.b).b;
                        if (dnsrVar2 == null) {
                            dnsrVar2 = dnsr.c;
                        }
                        bZ14.a(dnsrVar2);
                        if (!dbsj.d(bqgwVar2.b.c())) {
                            dnsv bZ15 = dnsw.d.bZ();
                            String c5 = bqgwVar2.b.c();
                            if (bZ15.c) {
                                bZ15.bF();
                                bZ15.c = false;
                            }
                            dnsw dnswVar = (dnsw) bZ15.b;
                            c5.getClass();
                            int i17 = dnswVar.a | 1;
                            dnswVar.a = i17;
                            dnswVar.b = c5;
                            String str9 = bqgwVar2.b.g;
                            str9.getClass();
                            dnswVar.a = i17 | 2;
                            dnswVar.c = str9;
                            if (bZ14.c) {
                                bZ14.bF();
                                bZ14.c = false;
                            }
                            dnsx dnsxVar = (dnsx) bZ14.b;
                            dnsw bK11 = bZ15.bK();
                            bK11.getClass();
                            dnsxVar.c = bK11;
                            dnsxVar.a |= 1;
                        }
                        bZ10.a(bZ14);
                        bZ10.b(bZ12);
                        i14 += 2;
                    } else {
                        throw null;
                    }
                }
                bpyh.b(a13, bZ10);
                bpyh.d(a13, str);
                bpyh.c(a13);
                dwgy bZ16 = dwgz.h.bZ();
                doaq bZ17 = doar.c.bZ();
                dniw bZ18 = dniz.f.bZ();
                bZ18.a(a13);
                if (bZ17.c) {
                    bZ17.bF();
                    bZ17.c = false;
                }
                doar doarVar2 = (doar) bZ17.b;
                dniz bK12 = bZ18.bK();
                bK12.getClass();
                doarVar2.b = bK12;
                doarVar2.a |= 1;
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dwgz dwgzVar5 = (dwgz) bZ16.b;
                doar bK13 = bZ17.bK();
                bK13.getClass();
                dwgzVar5.b = bK13;
                dwgzVar5.a |= 1;
                dnqe e3 = bpyh.e(bpyhVar.b.a(), bpyhVar.c, dnqeVar);
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dwgz dwgzVar6 = (dwgz) bZ16.b;
                e3.getClass();
                dwgzVar6.c = e3;
                dwgzVar6.a |= 2;
                dngm f3 = bpyhVar.f();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dwgz dwgzVar7 = (dwgz) bZ16.b;
                f3.getClass();
                dwgzVar7.d = f3;
                dwgzVar7.a |= 4;
                djgw a15 = chiw.a();
                if (bZ16.c) {
                    bZ16.bF();
                    bZ16.c = false;
                }
                dwgz dwgzVar8 = (dwgz) bZ16.b;
                a15.getClass();
                dwgzVar8.e = a15;
                dwgzVar8.a |= 8;
                bK = bZ16.bK();
                bptnVar2 = bptnVar;
                bptnVar2.a(bK, true);
            }
        });
    }
}
