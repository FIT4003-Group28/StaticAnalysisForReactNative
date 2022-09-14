package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xlu  reason: default package */
/* loaded from: classes7.dex */
public final class xlu {
    private final cqba A;
    public final xlj a;
    public final xkw b;
    public final cjqy c;
    public final xmn d;
    public final xmg e;
    public final crzb f;
    public final bvrb g;
    @dzsi
    public bvpk h;
    private final xlg o;
    private final xlc p;
    private final cjqq q;
    private final akox r;
    private final akzh s;
    private final alhv t;
    public final Map<String, xli> i = new LinkedHashMap();
    private Set<String> u = new HashSet();
    @dzsi
    public xmf j = null;
    @dzsi
    public xli k = null;
    @dzsi
    private String v = null;
    public final Map<String, cjql> l = new HashMap();
    public final Map<String, cjql> m = new HashMap();
    public boolean n = false;
    private int w = 0;
    private final cqaw x = new cqaw(this) { // from class: xlm
        private final xlu a;

        {
            this.a = this;
        }

        @Override // defpackage.cqaw
        public final void a() {
            this.a.e();
        }
    };
    private final akzy y = new xls(this);
    private final alht z = new xlt(this);

    public xlu(xlg xlgVar, xlc xlcVar, xlj xljVar, xkw xkwVar, cjqy cjqyVar, cjqq cjqqVar, xmn xmnVar, akox akoxVar, akzh akzhVar, alhv alhvVar, xmg xmgVar, crzb crzbVar, bvrb bvrbVar, cqba cqbaVar) {
        this.o = xlgVar;
        this.p = xlcVar;
        this.a = xljVar;
        this.b = xkwVar;
        this.c = cjqyVar;
        this.q = cjqqVar;
        this.d = xmnVar;
        this.r = akoxVar;
        this.s = akzhVar;
        this.t = alhvVar;
        this.e = xmgVar;
        this.f = crzbVar;
        this.g = bvrbVar;
        this.A = cqbaVar;
    }

