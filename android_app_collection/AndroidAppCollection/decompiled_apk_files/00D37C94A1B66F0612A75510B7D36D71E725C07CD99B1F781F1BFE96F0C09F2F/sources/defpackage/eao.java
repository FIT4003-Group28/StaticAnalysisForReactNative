package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchResultsController;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.search.MusicSearchSuggestionsController;
import com.google.android.apps.youtube.app.mdx.tvsignin.MdxAssistedTvSignInDialogFragmentController;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.PlayerCollapsedStateMonitor;
import com.google.android.libraries.youtube.commerce.red.entity.LayerableFilterEntityController;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: eao  reason: default package */
/* loaded from: classes3.dex */
public final class eao implements axnp, axoj, axom {
    public final azqb A;
    public final azqb B;
    public final azqb C;
    public final azqb D;
    public final azqb E;
    public final azqb F;
    public final azqb G;
    public final azqb H;
    public final azqb I;

    /* renamed from: J  reason: collision with root package name */
    public final azqb f201J;
    public final azqb K;
    public final azqb L;
    public final azqb M;
    public final azqb N;
    public final azqb O;
    public final azqb P;
    public final azqb Q;
    public final azqb R;
    public final azqb S;
    public final azqb T;
    public final azqb U;
    public final azqb V;
    public final azqb W;
    public final azqb X;
    public final azqb Y;
    public final azqb Z;
    public final dp a;
    public final azqb aA;
    public final azqb aB;
    public final azqb aC;
    public final azqb aD;
    public final azqb aE;
    public final azqb aF;
    public final azqb aG;
    public final azqb aH;
    public final azqb aI;
    public final azqb aJ;
    public final azqb aK;
    public final azqb aL;
    public final azqb aM;
    public final azqb aN;
    public final azqb aO;
    public final azqb aP;
    public final eam aQ;
    private final azqb aR;
    private final azqb aS;
    private final azqb aT;
    private final azqb aU;
    private final azqb aV;
    private final azqb aW;
    private final azqb aX;
    private final azqb aY;
    private final azqb aZ;
    public final azqb aa;
    public final azqb ab;
    public final azqb ac;
    public final azqb ad;
    public final azqb ae;
    public final azqb af;
    public final azqb ag;
    public final azqb ah;
    public final azqb ai;
    public final azqb aj;
    public final azqb ak;
    public final azqb al;
    public final azqb am;
    public final azqb an;
    public final azqb ao;
    public final azqb ap;
    public final azqb aq;
    public final azqb ar;
    public final azqb as;
    public final azqb at;
    public final azqb au;
    public final azqb av;
    public final azqb aw;
    public final azqb ax;
    public final azqb ay;
    public final azqb az;
    public final dyo b;
    private final azqb ba;
    private final azqb bb;
    private final azqb bc;
    private final azqb bd;
    private final azqb be;
    private final azqb bf;
    private final azqb bg;
    private final azqb bh;
    private final azqb bi;
    private final azqb bj;
    private final azqb bk;
    private final azqb bl;
    private final eao bm;
    public final dwq c;
    public final azqb d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final azqb h;
    public final azqb i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final azqb m;
    public final azqb n;
    public final azqb o;
    public final azqb p;
    public final azqb q;
    public final azqb r;
    public final azqb s;
    public final azqb t;
    public final azqb u;
    public final azqb v;
    public final azqb w;
    public final azqb x;
    public final azqb y;
    public final azqb z;

    public eao() {
    }

