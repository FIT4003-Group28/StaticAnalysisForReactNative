package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.gmm.directions.api.PseudoTrackDirectionsEvent;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: psv  reason: default package */
/* loaded from: classes7.dex */
public final class psv extends itb implements qbt {
    private static final dcqe c = dcqe.c("psv");
    private static final AtomicInteger d = new AtomicInteger(1);
    private final dxio<bzll> A;
    private final cjqy B;
    private final cjqq C;
    private final acyp D;
    private final ail<Integer, qux> E = new ail<>(1);
    private final List<dqvj> F = dchl.b(dqvj.DRIVE, dqvj.TWO_WHEELER, dqvj.BICYCLE, dqvj.WALK);
    public final gga a;
    public final bwqv b;
    private final btvo e;
    private final cqat f;
    private final qbj g;
    private final dxio<vsk> h;
    private final akpm i;
    private final put j;
    private final qcy<vnk> k;
    private final qcy<qcz> o;
    private final qcy<rca> p;
    private final Executor q;
    private final vxa r;
    private final afos s;
    private final qeg t;
    private final qef u;
    private final vxl v;
    private final dxio<vzi> w;
    private final dxio<begg> x;
    private final dxio<aedv> y;
    private final yys z;

    public psv(gga ggaVar, btvo btvoVar, cqat cqatVar, qbj qbjVar, dxio<vsk> dxioVar, bwqv bwqvVar, akpm akpmVar, put putVar, vnl vnlVar, voy voyVar, rcb rcbVar, Executor executor, vxa vxaVar, afos afosVar, qeg qegVar, qef qefVar, vxl vxlVar, dxio<vzi> dxioVar2, dxio<begg> dxioVar3, dxio<aedv> dxioVar4, yys yysVar, dxio<bzll> dxioVar5, cjqy cjqyVar, cjqq cjqqVar, acyp acypVar) {
        this.a = ggaVar;
        this.e = btvoVar;
        this.f = cqatVar;
        this.g = qbjVar;
        this.h = dxioVar;
        this.b = bwqvVar;
        this.i = akpmVar;
        this.j = putVar;
        this.k = vnlVar;
        this.o = voyVar;
        this.p = rcbVar;
        this.q = executor;
        this.r = vxaVar;
        this.s = afosVar;
        this.t = qegVar;
        this.u = qefVar;
        this.v = vxlVar;
        this.w = dxioVar2;
        this.x = dxioVar3;
        this.y = dxioVar4;
        this.z = yysVar;
        this.A = dxioVar5;
        this.B = cjqyVar;
        this.C = cjqqVar;
        this.D = acypVar;
    }

    private final void T(@dzsi CharSequence charSequence, List<GmmNotice> list, @dzsi SavedTrip savedTrip, qda qdaVar, @dzsi ddho ddhoVar) {
        xdq xdqVar;
        if (list.isEmpty()) {
            xdqVar = null;
        } else {
            xdq xdqVar2 = new xdq();
            Bundle bundle = new Bundle();
            dcdc<GmmNotice> z = alca.z(list, qdaVar);
            bundle.putCharSequence("title", charSequence);
            bundle.putParcelableArrayList("notices", new ArrayList<>(z));
            bundle.putParcelable("saved_trip", savedTrip);
            bundle.putSerializable("page_ve", ddhoVar);
            xdqVar2.B(bundle);
            xdqVar = xdqVar2;
        }
        if (xdqVar != null) {
            this.a.D(xdqVar);
        }
    }

    private final void U(ggg gggVar) {
        this.y.a().r(gggVar, dktk.COMMUTE);
    }

    private final void V(int i, dbsg<dnqh> dbsgVar) {
        if (this.D.d()) {
            N();
        } else if (this.a.g().J() || (this.a.K() instanceof qur) || this.a.g().H("COMMUTE_HUB_DIRECTOR_FRAGMENT") != null) {
        } else {
            qss qssVar = new qss();
            dbsg j = dbsg.j(this.E.e(Integer.valueOf(i)));
            if (j.a()) {
                qssVar.a = dbsg.j((qux) j.b());
            }
            if (dbsgVar.a()) {
                qssVar.b = dbsg.j(dbsgVar.b());
            }
            gz b = this.a.g().b();
            qst qstVar = new qst();
            Bundle bundle = new Bundle();
            if (qssVar.a.a()) {
                qux b2 = qssVar.a.b();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("hub-state", b2.a());
                quw b3 = b2.b();
                if (b3 != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("destination-type", b3.a().h);
                    bundle3.putInt("travel-mode", b3.b().h);
                    bundle2.putBundle("directive", bundle3);
                }
                bundle2.putParcelable("fragment-state", b2.c());
                bundle2.putLong("save-time", b2.d());
                bundle.putBundle("COMMUTE_HUB_SAVED_STATE", bundle2);
            }
            if (qssVar.b.a()) {
                dsuv.d(bundle, "DIRECTIONS_REQUEST_LOGGING_PARAMS", qssVar.b.b());
            }
            if (!bundle.isEmpty()) {
                qstVar.B(bundle);
            }
            b.y(qstVar, "COMMUTE_HUB_DIRECTOR_FRAGMENT");
            b.f();
        }
    }

