package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: yib  reason: default package */
/* loaded from: classes7.dex */
public class yib implements yhr, izy {
    @dzsi
    private jam A;
    public final Activity b;
    public final ivf c;
    public final yuu d;
    public final yuw e;
    @dzsi
    public yth f;
    @dzsi
    public final qde h;
    @dzsi
    public akqs k;
    private final btrm o;
    private final dxio<ahjq> p;
    private final ytc q;
    private final ywn r;
    private final acwt s;
    private final befw t;
    private final qbt u;
    private final jam w;
    private final jam x;
    @dzsi
    private GmmLocation z;
    private static final eaow l = eaow.d(6);
    public static final int a = cqir.a();
    private static final eaow m = eaow.c(1);
    private static final eaow n = eaow.d(15);
    private final jad v = new yia(this);
    @dzsi
    public ywh g = null;
    public boolean i = false;
    @dzsi
    public akqi j = null;
    private boolean y = true;

    public yib(final Activity activity, ivg ivgVar, cqhn cqhnVar, btrm btrmVar, dxio<ahjq> dxioVar, ytc ytcVar, ywn ywnVar, yuu yuuVar, yuw yuwVar, befw befwVar, final qbt qbtVar, acwt acwtVar, qde qdeVar) {
        this.b = activity;
        this.o = btrmVar;
        this.p = dxioVar;
        ivf a2 = ivgVar.a(this);
        a2.e();
        this.c = a2;
        this.q = ytcVar;
        this.r = ywnVar;
        this.d = yuuVar;
        this.e = yuwVar;
        this.s = acwtVar;
        this.t = befwVar;
        this.u = qbtVar;
        this.h = qdeVar;
        ytcVar.h = 10;
        this.w = ywz.a(activity.getString(R.string.TRANSIT_LINE_SPACE_NO_DEPARTURES_ERROR_MESSAGE), null, cjtd.a(dtyc.dF), iup.f(R.raw.no_upcoming_departures_error, ywz.a, ywz.a), activity.getString(R.string.TRANSIT_STATION_NO_UPCOMING_DEPARTURES_DIRECTIONS_BUTTON), cqrt.i(iup.e(R.raw.ic_mod_directions), ibm.x()), new Runnable(activity, qbtVar) { // from class: yhs
            private final Activity a;
            private final qbt b;

            {
                this.a = activity;
                this.b = qbtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Activity activity2 = this.a;
                qbt qbtVar2 = this.b;
                qcw x = qcx.x();
                x.r(amvh.i(activity2));
                qbtVar2.m(x.a());
            }
        }, cjtd.a(dtyc.dG));
        this.x = ywz.a(activity.getString(R.string.TRANSIT_SEEKER_NO_CONNECTION_ERROR_MESSAGE), activity.getString(R.string.TRANSIT_SEEKER_NO_CONNECTION_ERROR_SUBTITLE_MESSAGE), cjtd.a(dtyc.dD), iup.f(R.raw.no_connection_error, ywz.a, ywz.a), activity.getString(R.string.TRANSIT_SEEKER_NO_CONNECTION_TRY_AGAIN_BUTTON), null, new Runnable(this) { // from class: yht
            private final yib a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.u();
            }
        }, cjtd.a(dtyc.dE));
    }

    private final void v(akqs akqsVar, boolean z) {
        if (this.h == null) {
            return;
        }
        this.q.a();
        ytc ytcVar = this.q;
        akqq c = akqsVar.c();
        akqi a2 = this.h.a();
        ytcVar.g = new cryz<>(new yhz(this, z, akqsVar));
        int i = ytcVar.h;
        dcmr<Object> dcmrVar = dcmr.a;
        qdz f = qea.f();
        f.c(djqr.DEFAULT_RANKING_STRATEGY);
        dvyz bZ = dvzd.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar = (dvzd) bZ.b;
        dvzdVar.a |= 2;
        dvzdVar.c = true;
        dvzd dvzdVar2 = (dvzd) bZ.b;
        dvzdVar2.b = 4;
        dvzdVar2.a |= 1;
        dvzd dvzdVar3 = (dvzd) bZ.b;
        dvzdVar3.i = 1;
        dvzdVar3.a |= 64;
        dopp bZ2 = dops.g.bZ();
        bZ2.a(dooj.METRO);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dops dopsVar = (dops) bZ2.b;
        dopsVar.a |= 2;
        dopsVar.c = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar4 = (dvzd) bZ.b;
        dops bK = bZ2.bK();
        bK.getClass();
        dvzdVar4.j = bK;
        dvzdVar4.a |= 128;
        dvza bZ3 = dvzb.c.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dvzb dvzbVar = (dvzb) bZ3.b;
        dvzbVar.a |= 1;
        dvzbVar.b = true;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar5 = (dvzd) bZ.b;
        dvzb bK2 = bZ3.bK();
        bK2.getClass();
        dvzdVar5.e = bK2;
        dvzdVar5.a |= 8;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar6 = (dvzd) bZ.b;
        dvzdVar6.a |= 4;
        dvzdVar6.d = i;
        f.d(bZ.bK());
        qbd qbdVar = (qbd) f;
        qbdVar.a = c;
        djqs bZ4 = djqt.c.bZ();
        dpsn i2 = a2.i();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djqt djqtVar = (djqt) bZ4.b;
        i2.getClass();
        dsrj<dpsn> dsrjVar = djqtVar.a;
        if (!dsrjVar.a()) {
            djqtVar.a = dsqw.cl(dsrjVar);
        }
        djqtVar.a.add(i2);
        dccx F = dcdc.F();
        dcpd<Object> it = dcmrVar.iterator();
        while (it.hasNext()) {
            dqvh dqvhVar = (dqvh) it.next();
            djqu bZ5 = djqv.c.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            djqv djqvVar = (djqv) bZ5.b;
            djqvVar.b = dqvhVar.h;
            djqvVar.a |= 1;
            F.g(bZ5.bK());
        }
        dcdc f2 = F.f();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djqt djqtVar2 = (djqt) bZ4.b;
        dsrj<djqv> dsrjVar2 = djqtVar2.b;
        if (!dsrjVar2.a()) {
            djqtVar2.b = dsqw.cl(dsrjVar2);
        }
        dsod.bv(f2, djqtVar2.b);
        qbdVar.b = dbsg.i(bZ4.bK());
        f.b(2.00375E7d);
        f.c(djqr.CLOSEST);
        qea a3 = f.a();
        deig d = deig.d();
        ytcVar.b.a(a3, new ysv(ytcVar, d, a3));
        cryz<List<ysz>> cryzVar = ytcVar.g;
        dbsk.s(cryzVar);
        deha.q(d, cryzVar, ytcVar.e);
    }

    private final void w(GmmLocation gmmLocation, boolean z) {
        ywh ywhVar = this.g;
        if (ywhVar != null) {
            ywhVar.R(gmmLocation.B());
            if (!z) {
                return;
            }
            cqkx.p(this.g);
        }
    }

    @Override // defpackage.yhr
    public Boolean a() {
        return Boolean.valueOf(this.y);
    }

    @Override // defpackage.izy
    public cqkl b() {
        akqs akqsVar = this.k;
        if (akqsVar != null) {
            v(akqsVar, true);
        }
        return cqkl.a;
    }

    @Override // defpackage.izy
    public void c() {
        this.c.a();
    }

    @Override // defpackage.izy
    public void d() {
        this.c.c();
    }

    @Override // defpackage.izy
    public long e() {
        yvx C;
        ywh ywhVar = this.g;
        if (ywhVar != null && (C = ywhVar.C()) != null) {
            for (yvs yvsVar : C.f()) {
                yvt b = yvsVar.b();
                if (b == null || b.k() == null) {
                    List<yvt> c = yvsVar.c();
                    if (c.isEmpty() || c.get(0).k() == null) {
                    }
                }
                return n.b;
            }
        }
        return m.b;
    }

    @Override // defpackage.yhr
    @dzsi
    public yvq f() {
        return this.g;
    }

    @Override // defpackage.yhr
    @dzsi
    public jam g() {
        jam jamVar = null;
        if (!a().booleanValue()) {
            if (this.i) {
                jamVar = this.x;
            } else if (this.g == null) {
                jamVar = this.w;
            }
        }
        this.A = jamVar;
        return jamVar;
    }

    @Override // defpackage.yhr
    @dzsi
    public String h() {
        qde qdeVar = this.h;
        if (qdeVar != null) {
            return qdeVar.b();
        }
        return null;
    }

    public void i() {
        yuu yuuVar = this.d;
        yuuVar.b.aj().aF().d().i(yuuVar.i);
        yuuVar.b.C(true);
        yuuVar.l = true;
        yuuVar.j.m(6);
        btrm btrmVar = this.o;
        dceq a2 = dcet.a();
        a2.b(amqo.class, new yid(amqo.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.z = this.p.a().a();
        this.d.b();
        c();
        if (this.k != null) {
            this.s.b();
            akqs akqsVar = this.k;
            dbsk.s(akqsVar);
            v(akqsVar, true);
            return;
        }
        u();
        qde qdeVar = this.h;
        if (qdeVar == null || qdeVar.c() == null) {
            return;
        }
        ily ilyVar = new ily();
        ilyVar.j(this.h.a());
        String b = this.h.b();
        if (b != null) {
            ilyVar.F(b);
        }
        befw befwVar = this.t;
        befu p = befv.p();
        p.j(bwrs.a(ilyVar.d()));
        ((befp) p).a = this.h.c();
        p.k(false);
        p.g(true);
        befwVar.d(p.m());
    }

    public void j() {
        this.o.a(this);
        s();
        d();
        yuu yuuVar = this.d;
        yuuVar.h.incrementAndGet();
        yuuVar.d();
        yuuVar.c.e();
        yuuVar.d.e();
        yuuVar.e.d();
        yuuVar.a.f();
        yuuVar.f.h();
        yuuVar.b.aj().aF().d().j(yuuVar.i);
        yuuVar.b.C(false);
        if (yuuVar.j.i()) {
            yuuVar.j.j();
        }
        this.j = null;
    }

    public void k(akqs akqsVar, @dzsi akqi akqiVar) {
        this.k = akqsVar;
        this.j = akqiVar;
    }

    @dzsi
    public akqs l() {
        return this.k;
    }

    @dzsi
    public akqi m() {
        ywh ywhVar = this.g;
        if (ywhVar == null) {
            return this.j;
        }
        dpsn dpsnVar = ywhVar.c().c;
        if (dpsnVar == null) {
            dpsnVar = dpsn.d;
        }
        return akqi.j(dpsnVar);
    }

    public void n(amqo amqoVar) {
        GmmLocation a2 = amqoVar.a();
        if (a2 != null) {
            GmmLocation gmmLocation = this.z;
            float distanceTo = gmmLocation == null ? Float.MAX_VALUE : a2.distanceTo(gmmLocation);
            GmmLocation gmmLocation2 = this.z;
            long j = gmmLocation2 == null ? Long.MAX_VALUE : a2.k - gmmLocation2.k;
            if (distanceTo <= 40.0f || j <= l.b) {
                return;
            }
            w(a2, true);
            this.z = a2;
        }
    }

    public final void o(List<ysz> list, @dzsi akqi akqiVar, boolean z) {
        yvu yvuVar;
        ysz yszVar;
        ywn ywnVar = this.r;
        dcdc z2 = dcbg.b(list).o(new dbsl(this) { // from class: yhu
            private final yib a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                qde qdeVar = this.a.h;
                dbsk.s(qdeVar);
                return qdeVar.a().equals(((ysz) obj).e());
            }
        }).z();
        Runnable runnable = yhv.a;
        Runnable runnable2 = yhw.a;
        mw mwVar = yhx.a;
        qde qdeVar = this.h;
        dbsk.s(qdeVar);
        String b = qdeVar.b();
        yvu yvuVar2 = new yvu(dtyc.dz, dtyc.dA, dtyc.dB, dtyc.dC, dtyc.dJ);
        dccx F = dcdc.F();
        Iterator it = z2.iterator();
        while (it.hasNext()) {
            ysz yszVar2 = (ysz) it.next();
            dpce dpceVar = (dpce) dcft.r(alcf.o(yszVar2.d()), null);
            if (dpceVar != null) {
                doul doulVar = dpceVar.c;
                if (doulVar == null) {
                    doulVar = doul.f;
                }
                if (true == doulVar.b.equals(b)) {
                    b = null;
                }
                dccx F2 = dcdc.F();
                dcdc<ytb> i = yszVar2.i();
                int size = i.size();
                Iterator it2 = it;
                int i2 = 0;
                while (i2 < size) {
                    ytb ytbVar = i.get(i2);
                    dcdc<ytb> dcdcVar = i;
                    dbsk.m(yvuVar2.c() <= 3, "Number of departures must not exceed max departures.");
                    boolean z3 = ytbVar.e().size() > yvuVar2.c();
                    dccx F3 = dcdc.F();
                    int i3 = size;
                    F3.i(ytbVar.d());
                    F3.i(yszVar2.c());
                    dcdc f = F3.f();
                    akqi e = yszVar2.e();
                    dccx dccxVar = F;
                    dpsn dpsnVar = ytbVar.g().c;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    akqi j = akqi.j(dpsnVar);
                    dcdc<dbsi<String, List<ysx>>> e2 = ytbVar.e();
                    dccx F4 = dcdc.F();
                    String str = b;
                    Iterator it3 = dcft.v(dcdc.w(new ywm(), e2), 3).iterator();
                    while (it3.hasNext()) {
                        dbsi dbsiVar = (dbsi) it3.next();
                        Iterator it4 = it3;
                        String str2 = (String) dbsiVar.a;
                        Runnable runnable3 = runnable2;
                        ywu ywuVar = ywnVar.e;
                        Runnable runnable4 = runnable;
                        dcdc z4 = dcbg.b((Iterable) dbsiVar.b).s(ywj.a).z();
                        dcdc f2 = dcdc.f(cjtd.a(yvuVar2.e()));
                        mw mwVar2 = mwVar;
                        dccx F5 = dcdc.F();
                        int i4 = i2;
                        Iterator it5 = dcft.v(z4, 2).iterator();
                        int i5 = 0;
                        while (it5.hasNext()) {
                            Iterator it6 = it5;
                            dood doodVar = (dood) it5.next();
                            dccx dccxVar2 = F2;
                            boolean z5 = z3;
                            Iterable<dpce> p = alcf.p((doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).l);
                            dcdc dcdcVar2 = f;
                            if (((doodVar.b == 2 ? (doof) doodVar.c : doof.e).a & 4) != 0) {
                                Activity activity = ywuVar.a;
                                ywx ywxVar = ywuVar.b;
                                yvuVar = yvuVar2;
                                dpce dpceVar2 = (dpce) dcft.r(p, null);
                                cjtd a2 = ywu.a(f2, i5);
                                String h = xkg.h(activity, doodVar.f);
                                dpjb dpjbVar = dpjb.e;
                                String str3 = doodVar.e;
                                dgas dgasVar = (doodVar.b == 2 ? (doof) doodVar.c : doof.e).d;
                                if (dgasVar == null) {
                                    dgasVar = dgas.e;
                                }
                                yszVar = yszVar2;
                                F5.g(ywxVar.a(null, null, null, h, null, dpjbVar, str3, eaow.d(dgasVar.b), null, alca.v((doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).j), e, dpceVar, dpceVar2, j, a2));
                            } else {
                                yvuVar = yvuVar2;
                                yszVar = yszVar2;
                                if (((doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).a & 2) != 0) {
                                    dpce dpceVar3 = (dpce) dcft.r(p, null);
                                    cjtd a3 = ywu.a(f2, i5);
                                    ywx ywxVar2 = ywuVar.b;
                                    dgaw dgawVar = (doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).c;
                                    if (dgawVar == null) {
                                        dgawVar = dgaw.g;
                                    }
                                    eaol a4 = vxs.a(dgawVar);
                                    dgaw dgawVar2 = (doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).d;
                                    if (dgawVar2 == null) {
                                        dgawVar2 = dgaw.g;
                                    }
                                    eaol a5 = vxs.a(dgawVar2);
                                    donz i6 = xkg.i(doodVar.b == 1 ? (dooa) doodVar.c : dooa.m);
                                    String h2 = xkg.h(ywuVar.a, (doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).i);
                                    CharSequence k = xkg.k(ywuVar.a, doodVar.b == 1 ? (dooa) doodVar.c : dooa.m);
                                    dpjb dpjbVar2 = (doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).k;
                                    if (dpjbVar2 == null) {
                                        dpjbVar2 = dpjb.e;
                                    }
                                    F5.g(ywxVar2.a(a4, a5, i6, h2, k, dpjbVar2, doodVar.e, null, xke.a(doodVar.b == 1 ? (dooa) doodVar.c : dooa.m), alca.v((doodVar.b == 1 ? (dooa) doodVar.c : dooa.m).j), e, dpceVar, dpceVar3, j, a3));
                                }
                            }
                            i5++;
                            yszVar2 = yszVar;
                            it5 = it6;
                            F2 = dccxVar2;
                            z3 = z5;
                            f = dcdcVar2;
                            yvuVar2 = yvuVar;
                        }
                        boolean z6 = z3;
                        dcdc f3 = F5.f();
                        ywt.a(str2, 1);
                        ywt.a(f3, 2);
                        F4.g(new yws(str2, f3));
                        it3 = it4;
                        runnable2 = runnable3;
                        runnable = runnable4;
                        mwVar = mwVar2;
                        i2 = i4;
                        z3 = z6;
                        yvuVar2 = yvuVar2;
                    }
                    boolean z7 = z3;
                    Runnable runnable5 = runnable;
                    Runnable runnable6 = runnable2;
                    mw mwVar3 = mwVar;
                    int i7 = i2;
                    dccx dccxVar3 = F2;
                    yvu yvuVar3 = yvuVar2;
                    ysz yszVar3 = yszVar2;
                    dcdc f4 = F4.f();
                    yvy yvyVar = ywnVar.b;
                    akqi f5 = ytbVar.f();
                    drij g = ytbVar.g();
                    int h3 = yszVar3.h();
                    dcdc<dpce> d = yszVar3.d();
                    dcdc<dpce> h4 = ytbVar.h();
                    ddho f6 = yvuVar3.f();
                    ddho h5 = yvuVar3.h();
                    xix a6 = ywnVar.d.a(GmmNotice.g(f), null, cjtd.a(yvuVar3.g()));
                    doza b2 = ytbVar.b();
                    String c = ytbVar.c();
                    Activity activity2 = (Activity) ((dxjd) yvyVar.a).a;
                    yvy.a(activity2, 1);
                    qbt a7 = yvyVar.b.a();
                    yvy.a(a7, 2);
                    bvsl a8 = yvyVar.c.a();
                    yvy.a(a8, 3);
                    yvy.a(f5, 4);
                    yvy.a(g, 5);
                    yvy.a(f4, 6);
                    yvy.a(d, 9);
                    yvy.a(h4, 10);
                    yvy.a(f6, 11);
                    yvy.a(h5, 12);
                    dccxVar3.g(new yvx(activity2, a7, a8, f5, g, f4, z7, h3, d, h4, f6, h5, a6, b2, c));
                    i2 = i7 + 1;
                    F2 = dccxVar3;
                    yszVar2 = yszVar3;
                    i = dcdcVar;
                    size = i3;
                    F = dccxVar;
                    b = str;
                    runnable2 = runnable6;
                    runnable = runnable5;
                    mwVar = mwVar3;
                    yvuVar2 = yvuVar3;
                }
                Runnable runnable7 = runnable;
                Runnable runnable8 = runnable2;
                String str4 = b;
                dccx dccxVar4 = F;
                yvu yvuVar4 = yvuVar2;
                ysz yszVar4 = yszVar2;
                ywi ywiVar = ywnVar.a;
                doza b3 = yszVar4.b();
                yszVar4.j();
                dgsn f7 = yszVar4.f();
                zsf zsfVar = new zsf(ywnVar.c, yszVar4.d(), null, yszVar4.g(), null, yszVar4.e(), null, cjtd.b);
                dcdc f8 = F2.f();
                gga a9 = ywiVar.a.a();
                ywi.a(a9, 1);
                cqat a10 = ywiVar.b.a();
                ywi.a(a10, 2);
                ywi.a(ywiVar.c.a(), 3);
                vtn a11 = ywiVar.d.a();
                ywi.a(a11, 4);
                xcj a12 = ywiVar.e.a();
                ywi.a(a12, 5);
                ywi.a(((dxjh) ywiVar.f).a(), 6);
                ywi.a(((dxjh) ywiVar.g).a(), 7);
                ywi.a(ywiVar.h.a(), 8);
                yuu a13 = ywiVar.i.a();
                ywi.a(a13, 9);
                yuw a14 = ywiVar.j.a();
                ywi.a(a14, 10);
                ytc a15 = ywiVar.k.a();
                ywi.a(a15, 11);
                ywi.a(ywiVar.l.a(), 12);
                ywi.a(ywiVar.m.a(), 13);
                ywi.a(ywiVar.n.a(), 14);
                mwVar = mwVar;
                ywi.a(mwVar, 15);
                ywi.a(f7, 18);
                ywi.a(zsfVar, 19);
                ywi.a(runnable7, 20);
                ywi.a(runnable8, 21);
                ywi.a(f8, 22);
                ywi.a(yvuVar4, 24);
                dccxVar4.g(new ywh(a9, a10, a11, a12, a13, a14, a15, b3, f7, zsfVar, f8, str4, yvuVar4));
                F = dccxVar4;
                yvuVar2 = yvuVar4;
                runnable = runnable7;
                ywnVar = ywnVar;
                it = it2;
                b = str4;
                runnable2 = runnable8;
            }
        }
        final ywh ywhVar = (ywh) dcft.d(F.f(), null);
        if (ywhVar == null) {
            cqkx.p(this);
            return;
        }
        this.g = ywhVar;
        GmmLocation gmmLocation = this.z;
        if (gmmLocation != null) {
            w(gmmLocation, false);
        }
        ywhVar.Y(new acnw(this, ywhVar) { // from class: yhy
            private final yib a;
            private final ywh b;

            {
                this.a = this;
                this.b = ywhVar;
            }

            @Override // defpackage.acnw
            public final void a(int i8, int i9, boolean z8, boolean z9) {
                yib yibVar = this.a;
                ywh ywhVar2 = this.b;
                if (!z9 || i8 != i9) {
                    ywhVar2.V();
                    cqkx.p(ywhVar2);
                    yibVar.d.b();
                    yibVar.e.a(ywhVar2);
                }
            }
        });
        if (akqiVar != null) {
            ywhVar.U(akqiVar);
        }
        this.d.a(dcdc.f(ywhVar), false);
        if (!z) {
            this.e.a(ywhVar);
        }
        yth ythVar = this.f;
        if (ythVar != null) {
            ythVar.a(true);
        }
        cqkx.p(this);
    }

    public void p(boolean z) {
        this.y = z;
    }

    @Override // defpackage.yvr
    @dzsi
    public jad q() {
        return this.v;
    }

    public void r(yth ythVar) {
        this.f = ythVar;
        ythVar.a(f() != null);
    }

    public final void s() {
        this.q.a();
        ywh ywhVar = this.g;
        if (ywhVar != null) {
            ywhVar.W();
        }
    }

    public boolean t(akqi akqiVar, @dzsi String str, @dzsi dnqh dnqhVar) {
        ywh ywhVar = this.g;
        if (ywhVar == null || !ywhVar.U(akqiVar)) {
            if (this.g == null) {
                return false;
            }
            qbt qbtVar = this.u;
            qdf o = qdg.o();
            qaw qawVar = (qaw) o;
            qawVar.a = str;
            qawVar.b = akqiVar.o();
            ywh ywhVar2 = this.g;
            dbsk.s(ywhVar2);
            qawVar.c = qdi.a(ywhVar2.e().c());
            qawVar.h = dnqhVar;
            qbtVar.t(o.h());
            return true;
        }
        cqkx.p(this);
        this.d.b();
        return true;
    }

    public final void u() {
        akqs k;
        yuw yuwVar = this.e;
        akqq akqqVar = yuwVar.a.l().p().i;
        akqs b = yuwVar.b();
        if (b == null) {
            k = akqo.k(akqqVar, 1500.0d);
        } else {
            k = akqo.k(akqqVar, akqo.e(b.a, b.b));
        }
        v(k, false);
    }
}
