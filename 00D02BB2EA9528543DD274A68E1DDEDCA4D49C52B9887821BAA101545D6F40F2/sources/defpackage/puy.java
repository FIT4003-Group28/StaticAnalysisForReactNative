package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: puy  reason: default package */
/* loaded from: classes7.dex */
public final class puy extends gew implements prw, qbq, tmw, aueo, qbi, pyp {
    public xmz aA;
    public dxio<ckqr> aB;
    public qbv aC;
    public cpv aO;
    public yze aP;
    public cklq aQ;
    public wvb aR;
    public wto aS;
    @dzsi
    vnk aX;
    public boolean aY;
    boolean aZ;
    public bvjj ad;
    public dxio<auen> ae;
    public eeu af;
    public bvrb ag;
    public Executor ah;
    public gfq ai;
    public bwqv aj;
    public axrx ak;
    public cjqy al;
    public ahjq am;
    public dxio<arag> an;
    public dxio<qbt> ao;
    public pry ap;
    public alhv aq;
    public vmz ar;
    public bzgl as;
    public dxio<akox> at;
    public dxio<bzcm> au;
    public dxio<vzi> av;
    public dxio<byzd> aw;
    public cvt ax;
    public xfc ay;
    public ckcw az;
    public pyr bA;
    public pyq bB;
    public pvl bC;
    public pse bD;
    public zif bE;
    public vtg bF;
    public pym bG;
    public prk bH;
    public akfa bI;
    public bypy bJ;
    public bypx bK;
    public pxl bL;
    public pys bM;
    public psw bN;
    public pyi bO;
    public arlp bP;
    public vma bQ;
    public dxio<vml> bR;
    public btpc bS;
    public vyp bT;
    public vop bU;
    public vnq bV;
    public qfr bW;
    public ahjq bX;
    public qga bY;
    public qfs bZ;
    @dzsi
    Parcelable ba;
    zjm bb;
    @dzsi
    cqkf<zby> bc;
    ptj bd;
    public ptk be;
    public vox bf;
    gek bg;
    @dzsi
    pvk bh;
    zmu bi;
    public yyk bj;
    public vzg bk;
    public psl bl;
    psk bm;
    public jkf bn;
    public btrm bo;
    public axwq bp;
    public cqkj bq;
    public bvkx br;
    public dxio<qbt> bs;
    public dxio<afwr> bt;
    public dxio<ascb> bu;
    public dxio<acwo> bv;
    public prm bw;
    public psg bx;
    @dzsi
    qbr by;
    public tmz bz;
    @dzsi
    qbn cA;
    vmv cB;
    vyo cC;
    @dzsi
    private dnqh cG;
    @dzsi
    private dnqh cH;
    @dzsi
    private Runnable cI;
    private zie cJ;
    @dzsi
    private FrameLayout cK;
    private boolean cL;
    @dzsi
    private dnqh cM;
    private tmy cN;
    @dzsi
    private pyl cO;
    @dzsi
    private cqkf<jar> cP;
    @dzsi
    private cqkf<zew> cQ;
    @dzsi
    private cqkf<zbx> cR;
    @dzsi
    private cqkf<zei> cS;
    private znh cV;
    @dzsi
    private prc cW;
    private final pus cY;
    private final alht cZ;
    public xlw ca;
    public pvf cb;
    public pxn cc;
    public byym cd;
    public xkm ce;
    public xkl cf;
    public zni cg;
    public zmv ch;
    public zln ci;
    public arrf cj;
    public zkk ck;
    public xaa cl;
    public prd cm;
    public dxip<zio> cn;
    public dxip<zjm> co;
    public ckmm cp;
    public dzsj<znk> cq;
    public dzsj<zpl> cr;
    public pyt cs;
    @dzsi
    public akqq cw;
    @dzsi
    prx d;
    @dzsi
    private pve da;
    private final puw db;
    private final pux dc;
    public cqat e;
    public btvo f;
    public vwv g;
    private static final dcqe cF = dcqe.c("puy");
    public static final long c = TimeUnit.MILLISECONDS.convert(1, TimeUnit.MINUTES);
    int cD = 1;
    public final vnk aT = new vnk(dcdc.e());
    public boolean aU = false;
    boolean aV = false;
    boolean aW = false;
    private int cT = -1;
    final bzgj ct = new bzgj();
    private final bzgj cU = new bzgj();
    @dzsi
    public int cE = 0;
    public boolean cu = false;
    long cv = -1;
    public boolean cx = false;
    public boolean cy = false;
    public boolean cz = false;
    private final crzp<btlu> cX = new pum(this);

    static {
        TimeUnit.MILLISECONDS.convert(5L, TimeUnit.MINUTES);
    }

    public puy() {
        new pun(this);
        this.cY = new pus(this);
        this.cZ = new puo(this);
        this.dc = new pux(this);
        this.db = new puw(this);
    }

    public static boolean bv(@dzsi amub amubVar, bzdk bzdkVar) {
        if (amubVar == null) {
            return false;
        }
        return bzdkVar.a(amubVar);
    }

    private final void ca(wtf wtfVar) {
        synchronized (this.aT) {
            dbsg<Integer> d = wtfVar.a().d(this.aT.ao());
            if (d.a()) {
                int i = 7;
                if (wtfVar.i() == 1) {
                    this.aX = null;
                    this.aT.am(vnj.NO_SEARCH);
                } else {
                    aJ();
                    if (wtfVar.i() == 3) {
                        this.aT.ak(d.b().intValue());
                        this.aT.am(vnj.MUST_SEARCH);
                        i = 8;
                    } else {
                        this.aT.am(vnj.MAY_SEARCH);
                    }
                }
                vnk vnkVar = this.aT;
                dwao h = vnkVar.h();
                dwao e = wtfVar.e();
                if (e != null) {
                    dsqp dsqpVar = (dsqp) h.cu(5);
                    dsqpVar.bC(h);
                    dwal dwalVar = (dwal) dsqpVar;
                    dwalVar.bC(e);
                    h = dwalVar.bK();
                }
                vnkVar.R(h);
                amvh c2 = wtfVar.c();
                if (c2 != null) {
                    this.aT.A(c2, wtfVar.b(), d.b().intValue(), wtfVar.h());
                } else {
                    this.aT.A(wtfVar.b(), amvh.a, d.b().intValue(), wtfVar.h());
                }
                this.aT.an(d.b().intValue());
                if (wtfVar.d()) {
                    this.aT.C(d.b().intValue());
                }
                if (this.aT.bh() && this.aC.b() && this.aT.g() == dqvj.TRANSIT) {
                    this.aT.U(qbs.TRANSIT_TRIP_DETAILS);
                }
                bP(i, wtfVar.f(), wtfVar.g(), null);
            }
            cc();
        }
    }

    private final void cb() {
        eeu eeuVar = this.af;
        if (eeuVar == null || !((efh) eeuVar).b) {
            return;
        }
        bV().b();
    }