    public eao(dyo dyoVar, eam eamVar, dwq dwqVar, dp dpVar) {
        this();
        this.bm = this;
        this.b = dyoVar;
        this.aQ = eamVar;
        this.c = dwqVar;
        this.a = dpVar;
        this.d = new dxb(this, 0);
        this.e = new dxb(this, 1);
        this.f = new dxb(this, 2);
        this.g = axot.b(new dxb(this, 4));
        this.h = axot.b(new dxb(this, 3));
        this.i = axot.b(new dxb(this, 5));
        this.j = axot.b(new dxb(this, 6));
        this.k = axot.b(new dxb(this, 7));
        axos axosVar = new axos();
        this.l = axosVar;
        this.m = new dxb(this, 9);
        this.n = axpb.a(new dxb(this, 11));
        this.o = axpb.a(new dxb(this, 12));
        this.aR = axot.b(new dxb(this, 14));
        this.aS = axot.b(new dxb(this, 15));
        this.p = axot.b(new dxb(this, 13));
        this.q = axot.b(new dxb(this, 16));
        axos axosVar2 = new axos();
        this.r = axosVar2;
        this.s = axot.b(new dxb(this, 19));
        this.t = new dxb(this, 18);
        axos.a(axosVar2, axot.b(new dxb(this, 17)));
        this.u = new dxb(this, 20);
        this.aT = new dxb(this, 10);
        axos.a(axosVar, axot.b(new dxb(this, 8)));
        this.v = axot.b(new dxb(this, 21));
        this.w = axot.b(new dxb(this, 22));
        this.x = axot.b(new dxb(this, 23));
        this.y = axot.b(new dxb(this, 24));
        this.z = new dxb(this, 25);
        this.A = new dxb(this, 26);
        this.B = new dxb(this, 27);
        this.C = new dxb(this, 28);
        this.D = axot.b(new dxb(this, 30));
        this.E = axot.b(new dxb(this, 32));
        this.F = axot.b(new dxb(this, 31));
        this.G = axot.b(new dxb(this, 33));
        axos axosVar3 = new axos();
        this.H = axosVar3;
        this.I = axot.b(new dxb(this, 35));
        this.f201J = new dxb(this, 34);
        this.K = new dxb(this, 36);
        this.L = axot.b(new dxb(this, 37));
        axos.a(axosVar3, axot.b(new dxb(this, 29)));
        this.M = new dxb(this, 38);
        this.N = new dxb(this, 39);
        this.O = new dxb(this, 40);
        this.P = new dxb(this, 42);
        this.Q = new dxb(this, 44);
        this.R = new dxb(this, 43);
        this.S = axot.b(new dxb(this, 45));
        this.T = new dxb(this, 41);
        this.U = axot.b(new dxb(this, 46));
        this.V = axot.b(new dxb(this, 47));
        this.W = new dxb(this, 48);
        this.X = new dxb(this, 49);
        this.aU = new dxb(this, 51);
        this.aV = new dxb(this, 50);
        this.Y = axot.b(new dxb(this, 52));
        this.aW = new dxb(this, 53);
        this.Z = axot.b(new dxb(this, 54));
        this.aX = axot.b(new dxb(this, 56));
        this.aa = axot.b(new dxb(this, 55));
        this.ab = axot.b(new dxb(this, 57));
        dxb dxbVar = new dxb(this, 58);
        this.aY = dxbVar;
        this.ac = axot.b(dxbVar);
        this.ad = new dxb(this, 59);
        this.ae = axot.b(new dxb(this, 60));
        this.af = axot.b(new dxb(this, 61));
        this.ag = new dxb(this, 62);
        this.ah = new dxb(this, 63);
        this.ai = new dxb(this, 64);
        this.aZ = axot.b(new dxb(this, 66));
        this.ba = axot.b(new dxb(this, 69));
        this.bb = axot.b(new dxb(this, 68));
        this.bc = axot.b(new dxb(this, 74));
        this.aj = axot.b(new dxb(this, 73));
        this.ak = axpb.a(new dxb(this, 75));
        this.bd = axot.b(new dxb(this, 72));
        axos axosVar4 = new axos();
        this.al = axosVar4;
        this.am = axot.b(new dxb(this, 71));
        this.be = axot.b(new dxb(this, 70));
        this.bf = axot.b(new dxb(this, 67));
        axos.a(axosVar4, axot.b(new dxb(this, 65)));
        this.bg = new dxb(this, 77);
        this.bh = new dxb(this, 78);
        this.an = new dxb(this, 80);
        this.bi = new dxb(this, 79);
        this.bj = new dxb(this, 81);
        this.ao = new dxb(this, 76);
        this.ap = new dxb(this, 82);
        this.aq = new dxb(this, 83);
        this.ar = new dxb(this, 84);
        this.as = new dxb(this, 85);
        this.at = axot.b(new dxb(this, 86));
        this.au = axot.b(new dxb(this, 87));
        this.av = axot.b(new dxb(this, 88));
        this.aw = axot.b(new dxb(this, 89));
        this.ax = axot.b(new dxb(this, 90));
        this.ay = new dxb(this, 91);
        this.az = new dxb(this, 92);
        this.aA = new dxb(this, 93);
        this.aB = new dxb(this, 94);
        this.aC = new dxb(this, 95);
        this.bk = new dxb(this, 97);
        this.aD = new dxb(this, 96);
        this.aE = new dxb(this, 98);
        this.aF = new dxb(this, 99);
        this.bl = new dxb(this, 100);
        this.aG = new dxb(this, 101);
        this.aH = axot.b(new dxb(this, 103));
        this.aI = axot.b(new dxb(this, 102));
        this.aJ = axot.b(new dxb(this, 105));
        this.aK = axot.b(new dxb(this, 104));
        this.aL = new dxb(this, 106);
        this.aM = new dxb(this, 107);
        this.aN = axot.b(new dxb(this, 108));
        this.aO = axot.b(new dxb(this, 109));
        this.aP = axot.b(new dxb(this, 110));
    }

    public final hut A() {
        hut hutVar = (hut) ((dya) r()).l.get();
        axzl.o(hutVar);
        return hutVar;
    }

    public final hvd B() {
        hvd hvdVar = (hvd) ((dya) r()).n.get();
        axzl.o(hvdVar);
        return hvdVar;
    }

    public final hvn C() {
        hvn hvnVar = (hvn) hqb.f(this.a, hvn.class);
        axzl.o(hvnVar);
        return hvnVar;
    }

