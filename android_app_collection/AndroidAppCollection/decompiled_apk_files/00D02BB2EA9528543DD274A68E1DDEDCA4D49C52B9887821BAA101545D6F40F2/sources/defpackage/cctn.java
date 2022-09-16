package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cctn  reason: default package */
/* loaded from: classes4.dex */
public final class cctn implements ccst {
    public final bunc a;
    public final anhk b;
    private final bvdp c;
    private final bvdw d;
    private final bvdy e;
    private final bvdr f;

    public cctn(bvdp bvdpVar, bvdw bvdwVar, bvdy bvdyVar, bunc buncVar, bvdr bvdrVar, anhk anhkVar) {
        this.c = bvdpVar;
        this.d = bvdwVar;
        this.e = bvdyVar;
        this.a = buncVar;
        this.f = bvdrVar;
        this.b = anhkVar;
    }

    public static djox f(ccln cclnVar, String str, int i, @dzsi drar drarVar) {
        dwfl dwflVar;
        djow bZ = djox.h.bZ();
        String str2 = cclnVar.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djox djoxVar = (djox) bZ.b;
        str2.getClass();
        djoxVar.a |= 1;
        djoxVar.b = str2;
        dgfb b = dgfb.b(cclnVar.e);
        if (b == null) {
            b = dgfb.UNKNOWN_OFFERING_TYPE;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djox djoxVar2 = (djox) bZ.b;
        djoxVar2.c = b.f;
        int i2 = djoxVar2.a | 2;
        djoxVar2.a = i2;
        str.getClass();
        int i3 = i2 | 4;
        djoxVar2.a = i3;
        djoxVar2.d = str;
        djoxVar2.f = i - 1;
        djoxVar2.a = i3 | 16;
        dras bZ2 = drat.d.bZ();
        if (!cclnVar.f.isEmpty()) {
            String str3 = cclnVar.f;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drat dratVar = (drat) bZ2.b;
            str3.getClass();
            dratVar.a |= 1;
            dratVar.c = str3;
        }
        if (cclnVar.i.size() > 0) {
            dwflVar = cclnVar.i.get(0);
        } else {
            dwflVar = dwfl.w;
        }
        if ((dwflVar.a & 32768) != 0) {
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            dggg dgggVar = dizhVar.b;
            if (dgggVar == null) {
                dgggVar = dggg.d;
            }
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drat dratVar2 = (drat) bZ2.b;
            dgggVar.getClass();
            dsrj<dggg> dsrjVar = dratVar2.b;
            if (!dsrjVar.a()) {
                dratVar2.b = dsqw.cl(dsrjVar);
            }
            dratVar2.b.add(dgggVar);
        }
        drat bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djox djoxVar3 = (djox) bZ.b;
        bK.getClass();
        djoxVar3.e = bK;
        djoxVar3.a |= 8;
        if (drarVar != null) {
            djox djoxVar4 = (djox) bZ.b;
            drarVar.getClass();
            dsrj<drar> dsrjVar2 = djoxVar4.g;
            if (!dsrjVar2.a()) {
                djoxVar4.g = dsqw.cl(dsrjVar2);
            }
            djoxVar4.g.add(drarVar);
        }
        return bZ.bK();
    }

    @Override // defpackage.ccst
    public final dehn<djoz> a(ccln cclnVar, String str, @dzsi String str2, @dzsi dgfg dgfgVar) {
        draq bZ = drar.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drar drarVar = (drar) bZ.b;
        drarVar.b = 1;
        drarVar.a = 1 | drarVar.a;
        drao bZ2 = drap.c.bZ();
        String str3 = cclnVar.f;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drap drapVar = (drap) bZ2.b;
        str3.getClass();
        drapVar.a = 2;
        drapVar.b = str3;
        drap bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drar drarVar2 = (drar) bZ.b;
        bK.getClass();
        drarVar2.c = bK;
        drarVar2.a |= 2;
        if (!dbsj.d(str2)) {
            drao bZ3 = drap.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            drap drapVar2 = (drap) bZ3.b;
            str2.getClass();
            drapVar2.a = 2;
            drapVar2.b = str2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drar drarVar3 = (drar) bZ.b;
            drap bK2 = bZ3.bK();
            bK2.getClass();
            drarVar3.d = bK2;
            drarVar3.a |= 4;
        }
        if (dgfgVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drar drarVar4 = (drar) bZ.b;
            dgfgVar.getClass();
            drarVar4.e = dgfgVar;
            drarVar4.a |= 8;
        }
        return e(f(cclnVar, str, 5, bZ.bK()));
    }

    @Override // defpackage.ccst
    public final dehn<dhuq> b(List<dwfa> list) {
        dhuj bZ = dhum.d.bZ();
        dcbg s = dcbg.b(list).s(cctl.a);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhum dhumVar = (dhum) bZ.b;
        dsrj<dhul> dsrjVar = dhumVar.b;
        if (!dsrjVar.a()) {
            dhumVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(s, dhumVar.b);
        dnwb a = this.b.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhum dhumVar2 = (dhum) bZ.b;
        a.getClass();
        dhumVar2.c = a;
        dhumVar2.a |= 2;
        dhum bK = bZ.bK();
        cctm cctmVar = cctf.a;
        dbsk.a(bK.b.size() > 0);
        for (dhul dhulVar : bK.b) {
            dbsk.a(1 == (dhulVar.a & 1));
        }
        final deig d = deig.d();
        this.f.b(bK, new ccts(new bvqg(this, d) { // from class: ccsz
            private final cctn a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cctn cctnVar = this.a;
                deig deigVar = this.b;
                dhuq dhuqVar = (dhuq) obj;
                anhk anhkVar = cctnVar.b;
                dnwb dnwbVar = dhuqVar.b;
                if (dnwbVar == null) {
                    dnwbVar = dnwb.i;
                }
                anhkVar.c(dnwbVar);
                deigVar.j(dhuqVar);
            }
        }, new bvqg(d) { // from class: ccta
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.k(new ccss((btzy) obj));
            }
        }), dege.a);
        return deew.h(d, cctmVar, dege.a);
    }