    @dzsi
    private static ilo W(@dzsi bdyb bdybVar) {
        bwrs<ilo> bwrsVar;
        if (bdybVar == null || (bwrsVar = bdybVar.bH.i) == null) {
            return null;
        }
        return bwrsVar.c();
    }

    @dzsi
    private final bdyb X() {
        fd J = this.a.J(gfu.ACTIVITY_FRAGMENT);
        if (J instanceof bdyb) {
            return (bdyb) J;
        }
        return null;
    }

    private final void Y(ilo iloVar, begj begjVar, dbsg<amte> dbsgVar) {
        ily g = iloVar.g();
        g.h = true;
        begjVar.b(g.d());
        begjVar.a = begi.BASE_MAP_POI;
        begjVar.K = false;
        begjVar.h = bwrs.a(dbsgVar.f());
        begjVar.F = false;
        begjVar.v = false;
        this.x.a().o(begjVar, false, null);
    }

    @Override // defpackage.qbt
    public final boolean B(ilo iloVar, cjqm cjqmVar) {
        dnqh cc = iloVar.cc(cjqmVar);
        fd J = this.a.J(gfu.ACTIVITY_FRAGMENT);
        if (J instanceof yha) {
            if (((yha) J).ai.t(iloVar.ai(), iloVar.n(), cc)) {
                return true;
            }
        }
        if (this.e.getEnableFeatureParameters().az) {
            qdf o = qdg.o();
            qaw qawVar = (qaw) o;
            qawVar.b = iloVar.ai().o();
            qawVar.a = iloVar.n();
            qawVar.h = cc;
            t(o.h());
            return true;
        }
        return false;
    }

    @Override // defpackage.qbt
    public final void C(qdg qdgVar) {
        bvrj.UI_THREAD.c();
        if (!this.a.g().J()) {
            fd J = this.a.J(gfu.ACTIVITY_FRAGMENT);
            if (J instanceof wio) {
                wio wioVar = (wio) J;
                if (!qdgVar.j()) {
                    qdg qdgVar2 = wioVar.ak;
                    if (qdgVar2 != null && qdgVar2.j()) {
                        gga ggaVar = wioVar.aE;
                        if (ggaVar != null) {
                            ggaVar.g().f();
                            fd J2 = ggaVar.J(gfu.ACTIVITY_FRAGMENT);
                            if (!(J2 instanceof wio)) {
                                bvoo.h("Replacing child station when its parent is not in the stack", new Object[0]);
                                ggaVar.D(wio.g(qdgVar));
                                return;
                            }
                            wioVar = (wio) J2;
                        }
                    }
                    wioVar.i(qdgVar);
                    wioVar.q();
                    return;
                } else if (qdgVar.k()) {
                    bvoo.h("Trying to open a child station, but also replacing the parent fragment", new Object[0]);
                }
            }
            if (qdgVar.k()) {
                this.a.E(wio.g(qdgVar));
            } else {
                this.a.D(wio.g(qdgVar));
            }
        }
    }