    public final hvy D() {
        return new hvy(this.a, (zqw) this.aR.get(), new hwk(this.c.a()), new gtx(), (hvx) this.aS.get(), this.b.cI(), (aadd) this.b.K.get(), new hwh((acth) this.c.L.get(), new hwd(this.c.a()), new hwl(this.c.a())), (akge) this.c.af.get(), (vne) this.b.a.n.get(), this.c.cv());
    }

    public final iou E() {
        iou iouVar = (iou) this.a;
        axzl.o(iouVar);
        return iouVar;
    }

    public final ioy F() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        dyo dyoVar = this.b;
        azqb azqbVar2 = dyoVar.je;
        azqb azqbVar3 = dwqVar.as;
        azqb azqbVar4 = dwqVar.dO;
        azqb azqbVar5 = dwqVar.gu;
        azqb azqbVar6 = dwqVar.gV;
        azqb azqbVar7 = dwqVar.L;
        azqb azqbVar8 = dwqVar.gX;
        azqb azqbVar9 = dyoVar.yH;
        azqb azqbVar10 = dwqVar.H;
        azqb azqbVar11 = dwqVar.aq;
        azqb azqbVar12 = dwqVar.ab;
        return new ioy(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar12, dyoVar.a.t);
    }

    public final MdxAssistedTvSignInDialogFragmentController G() {
        return new MdxAssistedTvSignInDialogFragmentController((dt) this.c.s.get(), (advc) this.c.jC.get(), (adux) this.b.a.af.get(), (SharedPreferences) this.b.t.get(), (acwu) this.b.iH.get(), (snc) this.b.v.get());
    }

    public final ixr H() {
        return new ixr(axot.a(this.aW), axot.a(this.c.A), axot.a(this.c.mi), axot.a(this.c.j), axot.a(this.b.jq), axot.a(this.b.ym), axot.a(this.c.fR), (acwn) this.b.mz.get());
    }

    public final iyh I() {
        Activity a = this.c.a();
        dyo dyoVar = this.b;
        azqb azqbVar = dyoVar.ki;
        adoa adoaVar = (adoa) dyoVar.jq.get();
        return new iyh(a, azqbVar);
    }

    public final iyp J() {
        return new iyp((adoa) this.b.jq.get(), this.c.ir(), this.c.ip(), (aiaq) this.ba.get());
    }

    public final iyu K() {
        return new iyu((aafo) this.c.H.get(), (aafi) this.bd.get(), (adoa) this.b.jq.get(), axot.a(this.al));
    }

    public final iza L() {
        Activity a = this.c.a();
        yni yniVar = (yni) this.b.y.get();
        adoa adoaVar = (adoa) this.b.jq.get();
        azqb azqbVar = this.aZ;
        iyq iyqVar = (iyq) this.bf.get();
        izq izqVar = (izq) this.c.ab.get();
        nja njaVar = (nja) this.c.mx.get();
        fsc fscVar = (fsc) this.c.iH.get();
        izr izrVar = (izr) this.c.my.get();
        izb izbVar = (izb) this.c.iT.get();
        gbq gbqVar = (gbq) this.c.l.get();
        oet oetVar = (oet) this.c.aF.get();
        Activity a2 = this.c.a();
        dyo dyoVar = this.b;
        azqb azqbVar2 = dyoVar.ki;
        adoa adoaVar2 = (adoa) dyoVar.jq.get();
        dwq dwqVar = this.c;
        return new iza(a, yniVar, adoaVar, azqbVar, iyqVar, izqVar, njaVar, fscVar, izrVar, izbVar, gbqVar, oetVar, new nwi(a2, azqbVar2, adoaVar2, dwqVar.o, (niz) dwqVar.ab.get(), (aacz) this.b.D.get()), (nxh) this.c.r.get(), this.c.gM);
    }

    public final jfb M() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        dyo dyoVar = this.b;
        return new jfb(azqbVar, dyoVar.kC, dwqVar.kS, dwqVar.fH, this.bg, this.bh, this.bi, this.bj, dyoVar.gS, dyoVar.K);
    }

    public final jfg N() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        dyo dyoVar = this.b;
        return new jfg(azqbVar, dyoVar.kC, dwqVar.kS, dwqVar.fH, this.bi, this.bj, dyoVar.gS, dyoVar.K, dwqVar.cW);
    }

    public final jlh O() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        azqb azqbVar2 = dwqVar.jd;
        dyo dyoVar = this.b;
        return new jlh(azqbVar, azqbVar2, dyoVar.y, dyoVar.gS, dyoVar.gB, dyoVar.kC, dwqVar.lt, dyoVar.zV, dwqVar.H, dyoVar.od, dwqVar.kX, dyoVar.nz, dyoVar.v, dyoVar.nA, dyoVar.le, dyoVar.kH);
    }

    public final jsz P() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.dE;
        azqb azqbVar2 = dwqVar.hg;
        dyo dyoVar = this.b;
        return new jsz(azqbVar, azqbVar2, dyoVar.a.aT, dyoVar.y, dyoVar.je, dwqVar.ia, dwqVar.hY, dyoVar.K, dyoVar.yK, dyoVar.Aa);
    }

    public final jvx Q() {
        return new jvx((ezh) this.c.A.get(), (aizp) this.b.jI.get());
    }

    public final kpn R() {
        return new kpn(this.c.H, this.b.lV);
    }

    public final lox S() {
        return new lox(this.c.k);
    }

    public final lpj T() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.ah;
        dyo dyoVar = this.b;
        return new lpj(azqbVar, dyoVar.y, dyoVar.je, dwqVar.dc, dyoVar.v, dwqVar.ie, dwqVar.im, dwqVar.id);
    }

    public final lpr U() {
        dwq dwqVar = this.c;
        return new lpr(dwqVar.ah, this.b.y, dwqVar.il, dwqVar.cd);
    }

    public final lqi V() {
        return new lqi(axoz.b(this.c.iR), axoz.b(this.c.iE), axoz.b(this.c.iD));
    }

    public final ltk W() {
        azqb b = axoz.b(this.c.iR);
        dwq dwqVar = this.c;
        return new ltk(b, dwqVar.iE, dwqVar.iD);
    }

    public final lva X() {
        return new lva(this.b.zt, this.c.f, this.aU);
    }

    public final lve Y() {
        return new lve((aafo) this.c.H.get(), (lya) this.b.zt.get(), (acth) this.c.L.get());
    }

    public final lwm Z() {
        Activity a = this.c.a();
        LinearLayout linearLayout = (LinearLayout) this.c.iK.get();
        ajyi ajyiVar = (ajyi) this.c.ah.get();
        ajsg iK = this.c.iK();
        aafo aafoVar = (aafo) this.c.H.get();
        azqb azqbVar = this.c.mr;
        return new lxc(a, linearLayout, ajyiVar, aafoVar, iK, (ajte) azqbVar.get(), aaji.c(((iou) this.aX.get()).aM()), (aacz) this.b.D.get(), axot.a(this.c.cd), this.c.iz(), (LayerableFilterEntityController) this.c.jz.get());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, enw] */
    public final enr a() {
        PackageManager packageManager = (PackageManager) this.b.a.aV.get();
        ?? gY = this.b.gY();
        ent entVar = (ent) this.c.eT.get();
        dwq dwqVar = this.c;
        return new enr(packageManager, gY, entVar, dwqVar.o, dwqVar.mI, this.b.my);
    }

    public final abtt aA() {
        return new abtt(this.c.a());
    }

    public final addf aB() {
        return new addf(this.a, this.b.cI(), (adnq) this.b.jK.get());
    }

    public final adtw aC() {
        return new adtw(this.a, (wal) this.b.au.get(), (ajmy) this.b.kC.get(), (afvn) this.b.au.get(), (adux) this.b.a.af.get(), this.b.cI());
    }

    public final aduv aD() {
        adux aduxVar = (adux) this.b.a.af.get();
        acsx cI = this.b.cI();
        dp dpVar = this.a;
        ankw ankwVar = (ankw) this.b.h.get();
        afvn afvnVar = (afvn) this.b.au.get();
        acwu acwuVar = (acwu) this.b.iH.get();
        dyo dyoVar = this.b;
        return new aduv(aduxVar, cI, dpVar, ankwVar, afvnVar, acwuVar, dyoVar.b.a, (airr) dyoVar.fO.get(), (adoa) this.b.jq.get());
    }

    public final aiop aE() {
        Activity a = this.c.a();
        return new aiop(a, new aiom(a, (ScheduledExecutorService) this.b.h.get(), (afvn) this.b.au.get(), (vzc) this.b.hY.get()));
    }

    public final akfc aF() {
        return new akfb((akge) this.aJ.get(), (aafo) this.c.H.get(), (gfz) this.c.ds.get(), (aacz) this.b.D.get());
    }

    public final akfc aG() {
        return new akfb((akge) this.aH.get(), (aafo) this.c.H.get(), (gfz) this.c.ds.get(), (aacz) this.b.D.get());
    }

    public final akge aH() {
        return new akge(this.c.je(), (aafo) this.c.H.get(), (acth) this.c.L.get());
    }

    public final akge aI() {
        return new akge(this.c.je(), (aafo) this.c.H.get(), (acth) this.c.L.get());
    }

    @Override // defpackage.axnp
    public final axnq aJ() {
        return this.c.jv();
    }

    public final Optional aK() {
        return Optional.ofNullable(((ico) this.E.get()).bg);
    }

    public final Object aL() {
        return new hbo(((hfn) this.c.hB.get()).b(), (ayor) this.b.iz.get());
    }

    public final Object aM() {
        return new hbq((ajmy) this.b.kC.get());
    }

    public final Object aN() {
        azqb azqbVar = this.l;
        azqb azqbVar2 = this.k;
        azqb azqbVar3 = this.m;
        dyo dyoVar = this.b;
        dxs dxsVar = dyoVar.a;
        hct hctVar = new hct(azqbVar, azqbVar2, azqbVar3, dxsVar.P, dxsVar.Q, dxsVar.aD, dyoVar.yP);
        azqb azqbVar4 = this.aT;
        azqb azqbVar5 = this.k;
        azqb azqbVar6 = this.r;
        acsx cI = this.b.cI();
        ypf az = az();
        ayor ayorVar = (ayor) this.b.iz.get();
        hkl hklVar = (hkl) this.b.yP.get();
        tmn tmnVar = (tmn) this.b.a.P.get();
        tmm tmmVar = (tmm) this.b.a.Q.get();
        return new hbv(hctVar, azqbVar4, azqbVar5, azqbVar6, cI, az, ayorVar, hklVar);
    }

    public final Object aO() {
        Activity a = this.c.a();
        azqb azqbVar = this.b.ki;
        izu izuVar = new izu();
        azqb azqbVar2 = this.bb;
        dyo dyoVar = this.b;
        jaa jaaVar = new jaa(dyoVar.jq, dyoVar.ki);
        iyo iyoVar = new iyo(this.b.jq);
        ajyc iQ = this.c.iQ();
        izq izqVar = (izq) this.c.ab.get();
        return new iyj(a, azqbVar, izuVar, azqbVar2, jaaVar, iyoVar, iQ, (oeq) this.be.get(), (acwu) this.b.iH.get(), (airw) this.c.n.get(), this.c.H);
    }

    public final Object aP() {
        airr ir = this.c.ir();
        aire ip = this.c.ip();
        this.c.a();
        dyo dyoVar = this.b;
        ahze ahzeVar = new ahze(dyoVar.fO, dyoVar.y, dyoVar.jA);
        adoa adoaVar = (adoa) this.b.jq.get();
        this.b.cI();
        iyk iykVar = new iyk(adoaVar);
        iykVar.i(ahzeVar.a(iykVar, iykVar));
        Optional.of(new iyp(adoaVar, ir, ip, iykVar));
        return iykVar;
    }

    public final Object aQ() {
        return new iyr(this.c.ir(), this.bc, (yzj) this.b.je.get());
    }

    public final Object aR() {
        return new iys((izq) this.c.ab.get());
    }

    public final Map aS() {
        amum i = amup.i(40);
        i.f("EnableInteractionLoggingCrashes", new zcq((yve) this.b.a.bF.c.fg.get(), aber.p, aapz.q));
        final kjo aj = this.b.aj();
        i.f("accessibility_player_setting_key", new zch((vne) this.b.xk.get(), fdj.r, new ampg() { // from class: lij
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return Boolean.valueOf(kjo.this.a((kkb) obj));
            }
        }));
        this.b.aj();
        i.f("accessibility_hide_player_controls_setting_key", new zch((vne) this.b.xk.get(), fdj.s, new lhh(3)));
        i.f("data_saving_mode_key", new zcq((yve) this.b.a.al.get(), fdj.u, lhh.d));
        i.f("data_saving_pref_video_quality_key", new ljg((yve) this.b.a.al.get(), (yve) this.b.fW.get(), 1));
        dyo dyoVar = this.b;
        i.f("data_saving_pref_download_quality_key", new lja((yve) dyoVar.a.al.get(), dyoVar.hf, (SharedPreferences) this.b.t.get()));
        i.f("data_saving_pref_download_wifi_only_key", new ljb((SharedPreferences) this.b.t.get(), (yve) this.b.a.al.get()));
        dyo dyoVar2 = this.b;
        i.f("data_saving_pref_upload_wifi_only_key", new ljc((SharedPreferences) this.b.t.get(), dyoVar2.b.a, (yve) dyoVar2.a.al.get()));
        i.f("data_saving_imp_wifi_only_key", new ljg((yve) this.b.a.al.get(), (yve) this.b.iy.get()));
        i.f("data_saving_pref_select_quality_every_video_key", new zcq((yve) this.b.a.al.get(), fdj.t, lhh.e));
        i.f(ahfo.QUICK_SEEK_PREFERENCE_STRING, new zcq((yve) this.b.hX.get(), agvc.i, ahja.u));
        i.f(ahfn.NERD_STATS_ENABLED, new zcq((yve) this.b.hX.get(), agvc.h, ahja.t));
        final WillAutonavInformer willAutonavInformer = (WillAutonavInformer) this.b.ia.get();
        agvc agvcVar = agvc.g;
        willAutonavInformer.getClass();
        i.f(ahfn.AUTONAV, new zcq((yve) this.b.hX.get(), agvcVar, new ampg() { // from class: aihe
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                return Boolean.valueOf(WillAutonavInformer.this.g((awvc) obj));
            }
        }));
        i.f("BypassFrequencyCap", new zcq((yve) this.b.xH.get(), agvc.m, aiyy.l));
        i.f("SetCustomInterval", new zcq((yve) this.b.xH.get(), agvc.n, aiyy.m));
        i.f("voice_language", new zch((vne) this.b.a.S.get(), fdj.o, jvb.s));
        i.f(etk.PIP_POLICY, new lff(this.b.xB));
        final eoj eojVar = (eoj) this.b.gX();
        i.f(eog.BACKGROUND_AUDIO_POLICY, new zcq((yve) this.b.vw.get(), new yjc() { // from class: eoh
            @Override // defpackage.yjc
            public final Object a(Object obj, Object obj2) {
                aopa mo52toBuilder = ((eof) obj).mo52toBuilder();
                eoe a = eoj.this.a((String) obj2);
                mo52toBuilder.copyOnWrite();
                eof eofVar = (eof) mo52toBuilder.instance;
                eofVar.c = a.e;
                eofVar.b |= 1;
                return (eof) mo52toBuilder.mo39build();
            }
        }, new ampg() { // from class: eoi
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                eoj eojVar2 = eoj.this;
                eoe a = eoe.a(((eof) obj).c);
                if (a == null) {
                    a = eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                return eojVar2.b(a);
            }
        }));
        final aadd aaddVar = (aadd) this.b.K.get();
        i.f("inline_global_play_pause", new zcq((yve) this.b.iy.get(), fdj.p, new ampg() { // from class: lfr
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aadd aaddVar2 = aadd.this;
                fgu fguVar = (fgu) obj;
                if ((fguVar.b & 4) != 0) {
                    return String.valueOf(fguVar.e);
                }
                return String.valueOf(fyx.a(aaddVar2));
            }
        }));
        i.f("innertube_safety_mode_enabled", new aadz((abfh) this.b.r.get()));
        i.f("offline_recs_enabled", new lff(this.b.gY, 1));
        dyo dyoVar3 = this.b;
        i.f("smart_downloads_opted_in", new fdc(dyoVar3.gY, dyoVar3.au));
        i.f("premium_filters_hd", new zcq((yve) this.b.a.be.get(), lto.j, wdp.p));
        i.f("premium_filters_live", new zcq((yve) this.b.a.be.get(), lto.k, wdp.q));
        i.f("premium_filters_360", new zcq((yve) this.b.a.be.get(), lto.h, ydy.b));
        i.f("premium_filters_4k", new zcq((yve) this.b.a.be.get(), lto.i, ydy.a));
        i.f("premium_filters_recent_upload_one_day", new zcq((yve) this.b.a.be.get(), lto.m, wdp.s));
        i.f("premium_filters_recent_upload_one_week", new zcq((yve) this.b.a.be.get(), lto.n, wdp.t));
        i.f("premium_filters_short_video", new zcq((yve) this.b.a.be.get(), lto.o, wdp.u));
        i.f("premium_filters_long_video", new zcq((yve) this.b.a.be.get(), lto.l, wdp.r));
        i.f("snap_zoom_initially_zoomed", new zcq((yve) this.b.iy.get(), fdj.q, lhh.c));
        i.f("app_theme_dark", new zcq((yve) this.b.ez.get(), fdj.i, fuj.o));
        i.f("app_theme_appearance", new zcq((yve) this.b.ez.get(), fdj.j, fuj.n));
        i.f(aeas.LIMIT_MOBILE_DATA_USAGE, new zcq((yve) this.b.fW.get(), lto.b, lhh.j));
        i.f("mobile_video_quality_auto_key", lmr.b((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_UNKNOWN));
        i.f("mobile_video_quality_high_key", lmr.b((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY));
        i.f("mobile_video_quality_low_key", lmr.b((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_DATA_SAVER));
        i.f("wifi_video_quality_auto_key", lmr.c((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_UNKNOWN));
        i.f("wifi_video_quality_high_key", lmr.c((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_HIGHER_QUALITY));
        i.f("wifi_video_quality_low_key", lmr.c((yve) this.b.fW.get(), awan.VIDEO_QUALITY_SETTING_DATA_SAVER));
        return i.b();
    }

    @Override // defpackage.axoj
    public final dye aT() {
        return new dye(this.b, this.bm);
    }

    public final mht aU() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        dyo dyoVar = this.b;
        return new mht(azqbVar, dyoVar.y, dwqVar.jd, dyoVar.kC, dyoVar.gS, dyoVar.as, dyoVar.hf, dwqVar.H, dwqVar.kX, dyoVar.nz, 1);
    }

    public final lyu aa() {
        return new lyu(this.c.iJ(), (ViewGroup) this.c.mt.get());
    }

    public final mfo ab() {
        return new mfo(this.c.a(), (frv) this.c.iR.get(), (ajxz) this.c.dy.get(), this.c.iO(), this.c.iV(), (ajmy) this.b.kC.get(), (gfu) this.b.eA.get());
    }

    public final mhd ac() {
        Activity a = this.c.a();
        ajmy ajmyVar = (ajmy) this.b.kC.get();
        ajxz ajxzVar = (ajxz) this.b.lV.get();
        aafo aafoVar = (aafo) this.c.H.get();
        gem aT = this.c.aT();
        aknx aknxVar = (aknx) this.c.hR.get();
        return new mhd(a, ajmyVar, ajxzVar, aafoVar, aT, (akfb) this.c.dt.get(), (faq) this.c.kT.get(), (akem) this.c.kU.get(), ay(), (acth) this.c.L.get());
    }

    public final nef ad() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        azqb azqbVar2 = dwqVar.H;
        dyo dyoVar = this.b;
        return new nef(azqbVar, azqbVar2, dyoVar.y, dyoVar.lV);
    }

    public final ngu ae() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        azqb azqbVar2 = dwqVar.mf;
        azqb azqbVar3 = this.aV;
        dyo dyoVar = this.b;
        return new ngu(azqbVar, azqbVar2, azqbVar3, dyoVar.mY, dyoVar.x, dwqVar.gF);
    }

    public final ngy af() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        dyo dyoVar = this.b;
        return new ngy(azqbVar, dyoVar.zt, dyoVar.y, dwqVar.mf, this.aV);
    }

    public final nhg ag() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        azqb azqbVar2 = dwqVar.mf;
        azqb azqbVar3 = this.aV;
        dyo dyoVar = this.b;
        return new nhg(azqbVar, azqbVar2, azqbVar3, dyoVar.mY, dyoVar.x, dwqVar.gF, dwqVar.bb);
    }

    public final nhi ah() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        dyo dyoVar = this.b;
        return new nhi(azqbVar, dyoVar.y, dyoVar.zt, dwqVar.mf, this.aV);
    }

    public final nhk ai() {
        return new nhk(this.Y);
    }

    public final nhs aj() {
        dyo dyoVar = this.b;
        azqb azqbVar = dyoVar.it;
        dwq dwqVar = this.c;
        return new nhs(azqbVar, dwqVar.aa, dyoVar.y, dwqVar.mg, dwqVar.H, dyoVar.rN, dyoVar.yu, dyoVar.wx, dyoVar.zt);
    }

    public final nhv ak() {
        dwq dwqVar = this.c;
        return new nhv(dwqVar.H, dwqVar.mf, this.aV);
    }

    public final nhy al() {
        return new nhy(this.Y);
    }

    public final nik am() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.dt;
        dyo dyoVar = this.b;
        return new nik(azqbVar, dyoVar.lV, dyoVar.mi, dwqVar.ae);
    }

    public final nim an() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        dyo dyoVar = this.b;
        return new nim(azqbVar, dyoVar.y, dyoVar.zt, dwqVar.mf, this.aV);
    }

    public final PlayerCollapsedStateMonitor ao() {
        dwq dwqVar = this.c;
        return new PlayerCollapsedStateMonitor(dwqVar.gM, (CreatorEndscreenOverlayPresenter) dwqVar.eF.get(), (ahyp) this.c.by.get(), (yni) this.b.y.get(), (airw) this.c.n.get(), (aacz) this.b.D.get());
    }

    public final wbo ap() {
        dwq dwqVar = this.c;
        return new wbo(dwqVar.f, this.b.yG, dwqVar.H);
    }

    public final wbv aq() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        azqb azqbVar2 = this.bl;
        azqb azqbVar3 = dwqVar.cW;
        dyo dyoVar = this.b;
        return new wbv(azqbVar, azqbVar2, azqbVar, azqbVar3, dyoVar.an, dyoVar.I);
    }

    public final wcf ar() {
        return new wcf(this.c.f);
    }

    public final wcv as() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.f;
        azqb azqbVar2 = this.bl;
        dyo dyoVar = this.b;
        azqb azqbVar3 = dyoVar.au;
        return new wcv(azqbVar, azqbVar2, azqbVar3, azqbVar3, dyoVar.kC, dyoVar.a.bj, azqbVar, dwqVar.cW, dwqVar.H, dyoVar.an);
    }

    public final wet at() {
        wet f = tfq.f(this.c.a(), (afwc) this.b.vo.get(), (ajmy) this.b.kC.get(), (yrj) this.b.as.get(), (afvn) this.b.au.get(), this.bk, (yzv) this.b.jc.get(), (whp) this.b.df.get(), (wge) this.b.mH.get(), (aasc) this.b.mG.get(), this.c.iU(), (ajxz) this.b.lV.get(), (acth) this.c.L.get());
        f.j = (ajgr) this.b.wZ.get();
        return f;
    }

    public final wfc au() {
        return tfq.g(this.c.a(), (ajmy) this.b.kC.get(), (ajxz) this.b.lV.get(), (aafo) this.c.H.get(), (acth) this.c.L.get());
    }

    public final wiy av() {
        return tfq.h(this.c.a(), this.c.ke());
    }

    public final xzf aw() {
        return new xzf(this.c.f);
    }

    public final yaa ax() {
        dwq dwqVar = this.c;
        return new yaa(dwqVar.f, dwqVar.cW);
    }

    public final yfk ay() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.H;
        dyo dyoVar = this.b;
        return new yfk(azqbVar, dyoVar.lV, dyoVar.dD, dyoVar.zQ, axoz.b(dwqVar.gX));
    }

    public final ypf az() {
        apu lifecycle = this.a.getLifecycle();
        axzl.o(lifecycle);
        return new ypf(lifecycle);
    }

    public final fhh b() {
        return new fhh(this.c.ee);
    }

    public final fls c() {
        return new fls(this.c.a(), this.c.aT(), this.c.iJ());
    }

    public final fvf d() {
        return new fvf((fud) this.ae.get(), (Handler) this.b.an.get());
    }

    public final fzx e() {
        return new fzx(f());
    }

    public final gac f() {
        return gad.a(this.c.a(), (afvn) this.b.au.get(), (afwc) this.b.vo.get(), (aaxt) this.b.jG.get(), (yzj) this.b.je.get(), (yni) this.b.y.get(), (yrj) this.b.as.get(), (yzv) this.b.jc.get(), (aafo) this.c.H.get(), (Executor) this.b.x.get());
    }

    public final gah g() {
        return new gah(this.c.a(), new ajsn(), (yni) this.b.y.get());
    }

    public final gyq h() {
        return ((hci) this.l.get()).a();
    }

    public final gzb i() {
        return new gzb(this.a, amup.l(1, new hcp(this.l), 0, new gzd(this.p, (hba) this.q.get(), (gzf) this.k.get())), (gzf) this.k.get(), (hba) this.q.get());
    }

    public final hdq j() {
        return new hdq((dt) this.c.s.get());
    }

    public final hgi k() {
        dwq dwqVar = this.c;
        azqb azqbVar = dwqVar.s;
        azqb azqbVar2 = dwqVar.gd;
        azqb azqbVar3 = dwqVar.hB;
        dyo dyoVar = this.b;
        return new hgi(azqbVar, azqbVar2, azqbVar3, dyoVar.kC, dwqVar.lS, dyoVar.yP);
    }

    public final hhc l() {
        return new hhc(this.c.h(), (Executor) this.b.x.get(), this.b.cI(), (hfn) this.c.hB.get(), (hew) this.c.hz.get(), (ajmy) this.b.kC.get(), (hkl) this.b.yP.get(), (eo) this.c.t.get(), (hey) this.c.lS.get());
    }

    public final MusicSearchResultsController m() {
        return new MusicSearchResultsController(this.c.a(), this.c.iK(), new ajyx(), (yni) this.b.y.get(), (acth) this.c.L.get(), this.c.iT(), (yzj) this.b.je.get(), (ajyi) this.c.ah.get(), (aadd) this.b.K.get(), (aynx) this.b.yK.get(), (abcx) this.b.a.aF.get(), (Executor) this.b.h.get(), (Executor) this.b.x.get(), (akho) this.c.lV.get(), this.c.aU(), this.c.iH(), (tdu) this.b.xx.get());
    }

    public final MusicSearchSuggestionsController n() {
        return new MusicSearchSuggestionsController(this.c.a(), this.c.iK(), new ajyx(), (yni) this.b.y.get(), (acth) this.c.L.get(), this.c.iT(), (yzj) this.b.je.get(), (ajyi) this.c.ah.get(), (aadd) this.b.K.get(), (aynx) this.b.yK.get(), this.c.jk(), this.c.jj());
    }

    public final hip o() {
        return new hip((aafo) this.c.H.get(), (ajxz) this.b.lV.get(), (acth) this.c.L.get(), (gfu) this.b.eA.get());
    }

    public final hlj p() {
        return new hlj(this.c.a());
    }

    public final hnw q() {
        hnw hnwVar = (hnw) hqb.f(this.a, hnw.class);
        axzl.o(hnwVar);
        return hnwVar;
    }

    public final hqt r() {
        hqt f = hve.f(this.a);
        axzl.o(f);
        return f;
    }

    public final hra s() {
        hra hraVar = (hra) ((dya) r()).d.get();
        axzl.o(hraVar);
        return hraVar;
    }

    public final hrd t() {
        hrd hrdVar = (hrd) ((dya) r()).f.get();
        axzl.o(hrdVar);
        return hrdVar;
    }

    public final hrw u() {
        hrv hrvVar;
        Activity a = this.c.a();
        ajmy ajmyVar = (ajmy) this.b.kC.get();
        try {
            hrvVar = (hrv) hqb.f(this.a, hrv.class);
        } catch (IllegalStateException unused) {
            hrvVar = hmo.a;
        }
        axzl.o(hrvVar);
        return new hrw(a, ajmyVar, hrvVar);
    }

    public final hsq v() {
        hsq hsqVar = (hsq) ((dya) r()).g.get();
        axzl.o(hsqVar);
        return hsqVar;
    }

    public final hta w() {
        return new hta((vne) this.b.a.n.get());
    }

    public final htu x() {
        htu htuVar = (htu) ((dya) r()).e.get();
        axzl.o(htuVar);
        return htuVar;
    }

    public final hub y() {
        hub hubVar = (hub) ((dya) r()).h.get();
        axzl.o(hubVar);
        return hubVar;
    }

    public final hun z() {
        hun hunVar = (hun) ((dya) r()).i.get();
        axzl.o(hunVar);
        return hunVar;
    }
}
