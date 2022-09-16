package defpackage;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: brmk  reason: default package */
/* loaded from: classes4.dex */
public final class brmk implements crzp<aktu> {
    public final akox a;
    public final btrm b;
    public final dehq c;
    public final HashMap<akqi, brmj> d;
    public boolean e;
    public boolean f;
    public boolean g = true;
    public volatile boolean h;
    public volatile boolean i;
    public akqi j;
    private final gle k;
    private final dxio<akzh> l;
    private final cklq m;
    private final brln n;
    private final bwrs<brlu> o;
    private final brpk p;
    private final jkf q;
    private final brat r;
    private final crzo<brmi> s;
    private final HashSet<akqi> t;
    private aktu u;

    public brmk(akox akoxVar, gle gleVar, btrm btrmVar, dxio<akzh> dxioVar, brpk brpkVar, cklq cklqVar, jkf jkfVar, brat bratVar, brlk brlkVar, dehq dehqVar) {
        this.a = akoxVar;
        this.k = gleVar;
        this.b = btrmVar;
        this.l = dxioVar;
        this.p = brpkVar;
        this.m = cklqVar;
        brln d = brlkVar.d();
        dbsk.t(d, "Null search request");
        this.n = d;
        this.o = brlkVar.b();
        this.c = dehqVar;
        this.q = jkfVar;
        this.r = bratVar;
        this.t = new HashSet<>();
        this.d = new HashMap<>();
        this.s = new crzo<>(brmi.NO_LABELS);
        new crzp(this) { // from class: brmg
            private final brmk a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                brmk brmkVar = this.a;
                brlu brluVar = (brlu) crzmVar.l();
                if (brluVar != null) {
                    boolean z = true;
                    if (brluVar.E() <= 1) {
                        z = false;
                    }
                    brmkVar.h = z;
                    brmkVar.g = false;
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized defpackage.dcep<defpackage.akqi> f() {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.k()     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r8.g()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L29
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch: java.lang.Throwable -> Laf
            dxio<akzh> r1 = r8.l     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> Laf
            akzh r1 = (defpackage.akzh) r1     // Catch: java.lang.Throwable -> Laf
            int r1 = r1.y()     // Catch: java.lang.Throwable -> Laf
            dxio<akzh> r2 = r8.l     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> Laf
            akzh r2 = (defpackage.akzh) r2     // Catch: java.lang.Throwable -> Laf
            int r2 = r2.z()     // Catch: java.lang.Throwable -> Laf
            r3 = 0
            r0.<init>(r3, r3, r1, r2)     // Catch: java.lang.Throwable -> Laf
            goto L2f
        L29:
            gle r0 = r8.k     // Catch: java.lang.Throwable -> Laf
            android.graphics.Rect r0 = r0.e()     // Catch: java.lang.Throwable -> Laf
        L2f:
            akox r1 = r8.a     // Catch: java.lang.Throwable -> Laf
            alrh r1 = r1.ak()     // Catch: java.lang.Throwable -> Laf
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            if (r1 != 0) goto L40
            dcmr<java.lang.Object> r0 = defpackage.dcmr.a     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r8)
            return r0
        L40:
            java.util.HashMap<akqi, brmj> r3 = r8.d     // Catch: java.lang.Throwable -> Laf
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Laf
        L4a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto La9
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Laf
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> Laf
            brmj r5 = (defpackage.brmj) r5     // Catch: java.lang.Throwable -> Laf
            brat r6 = r8.r     // Catch: java.lang.Throwable -> Laf
            btvo r6 = r6.a     // Catch: java.lang.Throwable -> Laf
            dkks r6 = r6.getExploreMapParametersWithoutLogging()     // Catch: java.lang.Throwable -> Laf
            int r6 = r6.m     // Catch: java.lang.Throwable -> Laf
            int r6 = defpackage.dkkb.a(r6)     // Catch: java.lang.Throwable -> Laf
            if (r6 != 0) goto L6d
            goto L70
        L6d:
            r7 = 3
            if (r6 == r7) goto L76
        L70:
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L4a
        L76:
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> Laf
            brmj r5 = (defpackage.brmj) r5     // Catch: java.lang.Throwable -> Laf
            akqq r5 = r5.c()     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> Laf
            brmj r5 = (defpackage.brmj) r5     // Catch: java.lang.Throwable -> Laf
            akqq r5 = r5.c()     // Catch: java.lang.Throwable -> Laf
            defpackage.dbsk.s(r5)     // Catch: java.lang.Throwable -> Laf
            android.graphics.Point r5 = r1.b(r5)     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L4a
            int r6 = r5.x     // Catch: java.lang.Throwable -> Laf
            int r5 = r5.y     // Catch: java.lang.Throwable -> Laf
            boolean r5 = r0.contains(r6, r5)     // Catch: java.lang.Throwable -> Laf
            if (r5 == 0) goto L4a
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> Laf
            akqi r4 = (defpackage.akqi) r4     // Catch: java.lang.Throwable -> Laf
            r2.add(r4)     // Catch: java.lang.Throwable -> Laf
            goto L4a
        La9:
            dcep r0 = defpackage.dcep.K(r2)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r8)
            return r0
        Laf:
            r0 = move-exception
            monitor-exit(r8)
            goto Lb3
        Lb2:
            throw r0
        Lb3:
            goto Lb2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brmk.f():dcep");
    }

    private final boolean g() {
        return this.q.l().L().b();
    }

    private final synchronized dcep<akqi> h() {
        if (!this.i || g()) {
            this.t.clear();
            this.t.addAll(f());
            this.t.size();
            return dcep.K(this.t);
        }
        this.t.size();
        return dcep.K(this.t);
    }

    private final dcdc<akqi> i(Set<akqi> set) {
        return dcbg.b(set).A(new Comparator(this) { // from class: brmh
            private final brmk a;

            {
                this.a = this;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                brmk brmkVar = this.a;
                akqi akqiVar = (akqi) obj;
                akqi akqiVar2 = (akqi) obj2;
                synchronized (brmkVar) {
                    brmj brmjVar = brmkVar.d.get(akqiVar);
                    float f = -1.0f;
                    float floatValue = (brmjVar == null || brmjVar.b() == null) ? -1.0f : brmjVar.b().floatValue();
                    brmj brmjVar2 = brmkVar.d.get(akqiVar2);
                    if (brmjVar2 != null && brmjVar2.b() != null) {
                        f = brmjVar2.b().floatValue();
                    }
                    compare = Float.compare(f, floatValue);
                }
                return compare;
            }
        });
    }

    private final void j(dcdc<akqi> dcdcVar) {
        dcdcVar.size();
        this.p.d(dcdcVar, this.n, this.o, this.r.a.getExploreMapParametersWithoutLogging().J ? true : this.g);
    }

    private final synchronized void k() {
        this.d.clear();
        aktu aktuVar = this.u;
        if (aktuVar == null) {
            return;
        }
        dcpd<dmpn> it = aktuVar.b.iterator();
        while (it.hasNext()) {
            l(it.next());
        }
        dcpd<dmpn> it2 = this.u.c.iterator();
        while (it2.hasNext()) {
            l(it2.next());
        }
        if (g()) {
            dcpd<dmpn> it3 = this.u.d.iterator();
            while (it3.hasNext()) {
                l(it3.next());
            }
        }
        this.d.size();
    }

    private final synchronized void l(dmpn dmpnVar) {
        dmng h = akxf.h(dmpnVar);
        if (h != null) {
            akqi c = akxf.c(dmpnVar);
            akqq akqqVar = null;
            Float valueOf = (h.a & 1) != 0 ? Float.valueOf(h.b) : null;
            if ((h.a & 4) != 0) {
                dgrn dgrnVar = h.d;
                if (dgrnVar == null) {
                    dgrnVar = dgrn.d;
                }
                akqqVar = akqq.m(dgrnVar);
            }
            this.d.put(c, new brmf(h.c, valueOf, akqqVar));
        }
    }

    @Override // defpackage.crzp
    public final void On(crzm<aktu> crzmVar) {
        synchronized (this) {
            aktu l = crzmVar.l();
            if (l != null) {
                l.b.size();
                l.c.size();
                l.d.size();
                this.u = l;
                if (!this.e) {
                    c();
                }
            }
        }
    }

    public final crzm<brmi> b() {
        return this.s.a;
    }

    public final synchronized void c() {
        HashSet hashSet = new HashSet(this.t);
        HashSet hashSet2 = new HashSet(h());
        if (hashSet2.equals(hashSet)) {
            return;
        }
        this.s.b(this.t.isEmpty() ? brmi.NO_LABELS : brmi.HAS_LABELS);
        akqi akqiVar = this.j;
        if (akqiVar != null) {
            hashSet2.add(akqiVar);
        }
        this.m.c(cklt.SEARCH_RESULTS_MAP);
        j(i(hashSet2));
    }

    public final synchronized void d(ilo iloVar) {
        if (!this.t.contains(iloVar.ai())) {
            this.i = false;
            HashSet hashSet = new HashSet(h());
            hashSet.add(iloVar.ai());
            j(i(hashSet));
            this.i = true;
        }
    }

    public final void e() {
        this.f = true;
        this.i = false;
        this.p.b();
    }
}
