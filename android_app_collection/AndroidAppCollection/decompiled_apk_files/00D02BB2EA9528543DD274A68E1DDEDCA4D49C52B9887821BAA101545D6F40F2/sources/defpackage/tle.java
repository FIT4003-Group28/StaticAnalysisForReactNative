package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tle  reason: default package */
/* loaded from: classes7.dex */
public final class tle implements tma, tmb {
    public final ConcurrentHashMap<btlu, tlc> a = new ConcurrentHashMap<>();
    public final tlg b;
    public final zar c;
    private final Executor d;
    private final tlz<tmr> e;

    public tle(tlg tlgVar, Executor executor, tlz<tmr> tlzVar, zar zarVar) {
        this.b = tlgVar;
        this.d = executor;
        this.e = tlzVar;
        this.c = zarVar;
    }

    private final synchronized tlc j(btlu btluVar) {
        tlc tlcVar;
        this.a.putIfAbsent(btluVar, new tlc());
        tlcVar = this.a.get(btluVar);
        dbsk.s(tlcVar);
        return tlcVar;
    }

    private final synchronized void k(btlu btluVar, tlc tlcVar) {
        dbsg i;
        dbsg<tmd> a = tlcVar.a();
        if (!a.a()) {
            i = dbpy.a;
        } else {
            tmd b = a.b();
            dbsk.s(b);
            tmj bZ = tmr.h.bZ();
            dwbc dwbcVar = b.c().e().a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tmr tmrVar = (tmr) bZ.b;
            dwbcVar.getClass();
            tmrVar.b = dwbcVar;
            tmrVar.a |= 1;
            dwaw d = b.c().d();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tmr tmrVar2 = (tmr) bZ.b;
            d.getClass();
            tmrVar2.c = d;
            tmrVar2.a |= 2;
            long j = b.c().f().a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tmr tmrVar3 = (tmr) bZ.b;
            tmrVar3.a |= 4;
            tmrVar3.d = j;
            dcdc<tlv> g = b.g();
            dccx F = dcdc.F();
            int size = g.size();
            for (int i2 = 0; i2 < size; i2++) {
                tlv tlvVar = g.get(i2);
                tmk bZ2 = tmq.o.bZ();
                tmm bZ3 = tmp.c.bZ();
                tmo tmoVar = tkt.a.get(tlvVar.f().a());
                dbsk.s(tmoVar);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                tmp tmpVar = (tmp) bZ3.b;
                tmpVar.b = tmoVar.c;
                tmpVar.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar = (tmq) bZ2.b;
                tmp bK = bZ3.bK();
                bK.getClass();
                tmqVar.b = bK;
                tmqVar.a |= 1;
                dcdc<Integer> c = tlvVar.c();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar2 = (tmq) bZ2.b;
                dsrf dsrfVar = tmqVar2.c;
                if (!dsrfVar.a()) {
                    tmqVar2.c = dsqw.cg(dsrfVar);
                }
                dsod.bv(c, tmqVar2.c);
                String e = tlvVar.e();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar3 = (tmq) bZ2.b;
                e.getClass();
                tmqVar3.a |= 8;
                tmqVar3.f = e;
                int h = tlvVar.h();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar4 = (tmq) bZ2.b;
                tmqVar4.a |= 16;
                tmqVar4.g = h;
                boolean i3 = tlvVar.i();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar5 = (tmq) bZ2.b;
                tmqVar5.a |= 32;
                tmqVar5.h = i3;
                int a2 = tlvVar.a();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar6 = (tmq) bZ2.b;
                tmqVar6.a |= 2;
                tmqVar6.d = a2;
                int b2 = tlvVar.b();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar7 = (tmq) bZ2.b;
                tmqVar7.a |= 4;
                tmqVar7.e = b2;
                boolean d2 = tlvVar.f().d();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar8 = (tmq) bZ2.b;
                tmqVar8.a |= 64;
                tmqVar8.i = d2;
                boolean c2 = tlvVar.f().c();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar9 = (tmq) bZ2.b;
                tmqVar9.a |= 1024;
                tmqVar9.m = c2;
                boolean e2 = tlvVar.f().e();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar10 = (tmq) bZ2.b;
                tmqVar10.a |= 128;
                tmqVar10.j = e2;
                boolean f = tlvVar.f().f();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar11 = (tmq) bZ2.b;
                tmqVar11.a |= 256;
                tmqVar11.k = f;
                int intValue = tlvVar.f().h().intValue();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                tmq tmqVar12 = (tmq) bZ2.b;
                tmqVar12.a |= 512;
                tmqVar12.l = intValue;
                dcpd<Map.Entry<String, Integer>> it = tlvVar.f().g().entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Integer> next = it.next();
                    String key = next.getKey();
                    int intValue2 = next.getValue().intValue();
                    key.getClass();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    tmq tmqVar13 = (tmq) bZ2.b;
                    dssd<String, Integer> dssdVar = tmqVar13.n;
                    if (!dssdVar.a) {
                        tmqVar13.n = dssdVar.a();
                    }
                    tmqVar13.n.put(key, Integer.valueOf(intValue2));
                }
                F.g(bZ2.bK());
            }
            dcdc f2 = F.f();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            tmr tmrVar4 = (tmr) bZ.b;
            dsrj<tmq> dsrjVar = tmrVar4.e;
            if (!dsrjVar.a()) {
                tmrVar4.e = dsqw.cl(dsrjVar);
            }
            dsod.bv(f2, tmrVar4.e);
            if (b.b().a()) {
                String b3 = b.b().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                tmr tmrVar5 = (tmr) bZ.b;
                b3.getClass();
                tmrVar5.a |= 8;
                tmrVar5.f = b3;
            }
            i = dbsg.i(bZ.bK());
        }
        if (i.a()) {
            tlz<tmr> tlzVar = this.e;
            tmr tmrVar6 = (tmr) i.b();
            dsqp dsqpVar = (dsqp) tmrVar6.cu(5);
            dsqpVar.bC(tmrVar6);
            tmj tmjVar = (tmj) dsqpVar;
            boolean c3 = tlcVar.c();
            if (tmjVar.c) {
                tmjVar.bF();
                tmjVar.c = false;
            }
            tmr tmrVar7 = (tmr) tmjVar.b;
            tmr tmrVar8 = tmr.h;
            tmrVar7.a |= 16;
            tmrVar7.g = c3;
            tlzVar.b(btluVar, tmjVar.bK());
        }
    }

    @Override // defpackage.tma
    public final crzm<dbsg<tmd>> a(final btlu btluVar) {
        tlc j = j(btluVar);
        if (!j.a().a() && !j.c()) {
            final dehn<dbsg<tmr>> a = this.e.a(btluVar);
            a.Pk(new Runnable(this, a, btluVar) { // from class: tlb
                private final tle a;
                private final dehn b;
                private final btlu c;

                {
                    this.a = this;
                    this.b = a;
                    this.c = btluVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dbsg<dqvj> dbsgVar;
                    tle tleVar = this.a;
                    dehn dehnVar = this.b;
                    btlu btluVar2 = this.c;
                    synchronized (tleVar) {
                        dbsg dbsgVar2 = (dbsg) deha.s(dehnVar);
                        tleVar.a.putIfAbsent(btluVar2, new tlc());
                        tlc tlcVar = tleVar.a.get(btluVar2);
                        dbsk.s(tlcVar);
                        if (!tlcVar.a().a() && !tlcVar.c() && dbsgVar2.a()) {
                            tlcVar.g(((tmr) dbsgVar2.b()).g);
                            tlg tlgVar = tleVar.b;
                            tmr tmrVar = (tmr) dbsgVar2.b();
                            dwbc dwbcVar = tmrVar.b;
                            if (dwbcVar == null) {
                                dwbcVar = dwbc.g;
                            }
                            amsy amsyVar = new amsy(dwbcVar);
                            tmc j2 = tmd.j();
                            j2.e(btluVar2);
                            eapd eapdVar = new eapd(tmrVar.d);
                            tlh tlhVar = tlgVar.b;
                            dwaw dwawVar = tmrVar.c;
                            if (dwawVar == null) {
                                dwawVar = dwaw.j;
                            }
                            dbsg<tme> a2 = tlhVar.a(amsyVar, dwawVar, eapdVar);
                            j2.g((tme) ((dbsu) a2).a);
                            tkt tktVar = tlgVar.a;
                            tme tmeVar = (tme) ((dbsu) a2).a;
                            dcdc r = dcdc.r(tmrVar.e);
                            dccx F = dcdc.F();
                            int size = r.size();
                            for (int i = 0; i < size; i++) {
                                tmq tmqVar = (tmq) r.get(i);
                                tlu C = tlv.C();
                                C.g(tmqVar.f);
                                C.k(tmeVar);
                                C.j(tmqVar.d);
                                C.h(tmqVar.e);
                                C.i(tmqVar.g);
                                ((tlk) C).a = tktVar.b(tmqVar.f);
                                C.f(tmqVar.h);
                                dbyy dbyyVar = ((dcmh) tkt.a).e;
                                tmp tmpVar = tmqVar.b;
                                if (tmpVar == null) {
                                    tmpVar = tmp.c;
                                }
                                Object b = tmo.b(tmpVar.b);
                                if (b == null) {
                                    b = tmo.UNKNOWN;
                                }
                                tlx tlxVar = (tlx) dbyyVar.get(b);
                                dbsk.s(tlxVar);
                                if (tlxVar.equals(tlx.TRAVEL_MODE)) {
                                    dbsgVar = dbsg.i(tkt.c(tmqVar.f));
                                } else {
                                    dbsgVar = dbpy.a;
                                }
                                tlw c = C.c();
                                c.h(tlxVar);
                                c.i(dbsgVar);
                                c.e(Integer.valueOf(tmqVar.l));
                                c.c(tmqVar.i);
                                c.f(tmqVar.m);
                                c.b(tmqVar.j);
                                c.g(dcdn.r(Collections.unmodifiableMap(tmqVar.n)));
                                c.d(tmqVar.k);
                                for (Integer num : tmqVar.c) {
                                    int intValue = num.intValue();
                                    amve m = tmeVar.e().m(intValue);
                                    dccx<Integer> a3 = C.a();
                                    Integer valueOf = Integer.valueOf(intValue);
                                    a3.g(valueOf);
                                    C.d().f(valueOf, m);
                                }
                                F.g(C);
                            }
                            dcdc f = F.f();
                            int size2 = f.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((tlu) f.get(i2)).k((tme) ((dbsu) a2).a);
                            }
                            j2.i(f);
                            if ((tmrVar.a & 8) != 0) {
                                ((tlm) j2).a = dbsg.i(tmrVar.f);
                            }
                            tlcVar.e(dbsg.i(j2.h()));
                        }
                    }
                }
            }, this.d);
        }
        return j(btluVar).b();
    }

    @Override // defpackage.tmb
    public final synchronized void b(btlu btluVar, amsy amsyVar, dwaw dwawVar, eapd eapdVar, dbsg<dqvj> dbsgVar) {
        String str;
        tlg tlgVar = this.b;
        dbsg<tme> a = tlgVar.b.a(amsyVar, dwawVar, eapdVar);
        dcdc<tlu> a2 = tlgVar.a.a(btluVar, (tme) ((dbsu) a).a, dcmn.a);
        if (dbsgVar.a()) {
            str = dbsgVar.b().name();
            int size = a2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                tlu tluVar = a2.get(i);
                i++;
                if (tluVar.b().equals(str)) {
                    tluVar.c().f(true);
                    break;
                }
            }
        } else {
            str = null;
        }
        tmc j = tmd.j();
        j.e(btluVar);
        ((tlm) j).a = dbsg.j(str);
        j.g((tme) ((dbsu) a).a);
        j.i(a2);
        dbsg<tmd> i2 = dbsg.i(j.h());
        tlc j2 = j(btluVar);
        j2.d(i2);
        k(btluVar, j2);
    }

    @Override // defpackage.tmb
    public final synchronized void c(btlu btluVar, boolean z) {
        tlc j = j(btluVar);
        if (!z) {
            j.d(dbpy.a);
            this.e.c(btluVar);
            return;
        }
        j.g(true);
        k(btluVar, j);
    }

    @Override // defpackage.tmb
    public final synchronized void d(btlu btluVar) {
        if (this.a.containsKey(btluVar)) {
            tlc j = j(btluVar);
            if (j.c()) {
                j.g(false);
                k(btluVar, j);
            }
        }
    }

    @Override // defpackage.tmb
    public final synchronized void e(btlu btluVar, final String str, final int i) {
        tlc j = j(btluVar);
        j.f(new tld(str, i) { // from class: tkw
            private final String a;
            private final int b;

            {
                this.a = str;
                this.b = i;
            }

            @Override // defpackage.tld
            public final dbsg a(tmd tmdVar) {
                String str2 = this.a;
                int i2 = this.b;
                dbsg<tlv> h = tmdVar.h(str2);
                if (h.a()) {
                    tlv b = h.b();
                    dbsk.s(b);
                    if (b.v(i2)) {
                        tlv b2 = h.b();
                        dbsk.s(b2);
                        tlu k = b2.k();
                        k.j(i2);
                        tmc i3 = tmdVar.i();
                        i3.j(k);
                        return dbsg.i(i3.h());
                    }
                }
                return dbpy.a;
            }
        });
        k(btluVar, j);
    }

    @Override // defpackage.tmb
    public final synchronized void f(btlu btluVar, final String str, final String str2, final int i) {
        tlc j = j(btluVar);
        j.f(new tld(str, i, str2) { // from class: tkx
            private final String a;
            private final int b;
            private final String c;

            {
                this.a = str;
                this.b = i;
                this.c = str2;
            }

            @Override // defpackage.tld
            public final dbsg a(tmd tmdVar) {
                String str3 = this.a;
                int i2 = this.b;
                String str4 = this.c;
                dbsg<tlv> h = tmdVar.h(str3);
                if (h.a()) {
                    tlv b = h.b();
                    dbsk.s(b);
                    if (b.v(i2)) {
                        tlv b2 = h.b();
                        dbsk.s(b2);
                        tlu k = b2.k();
                        HashMap hashMap = new HashMap(h.b().f().g());
                        hashMap.put(str4, Integer.valueOf(i2));
                        k.c().g(dcdn.r(hashMap));
                        tmc i3 = tmdVar.i();
                        i3.j(k);
                        return dbsg.i(i3.h());
                    }
                }
                return dbpy.a;
            }
        });
        k(btluVar, j);
    }

    @Override // defpackage.tmb
    public final synchronized void g(final btlu btluVar, final amve amveVar, final int i) {
        tlc j = j(btluVar);
        j.f(new tld(this, i, amveVar, btluVar) { // from class: tky
            private final tle a;
            private final int b;
            private final amve c;
            private final btlu d;

            {
                this.a = this;
                this.b = i;
                this.c = amveVar;
                this.d = btluVar;
            }

            @Override // defpackage.tld
            public final dbsg a(tmd tmdVar) {
                tle tleVar = this.a;
                int i2 = this.b;
                amve amveVar2 = this.c;
                btlu btluVar2 = this.d;
                dbsg<amsy> a = tlf.a(tmdVar.c().e(), i2, amveVar2);
                return !a.a() ? dbpy.a : tleVar.b.a(btluVar2, tmdVar, a.b());
            }
        });
        k(btluVar, j);
    }

    @Override // defpackage.tmb
    public final synchronized void h(final btlu btluVar, final Map<qdv, dopk> map, final boolean z) {
        tlc j = j(btluVar);
        j.f(new tld(this, map, z, btluVar) { // from class: tla
            private final tle a;
            private final Map b;
            private final boolean c;
            private final btlu d;

            {
                this.a = this;
                this.b = map;
                this.c = z;
                this.d = btluVar;
            }

            @Override // defpackage.tld
            public final dbsg a(tmd tmdVar) {
                tle tleVar = this.a;
                Map<qdv, dopk> map2 = this.b;
                boolean z2 = this.c;
                btlu btluVar2 = this.d;
                dwbc dwbcVar = tmdVar.c().e().a;
                dsqp dsqpVar = (dsqp) dwbcVar.cu(5);
                dsqpVar.bC(dwbcVar);
                dwaz dwazVar = (dwaz) dsqpVar;
                dwaa dwaaVar = ((dwbc) dwazVar.b).b;
                if (dwaaVar == null) {
                    dwaaVar = dwaa.g;
                }
                dsqp dsqpVar2 = (dsqp) dwaaVar.cu(5);
                dsqpVar2.bC(dwaaVar);
                dvzz dvzzVar = (dvzz) dsqpVar2;
                zar zarVar = tleVar.c;
                dwaa dwaaVar2 = ((dwbc) dwazVar.b).b;
                if (dwaaVar2 == null) {
                    dwaaVar2 = dwaa.g;
                }
                dvzu dvzuVar = dwaaVar2.b;
                if (dvzuVar == null) {
                    dvzuVar = dvzu.F;
                }
                dvzo a = zarVar.a(dvzuVar, map2, null, z2);
                if (dvzzVar.c) {
                    dvzzVar.bF();
                    dvzzVar.c = false;
                }
                dwaa dwaaVar3 = (dwaa) dvzzVar.b;
                dvzu bK = a.bK();
                bK.getClass();
                dwaaVar3.b = bK;
                dwaaVar3.a |= 1;
                if (dwazVar.c) {
                    dwazVar.bF();
                    dwazVar.c = false;
                }
                dwbc dwbcVar2 = (dwbc) dwazVar.b;
                dwaa bK2 = dvzzVar.bK();
                bK2.getClass();
                dwbcVar2.b = bK2;
                dwbcVar2.a |= 1;
                return tleVar.b.a(btluVar2, tmdVar, new amsy((dwbc) dwazVar.bK()));
            }
        });
        k(btluVar, j);
    }

    @Override // defpackage.tmb
    public final synchronized void i(final btlu btluVar, final amsy amsyVar, final int i) {
        tlc j = j(btluVar);
        j.f(new tld(this, amsyVar, i, btluVar) { // from class: tkz
            private final tle a;
            private final amsy b;
            private final int c;
            private final btlu d;

            {
                this.a = this;
                this.b = amsyVar;
                this.c = i;
                this.d = btluVar;
            }

            @Override // defpackage.tld
            public final dbsg a(tmd tmdVar) {
                tle tleVar = this.a;
                amsy amsyVar2 = this.b;
                int i2 = this.c;
                btlu btluVar2 = this.d;
                dbsg<amsy> b = tlf.b(tmdVar.c().e(), amsyVar2, i2);
                return !b.a() ? dbpy.a : tleVar.b.a(btluVar2, tmdVar, b.b());
            }
        });
        k(btluVar, j);
    }
}
