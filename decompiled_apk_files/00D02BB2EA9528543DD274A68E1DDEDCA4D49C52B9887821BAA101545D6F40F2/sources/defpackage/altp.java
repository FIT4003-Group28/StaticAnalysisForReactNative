package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: altp  reason: default package */
/* loaded from: classes.dex */
public final class altp implements alsq {
    public final altc a;
    public btrm c;
    public alsz d;
    @dzsi
    public altg e;
    public boolean f;
    private boolean g;
    @dzsi
    private bnsn h;
    private alst i;
    @dzsi
    private akpq j;
    @dzsi
    private alto k;
    @dzsi
    private alqh n;
    public final anaj<akqh> b = new anaj<>();
    private dcep<altv> l = dcmr.a;
    private final Set<alsp> m = new HashSet();

    public altp(altc altcVar) {
        this.a = altcVar;
    }

    @Override // defpackage.alsq
    public final synchronized void a(alsp alspVar) {
        this.m.add(alspVar);
    }

    @Override // defpackage.alsq
    public final synchronized void b(alsp alspVar) {
        this.m.remove(alspVar);
    }

    @Override // defpackage.alsq
    public final synchronized void c(akqh akqhVar) {
        alsz alszVar;
        if (j() && (alszVar = this.d) != null) {
            alszVar.c.a(akqhVar, new alti(this) { // from class: altk
                private final altp a;

                {
                    this.a = this;
                }

                @Override // defpackage.alti
                public final void a(Object obj) {
                    alsz alszVar2;
                    final altp altpVar = this.a;
                    final altu altuVar = (altu) obj;
                    synchronized (altpVar) {
                        alszVar2 = altpVar.d;
                    }
                    if (alszVar2 == null) {
                        return;
                    }
                    final long a = altpVar.b.a();
                    dcdc<akqh> dcdcVar = altuVar.b;
                    int size = dcdcVar.size();
                    for (int i = 0; i < size; i++) {
                        alszVar2.a(dcdcVar.get(i), new alsw(altpVar, altuVar, a) { // from class: altn
                            private final altp a;
                            private final altu b;
                            private final long c;

                            {
                                this.a = altpVar;
                                this.b = altuVar;
                                this.c = a;
                            }

                            @Override // defpackage.alti
                            public final void a(alts altsVar) {
                                this.a.p(this.b, altsVar, this.c);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // defpackage.alsq
    public final void d(akqh akqhVar) {
        if (!j()) {
            return;
        }
        final long a = this.b.a();
        synchronized (this) {
            alsz alszVar = this.d;
            if (alszVar == null) {
                return;
            }
            alszVar.a(akqhVar, new alsw(this, a) { // from class: altl
                private final altp a;
                private final long b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // defpackage.alti
                public final void a(alts altsVar) {
                    this.a.p(null, altsVar, this.b);
                }
            });
        }
    }

    @Override // defpackage.alsq
    public final void e(Set<altv> set) {
        if (!j() || set.equals(this.l)) {
            return;
        }
        this.l = dcep.K(set);
    }

    @Override // defpackage.alsq
    public final boolean f(akqh akqhVar) {
        boolean b;
        if (!j()) {
            return false;
        }
        synchronized (this) {
            b = this.a.b(akqhVar);
        }
        return b;
    }

    @Override // defpackage.alsq
    @dzsi
    public final alts g() {
        alts altsVar;
        synchronized (this) {
            altsVar = this.a.a;
        }
        return altsVar;
    }

    @Override // defpackage.alsq
    @dzsi
    public final altu h(@dzsi alts altsVar) {
        altu a;
        synchronized (this) {
            a = this.a.a(altsVar);
        }
        return a;
    }

    @Override // defpackage.alsq
    public final Set<altv> i() {
        return this.l;
    }

    @Override // defpackage.alsq
    public final synchronized boolean j() {
        return this.g;
    }

    public final synchronized void k(btrm btrmVar, alsz alszVar, alst alstVar) {
        this.c = btrmVar;
        this.d = alszVar;
        this.i = alstVar;
    }

    public final synchronized void l() {
        akpq akpqVar;
        amyn.b.a();
        if (!this.g) {
            return;
        }
        alst alstVar = this.i;
        if (alstVar != null) {
            alstVar.b(dcmr.a, null);
            this.i.b = null;
        }
        alto altoVar = this.k;
        if (altoVar != null && (akpqVar = this.j) != null) {
            akpqVar.c(altoVar);
        }
        this.k = null;
        alsz alszVar = this.d;
        if (alszVar != null) {
            alszVar.a.e();
            alszVar.b.a.e();
            alszVar.c.a.e();
        }
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void m(akzh akzhVar) {
        if (j()) {
            if ((akzhVar.a & 4) != 0) {
                return;
            }
            alst alstVar = this.i;
            if (alstVar != null && this.e != null) {
                synchronized (alstVar) {
                    if (!alstVar.d) {
                        return;
                    }
                    alstVar.f = akzhVar.f();
                    if (akzhVar.p().k >= 14.0f) {
                        ArrayList a = dchl.a();
                        alyh.k(akzhVar.r().c, 14, a, null);
                        alstVar.b(a, akzhVar);
                        bnrs bnrsVar = alstVar.f;
                        final alsz alszVar = alstVar.a;
                        Collection<alyh> c = alstVar.c();
                        alss alssVar = new alss(alstVar, bnrsVar, akzhVar);
                        HashSet<alyh> c2 = dcnm.c();
                        for (alyh alyhVar : c) {
                            c2.add(alyhVar.j(14));
                        }
                        for (final alyh alyhVar2 : c2) {
                            boolean z = false;
                            if (alyhVar2.a >= 14) {
                                synchronized (alszVar) {
                                    List<alsx> list = alszVar.f.get(alyhVar2);
                                    if (list == null) {
                                        list = new ArrayList<>();
                                        alszVar.f.put(alyhVar2, list);
                                        z = true;
                                    }
                                    list.add(alssVar);
                                }
                                if (z) {
                                    alszVar.e.execute(new Runnable(alszVar, alyhVar2) { // from class: alsu
                                        private final alsz a;
                                        private final alyh b;

                                        {
                                            this.a = alszVar;
                                            this.b = alyhVar2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            List<alsx> remove;
                                            alsz alszVar2 = this.a;
                                            alyh alyhVar3 = this.b;
                                            Collection<altt> a2 = alszVar2.a.a(alyhVar3);
                                            if (a2 != null) {
                                                synchronized (alszVar2) {
                                                    remove = alszVar2.f.remove(alyhVar3);
                                                }
                                                if (remove != null) {
                                                    for (alsx alsxVar : remove) {
                                                        alsxVar.a(alyhVar3, 0, a2);
                                                    }
                                                }
                                                alszVar2.b(a2);
                                                return;
                                            }
                                            amco c3 = alszVar2.d.c(akry.BASE);
                                            boolean z2 = (c3 instanceof amaw) && ((amaw) c3).x();
                                            alta altaVar = new alta(new alsv(alszVar2, z2));
                                            if (z2) {
                                                c3.a(alyhVar3, altaVar);
                                            } else {
                                                c3.d(alyhVar3, altaVar, false);
                                            }
                                        }
                                    });
                                }
                            } else {
                                alssVar.a(alyhVar2, 0, dcdc.e());
                                return;
                            }
                        }
                    } else {
                        alstVar.b(dcmr.a, null);
                    }
                }
            }
        }
    }

    public final void n(amwd amwdVar) {
        if (!j()) {
            return;
        }
        this.f = amwdVar != amwd.OFF;
    }

    public final synchronized dcep<alsp> o() {
        return dcep.K(this.m);
    }

    public final synchronized void p(@dzsi altu altuVar, alts altsVar, long j) {
        anaj<akqh> anajVar = this.b;
        akqh akqhVar = altsVar.a;
        synchronized (anajVar.a) {
            if (anajVar.a.containsKey(akqhVar) && anajVar.a.get(akqhVar).longValue() > j) {
                return;
            }
            anajVar.a.put(akqhVar, Long.valueOf(j));
            final altu q = q(altuVar, altsVar);
            if (q != null) {
                synchronized (this) {
                    alsz alszVar = this.d;
                    if (alszVar != null) {
                        dcdc<akqh> dcdcVar = q.b;
                        int size = dcdcVar.size();
                        for (int i = 0; i < size; i++) {
                            akqh akqhVar2 = dcdcVar.get(i);
                            if (!akqhVar2.equals(altsVar.a)) {
                                alszVar.a(akqhVar2, new alsw(this, q) { // from class: altm
                                    private final altp a;
                                    private final altu b;

                                    {
                                        this.a = this;
                                        this.b = q;
                                    }

                                    @Override // defpackage.alti
                                    public final void a(alts altsVar2) {
                                        altu a;
                                        altp altpVar = this.a;
                                        altu altuVar2 = this.b;
                                        alts altsVar3 = altsVar2;
                                        synchronized (altpVar) {
                                            a = altpVar.a.a(altsVar3);
                                        }
                                        if (a == null || !a.b().equals(altuVar2.b())) {
                                            return;
                                        }
                                        altpVar.q(null, altsVar3);
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
    }

    @dzsi
    public final altu q(@dzsi altu altuVar, alts altsVar) {
        synchronized (this) {
            altu a = this.a.a(altsVar);
            int a2 = altuVar == null ? -1 : altsVar.a(altuVar.b());
            altc altcVar = this.a;
            akqh akqhVar = altsVar.a;
            altb n = altcVar.b.n(akqhVar);
            if (n == null || n.a != a2) {
                altcVar.b.Pz(akqhVar, new altb(a2));
                boolean equals = altsVar.equals(this.a.a);
                dcpd<alsp> it = o().iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
                synchronized (this) {
                    altg altgVar = this.e;
                    if (altgVar != null) {
                        altgVar.a(this.a);
                    }
                }
                alqh alqhVar = this.n;
                if (alqhVar != null) {
                    alqhVar.a.e();
                }
                if (equals) {
                    r(altuVar);
                }
                return a;
            }
            return null;
        }
    }

    public final synchronized void s(altg altgVar, bnsn bnsnVar, akpq akpqVar, akzh akzhVar, alqh alqhVar, @dzsi amwd amwdVar) {
        amyn.b.a();
        if (this.g) {
            return;
        }
        this.e = altgVar;
        this.j = akpqVar;
        this.n = alqhVar;
        this.h = bnsnVar;
        alst alstVar = this.i;
        if (alstVar != null) {
            alstVar.b = this;
        }
        if (this.k == null) {
            alto altoVar = new alto(this, akzhVar, akpqVar);
            this.k = altoVar;
            altoVar.a.a(altoVar);
            altoVar.a.b(altoVar);
        }
        this.g = true;
        m(this.k.b.b());
        if (amwdVar != null) {
            n(amwdVar);
        }
        dcpd<alsp> it = o().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r9 >= r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
        if (r7 >= r9) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(@defpackage.dzsi defpackage.altu r13) {
        /*
            r12 = this;
            bnsn r0 = r12.h
            if (r0 == 0) goto L5f
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 0
            if (r13 == 0) goto L37
            altv r13 = r13.d
            int r13 = r13.b
            if (r13 >= 0) goto L37
            bvnx r13 = r0.q
            long r5 = r13.a()
            bnso r13 = r0.p
            long r7 = r13.a
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 < 0) goto L28
            long r9 = r13.b
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 < 0) goto L28
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 >= 0) goto L33
        L28:
            long r7 = r7 - r5
            long r3 = java.lang.Math.max(r7, r3)
            long r5 = r5 - r3
            r13.a = r5
            long r5 = r5 + r1
            r13.b = r5
        L33:
            r0.q()
            return
        L37:
            bvnx r13 = r0.q
            long r5 = r13.a()
            bnso r13 = r0.p
            long r7 = r13.a
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 < 0) goto L4f
            long r9 = r13.b
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 < 0) goto L4f
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L5c
        L4f:
            long r7 = r13.b
            long r7 = r7 - r5
            long r3 = java.lang.Math.max(r7, r3)
            long r5 = r5 - r3
            r13.b = r5
            long r5 = r5 + r1
            r13.a = r5
        L5c:
            r0.q()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.altp.r(altu):void");
    }
}