    @Override // defpackage.qbt
    public final void D(amte amteVar, int i, @dzsi String str, @dzsi amuo amuoVar) {
        dphe dpheVar = null;
        dpec dpecVar = amuoVar != null ? amuoVar.a : null;
        if (amuoVar != null && dpecVar != null) {
            dqvj c2 = dqvj.c(dpecVar.b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 == dqvj.TRANSIT) {
                amuq amuqVar = amuoVar.b;
                if (amuqVar != null) {
                    dpheVar = amuqVar.g();
                }
                int i2 = 0;
                if (dpheVar == null || (dpheVar.a & 2) == 0) {
                    bvoo.h("Can't find a departure stop proto %s", amuoVar);
                    return;
                } else if (!this.e.getTransitPagesParameters().G || this.e.getEnableFeatureParameters().bw) {
                    qdf o = qdg.o();
                    dpgw dpgwVar = dpheVar.c;
                    if (dpgwVar == null) {
                        dpgwVar = dpgw.r;
                    }
                    qaw qawVar = (qaw) o;
                    qawVar.a = dpgwVar.b;
                    dpgw dpgwVar2 = dpheVar.c;
                    if (dpgwVar2 == null) {
                        dpgwVar2 = dpgw.r;
                    }
                    qawVar.b = dpgwVar2.n;
                    o.g(4);
                    o.j(dpheVar.n);
                    dpgw dpgwVar3 = dpheVar.d;
                    if (dpgwVar3 == null) {
                        dpgwVar3 = dpgw.r;
                    }
                    qawVar.g = dpgwVar3.n;
                    o.f(false);
                    t(o.h());
                    return;
                } else {
                    amub b = amteVar.b(i, this.a);
                    if (b == null) {
                        bvoo.h("Can't find a associated trip indexed %d", Integer.valueOf(i));
                        return;
                    }
                    dpie dpieVar = b.d.a;
                    xbu j = xbv.j();
                    j.f(amteVar.e());
                    j.c(amteVar.g());
                    xbs xbsVar = (xbs) j;
                    xbsVar.a = str;
                    j.e(dpieVar.g);
                    j.b(true);
                    dbsk.s(amuqVar);
                    int i3 = amuqVar.b;
                    dpbp dpbpVar = dpieVar.e.get(0);
                    int i4 = 0;
                    while (true) {
                        if (i2 >= dpbpVar.c.size()) {
                            break;
                        }
                        dpec dpecVar2 = dpbpVar.c.get(i2).c;
                        if (dpecVar2 == null) {
                            dpecVar2 = dpec.o;
                        }
                        dqvj c3 = dqvj.c(dpecVar2.b);
                        if (c3 == null) {
                            c3 = dqvj.DRIVE;
                        }
                        if (c3 == dqvj.TRANSIT) {
                            if (i3 == i2) {
                                j.d(i4);
                                break;
                            }
                            i4++;
                        }
                        i2++;
                    }
                    dpec dpecVar3 = dpieVar.d;
                    if (dpecVar3 == null) {
                        dpecVar3 = dpec.o;
                    }
                    xbsVar.b = dcdc.r(dpecVar3.n);
                    xbsVar.c = amteVar;
                    j.g(i);
                    xbv a = j.a();
                    xcb xcbVar = new xcb();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("StartConnectionBoardParams.src", a.a());
                    bundle.putSerializable("StartConnectionBoardParams.dst", a.b());
                    bundle.putString("StartConnectionBoardParams.savedTripId", a.c());
                    bundle.putByteArray("StartConnectionBoardParams.routeToDisplay", a.d().G());
                    dcdc<dpce> e = a.e();
                    if (e != null && !e.isEmpty()) {
                        Bundle bundle2 = new Bundle();
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(e.size());
                        for (dpce dpceVar : e) {
                            arrayList.add(dsuv.f(dpceVar));
                        }
                        bundle2.putParcelableArrayList("protoparsers", arrayList);
                        bundle.putParcelable("StartConnectionBoardParams.summary", bundle2);
                    }
                    bundle.putInt("StartConnectionBoardParams.initialTransitLegIndex", a.i());
                    bundle.putInt(".tripIndex", a.h());
                    bundle.putSerializable(".directionsStorageitem", a.f());
                    bundle.putBoolean(".anchorOnPassedInDepartures", a.g());
                    xcbVar.B(bundle);
                    this.a.D(xcbVar);
                    return;
                }
            }
        }
        E(amteVar, i, amuoVar);
    }

    @Override // defpackage.qbt
    public final void F(djyo djyoVar) {
        if (djyoVar.g.size() == 0) {
            bvoo.h("No maps in Transit Schematic Map group", new Object[0]);
            return;
        }
        gga ggaVar = this.a;
        Bundle bundle = new Bundle();
        bvrs.l(bundle, djyoVar);
        bundle.putInt("selectedMapIndex", 0);
        yxg yxgVar = new yxg();
        yxgVar.B(bundle);
        ggaVar.D(yxgVar);
    }

