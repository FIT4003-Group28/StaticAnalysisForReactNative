package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import com.google.android.gms.udc.UdcCacheResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdyb  reason: default package */
/* loaded from: classes3.dex */
public final class bdyb extends ges implements aueo, bwrr, brae, befx, gfn, gfw {
    public static final /* synthetic */ int cg = 0;
    private static final dcqe ch = dcqe.c("bdyb");
    private static final dspd ci;
    private static final dcdn<dkee, cklr> cj;
    public cztz a;
    public dxio<imb> aA;
    public dxio<begg> aB;
    public dxio<bego> aC;
    public dxio<bkfe> aO;
    public dxio<ixr> aP;
    public dxio<brba> aQ;
    public dxio<bzmm> aR;
    public akfa aS;
    public akox aT;
    public akwu aU;
    public alhv aV;
    public gll aW;
    public bhat aX;
    public bgql aY;
    public dbsg<drn> aZ;
    public ckcw ad;
    public btvo ae;
    public ivt af;
    public arab ag;
    public gfq ah;
    public btrm ai;
    public bwqv aj;
    public bwqv ak;
    public aehr al;
    public bfsh am;
    public aeht an;
    public aeop ao;
    public alsq ap;
    public cklq aq;
    public dxio<cqhu> ar;
    public dxio<gcr> as;
    public dxio<abfa> at;
    public dxio<akzh> au;
    public dxio<aesb> av;
    public dxio<afwp> aw;
    public dxio<anbj> ax;
    public dxio<auen> ay;
    public dxio<dbsg<gli>> az;
    public Activity b;
    public ania bA;
    public cqkj bB;
    public bmon bC;
    public Executor bD;
    public bdyp bE;
    @dzsi
    public bdyd bF;
    @dzsi
    aaae bG;
    public begl bH;
    public vox bI;
    public boolean bM;
    brbw bN;
    gek bO;
    public bwrs<ilo> bP;
    @dzsi
    public ilo bQ;
    bnjo bR;
    @dzsi
    bwrs<? extends iqw> bS;
    @dzsi
    bwrs<brln> bT;
    @dzsi
    bwrs<amte> bU;
    public bwrs<amte> bV;
    boolean bW;
    @dzsi
    public alad bX;
    @dzsi
    bdxz bZ;
    public bvvq ba;
    public bdye bb;
    public iqs bc;
    public hwe bd;
    public bgqo be;
    public bdyl bf;
    public bkat bg;
    public bdyn bh;
    public ckml bi;
    public ckmm bj;
    public dzsj<vox> bk;
    public bdyr bl;
    public brbx bm;
    public bdyv bn;
    public braw bo;
    public brmt bp;
    public bwft bq;
    public jkf br;
    public ckmu bs;
    public bxbe bt;
    public bkgz bu;
    public aaaf bv;
    public bvrb bw;
    public cjmt bx;
    public bzqc by;
    public efg bz;
    public acyp c;
    @dzsi
    public btlu cc;
    public bdwl cd;
    public aehb cf;
    @dzsi
    private akqq ck;
    private boolean cl;
    private boolean cm;
    private boolean cn;
    @dzsi
    private bkfd cp;
    private bxbd cq;
    private boolean cr;
    private crzp<btlu> cu;
    public abfn d;
    public bnir e;
    public cjyb f;
    public acwt g;
    private boolean co = false;
    boolean bJ = false;
    public boolean bK = false;
    public boolean bL = false;
    private final brbo cy = new brbo();
    private boolean cs = false;
    private cjxx ct = new cjya();
    final alsp bY = new bdxp(this);
    final aehy ca = new bdxq(this);
    private final alht cv = new bdxr(this);
    final bdxs ce = new bdxs(this);
    private final DialogInterface.OnDismissListener cw = new bdxt(this);
    final View.OnClickListener cb = new bdxu(this);
    private final jkh cx = new bdxv(this);

    static {
        djmu bZ = djmv.c.bZ();
        djob bZ2 = djoe.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djoe djoeVar = (djoe) bZ2.b;
        djoeVar.b = 2;
        djoeVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djmv djmvVar = (djmv) bZ.b;
        djoe bK = bZ2.bK();
        bK.getClass();
        djmvVar.b = bK;
        djmvVar.a = 12;
        ci = bZ.bK().bR();
        dcdg p = dcdn.p();
        p.f(dkee.CHAIN, cklr.CHAIN);
        p.f(dkee.COMMODITY, cklr.COMMODITY);
        p.f(dkee.DINING, cklr.DINING);
        p.f(dkee.GAS_STATION, cklr.GAS_STATION);
        p.f(dkee.HOTEL, cklr.HOTEL);
        p.f(dkee.HOTEL_CHAIN, cklr.HOTEL_CHAIN);
        p.f(dkee.LEAN, cklr.LEAN_RESULT);
        p.f(dkee.PARKING, cklr.PARKING);
        p.f(dkee.RICH, cklr.RICH_RESULT);
        p.f(dkee.SHOPPING, cklr.SHOPPING);
        p.f(dkee.TRANSIT, cklr.TRANSIT);
        cj = p.b();
    }

    public static dvzd bM(btvo btvoVar) {
        dvyz bZ = dvzd.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar = (dvzd) bZ.b;
        dvzdVar.b = 1;
        dvzdVar.a = 1 | dvzdVar.a;
        dkiy enableFeatureParameters = btvoVar.getEnableFeatureParameters();
        boolean booleanValue = enableFeatureParameters.e == 328 ? ((Boolean) enableFeatureParameters.f).booleanValue() : false;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar2 = (dvzd) bZ.b;
        dvzdVar2.a |= 2;
        dvzdVar2.c = booleanValue;
        int s = btvoVar.getPlaceSheetParameters().s();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvzd dvzdVar3 = (dvzd) bZ.b;
        dvzdVar3.a |= 4;
        dvzdVar3.d = s;
        return bZ.bK();
    }

    private final void bV() {
        gga ggaVar;
        if (!bo().i || (ggaVar = this.aE) == null) {
            return;
        }
        aaae aaaeVar = this.bG;
        if (aaaeVar != null) {
            aaaeVar.b();
        }
        this.bG = this.bv.a(this.bP, new aaag(ggaVar));
    }

