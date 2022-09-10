package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: apwn  reason: default package */
/* loaded from: classes2.dex */
public final class apwn implements apyu {
    public static final /* synthetic */ int g = 0;
    private static final dcdn<dbsi<Integer, Boolean>, ddda> h;
    public final aqwo a;
    public final dehq b;
    public final apzy c;
    public final apyx d;
    public final aqwq e;
    private final cqat i;
    private final aujb j;
    private final cjqy k;
    private final bvdh l;
    private final bvbr m;
    private final bvbo n;
    private final bvbl o;
    private final dxio<aqcl> p;
    private aqck t;
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>>> q = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Map<String, dbsi<Integer, dehn<apzn>>>> r = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, Object>> s = new ConcurrentHashMap<>();
    public final Map<dbsi<String, btlu>, Long> f = new HashMap();

    static {
        dcdg p = dcdn.p();
        p.f(dbsi.a(0, true), ddda.bb);
        p.f(dbsi.a(0, false), ddda.ba);
        p.f(dbsi.a(1, true), ddda.aZ);
        p.f(dbsi.a(1, false), ddda.aY);
        p.f(dbsi.a(2, true), ddda.aL);
        p.f(dbsi.a(2, false), ddda.aK);
        h = p.b();
    }

    public apwn(aqwo aqwoVar, dehq dehqVar, auur auurVar, cqat cqatVar, apzy apzyVar, cjqy cjqyVar, apyx apyxVar, bvdh bvdhVar, bvbr bvbrVar, bvbo bvboVar, bvbl bvblVar, aqwq aqwqVar, dxio dxioVar) {
        this.a = aqwoVar;
        this.b = dehqVar;
        this.j = auurVar;
        this.i = cqatVar;
        this.c = apzyVar;
        this.k = cjqyVar;
        this.d = apyxVar;
        this.l = bvdhVar;
        this.m = bvbrVar;
        this.n = bvboVar;
        this.o = bvblVar;
        this.e = aqwqVar;
        this.p = dxioVar;
    }

    private final dehn<apzn> k(int i, String str, btlu btluVar) {
        dehn h2;
        l(btluVar);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.s.get(btluVar.d);
        dbsk.s(concurrentHashMap);
        concurrentHashMap.putIfAbsent(str, new Object());
        Map<String, dbsi<Integer, dehn<apzn>>> map = this.r.get(btluVar.d);
        dbsk.s(map);
        Object obj = concurrentHashMap.get(str);
        dbsk.s(obj);
        synchronized (obj) {
            dbsi<Integer, dehn<apzn>> dbsiVar = map.get(str);
            if (dbsiVar != null) {
                if (i != 2) {
                    if (dbsiVar.a.intValue() != i) {
                        if (dbsiVar.a.intValue() != 2) {
                            return deha.c();
                        }
                    } else {
                        return dbsiVar.b;
                    }
                } else {
                    return dbsiVar.b;
                }
            }
            deig d = deig.d();
            map.put(str, dbsi.a(Integer.valueOf(i), d));
            i(str, 1, btluVar);
            if (i == 0) {
                dhwr bZ = dhws.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhws dhwsVar = (dhws) bZ.b;
                str.getClass();
                dhwsVar.a = 2 | dhwsVar.a;
                dhwsVar.b = str;
                h2 = deew.h(btzj.a(this.n, bZ.bK()), apwk.a, dege.a);
            } else if (i == 1) {
                dhvr bZ2 = dhvs.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhvs dhvsVar = (dhvs) bZ2.b;
                str.getClass();
                dhvsVar.a = 2 | dhvsVar.a;
                dhvsVar.b = str;
                h2 = deew.h(btzj.a(this.o, bZ2.bK()), apwb.a, dege.a);
            } else {
                dhzn bZ3 = dhzo.c.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dhzo dhzoVar = (dhzo) bZ3.b;
                str.getClass();
                dhzoVar.a = 2 | dhzoVar.a;
                dhzoVar.b = str;
                h2 = deew.h(btzj.a(this.m, bZ3.bK()), apwc.a, dege.a);
            }
            deha.q(h2, new apwl(this, i, str, concurrentHashMap, map, d, btluVar), this.b);
            return d;
        }
    }

    private final void l(btlu btluVar) {
        this.q.putIfAbsent(btluVar.d, new ConcurrentHashMap<>());
        this.r.putIfAbsent(btluVar.d, new ConcurrentHashMap());
        this.s.putIfAbsent(btluVar.d, new ConcurrentHashMap<>());
    }

    @Override // defpackage.apyu
    public final dbsg<apzn> a(String str, btlu btluVar) {
        return this.e.a(str, btluVar);
    }

    @Override // defpackage.apyu
    public final crzm<apsi<dbsg<apzn>>> b(String str, btlu btluVar) {
        if (!this.d.b()) {
            return new crzo().a;
        }
        l(btluVar);
        ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>> concurrentHashMap = this.q.get(btluVar.d);
        dbsk.s(concurrentHashMap);
        concurrentHashMap.putIfAbsent(str, new crzo<>());
        f(dcep.B(str), btluVar);
        ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>> concurrentHashMap2 = this.q.get(btluVar.d);
        dbsk.s(concurrentHashMap2);
        crzo<apsi<dbsg<apzn>>> crzoVar = concurrentHashMap2.get(str);
        dbsk.s(crzoVar);
        return crzoVar.a;
    }

