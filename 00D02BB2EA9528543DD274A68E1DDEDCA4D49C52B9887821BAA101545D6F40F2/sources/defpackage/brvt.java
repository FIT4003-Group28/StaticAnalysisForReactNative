package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: brvt  reason: default package */
/* loaded from: classes4.dex */
public class brvt implements bruv {
    private static final dcdn<dghs, bsqm> a;
    private static final dcep<dghs> b;
    private static final dcdc<dghs> c;
    private final btvo d;
    private final jba e;
    private final dxio<abfa> f;
    private final bmom g;
    private final ahjq h;
    private final brrv i;
    private final Map<dghs, brva> j;
    @dzsi
    private cjtd k;
    private dcdc<brvb> l;
    private dcdn<dghs, brvb> m;
    private boolean n;
    private boolean o;
    @dzsi
    private bwrs<ilo> p;

    static {
        dcdg p = dcdn.p();
        p.f(dghs.CALL, bsqm.a(dtxy.di));
        p.f(dghs.DIRECTIONS, bsqm.a(dtxy.dj));
        p.f(dghs.START_NAVIGATION, bsqm.a(dtxy.dv));
        p.f(dghs.ADD_STOP, bsqm.b(dtxy.df, dtxy.de));
        p.f(dghs.SAVE, bsqm.a(dtxy.dt));
        p.f(dghs.EXPLORE, bsqm.a(dtxy.dm));
        p.f(dghs.BOOK, bsqm.a(dtxy.dh));
        p.f(dghs.SHARE, bsqm.a(dtxy.du));
        p.f(dghs.ADD_PARKING, bsqm.a(dtxy.hc));
        p.f(dghs.CHECK_IN, bsqm.a(dtyi.au));
        p.f(dghs.ALREADY_HERE, bsqm.a(dtyi.bV));
        p.f(dghs.MESSAGE, bsqm.a(dtxy.dp));
        p.f(dghs.ORDER_FOOD, bsqm.a(dtxy.dq));
        p.f(dghs.APPOINTMENT, bsqm.a(dtxy.dg));
        p.f(dghs.RESTAURANT_RESERVATION, bsqm.a(dtxy.dr));
        p.f(dghs.EDIT, bsqm.a(dtxy.dl));
        p.f(dghs.REVIEWS, bsqm.a(dtxy.ds));
        p.f(dghs.MENU, bsqm.a(dtxy.f19do));
        p.f(dghs.HOME_REVIEW, bsqm.a(dtxy.dn));
        p.f(dghs.DIRECTORY, bsqm.a(dtxy.dk));
        p.f(dghs.TICKETS, bsqm.a(dtxy.dw));
        a = p.b();
        b = dcep.D(dghs.DIRECTIONS, dghs.EXPLORE, dghs.ADD_STOP);
        c = dcdc.g(dghs.DIRECTIONS, dghs.START_NAVIGATION);
    }