    @Override // defpackage.qbt
    public final boolean G(qcz qczVar, @dzsi qup qupVar, @dzsi quy quyVar, @dzsi Fragment$SavedState fragment$SavedState) {
        ges gesVar;
        if (this.D.d()) {
            N();
            return true;
        }
        rca rcaVar = (rca) qczVar.Op(this.p);
        if (!rcaVar.i()) {
            return false;
        }
        if (qczVar.l() && this.a.z(rci.class) != null) {
            this.a.g().f();
        }
        dbsg<dnqh> a = qczVar.a();
        if (fragment$SavedState == null) {
            gesVar = (ges) gfp.a(rci.class, rci.i(rcaVar, qupVar, quyVar, a, this.D.f()));
        } else {
            gesVar = (ges) gfp.a(rci.class, rci.aS(a));
            gesVar.E(fragment$SavedState);
        }
        U(gesVar);
        return true;
    }

    @Override // defpackage.qbt
    public final void H(qcg qcgVar) {
        gga ggaVar = this.a;
        wiq wiqVar = new wiq();
        Bundle bundle = new Bundle();
        bundle.putString("StartBusynessScreenParams.title", qcgVar.a());
        dsuv.d(bundle, "StartBusynessScreenParams.tactileBusyness", qcgVar.b());
        bundle.putSerializable("StartBusynessScreenParams.openHours", qcgVar.c());
        wiqVar.B(bundle);
        ggaVar.D(wiqVar);
    }

    @Override // defpackage.qbt
    public final void I(qco qcoVar, @dzsi Fragment$SavedState fragment$SavedState) {
        if (this.D.d()) {
            N();
        } else if (this.a.g().J()) {
        } else {
            boolean f = this.D.f();
            qjx qjxVar = new qjx();
            Bundle j = qcoVar.j();
            j.putBoolean("has_fragment_search_tag", f);
            qjxVar.B(j);
            if (fragment$SavedState != null) {
                qjxVar.E(fragment$SavedState);
            }
            U(qjxVar);
        }
    }

    @Override // defpackage.qbt
    public final void J(int i) {
        V(i, dbpy.a);
    }

    @Override // defpackage.qbt
    public final void K(int i, cjqm cjqmVar) {
        dnqg bZ;
        dktt dkttVar = this.z.a.getPassiveAssistParameters().a().am;
        if (dkttVar == null) {
            dkttVar = dktt.z;
        }
        if (dkttVar.x) {
            dnqh a = yys.a(cjqmVar);
            dsqp dsqpVar = (dsqp) a.cu(5);
            dsqpVar.bC(a);
            bZ = (dnqg) dsqpVar;
        } else {
            bZ = dnqh.p.bZ();
        }
        if (cjqmVar.a().a()) {
            doeh bZ2 = doei.d.bZ();
            String b = cjqmVar.a().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            doei doeiVar = (doei) bZ2.b;
            b.getClass();
            doeiVar.a |= 4;
            doeiVar.c = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            doei bK = bZ2.bK();
            dnqh dnqhVar2 = dnqh.p;
            bK.getClass();
            dnqhVar.m = bK;
            dnqhVar.a |= 262144;
        }
        V(i, dbsg.i(bZ.bK()));
    }

    @Override // defpackage.qbt
    public final int L(@dzsi fd fdVar) {
        qux q;
        if ((fdVar instanceof qur) && (q = ((qur) fdVar).q()) != null) {
            int incrementAndGet = d.incrementAndGet();
            this.E.c(Integer.valueOf(incrementAndGet), q);
            return incrementAndGet;
        }
        return -1;
    }