    @Override // defpackage.ccst
    public final dehn<dhrc> c(ccwk ccwkVar, int i, final List<drax> list) {
        drac bZ = drad.l.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drad dradVar = (drad) bZ.b;
        int i2 = i - 1;
        if (i != 0) {
            dradVar.d = i2;
            dradVar.a |= 4;
            dgfb b = dgfb.b(ccwkVar.b);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drad dradVar2 = (drad) bZ.b;
            dradVar2.c = b.f;
            int i3 = dradVar2.a | 2;
            dradVar2.a = i3;
            String str = ccwkVar.f;
            str.getClass();
            dradVar2.a = i3 | 1;
            dradVar2.b = str;
            int a = drab.a(ccwkVar.k);
            if (a == 0) {
                a = 1;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drad dradVar3 = (drad) bZ.b;
            dradVar3.j = a - 1;
            dradVar3.a |= 128;
            if ((ccwkVar.a & 256) != 0) {
                dgfg dgfgVar = ccwkVar.l;
                if (dgfgVar == null) {
                    dgfgVar = dgfg.d;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drad dradVar4 = (drad) bZ.b;
                dgfgVar.getClass();
                dradVar4.k = dgfgVar;
                dradVar4.a |= 256;
            }
            if (!ccwkVar.j.isEmpty()) {
                String str2 = ccwkVar.j;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drad dradVar5 = (drad) bZ.b;
                str2.getClass();
                dradVar5.a |= 64;
                dradVar5.i = str2;
            }
            if (!ccwkVar.g.isEmpty()) {
                String str3 = ccwkVar.g;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drad dradVar6 = (drad) bZ.b;
                str3.getClass();
                dradVar6.a |= 32;
                dradVar6.f = str3;
            }
            int a2 = draz.a(ccwkVar.h);
            if (a2 != 0 && a2 != 1) {
                int a3 = draz.a(ccwkVar.h);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                drad dradVar7 = (drad) bZ.b;
                dradVar7.e = a3 - 1;
                dradVar7.a |= 16;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drad dradVar8 = (drad) bZ.b;
            dsrj<drax> dsrjVar = dradVar8.h;
            if (!dsrjVar.a()) {
                dradVar8.h = dsqw.cl(dsrjVar);
            }
            dsod.bv(list, dradVar8.h);
            dcbg s = dcbg.b(list).s(cctk.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            drad dradVar9 = (drad) bZ.b;
            dsrj<dggg> dsrjVar2 = dradVar9.g;
            if (!dsrjVar2.a()) {
                dradVar9.g = dsqw.cl(dsrjVar2);
            }
            dsod.bv(s, dradVar9.g);
            dhqx bZ2 = dhra.f.bZ();
            ccxa ccxaVar = ccwkVar.c;
            if (ccxaVar == null) {
                ccxaVar = ccxa.f;
            }
            String str4 = ccxaVar.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhra dhraVar = (dhra) bZ2.b;
            str4.getClass();
            dhraVar.a |= 2;
            dhraVar.c = str4;
            dhqy bZ3 = dhqz.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhqz dhqzVar = (dhqz) bZ3.b;
            drad bK = bZ.bK();
            bK.getClass();
            dhqzVar.b = bK;
            dhqzVar.a |= 1;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhra dhraVar2 = (dhra) bZ2.b;
            dhqz bK2 = bZ3.bK();
            bK2.getClass();
            dsrj<dhqz> dsrjVar3 = dhraVar2.d;
            if (!dsrjVar3.a()) {
                dhraVar2.d = dsqw.cl(dsrjVar3);
            }
            dhraVar2.d.add(bK2);
            dnwb a4 = this.b.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhra dhraVar3 = (dhra) bZ2.b;
            a4.getClass();
            dhraVar3.e = a4;
            dhraVar3.a |= 16;
            ccxa ccxaVar2 = ccwkVar.c;
            if (ccxaVar2 == null) {
                ccxaVar2 = ccxa.f;
            }
            if (!ccxaVar2.d.isEmpty()) {
                ccxa ccxaVar3 = ccwkVar.c;
                if (ccxaVar3 == null) {
                    ccxaVar3 = ccxa.f;
                }
                String str5 = ccxaVar3.d;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhra dhraVar4 = (dhra) bZ2.b;
                str5.getClass();
                dhraVar4.a |= 1;
                dhraVar4.b = str5;
            }
            final dhra bK3 = bZ2.bK();
            cctm cctmVar = new cctm(bK3) { // from class: ccsu
                private final dhra a;

                {
                    this.a = bK3;
                }

                /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
                @Override // defpackage.dbrn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r6) {
                    /*
                        r5 = this;
                        dhra r0 = r5.a
                        dhrc r6 = (defpackage.dhrc) r6
                        if (r6 == 0) goto L56
                        dsrj<draf> r1 = r6.a
                        int r1 = r1.size()
                        if (r1 == 0) goto L56
                        dsrj<draf> r1 = r6.a
                        java.util.Iterator r1 = r1.iterator()
                    L14:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L34
                        java.lang.Object r2 = r1.next()
                        draf r2 = (defpackage.draf) r2
                        int r3 = r2.b
                        int r3 = defpackage.drbb.a(r3)
                        if (r3 == 0) goto L2c
                        r4 = 2
                        if (r3 != r4) goto L2c
                        goto L14
                    L2c:
                        int r6 = r2.b
                        ccsr r6 = new ccsr
                        r6.<init>()
                        throw r6
                    L34:
                        dsrj<dhqz> r1 = r0.d
                        r2 = 0
                        java.lang.Object r1 = r1.get(r2)
                        dhqz r1 = (defpackage.dhqz) r1
                        drad r1 = r1.b
                        if (r1 != 0) goto L43
                        drad r1 = defpackage.drad.l
                    L43:
                        java.lang.String r1 = r1.b
                        dsrj<dhqz> r0 = r0.d
                        java.lang.Object r0 = r0.get(r2)
                        dhqz r0 = (defpackage.dhqz) r0
                        drad r0 = r0.b
                        if (r0 != 0) goto L53
                        drad r0 = defpackage.drad.l
                    L53:
                        dsrj<dggg> r0 = r0.g
                        return r6
                    L56:
                        ccsr r6 = new ccsr
                        r6.<init>()
                        goto L5d
                    L5c:
                        throw r6
                    L5d:
                        goto L5c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ccsu.a(java.lang.Object):java.lang.Object");
                }
            };
            dbsk.a(!bK3.c.isEmpty());
            dbsk.a(bK3.d.size() > 0);
            for (dhqz dhqzVar2 : bK3.d) {
                drad dradVar10 = dhqzVar2.b;
                if (dradVar10 == null) {
                    dradVar10 = drad.l;
                }
                int a5 = dgfe.a(dradVar10.d);
                dbsk.a((a5 == 0 || a5 == 1) ? false : true);
                dgfb b2 = dgfb.b(dradVar10.c);
                if (b2 == null) {
                    b2 = dgfb.UNKNOWN_OFFERING_TYPE;
                }
                dbsk.a(b2 != dgfb.UNKNOWN_OFFERING_TYPE);
                dbsk.a(!dradVar10.b.isEmpty());
                for (dggg dgggVar : dradVar10.g) {
                    dbsk.a(!dgggVar.c.isEmpty());
                }
                int i4 = dradVar10.a;
                dbsk.a((i4 & 1) == 0 || (i4 & 256) != 0);
                int a6 = dgfe.a(dradVar10.d);
                if (a6 == 0) {
                    a6 = 1;
                }
                int i5 = a6 - 1;
                if (i5 == 1) {
                    dbsk.a(dradVar10.g.size() == 1);
                } else if (i5 == 7) {
                    dbsk.a(dradVar10.g.size() > 0);
                }
            }
            final deig d = deig.d();
            bvdp bvdpVar = this.c;
            d.getClass();
            bvdpVar.b(bK3, new ccts(new bvqg(d) { // from class: ccsv
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.j((dhrc) obj);
                }
            }, new bvqg(d) { // from class: ccsw
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.k(new ccss((btzy) obj));
                }
            }), dege.a);
            dehn<dhrc> h = deew.h(d, cctmVar, dege.a);
            deha.q(h, bvqj.b(new bvqg(this, list) { // from class: cctd
                private final cctn a;
                private final List b;

                {
                    this.a = this;
                    this.b = list;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    final cctn cctnVar = this.a;
                    List list2 = this.b;
                    dhrc dhrcVar = (dhrc) obj;
                    dwcn bZ4 = dwco.f.bZ();
                    dqju bZ5 = dqjw.i.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dqjw dqjwVar = (dqjw) bZ5.b;
                    dqjwVar.b = 1;
                    dqjwVar.a = 1 | dqjwVar.a;
                    bZ5.a(dcbg.b(list2).s(ccth.a));
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dwco dwcoVar = (dwco) bZ4.b;
                    dqjw bK4 = bZ5.bK();
                    bK4.getClass();
                    dwcoVar.e = bK4;
                    dwcoVar.a |= 16;
                    String str6 = cctnVar.b.a().d;
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dwco dwcoVar2 = (dwco) bZ4.b;
                    str6.getClass();
                    dwcoVar2.a |= 4;
                    dwcoVar2.d = str6;
                    final dwco bK5 = bZ4.bK();
                    cctnVar.a.b(bK5, new ccts(new bvqg(cctnVar) { // from class: ccti
                        private final cctn a;

                        {
                            this.a = cctnVar;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            this.a.b.f(((dwcq) obj2).b);
                        }
                    }, new bvqg(bK5) { // from class: cctj
                        private final dwco a;

                        {
                            this.a = bK5;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            btzy btzyVar = (btzy) obj2;
                            dqjw dqjwVar2 = this.a.e;
                            if (dqjwVar2 == null) {
                                dqjwVar2 = dqjw.i;
                            }
                            dsrj<String> dsrjVar4 = dqjwVar2.e;
                        }
                    }), dege.a);
                }
            }), dege.a);
            return h;
        }
        throw null;
    }

    @Override // defpackage.ccst
    public final dehn<djsz> d(String str, ilo iloVar, int i) {
        String o = iloVar.ai().o();
        djss bZ = djsv.d.bZ();
        djst bZ2 = djsu.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djsu djsuVar = (djsu) bZ2.b;
        str.getClass();
        int i2 = djsuVar.a | 2;
        djsuVar.a = i2;
        djsuVar.c = str;
        o.getClass();
        int i3 = i2 | 1;
        djsuVar.a = i3;
        djsuVar.b = o;
        djsuVar.d = i - 1;
        djsuVar.a = i3 | 4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djsv djsvVar = (djsv) bZ.b;
        djsu bK = bZ2.bK();
        bK.getClass();
        dsrj<djsu> dsrjVar = djsvVar.b;
        if (!dsrjVar.a()) {
            djsvVar.b = dsqw.cl(dsrjVar);
        }
        djsvVar.b.add(bK);
        dnwb a = this.b.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djsv djsvVar2 = (djsv) bZ.b;
        a.getClass();
        djsvVar2.c = a;
        djsvVar2.a |= 2;
        djsv bK2 = bZ.bK();
        cctm cctmVar = ccte.a;
        for (djsu djsuVar2 : bK2.b) {
            dbsk.a(!djsuVar2.b.isEmpty());
            dbsk.a(!djsuVar2.c.isEmpty());
            dbsk.a((djsuVar2.a & 4) != 0);
        }
        final deig d = deig.d();
        this.e.b(bK2, new ccts(new bvqg(this, d) { // from class: ccsx
            private final cctn a;
            private final deig b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                cctn cctnVar = this.a;
                deig deigVar = this.b;
                djsz djszVar = (djsz) obj;
                anhk anhkVar = cctnVar.b;
                dnwb dnwbVar = djszVar.b;
                if (dnwbVar == null) {
                    dnwbVar = dnwb.i;
                }
                anhkVar.c(dnwbVar);
                deigVar.j(djszVar);
            }
        }, new bvqg(d) { // from class: ccsy
            private final deig a;

            {
                this.a = d;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                this.a.k(new ccss((btzy) obj));
            }
        }), dege.a);
        return deew.h(d, cctmVar, dege.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dehn<djoz> e(djox djoxVar) {
        dehn dehnVar;
        int a;
        cctm cctmVar = cctg.a;
        if (!djoxVar.b.isEmpty()) {
            dbsk.a(!djoxVar.b.isEmpty());
            dbsk.a(!djoxVar.d.isEmpty());
            dbsk.a(((djoxVar.a & 16) == 0 || (a = drav.a(djoxVar.f)) == 0 || a == 1) ? false : true);
            int a2 = drav.a(djoxVar.f);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 4 || i == 5) {
                dbsk.a(djoxVar.g.size() > 0);
                for (drar drarVar : djoxVar.g) {
                    dbsk.a(1 == (drarVar.a & 1));
                    int a3 = dran.a(drarVar.b);
                    if (a3 != 0 && a3 == 2) {
                        int i2 = drarVar.a;
                        dbsk.a((i2 & 4) == 0 || (i2 & 8) != 0);
                    }
                }
            }
            final deig d = deig.d();
            bvdw bvdwVar = this.d;
            d.getClass();
            bvdwVar.b(djoxVar, new ccts(new bvqg(d) { // from class: cctb
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.j((djoz) obj);
                }
            }, new bvqg(d) { // from class: cctc
                private final deig a;

                {
                    this.a = d;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    this.a.k(new ccss((btzy) obj));
                }
            }), dege.a);
            dehnVar = d;
        } else {
            dehnVar = deha.b(new ccss(bttq.MALFORMED_MESSAGE));
        }
        return deew.h(dehnVar, cctmVar, dege.a);
    }
}