    @Override // defpackage.apyu
    public final dehn<Set<String>> c(Set<String> set, final btlu btluVar) {
        apzy apzyVar = this.c;
        int i = !apzyVar.j() ? 0 : apzyVar.a.a().getBusinessMessagingParameters().Q;
        if (i == 0) {
            return deha.a(set);
        }
        final long b = this.i.b();
        dcdc A = dcbg.b(set).s(new dbrn(this, btluVar) { // from class: apwa
            private final apwn a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                apwn apwnVar = this.a;
                String str = (String) obj;
                return dbsi.a(Long.valueOf(apwnVar.a.b.x(aqwo.a(str), this.b, 0L)), str);
            }
        }).A(dbsh.a);
        if (b > ((Long) ((dbsi) dcft.r(A, dbsi.a(Long.valueOf(b), ""))).a).longValue()) {
            dhms bZ = dhmv.e.bZ();
            dcbg x = dcbg.b(A).s(apwf.a).x(i);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmv dhmvVar = (dhmv) bZ.b;
            dsrj<String> dsrjVar = dhmvVar.b;
            if (!dsrjVar.a()) {
                dhmvVar.b = dsqw.cl(dsrjVar);
            }
            dsod.bv(x, dhmvVar.b);
            dhmt bZ2 = dhmu.c.bZ();
            dgdc dgdcVar = dgdc.MESSAGING;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhmu dhmuVar = (dhmu) bZ2.b;
            dhmuVar.b = dgdcVar.i;
            dhmuVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmv dhmvVar2 = (dhmv) bZ.b;
            dhmu bK = bZ2.bK();
            bK.getClass();
            dsrj<dhmu> dsrjVar2 = dhmvVar2.c;
            if (!dsrjVar2.a()) {
                dhmvVar2.c = dsqw.cl(dsrjVar2);
            }
            dhmvVar2.c.add(bK);
            dnqg bZ3 = dnqh.p.bZ();
            int i2 = ddda.ai.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ3.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i2;
            dnqh bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhmv dhmvVar3 = (dhmv) bZ.b;
            bK2.getClass();
            dhmvVar3.d = bK2;
            dhmvVar3.a |= 1;
            return deew.h(btzj.a(this.l, bZ.bK()), new dbrn(this, btluVar, b) { // from class: apwg
                private final apwn a;
                private final btlu b;
                private final long c;

                {
                    this.a = this;
                    this.b = btluVar;
                    this.c = b;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    apwn apwnVar = this.a;
                    btlu btluVar2 = this.b;
                    long j = this.c;
                    btzx btzxVar = (btzx) obj;
                    dcep B = dcbg.b(((dhmx) btzxVar.b()).a).o(apwd.a).s(apwe.a).B();
                    for (dixi dixiVar : ((dhmx) btzxVar.b()).a) {
                        aqwo aqwoVar = apwnVar.a;
                        String str = dixiVar.a;
                        dgde dgdeVar = dixiVar.b;
                        if (dgdeVar == null) {
                            dgdeVar = dgde.f;
                        }
                        dgdl dgdlVar = dgdeVar.c;
                        if (dgdlVar == null) {
                            dgdlVar = dgdl.b;
                        }
                        aqwoVar.b.T(aqwo.b(str), btluVar2, dgdlVar.a);
                        apzy apzyVar2 = aqwoVar.a;
                        aqwoVar.b.aa(aqwo.a(str), btluVar2, (!apzyVar2.j() ? 0L : TimeUnit.SECONDS.toMillis(apzyVar2.a.a().getBusinessMessagingParameters().R)) + j);
                    }
                    return B;
                }
            }, this.b);
        }
        return deha.a(dcbg.b(set).o(new dbsl(this, btluVar) { // from class: apwh
            private final apwn a;
            private final btlu b;

            {
                this.a = this;
                this.b = btluVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                apwn apwnVar = this.a;
                return apwnVar.a.b.o(aqwo.b((String) obj), this.b, false);
            }
        }).B());
    }

    @Override // defpackage.apyu
    public final dehn<apzn> d(String str, btlu btluVar) {
        if (!this.d.b()) {
            return deha.c();
        }
        l(btluVar);
        ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>> concurrentHashMap = this.q.get(btluVar.d);
        dbsk.s(concurrentHashMap);
        concurrentHashMap.putIfAbsent(str, new crzo<>());
        return k(0, str, btluVar);
    }

    @Override // defpackage.apyu
    public final dehn<apzn> e(String str, btlu btluVar) {
        if (!this.d.b()) {
            return deha.c();
        }
        l(btluVar);
        ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>> concurrentHashMap = this.q.get(btluVar.d);
        dbsk.s(concurrentHashMap);
        concurrentHashMap.putIfAbsent(str, new crzo<>());
        return k(1, str, btluVar);
    }

    public final void f(Set<String> set, final btlu btluVar) {
        long j;
        if (!g(btluVar)) {
            return;
        }
        l(btluVar);
        for (final String str : set) {
            Map<String, dbsi<Integer, dehn<apzn>>> map = this.r.get(btluVar.d);
            dbsk.s(map);
            if (!map.containsKey(str)) {
                if (!czhz.a() && !this.f.containsKey(dbsi.a(str, btluVar))) {
                    Map<dbsi<String, btlu>, Long> map2 = this.f;
                    dbsi<String, btlu> a = dbsi.a(str, btluVar);
                    aqwq aqwqVar = this.e;
                    synchronized (aqwqVar.e) {
                        j = new eapd(aqwqVar.d.x(aqwq.f(str), btluVar, 0L)).e(eaow.d(aqwqVar.c.getBusinessMessagingParameters().W)).a;
                    }
                    map2.put(a, Long.valueOf(j));
                }
                if (System.currentTimeMillis() <= ((Long) dbsc.a(this.f.get(dbsi.a(str, btluVar)), 0L)).longValue()) {
                    deha.e(new Runnable(this, str, btluVar) { // from class: apwi
                        private final apwn a;
                        private final String b;
                        private final btlu c;

                        {
                            this.a = this;
                            this.b = str;
                            this.c = btluVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.i(this.b, 3, this.c);
                        }
                    }, this.b);
                } else {
                    deew.g(k(2, str, btluVar), new defg(this, btluVar, str) { // from class: apwj
                        private final apwn a;
                        private final btlu b;
                        private final String c;

                        {
                            this.a = this;
                            this.b = btluVar;
                            this.c = str;
                        }

                        @Override // defpackage.defg
                        public final dehn a(Object obj) {
                            apwn apwnVar = this.a;
                            btlu btluVar2 = this.b;
                            String str2 = this.c;
                            apzn apznVar = (apzn) obj;
                            apwnVar.d.h();
                            deha.q(deha.a(false), new apwm(apwnVar, str2, btluVar2), apwnVar.b);
                            return deha.a(null);
                        }
                    }, this.b);
                }
            }
        }
    }

    public final boolean g(btlu btluVar) {
        return this.d.b() && btluVar.l();
    }

    public final void h(int i, boolean z, String str) {
        ddda dddaVar = h.get(dbsi.a(Integer.valueOf(i), Boolean.valueOf(z)));
        if (dddaVar == null) {
            return;
        }
        ddzf bZ = ddzg.t.bZ();
        ddii bZ2 = ddij.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddij ddijVar = (ddij) bZ2.b;
        str.getClass();
        ddijVar.a |= 2;
        ddijVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ.b;
        ddij bK = bZ2.bK();
        bK.getClass();
        ddzgVar.p = bK;
        ddzgVar.b |= 134217728;
        aqcj aqcjVar = aqcj.ENABLED;
        if (this.t == null) {
            this.t = this.p.a().a(this.j);
        }
        int ordinal = this.t.a().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ddcg bZ3 = ddcj.g.bZ();
                ddci ddciVar = ddci.SUPPRESSED_FOR_OPTOUT;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ddcj ddcjVar = (ddcj) bZ3.b;
                ddcjVar.e = ddciVar.l;
                ddcjVar.a |= 8;
                ddcj bK2 = bZ3.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddzg ddzgVar2 = (ddzg) bZ.b;
                bK2.getClass();
                ddzgVar2.o = bK2;
                ddzgVar2.b |= 32768;
            } else {
                ddcg bZ4 = ddcj.g.bZ();
                ddci ddciVar2 = ddci.SUPPRESSED_BY_SYSTEM;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                ddcj ddcjVar2 = (ddcj) bZ4.b;
                ddcjVar2.e = ddciVar2.l;
                ddcjVar2.a |= 8;
                ddcj bK3 = bZ4.bK();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddzg ddzgVar3 = (ddzg) bZ.b;
                bK3.getClass();
                ddzgVar3.o = bK3;
                ddzgVar3.b |= 32768;
            }
        }
        cjqy cjqyVar = this.k;
        cjst d = cjsu.d();
        d.d(dddaVar);
        cjry e = cjrz.e();
        e.b(ddcu.l);
        ((cjrn) e).a = bZ.bK();
        d.f(e.a());
        cjqyVar.l(d.e());
    }

    public final void i(String str, int i, btlu btluVar) {
        ConcurrentHashMap<String, crzo<apsi<dbsg<apzn>>>> concurrentHashMap = this.q.get(btluVar.d);
        dbsk.s(concurrentHashMap);
        crzo<apsi<dbsg<apzn>>> crzoVar = concurrentHashMap.get(str);
        if (crzoVar == null) {
            return;
        }
        crzoVar.b(apsi.c(i, this.e.a(str, btluVar)));
    }

    @Override // defpackage.apyu
    public final void j() {
        deha.c();
    }
}