    private final void bW() {
        if (!this.aD) {
            return;
        }
        gek gekVar = this.bO;
        dbsk.s(gekVar);
        jjn jjnVar = gekVar.c;
        if (jjnVar == null) {
            jjnVar = jjn.COLLAPSED;
        }
        egq egqVar = new egq(this) { // from class: bdxd
            private final bdyb a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                brbw brbwVar;
                bdyb bdybVar = this.a;
                if (bdybVar.aD) {
                    bdyd bdydVar = bdybVar.bF;
                    if (bdydVar != null) {
                        bdydVar.h();
                    }
                    cjtd bY = bdybVar.bo().bY();
                    if (bY != null) {
                        bdybVar.bd().b().d(bY);
                    }
                    vox voxVar = bdybVar.bI;
                    if (voxVar != null) {
                        voxVar.a();
                    }
                    boolean j = bdybVar.bo().j();
                    boolean z = !j;
                    bdybVar.aX(ckjw.ag, z);
                    bdybVar.aX(ckjw.ap, z);
                    bdybVar.aX(ckjw.ar, z);
                    bdybVar.aX(ckjw.z, z);
                    bdybVar.aX(ckjw.ah, j);
                    bdybVar.aX(ckjw.aq, j);
                    bdybVar.aX(ckjw.as, j);
                    bdybVar.aX(ckjw.A, j);
                    bdybVar.aX(ckjw.B, true);
                    bdybVar.aX(ckjw.v, false);
                    bdybVar.aX(ckjw.w, false);
                    bdybVar.aX(ckjw.x, false);
                    bdybVar.aX(ckjw.y, false);
                    bdyd bdydVar2 = bdybVar.bF;
                    if (bdydVar2 != null) {
                        bdydVar2.g(bdybVar.bo(), false);
                    }
                    alad aladVar = bdybVar.bX;
                    if (aladVar != null && !bdybVar.bs()) {
                        bdybVar.aT.p(akyt.m(aladVar.i, aladVar.k, bdybVar.aW.e()));
                        bdybVar.bX = null;
                    }
                    if (bdybVar.bM && (brbwVar = bdybVar.bN) != null) {
                        brbwVar.e();
                    }
                    if (!bdybVar.bR() && !bdybVar.br.l().L().b()) {
                        bdybVar.aR.a().a(bdybVar.bl);
                    }
                    dkrv dkrvVar = bdybVar.ae.getOfflineMapsParameters().t;
                    if (dkrvVar == null) {
                        dkrvVar = dkrv.f;
                    }
                    boolean z2 = dkrvVar.e;
                    bdybVar.bD(bdybVar.bo());
                }
            }
        };
        if (jjnVar == jjn.HIDDEN) {
            jjnVar = jjn.COLLAPSED;
        }
        jkc jkcVar = null;
        if (bS() && jjnVar == jjn.FULLY_EXPANDED) {
            jkcVar = jkc.a;
        }
        bZ(jjnVar, egqVar, jkcVar);
    }

    private final void bX(ilo iloVar) {
        bkfd bkfdVar = this.cp;
        if (bkfdVar != null) {
            bkfdVar.d();
        }
        bkfe a = this.aO.a();
        cqkf e = a.b.e(new bkfn());
        bkfd bkfdVar2 = new bkfd(a.a, e.c());
        bkfdVar2.g = -2;
        dafe dafeVar = bkfdVar2.e;
        dafeVar.setBackgroundColor(0);
        dafeVar.setPadding(0, 0, 0, 0);
        bkey bkeyVar = a.c;
        Activity activity = (Activity) ((dxjd) bkeyVar.a).a;
        bkey.a(activity, 1);
        dxio a2 = ((dxjh) bkeyVar.b).a();
        bkey.a(a2, 2);
        bkey.a(bkfdVar2, 3);
        bkey.a(iloVar, 4);
        e.e(new bkex(activity, a2, bkfdVar2, iloVar));
        this.bQ = iloVar;
        bkfdVar2.l(new bdxo(this));
        bdyd bdydVar = this.bF;
        if (bdydVar != null) {
            bdydVar.g.b(bkfdVar2.a);
        }
        bkfdVar2.c();
        this.cp = bkfdVar2;
    }

    private final void bY(jjn jjnVar) {
        bZ(jjnVar, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ff, code lost:
        if (r3 == 2) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bZ(final defpackage.jjn r13, @defpackage.dzsi final defpackage.egq r14, @defpackage.dzsi defpackage.jkc r15) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdyb.bZ(jjn, egq, jkc):void");
    }

    private final jkc ca() {
        if (bT()) {
            return jkc.d;
        }
        if (this.aC.a().c(bo())) {
            return jkc.b;
        }
        return jkc.f;
    }

    private final jkc cb() {
        if (bT()) {
            return jkc.d;
        }
        boolean c = this.aC.a().c(bo());
        if (btpf.c(this.b).e) {
            return jkc.m;
        }
        if (c) {
            return jkc.b;
        }
        return jkc.f;
    }

    @dzsi
    private final <T extends Serializable> T cc(@dzsi bwrs<T> bwrsVar) {
        try {
            return (T) bwrs.b(bwrsVar);
        } catch (ClassCastException e) {
            i(e);
            return null;
        }
    }

    @dzsi
    private final amte cd() {
        return (amte) cc(this.bV);
    }

    @dzsi
    private final brln ce() {
        return (brln) cc(this.bT);
    }

    @dzsi
    private final bwrs<brln> cf() {
        if (this.bH.v) {
            return this.bT;
        }
        return null;
    }

    @dzsi
    private final brln cg() {
        return (brln) cc(cf());
    }

    private final boolean ch(ilo iloVar, boolean z) {
        alad c;
        bdyd bdydVar = this.bF;
        if (bdydVar == null) {
            return false;
        }
        if (this.bH.M || iloVar.n) {
            dhjx ak = iloVar.ak();
            if (!z || ak == null || (c = alad.c(ak)) == null) {
                return false;
            }
            bdyd bdydVar2 = this.bF;
            dbsk.s(bdydVar2);
            iql iqlVar = bdydVar2.h;
            iqlVar.e = c.i;
            iqlVar.g.q(akyt.j(iqlVar.e, c.k, iqlVar.h.e()), null);
            return true;
        }
        bdydVar.h.d(this.ck, z);
        return true;
    }

    private final arad ci() {
        ddgg ddggVar;
        dnqh a = this.bH.a();
        if (a != null) {
            ddggVar = a.k;
            if (ddggVar == null) {
                ddggVar = ddgg.y;
            }
        } else {
            ddggVar = null;
        }
        if (bL()) {
            amsz ck = ck();
            dbsk.s(ck);
            arab arabVar = this.ag;
            dcdc t = dcdc.t(ck.e);
            int i = ck.c;
            amvi amviVar = ck.d;
            dqvj dqvjVar = ck.f;
            boolean a2 = bxns.a(ddggVar);
            dwao dwaoVar = (dwao) bvrt.f(ck.g, (dssr) dwao.R.cu(7), dwao.R);
            bdxs bdxsVar = this.ce;
            aqyg aqygVar = (aqyg) arabVar;
            Activity activity = (Activity) ((dxjd) aqygVar.a).a;
            aqyg.b(activity, 1);
            cqat a3 = aqygVar.b.a();
            aqyg.b(a3, 2);
            btrm a4 = aqygVar.c.a();
            aqyg.b(a4, 3);
            btvo a5 = aqygVar.d.a();
            aqyg.b(a5, 4);
            ahjq a6 = aqygVar.e.a();
            aqyg.b(a6, 5);
            aqyg.b(aqygVar.f.a(), 6);
            dzsj<akox> dzsjVar = aqygVar.g;
            dzsj<qbt> dzsjVar2 = aqygVar.h;
            dzsj<ascb> dzsjVar3 = aqygVar.i;
            dzsj<brba> dzsjVar4 = aqygVar.j;
            dzsj<afha> dzsjVar5 = aqygVar.k;
            aqyg.b(t, 12);
            aqyg.b(amviVar, 14);
            return new aqyf(activity, a3, a4, a5, a6, dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, t, i, amviVar, dqvjVar, a2, dwaoVar, bdxsVar);
        } else if (bQ()) {
            amte bN = bN();
            dbsk.s(bN);
            return ((aqyg) this.ag).a(false, bN.c(bN.i), bxns.a(ddggVar), arac.DIRECTIONS, bO(), null);
        } else {
            return this.ag.c(null, bxns.a(ddggVar), arac.DEFAULT, this.ce);
        }
    }

    private final void cj(vox voxVar, amte amteVar) {
        dcdc<amvh> e;
        vov vovVar;
        ilo bo = bo();
        amvh[] amvhVarArr = amteVar.c;
        if (amvhVarArr != null) {
            e = dcdc.t(amvhVarArr);
        } else {
            e = dcdc.e();
        }
        dcdc<amvh> dcdcVar = e;
        int i = amteVar.i;
        if (bo.j) {
            vovVar = vov.NORMAL;
        } else {
            vovVar = vov.SINGLE_ROUTE_WITH_ETA;
        }
        voxVar.c(amteVar, dcdcVar, i, vovVar, vow.f, bo.j ? bo.d() : null);
    }

    @dzsi
    private final amsz ck() {
        brln ce = ce();
        if (ce != null) {
            return ce.c;
        }
        return null;
    }

    public static bdyb g(bwqv bwqvVar, begj begjVar) {
        begl a = begjVar.a();
        if (a.a == null) {
            begjVar.a = begi.DISTINCT;
            a = begjVar.a();
        }
        bdyb bdybVar = new bdyb();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "options", a);
        bdybVar.B(bundle);
        bdybVar.bH = a;
        return bdybVar;
    }

    @Override // defpackage.bwrr
    public final /* bridge */ /* synthetic */ void PV(@dzsi Object obj) {
        ilo iloVar = (ilo) obj;
        if (!this.cl || this.bF == null || iloVar == null) {
            return;
        }
        this.aq.b();
        ilo bo = bo();
        boolean z = false;
        if (bo.q && bo.r) {
            ily g = bo.g();
            g.t = this.b.getString(R.string.UNRESOLVED_REVERSE_GEOCODE_OVERRIDE);
            g.n = false;
            this.bP.d(g.d());
        }
        if (akqi.d(iloVar.ai()) && iloVar.bl() && ((bo().i || this.bH.a == begi.BASE_MAP_POI) && !this.cr)) {
            ((ckcn) this.ad.a(ckep.a)).a();
            this.cr = true;
        }
        bnjo bnjoVar = this.bR;
        dbsk.s(bnjoVar);
        if (bnjoVar.j().booleanValue() || !iloVar.i()) {
            bB(!bo().j, false);
        } else {
            this.bP.d(iloVar.g);
        }
        bgql bgqlVar = this.aY;
        if (bgqlVar.a != null && bgql.b(iloVar) && iloVar.cr(bgqlVar.a)) {
            bgqlVar.c(iloVar);
            bgqlVar.a = null;
        }
        if (iloVar.h) {
            this.bj.e(ckog.b);
            this.ai.b(pfp.a(iloVar));
        }
        if (br()) {
            w(bP(), false);
        }
        if (this.bH.p) {
            bn(iloVar);
        }
        this.ao.a(iloVar);
        if (this.br.l().L() != jjn.EXPANDED) {
            boolean z2 = bo().o && this.at.a().k();
            dbsg<drn> dbsgVar = this.aZ;
            if (!this.cs && dbsgVar.a() && dbsgVar.b().a()) {
                z = true;
            }
            if (z2 || z) {
                bY(jjn.COLLAPSED);
            }
        }
        this.br.setExpandingStateTransition(ca(), cb(), true);
        bD(iloVar);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        super.Qd();
        if (!this.cl) {
            return;
        }
        if (!this.bH.w) {
            this.bo.b();
        }
        this.ai.b(pfp.b(bo()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        bdyd bdydVar;
        if (this.cl && (bdydVar = this.bF) != null) {
            bdydVar.a.PR();
            bdydVar.c();
            bdydVar.b.b = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        dnnn d;
        if (obj instanceof bkgm) {
            bX(((bkgm) obj).a);
        }
        if ((obj instanceof bkgx) && this.bu.a()) {
            String str = ((bkgx) obj).a;
            if (this.bu.a()) {
                bkfd bkfdVar = this.cp;
                if (bkfdVar != null) {
                    bkfdVar.d();
                }
                bkfe a = this.aO.a();
                cqkf e = a.b.e(new bkfn());
                bkfd bkfdVar2 = new bkfd(a.a, e.c());
                bkfdVar2.g = 5500;
                dafe dafeVar = bkfdVar2.e;
                dafeVar.setBackgroundColor(0);
                dafeVar.setPadding(0, 0, 0, 0);
                Activity activity = (Activity) ((dxjd) a.d.a).a;
                bkfa.a(activity, 1);
                bkfa.a(str, 2);
                bkfa.a(bkfdVar2, 3);
                e.e(new bkez(activity, str, bkfdVar2));
                bkfdVar2.l(new bdxn());
                bdyd bdydVar = this.bF;
                if (bdydVar != null) {
                    bdydVar.g.b(bkfdVar2.a);
                }
                bkfdVar2.c();
                this.cp = bkfdVar2;
            }
        }
        if (obj instanceof aekf) {
            aekf aekfVar = (aekf) obj;
            if (!this.ae.getHotelBookingModuleParameters().i() || !bo().bS().a()) {
                return;
            }
            if (this.al.i()) {
                d = bo().bS().b().b;
                if (d == null) {
                    d = dnnn.l;
                }
            } else {
                d = this.an.d();
            }
            bA(d);
            brlu bx = bx();
            if (bx != null) {
                bz(bx, d);
            } else {
                Nw(aekfVar);
            }
        }
    }

    @Override // defpackage.gfn
    public final boolean a() {
        begl beglVar = this.bH;
        return beglVar != null && beglVar.a == begi.BASE_MAP_POI;
    }

    public final boolean aJ() {
        if (!this.bH.D || this.bP.c() == null) {
            return false;
        }
        this.aQ.a().I(bo());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aR(jjn jjnVar) {
        jjn L = this.br.l().L();
        if (!this.aD || L == jjnVar) {
            return;
        }
        if (!jjnVar.b() && aJ()) {
            return;
        }
        if (!bT()) {
            this.br.B(jjnVar);
            boolean z = false;
            if (!L.b() && jjnVar.b()) {
                z = true;
            }
            bH(z);
            return;
        }
        bY(jjnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aS(bwrs<ilo> bwrsVar, cjqm cjqmVar) {
        bdyd bdydVar;
        gga ggaVar = this.aE;
        ilo c = bwrsVar.c();
        if (!this.aD || ggaVar == null || c == null) {
            return;
        }
        brbw brbwVar = this.bN;
        if (brbwVar != null) {
            brbwVar.f();
        }
        begj b = this.bH.b();
        b.i = bwrsVar;
        b.m = cjqmVar;
        b.F = !c.m && !c.j;
        b.b = null;
        begl a = b.a();
        bdyd bdydVar2 = this.bF;
        if (bdydVar2 != null) {
            bdydVar2.f();
            this.bF.h();
        }
        this.bH = a;
        this.ck = null;
        this.co = false;
        this.bJ = false;
        this.bK = false;
        bwqv.t(this.bP, this);
        this.bP = bwrsVar;
        this.aj.g(bwrsVar, this);
        this.bc.e(this.bP);
        bV();
        q();
        aV();
        if (this.bW && (bdydVar = this.bF) != null) {
            bdydVar.c();
        }
        arad ci2 = ci();
        bdyd bdydVar3 = this.bF;
        if (bdydVar3 != null) {
            bdydVar3.a(this.bP, true, false, ci2);
            if (this.bW) {
                this.bF.b();
            }
            this.bF.e();
        }
        by(true, true);
        w(bP(), true);
        this.bO.c = bP();
        bW();
        this.aY.a(c);
        bK();
    }

    @dzsi
    public final bmlh aT() {
        bdyd bdydVar = this.bF;
        if (bdydVar != null) {
            return bdydVar.a.R();
        }
        return null;
    }

    public final boolean aU() {
        btpf c = btpf.c(this.b);
        return c.e && c.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aV() {
        /*
            r8 = this;
            brln r0 = r8.cg()
            r1 = 0
            if (r0 == 0) goto La
            iqy r0 = r0.a
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto Le
            return
        Le:
            ilo r2 = r8.bo()
            android.app.Activity r3 = r8.b
            dxio<aesb> r4 = r8.av
            java.lang.Object r4 = r4.a()
            aesb r4 = (defpackage.aesb) r4
            dndr r5 = defpackage.dndr.UNKNOWN_ALIAS_TYPE
            dndr r5 = r0.e
            int r5 = r5.ordinal()
            r6 = 1
            if (r5 == r6) goto L36
            r7 = 2
            if (r5 == r7) goto L2c
            r7 = r1
            goto L47
        L2c:
            dndr r5 = defpackage.dndr.WORK
            r7 = 2131959024(0x7f131cf0, float:1.9554677E38)
            java.lang.String r3 = r3.getString(r7)
            goto L3f
        L36:
            dndr r5 = defpackage.dndr.HOME
            r7 = 2131954121(0x7f1309c9, float:1.9544732E38)
            java.lang.String r3 = r3.getString(r7)
        L3f:
            ily r7 = r2.g()
            r7.z = r5
            r7.t = r3
        L47:
            if (r7 != 0) goto L60
            r2.ai()
            java.lang.String r3 = r0.a
            java.lang.String r5 = r0.b
            if (r3 != 0) goto L54
            if (r5 == 0) goto L60
        L54:
            ily r7 = r2.g()
            r7.t = r3
            java.lang.String r3 = defpackage.dbsj.e(r5)
            r7.w = r3
        L60:
            boolean r3 = r0.f
            if (r3 == 0) goto L6d
            if (r7 != 0) goto L6b
            ily r3 = r2.g()
            r7 = r3
        L6b:
            r7.m = r6
        L6d:
            java.lang.Long r3 = r0.c
            if (r3 == 0) goto L7c
            if (r7 != 0) goto L78
            ily r3 = r2.g()
            r7 = r3
        L78:
            java.lang.Long r3 = r0.c
            r7.B = r3
        L7c:
            if (r7 == 0) goto L82
            ilo r1 = r7.d()
        L82:
            boolean r0 = r0.f
            if (r0 == 0) goto L8c
            r0 = 4
            ddho r3 = defpackage.dtyi.da
            r4.D(r2, r0, r3)
        L8c:
            if (r1 == 0) goto La6
            bwrs<ilo> r0 = r8.bP
            ily r1 = r1.f(r2)
            ilo r1 = r1.d()
            r0.d(r1)
            bdyd r0 = r8.bF
            if (r0 == 0) goto La6
            bwrs<ilo> r1 = r8.bP
            bdwp r0 = r0.c
            r0.f(r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdyb.aV():void");
    }

    public final void aX(ckhf ckhfVar, boolean z) {
        if (z) {
            ((ckhe) this.ad.a(ckhfVar)).c();
        } else {
            ((ckhe) this.ad.a(ckhfVar)).e();
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        iln be;
        bdwp bdwpVar;
        qbi bO;
        bdwp bdwpVar2 = null;
        if (!this.cl) {
            bdyd bdydVar = this.bF;
            if (bdydVar != null) {
                bdwpVar2 = bdydVar.c;
            }
            return bdwpVar2 == null ? new View(this.b) : bdwpVar2;
        }
        if (this.bF == null) {
            begc a = this.cd.a(ibm.b());
            arad ci2 = ci();
            boolean z = bL() || bQ();
            boolean z2 = (!bQ() || (bO = bO()) == null) ? false : !bO.bM();
            bnjo bnjoVar = this.bR;
            boolean z3 = bnjoVar != null;
            if (bnjoVar == null) {
                bdyl bdylVar = this.bf;
                begl beglVar = this.bH;
                amsz ck = ck();
                boolean z4 = ck != null && ck.d == amvi.ATTACH_PARKING;
                brlu bx = bx();
                this.bR = bdylVar.a(beglVar, z, z4, bx != null && bx.o.h(16, ci), z2, bR(), false, R(), this.cb);
            }
            if (bo().i) {
                be = iln.GEOCODE;
            } else {
                be = bo().be();
            }
            bkat bkatVar = this.bg;
            bdwp c = bkatVar.c();
            if (c == null) {
                c = new bdwp(bkatVar.a, null);
            }
            bdwp bdwpVar3 = c;
            bnjo bnjoVar2 = this.bR;
            dbsk.s(bnjoVar2);
            bdwpVar3.setViewModel(bnjoVar2, be, a);
            boolean z5 = z3;
            iql iqlVar = new iql(this, this.aT, this.bd, this.bD, this.br.l(), this.aW, this.b, this.au, this.f);
            iqs iqsVar = this.bc;
            gek gekVar = this.bO;
            dbsk.s(gekVar);
            iqo iqoVar = new iqo(bdwpVar3, iqsVar, iqlVar, gekVar.b(), this.ai);
            if (this.bH.z || bT() || bS()) {
                iqoVar.b(new bdxy(this));
            }
            if (bS()) {
                bdyp bdypVar = this.bE;
                btvo a2 = bdypVar.a.a();
                bdyp.a(a2, 1);
                bdyp.a(bdypVar.b.a(), 2);
                bdwpVar = bdwpVar3;
                bdyp.a(bdwpVar, 3);
                iqoVar.b(new bdyo(a2, bdwpVar));
                iqoVar.b(new bdxi(this));
            } else {
                bdwpVar = bdwpVar3;
            }
            iqoVar.b(new bdxj(this));
            if (this.c.c()) {
                iqoVar.b(this.cx);
            }
            iqoVar.b(new bdxk(this));
            ckmu ckmuVar = this.bs;
            cwsv cwsvVar = ckmt.a;
            ckms ckmsVar = new ckms(this) { // from class: bdxb
                private final bdyb b;

                {
                    this.b = this;
                }

                @Override // defpackage.ckms
                public final cwsv a() {
                    bege f;
                    bmlh aT = this.b.aT();
                    if (aT == null || (f = aT.f()) == null || !ckms.a.containsKey(f)) {
                        return null;
                    }
                    return ckms.a.get(f);
                }
            };
            ckmm a3 = ckmuVar.a.a();
            ckmu.a(a3, 1);
            cqat a4 = ckmuVar.b.a();
            ckmu.a(a4, 2);
            Handler a5 = ckmuVar.c.a();
            ckmu.a(a5, 3);
            ckmu.a(cwsvVar, 4);
            iqoVar.b(new ckmt(a3, a4, a5, cwsvVar, ckmsVar).e);
            akox akoxVar = this.aT;
            hwe hweVar = this.bd;
            Activity activity = this.b;
            jkj l = this.br.l();
            btvo btvoVar = this.ae;
            akwu akwuVar = this.aU;
            bd().b();
            iqt iqtVar = new iqt(iqoVar, iqlVar, !z, akoxVar, hweVar, activity, l, btvoVar, akwuVar);
            bdye bdyeVar = this.bb;
            bnjo bnjoVar3 = this.bR;
            Runnable runnable = new Runnable(this) { // from class: bdxc
                private final bdyb a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aR(jjn.EXPANDED);
                }
            };
            brrr a6 = bdyeVar.a.a();
            bdye.a(a6, 1);
            btrm a7 = bdyeVar.b.a();
            bdye.a(a7, 2);
            bdye.a(a, 3);
            bdye.a(iqtVar, 4);
            dxio a8 = ((dxjh) bdyeVar.c).a();
            bdye.a(a8, 5);
            dxio a9 = ((dxjh) bdyeVar.d).a();
            bdye.a(a9, 6);
            bdye.a(iqoVar, 7);
            bdye.a(iqlVar, 8);
            bdye.a(bdwpVar, 9);
            bdye.a(bnjoVar3, 10);
            bdye.a(runnable, 11);
            bhlk a10 = bdyeVar.e.a();
            bdye.a(a10, 12);
            begx a11 = bdyeVar.f.a();
            bdye.a(a11, 13);
            jkf a12 = bdyeVar.g.a();
            bdye.a(a12, 14);
            iqs a13 = bdyeVar.h.a();
            bdye.a(a13, 15);
            bego a14 = bdyeVar.i.a();
            bdye.a(a14, 16);
            bdye.a(bdyeVar.j.a(), 17);
            bdyd bdydVar2 = new bdyd(a6, a7, a, iqtVar, a8, a9, iqoVar, iqlVar, bdwpVar, bnjoVar3, runnable, a10, a11, a12, a13, a14);
            this.bF = bdydVar2;
            bdydVar2.a(this.bP, !this.bJ, z5, ci2);
            bdwpVar.addOnAttachStateChangeListener(new bdxl(this));
        }
        bdyd bdydVar3 = this.bF;
        dbsk.s(bdydVar3);
        bdydVar3.a.PQ();
        bdydVar3.b();
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("view-model-sub-bundle");
            if (bundle2 != null) {
                bnjo bnjoVar4 = this.bR;
                dbsk.s(bnjoVar4);
                bnjoVar4.h(bundle2);
            }
            Serializable serializable = bundle.getSerializable("quote-confirmation-snackbar-placemark");
            if (serializable instanceof ilo) {
                bX((ilo) serializable);
            }
        }
        bdyd bdydVar4 = this.bF;
        dbsk.s(bdydVar4);
        return bdydVar4.c;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        this.a.e(2);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        if (!this.cl) {
            return;
        }
        bwqv.t(this.bP, this);
        bdxz bdxzVar = this.bZ;
        if (bdxzVar != null) {
            this.ai.a(bdxzVar);
            this.bZ = null;
        }
        this.ap.b(this.bY);
        aaae aaaeVar = this.bG;
        if (aaaeVar != null) {
            aaaeVar.b();
        }
        this.aS.C().c(this.cu);
        if (!this.aC.a().b()) {
            return;
        }
        ((bvuh) this.ba).b = null;
    }

    public final void bA(dnnn dnnnVar) {
        dnnn e;
        aehb aehbVar = this.cf;
        dcdc<akqi> f = dcdc.f(bo().ai());
        aehy aehyVar = this.ca;
        dhjx ak = bo().ak();
        synchronized (aehbVar) {
            btzc btzcVar = aehbVar.d;
            if (btzcVar != null) {
                btzcVar.a();
            }
            if (aehbVar.b.i()) {
                e = aehbVar.b.h(dnnnVar);
            } else {
                e = aehbVar.c.e(dbsg.i(dnnnVar));
            }
            dnxm bZ = dnxn.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnxn dnxnVar = (dnxn) bZ.b;
            e.getClass();
            dnxnVar.c = e;
            dnxnVar.a |= 2;
            if (aehbVar.a.getHotelBookingModuleParameters().i()) {
                dqtm bZ2 = dqtn.a.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dqtn.b((dqtn) bZ2.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnxn dnxnVar2 = (dnxn) bZ.b;
                dqtn bK = bZ2.bK();
                bK.getClass();
                dnxnVar2.d = bK;
                dnxnVar2.a |= 4;
            }
            if (ak != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnxn dnxnVar3 = (dnxn) bZ.b;
                ak.getClass();
                dnxnVar3.e = ak;
                dnxnVar3.a |= 16;
            }
            for (akqi akqiVar : f) {
                String o = akqiVar.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dnxn dnxnVar4 = (dnxn) bZ.b;
                o.getClass();
                dsrj<String> dsrjVar = dnxnVar4.b;
                if (!dsrjVar.a()) {
                    dnxnVar4.b = dsqw.cl(dsrjVar);
                }
                dnxnVar4.b.add(o);
            }
            dwgu bZ3 = dwgv.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dwgv dwgvVar = (dwgv) bZ3.b;
            dnxn bK2 = bZ.bK();
            bK2.getClass();
            dwgvVar.b = bK2;
            dwgvVar.a |= 1;
            aehbVar.d = aehbVar.e.a(bZ3.bK(), new aeha(aehbVar, aehyVar), bvrj.UI_THREAD);
        }
    }

    public final void bB(boolean z, boolean z2) {
        if (!this.aD) {
            return;
        }
        bdyd bdydVar = this.bF;
        if (bdydVar != null) {
            bdydVar.g(bo(), z);
        }
        this.cq.l(bo());
        bC(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f7, code lost:
        if (r6.h.isEmpty() != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bC(boolean r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdyb.bC(boolean):void");
    }

    public final void bD(ilo iloVar) {
        if (iloVar.h) {
            cklq cklqVar = this.aq;
            cklt ckltVar = cklt.PLACE_SHEET;
            dccx F = dcdc.F();
            if (this.aX.a() && bhat.f(iloVar)) {
                F.g(cklr.VANITY_VISIT);
            }
            dkee b = dkee.b(iloVar.h().bl);
            if (b == null) {
                b = dkee.UNKNOWN_VIEW_TYPE;
            }
            dcdn<dkee, cklr> dcdnVar = cj;
            if (dcdnVar.containsKey(b)) {
                F.g(dcdnVar.get(b));
            }
            cklqVar.d(ckltVar, F.f());
            this.bi.e(ckoi.PLACE);
        }
    }

    public final void bE() {
        dcdc<altv> bA = bo().bA();
        if (bA == null || bA.isEmpty()) {
            return;
        }
        int size = bA.size();
        int i = 0;
        while (i < size) {
            i++;
            if (this.ap.f(bA.get(i).a)) {
                return;
            }
        }
        this.ap.c(bA.get(0).a);
    }

    @Override // defpackage.befx
    public final void bF(@dzsi jjn jjnVar) {
        if (!this.aD || bL()) {
            return;
        }
        dbsg<gli> a = this.az.a();
        if (((Boolean) a.h(bdwx.a).c(false)).booleanValue()) {
            bG();
            a.b().c();
            return;
        }
        if (jjnVar == null) {
            jjnVar = jjn.EXPANDED;
        }
        jjn L = this.br.l().L();
        if (L == jjnVar) {
            return;
        }
        this.bc.c(new cjte(deaf.TAP), dtyi.ct, L, jjnVar);
        bY(jjnVar);
    }

    public final void bG() {
        if (!this.az.a().a()) {
            return;
        }
        if (((Boolean) this.az.a().h(bdwy.a).c(false)).booleanValue()) {
            this.bc.c(new cjte(deaf.AUTOMATED), dtxy.gP, jjn.HIDDEN, jjn.COLLAPSED);
        } else {
            this.bc.c(new cjte(deaf.AUTOMATED), dtxy.gP, jjn.COLLAPSED, jjn.HIDDEN);
        }
    }

    public final void bH(boolean z) {
        if (!this.ae.getPlaceSheetParameters().J() || !z || !bo().v) {
            return;
        }
        bJ();
    }

    @Override // defpackage.aueo
    @dzsi
    public final Uri bI() {
        return Uri.parse(bo().aw());
    }

    public final void bJ() {
        if (!this.aD) {
            return;
        }
        begj b = this.bH.b();
        b.r = this.ae.getPlaceSheetParameters().J();
        this.aB.a().r(this.aB.a().s(b.a()));
    }

    public final void bK() {
        if (bL() || bQ()) {
            if (this.bI == null) {
                this.bI = this.bk.a();
            }
            if (bL()) {
                amte cd = cd();
                if (cd != null) {
                    cj(this.bI, cd);
                    return;
                }
                amsz ck = ck();
                dbsk.s(ck);
                this.bI.c(ck.a, dcdc.t(ck.e), ck.b, vov.SINGLE_ROUTE_WITH_ETA, vow.f, null);
            } else if (!bQ()) {
            } else {
                amte cd2 = cd();
                if (cd2 == null) {
                    cd2 = bN();
                    dbsk.s(cd2);
                }
                cj(this.bI, cd2);
                ch(bo(), false);
            }
        }
    }

    public final boolean bL() {
        return ck() != null;
    }

    @dzsi
    public final amte bN() {
        return (amte) cc(this.bU);
    }

    @dzsi
    public final qbi bO() {
        if (ba() instanceof qbi) {
            return (qbi) ba();
        }
        return null;
    }

    final jjn bP() {
        return this.br.l().L();
    }

    public final boolean bQ() {
        return bN() != null;
    }

    public final boolean bR() {
        return !bL();
    }

    public final boolean bS() {
        return this.aC.a().a(bo());
    }

    public final boolean bT() {
        return bR() && !bS();
    }

    @Override // defpackage.ges
    public final achc bk() {
        ilo bo = bo();
        if (this.br.l().L() != jjn.FULLY_EXPANDED) {
            return bo.aV() ? achc.GEOCODE_PAGE : achc.BUSINESS_PLACE_PAGE;
        } else if (bo.aV()) {
            return achc.GEOCODE_PAGE_FULLSCREEN;
        } else {
            return achc.BUSINESS_PLACE_PAGE_FULLSCREEN;
        }
    }

    public final void bn(@dzsi ilo iloVar) {
        if (ce() != null) {
            this.ax.a().e().a(false);
            return;
        }
        dpvg at = iloVar.at();
        if (at == null) {
            return;
        }
        this.ax.a().e();
        anbh e = this.ax.a().e();
        dpvf b = dpvf.b(at.b);
        if (b == null) {
            b = dpvf.UNKNOWN_CATEGORY;
        }
        switch (b.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
                e.b(dpsv.DINING);
                e.a(true);
                return;
            case 12:
            case 17:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            default:
                e.a(false);
                return;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                e.b(dpsv.FUN);
                e.a(true);
                return;
            case com.google.android.filament.R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case 35:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                e.b(dpsv.SERVICES);
                e.a(true);
                return;
            case com.google.android.filament.R.styleable.AppCompatTheme_colorAccent /* 50 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorError /* 56 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case com.google.android.filament.R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                e.b(dpsv.SHOPPING);
                e.a(true);
                return;
        }
    }

    public final ilo bo() {
        ilo c = this.bP.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.befy
    public final bwrs<ilo> bp() {
        return this.bP;
    }

    @Override // defpackage.befx
    @dzsi
    /* renamed from: bq */
    public final bdwp bU() {
        bdyd bdydVar = this.bF;
        if (bdydVar == null) {
            return null;
        }
        return bdydVar.c;
    }

    public final boolean br() {
        ilo bo = bo();
        return bo.f && !bo.j();
    }

    public final boolean bs() {
        brlu bx = bx();
        return bx != null && bx.aq();
    }

    @Override // defpackage.brae
    @dzsi
    public final brlk bt() {
        bwrs<brlu> bv;
        bwrs<brln> bwrsVar = this.bT;
        if (bwrsVar == null || (bv = bv()) == null) {
            return null;
        }
        return brlk.c(bwrsVar, bv);
    }

    @dzsi
    public final iqw bu() {
        return (iqw) cc(this.bS);
    }

    @dzsi
    public final bwrs<brlu> bv() {
        if (bu() instanceof brlu) {
            return this.bS;
        }
        return null;
    }

    @dzsi
    public final bwrs<brlu> bw() {
        if (this.bH.v) {
            return bv();
        }
        return null;
    }

    @dzsi
    public final brlu bx() {
        return (brlu) cc(bw());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void by(boolean z, boolean z2) {
        aaae aaaeVar;
        ilo bo = bo();
        bB(z, z2);
        if (!br()) {
            if (!bo.i || (aaaeVar = this.bG) == null) {
                this.aB.a().r(this.aB.a().s(this.bH));
                return;
            } else {
                aaaeVar.a(this.bH.l);
                return;
            }
        }
        ilo bo2 = bo();
        if (!this.al.i()) {
            return;
        }
        dnng dnngVar = bo2.h().X;
        if (dnngVar == null) {
            dnngVar = dnng.r;
        }
        if (dnngVar.equals(dnng.r) || !bo2.t) {
            return;
        }
        dnnn dnnnVar = bo.bS().b().b;
        if (dnnnVar == null) {
            dnnnVar = dnnn.l;
        }
        bA(dnnnVar);
    }

    public final void bz(brlu brluVar, dnnn dnnnVar) {
        bsjm bsjmVar = new bsjm(brluVar.o);
        bsjmVar.o(dnnnVar);
        if ((dnnnVar.a & 4096) != 0) {
            dqxc dqxcVar = dnnnVar.j;
            if (dqxcVar == null) {
                dqxcVar = dqxc.c;
            }
            int i = dqxcVar.b;
            djmu bZ = djmv.c.bZ();
            djlo bZ2 = djlp.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djlp djlpVar = (djlp) bZ2.b;
            djlpVar.a |= 1;
            djlpVar.b = i;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djmv djmvVar = (djmv) bZ.b;
            djlp bK = bZ2.bK();
            bK.getClass();
            djmvVar.b = bK;
            djmvVar.a = 23;
            bsjmVar.u(18, bZ.bK().bR(), 2);
        }
        Nw(bsjn.f(bsjmVar, dtxy.hy, cjqm.a, true));
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar != null && this.aD) {
            jjn L = this.br.l().L();
            if (L.b()) {
                bmlh aT = aT();
                if (aT != null) {
                    if (aT.m()) {
                        return true;
                    }
                    bege begeVar = this.bH.c;
                    if (begeVar == null) {
                        begeVar = bege.OVERVIEW;
                    }
                    if (aT.d(begeVar) && aT.f() != begeVar) {
                        aT.h(begeVar, true);
                        return true;
                    }
                }
                if (this.bH.o) {
                    ggaVar.z(bdyb.class);
                    ggaVar.g().f();
                    return true;
                } else if (bT() && !aU()) {
                    bZ(jjn.COLLAPSED, new bdxm(this), null);
                    return true;
                }
            }
            if (!L.b()) {
                this.br.setExpandingState(jjn.HIDDEN, true);
            }
        }
        return false;
    }

    final void i(Throwable th) {
        this.cl = false;
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.g(bc(), 1);
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            cjxu.j(ggaVar, this.bw, Rp(R.string.UNKNOWN_ERROR));
        }
        bvoo.h("Corrupt storage data: %s", th);
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.am.D(configuration);
    }

    @Override // defpackage.ges
    public final ddho p() {
        if (this.cl) {
            ddho ddhoVar = this.bH.m;
            if (bo().i) {
                return dtyb.cA;
            }
            if (cg() != null) {
                return dtyb.by;
            }
        }
        return dtyb.cA;
    }

    final void q() {
        brln cg2;
        iqy iqyVar;
        ixr a = this.aP.a();
        bwrs<brln> cf = cf();
        if (cf != null) {
            a.j(cf);
        }
        brln cg3 = cg();
        brlu bx = bx();
        if (!dbsj.d(this.bH.k)) {
            a.I(this.bH.k);
        } else if (!bL() && (((cg2 = cg()) == null || (iqyVar = cg2.a) == null || !iqyVar.i) && !bo().q && !bQ())) {
            String str = null;
            String str2 = bx != null ? bx.a : null;
            if (cg3 != null) {
                str = cg3.j();
            }
            if (!dbsj.d(str2)) {
                a.I(str2);
            } else if (!dbsj.d(str)) {
                a.I(str);
            } else if (!bo().l) {
                a.I(bo().y());
            }
        }
        if (cg3 != null && bx != null) {
            this.bM = brbw.l(cg3, bx);
        }
        bdyv bdyvVar = this.bn;
        bdyvVar.b = this.bP;
        bdyvVar.a = a;
        this.aR.a().a(this.bn);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (!this.cl) {
            return;
        }
        if (this.bH.A) {
            this.g.b();
        }
        this.an.j(this.bH.a == begi.SEARCH_LIST_RESULT ? 2 : 1);
        boolean z = this.bH.u;
        bdyd bdydVar = this.bF;
        dbsk.s(bdydVar);
        bdydVar.e();
        if (this.bW) {
            bdyd bdydVar2 = this.bF;
            dbsk.s(bdydVar2);
            bdydVar2.b();
        }
        brlu bx = bx();
        if (bx == null || bx.x() == null) {
            by(br() && !bo().j, false);
        } else {
            cjyb cjybVar = this.f;
            cjxx cjxxVar = this.ct;
            bdya bdyaVar = new bdya(this);
            cjybVar.d(cjxxVar, bdyaVar);
            this.ct = bdyaVar;
        }
        bwrs<brln> cf = cf();
        bwrs<brlu> bw = bw();
        if (cf != null && bw != null && this.bM && this.bN == null) {
            this.bN = this.bm.a(cf, bw, this.aP.a(), this.cy);
        }
        this.aV.b(this.cv);
        bK();
        bW();
        this.cq.l(bo());
        this.ay.a().e(this);
        ((bwez) this.bq).p(37);
        w(bP(), true);
        if (this.bH.p) {
            bn(bo());
        }
        if (this.bH.E) {
            this.d.c = this.bP;
            bdyd bdydVar3 = this.bF;
            dbsk.s(bdydVar3);
            this.d.b = bdydVar3.d().findViewById(R.id.action_buttons);
            this.aR.a().a(this.d);
        }
        if (this.bH.I) {
            this.bp.d();
        }
        this.ao.a(bo());
        if (!this.aC.a().b()) {
            return;
        }
        ((bvuh) this.ba).b = R();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ak.c(bundle, "prefetchedDirections", this.bV);
        this.ak.c(bundle, "options", this.bH);
        bundle.putSerializable("quote-confirmation-snackbar-placemark", this.bQ);
        bundle.putBoolean("camera-moved", this.co);
        bundle.putBoolean("show-mini-map", this.bJ);
        bundle.putBoolean("editPublishedDialogDismissed", this.bK);
        if (this.bR != null) {
            Bundle bundle2 = new Bundle();
            this.bR.g(bundle2);
            bundle.putBundle("view-model-sub-bundle", bundle2);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        if (!this.cl) {
            super.u();
            return;
        }
        cjxx cjxxVar = this.ct;
        if (cjxxVar != null && cjxxVar.d()) {
            this.ct.b();
        }
        this.aV.c(this.cv);
        bdyd bdydVar = this.bF;
        dbsk.s(bdydVar);
        bdydVar.f();
        bkfd bkfdVar = this.cp;
        if (bkfdVar != null) {
            bkfdVar.d();
        }
        brbw brbwVar = this.bN;
        if (brbwVar != null) {
            brbwVar.f();
        }
        vox voxVar = this.bI;
        if (voxVar != null) {
            voxVar.b();
        }
        this.an.j(1);
        this.ay.a().f(this);
        gek gekVar = this.bO;
        bdyd bdydVar2 = this.bF;
        dbsk.s(bdydVar2);
        gekVar.c = bdydVar2.g.a;
        this.bj.e(ckog.a);
        this.ax.a().e();
        this.ax.a().e().a.a();
        if (this.bH.I) {
            this.bp.e();
        }
        this.ao.b();
        super.u();
    }

    public final void w(jjn jjnVar, boolean z) {
        if (z) {
            this.cm = false;
            this.cn = false;
        }
        if (jjnVar.b() && !this.cm) {
            this.cm = true;
        }
        if (((ilo) bwrs.b(this.bP)) == null || this.cn || !this.cm || !br()) {
            return;
        }
        this.cn = true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        Bundle bundle2 = bundle != null ? bundle : this.o;
        try {
            begl beglVar = (begl) this.ak.d(begl.class, bundle2, "options");
            dbsk.s(beglVar);
            this.bH = beglVar;
            bwrs<ilo> bwrsVar = beglVar.i;
            dbsk.s(bwrsVar);
            this.bP = bwrsVar;
            bo();
            this.bP.b = bo().n();
            this.bS = this.bH.g;
            bu();
            this.bT = this.bH.j;
            ce();
            this.bU = this.bH.h;
            bwrs<amte> e = this.ak.e(amte.class, bundle2, "prefetchedDirections");
            if (e != null) {
                this.bV = e;
            }
            cd();
            this.cl = true;
            this.cr = false;
            aV();
            super.l(bundle);
            this.cq = this.bt.a(dtxy.iG);
            bgqo bgqoVar = this.be;
            if (bgqoVar != null) {
                final bgqn a = bgqoVar.a(new dbty(this) { // from class: bdwz
                    private final bdyb a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.bP;
                    }
                });
                bvor.a(bd(), new mw(a) { // from class: bdxa
                    private final bgqn a;

                    {
                        this.a = a;
                    }

                    @Override // defpackage.mw
                    public final void a(Object obj) {
                        bgqn bgqnVar = this.a;
                        int i = bdyb.cg;
                        ((cjqp) obj).g(bgqnVar);
                    }
                });
            }
            this.bc.e(this.bP);
            if (bundle != null) {
                this.co = bundle.getBoolean("camera-moved", this.co);
                this.bJ = bundle.getBoolean("show-mini-map", this.bJ);
                this.bK = bundle.getBoolean("editPublishedDialogDismissed", this.bK);
            }
            bV();
            q();
            this.aj.g(this.bP, this);
            this.cc = btlu.q(this.aS.j());
            this.cu = new bdxw(this);
            this.aS.C().d(this.cu, this.bD);
            bdxz bdxzVar = new bdxz(this);
            btrm btrmVar = this.ai;
            dceq a2 = dcet.a();
            a2.b(aehq.class, new bdyc(aehq.class, bdxzVar, bvrj.UI_THREAD));
            a2.b(iqn.class, new bdyc(1, iqn.class, bdxzVar));
            a2.b(bnis.class, new bdyc(2, bnis.class, bdxzVar));
            btrmVar.g(bdxzVar, a2.a());
            this.bZ = bdxzVar;
            this.ap.a(this.bY);
            bvrt<dlfh> bvrtVar = this.bH.d;
            if (bvrtVar != null && !this.bK) {
                boks.a(bvrtVar.e((dssr) dlfh.q.cu(7), dlfh.q), J(), this.bB, this.cw).show();
            }
            this.bO = new gek(J(), this, this.br);
            jjn jjnVar = this.bH.b;
            if (jjnVar != null && jjnVar.b()) {
                this.bJ = true;
                gek gekVar = this.bO;
                begl beglVar2 = this.bH;
                gekVar.c = beglVar2.b;
                begj b = beglVar2.b();
                b.c = null;
                this.bH = b.a();
            }
            if (bundle == null) {
                this.aY.a(bo());
            }
            if (this.bC.b() || this.ae.getEnableFeatureParameters().aJ) {
                this.by.a(dcdc.f(bzqb.LOCATION_HISTORY));
            }
            this.by.b(bzqb.WEB_AND_APP_ACTIVITY, new dbsz(this) { // from class: bdwv
                private final bdyb a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    this.a.bA.c(((UdcCacheResponse.UdcSetting) obj).b == 2, 2);
                }
            });
        } catch (IOException | ClassCastException | NullPointerException e2) {
            i(e2);
            super.l(bundle);
        }
    }
}
