package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: yuu  reason: default package */
/* loaded from: classes7.dex */
public class yuu {
    public final ail<cqtd, Bitmap> a;
    public final akox b;
    public final ales c;
    public final yuv d;
    public final alec e;
    public final hwe f;
    public final yvl g;
    public final AtomicInteger h;
    public final dbsl<dmpn> i;
    public final xlu j;
    public final Activity k;
    public boolean l;
    private final dbuv<String, x<yvk>> m;
    private final xdk n;
    private final dbty<xbk> o;
    private final xaz p;
    private final List<akte> q;
    private final List<akta> r;
    private final Set<dpsn> s;
    private dcdc<yvn> t;
    private final cqat u;

    public yuu(Activity activity, cqat cqatVar, xlu xluVar, akox akoxVar, ales alesVar, yuv yuvVar, alec alecVar, xdk xdkVar, final xbl xblVar, hwe hweVar, yvl yvlVar, xaz xazVar) {
        dbuo<Object, Object> a = dbuo.a();
        a.j(200L);
        this.m = a.d(new yut(this));
        this.a = new ail<>(30);
        this.h = new AtomicInteger();
        this.i = new xct();
        this.t = dcdc.e();
        this.l = false;
        this.k = activity;
        this.u = cqatVar;
        this.j = xluVar;
        this.b = akoxVar;
        this.c = alesVar;
        this.d = yuvVar;
        this.e = alecVar;
        this.n = xdkVar;
        this.o = dbud.a(new dbty(xblVar) { // from class: yts
            private final xbl a;

            {
                this.a = xblVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                xbl xblVar2 = this.a;
                xbd xbdVar = new xbd();
                eeu a2 = xblVar2.a.a();
                xbl.a(a2, 1);
                akox a3 = xblVar2.b.a();
                xbl.a(a3, 2);
                xbq a4 = xblVar2.c.a();
                xbl.a(a4, 3);
                vtn a5 = xblVar2.d.a();
                xbl.a(a5, 4);
                xbl.a(xbdVar, 5);
                return new xbk(a2, a3, a4, a5, xbdVar);
            }
        });
        this.f = hweVar;
        this.g = yvlVar;
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new HashSet();
        this.p = xazVar;
    }

