package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cflm  reason: default package */
/* loaded from: classes4.dex */
final class cflm implements btzi<difr, digc> {
    final /* synthetic */ cflo a;

    public cflm(cflo cfloVar) {
        this.a = cfloVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<difr> btzrVar, btzy btzyVar) {
        dcdc<Long> f = cflo.f(btzrVar.a);
        cflo cfloVar = this.a;
        cfln cflnVar = cfln.CURRENTLY_REQUESTED;
        cfln cflnVar2 = cfln.DEFAULT;
        for (Long l : f) {
            cfloVar.c.replace(Long.valueOf(l.longValue()), cflnVar, cflnVar2);
        }
        Iterator<cflk> it = this.a.b.iterator();
        while (it.hasNext()) {
            it.next().y();
        }
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<difr> btzrVar, digc digcVar) {
        cflq cflqVar = this.a.a;
        dcdc r = dcdc.r(digcVar.a);
        int size = r.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 3;
            if (i2 >= size) {
                int size2 = r.size();
                while (i < size2) {
                    digb digbVar = (digb) r.get(i);
                    int a = diga.a(digbVar.a);
                    if (a == 0) {
                        throw null;
                    }
                    if (a == i3) {
                        ConcurrentHashMap<Long, cflx> concurrentHashMap = cflqVar.b;
                        difv difvVar = digbVar.c;
                        if (difvVar == null) {
                            difvVar = difv.b;
                        }
                        if (!concurrentHashMap.containsKey(Long.valueOf(difvVar.a))) {
                            dcen N = dcep.N();
                            difx difxVar = digbVar.a == 2 ? (difx) digbVar.b : difx.e;
                            for (difv difvVar2 : difxVar.a) {
                                cflw cflwVar = cflqVar.a.get(Long.valueOf(difvVar2.a));
                                if (cflwVar != null) {
                                    N.b(cflwVar);
                                }
                            }
                            difv difvVar3 = digbVar.c;
                            if (difvVar3 == null) {
                                difvVar3 = difv.b;
                            }
                            long j = difvVar3.a;
                            dvzn dvznVar = difxVar.b;
                            if (dvznVar == null) {
                                dvznVar = dvzn.e;
                            }
                            akrk h = akrk.h(dvznVar);
                            dcep f = N.f();
                            difv difvVar4 = difxVar.c;
                            if (difvVar4 == null) {
                                difvVar4 = difv.b;
                            }
                            long j2 = difvVar4.a;
                            difv difvVar5 = difxVar.d;
                            if (difvVar5 == null) {
                                difvVar5 = difv.b;
                            }
                            cflu cfluVar = new cflu(j, h, new alxh(h), f, j2, difvVar5.a);
                            if (cflqVar.b.putIfAbsent(Long.valueOf(cfluVar.a), cfluVar) == null) {
                                cflqVar.d(cfluVar.b, cfluVar);
                                cflqVar.d(cfluVar.c, cfluVar);
                            }
                        }
                    }
                    i++;
                    i3 = 3;
                }
                dcdc<Long> f2 = cflo.f(btzrVar.a);
                this.a.g(f2, cfln.CURRENTLY_STORED);
                Iterator<cflk> it = this.a.b.iterator();
                while (it.hasNext()) {
                    it.next().a(f2);
                }
                return;
            }
            digb digbVar2 = (digb) r.get(i2);
            int a2 = diga.a(digbVar2.a);
            if (a2 == 0) {
                throw null;
            }
            if (a2 == 4) {
                ConcurrentHashMap<Long, cflw> concurrentHashMap2 = cflqVar.a;
                difv difvVar6 = digbVar2.c;
                if (difvVar6 == null) {
                    difvVar6 = difv.b;
                }
                if (!concurrentHashMap2.containsKey(Long.valueOf(difvVar6.a))) {
                    dbsk.a(!(digbVar2.a == 3 ? (difz) digbVar2.b : difz.b).a.isEmpty());
                    difv difvVar7 = digbVar2.c;
                    if (difvVar7 == null) {
                        difvVar7 = difv.b;
                    }
                    cflt cfltVar = new cflt(difvVar7.a, (digbVar2.a == 3 ? (difz) digbVar2.b : difz.b).a.get(0).b);
                    cflqVar.a.putIfAbsent(Long.valueOf(cfltVar.a), cfltVar);
                }
            }
            i2++;
        }
    }
}