    public brvt(btvo btvoVar, ahjq ahjqVar, dxio<abfa> dxioVar, Map<dghs, brva> map, bmom bmomVar, Runnable runnable, jba jbaVar, @dzsi bnhz bnhzVar) {
        this.d = btvoVar;
        this.e = jbaVar;
        this.h = ahjqVar;
        this.f = dxioVar;
        this.g = bmomVar;
        this.j = map;
        brru c2 = brrv.c();
        ((brsa) c2).a = runnable;
        if (bnhzVar != null) {
            c2.c(bnhzVar);
        }
        this.i = c2.a();
        this.l = dcdc.e();
        this.m = dcmn.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dcdc<defpackage.brvb> e() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brvt.e():dcdc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (h(defpackage.dghs.ADD_STOP) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(defpackage.dghs r6, defpackage.dccx<defpackage.brvb> r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r8 == 0) goto Lcb
            boolean r8 = r5.h(r6)
            if (r8 == 0) goto Lcb
            dcdn<dghs, brvb> r8 = r5.m
            java.lang.Object r8 = r8.get(r6)
            brvb r8 = (defpackage.brvb) r8
            if (r8 == 0) goto Lcb
            dghs r2 = defpackage.dghs.UNKNOWN_ACTION_TYPE
            int r2 = r6.ordinal()
            if (r2 == r1) goto L71
            r3 = 14
            if (r2 == r3) goto L5c
            r3 = 3
            if (r2 == r3) goto L55
            r3 = 4
            if (r2 == r3) goto L4e
            r3 = 20
            if (r2 == r3) goto L3f
            r3 = 21
            if (r2 == r3) goto L30
        L2e:
            r2 = 0
            goto L86
        L30:
            btvo r2 = r5.d
            dvne r2 = r2.getPlaceSheetParameters()
            dvmh r2 = r2.D()
            dvmh r3 = defpackage.dvmh.BUTTON_COUNTERFACTUAL
            if (r2 != r3) goto L2e
            goto L85
        L3f:
            btvo r2 = r5.d
            dvne r2 = r2.getPlaceSheetParameters()
            dvmh r2 = r2.C()
            dvmh r3 = defpackage.dvmh.BUTTON_COUNTERFACTUAL
            if (r2 != r3) goto L2e
            goto L85
        L4e:
            boolean r2 = r5.m()
            if (r2 != 0) goto L2e
            goto L85
        L55:
            boolean r2 = r5.n()
            if (r2 != 0) goto L2e
            goto L85
        L5c:
            btvo r2 = r5.d
            dkiy r2 = r2.getEnableFeatureParameters()
            int r3 = r2.c
            r4 = 333(0x14d, float:4.67E-43)
            if (r3 != r4) goto L2e
            java.lang.Object r2 = r2.d
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L86
        L71:
            boolean r2 = r5.n()
            if (r2 != 0) goto L85
            boolean r2 = r5.m()
            if (r2 != 0) goto L85
            dghs r2 = defpackage.dghs.ADD_STOP
            boolean r2 = r5.h(r2)
            if (r2 == 0) goto L2e
        L85:
            r2 = 1
        L86:
            if (r2 != 0) goto L96
            boolean r3 = r5.n
            if (r3 != 0) goto L96
            dcep<dghs> r3 = defpackage.brvt.b
            boolean r3 = r3.contains(r6)
            if (r3 == 0) goto L96
            r3 = 1
            goto L97
        L96:
            r3 = 0
        L97:
            if (r3 == 0) goto L9b
            r5.n = r1
        L9b:
            java.lang.Boolean r4 = r8.p()
            boolean r4 = r4.booleanValue()
            if (r3 != r4) goto Lb1
            if (r9 != 0) goto Lb1
            java.lang.Boolean r4 = r8.m()
            boolean r4 = r4.booleanValue()
            if (r2 == r4) goto Lc7
        Lb1:
            brrs r6 = r5.k(r6)
            r6.d(r3)
            if (r9 != 0) goto Lbc
            if (r2 == 0) goto Lbd
        Lbc:
            r0 = 1
        Lbd:
            r6.e(r0)
            brrx r6 = r6.a()
            r8.j(r6)
        Lc7:
            r7.g(r8)
            return
        Lcb:
            dcdn<dghs, brvb> r7 = r5.m
            java.lang.Object r7 = r7.get(r6)
            brvb r7 = (defpackage.brvb) r7
            if (r7 != 0) goto Le9
            bvon r7 = new bvon
            java.lang.Object[] r8 = new java.lang.Object[r1]
            int r6 = r6.G
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r0] = r6
            java.lang.String r6 = "Factory is not provided for PlaceActionType: %s"
            r7.<init>(r6, r8)
            defpackage.bvoo.j(r7)
        Le9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brvt.f(dghs, dccx, boolean, boolean):void");
    }

