package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bebl  reason: default package */
/* loaded from: classes3.dex */
public class bebl implements izw, bega, begs {
    public static final dcqe a = dcqe.c("bebl");
    @dzsi
    private cjtd A;
    @dzsi
    private cjtd B;
    @dzsi
    private cjtd C;
    @dzsi
    private cjtd D;
    @dzsi
    private cjtd E;
    @dzsi
    private cjtd F;
    @dzsi
    private cjtd G;
    @dzsi
    private cjtd H;
    @dzsi
    private cjtd I;
    private final becc J;
    private final bdzw K;
    @dzsi
    private final axyp L;
    private final bmza M;
    private boolean N;
    @dzsi
    private axyo O;
    public final gga b;
    public final btrm c;
    public final eeu d;
    public final bvrb e;
    public final dxio<qbt> f;
    public final dxio<aesb> g;
    public final dxio<axwy> h;
    public final dxio<apyz> i;
    public final dxio<afha> j;
    public final axwg k;
    public final bhtr l;
    public final bmdq m;
    public final bmds n;
    public final btvo o;
    public final bmdw p;
    public final dxio<bhjg> q;
    @dzsi
    public bniu s;
    @dzsi
    public amvh t;
    public int u;
    private final bwft v;
    private boolean w;
    @dzsi
    private cjtd x;
    @dzsi
    private cjtd y;
    @dzsi
    private cjtd z;
    public bwrs<ilo> r = bwrs.a(null);
    private final bebk P = new bebk(this);

    public bebl(gga ggaVar, becc beccVar, bhtr bhtrVar, beca becaVar, bmdq bmdqVar, btrm btrmVar, bvrb bvrbVar, eeu eeuVar, btvo btvoVar, dxio<qbt> dxioVar, dxio<aesb> dxioVar2, dxio<axwy> dxioVar3, bwft bwftVar, axyp axypVar, bfea bfeaVar, bmdw bmdwVar, dxio<apyz> dxioVar4, dxio<bhjg> dxioVar5, dxio<afha> dxioVar6, bmza bmzaVar, axwg axwgVar) {
        this.J = beccVar;
        this.l = bhtrVar;
        ddho ddhoVar = dtxy.jg;
        dxio a2 = ((dxjh) becaVar.a).a();
        beca.a(a2, 1);
        dxio a3 = ((dxjh) becaVar.b).a();
        beca.a(a3, 2);
        becb a4 = becaVar.c.a();
        beca.a(a4, 3);
        bebr a5 = becaVar.d.a();
        beca.a(a5, 4);
        btvo a6 = becaVar.e.a();
        beca.a(a6, 5);
        beam a7 = becaVar.f.a();
        beca.a(a7, 6);
        bebo a8 = becaVar.g.a();
        beca.a(a8, 7);
        bkgz a9 = becaVar.h.a();
        beca.a(a9, 8);
        bkgy a10 = becaVar.i.a();
        beca.a(a10, 9);
        beca.a(ddhoVar, 10);
        this.K = new bebz(a2, a3, a4, a5, a6, a7, a8, a9, a10, ddhoVar);
        this.m = bmdqVar;
        bmdr i = bmds.i();
        i.f(true);
        i.h(true);
        i.g(btvoVar.getUgcParameters().w());
        i.d(true);
        i.b(true);
        i.c(true);
        this.n = i.a();
        this.u = 3;
        this.b = ggaVar;
        this.c = btrmVar;
        this.e = bvrbVar;
        this.d = eeuVar;
        this.o = btvoVar;
        this.f = dxioVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.v = bwftVar;
        this.L = axypVar;
        this.s = null;
        this.p = bmdwVar;
        this.i = dxioVar4;
        this.q = dxioVar5;
        this.j = dxioVar6;
        this.M = bmzaVar;
        this.k = axwgVar;
    }

    @dzsi
    static cqtd a(@dzsi cqtd cqtdVar) {
        if (cqtdVar == null) {
            return null;
        }
        return new bebi(new Object[]{cqtdVar}, cqtdVar);
    }

    @dzsi
    static cqtd d(@dzsi cqtd cqtdVar, cqss cqssVar) {
        if (cqtdVar == null) {
            return null;
        }
        return new bebj(new Object[]{cqtdVar, cqssVar}, cqssVar, cqtdVar);
    }

    private final boolean r() {
        ilo c = this.r.c();
        return f() && c != null && !dbsj.d(c.P()) && !c.an();
    }

    private final boolean s() {
        ilo c = this.r.c();
        return c != null && c.bi();
    }

    private static ddjj v(ilo iloVar) {
        ddji bZ = ddjj.c.bZ();
        String bK = iloVar.bK();
        if (bK != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ.b;
            bK.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = bK;
        }
        return bZ.bK();
    }