    static cjtd l(ddho ddhoVar, int i) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.i(i);
        return b.a();
    }

    private final List<xli> n() {
        ArrayList c = dchl.c(this.i.values());
        Collections.sort(c, xlq.a);
        final eaol eaolVar = new eaol(System.currentTimeMillis());
        dcft.y(c, new dbsl(eaolVar) { // from class: xlr
            private final eaol a;

            {
                this.a = eaolVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return ((xli) obj).k.i().x(this.a);
            }
        });
        return c;
    }

    private static boolean o(akzh akzhVar) {
        return akzhVar.k() >= 13.0f;
    }

    public final void a(List<xmx> list, boolean z) {
        b(list, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.util.List<defpackage.xmx> r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlu.b(java.util.List, boolean, boolean):void");
    }

    public final boolean c() {
        return !this.i.isEmpty();
    }

    public final void d() {
        String str;
        int i;
        int i2;
        this.f.a();
        HashSet hashSet = new HashSet();
        akzh b = this.s.b();
        for (Map.Entry<String, xli> entry : this.i.entrySet()) {
            int[] n = akyx.n(b, entry.getValue().a().a().a().a());
            bnuw A = b.A();
            if (n != null && (i = n[0]) >= 0 && i <= A.a() && (i2 = n[1]) >= 0 && i2 <= A.b()) {
                hashSet.add(entry.getKey());
            }
        }
        dcpd it = dcnm.p(hashSet, this.u).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            xli xliVar = this.i.get(str2);
            if (xliVar != null && !xliVar.f) {
                Map<String, cjql> map = this.l;
                cjqp g = this.q.g();
                xmf xmfVar = this.j;
                dbsk.s(xmfVar);
                map.put(str2, g.d(l(((xku) xmfVar).b, xliVar.h)));
                xmm xmmVar = this.d.d.get(str2);
                if (xmmVar != null) {
                    ddsq ddsqVar = xmmVar.a;
                    if (ddsqVar.c) {
                        ddsqVar.bF();
                        ddsqVar.c = false;
                    }
                    ddst ddstVar = (ddst) ddsqVar.b;
                    ddst ddstVar2 = ddst.j;
                    ddstVar.a |= 2;
                    ddstVar.c = true;
                }
                xliVar.f = true;
            }
        }
        this.u = hashSet;
        xli xliVar2 = this.k;
        if (xliVar2 == null || !hashSet.contains(xliVar2.k.a()) || !o(b)) {
            str = null;
        } else {
            xli xliVar3 = this.k;
            dbsk.s(xliVar3);
            str = xliVar3.k.a();
            if (str.equals(this.v)) {
                return;
            }
            xli xliVar4 = this.k;
            dbsk.s(xliVar4);
            if (xliVar4.g) {
                return;
            }
            Map<String, cjql> map2 = this.m;
            cjqp g2 = this.q.g();
            xmf xmfVar2 = this.j;
            dbsk.s(xmfVar2);
            ddho ddhoVar = ((xku) xmfVar2).c;
            xli xliVar5 = this.k;
            dbsk.s(xliVar5);
            map2.put(str, g2.d(l(ddhoVar, xliVar5.h)));
            xli xliVar6 = this.k;
            dbsk.s(xliVar6);
            xliVar6.g = true;
        }
        this.v = str;
    }

    public final void e() {
        bvpk bvpkVar = this.h;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        bvpk a = bvpk.a(new Runnable(this) { // from class: xlp
            private final xlu a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                xlu xluVar = this.a;
                xluVar.f.a();
                long currentTimeMillis = System.currentTimeMillis();
                eaol eaolVar = new eaol(System.currentTimeMillis());
                Iterator<Map.Entry<String, xli>> it = xluVar.i.entrySet().iterator();
                int i = 15000;
                while (it.hasNext()) {
                    Map.Entry<String, xli> next = it.next();
                    xli value = next.getValue();
                    if (!xluVar.f(value.k, eaolVar)) {
                        value.l = (xky) dcft.l(value.b, new dbsl(value.a.b() + 10) { // from class: xld
                            private final long a;

                            {
                                this.a = r1;
                            }

                            @Override // defpackage.dbsl
                            public final boolean a(Object obj) {
                                return ((xky) obj).b() > this.a;
                            }
                        }, null);
                        xky xkyVar = value.l;
                        aifa b = value.b();
                        if (xkyVar == null) {
                            xlj xljVar = xluVar.a;
                            aifq b2 = b.b();
                            xlb a2 = xljVar.e.a(value.k, value.j, value.equals(xluVar.k));
                            aifp i2 = b2.i();
                            i2.j(aiex.class, a2);
                            b.e(i2.i(), 1, 3000);
                        } else {
                            xlj xljVar2 = xluVar.a;
                            xmx xmxVar = value.k;
                            boolean equals = value.equals(xluVar.k);
                            akqq a3 = xkyVar.a();
                            eaol eaolVar2 = eaolVar;
                            Iterator<Map.Entry<String, xli>> it2 = it;
                            xlb a4 = xljVar2.e.a(xmxVar, TimeUnit.SECONDS.toMillis(xkyVar.c()), equals);
                            aifp j = aifq.j();
                            j.e = akra.f(a3);
                            j.k(0.0f, akwd.SCREEN_RELATIVE);
                            j.j(aiex.class, a4);
                            aifq i3 = j.i();
                            int max = Math.max(10, (int) (xkyVar.b() - currentTimeMillis));
                            b.f(i3, 3, max, true);
                            i = Math.min(i, max);
                            eaolVar = eaolVar2;
                            it = it2;
                        }
                    } else {
                        xluVar.b.a(value.k);
                        value.e();
                        it.remove();
                        xli xliVar = xluVar.k;
                        if (xliVar != null && xliVar.k.a().equals(next.getKey())) {
                            xluVar.k = null;
                            xluVar.n = false;
                            xluVar.g();
                        }
                        xluVar.d.a(next.getKey());
                    }
                }
                xluVar.d();
                dbsk.s(xluVar.h);
                xluVar.g.a(xluVar.h, bvrj.UI_THREAD, i);
            }
        });
        this.h = a;
        this.g.b(a, bvrj.UI_THREAD);
    }

    public final boolean f(xmx xmxVar, eaol eaolVar) {
        eaow eaowVar = new eaow(xmxVar.i(), eaolVar);
        xmf xmfVar = this.j;
        dbsk.s(xmfVar);
        return eaowVar.p(((xku) xmfVar).d);
    }

    public final void g() {
        if (!this.n) {
            this.k = (xli) dcft.r(n(), null);
        }
    }

    public final List<akqq> h() {
        ArrayList arrayList = new ArrayList();
        for (xli xliVar : dcft.v(n(), 2)) {
            arrayList.add(xliVar.a().a().a().e());
            dnoh g = xliVar.k.g();
            if (g != null) {
                arrayList.add(akqq.e(g));
            }
        }
        return arrayList;
    }

    public final boolean i() {
        return this.j != null;
    }

    public final void j() {
        this.f.a();
        bvpk bvpkVar = this.h;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        this.A.h(this.x);
        this.c.g();
        this.k = null;
        for (xli xliVar : this.i.values()) {
            xliVar.e();
        }
        this.i.clear();
        xkw xkwVar = this.b;
        for (int i = 0; i < xkwVar.a.size(); i++) {
            xkv valueAt = xkwVar.a.valueAt(i);
            valueAt.b().j();
            xkwVar.d.c(valueAt.c());
        }
        xkwVar.a.clear();
        xkwVar.c.e();
        xkwVar.d.d();
        xlc xlcVar = this.p;
        akvz e = xlcVar.b.a().e();
        aktg aktgVar = xlcVar.k;
        if (aktgVar != null) {
            e.j(aktgVar);
            xlcVar.k = null;
        }
        aktg aktgVar2 = xlcVar.l;
        if (aktgVar2 != null) {
            e.j(aktgVar2);
            xlcVar.l = null;
        }
        aktg aktgVar3 = xlcVar.m;
        if (aktgVar3 != null) {
            e.j(aktgVar3);
            xlcVar.m = null;
        }
        aktg aktgVar4 = xlcVar.n;
        if (aktgVar4 != null) {
            e.j(aktgVar4);
            xlcVar.n = null;
        }
        aktg aktgVar5 = xlcVar.o;
        if (aktgVar5 != null) {
            e.j(aktgVar5);
            xlcVar.o = null;
        }
        aktg aktgVar6 = xlcVar.p;
        if (aktgVar6 != null) {
            e.j(aktgVar6);
            xlcVar.p = null;
        }
        for (int i2 = 0; i2 < xlcVar.g.size(); i2++) {
            aktg valueAt2 = xlcVar.g.valueAt(i2);
            if (valueAt2 != null) {
                e.j(valueAt2);
            }
        }
        xlcVar.g.clear();
        for (int i3 = 0; i3 < xlcVar.f.size(); i3++) {
            aktg valueAt3 = xlcVar.f.valueAt(i3);
            if (valueAt3 != null) {
                e.j(valueAt3);
            }
        }
        xlcVar.f.clear();
        for (akuh akuhVar : xlcVar.i.values()) {
            e.j(akuhVar);
        }
        xlcVar.i.clear();
        for (akuh akuhVar2 : xlcVar.j.values()) {
            e.j(akuhVar2);
        }
        xlcVar.j.clear();
        for (akuh akuhVar3 : xlcVar.h.values()) {
            e.j(akuhVar3);
        }
        xlcVar.h.clear();
        xlcVar.e.clear();
        this.r.ac(this.y);
        this.t.c(this.z);
        xmn xmnVar = this.d;
        if (xmnVar.c != null) {
            for (xmm xmmVar : xmnVar.d.values()) {
                xmnVar.b(xmmVar);
            }
            xmnVar.d.clear();
            ddsk ddskVar = xmnVar.c;
            dbsk.s(ddskVar);
            ddsu bK = ddskVar.bK();
            xmnVar.c = null;
            if (!bK.d.isEmpty()) {
                cjqy cjqyVar = xmnVar.a;
                cjqyVar.u(new xmr(bK, xmnVar.b, cjqyVar.G()));
            }
        }
        this.j = null;
    }

    public final boolean k() {
        return o(this.s.b());
    }

    public final void m(int i) {
        xku xkuVar;
        dbsk.b(this.j == null, "A rendering session is already started!");
        if (i == 2) {
            xkuVar = new xku(ddda.fD, dtyc.cw, dtyc.cx, 2, eaow.c(2L), true, false);
        } else if (i == 3) {
            xkuVar = new xku(ddda.fJ, dtyc.fr, dtyc.fs, 3, eaow.c(2L), true, false);
        } else if (i == 4) {
            xkuVar = new xku(ddda.fE, dtyc.dx, dtyc.dy, 4, eaow.a(2L), false, false);
        } else if (i == 5) {
            xkuVar = new xku(ddda.fG, dtyc.fi, dtyc.fj, 5, eaow.c(2L), true, true);
        } else {
            xkuVar = new xku(ddda.fF, dtyc.dL, dtyc.dM, 6, eaow.a(2L), true, true);
        }
        this.j = xkuVar;
        this.r.ab(this.y);
        this.t.b(this.z);
        xmn xmnVar = this.d;
        xmf xmfVar = this.j;
        dbsk.s(xmfVar);
        int i2 = ((xku) xmfVar).g;
        dbsk.b(xmnVar.c == null, "A session has already started!");
        xmnVar.c = ddsu.e.bZ();
        ddsk ddskVar = xmnVar.c;
        if (ddskVar.c) {
            ddskVar.bF();
            ddskVar.c = false;
        }
        ddsu ddsuVar = (ddsu) ddskVar.b;
        ddsuVar.b = i2 - 1;
        ddsuVar.a |= 1;
        this.A.a(this.x);
    }
}