    private final void g(dghs dghsVar, dccx<brvb> dccxVar, boolean z) {
        f(dghsVar, dccxVar, z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x01fd, code lost:
        if (((java.lang.Boolean) r10.d).booleanValue() != false) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean h(defpackage.dghs r10) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brvt.h(dghs):boolean");
    }

    private final void i() {
        ilo p = p();
        boolean z = false;
        if (p != null && (p.j() || p.h || p.f)) {
            z = true;
        }
        this.o = z;
    }

    private final dcdn<dghs, brvb> j() {
        dcdg p = dcdn.p();
        dcpd<dghs> it = a.keySet().iterator();
        while (it.hasNext()) {
            dghs next = it.next();
            brva brvaVar = this.j.get(next);
            if (brvaVar != null) {
                p.f(next, brvaVar.a(this.e, k(next).a()));
            } else {
                bvoo.j(new bvon("Factory is not provided for PlaceActionType: %s", next.name()));
            }
        }
        return p.b();
    }

    private final brrs k(dghs dghsVar) {
        brrs j = brrx.j();
        j.b(dghsVar);
        j.c(this.i);
        j.f(brrw.COLLAPSED_PLACESHEET);
        bsqm bsqmVar = a.get(dghsVar);
        if (bsqmVar != null) {
            ilo p = p();
            boolean z = false;
            if (p != null && p.cE()) {
                z = true;
            }
            ((brry) j).a = bsqmVar.c(z);
        }
        return j;
    }

    private final boolean l() {
        ilo p = p();
        brvb brvbVar = this.m.get(dghs.DIRECTIONS);
        if (p == null || brvbVar == null || !brvbVar.d().booleanValue()) {
            return false;
        }
        bmom bmomVar = this.g;
        if (!bmomVar.b.a().a() || bmomVar.d() == null) {
            return false;
        }
        dnem dnemVar = p.bX().p;
        if (dnemVar == null) {
            dnemVar = dnem.h;
        }
        if (!dnemVar.f) {
            return false;
        }
        if (bmom.b(p)) {
            return true;
        }
        dnem dnemVar2 = p.bX().p;
        if (dnemVar2 == null) {
            dnemVar2 = dnem.h;
        }
        return dnemVar2.e;
    }

    private final boolean m() {
        brvb brvbVar = this.m.get(dghs.ALREADY_HERE);
        return brvbVar != null && l() && brvbVar.d().booleanValue();
    }

    private final boolean n() {
        brvb brvbVar = this.m.get(dghs.CHECK_IN);
        return brvbVar != null && l() && brvbVar.d().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean o(defpackage.dghs r6) {
        /*
            r5 = this;
            dghs r0 = defpackage.dghs.EXPLORE
            boolean r0 = r5.h(r0)
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            dxio<abfa> r0 = r5.f
            java.lang.Object r0 = r0.a()
            abfa r0 = (defpackage.abfa) r0
            boolean r0 = r0.k()
            r2 = 0
            if (r0 != 0) goto L3c
            dxio<abfa> r3 = r5.f
            java.lang.Object r3 = r3.a()
            abfa r3 = (defpackage.abfa) r3
            boolean r4 = r3.j()
            if (r4 == 0) goto L3a
            btvo r3 = r3.a
            dkiy r3 = r3.getEnableFeatureParameters()
            int r3 = r3.bf
            int r3 = defpackage.dkiv.a(r3)
            if (r3 != 0) goto L36
            goto L3a
        L36:
            r4 = 4
            if (r3 != r4) goto L3a
            goto L3c
        L3a:
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            int r6 = r6.ordinal()
            if (r6 == r1) goto L51
            r2 = 6
            if (r6 == r2) goto L50
            r2 = 11
            if (r6 == r2) goto L4f
            r2 = 12
            if (r6 == r2) goto L4f
            return r1
        L4f:
            return r0
        L50:
            return r3
        L51:
            if (r0 != 0) goto L54
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brvt.o(dghs):boolean");
    }

    @dzsi
    private final ilo p() {
        bwrs<ilo> bwrsVar = this.p;
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    @Override // defpackage.bruv
    public List<brvb> a() {
        boolean z = this.o;
        i();
        if (z != this.o || this.m.isEmpty()) {
            this.l = e();
        }
        return this.l;
    }

    @Override // defpackage.bruv
    public cjtd b() {
        cjta c2 = cjtd.c(this.k);
        c2.d = dtxy.dd;
        return c2.a();
    }

    @Override // defpackage.bruv
    public Boolean c(ckgz ckgzVar) {
        return Boolean.valueOf(this.g.a(ckgzVar, p()));
    }

    public void d(bwrs<ilo> bwrsVar) {
        this.p = bwrsVar;
        if (this.m.isEmpty()) {
            this.m = j();
        }
        dcpd<brvb> it = this.m.values().iterator();
        while (it.hasNext()) {
            it.next().i(bwrsVar);
        }
        this.l = e();
        ilo c2 = bwrsVar.c();
        this.k = c2 != null ? c2.bZ() : null;
    }
}