    private final dbsg<xmx> e(yvq yvqVar, yvp yvpVar, yvs yvsVar, final yvt yvtVar) {
        Runnable runnable;
        cqtd cqtdVar;
        dpum dpumVar = yvpVar.c().d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        dnoh g = akqq.f(dpumVar).g();
        String h = yvtVar.h();
        if (h == null) {
            return dbpy.a;
        }
        eapr ab = yvtVar.ab();
        dbsg<yvk> f = f(h);
        akrk h2 = f.a() ? akrk.h(f.b().b().get(0)) : null;
        if (ab == null || h2 == null) {
            return dbpy.a;
        }
        xmv g2 = xmw.g();
        ((xms) g2).a = h2;
        xmw a = g2.a();
        Activity activity = this.k;
        cqat cqatVar = this.u;
        zvb e = yvqVar.e();
        dpce o = yvtVar.o();
        String a2 = yvsVar.a();
        donz f2 = yvtVar.f();
        dpyy a3 = yvtVar.a();
        dqea k = yvtVar.k();
        doza l = yvtVar.l();
        jhk p = yvqVar.p();
        Integer q = yvqVar.q();
        yvtVar.getClass();
        Runnable runnable2 = new Runnable(yvtVar) { // from class: yui
            private final yvt a;

            {
                this.a = yvtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        };
        drhn e2 = yvtVar.e();
        drhh b = this.p.b(e2);
        if (e2 == null || b == null) {
            runnable = runnable2;
            cqtdVar = null;
        } else {
            runnable = runnable2;
            cqtdVar = this.p.d(b, xaz.h(e2) && this.p.f(), false, null, true);
        }
        return dbsg.i(new xmy(activity, cqatVar, h, e, o, a2, g, ab, f2, a3, k, l, p, q, runnable, a, cqtdVar));
    }

    private final dbsg<yvk> f(String str) {
        x<yvk> b = this.m.b(str);
        if (b == null) {
            return dbpy.a;
        }
        yvk h = b.h();
        if (h != null && !h.b().isEmpty()) {
            int d = h.d();
            if (d == 0) {
                throw null;
            }
            if (d != 3) {
                return dbsg.i(h);
            }
        }
        return dbpy.a;
    }

    private final void g() {
        for (akte akteVar : this.q) {
            akteVar.j();
        }
        this.e.c(this.r);
        this.r.clear();
        this.q.clear();
        this.s.clear();
    }

    private static int h(int i) {
        if (i == -1) {
            return -12417548;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v45, types: [android.app.Activity, m] */
    /* JADX WARN: Type inference failed for: r1v34, types: [android.app.Activity, m] */
    public final void a(Iterable<? extends yvn> iterable, boolean z) {
        final dcep<String> B;
        dcdc q = dcdc.q(iterable);
        if (z || !dchl.m(q, this.t)) {
            this.t = dcdc.r(q);
            final boolean q2 = dcbg.b(q).q(yud.a);
            dcbg o = dcbg.b(q).o(new dbsl(q2) { // from class: yue
                private final boolean a;

                {
                    this.a = q2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    yvn yvnVar = (yvn) obj;
                    return yvnVar.x().equals(yvm.DRAW_ALL) || (this.a && yvnVar.x().equals(yvm.DRAW_FIRST_LINE_ONLY));
                }
            });
            if (dcft.w(o)) {
                d();
                return;
            }
            int incrementAndGet = this.h.incrementAndGet();
            dccx F = dcdc.F();
            for (yvn yvnVar : o) {
                yvm x = yvnVar.x();
                if (x.equals(yvm.DRAW_ALL)) {
                    F.i(yvnVar.b());
                } else if (x.equals(yvm.DRAW_FIRST_LINE_ONLY)) {
                    F.i(dcft.v(yvnVar.b(), 1));
                }
            }
            dcdc f = F.f();
            try {
                dbwu<K, V> dbwuVar = ((dbvs) this.m).a;
                LinkedHashMap h = dcjz.h();
                LinkedHashSet h2 = dcnm.h();
                for (Object obj : f) {
                    Object obj2 = dbwuVar.get(obj);
                    if (!h.containsKey(obj)) {
                        h.put(obj, obj2);
                        if (obj2 == null) {
                            h2.add(obj);
                        }
                    }
                }
                if (!h2.isEmpty()) {
                    try {
                        Map r = dbwuVar.r(h2, dbwuVar.s);
                        for (Object obj3 : h2) {
                            Object obj4 = r.get(obj3);
                            if (obj4 != null) {
                                h.put(obj3, obj4);
                            } else {
                                String valueOf = String.valueOf(obj3);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                sb.append("loadAll failed to return a value for ");
                                sb.append(valueOf);
                                throw new dbuq(sb.toString());
                            }
                        }
                    } catch (dbur unused) {
                        for (Object obj5 : h2) {
                            h.put(obj5, dbwuVar.q(obj5, dbwuVar.s));
                        }
                    }
                }
                dcdn r2 = dcdn.r(h);
                Collection keySet = r2.keySet();
                Set g = dcnm.g();
                dcft.h(g, keySet);
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                x xVar = new x();
                xVar.b(this.k, yuf.a);
                Iterator it = r2.keySet().iterator();
                x xVar2 = xVar;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    x xVar3 = (x) r2.get(str);
                    dcdn dcdnVar = r2;
                    x xVar4 = xVar2;
                    xVar4.m(xVar3, new yum(this, g, atomicBoolean, o, incrementAndGet, z, xVar2));
                    if (xVar3.h() != 0) {
                        xVar4.n(xVar3);
                        g.remove(str);
                    }
                    if (g.isEmpty() && atomicBoolean.get()) {
                        atomicBoolean.set(false);
                        c(o, incrementAndGet, z);
                        xVar4.e(this.k);
                        break;
                    }
                    xVar2 = xVar4;
                    r2 = dcdnVar;
                }
            } catch (ExecutionException unused2) {
            }
            if (dcft.w(o)) {
                this.n.b();
                return;
            }
            dcdc A = dcbg.b(o).o(yuj.a).A(yuk.a);
            final yvn yvnVar2 = (yvn) dcft.r(A, null);
            this.n.a(dcbg.b(o).o(yul.a).o(new dbsl(yvnVar2) { // from class: ytt
                private final yvn a;

                {
                    this.a = yvnVar2;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj6) {
                    return !((yvn) obj6).equals(this.a);
                }
            }).s(ytu.a), true);
            if (this.l) {
                if (yvnVar2 != null) {
                    hwe hweVar = this.f;
                    dpsn dpsnVar = yvnVar2.c().c;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    akqi j = akqi.j(dpsnVar);
                    dpum dpumVar = yvnVar2.c().d;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    hweVar.a(j, akra.f(akqq.f(dpumVar)));
                    return;
                }
                this.f.c();
            } else if (yvnVar2 != null) {
                final xbk a = this.o.a();
                dpsn dpsnVar2 = yvnVar2.c().c;
                if (dpsnVar2 == null) {
                    dpsnVar2 = dpsn.d;
                }
                akqi j2 = akqi.j(dpsnVar2);
                String str2 = yvnVar2.c().b;
                String s = yvnVar2.s();
                final dcdc<dpce> r3 = yvnVar2.r();
                dcbg t = dcbg.b(A).o(ytw.a).s(ytx.a).o(yty.a).s(ytz.a).t(yua.a);
                r3.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet(t.o(new dbsl(r3) { // from class: yub
                    private final dcdc a;

                    {
                        this.a = r3;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj6) {
                        return this.a.contains((dpce) obj6);
                    }
                }).z());
                linkedHashSet.addAll(r3);
                zvb zvbVar = new zvb(dcdc.r(linkedHashSet));
                dpum dpumVar2 = yvnVar2.c().d;
                if (dpumVar2 == null) {
                    dpumVar2 = dpum.d;
                }
                akqq f2 = akqq.f(dpumVar2);
                yvnVar2.getClass();
                dcdc z2 = dcbg.b(dcdc.f(new xbc(j2, str2, s, zvbVar, f2, new Runnable(yvnVar2) { // from class: ytv
                    private final yvn a;

                    {
                        this.a = yvnVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.u();
                    }
                }, yvnVar2.v()))).s(new dbrn(a) { // from class: xbf
                    private final xbk a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj6) {
                        xbe xbeVar = (xbe) obj6;
                        xbq xbqVar = this.a.c;
                        xbq.a(xbqVar.a.a(), 1);
                        akox a2 = xbqVar.b.a();
                        xbq.a(a2, 2);
                        xbr a3 = xbqVar.c.a();
                        xbq.a(a3, 3);
                        xbq.a(xbqVar.d.a(), 4);
                        xbq.a(xbeVar, 5);
                        return new xbp(a2, a3, xbeVar);
                    }
                }).z();
                a.a();
                if (z2.isEmpty()) {
                    return;
                }
                synchronized (a) {
                    dcpe listIterator = z2.listIterator();
                    while (listIterator.hasNext()) {
                        xbp xbpVar = (xbp) listIterator.next();
                        a.f.put(xbpVar.c.a(), xbpVar);
                    }
                    B = dcbg.b(((dznt) a.f).values()).t(xbh.a).s(new dbrn(a) { // from class: xbi
                        private final xbk a;

                        {
                            this.a = a;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj6) {
                            return dbsj.e(this.a.d.a((String) obj6, vtj.TRANSIT_LIGHT));
                        }
                    }).o(xbj.a).B();
                    a.g = B;
                }
                a.d.h(B, new vti(a, B) { // from class: xbg
                    private final xbk a;
                    private final dcep b;

                    {
                        this.a = a;
                        this.b = B;
                    }

                    @Override // defpackage.vti
                    public final void a() {
                        dcdc dcdcVar;
                        int i;
                        xbk xbkVar = this.a;
                        dcep dcepVar = this.b;
                        if (!xbkVar.a.b()) {
                            return;
                        }
                        synchronized (xbkVar) {
                            if (!dcepVar.equals(xbkVar.g)) {
                                return;
                            }
                            dcdc r4 = dcdc.r(((dznt) xbkVar.f).values());
                            int size = r4.size();
                            int i2 = 0;
                            while (i2 < size) {
                                xbp xbpVar2 = (xbp) r4.get(i2);
                                amrg amrgVar = xbkVar.b;
                                btti bttiVar = xbkVar.e;
                                xbpVar2.a(amrgVar);
                                xbr xbrVar = xbpVar2.b;
                                akra f3 = akra.f(xbpVar2.c.e());
                                String b = xbpVar2.c.b();
                                dcdc<dpce> c = xbpVar2.c.d().c();
                                String c2 = xbpVar2.c.c();
                                dmpe dmpeVar = (dmpe) dmph.f.bZ();
                                ArrayList arrayList = new ArrayList(5);
                                if (!TextUtils.isEmpty(b)) {
                                    float g2 = c2 == null ? 0.0f : xbrVar.g(c2, 12.0f);
                                    dcdcVar = r4;
                                    dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                                    String l = xbrVar.l(b, g2);
                                    if (dmpcVar.c) {
                                        dmpcVar.bF();
                                        dmpcVar.c = false;
                                    }
                                    dmpd dmpdVar = (dmpd) dmpcVar.b;
                                    l.getClass();
                                    i = size;
                                    dmpdVar.a |= 1;
                                    dmpdVar.b = l;
                                    int a2 = xbrVar.b().a();
                                    if (dmpcVar.c) {
                                        dmpcVar.bF();
                                        dmpcVar.c = false;
                                    }
                                    dmpd dmpdVar2 = (dmpd) dmpcVar.b;
                                    dmpdVar2.a |= 2;
                                    dmpdVar2.c = a2;
                                    arrayList.add((dmpd) dmpcVar.bK());
                                } else {
                                    dcdcVar = r4;
                                    i = size;
                                }
                                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(c2)) {
                                    dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
                                    if (dmpcVar2.c) {
                                        dmpcVar2.bF();
                                        dmpcVar2.c = false;
                                    }
                                    dmpd dmpdVar3 = (dmpd) dmpcVar2.b;
                                    dmpdVar3.a |= 1;
                                    dmpdVar3.b = " · ";
                                    int a3 = xbrVar.b().a();
                                    if (dmpcVar2.c) {
                                        dmpcVar2.bF();
                                        dmpcVar2.c = false;
                                    }
                                    dmpd dmpdVar4 = (dmpd) dmpcVar2.b;
                                    dmpdVar4.a |= 2;
                                    dmpdVar4.c = a3;
                                    arrayList.add((dmpd) dmpcVar2.bK());
                                }
                                if (!TextUtils.isEmpty(c2)) {
                                    dmpc dmpcVar3 = (dmpc) dmpd.h.bZ();
                                    if (dmpcVar3.c) {
                                        dmpcVar3.bF();
                                        dmpcVar3.c = false;
                                    }
                                    dmpd dmpdVar5 = (dmpd) dmpcVar3.b;
                                    c2.getClass();
                                    dmpdVar5.a |= 1;
                                    dmpdVar5.b = c2;
                                    if (xbrVar.m == null) {
                                        xbrVar.m = xbrVar.f(12, ire.q().b(xbrVar.c));
                                    }
                                    aktg aktgVar = xbrVar.m;
                                    dbsk.s(aktgVar);
                                    int a4 = aktgVar.a();
                                    if (dmpcVar3.c) {
                                        dmpcVar3.bF();
                                        dmpcVar3.c = false;
                                    }
                                    dmpd dmpdVar6 = (dmpd) dmpcVar3.b;
                                    dmpdVar6.a |= 2;
                                    dmpdVar6.c = a4;
                                    arrayList.add((dmpd) dmpcVar3.bK());
                                }
                                xbrVar.a(dmpeVar, arrayList);
                                if (!c.isEmpty()) {
                                    dmpc dmpcVar4 = (dmpc) dmpd.h.bZ();
                                    int a5 = xbrVar.e(c).a();
                                    if (dmpcVar4.c) {
                                        dmpcVar4.bF();
                                        dmpcVar4.c = false;
                                    }
                                    dmpd dmpdVar7 = (dmpd) dmpcVar4.b;
                                    dmpdVar7.a |= 2;
                                    dmpdVar7.c = a5;
                                    xbrVar.a(dmpeVar, dcdc.f((dmpd) dmpcVar4.bK()));
                                }
                                aktc d = xbpVar2.a.d(xbrVar.h(dmpeVar, f3), dmti.WORLD_ENCODING_LAT_LNG_E7);
                                xbpVar2.d = d;
                                d.Pt(new xbo(xbpVar2));
                                amrb g3 = amrc.g();
                                g3.f(amsb.PLACEMARK);
                                g3.d(0);
                                g3.e(xbr.a);
                                g3.b(d);
                                g3.c(bttiVar);
                                amrgVar.c(g3.g());
                                i2++;
                                size = i;
                                r4 = dcdcVar;
                            }
                        }
                    }
                });
            } else {
                this.o.a().a();
            }
        }
    }