    private final void cc() {
        if (this.aE != null) {
            dcdc<amvh> aw = this.aT.aw();
            int size = aw.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (aw.get(i).a()) {
                    bV().a();
                    return;
                }
                i = i2;
            }
        }
    }

    private final void cd(vnk vnkVar) {
        this.aT.b(vnkVar);
    }

    private final void ce(dqvj dqvjVar) {
        if (dqvjVar == dqvj.TWO_WHEELER) {
            this.ad.S(bvjk.hX, true);
            this.ad.S(bvjk.hY, true);
        } else if (dqvjVar != dqvj.TRANSIT) {
        } else {
            this.ad.S(bvjk.hZ, true);
            this.ad.S(bvjk.ia, true);
        }
    }

    private final boolean cf(@dzsi Bundle bundle) {
        vnk vnkVar;
        if (bundle != null) {
            bwnj bwnjVar = null;
            try {
                vnkVar = (vnk) this.aj.d(vnk.class, bundle, "directions_start_page_state");
            } catch (IOException e) {
                e = e;
                vnkVar = null;
            }
            try {
                bwnjVar = (bwnj) this.aj.d(bwnj.class, bundle, "directions_start_page_odelay_state");
            } catch (IOException e2) {
                e = e2;
                bvoo.h("Corrupt storage data: %s", e);
                if (vnkVar != null) {
                    cd(vnkVar);
                    this.cN.a(bwnjVar);
                    return true;
                }
                return false;
            }
            if (vnkVar != null && bwnjVar != null) {
                cd(vnkVar);
                this.cN.a(bwnjVar);
                return true;
            }
        }
        return false;
    }

    private final void cg() {
        this.bb.C(this.cE != 7);
        this.bb.D();
    }

    private final void ch(@dzsi cqkf<? extends cqkp> cqkfVar) {
        if (cqkfVar == null) {
            return;
        }
        View c2 = cqkfVar.c();
        if (c2 != null) {
            this.aH.h(c2);
        }
        cqkfVar.e(null);
    }

    private final boolean ci() {
        return this.aT.g() == dqvj.TRANSIT && this.aT.t() == qbs.TRANSIT_TRIP_DETAILS;
    }

    private final boolean cj(Activity activity, int i, amte amteVar) {
        return zba.d(activity, this.ad, this.am, amteVar, i, this.g);
    }

    private final void ck() {
        if (!this.aT.bn()) {
            this.at.a().aj().y();
            return;
        }
        dosz doszVar = this.aT.h().B;
        if (doszVar == null) {
            doszVar = dosz.e;
        }
        Calendar e = vxb.e(vxb.a(doszVar));
        Calendar calendar = (Calendar) e.clone();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(7, 1 - e.get(7));
        long seconds = TimeUnit.MILLISECONDS.toSeconds(e.getTimeInMillis() - calendar.getTimeInMillis());
        if (seconds > 605000 || seconds < 0) {
            bvoo.h("Calculated nonsensical number of seconds into the week: %s.", Long.valueOf(seconds));
        }
        this.at.a().aj().x((int) seconds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r13 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean cl(boolean r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.cl(boolean):boolean");
    }

    private final boolean cm() {
        pvk pvkVar = this.bh;
        dbsk.s(pvkVar);
        jjn i = pvkVar.i();
        return i != this.bn.l().L() && this.bn.l().A(i);
    }

    private final void cn() {
        if (ci() && this.f.getTransitPagesParameters().l) {
            vwn d = this.aT.l().d();
            int e = d.e();
            amte p = d.p();
            if (p != null) {
                Integer g = this.aT.l().d().g();
                if (g != null) {
                    this.ca.a(p, e, g.intValue());
                } else {
                    this.ca.a(p, e, -1);
                }
            }
            if (!this.cf.a() || !this.ca.a.c()) {
                this.cd.h(false);
            } else {
                this.cd.h(true);
            }
        }
    }

    private final void co() {
        vwn d;
        amte p;
        if (ci() && (p = (d = this.aT.l().d()).p()) != null) {
            xmz xmzVar = this.aA;
            int e = d.e();
            amve m = p.a.m(e);
            dqvj c2 = dqvj.c(m.b().b);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 == dqvj.TRANSIT && m.d(0).e() > 0) {
                amuq d2 = m.d(0).d(0);
                dqvj c3 = dqvj.c(d2.a().b);
                if (c3 == null) {
                    c3 = dqvj.DRIVE;
                }
                if (c3 == dqvj.TAXI && d2.l()) {
                    wuv d3 = xmzVar.b.d(d2, e);
                    amub b = p.b(e, xmzVar.c);
                    if (d3 != null && b != null && b.l.l() > 0) {
                        String A = d3.A(xmzVar.c.getResources());
                        if (!A.isEmpty()) {
                            akqq S = b.l.m(0).S();
                            xyr xyrVar = xmzVar.a;
                            bycg bycgVar = xyrVar.b;
                            if (bycgVar != null && bycgVar.a.contentEquals(A) && akqq.v(xyrVar.b.b, S, 1.0E-7d)) {
                                return;
                            }
                            xyrVar.a();
                            xyrVar.b = xyrVar.a.a(S, A.toString());
                            xyrVar.b.a();
                            return;
                        }
                    }
                }
            }
            xmzVar.a.a();
        }
    }

    private final void cp(final Runnable runnable) {
        this.ag.b(new Runnable(this, runnable) { // from class: puc
            private final puy a;
            private final Runnable b;

            {
                this.a = this;
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                puy puyVar = this.a;
                Runnable runnable2 = this.b;
                if (puyVar.aD) {
                    runnable2.run();
                }
            }
        }, bvrj.UI_THREAD);
    }

    private final prc cq() {
        if (this.cW == null) {
            prd prdVar = this.cm;
            Runnable runnable = new Runnable(this) { // from class: pud
                private final puy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    puy puyVar = this.a;
                    puyVar.aS.b(false);
                    puyVar.bO(10, null);
                }
            };
            gga a = prdVar.a.a();
            prd.a(a, 1);
            prd.a(((dxjh) prdVar.b).a(), 2);
            prd.a(runnable, 3);
            this.cW = new prc(a, runnable);
        }
        return this.cW;
    }

    private final void cr() {
        int i;
        int a;
        if (!bB()) {
            amsy aS = this.aT.aS();
            gn gnVar = this.A;
            if (aS == null || gnVar == null) {
                return;
            }
            prm prmVar = this.bw;
            if (aS.s() == dovb.WAYPOINT_REFINEMENT) {
                i = 0;
                while (i < aS.i()) {
                    int i2 = aS.i();
                    if ((i == 0 || i == i2 - 1) && (a = dpka.a(aS.h(i).d)) != 0 && a == 3) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            prmVar.b.b(new prl(prmVar, gnVar, aS, i, this), bvrj.UI_THREAD);
            if (i >= 0) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ddho w(int i, int i2) {
        return i == 0 ? dtxn.cC : i == i2 + (-1) ? dtxn.co : dtxn.cN;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        ch(this.bc);
        ch(this.cP);
        ch(this.cQ);
        ch(this.cR);
        ch(this.cS);
        this.bc = null;
        this.cP = null;
        this.cQ = null;
        this.cR = null;
        this.cS = null;
        this.cK = null;
        this.da = null;
        this.bh = null;
    }

    @Override // defpackage.gew
    public final void Qm() {
        if (this.aD) {
            vox voxVar = this.bf;
            boolean z = !this.aT.ah();
            bvrj.UI_THREAD.c();
            if (voxVar.c) {
                qbo f = voxVar.a.a().f();
                if (f == null) {
                    return;
                }
                f.f();
            } else if (voxVar.b.n()) {
            } else {
                voxVar.d = z;
            }
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        amvh a;
        vun g;
        if (obj instanceof wtf) {
            cb();
            ca((wtf) obj);
        } else if (obj instanceof bnpg) {
            bnpg bnpgVar = (bnpg) obj;
            int size = this.aT.aw().size();
            cb();
            synchronized (this.aT) {
                dbsg<Integer> d = bnpgVar.a().d(this.aT.ao());
                if (d.a()) {
                    this.al.o(cjtd.a(w(d.b().intValue(), size)));
                    this.aT.A(bnpgVar.b(), bnpgVar.c(), d.b().intValue(), null);
                    bO(7, yys.b(bnpgVar.d()));
                }
                cc();
            }
        } else if (obj instanceof prb) {
            cb();
            prb prbVar = (prb) obj;
            int a2 = prbVar.a();
            if (a2 < 0 || a2 >= this.aT.aw().size()) {
                return;
            }
            ca(wtf.j(dbsg.i(Integer.valueOf(a2)), prbVar.b(), null, yys.b(prbVar.c())));
        } else if (obj instanceof qeh) {
            qeh qehVar = (qeh) obj;
            bvrj.UI_THREAD.c();
            if (!this.aD) {
                synchronized (this.aT) {
                    int al = this.aT.al();
                    if (al >= 0 && al < this.aT.aw().size()) {
                        this.aT.aY();
                        amvh d2 = this.aT.d();
                        if (qehVar.c() == amvi.ATTACH_PARKING) {
                            a = vyr.a(d2, qehVar.a());
                        } else {
                            a = qehVar.a();
                        }
                        boolean D = this.aT.D(al);
                        this.aT.B(a, al);
                        if (D) {
                            this.aT.C(al);
                        }
                        aX();
                        qbn b = qehVar.b();
                        if (b != null) {
                            qbm a3 = b.a();
                            if ((a3.b() || a3.c()) && (g = a3.g()) != null && psp.c(g.b, this.aT.h()) && g.a() == this.aT.g() && psp.d(psp.b(a3.i()), psp.b(this.aT.aw()))) {
                                this.aT.q();
                                this.cA = b;
                                if (this.aT.bu() == 2 && !b.a().b()) {
                                    this.aZ = this.aT.aC();
                                }
                                gn gnVar = this.A;
                                if (!gfq.a(this) || gnVar == null) {
                                    return;
                                }
                                gnVar.h(gfq.j(this), 0);
                                return;
                            }
                        }
                        bQ(7, null, null, null);
                        gn gnVar2 = this.A;
                        if (!gfq.a(this)) {
                            return;
                        }
                        return;
                    }
                    bvoo.h("Invalid search target waypoint index %d, waypoint list size is %d", Integer.valueOf(al), Integer.valueOf(this.aT.aw().size()));
                    return;
                }
            }
            bvoo.h("Received WaypointSearchResult after directions fragment is started", new Object[0]);
        } else if (!(obj instanceof yiv)) {
        } else {
            yiv yivVar = (yiv) obj;
            this.aT.N(yivVar);
            qbr qbrVar = this.by;
            if (qbrVar == null) {
                return;
            }
            yze yzeVar = this.aP;
            if (yzeVar.a.a() && yzeVar.a.c()) {
                yiv a4 = yzeVar.b.a();
                dsqp dsqpVar = (dsqp) a4.cu(5);
                dsqpVar.bC(a4);
                yim yimVar = (yim) dsqpVar;
                if ((yivVar.a & 1) != 0) {
                    yis yisVar = yivVar.b;
                    if (yisVar == null) {
                        yisVar = yis.b;
                    }
                    if (yimVar.c) {
                        yimVar.bF();
                        yimVar.c = false;
                    }
                    yiv yivVar2 = (yiv) yimVar.b;
                    yisVar.getClass();
                    yivVar2.b = yisVar;
                    yivVar2.a |= 1;
                }
                if ((yivVar.a & 2) != 0) {
                    yiu yiuVar = yivVar.c;
                    if (yiuVar == null) {
                        yiuVar = yiu.c;
                    }
                    if (yimVar.c) {
                        yimVar.bF();
                        yimVar.c = false;
                    }
                    yiv yivVar3 = (yiv) yimVar.b;
                    yiuVar.getClass();
                    yivVar3.c = yiuVar;
                    yivVar3.a |= 2;
                }
                if ((yivVar.a & 4) != 0) {
                    yio yioVar = yivVar.d;
                    if (yioVar == null) {
                        yioVar = yio.c;
                    }
                    if (yimVar.c) {
                        yimVar.bF();
                        yimVar.c = false;
                    }
                    yiv yivVar4 = (yiv) yimVar.b;
                    yioVar.getClass();
                    yivVar4.d = yioVar;
                    yivVar4.a |= 4;
                }
                yzeVar.b.c(yimVar.bK());
            }
            yze yzeVar2 = this.aP;
            dwao h = this.aT.h();
            douz br = this.aT.br();
            dsqp dsqpVar2 = (dsqp) h.cu(5);
            dsqpVar2.bC(h);
            dwal dwalVar = (dwal) dsqpVar2;
            if ((yivVar.a & 1) != 0) {
                yis yisVar2 = yivVar.b;
                if (yisVar2 == null) {
                    yisVar2 = yis.b;
                }
                dwbk dwbkVar = ((dwao) dwalVar.b).f;
                if (dwbkVar == null) {
                    dwbkVar = dwbk.s;
                }
                dwbd ca = dwbk.s.ca(dwbkVar);
                ynf.l(ca, yisVar2, yzeVar2.d);
                dwbh c2 = ((yzt) yzeVar2.c).c(yisVar2);
                if (ca.c) {
                    ca.bF();
                    ca.c = false;
                }
                dwbk dwbkVar2 = (dwbk) ca.b;
                c2.getClass();
                dwbkVar2.o = c2;
                dwbkVar2.a |= 32768;
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar = (dwao) dwalVar.b;
                dwbk bK = ca.bK();
                bK.getClass();
                dwaoVar.f = bK;
                dwaoVar.a |= 2;
            }
            if ((yivVar.a & 4) != 0) {
                yio yioVar2 = yivVar.d;
                if (yioVar2 == null) {
                    yioVar2 = yio.c;
                }
                dwbk dwbkVar3 = ((dwao) dwalVar.b).f;
                if (dwbkVar3 == null) {
                    dwbkVar3 = dwbk.s;
                }
                dwbd ca2 = dwbk.s.ca(dwbkVar3);
                if (ca2.c) {
                    ca2.bF();
                    ca2.c = false;
                }
                ((dwbk) ca2.b).m = dwbk.ck();
                if (!yzeVar2.a.m || !ynf.k(br)) {
                    ca2.b(yze.a(dqtz.NORMAL_FARE));
                } else if (yioVar2.b) {
                    ca2.b(yze.a(dqtz.IC_FARE));
                    ca2.b(yze.a(dqtz.NORMAL_FARE));
                } else {
                    ca2.b(yze.a(dqtz.NORMAL_FARE));
                    ca2.b(yze.a(dqtz.IC_FARE));
                }
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar2 = (dwao) dwalVar.b;
                dwbk bK2 = ca2.bK();
                bK2.getClass();
                dwaoVar2.f = bK2;
                dwaoVar2.a |= 2;
            }
            if ((yivVar.a & 2) != 0) {
                dwbk dwbkVar4 = ((dwao) dwalVar.b).f;
                if (dwbkVar4 == null) {
                    dwbkVar4 = dwbk.s;
                }
                dwbd ca3 = dwbk.s.ca(dwbkVar4);
                yiu yiuVar2 = yivVar.c;
                if (yiuVar2 == null) {
                    yiuVar2 = yiu.c;
                }
                dqvb b2 = dqvb.b(yiuVar2.b);
                if (b2 == null) {
                    b2 = dqvb.TRANSIT_BEST;
                }
                if (ca3.c) {
                    ca3.bF();
                    ca3.c = false;
                }
                dwbk dwbkVar5 = (dwbk) ca3.b;
                dwbkVar5.i = b2.f;
                dwbkVar5.a |= 256;
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao dwaoVar3 = (dwao) dwalVar.b;
                dwbk bK3 = ca3.bK();
                bK3.getClass();
                dwaoVar3.f = bK3;
                dwaoVar3.a |= 2;
            }
            dwao bK4 = dwalVar.bK();
            int i = yivVar.a;
            int i2 = 4960;
            if ((i & 4) == 0) {
                if ((i & 1) != 0) {
                    i2 = 80309;
                } else if ((i & 2) != 0) {
                    i2 = 80310;
                }
            }
            dnqg bZ = dnqh.p.bZ();
            ddxw bZ2 = ddxx.j.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ2.b;
            ddxxVar.a |= 8;
            ddxxVar.d = i2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            ddxx bK5 = bZ2.bK();
            bK5.getClass();
            dnqhVar.f = bK5;
            dnqhVar.a |= 16;
            qbrVar.h(bK4, bZ.bK());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0194  */
    @Override // defpackage.prw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.vnr r12) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.a(vnr):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aJ() {
        vnk vnkVar = new vnk(this.ar.a());
        this.aX = vnkVar;
        vnkVar.b(this.aT);
    }

    final void aR() {
        View findViewById = J().findViewById(16908290);
        bC();
        dafk b = ckos.b(findViewById, R.string.UPDATE_ROUTES_AND_TRAFFIC_SNACKBAR_DESCRIPTION, 0);
        b.t(R.string.UPDATE_ROUTES_AND_TRAFFIC_SNACKBAR_ACTION_BUTTON, new View.OnClickListener(this) { // from class: ptl
            private final puy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i();
            }
        });
        b.c();
        bV().c(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aS() {
        if (this.aD && !this.aU) {
            this.aU = true;
            this.ak.f(new axrw(this) { // from class: ptw
                private final puy a;

                {
                    this.a = this;
                }

                @Override // defpackage.axrw
                public final void a(int i) {
                    final puy puyVar = this.a;
                    if (!puyVar.aD) {
                        puyVar.aU = false;
                    } else if (i == 0) {
                        arag a = puyVar.an.a();
                        ahjq ahjqVar = puyVar.am;
                        if (puyVar.aT.t() == qbs.NAVIGATION) {
                            a.i(new arae(puyVar) { // from class: pue
                                private final puy a;

                                {
                                    this.a = puyVar;
                                }

                                @Override // defpackage.arae
                                public final void a(araf arafVar) {
                                    this.a.aU(arafVar);
                                }
                            });
                        } else {
                            a.f(ahjqVar.h().b(), new arae(puyVar) { // from class: puf
                                private final puy a;

                                {
                                    this.a = puyVar;
                                }

                                @Override // defpackage.arae
                                public final void a(araf arafVar) {
                                    this.a.aU(arafVar);
                                }
                            });
                        }
                    } else {
                        puyVar.aU = false;
                        puyVar.aT();
                    }
                }
            });
        }
    }

    public final void aT() {
        boolean z;
        synchronized (this.aT) {
            z = false;
            for (int i = 0; i < this.aT.aw().size(); i++) {
                if (this.aT.aw().get(i).k()) {
                    this.aT.B(amvh.a, i);
                    z = true;
                }
            }
        }
        if (z) {
            bO(7, null);
        }
    }

    public final void aU(araf arafVar) {
        this.aU = false;
        if (arafVar == araf.NOT_OPTIMIZED_OR_DISABLED) {
            bD(new amqp(2));
        } else if (!this.aD) {
        } else {
            if (arafVar == araf.OPTIMIZED) {
                bD(new amqp(1));
            } else if (arafVar == araf.NO_LOCATION_DEVICE) {
            } else {
                cjxu.g(this.ag, J(), Rp(R.string.LOCATION_NOT_YET_AVAILABLE));
            }
        }
    }

    public final void aV() {
        gn gnVar = this.A;
        if (gnVar == null || gnVar.J() || cl(true)) {
            return;
        }
        gnVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aX() {
        this.aX = null;
        this.aT.am(vnj.NO_SEARCH);
        this.aT.ak(-1);
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<zei> e;
        try {
            super.ag(layoutInflater, viewGroup, bundle);
            FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
            this.cK = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            try {
                this.bc = this.bq.d(new vfv(), this.cK, true);
                try {
                    bwpn a = this.cN.a.a(new bwnj());
                    a.A(new cjyp());
                    pxn pxnVar = this.cc;
                    vnk vnkVar = this.aT;
                    Activity activity = (Activity) ((dxjd) pxnVar.a).a;
                    pxn.a(activity, 1);
                    dxio a2 = ((dxjh) pxnVar.b).a();
                    pxn.a(a2, 2);
                    pxn.a(this, 3);
                    pxn.a(vnkVar, 4);
                    this.cC = new pxm(activity, a2, this, vnkVar);
                    xkl a3 = this.ce.a(this.aT);
                    this.cf = a3;
                    a3.e.b(new bzgf(this) { // from class: puk
                        private final puy a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.bzgf
                        public final void a() {
                            this.a.bo();
                        }
                    }, this.cU, a3.f);
                    this.bV.c = this.aT;
                    vop vopVar = this.bU;
                    final vnk vnkVar2 = this.aT;
                    vopVar.c = vnkVar2;
                    vopVar.a(new voo(vnkVar2) { // from class: von
                        private final vnk a;

                        {
                            this.a = vnkVar2;
                        }

                        @Override // defpackage.voo
                        public final void a(vok vokVar) {
                            vokVar.e(this.a);
                        }
                    });
                    this.cR = this.bq.e(vei.a());
                    cqkf e2 = this.bq.e(vei.e());
                    cqkf e3 = this.bq.e(vei.h());
                    cqkf e4 = this.bq.e(vei.i());
                    pvl pvlVar = this.bC;
                    vnk vnkVar3 = this.aT;
                    cqkf<zbx> cqkfVar = this.cR;
                    dbsk.s(cqkfVar);
                    zio M = this.bb.M();
                    dbsk.s(M);
                    zie zieVar = this.cJ;
                    vmv vmvVar = this.cB;
                    bbb N = this.bb.N();
                    tmy tmyVar = this.cN;
                    vyo vyoVar = this.cC;
                    zmu zmuVar = this.bi;
                    xkl xklVar = this.cf;
                    try {
                        gga a4 = pvlVar.a.a();
                        pvl.a(a4, 1);
                        jkf a5 = pvlVar.b.a();
                        pvl.a(a5, 2);
                        vop a6 = pvlVar.c.a();
                        pvl.a(a6, 3);
                        bvrb a7 = pvlVar.d.a();
                        pvl.a(a7, 4);
                        pvl.a(pvlVar.e.a(), 5);
                        dzsj<qce> dzsjVar = pvlVar.f;
                        dzsj<qbt> dzsjVar2 = pvlVar.g;
                        dzsj<byej> dzsjVar3 = pvlVar.h;
                        ziw a8 = pvlVar.i.a();
                        pvl.a(a8, 9);
                        Executor a9 = pvlVar.j.a();
                        pvl.a(a9, 10);
                        dxio a10 = ((dxjh) pvlVar.k).a();
                        pvl.a(a10, 11);
                        qbv a11 = pvlVar.l.a();
                        pvl.a(a11, 12);
                        pvl.a(pvlVar.m.a(), 13);
                        pvl.a(vnkVar3, 14);
                        pvl.a(cqkfVar, 15);
                        pvl.a(e2, 16);
                        pvl.a(e3, 17);
                        pvl.a(e4, 18);
                        pvl.a(M, 19);
                        pvl.a(zieVar, 20);
                        pvl.a(vmvVar, 21);
                        pvl.a(N, 22);
                        pvl.a(tmyVar, 23);
                        pvl.a(a, 24);
                        pvl.a(vyoVar, 25);
                        pvl.a(xklVar, 27);
                        try {
                            this.bh = new pvk(a4, a5, a6, a7, dzsjVar, dzsjVar2, dzsjVar3, a8, a9, a10, a11, vnkVar3, cqkfVar, e2, e3, e4, M, zieVar, vmvVar, N, tmyVar, a, vyoVar, zmuVar, xklVar);
                            e = this.bq.e(new pvt());
                            this.cS = e;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            xaa xaaVar = this.cl;
            dbsk.s(e);
            View c2 = e.c();
            xaa.a(xaaVar.a.a(), 1);
            dxio a12 = ((dxjh) xaaVar.b).a();
            xaa.a(a12, 2);
            dxio a13 = ((dxjh) xaaVar.c).a();
            xaa.a(a13, 3);
            cqhu a14 = xaaVar.d.a();
            xaa.a(a14, 4);
            xaa.a(c2, 5);
            wzz wzzVar = new wzz(a12, a13, a14, c2);
            gek gekVar = this.bg;
            pvk pvkVar = this.bh;
            dbsk.s(pvkVar);
            pxk pxkVar = new pxk(gekVar, this, pvkVar, this.aT, this.bi, this.bF, wzzVar, this.cs, this.al);
            if (this.as.a()) {
                this.cQ = this.bq.e(vei.f());
                br();
            }
            if (this.f.getDirectionsPageParameters().u) {
                this.cP = this.bq.e(vei.g());
                bq();
            }
            try {
                pvf pvfVar = this.cb;
                tmy tmyVar2 = this.cN;
                FrameLayout frameLayout2 = this.cK;
                dbsk.s(frameLayout2);
                pvk pvkVar2 = this.bh;
                dbsk.s(pvkVar2);
                vnk vnkVar4 = this.aT;
                pxl pxlVar = this.bL;
                pys pysVar = this.bM;
                psw pswVar = this.bN;
                pyi pyiVar = this.bO;
                arlp arlpVar = this.bP;
                zmu zmuVar2 = this.bi;
                vox voxVar = this.bf;
                pyt pytVar = this.cs;
                cqkf<zby> cqkfVar2 = this.bc;
                dbsk.s(cqkfVar2);
                cqkf<jar> cqkfVar3 = this.cP;
                cqkf<zew> cqkfVar4 = this.cQ;
                cqkf<zei> cqkfVar5 = this.cS;
                dbsk.s(cqkfVar5);
                Activity activity2 = (Activity) ((dxjd) pvfVar.a).a;
                pvf.a(activity2, 1);
                dxio a15 = ((dxjh) pvfVar.b).a();
                pvf.a(a15, 2);
                dxio a16 = ((dxjh) pvfVar.c).a();
                pvf.a(a16, 3);
                efg a17 = pvfVar.d.a();
                pvf.a(a17, 4);
                qeg a18 = pvfVar.e.a();
                pvf.a(a18, 5);
                dwwr a19 = pvfVar.f.a();
                pvf.a(a19, 6);
                bvjj a20 = pvfVar.g.a();
                pvf.a(a20, 7);
                dehq a21 = pvfVar.h.a();
                pvf.a(a21, 8);
                bzgl a22 = pvfVar.i.a();
                pvf.a(a22, 9);
                pyn a23 = pvfVar.j.a();
                pvf.a(a23, 10);
                pyo a24 = pvfVar.k.a();
                pvf.a(a24, 11);
                wgg a25 = pvfVar.l.a();
                pvf.a(a25, 12);
                cklq a26 = pvfVar.m.a();
                pvf.a(a26, 13);
                ckml a27 = pvfVar.n.a();
                pvf.a(a27, 14);
                cqhu a28 = pvfVar.o.a();
                pvf.a(a28, 15);
                pvf.a(tmyVar2, 16);
                pvf.a(frameLayout2, 17);
                pvf.a(this, 18);
                pvf.a(pvkVar2, 19);
                pvf.a(vnkVar4, 20);
                pvf.a(pxlVar, 21);
                pvf.a(pysVar, 22);
                pvf.a(pswVar, 23);
                pvf.a(pyiVar, 24);
                pvf.a(arlpVar, 25);
                pvf.a(wzzVar, 26);
                pvf.a(zmuVar2, 27);
                pvf.a(pxkVar, 28);
                pvf.a(voxVar, 29);
                pvf.a(pytVar, 30);
                pvf.a(cqkfVar2, 31);
                pvf.a(cqkfVar5, 34);
                try {
                    try {
                        this.da = new pve(activity2, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, tmyVar2, frameLayout2, this, pvkVar2, vnkVar4, pxlVar, pysVar, pswVar, pyiVar, arlpVar, wzzVar, zmuVar2, pxkVar, voxVar, pytVar, cqkfVar2, cqkfVar3, cqkfVar4, cqkfVar5);
                        cqkf<zby> cqkfVar6 = this.bc;
                        dbsk.s(cqkfVar6);
                        cqkfVar6.c().addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: pul
                            private final puy a;

                            {
                                this.a = this;
                            }

                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                                puy puyVar = this.a;
                                if (puyVar.aD) {
                                    View d = cqkx.d(view, vfv.a);
                                    if (d != null) {
                                        view = d;
                                    }
                                    pvk pvkVar3 = puyVar.bh;
                                    dbsk.s(pvkVar3);
                                    zxo j = pvkVar3.j();
                                    j.B = view;
                                    j.I();
                                }
                            }
                        });
                        ptk ptkVar = this.be;
                        Runnable runnable = new Runnable(this) { // from class: ptm
                            private final puy a;

                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.aV();
                            }
                        };
                        gga a29 = ptkVar.a.a();
                        ptk.a(a29, 1);
                        cqkj a30 = ptkVar.b.a();
                        ptk.a(a30, 2);
                        vot a31 = ptkVar.c.a();
                        ptk.a(a31, 3);
                        ptk.a(runnable, 4);
                        this.bd = new ptj(a29, a30, a31, runnable);
                        new pup(this);
                        return null;
                    } catch (Throwable th5) {
                        th = th5;
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            throw th;
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        amsy aS;
        super.ak();
        if ((ci() || this.aT.g() == dqvj.TRANSIT) && (aS = this.aT.aS()) != null) {
            this.ay.a(aS);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.ax.b();
        super.am();
        this.aR.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bA() {
        int d;
        bvjk e;
        akrk c2;
        bvrj.UI_THREAD.c();
        if (!zhe.a(this.aT).isEmpty()) {
            if (this.aT.aO() != vni.CRITICAL_NOTICE) {
                bZ(vni.CRITICAL_NOTICE);
                return;
            }
        } else if (this.aT.aO() == vni.CRITICAL_NOTICE) {
            bZ(vni.NONE);
        }
        vni vniVar = vni.NONE;
        if (this.aT.aO() == vni.NONE) {
            if (this.ci.g(this.aT)) {
                vniVar = vni.LICENSE_PLATE_RESTRICTION;
            } else if (this.cj.q(this.aT.l().a())) {
                vniVar = vni.NAVIGATION_MEDIA;
            } else if (this.ck.g(this.aT)) {
                vniVar = vni.EYES_FREE_MODE;
            } else {
                final amsy aS = this.aT.aS();
                if (aS != null) {
                    amvh d2 = this.aT.d();
                    if (!this.aT.aQ(vni.SHORTCUT)) {
                        vma vmaVar = this.bQ;
                        if (!vmaVar.c.m(bvjk.ag, false)) {
                            String a = vmaVar.d.a(d2);
                            if (a != null) {
                                vvl d3 = vmaVar.d();
                                vvi vviVar = (vvi) Collections.unmodifiableMap(d3.a).get(a);
                                if (vviVar != null && !vviVar.d && vviVar.c >= 3) {
                                    vmaVar.b(d3, vviVar, a);
                                }
                            }
                        }
                        vniVar = vni.SHORTCUT;
                    }
                    if (!this.aT.aQ(vni.OFFLINE)) {
                        amte p = this.aT.l().d().p();
                        vml a2 = this.bR.a();
                        Runnable runnable = new Runnable(this, aS) { // from class: pty
                            private final puy a;
                            private final amsy b;

                            {
                                this.a = this;
                                this.b = aS;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                puy puyVar = this.a;
                                amsy amsyVar = this.b;
                                bvrj.UI_THREAD.c();
                                if (!puyVar.aD) {
                                    return;
                                }
                                synchronized (puyVar.aT) {
                                    if (amsyVar.equals(puyVar.aT.aS()) && puyVar.aT.aO() == vni.NONE && !puyVar.aT.aQ(vni.OFFLINE)) {
                                        puyVar.bZ(vni.OFFLINE);
                                    }
                                }
                            }
                        };
                        if (p != null && (d = a2.d(p)) != 1 && (((e = vml.e(d)) == null || a2.e.s(e, 0) <= 2) && (c2 = a2.c(p)) != null && vml.a(c2.a()))) {
                            deha.q(a2.d.a(c2), new vmi(a2, runnable), dege.a);
                        }
                    }
                }
            }
            bZ(vniVar);
        }
    }

    public final boolean bB() {
        final gen g;
        dndp H = this.aT.H();
        if (H == null) {
            return false;
        }
        yyk yykVar = this.bj;
        amvh c2 = this.aT.c();
        dcdc<amvh> e = this.aT.e();
        dqvj g2 = this.aT.g();
        dwao h = this.aT.h();
        qbs t = this.aT.t();
        dcep<dpjs> ab = this.aT.ab();
        if (H.b) {
            g = axtz.g(yykVar.a, H, new yyl(c2, e, g2, bvrt.b(h), t, ab, ddfv.e, ddfv.d));
        } else if (!H.c) {
            g = H.d ? axua.g(yykVar.a, H, new yyl(c2, e, g2, bvrt.b(h), t, ab, ddfv.g, ddfv.f)) : null;
        } else {
            g = axtx.g(yykVar.a, H, new yyl(c2, e, g2, bvrt.b(h), t, ab, ddfv.c, ddfv.b));
        }
        if (g == null) {
            return false;
        }
        if (H.e.size() > 0) {
            dndl dndlVar = H.e.get(0).b;
            if (dndlVar == null) {
                dndlVar = dndl.d;
            }
            dndr b = dndr.b(dndlVar.b);
            if (b == null) {
                b = dndr.UNKNOWN_ALIAS_TYPE;
            }
            dpjs g3 = amvj.g(b);
            if (amvj.h(g3)) {
                this.aT.aa(g3);
            }
        }
        cp(new Runnable(this, g) { // from class: ptz
            private final puy a;
            private final gen b;

            {
                this.a = this;
                this.b = g;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b.aJ(this.a.J());
            }
        });
        return true;
    }

    public final boolean bC() {
        vyb.Z(this.aT.l().d().w(J()));
        return false;
    }

    public final void bD(amqp amqpVar) {
        int i = amqpVar.a;
        if (i == 3) {
            this.aU = false;
            if (!bE()) {
                return;
            }
            this.aW = true;
        } else if (i != 2 || this.bX.d()) {
            this.aV = true;
        } else {
            this.aU = false;
            aT();
        }
    }

    public final boolean bE() {
        synchronized (this.aT) {
            for (int i = 0; i < this.aT.aw().size(); i++) {
                if (this.aT.aw().get(i).k()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void bF(@dzsi dspd dspdVar, @dzsi dspd dspdVar2, boolean z) {
        prx prxVar;
        if (this.g.n && ci() && (prxVar = this.d) != null) {
            prxVar.e(dspdVar, dspdVar2, z);
        }
    }

    final void bG(boolean z) {
        vnu l = this.aT.l();
        gek gekVar = this.bg;
        dbsk.s(gekVar);
        bH(z, l, gekVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a4, code lost:
        if (r7 != defpackage.dqvj.DRIVE) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bH(boolean r12, defpackage.vnu r13, @defpackage.dzsi defpackage.jjn r14) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.bH(boolean, vnu, jjn):void");
    }

    @Override // defpackage.aueo
    public final Uri bI() {
        Uri build;
        synchronized (this.aT) {
            dqvj g = this.aT.g();
            amvh c2 = this.aT.c();
            amvh[] amvhVarArr = (amvh[]) this.aT.e().toArray(new amvh[0]);
            dbsk.s(amvhVarArr);
            int length = amvhVarArr.length;
            dbsk.a(length > 0);
            int i = 0;
            while (true) {
                if (i < length) {
                    amvh amvhVar = amvhVarArr[i];
                    if (amvhVar.c == null && !amvhVar.n()) {
                        build = null;
                        break;
                    }
                    i++;
                } else {
                    Uri.Builder path = new Uri.Builder().scheme("http").authority("maps.google.com").path("/");
                    ArrayList arrayList = new ArrayList(amvhVarArr.length);
                    for (amvh amvhVar2 : amvhVarArr) {
                        if (amvhVar2.l()) {
                            arrayList.add(amvhVar2.c);
                        } else if (amvhVar2.n()) {
                            arrayList.add(afhd.a(amvhVar2.e));
                        }
                    }
                    path.appendQueryParameter("daddr", dbrz.e(" to:").g(arrayList));
                    if (c2 != null) {
                        if (c2.k()) {
                            path.appendQueryParameter("myl", "saddr");
                        } else if (c2.l()) {
                            path.appendQueryParameter("saddr", c2.c);
                        } else if (c2.n()) {
                            path.appendQueryParameter("saddr", afhd.a(c2.e));
                        }
                    }
                    path.appendQueryParameter("dirflg", afhi.i(g));
                    build = path.build();
                }
            }
        }
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bJ() {
        if (this.bd != null) {
            jjn L = this.bn.l().L();
            boolean z = bK().f;
            int i = this.cE;
            boolean z2 = true;
            boolean z3 = (i == 0 || i + (-1) == 0) ? false : true;
            this.bd.a.g();
            ptj ptjVar = this.bd;
            if (L != jjn.EXPANDED && ((!z && L == jjn.FULLY_EXPANDED) || z3)) {
                z2 = false;
            }
            ptjVar.b.b(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final btpf bK() {
        return btpf.c(J());
    }

    @dzsi
    public final amte bL() {
        return this.aT.l().d().p();
    }

    @Override // defpackage.qbi
    public final boolean bM() {
        return vxx.e(this.aT.g()) && (this.aT.aE() != -1 || this.aT.aF());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bN(cjtg cjtgVar) {
        this.aG = this.aH.e(this.al.r(cjtgVar), cjtgVar);
    }

    @Override // defpackage.qbq
    public final void bO(int i, @dzsi dnqh dnqhVar) {
        bP(i, dnqhVar, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bP(int i, @dzsi dnqh dnqhVar, @dzsi dnqh dnqhVar2, @dzsi Runnable runnable) {
        if (this.d != null) {
            bS(i, dnqhVar, dnqhVar2, runnable);
        } else {
            bQ(i, dnqhVar, dnqhVar2, runnable);
        }
    }

    final void bQ(int i, @dzsi dnqh dnqhVar, @dzsi dnqh dnqhVar2, @dzsi Runnable runnable) {
        this.cD = i;
        this.cG = dnqhVar;
        this.cH = dnqhVar2;
        this.cI = runnable;
    }

    public final void bR(int i, @dzsi dnqh dnqhVar) {
        if (i == 13 || i == 4) {
            this.bv.a().f();
            dvum by = by();
            if (by == null) {
                return;
            }
            bvrb bvrbVar = this.ag;
            puv puvVar = new puv(this, by, dnqhVar);
            bvrj bvrjVar = bvrj.UI_THREAD;
            dqvj dqvjVar = dqvj.DRIVE;
            qbs qbsVar = qbs.DEFAULT;
            int ordinal = by.ordinal();
            bvrbVar.a(puvVar, bvrjVar, (ordinal == 14 || ordinal == 32 || ordinal == 38) ? this.f.getSurveyParameters().b : 0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0144 A[Catch: all -> 0x0018, TryCatch #1 {, blocks: (B:3:0x0004, B:4:0x0006, B:7:0x000d, B:13:0x0023, B:26:0x0062, B:28:0x006c, B:32:0x0077, B:34:0x0081, B:36:0x0087, B:37:0x00a4, B:21:0x0041, B:22:0x0049, B:23:0x0051, B:24:0x0059, B:38:0x00a7, B:40:0x00ab, B:43:0x00b2, B:45:0x00c6, B:47:0x00cd, B:55:0x00e4, B:58:0x00f2, B:61:0x010c, B:63:0x011e, B:69:0x0140, B:71:0x0144, B:75:0x014c, B:77:0x0158, B:80:0x015f, B:81:0x0162, B:82:0x0165, B:64:0x0126, B:65:0x0133, B:67:0x0137, B:48:0x00d3), top: B:90:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void bS(int r18, @defpackage.dzsi defpackage.dnqh r19, @defpackage.dzsi defpackage.dnqh r20, @defpackage.dzsi java.lang.Runnable r21) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.bS(int, dnqh, dnqh, java.lang.Runnable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r8 <= 1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int bT(int r11, @defpackage.dzsi defpackage.dnqh r12, @defpackage.dzsi defpackage.dnqh r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.bT(int, dnqh, dnqh):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2 A[Catch: all -> 0x03ef, TryCatch #1 {, blocks: (B:15:0x0040, B:17:0x005b, B:19:0x0069, B:33:0x0098, B:35:0x00c2, B:37:0x00d6, B:39:0x00ed, B:41:0x00f8, B:61:0x013f, B:63:0x014d, B:64:0x0159, B:42:0x00fb, B:44:0x0103, B:46:0x010d, B:49:0x011e, B:50:0x0121, B:51:0x0124, B:53:0x012a, B:56:0x0132, B:38:0x00e2, B:22:0x0071, B:25:0x007d, B:27:0x0085, B:29:0x008d), top: B:203:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[Catch: all -> 0x03ef, TryCatch #1 {, blocks: (B:15:0x0040, B:17:0x005b, B:19:0x0069, B:33:0x0098, B:35:0x00c2, B:37:0x00d6, B:39:0x00ed, B:41:0x00f8, B:61:0x013f, B:63:0x014d, B:64:0x0159, B:42:0x00fb, B:44:0x0103, B:46:0x010d, B:49:0x011e, B:50:0x0121, B:51:0x0124, B:53:0x012a, B:56:0x0132, B:38:0x00e2, B:22:0x0071, B:25:0x007d, B:27:0x0085, B:29:0x008d), top: B:203:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8 A[Catch: all -> 0x03ef, TryCatch #1 {, blocks: (B:15:0x0040, B:17:0x005b, B:19:0x0069, B:33:0x0098, B:35:0x00c2, B:37:0x00d6, B:39:0x00ed, B:41:0x00f8, B:61:0x013f, B:63:0x014d, B:64:0x0159, B:42:0x00fb, B:44:0x0103, B:46:0x010d, B:49:0x011e, B:50:0x0121, B:51:0x0124, B:53:0x012a, B:56:0x0132, B:38:0x00e2, B:22:0x0071, B:25:0x007d, B:27:0x0085, B:29:0x008d), top: B:203:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb A[Catch: all -> 0x03ef, TryCatch #1 {, blocks: (B:15:0x0040, B:17:0x005b, B:19:0x0069, B:33:0x0098, B:35:0x00c2, B:37:0x00d6, B:39:0x00ed, B:41:0x00f8, B:61:0x013f, B:63:0x014d, B:64:0x0159, B:42:0x00fb, B:44:0x0103, B:46:0x010d, B:49:0x011e, B:50:0x0121, B:51:0x0124, B:53:0x012a, B:56:0x0132, B:38:0x00e2, B:22:0x0071, B:25:0x007d, B:27:0x0085, B:29:0x008d), top: B:203:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bU(int r20, @defpackage.dzsi defpackage.jjn r21, boolean r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.bU(int, jjn, boolean, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final qif bV() {
        return this.ao.a().e().k();
    }

    @Override // defpackage.qbi
    public final void bW(@dzsi amvh amvhVar) {
        bvrj.UI_THREAD.c();
        if (amvhVar == null) {
            bvoo.h("Received a null Waypoint for directions.", new Object[0]);
            return;
        }
        synchronized (this.aT) {
            int aH = this.aT.aH();
            if (aH >= 0 && aH < this.aT.aw().size()) {
                this.aT.B(amvhVar, aH);
                bO(7, null);
                return;
            }
            bvoo.h("Invalid landmark target waypoint index %d, waypoint list size is %d", Integer.valueOf(aH), Integer.valueOf(this.aT.aw().size()));
        }
    }

    @Override // defpackage.tmw
    public final void bX(dcdc<amvh> dcdcVar, dwao dwaoVar) {
        cb();
        synchronized (this.aT) {
            this.aT.J(dcdcVar);
            this.aT.R(dwaoVar);
            bO(12, null);
        }
        if (!super.bg()) {
            gfq.k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void bY(int i, boolean z, boolean z2) {
        jjn jjnVar;
        synchronized (this.aT) {
            vnu l = this.aT.l();
            if (l.a() != dqvj.TRANSIT) {
                return;
            }
            vwn z3 = l.d().z(0, Integer.valueOf(i));
            vnk vnkVar = this.aT;
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            vnkVar.m(l.j(ggaVar, z3));
            if (z) {
                return;
            }
            btpf bK = bK();
            if (!bK.f || !bK.e) {
                jjnVar = jjn.COLLAPSED;
            } else {
                jjnVar = jjn.FULLY_EXPANDED;
            }
            if (!z2 || this.bn.l().L() == jjnVar) {
                bG(true);
            } else {
                this.bn.B(jjnVar);
            }
        }
    }

    public final void bZ(vni vniVar) {
        bvrj.UI_THREAD.c();
        if (this.aT.aO() != vniVar) {
            this.aT.aP(vniVar);
            if (!this.aD || this.aY) {
                return;
            }
            bU(12, null, false, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean bn() {
        vnk vnkVar = this.aX;
        if (vnkVar != null) {
            cd(vnkVar);
            this.aX = null;
            return true;
        }
        return false;
    }

    public final void bo() {
        djiq aT = this.aT.aT();
        if (aT != null) {
            this.ax.a(aT);
        }
        gek gekVar = this.bg;
        dbsk.s(gekVar);
        bU(12, gekVar.c, true, false, true);
    }

    public final boolean bp() {
        gga ggaVar = this.aE;
        if (this.aD && super.bg() && ggaVar != null) {
            amub aU = this.aT.aU(ggaVar);
            amte p = this.aT.l().d().p();
            if (aU != null && p != null && cj(ggaVar, aU.c, p)) {
                bx(ggaVar, aU.c);
                return true;
            }
        }
        return false;
    }

    public final void bq() {
        if (this.by == null || this.cP == null) {
            return;
        }
        qbr qbrVar = this.by;
        dbsk.s(qbrVar);
        vnk vnkVar = this.aT;
        Activity activity = (Activity) ((dxjd) this.cq.a().a).a;
        znk.a(activity, 1);
        znk.a(qbrVar, 2);
        znk.a(vnkVar, 3);
        znk.a(this, 4);
        znj znjVar = new znj(activity, qbrVar, vnkVar, this);
        cqkf<jar> cqkfVar = this.cP;
        dbsk.s(cqkfVar);
        cqkfVar.e(znjVar);
    }

    public final void br() {
        final ff J = J();
        if (!this.as.a() || this.cQ == null || J == null) {
            return;
        }
        byym byymVar = this.cd;
        dbty dbtyVar = new dbty(this, J) { // from class: ptn
            private final puy a;
            private final Activity b;

            {
                this.a = this;
                this.b = J;
            }

            @Override // defpackage.dbty
            public final Object a() {
                puy puyVar = this.a;
                return dbsg.j(puyVar.aT.aU(this.b));
            }
        };
        Activity activity = (Activity) ((dxjd) this.cr.a().a).a;
        zpl.a(activity, 1);
        zpl.a(byymVar, 2);
        zpl.a(dbtyVar, 3);
        zpk zpkVar = new zpk(activity, byymVar, dbtyVar);
        cqkf<zew> cqkfVar = this.cQ;
        dbsk.s(cqkfVar);
        cqkfVar.e(zpkVar);
    }

    public final boolean bs() {
        if (!super.bg()) {
            return false;
        }
        synchronized (this.aT) {
            amsy aS = this.aT.aS();
            qbs t = this.aT.t();
            dqvj g = this.aT.g();
            if (t != qbs.DEFAULT && aS != null && aS.n() != 0 && aS.t()) {
                int e = this.aT.l().d().e();
                dvum dvumVar = dvum.NEVER;
                dqvj dqvjVar = dqvj.DRIVE;
                int ordinal = t.ordinal();
                if (ordinal == 1) {
                    this.bB.a(e);
                    return true;
                } else if (ordinal == 2) {
                    if (g != dqvj.TRANSIT || this.cE == 1) {
                        return false;
                    }
                    this.bB.b(e);
                    return true;
                } else if (ordinal != 3 || g != dqvj.TRANSIT) {
                    return false;
                } else {
                    this.bB.a(e);
                    return true;
                }
            }
            return false;
        }
    }

    public final void bt() {
        bvrj.BACKGROUND_THREADPOOL.c();
        if (!this.aT.G()) {
            return;
        }
        this.aT.bv((List) deha.s(this.bp.m()));
        if (!this.aT.G()) {
            cp(new Runnable(this) { // from class: ptp
                private final puy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.bO(16, null);
                }
            });
        } else {
            cp(new Runnable(this) { // from class: ptq
                private final puy a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.bB();
                }
            });
        }
    }

    public final void bu() {
        if (this.ct.c()) {
            this.cd.d(new bzgf(this) { // from class: ptx
                private final puy a;

                {
                    this.a = this;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    this.a.bw(false);
                }
            }, this.ct, this.ah);
        }
    }

    public final void bw(boolean z) {
        synchronized (this.aT) {
            vnu l = this.aT.l();
            if (l.a() == dqvj.TRANSIT && this.cd != null && J() != null) {
                bzdk c2 = this.cd.c();
                int q = c2.g().q();
                boolean bv = bv(l.d().w(J()), c2);
                bq();
                br();
                if (this.aT.bc() != null) {
                    return;
                }
                if (bv && q != -1) {
                    this.aT.bk(false);
                    Integer f = l.d().f();
                    Integer g = l.d().g();
                    boolean z2 = true;
                    boolean z3 = f == null && g == null;
                    if (f == null || g == null || f.intValue() != 0 || q == this.cT || g.intValue() == q) {
                        z2 = false;
                    }
                    if (z3 || z2) {
                        this.cT = q;
                        bY(q, z, false);
                    }
                }
            }
        }
    }

    @Override // defpackage.pyp
    public final void bx(Activity activity, int i) {
        amte p = this.aT.l().d().p();
        if (p == null) {
            return;
        }
        if (cj(activity, i, p)) {
            this.bk.a();
            this.aQ.a(ckls.DIRECTIONS_START_NAVIGATION_CLICKED);
            this.bu.a().a(p, i, asca.DIRECTIONS, false);
            return;
        }
        this.av.a().a(this.aj, p, i, 0);
    }

    @dzsi
    public final dvum by() {
        dqvj g = this.aT.g();
        dvum dvumVar = dvum.NEVER;
        dqvj dqvjVar = dqvj.DRIVE;
        qbs qbsVar = qbs.DEFAULT;
        int ordinal = g.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return dvum.DIRECTIONS_CYCLING;
            }
            if (ordinal == 2) {
                return dvum.DIRECTIONS_WALKING;
            }
            if (ordinal != 3) {
                if (ordinal == 5) {
                    return dvum.DIRECTIONS_TWO_WHEELER;
                }
                return null;
            }
            int ordinal2 = this.aT.t().ordinal();
            if (ordinal2 == 0) {
                return dvum.DIRECTIONS_TRANSIT_RESULTS;
            }
            if (ordinal2 != 2) {
                return null;
            }
            Context H = H();
            return (H == null || !this.aT.bl(H)) ? dvum.TRANSIT_DIRECTIONS_DETAILS : dvum.DIRECTIONS_PARK_AND_RIDE_RESULTS;
        }
        return dvum.DIRECTIONS_DRIVING;
    }

    public final boolean bz() {
        return this.aT.bn();
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        return this.cN.g(dthbVar);
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        return cl(false);
    }

    public final void i() {
        prx prxVar;
        if (!this.aD || (prxVar = this.d) == null) {
            return;
        }
        prxVar.j();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        ckcv ckcvVar;
        puy puyVar;
        ckcv e = this.az.e();
        try {
            super.l(bundle);
            if (bundle != null && bundle.containsKey("snapshotState")) {
                try {
                    this.aX = (vnk) this.aj.d(vnk.class, bundle, "snapshotState");
                } catch (IOException e2) {
                    bvoo.f(new IllegalStateException(e2));
                }
            }
            this.cN = this.bz.a(this);
            try {
                if (!cf(bundle)) {
                    cf(this.o);
                }
                zif zifVar = this.bE;
                Runnable runnable = new Runnable(this) { // from class: pug
                    private final puy a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        puy puyVar2 = this.a;
                        puyVar2.aT.aR();
                        puyVar2.bZ(vni.NONE);
                    }
                };
                vwv a = zifVar.a.a();
                zif.a(a, 1);
                bvjj a2 = zifVar.b.a();
                zif.a(a2, 2);
                dxio a3 = ((dxjh) zifVar.c).a();
                zif.a(a3, 3);
                cjqq a4 = zifVar.d.a();
                zif.a(a4, 4);
                dxio a5 = ((dxjh) zifVar.e).a();
                zif.a(a5, 5);
                zik a6 = zifVar.f.a();
                zif.a(a6, 6);
                zln a7 = zifVar.g.a();
                zif.a(a7, 7);
                zgh a8 = zifVar.h.a();
                zif.a(a8, 8);
                zkk a9 = zifVar.i.a();
                zif.a(a9, 9);
                zhe a10 = zifVar.j.a();
                zif.a(a10, 10);
                arrf a11 = zifVar.k.a();
                zif.a(a11, 11);
                arri a12 = zifVar.l.a();
                zif.a(a12, 12);
                Activity activity = (Activity) ((dxjd) zifVar.m).a;
                zif.a(activity, 13);
                zif.a(runnable, 14);
                zif.a(this, 15);
                try {
                    try {
                        this.cJ = new zie(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, activity, runnable, this);
                        if (bundle == null || !bundle.containsKey("drections_start_page_query_form_view_model")) {
                            zjm zjmVar = new zjm();
                            this.bb = zjmVar;
                            zjmVar.x(this.co, this.cn, J(), this.aT, this.cJ, cq());
                        } else {
                            zjm zjmVar2 = (zjm) bundle.getSerializable("drections_start_page_query_form_view_model");
                            this.bb = zjmVar2;
                            zjmVar2.x(this.co, this.cn, J(), this.aT, this.cJ, cq());
                        }
                        this.bb.A(new Runnable(this) { // from class: puh
                            private final puy a;

                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.aV();
                            }
                        });
                        this.bb.B(new Runnable(this) { // from class: pui
                            private final puy a;

                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                puy puyVar2 = this.a;
                                if (puyVar2.aD) {
                                    puyVar2.al.r(puyVar2.cs.b());
                                }
                            }
                        });
                        this.bb.K(new cqfc(this) { // from class: puj
                            private final puy a;

                            {
                                this.a = this;
                            }

                            @Override // defpackage.cqfc
                            public final void a(View view, boolean z) {
                                cqkf<zby> cqkfVar;
                                puy puyVar2 = this.a;
                                Parcelable parcelable = puyVar2.ba;
                                if (parcelable == null || (cqkfVar = puyVar2.bc) == null) {
                                    return;
                                }
                                RecyclerView e3 = vfv.e(cqkfVar.c());
                                if (e3 != null) {
                                    e3.l.C(parcelable);
                                }
                                puyVar2.ba = null;
                            }
                        });
                        if (bundle == null || !bundle.containsKey("ue3_page_container")) {
                            this.cs = new pyt(aP(), this.bb);
                        } else {
                            pyt pytVar = (pyt) bundle.getSerializable("ue3_page_container");
                            this.cs = pytVar;
                            pytVar.a(aP(), this.bb);
                        }
                        if (bundle != null && bundle.containsKey("logged_lmm_counterfactual")) {
                            this.cL = bundle.getBoolean("logged_lmm_counterfactual");
                        }
                        if (bundle != null && bundle.containsKey("saved_edit_mode_query_form_state")) {
                            this.ba = bundle.getParcelable("saved_edit_mode_query_form_state");
                        }
                        psn psnVar = new psn(J(), this, this.aT);
                        psl pslVar = this.bl;
                        psl.a(psnVar, 1);
                        psl.a(this, 2);
                        Activity activity2 = (Activity) ((dxjd) pslVar.a).a;
                        psl.a(activity2, 3);
                        btrm a13 = pslVar.b.a();
                        psl.a(a13, 4);
                        btvo a14 = pslVar.c.a();
                        psl.a(a14, 5);
                        dxio a15 = ((dxjh) pslVar.d).a();
                        psl.a(a15, 6);
                        dxio a16 = ((dxjh) pslVar.e).a();
                        psl.a(a16, 7);
                        akox a17 = pslVar.f.a();
                        psl.a(a17, 8);
                        dzsj<srv> dzsjVar = pslVar.g;
                        pso a18 = pslVar.h.a();
                        psl.a(a18, 10);
                        this.bm = new psk(psnVar, this, activity2, a13, a14, a15, a16, a17, dzsjVar, a18);
                        this.bg = new gek(J(), this, this.bn);
                        pyr pyrVar = this.bA;
                        vnk vnkVar = this.aT;
                        jkf jkfVar = this.bn;
                        Activity activity3 = (Activity) ((dxjd) pyrVar.a).a;
                        pyr.a(activity3, 1);
                        wuw a19 = pyrVar.b.a();
                        pyr.a(a19, 2);
                        pyr.a(pyrVar.c.a(), 3);
                        bvjj a20 = pyrVar.d.a();
                        pyr.a(a20, 4);
                        dxio a21 = ((dxjh) pyrVar.e).a();
                        pyr.a(a21, 5);
                        btwd a22 = pyrVar.f.a();
                        pyr.a(a22, 6);
                        tnv a23 = pyrVar.g.a();
                        pyr.a(a23, 7);
                        pyr.a(vnkVar, 8);
                        pyr.a(jkfVar, 9);
                        pyr.a(this, 10);
                        pyq pyqVar = new pyq(activity3, a19, a20, a21, a22, a23, vnkVar, jkfVar, this);
                        this.bB = pyqVar;
                        pse pseVar = this.bD;
                        gek gekVar = this.bg;
                        vnk vnkVar2 = this.aT;
                        jkf jkfVar2 = this.bn;
                        vox voxVar = this.bf;
                        bzcm a24 = this.au.a();
                        ptc a25 = pseVar.a.a();
                        pse.a(a25, 1);
                        vwv a26 = pseVar.b.a();
                        pse.a(a26, 2);
                        vwo a27 = pseVar.c.a();
                        pse.a(a27, 3);
                        pse.a(gekVar, 4);
                        pse.a(this, 5);
                        pse.a(vnkVar2, 6);
                        pse.a(jkfVar2, 7);
                        pse.a(voxVar, 8);
                        pse.a(pyqVar, 9);
                        pse.a(a24, 10);
                        psd psdVar = new psd(a25, a26, a27, gekVar, this, vnkVar2, jkfVar2, voxVar, pyqVar, a24);
                        this.cB = psdVar;
                        zmv zmvVar = this.ch;
                        ahjq a28 = zmvVar.a.a();
                        zmv.a(a28, 1);
                        bvjj a29 = zmvVar.b.a();
                        zmv.a(a29, 2);
                        bzgl a30 = zmvVar.c.a();
                        zmv.a(a30, 3);
                        qho a31 = zmvVar.d.a();
                        zmv.a(a31, 4);
                        qfv a32 = zmvVar.e.a();
                        zmv.a(a32, 5);
                        qfw a33 = zmvVar.f.a();
                        zmv.a(a33, 6);
                        gga a34 = zmvVar.g.a();
                        zmv.a(a34, 7);
                        btvo a35 = zmvVar.h.a();
                        zmv.a(a35, 8);
                        btpc a36 = zmvVar.i.a();
                        zmv.a(a36, 9);
                        vwv a37 = zmvVar.j.a();
                        zmv.a(a37, 10);
                        byyp a38 = zmvVar.k.a();
                        zmv.a(a38, 11);
                        cqat a39 = zmvVar.l.a();
                        zmv.a(a39, 12);
                        cqhn a40 = zmvVar.m.a();
                        zmv.a(a40, 13);
                        byzi a41 = zmvVar.n.a();
                        zmv.a(a41, 14);
                        ahvo a42 = zmvVar.o.a();
                        zmv.a(a42, 15);
                        dxio a43 = ((dxjh) zmvVar.p).a();
                        zmv.a(a43, 16);
                        zgz a44 = zmvVar.q.a();
                        zmv.a(a44, 17);
                        Executor a45 = zmvVar.r.a();
                        zmv.a(a45, 18);
                        gdc a46 = zmvVar.s.a();
                        zmv.a(a46, 19);
                        dxio a47 = ((dxjh) zmvVar.t).a();
                        zmv.a(a47, 20);
                        dxio a48 = ((dxjh) zmvVar.u).a();
                        zmv.a(a48, 21);
                        dxio a49 = ((dxjh) zmvVar.v).a();
                        zmv.a(a49, 22);
                        dbsg<arkb> a50 = zmvVar.w.a();
                        zmv.a(a50, 23);
                        dxio a51 = ((dxjh) zmvVar.x).a();
                        zmv.a(a51, 24);
                        qbv a52 = zmvVar.y.a();
                        zmv.a(a52, 25);
                        cfpe a53 = zmvVar.z.a();
                        zmv.a(a53, 27);
                        cjck a54 = zmvVar.A.a();
                        zmv.a(a54, 28);
                        wgh a55 = zmvVar.B.a();
                        zmv.a(a55, 29);
                        whs a56 = zmvVar.C.a();
                        zmv.a(a56, 30);
                        wih a57 = zmvVar.D.a();
                        zmv.a(a57, 31);
                        whm a58 = zmvVar.E.a();
                        zmv.a(a58, 32);
                        qbt a59 = zmvVar.F.a();
                        zmv.a(a59, 33);
                        akfa a60 = zmvVar.G.a();
                        zmv.a(a60, 34);
                        ania a61 = zmvVar.H.a();
                        zmv.a(a61, 35);
                        puyVar = this;
                        try {
                            puyVar.bi = new zmu(a28, a29, a30, a31, a32, a33, a34, a35, a36, a37, a38, a39, a40, a41, a42, a43, a44, a45, a46, a47, a48, a49, a50, a51, a52, psdVar, a53, a54, a55, a56, a57, a58, a59, a60, a61);
                            e.a((ckcr) puyVar.az.a(ckeq.v));
                        } catch (Throwable th) {
                            th = th;
                            ckcvVar = e;
                            try {
                                dbue.b(th);
                                throw new RuntimeException(th);
                            } catch (Throwable th2) {
                                ckcvVar.a((ckcr) puyVar.az.a(ckeq.v));
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        puyVar = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    puyVar = this;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            ckcvVar = e;
            puyVar = this;
            dbue.b(th);
            throw new RuntimeException(th);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gek gekVar = this.bg;
        dbsk.s(gekVar);
        bU(12, gekVar.c, this.aT.ah(), false, false);
        zjm zjmVar = this.bb;
        if (zjmVar != null) {
            zjmVar.O();
        }
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        pyt pytVar = this.cs;
        cjtg b = pytVar == null ? null : pytVar.b();
        return (b == null || b == aP()) ? dtxn.cl : b.a();
    }

    @Override // defpackage.tmw
    public final void q(wtf wtfVar) {
        cb();
        synchronized (this.aT) {
            ca(wtfVar);
        }
        if (!super.bg()) {
            gfq.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0640 A[Catch: all -> 0x022f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x022f, blocks: (B:18:0x021d, B:25:0x0251, B:27:0x026f, B:29:0x0275, B:31:0x028c, B:33:0x029c, B:36:0x02a2, B:38:0x02a8, B:40:0x02ae, B:41:0x02ba, B:44:0x02d8, B:51:0x0321, B:57:0x0400, B:59:0x0429, B:60:0x0432, B:62:0x0436, B:63:0x043b, B:65:0x0443, B:100:0x0548, B:103:0x0597, B:112:0x05e6, B:114:0x05ec, B:126:0x0640, B:143:0x06cf, B:146:0x06eb, B:150:0x06fd, B:132:0x0671, B:108:0x05c8), top: B:189:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06cf A[Catch: all -> 0x022f, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x022f, blocks: (B:18:0x021d, B:25:0x0251, B:27:0x026f, B:29:0x0275, B:31:0x028c, B:33:0x029c, B:36:0x02a2, B:38:0x02a8, B:40:0x02ae, B:41:0x02ba, B:44:0x02d8, B:51:0x0321, B:57:0x0400, B:59:0x0429, B:60:0x0432, B:62:0x0436, B:63:0x043b, B:65:0x0443, B:100:0x0548, B:103:0x0597, B:112:0x05e6, B:114:0x05ec, B:126:0x0640, B:143:0x06cf, B:146:0x06eb, B:150:0x06fd, B:132:0x0671, B:108:0x05c8), top: B:189:0x021d }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06eb A[Catch: all -> 0x022f, TRY_ENTER, TryCatch #8 {all -> 0x022f, blocks: (B:18:0x021d, B:25:0x0251, B:27:0x026f, B:29:0x0275, B:31:0x028c, B:33:0x029c, B:36:0x02a2, B:38:0x02a8, B:40:0x02ae, B:41:0x02ba, B:44:0x02d8, B:51:0x0321, B:57:0x0400, B:59:0x0429, B:60:0x0432, B:62:0x0436, B:63:0x043b, B:65:0x0443, B:100:0x0548, B:103:0x0597, B:112:0x05e6, B:114:0x05ec, B:126:0x0640, B:143:0x06cf, B:146:0x06eb, B:150:0x06fd, B:132:0x0671, B:108:0x05c8), top: B:189:0x021d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0743 -> B:156:0x073e). Please submit an issue!!! */
    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.s():void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        vnk vnkVar = this.aX;
        if (vnkVar != null) {
            this.aj.c(bundle, "snapshotState", vnkVar);
        }
        this.aj.c(bundle, "directions_start_page_state", this.aT);
        this.aj.c(bundle, "directions_start_page_odelay_state", this.cN.c);
        bundle.putBoolean("logged_lmm_counterfactual", this.cL);
        zjm zjmVar = this.bb;
        if (zjmVar != null) {
            zjmVar.n().F();
            bundle.putSerializable("drections_start_page_query_form_view_model", this.bb);
        }
        pyt pytVar = this.cs;
        if (pytVar != null) {
            bundle.putSerializable("ue3_page_container", pytVar);
        }
        Parcelable parcelable = this.ba;
        if (parcelable != null) {
            bundle.putParcelable("saved_edit_mode_query_form_state", parcelable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0169  */
    @Override // defpackage.gew, defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puy.u():void");
    }
}