    @Override // defpackage.qbt
    public final void M(String str) {
        djyo djyoVar;
        akqi b = akqi.b(str);
        cjta b2 = cjtd.b();
        b2.d = dtxx.bY;
        b2.g = decs.a(b.c);
        b2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
        int a = dwnu.a(this.e.getTransitPagesParameters().I);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            qdb g = qdc.g();
            g.b(str);
            r(g.c());
            b2.w(ddhj.VISIBILITY_VISIBLE);
        } else if (i == 2) {
            qdd i2 = qde.i();
            i2.b(b);
            i2.e(true);
            i2.d(false);
            i2.c(false);
            s(i2.a());
            b2.w(ddhj.VISIBILITY_VISIBLE);
        } else if (i == 3) {
            if (yxc.a.containsKey(b)) {
                yxb yxbVar = yxc.a.get(b);
                dpcb bZ = dpce.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpce dpceVar = (dpce) bZ.b;
                dpceVar.b = 2;
                dpceVar.a |= 1;
                douk bZ2 = doul.f.bZ();
                String str2 = yxbVar.k;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                doul doulVar = (doul) bZ2.b;
                str2.getClass();
                doulVar.a |= 1;
                doulVar.b = str2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dpce dpceVar2 = (dpce) bZ.b;
                doul bK = bZ2.bK();
                bK.getClass();
                dpceVar2.c = bK;
                dpceVar2.a |= 2;
                dpce bK2 = bZ.bK();
                djyn bZ3 = djyo.h.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djyo djyoVar2 = (djyo) bZ3.b;
                bK2.getClass();
                djyoVar2.b();
                djyoVar2.d.add(bK2);
                String str3 = yxbVar.k;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djyo djyoVar3 = (djyo) bZ3.b;
                str3.getClass();
                djyoVar3.a |= 4;
                djyoVar3.e = str3;
                djyl bZ4 = djym.f.bZ();
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djym djymVar = (djym) bZ4.b;
                bK2.getClass();
                djymVar.b();
                djymVar.b.add(bK2);
                djyr bZ5 = djys.g.bZ();
                String str4 = yxbVar.l;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djys djysVar = (djys) bZ5.b;
                str4.getClass();
                djysVar.a |= 1;
                djysVar.b = str4;
                doos doosVar = doos.PNG;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djys djysVar2 = (djys) bZ5.b;
                djysVar2.d = doosVar.c;
                djysVar2.a |= 4;
                dhkc bZ6 = dhkd.d.bZ();
                int i3 = yxbVar.m;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                dhkd dhkdVar = (dhkd) bZ6.b;
                int i4 = 1 | dhkdVar.a;
                dhkdVar.a = i4;
                dhkdVar.b = i3;
                int i5 = yxbVar.n;
                dhkdVar.a = i4 | 2;
                dhkdVar.c = i5;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djys djysVar3 = (djys) bZ5.b;
                dhkd bK3 = bZ6.bK();
                bK3.getClass();
                djysVar3.e = bK3;
                djysVar3.a |= 8;
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                djys djysVar4 = (djys) bZ5.b;
                djysVar4.a |= 16;
                djysVar4.f = 2419200;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                djym djymVar2 = (djym) bZ4.b;
                djys bK4 = bZ5.bK();
                bK4.getClass();
                djymVar2.d = bK4;
                djymVar2.a = 2 | djymVar2.a;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                djyo djyoVar4 = (djyo) bZ3.b;
                djym bK5 = bZ4.bK();
                bK5.getClass();
                djyoVar4.c();
                djyoVar4.g.add(bK5);
                djyoVar = bZ3.bK();
            } else {
                djyoVar = null;
            }
            if (djyoVar == null) {
                b2.w(ddhj.VISIBILITY_HIDDEN);
            } else {
                F(djyoVar);
                b2.w(ddhj.VISIBILITY_VISIBLE);
            }
        }
        cjqp g2 = this.C.g();
        cjtd a2 = b2.a();
        cjql d2 = g2.d(a2);
        if (a2.f().equals(ddhj.VISIBILITY_VISIBLE)) {
            this.B.j(d2, a2);
        }
    }

    @Override // defpackage.qbt
    public final void N() {
        if (this.D.d()) {
            fd K = this.a.K();
            if ((K instanceof qur) || (K instanceof sis)) {
                return;
            }
            qcp b = qcq.b();
            b.b(true);
            qcq a = b.a();
            sis sisVar = new sis();
            Bundle bundle = new Bundle();
            bundle.putBoolean("StartDestinationsParams.sa", a.a());
            sisVar.B(bundle);
            this.y.a().r(sisVar, dktk.TRANSPORTATION);
        }
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.h.a().m();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.h.a().n();
        super.Nu();
    }

    @Override // defpackage.qbt
    public final void O(wvw wvwVar) {
        wvu wvuVar = new wvu();
        Bundle bundle = new Bundle();
        wvwVar.l(bundle);
        wvuVar.B(bundle);
        this.a.D(wvuVar);
    }

    @Override // defpackage.qbt
    public final void P(qco qcoVar) {
        I(qcoVar, null);
    }

    @Override // defpackage.qbt
    public final void Q(ilo iloVar) {
        if (this.u.a()) {
            ssu ssuVar = (ssu) this.a.z(ssu.class);
            if (ssuVar == null) {
                return;
            }
            amvh d2 = iloVar.d();
            sso ssoVar = ssuVar.an;
            if (ssoVar == null || !ssoVar.h(ssq.WAYPOINT_EDITOR)) {
                uff l = ssuVar.g.a().l();
                dbsk.s(l);
                if (!l.b().booleanValue()) {
                    bvoo.h("Received Waypoint when canAddAdditionalWaypoints() is false.", new Object[0]);
                    return;
                } else {
                    ssuVar.w(dbsg.j(d2));
                    return;
                }
            }
            ufc ufcVar = ssuVar.ai;
            dbsk.s(ufcVar);
            if (!ufcVar.l().booleanValue()) {
                bvoo.h("Received Waypoint when canAddAdditionalWaypoints() is false.", new Object[0]);
                return;
            } else {
                ssuVar.ai.f(d2);
                return;
            }
        }
        puy puyVar = (puy) this.a.z(puy.class);
        if (puyVar == null) {
            return;
        }
        puyVar.bW(iloVar.d());
    }

    @Override // defpackage.qbt
    public final boolean R(ilo iloVar, begj begjVar) {
        amte amteVar = null;
        ssu ssuVar = null;
        if (!this.u.a()) {
            fd J = this.a.J(gfu.ACTIVITY_FRAGMENT);
            puy puyVar = J instanceof puy ? (puy) J : null;
            bdyb X = X();
            ilo W = W(X);
            if (puyVar != null && !this.F.contains(puyVar.aT.l().a())) {
                return true;
            }
            if (puyVar != null) {
                amteVar = puyVar.bL();
            } else if (X != null) {
                amteVar = X.bN();
            }
            if (!this.e.getDirectionsPageParameters().p || (puyVar == null && (W == null || !W.j))) {
                return false;
            }
            Y(iloVar, begjVar, dbsg.j(amteVar));
            return true;
        }
        fd J2 = this.a.J(gfu.ACTIVITY_FRAGMENT);
        if (J2 instanceof ssu) {
            ssuVar = (ssu) J2;
        }
        bdyb X2 = X();
        ilo W2 = W(X2);
        dbsg<amte> dbsgVar = dbpy.a;
        if (ssuVar != null) {
            dbsg<tlv> dbsgVar2 = dbpy.a;
            sso ssoVar = ssuVar.an;
            if (ssoVar != null && ssoVar.h(ssq.RESULT_LIST)) {
                sso ssoVar2 = ssuVar.an;
                dbsk.s(ssoVar2);
                dbsg j = !ssoVar2.h(ssq.RESULT_LIST) ? dbpy.a : dbsg.j((tsa) ssoVar2.j(ssq.RESULT_LIST));
                if (j.a()) {
                    dbsgVar2 = ((trv) ((dbsu) ((tsa) j.b()).ar).a).e();
                }
            } else {
                sso ssoVar3 = ssuVar.an;
                if (ssoVar3 != null && ssoVar3.h(ssq.DETAILS)) {
                    sso ssoVar4 = ssuVar.an;
                    dbsk.s(ssoVar4);
                    dbsg j2 = !ssoVar4.h(ssq.DETAILS) ? dbpy.a : dbsg.j((svo) ssoVar4.j(ssq.DETAILS));
                    if (j2.a()) {
                        svo svoVar = (svo) j2.b();
                        if (svoVar.ak.b().k()) {
                            dbsgVar2 = svoVar.ak.b().l();
                            dbsk.s(dbsgVar2);
                        } else {
                            dbsgVar2 = dbpy.a;
                        }
                    }
                }
            }
            if (dbsgVar2.a()) {
                dbsgVar = dbsg.i(dbsgVar2.b().B(ssuVar.J()));
            } else {
                dbsgVar = dbpy.a;
            }
        } else if (X2 != null) {
            dbsgVar = dbsg.j(X2.bN());
        }
        if (!this.e.getDirectionsPageParameters().p || (ssuVar == null && (W2 == null || !W2.j))) {
            return false;
        }
        Y(iloVar, begjVar, dbsgVar);
        return true;
    }

    @Override // defpackage.qbt
    public final void S(List<GmmNotice> list, @dzsi SavedTrip savedTrip) {
        T(null, list, savedTrip, qda.DESCENDING_SEVERITY, null);
    }

    @Override // defpackage.qbt
    public final qbj e() {
        return this.g;
    }

    @Override // defpackage.qbt
    public final qbo f() {
        return this.h.a();
    }

    @Override // defpackage.qbt
    public final Set<dqvj> i() {
        return this.v.a.a();
    }

    @Override // defpackage.qbt
    public final List<dqvj> j() {
        ArrayList b = dchl.b(dqvj.DRIVE, dqvj.TWO_WHEELER, dqvj.TRANSIT, dqvj.BICYCLE, dqvj.TAXI, dqvj.WALK, dqvj.FLY);
        if (!v()) {
            return b;
        }
        if (!this.t.b()) {
            b.remove(dqvj.TWO_WHEELER);
        }
        qbj qbjVar = this.g;
        if (qbjVar == null || !qbjVar.d()) {
            b.remove(dqvj.TAXI);
        }
        btvo btvoVar = this.e;
        if (btvoVar != null) {
            dkiy enableFeatureParameters = btvoVar.getEnableFeatureParameters();
            if (enableFeatureParameters != null && !enableFeatureParameters.n) {
                b.remove(dqvj.BICYCLE);
            }
            b.remove(dqvj.FLY);
        }
        return b;
    }

    @Override // defpackage.qbt
    public final void k() {
        dqvj a = this.g.a();
        dwao c2 = this.r.c(a, 3, vul.DIRECTIONS_UI);
        qcw x = qcx.x();
        x.s(a);
        x.w(c2);
        m(x.a());
    }

    @Override // defpackage.qbt
    public final void l(PseudoTrackDirectionsEvent pseudoTrackDirectionsEvent) {
        dqvj dqvjVar;
        qbs qbsVar;
        amvh amvhVar;
        afht g = afhi.g(pseudoTrackDirectionsEvent.getMode());
        if (g == null) {
            dqvjVar = dqvj.DRIVE;
        } else {
            dqvjVar = g.a;
        }
        amvg P = amvh.P();
        P.b = pseudoTrackDirectionsEvent.getTo();
        Double lat = pseudoTrackDirectionsEvent.getLat();
        Double lng = pseudoTrackDirectionsEvent.getLng();
        if (lat != null && lng != null) {
            P.d = new akqq(lat.doubleValue(), lng.doubleValue());
        }
        if (pseudoTrackDirectionsEvent.getStartNavigation().booleanValue()) {
            qbsVar = qbs.NAVIGATION;
        } else {
            qbsVar = qbs.DEFAULT;
        }
        qcw x = qcx.x();
        x.s(dqvjVar);
        x.k(qbsVar);
        x.w(this.r.c(dqvjVar, 3, vul.DIRECTIONS_UI));
        if (pseudoTrackDirectionsEvent.getFrom() != null) {
            amvg P2 = amvh.P();
            P2.b = pseudoTrackDirectionsEvent.getFrom();
            amvhVar = P2.a();
        } else {
            amvhVar = null;
        }
        x.r(amvhVar);
        x.u(P.a());
        m(x.a());
    }

    @Override // defpackage.qbt
    public final void m(@dzsi final qcz qczVar) {
        this.q.execute(new Runnable(this, qczVar) { // from class: psr
            private final psv a;
            private final qcz b;

            {
                this.a = this;
                this.b = qczVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.n(this.b);
            }
        });
    }

    @Override // defpackage.qbt
    public final void n(@dzsi qcz qczVar) {
        bvrj.UI_THREAD.c();
        if (qczVar != null && qczVar.n() != null) {
            qbn n = qczVar.n();
            dbsk.s(n);
            qbm a = n.a();
            amte n2 = a.n();
            if (a.c() && n2 != null) {
                this.s.a(n2.c);
                this.A.a().a(a);
            }
        }
        if (this.a.g().J()) {
            return;
        }
        boolean z = false;
        if (!v() || this.g == null || qczVar == null) {
            bvoo.h("Cannot start directions if not attached to GmmActivity", new Object[0]);
        } else if (qczVar.m() == qbs.COMMUTE_IMMERSIVE && G(qczVar, null, null, null)) {
        } else {
            qcz qczVar2 = (qcz) qczVar.Op(this.o);
            vnk vnkVar = (vnk) qczVar2.Op(this.k);
            GmmLocation e = this.g.e();
            if (e != null && !ahnb.a(e, this.f)) {
                vnkVar.K(e.a());
            }
            if (qczVar2.c()) {
                vnkVar.am(vnj.MAY_SEARCH);
            }
            dhjx Z = this.i.Z();
            if (Z == null) {
                return;
            }
            vnkVar.aN(Z);
            akqs a2 = alao.a(this.i);
            if (qczVar2.l() && this.a.z(puy.class) != null) {
                this.a.g().f();
            }
            this.u.c();
            if (this.u.a()) {
                ssu ssuVar = new ssu();
                ssuVar.ao = dbsg.j(qczVar2);
                this.a.D(ssuVar);
                return;
            }
            put putVar = this.j;
            qbn n3 = qczVar2.n();
            bwnj bwnjVar = new bwnj();
            bwnjVar.m(vnkVar.as());
            bwnjVar.k(vnkVar.aq());
            bwnjVar.c(vnkVar.ap());
            bwnjVar.E(vnkVar.au());
            bwnjVar.A(a2);
            bwnjVar.p(bwnl.a);
            bwnjVar.M(false);
            puy puyVar = new puy();
            Bundle bundle = new Bundle();
            putVar.a.c(bundle, "directions_start_page_state", vnkVar);
            putVar.a.c(bundle, "directions_start_page_odelay_state", bwnjVar);
            puyVar.B(bundle);
            puyVar.cA = n3;
            if (puyVar.cA != null) {
                z = true;
            }
            puyVar.cz = z;
            this.a.D(puyVar);
        }
    }

    @Override // defpackage.qbt
    public final void o(amte amteVar, int i, long j) {
        gga ggaVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putSerializable("directionsStorageItem", amteVar);
        bundle.putInt("tripIndex", i);
        bundle.putLong("updatedTimeMs", j);
        ggaVar.D((ggg) gfp.a(rck.class, bundle));
    }

    @Override // defpackage.qbt
    public final void p(List<pyx> list) {
        gga ggaVar = this.a;
        Bundle bundle = new Bundle();
        bundle.putParcelable("agencyDetails", new ProtoBufUtil$ParcelableProtoList(list));
        pyz pyzVar = new pyz();
        pyzVar.B(bundle);
        ggaVar.D(pyzVar);
    }

    @Override // defpackage.qbt
    public final void q(@dzsi CharSequence charSequence, List<GmmNotice> list, qda qdaVar, @dzsi ddho ddhoVar) {
        T(charSequence, list, null, qdaVar, ddhoVar);
    }

    @Override // defpackage.qbt
    public final void r(final qdc qdcVar) {
        this.q.execute(new Runnable(this, qdcVar) { // from class: pss
            private final psv a;
            private final qdc b;

            {
                this.a = this;
                this.b = qdcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                psv psvVar = this.a;
                qdc qdcVar2 = this.b;
                bvrj.UI_THREAD.c();
                if (psvVar.a.K() instanceof ydq) {
                    psvVar.a.E(ydq.g(qdcVar2));
                } else {
                    psvVar.a.D(ydq.g(qdcVar2));
                }
            }
        });
    }

    @Override // defpackage.qbt
    public final void s(final qde qdeVar) {
        this.q.execute(new Runnable(this, qdeVar) { // from class: pst
            private final psv a;
            private final qde b;

            {
                this.a = this;
                this.b = qdeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                psv psvVar = this.a;
                qde qdeVar2 = this.b;
                bvrj.UI_THREAD.c();
                bwqv bwqvVar = psvVar.b;
                yha yhaVar = new yha();
                Bundle bundle = new Bundle();
                bundle.putString("StartTransitLineSpaceParams.lfi", qdeVar2.a().o());
                bundle.putString("StartTransitLineSpaceParams.twl", qdeVar2.b());
                dnqh c2 = qdeVar2.c();
                if (c2 != null) {
                    bvrs.k(bundle, "StartTransitLineSpaceParams.lp", c2);
                }
                bundle.putBoolean(".rtos", qdeVar2.d());
                bwqvVar.c(bundle, ".asreqr", qdeVar2.e());
                bwqvVar.c(bundle, ".asresr", qdeVar2.f());
                bundle.putBoolean(".spm", qdeVar2.h());
                bundle.putBoolean(".assb", qdeVar2.g());
                yhaVar.B(bundle);
                if (qdeVar2.d()) {
                    psvVar.a.E(yhaVar);
                } else {
                    psvVar.a.D(yhaVar);
                }
            }
        });
    }

    @Override // defpackage.qbt
    public final void t(final qdg qdgVar) {
        this.q.execute(new Runnable(this, qdgVar) { // from class: psu
            private final psv a;
            private final qdg b;

            {
                this.a = this;
                this.b = qdgVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.C(this.b);
            }
        });
    }

    @Override // defpackage.qbt
    public final void E(amte amteVar, int i, @dzsi amuo amuoVar) {
        this.w.a().a(this.b, amteVar, i, amuoVar == null ? 0 : amuoVar.i);
    }
}