    public final void b() {
        a(this.t, true);
    }

    public final void c(Iterable<? extends yvn> iterable, int i, boolean z) {
        yvq yvqVar;
        yvp C;
        List<akte> f;
        Iterator it;
        dcdc<String> dcdcVar;
        int i2;
        yun yunVar;
        akrn c;
        if (i == this.h.get()) {
            g();
            dccx F = dcdc.F();
            HashMap hashMap = new HashMap();
            Iterator it2 = dcbg.d(dcft.i(iterable, yug.a), dcft.i(iterable, yuh.a)).iterator();
            while (true) {
                int i3 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                yvn yvnVar = (yvn) it2.next();
                ArrayList arrayList = new ArrayList();
                dcdc<String> b = yvnVar.b();
                int size = b.size();
                double d = Double.NaN;
                int i4 = 0;
                boolean z2 = true;
                while (i4 < size) {
                    dbsg<yvk> f2 = f(b.get(i4));
                    if (!f2.a()) {
                        it = it2;
                        dcdcVar = b;
                        i2 = size;
                    } else {
                        yvk b2 = f2.b();
                        dvzn dvznVar = b2.b().get(i3);
                        if (hashMap.containsKey(dvznVar)) {
                            yunVar = (yun) hashMap.get(dvznVar);
                            it = it2;
                            dcdcVar = b;
                            i2 = size;
                        } else {
                            it = it2;
                            int i5 = true != yvnVar.x().equals(yvm.DRAW_ALL) ? 2 : 1;
                            dcdcVar = b;
                            int a = yvnVar.a();
                            i2 = size;
                            dvzn dvznVar2 = b2.b().get(0);
                            dpum dpumVar = yvnVar.c().d;
                            if (dpumVar == null) {
                                dpumVar = dpum.d;
                            }
                            yun yunVar2 = new yun(a, dvznVar2, i5, akqq.f(dpumVar));
                            hashMap.put(dvznVar, yunVar2);
                            F.g(yunVar2);
                            yunVar = yunVar2;
                        }
                        if (yunVar != null && yvnVar.x().equals(yvm.DRAW_ALL)) {
                            yunVar.b.i(b2.c());
                        }
                        if (yunVar != null && (c = yunVar.c()) != null) {
                            double d2 = c.b;
                            if (z2) {
                                if (Double.isNaN(d)) {
                                    d = d2;
                                } else if (Math.abs(d2 - d) > 20.0d) {
                                    z2 = false;
                                }
                            }
                        }
                        if (yunVar != null) {
                            arrayList.add(yunVar);
                        }
                    }
                    i4++;
                    it2 = it;
                    b = dcdcVar;
                    size = i2;
                    i3 = 0;
                }
                Iterator it3 = it2;
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((yun) arrayList.get(i6)).c = z2;
                }
                it2 = it3;
            }
            dcdc f3 = F.f();
            for (yun yunVar3 : dchl.l(f3)) {
                if (Color.alpha(yunVar3.a) != 0) {
                    int i7 = yunVar3.d;
                    int h = h(yunVar3.a);
                    if (i7 == 1) {
                        akrn c2 = yunVar3.c();
                        int i8 = (c2 == null || !yunVar3.c) ? 0 : c2.d;
                        if (i8 == 0) {
                            f = dcdc.f(this.c.c(yunVar3.a(), h));
                        } else {
                            ales alesVar = this.c;
                            f = alesVar.a.d(yunVar3.a().q(), new int[]{i8}, dcdc.g(alesVar.f(Color.argb(Color.alpha(h), (int) (255.0f - ((255 - Color.red(h)) * 0.3f)), (int) (255.0f - ((255 - Color.green(h)) * 0.3f)), (int) (255.0f - ((255 - Color.blue(h)) * 0.3f)))), alesVar.f(h)), 0, 2, 2, 1, 0.0f);
                        }
                    } else {
                        f = dcdc.f(this.d.c(yunVar3.a(), h));
                    }
                    for (akte akteVar : f) {
                        this.b.aj().aF().c().f(akteVar);
                        this.q.add(akteVar);
                    }
                }
            }
            int size3 = f3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                yun yunVar4 = (yun) f3.get(i9);
                if (Color.alpha(yunVar4.a) != 0) {
                    List<akta> list = this.r;
                    dcdc<drij> v = yunVar4.b.f().v();
                    int h2 = h(yunVar4.a);
                    ArrayList arrayList2 = new ArrayList();
                    for (drij drijVar : v) {
                        if ((drijVar.a & 2) != 0) {
                            Set<dpsn> set = this.s;
                            dpsn dpsnVar = drijVar.c;
                            if (dpsnVar == null) {
                                dpsnVar = dpsn.d;
                            }
                            if (!set.contains(dpsnVar)) {
                            }
                        }
                        if ((drijVar.a & 4) != 0) {
                            alxh b3 = yunVar4.b();
                            dpum dpumVar2 = drijVar.d;
                            if (dpumVar2 == null) {
                                dpumVar2 = dpum.d;
                            }
                            akrn a2 = bzlt.a(b3, dpumVar2, 250.0d);
                            if (a2 != null) {
                                arrayList2.add(a2.a.S());
                                if ((drijVar.a & 2) != 0) {
                                    Set<dpsn> set2 = this.s;
                                    dpsn dpsnVar2 = drijVar.c;
                                    if (dpsnVar2 == null) {
                                        dpsnVar2 = dpsn.d;
                                    }
                                    set2.add(dpsnVar2);
                                }
                            }
                        }
                    }
                    dccx F2 = dcdc.F();
                    int size4 = arrayList2.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        akta a3 = this.e.a(new alet((akqq) arrayList2.get(i10), h2, 1), bntp.POLYLINE_MEASLES.c());
                        this.b.aj().aF().b().c(a3);
                        F2.g(a3);
                    }
                    list.addAll(F2.f());
                }
            }
            if (iterable == null || !this.j.i()) {
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            yvn yvnVar2 = (yvn) dcft.r(iterable, null);
            if (!(yvnVar2 instanceof yvq) || (C = (yvqVar = (yvq) yvnVar2).C()) == null) {
                return;
            }
            for (yvs yvsVar : C.f()) {
                yvt b4 = yvsVar.b();
                if (b4 != null) {
                    dbsg<xmx> e = e(yvqVar, C, yvsVar, b4);
                    if (e.a()) {
                        arrayList3.add(e.b());
                    }
                }
                List<yvt> c3 = yvsVar.c();
                if (!c3.isEmpty()) {
                    dbsg<xmx> e2 = e(yvqVar, C, yvsVar, c3.get(0));
                    if (e2.a()) {
                        arrayList3.add(e2.b());
                    }
                }
            }
            this.j.b(arrayList3, !z, false);
        }
    }

    public final void d() {
        this.n.b();
        this.o.a().a();
        this.f.c();
        g();
    }
}