    @Override // defpackage.izw
    @dzsi
    public cjtd b() {
        return this.x;
    }

    @Override // defpackage.izw
    public List<izx> c() {
        Boolean bool;
        Boolean valueOf;
        cqtd a2;
        cqvf l;
        cqtd a3;
        cqsn l2;
        cqsn l3;
        boolean z;
        bniu bniuVar;
        ilo c;
        bniu bniuVar2;
        ArrayList f = dchl.f(4);
        ilo c2 = this.r.c();
        boolean z2 = true;
        Boolean bool2 = false;
        if (c2 != null && !c2.bd() && !e() && (bniuVar = this.s) != null) {
            cqsn q = bniuVar.q();
            cqtd p = this.s.p();
            bebh bebhVar = p == null ? null : new bebh(new Object[]{p}, p);
            cqss x = ibm.x();
            ivc ivcVar = new ivc(this) { // from class: beaw
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bniu bniuVar3 = this.a.s;
                    if (bniuVar3 != null) {
                        bniuVar3.d(cjqmVar);
                    }
                }
            };
            ivc ivcVar2 = new ivc(this) { // from class: beay
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    bniu bniuVar3 = beblVar.s;
                    if (bniuVar3 == null || !bniuVar3.k().booleanValue()) {
                        return;
                    }
                    beblVar.s.j(cjqmVar);
                }
            };
            if (this.E == null && (c = this.r.c()) != null && (bniuVar2 = this.s) != null && bniuVar2.m() != null) {
                cjta c3 = cjtd.c(this.s.m());
                c3.k(v(c));
                this.E = c3.a();
            }
            f.add(new ivd(bebhVar, q, x, ivcVar, ivcVar2, this.E));
        }
        if (e()) {
            f.add(new ivd(a(cqrt.i(cqrt.f(2131232494), ibm.x())), cqrt.l(R.string.ADD_STOP), ibm.x(), new ivc(this) { // from class: beaz
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    ilo c4 = beblVar.r.c();
                    if (c4 == null || !c4.j) {
                        return;
                    }
                    beblVar.f.a().Q(c4);
                }
            }, this.I));
        }
        ilo c4 = this.r.c();
        if (c4 == null || c4.be() == iln.STATION) {
            bool = bool2;
        } else {
            if (!r()) {
                ilo c5 = this.r.c();
                if (!f() || c5 == null || dbsj.d(c5.K()) || c5.an()) {
                    ilo c6 = this.r.c();
                    if (!f() || c6 == null || c6.an() || dbsj.d(c6.S())) {
                        z = false;
                        bool = Boolean.valueOf(z);
                    }
                }
            }
            z = true;
            bool = Boolean.valueOf(z);
        }
        if (bool.booleanValue()) {
            f.add(new ivd(a(cqrt.g(2131231713, ibm.x())), cqrt.l(R.string.CALL), ibm.x(), new ivc(this) { // from class: beba
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    ilo c7 = beblVar.r.c();
                    if (c7 == null) {
                        return;
                    }
                    bmdq bmdqVar = beblVar.m;
                    bwrs<ilo> bwrsVar = beblVar.r;
                    bmdr h = beblVar.n.h();
                    h.e(cjqmVar);
                    bmdqVar.a(bwrsVar, h.a());
                    beblVar.c.b(new beud(c7.ai()));
                }
            }, this.y));
        }
        ilo c7 = this.r.c();
        if (c7 == null) {
            valueOf = bool2;
        } else {
            valueOf = Boolean.valueOf(c7.bM() && this.u != 3);
        }
        if (valueOf.booleanValue()) {
            axyo axyoVar = this.O;
            if (axyoVar != null) {
                if (axyoVar.a()) {
                    a3 = d(this.O.b(), this.O.h());
                } else {
                    a3 = a(cqrt.i(this.O.b(), ibm.x()));
                }
            } else if (i().booleanValue()) {
                a3 = d(cqrt.g(2131231730, irg.A()), irg.A());
            } else {
                a3 = a(cqrt.g(2131231730, ibm.x()));
            }
            cqtd cqtdVar = a3;
            axyo axyoVar2 = this.O;
            if (axyoVar2 != null) {
                l2 = axyoVar2.e();
            } else {
                l2 = i().booleanValue() ? cqrt.l(R.string.SAVED) : cqrt.l(R.string.SAVE);
            }
            cqsn cqsnVar = l2;
            cqss x2 = ibm.x();
            ivc ivcVar3 = new ivc(this) { // from class: bebb
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    if (!beblVar.d.b() || beblVar.h().booleanValue()) {
                        return;
                    }
                    beblVar.h.a().i(beblVar.r, beblVar.k.f());
                }
            };
            Boolean h = h();
            cjtd cjtdVar = this.z;
            axyo axyoVar3 = this.O;
            if (axyoVar3 != null) {
                l3 = axyoVar3.f();
            } else {
                l3 = i().booleanValue() ? cqrt.l(R.string.SAVED) : cqrt.l(R.string.SAVE);
            }
            f.add(new ivd(cqtdVar, cqsnVar, x2, ivcVar3, h, bool2, cjtdVar, l3));
        }
        if ((this.r.c() != null && !this.i.a().o() && this.p.c()) || this.i.a().p(this.r.c())) {
            cqtd a4 = a(cqrt.g(2131232347, ibm.x()));
            if (this.o.getBusinessMessagingParameters().k) {
                l = cqrt.l(R.string.LOCAL_CLICK_TO_CHAT_ACTION_CONTACT);
            } else {
                l = cqrt.l(R.string.LOCAL_CLICK_TO_CHAT_ACTION_MESSAGE);
            }
            f.add(new ivd(a4, l, ibm.x(), new ivc(this) { // from class: bebc
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    ilo c8 = beblVar.r.c();
                    if (c8 != null) {
                        if (beblVar.i.a().o()) {
                            beblVar.i.a().m(c8, apzb.PLACEPAGE);
                        } else {
                            beblVar.p.d();
                        }
                        if (!beblVar.o.getBusinessMessagingParameters().g) {
                            return;
                        }
                        beblVar.q.a().a(c8);
                    }
                }
            }, this.H));
        }
        ilo c8 = this.r.c();
        if ((s() || (c8 != null && c8.be() == iln.GEOCODE && bmza.b(c8))) && f.size() < 4) {
            if (s()) {
                a2 = d(cqrt.g(2131231285, irg.A()), irg.A());
            } else {
                a2 = a(cqrt.g(2131231285, ibm.x()));
            }
            f.add(new ivd(a2, cqrt.l(s() ? R.string.LABELED : R.string.GENERIC_LABEL), ibm.x(), this.M.c(false, null), s() ? this.F : this.G));
        }
        if (f.size() < 4) {
            f.add(new ivd(a(cqrt.g(2131231745, ibm.x())), cqrt.l(R.string.SHARE_PLACE_LABEL), ibm.x(), new ivc(this) { // from class: bebd
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    this.a.j();
                }
            }, this.A));
        }
        ilo c9 = this.r.c();
        if (c9 != null && c9.be() != iln.STATION) {
            dnpq ag = c9.ag();
            bool2 = Boolean.valueOf(ag != null && !dbsj.d(ag.c));
        }
        if (bool2.booleanValue() && f.size() < 4) {
            f.add(new ivd(a(cqrt.g(2131231775, ibm.x())), cqrt.l(R.string.PLACE_WEBSITE), ibm.x(), new ivc(this) { // from class: bebe
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    dnpq ah;
                    bebl beblVar = this.a;
                    ilo c10 = beblVar.r.c();
                    if (c10 == null || !beblVar.d.b() || (ah = c10.ah()) == null) {
                        return;
                    }
                    String str = ah.c;
                    beblVar.g.a().D((ilo) bwrs.b(beblVar.r), 8, dtxy.mU);
                    beblVar.j.a().k(beblVar.b, str, 1);
                }
            }, this.B));
        }
        ilo c10 = this.r.c();
        if (c10 == null || c10.be() != iln.STATION) {
            z2 = false;
        }
        if (Boolean.valueOf(z2).booleanValue() && f.size() < 4) {
            f.add(new ivd(a(cqrt.g(2131231764, ibm.x())), cqrt.l(R.string.DEPART), ibm.x(), new ivc(this) { // from class: bebf
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    bebl beblVar = this.a;
                    ilo c11 = beblVar.r.c();
                    if (c11 == null || beblVar.t == null) {
                        return;
                    }
                    if (c11.be() == iln.STATION) {
                        qcw x3 = qcx.x();
                        x3.s(dqvj.TRANSIT);
                        x3.r(beblVar.t);
                        beblVar.f.a().m(x3.a());
                        return;
                    }
                    bvoo.h("Depart button should not be clicked except from station place page.", new Object[0]);
                }
            }, this.C));
        }
        if (this.l.a().booleanValue() && f.size() < 4) {
            f.add(new ivd(a(cqrt.g(2131231610, ibm.x())), cqrt.l(R.string.OFFLINE_MAPS_ACTION_CARD_DOWNLOAD), ibm.x(), new ivc(this) { // from class: bebg
                private final bebl a;

                {
                    this.a = this;
                }

                @Override // defpackage.ivc
                public final void a(cjqm cjqmVar) {
                    this.a.l.b();
                }
            }, this.D));
        }
        return f;
    }

    final boolean e() {
        ilo c = this.r.c();
        return c != null && c.j;
    }

    public boolean f() {
        return this.w;
    }

    public final void g() {
        cqkx.p(this);
        becc beccVar = this.J;
        if (beccVar != null && beccVar.a().booleanValue()) {
            cqkx.p(this.J);
        }
        if (!this.K.a().isEmpty()) {
            cqkx.p(this.K);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean h() {
        return Boolean.valueOf(this.u == 4);
    }

    final Boolean i() {
        boolean z = true;
        if (this.u != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public cqkl j() {
        k(this.r);
        return cqkl.a;
    }

    public cqkl k(bwrs<ilo> bwrsVar) {
        if (!this.d.b()) {
            return cqkl.a;
        }
        this.g.a().D((ilo) bwrs.b(bwrsVar), 8, dtxy.mq);
        this.v.a(bwrsVar, dtxy.mq);
        return cqkl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        ilo c = this.r.c();
        if (c == null || !c.f) {
            this.u = 3;
            return;
        }
        axyp axypVar = this.L;
        if (axypVar == null) {
            return;
        }
        axyo a2 = axypVar.a(c);
        this.O = a2;
        int i = 1;
        if (true != a2.a()) {
            i = 2;
        }
        this.u = i;
    }

    @Override // defpackage.begs
    public void m(btrm btrmVar) {
        if (!this.N) {
            bebk bebkVar = this.P;
            dceq a2 = dcet.a();
            a2.b(azrg.class, new bebm(0, azrg.class, bebkVar, bvrj.UI_THREAD));
            a2.b(azrf.class, new bebm(1, azrf.class, bebkVar, bvrj.UI_THREAD));
            btrmVar.g(bebkVar, a2.a());
            this.N = true;
        }
    }

    @Override // defpackage.begs
    public void n(btrm btrmVar) {
        if (this.N) {
            btrmVar.a(this.P);
            this.N = false;
        }
    }

    public bdzx o() {
        return this.J;
    }

    public bdzw p() {
        return this.K;
    }

    public void q(@dzsi bniu bniuVar) {
        this.s = bniuVar;
        this.E = null;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.r = bwrsVar;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            bvoo.h("Placemark cannot be null.", new Object[0]);
            return;
        }
        this.w = this.m.c();
        l();
        cjtd bZ = iloVar.bZ();
        ddjj v = v(iloVar);
        cjta c = cjtd.c(bZ);
        c.d = dtxy.gV;
        this.x = c.a();
        cjta c2 = cjtd.c(bZ);
        c2.d = r() ? dtxy.gZ : dtxy.hB;
        c2.k(v);
        cjtd a2 = c2.a();
        this.y = a2;
        this.y = this.m.d(a2, iloVar, this.n);
        cjta c3 = cjtd.c(bZ);
        axyo axyoVar = this.O;
        c3.d = (axyoVar == null || !axyoVar.a()) ? dtxy.ma : dtxy.mf;
        c3.k(v);
        this.z = c3.a();
        cjta c4 = cjtd.c(bZ);
        c4.d = dtxy.mU;
        c4.k(v);
        c4.g(iloVar.ag().b);
        this.B = c4.a();
        cjta c5 = cjtd.c(bZ);
        c5.d = dtxy.mq;
        c5.k(v);
        this.A = c5.a();
        cjta c6 = cjtd.c(bZ);
        c6.d = dtxy.ic;
        c6.k(v);
        this.C = c6.a();
        cjta c7 = cjtd.c(bZ);
        c7.d = dtxy.ig;
        c7.k(v);
        this.D = c7.a();
        cjta c8 = cjtd.c(bZ);
        c8.d = dtxy.ji;
        this.F = c8.a();
        cjta c9 = cjtd.c(bZ);
        c9.d = dtxy.jh;
        this.G = c9.a();
        this.E = null;
        this.p.a(this.r.c());
        this.H = this.p.e(dtxy.gW);
        cjta c10 = cjtd.c(bZ);
        c10.d = iloVar.cE() ? dtxy.lX : dtxy.lY;
        c10.k(v);
        this.I = c10.a();
        this.t = iloVar.d();
        this.J.f(bwrsVar);
        this.l.t(bwrsVar);
        this.K.b(bwrsVar);
        this.M.s = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.x = cjtd.b;
        this.y = cjtd.b;
        this.z = cjtd.b;
        this.B = cjtd.b;
        this.A = cjtd.b;
        this.C = cjtd.b;
        this.D = cjtd.b;
        this.F = cjtd.b;
        this.G = cjtd.b;
        this.E = cjtd.b;
        this.H = cjtd.b;
        this.I = cjtd.b;
        this.l.u();
        this.M.a();
        this.p.f();
        this.t = null;
        this.r = bwrs.a(null);
        this.O = null;
        this.u = 3;
        this.w = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return true;
    }
}
