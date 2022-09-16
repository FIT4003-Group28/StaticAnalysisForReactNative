package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxe  reason: default package */
/* loaded from: classes3.dex */
public final class dxe implements kpc {
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
    public final azqb f189J;
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
    public final dyo a;
    private final azqb aA;
    private final azqb aB;
    private final azqb aC;
    private final azqb aD;
    private final azqb aE;
    private final azqb aF;
    private final azqb aG;
    private final azqb aH;
    private final azqb aI;
    private final azqb aJ;
    private final azqb aK;
    private final azqb aL;
    private final azqb aM;
    private final azqb aN;
    private final azqb aO;
    private final azqb aP;
    private final azqb aQ;
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
    private final dxe ap = this;
    private final azqb aq;
    private final azqb ar;
    private final azqb as;
    private final azqb at;
    private final azqb au;
    private final azqb av;
    private final azqb aw;
    private final azqb ax;
    private final azqb ay;
    private final azqb az;
    public final azqb b;
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
    private final azqb bm;
    private final azqb bn;
    private final azqb bo;
    public final azqb c;
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

    public dxe(dyo dyoVar) {
        this.a = dyoVar;
        this.aq = axot.b(new dxd(dyoVar, this, 7));
        this.b = axot.b(new dxd(dyoVar, this, 6));
        this.c = axot.b(new dxd(dyoVar, this, 8));
        this.d = axot.b(new dxd(dyoVar, this, 5));
        this.ar = axot.b(new dxd(dyoVar, this, 4));
        this.as = axot.b(new dxd(dyoVar, this, 14));
        this.at = axot.b(new dxd(dyoVar, this, 17));
        this.e = axot.b(new dxd(dyoVar, this, 16));
        this.f = axot.b(new dxd(dyoVar, this, 15));
        this.g = axot.b(new dxd(dyoVar, this, 18));
        this.h = axot.b(new dxd(dyoVar, this, 13));
        this.i = axot.b(new dxd(dyoVar, this, 21));
        this.j = axot.b(new dxd(dyoVar, this, 20));
        axos axosVar = new axos();
        this.k = axosVar;
        this.l = axot.b(new dxd(dyoVar, this, 24));
        this.m = axot.b(new dxd(dyoVar, this, 25));
        this.n = axot.b(new dxd(dyoVar, this, 26));
        this.o = axot.b(new dxd(dyoVar, this, 27));
        this.p = axot.b(new dxd(dyoVar, this, 28));
        this.q = axot.b(new dxd(dyoVar, this, 29));
        this.r = axot.b(new dxd(dyoVar, this, 30));
        this.s = axot.b(new dxd(dyoVar, this, 31));
        this.t = axot.b(new dxd(dyoVar, this, 32));
        this.u = axot.b(new dxd(dyoVar, this, 33));
        this.v = axot.b(new dxd(dyoVar, this, 23));
        axos axosVar2 = new axos();
        this.w = axosVar2;
        this.x = axot.b(new dxd(dyoVar, this, 22));
        this.y = axot.b(new dxd(dyoVar, this, 36));
        this.z = axot.b(new dxd(dyoVar, this, 35));
        axos axosVar3 = new axos();
        this.A = axosVar3;
        this.B = axot.b(new dxd(dyoVar, this, 37));
        this.C = axot.b(new dxd(dyoVar, this, 34));
        axos.a(axosVar2, axot.b(new dxd(dyoVar, this, 19)));
        dxd dxdVar = new dxd(dyoVar, this, 38);
        this.au = dxdVar;
        this.D = axot.b(dxdVar);
        axos axosVar4 = new axos();
        this.E = axosVar4;
        this.F = axot.b(new dxd(dyoVar, this, 39));
        this.G = axot.b(new dxd(dyoVar, this, 41));
        this.H = axot.b(new dxd(dyoVar, this, 40));
        this.I = axot.b(new dxd(dyoVar, this, 44));
        this.f189J = axot.b(new dxd(dyoVar, this, 43));
        this.av = axot.b(new dxd(dyoVar, this, 45));
        this.K = axot.b(new dxd(dyoVar, this, 42));
        this.L = axot.b(new dxd(dyoVar, this, 47));
        axos axosVar5 = new axos();
        this.M = axosVar5;
        this.N = axot.b(new dxd(dyoVar, this, 49));
        this.O = axot.b(new dxd(dyoVar, this, 48));
        this.P = axot.b(new dxd(dyoVar, this, 46));
        this.Q = axot.b(new dxd(dyoVar, this, 50));
        this.R = axot.b(new dxd(dyoVar, this, 52));
        this.S = axot.b(new dxd(dyoVar, this, 51));
        this.T = axot.b(new dxd(dyoVar, this, 54));
        dxd dxdVar2 = new dxd(dyoVar, this, 53);
        this.aw = dxdVar2;
        this.U = axot.b(dxdVar2);
        this.V = axot.b(new dxd(dyoVar, this, 55));
        this.ax = axot.b(new dxd(dyoVar, this, 57));
        this.W = axot.b(new dxd(dyoVar, this, 56));
        this.X = axot.b(new dxd(dyoVar, this, 58));
        dxd dxdVar3 = new dxd(dyoVar, this, 59);
        this.ay = dxdVar3;
        this.Y = axot.b(dxdVar3);
        dxd dxdVar4 = new dxd(dyoVar, this, 60);
        this.az = dxdVar4;
        this.Z = axot.b(dxdVar4);
        this.aA = axot.b(new dxd(dyoVar, this, 62));
        this.aB = axot.b(new dxd(dyoVar, this, 63));
        this.aC = axot.b(new dxd(dyoVar, this, 64));
        this.aa = axot.b(new dxd(dyoVar, this, 61));
        this.ab = axot.b(new dxd(dyoVar, this, 66));
        this.ac = axot.b(new dxd(dyoVar, this, 65));
        this.ad = axot.b(new dxd(dyoVar, this, 67));
        this.ae = axot.b(new dxd(dyoVar, this, 68));
        axos.a(axosVar5, axot.b(new dxd(dyoVar, this, 12)));
        this.af = axot.b(new dxd(dyoVar, this, 11));
        dxd dxdVar5 = new dxd(dyoVar, this, 69);
        this.aD = dxdVar5;
        this.ag = axot.b(dxdVar5);
        dxd dxdVar6 = new dxd(dyoVar, this, 70);
        this.aE = dxdVar6;
        this.ah = axot.b(dxdVar6);
        dxd dxdVar7 = new dxd(dyoVar, this, 71);
        this.aF = dxdVar7;
        this.ai = axot.b(dxdVar7);
        dxd dxdVar8 = new dxd(dyoVar, this, 72);
        this.aG = dxdVar8;
        this.aj = axot.b(dxdVar8);
        this.aH = new dxd(dyoVar, this, 10);
        this.aI = axot.b(new dxd(dyoVar, this, 9));
        dxd dxdVar9 = new dxd(dyoVar, this, 73);
        this.aJ = dxdVar9;
        this.aK = axot.b(dxdVar9);
        this.aL = axot.b(new dxd(dyoVar, this, 74));
        this.aM = axot.b(new dxd(dyoVar, this, 75));
        this.aN = axot.b(new dxd(dyoVar, this, 76));
        this.aO = axot.b(new dxd(dyoVar, this, 77));
        axos.a(axosVar4, axot.b(new dxd(dyoVar, this, 3)));
        this.ak = new dxd(dyoVar, this, 78);
        this.aP = axot.b(new dxd(dyoVar, this, 80));
        this.aQ = axot.b(new dxd(dyoVar, this, 81));
        this.al = axot.b(new dxd(dyoVar, this, 79));
        axos.a(axosVar3, axot.b(new dxd(dyoVar, this, 2)));
        this.am = axot.b(new dxd(dyoVar, this, 82));
        dxd dxdVar10 = new dxd(dyoVar, this, 1);
        this.aR = dxdVar10;
        this.aS = axot.b(dxdVar10);
        dxd dxdVar11 = new dxd(dyoVar, this, 83);
        this.aT = dxdVar11;
        this.aU = axot.b(dxdVar11);
        this.aV = axot.b(new dxd(dyoVar, this, 86));
        this.aW = axot.b(new dxd(dyoVar, this, 85));
        this.aX = new dxd(dyoVar, this, 87);
        this.aY = axot.b(new dxd(dyoVar, this, 88));
        this.aZ = new dxd(dyoVar, this, 89);
        this.ba = new dxd(dyoVar, this, 90);
        this.bb = new dxd(dyoVar, this, 91);
        dxd dxdVar12 = new dxd(dyoVar, this, 93);
        this.bc = dxdVar12;
        this.bd = axot.b(dxdVar12);
        this.be = new dxd(dyoVar, this, 92);
        this.bf = new dxd(dyoVar, this, 94);
        dxd dxdVar13 = new dxd(dyoVar, this, 84);
        this.bg = dxdVar13;
        this.bh = axot.b(dxdVar13);
        this.bi = axot.b(new dxd(dyoVar, this, 95));
        axos.a(axosVar, axot.b(new dxd(dyoVar, this, 0)));
        new dxd(dyoVar, this, 96);
        this.bj = axot.b(new dxd(dyoVar, this, 97));
        this.bk = axot.b(new dxd(dyoVar, this, 98));
        this.bl = axot.b(new dxd(dyoVar, this, 99));
        this.bm = axot.b(new dxd(dyoVar, this, 100));
        this.an = axot.b(new dxd(dyoVar, this, 102));
        this.ao = axot.b(new dxd(dyoVar, this, 103));
        dxd dxdVar14 = new dxd(dyoVar, this, 101);
        this.bn = dxdVar14;
        this.bo = axot.b(dxdVar14);
    }

    @Override // defpackage.airs
    public final aipq A() {
        return (aipq) this.A.get();
    }

    public final aipw B() {
        return new aipw(this.ab, this.e, this.v, this.D, this.x, this.a.fH);
    }

    @Override // defpackage.airs
    public final aiqc C() {
        return (aiqc) this.k.get();
    }

    @Override // defpackage.airw
    public final aire D() {
        return (aire) this.O.get();
    }

    @Override // defpackage.airw
    public final airr E() {
        return (airr) this.M.get();
    }

    @Override // defpackage.airw
    public final aisl F() {
        return (aisl) this.S.get();
    }

    @Override // defpackage.airw
    public final aisp G() {
        return (aisp) this.L.get();
    }

    public final aisx H() {
        return new aisx((aipq) this.A.get());
    }

    public final aive I() {
        dyo dyoVar = this.a;
        aive e = aise.e(new aivb(dyoVar.ay, dyoVar.ll, dyoVar.gP), (aisp) this.L.get());
        e.a();
        return e;
    }

    public final aivo J() {
        aivo b = aizs.b(aivm.b((snc) this.a.v.get(), (Executor) this.a.h.get(), (afkf) this.a.gD.get(), aivg.c((tis) this.a.vt.get()), (aadd) this.a.K.get(), (ScheduledExecutorService) this.a.h.get()), (aisp) this.L.get(), (aynx) this.ax.get(), (aynx) this.av.get(), (aynx) this.e.get(), (aynx) this.b.get());
        b.a();
        return b;
    }

    @Override // defpackage.airw
    public final aivt K() {
        return (aivt) this.d.get();
    }

    public final aiwb L() {
        yni yniVar = (yni) this.a.y.get();
        dyo dyoVar = this.a;
        aiwb a = aiwc.a(yniVar, dyoVar.b.a, (aitm) dyoVar.iR.get(), (aiwy) this.as.get(), (ahfm) this.a.bd.get(), (ScheduledExecutorService) this.a.h.get(), (String) this.a.fa.get(), (ankt) this.a.lH.get(), axot.a(this.f), (aiix) this.a.fH.get());
        a.b((aynx) this.e.get(), (aynx) this.b.get(), (aynx) this.g.get(), (aiix) this.a.fH.get());
        return a;
    }

    @Override // defpackage.airw
    public final aiwb M() {
        return (aiwb) this.h.get();
    }

    public final aiwy N() {
        return new aiwy((ScheduledExecutorService) this.a.h.get(), (Executor) this.a.h.get(), (zie) this.a.uQ.get());
    }

    @Override // defpackage.airw
    public final aizn O() {
        return (aizn) this.bj.get();
    }

    @Override // defpackage.airs
    public final aizu P() {
        return (aizu) this.aP.get();
    }

    public final ajai Q() {
        return new ajai((yni) this.a.y.get(), as(), (bame) this.aL.get(), (bame) this.aM.get(), (bame) this.aN.get(), (bame) this.aO.get());
    }

    public final ajdp R() {
        return adzp.o(this.a.hC(), (aiix) this.a.fH.get(), (ahfm) this.a.bd.get());
    }

    @Override // defpackage.airw
    public final ajdz S() {
        return (ajdz) this.aI.get();
    }

    public final ajdz T() {
        dyo dyoVar = this.a;
        ajdz d = aaib.d(dyoVar.uO, (ScheduledExecutorService) dyoVar.h.get(), this.aH, (aisq) this.a.uP.get(), (Handler) this.a.an.get(), (Executor) this.a.x.get(), (aadd) this.a.K.get(), (aiix) this.a.fH.get(), (SecureRandom) this.a.eb.get(), this.a.ci(), (acrr) this.a.aw.get());
        d.z((aynx) this.b.get(), (aynx) this.e.get());
        return d;
    }

    public final aynx U() {
        return aiqx.b((azpb) this.r.get());
    }

    @Override // defpackage.aisr
    public final aynx V() {
        return (aynx) this.b.get();
    }

    @Override // defpackage.airw
    public final aynx W() {
        return (aynx) this.G.get();
    }

    @Override // defpackage.kpc
    public final aynx X() {
        return (aynx) this.an.get();
    }

    @Override // defpackage.kpc
    public final aynx Y() {
        return (aynx) this.ao.get();
    }

    @Override // defpackage.airw
    public final aynx Z() {
        return (aynx) this.y.get();
    }

    public final fdu a() {
        return new fdu(axot.a(this.a.fO), this.aS, this.aU, axot.a(this.bh), axot.a(this.bi), (aacz) this.a.D.get());
    }

    public final bame aA() {
        Context context = this.a.b.a;
        azpb azpbVar = (azpb) this.av.get();
        axzl.o(azpbVar);
        return azpbVar;
    }

    @Override // defpackage.airw
    public final aacz aB() {
        return (aacz) this.a.D.get();
    }

    @Override // defpackage.airw
    public final airx aC() {
        return (airx) this.bk.get();
    }

    @Override // defpackage.airw
    public final airz aD() {
        return (airz) this.bl.get();
    }

    @Override // defpackage.airw
    public final aisq aE() {
        return (aisq) this.C.get();
    }

    @Override // defpackage.airw
    public final aikh aF() {
        return (aikh) this.D.get();
    }

    public final ahey aG() {
        return aisd.c((ahez) this.w.get());
    }

    public final ahex aH() {
        return aisc.c((ahez) this.w.get());
    }

    @Override // defpackage.airw
    public final airy aI() {
        return (airy) this.bm.get();
    }

    @Override // defpackage.airw
    public final aynx aa() {
        return (aynx) this.g.get();
    }

    @Override // defpackage.aisr
    public final aynx ab() {
        return (aynx) this.e.get();
    }

    @Override // defpackage.aisr
    public final aynx ac() {
        return (aynx) this.ax.get();
    }

    @Override // defpackage.aisr
    public final aynx ad() {
        return (aynx) this.av.get();
    }

    @Override // defpackage.airw
    public final /* synthetic */ aynx ae(ampg ampgVar, ampg ampgVar2) {
        return airu.a(this, ampgVar, ampgVar2);
    }

    public final aynx af() {
        return aiqx.g((azpa) this.aq.get());
    }

    public final aynx ag() {
        return aiqx.h((azpa) this.at.get());
    }

    @Override // defpackage.aiqo
    public final aynx ah() {
        return (aynx) this.m.get();
    }

    @Override // defpackage.aiqo
    public final aynx ai() {
        return (aynx) this.o.get();
    }

    @Override // defpackage.aiqo
    public final aynx aj() {
        return (aynx) this.u.get();
    }

    @Override // defpackage.aiqo
    public final aynx ak() {
        return (aynx) this.t.get();
    }

    @Override // defpackage.aiqo
    public final aynx al() {
        return (aynx) this.l.get();
    }

    @Override // defpackage.aiqo
    public final aynx am() {
        return (aynx) this.n.get();
    }

    @Override // defpackage.aiqo
    public final aynx an() {
        return (aynx) this.p.get();
    }

    @Override // defpackage.aiqo
    public final aynx ao() {
        return (aynx) this.T.get();
    }

    @Override // defpackage.aiqo
    public final aynx ap() {
        return (aynx) this.s.get();
    }

    @Override // defpackage.aiqo
    public final aynx aq() {
        return (aynx) this.q.get();
    }

    public final Set ar() {
        amvl j = amvn.j(9);
        j.c((aimx) this.a.vK.get());
        j.c((aimx) this.a.vL.get());
        j.c(this.a.bt());
        j.c((aimx) this.a.vM.get());
        j.c((aimx) this.a.vN.get());
        j.c(this.a.cY());
        j.c((aimx) this.a.fJ.get());
        j.c((aimx) this.a.vO.get());
        j.j(ahed.n((ailw) this.aV.get(), (aimx) this.a.lh.get()));
        return j.g();
    }

    public final Set as() {
        amvl j = amvn.j(3);
        j.c((ajfb) this.ar.get());
        j.c((ajfb) this.aI.get());
        j.j((Iterable) this.aK.get());
        return j.g();
    }

    @Override // defpackage.aisr
    public final bame at() {
        return (bame) this.aN.get();
    }

    @Override // defpackage.aisr
    public final bame au() {
        return (bame) this.aO.get();
    }

    @Override // defpackage.aisr
    public final bame av() {
        return (bame) this.aL.get();
    }

    @Override // defpackage.aisr
    public final bame aw() {
        return (bame) this.aM.get();
    }

    public final bame ax() {
        Context context = this.a.b.a;
        azpa azpaVar = (azpa) this.aq.get();
        axzl.o(azpaVar);
        return azpaVar;
    }

    public final bame ay() {
        Context context = this.a.b.a;
        azpa azpaVar = (azpa) this.at.get();
        axzl.o(azpaVar);
        return azpaVar;
    }

    public final bame az() {
        Context context = this.a.b.a;
        azpb azpbVar = (azpb) this.ax.get();
        axzl.o(azpbVar);
        return azpbVar;
    }

    public final jjz b() {
        return new jjz((ankx) this.a.h.get(), j(), (aimr) this.a.vQ.get(), (yrj) this.a.as.get(), (jjs) this.a.vU.get(), this.a.C(), (axwu) this.a.gZ.get());
    }

    public final jvw c() {
        dyo dyoVar = this.a;
        Context context = dyoVar.b.a;
        aijf aijfVar = (aijf) dyoVar.gH.get();
        afvn afvnVar = (afvn) this.a.au.get();
        dyo dyoVar2 = this.a;
        return new jvw(context, aijfVar, afvnVar, dyoVar2.vo, (aiow) dyoVar2.vq.get(), (snc) this.a.v.get(), (aacz) this.a.D.get(), (aadd) this.a.K.get());
    }

    public final kag d() {
        return new kag((airw) this.a.fP.get(), (aynx) this.a.vx.get(), (aynx) this.a.vy.get(), (aynx) this.a.uW.get());
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, enw] */
    public final kam e() {
        dyo dyoVar = this.a;
        final kam kamVar = new kam(dyoVar.b.a, (acrr) dyoVar.aw.get(), (yrj) this.a.as.get(), (aijf) this.a.gH.get(), this.a.gY(), (airw) this.a.fP.get(), amvn.t((kaq) this.aA.get(), (kaq) this.aB.get(), (kaq) this.aC.get()));
        kamVar.g.Z(new ayqb() { // from class: kah
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kam kamVar2 = kam.this;
                kak kakVar = (kak) obj;
                aopa createBuilder = atys.a.createBuilder();
                eoe a = eoe.a(((eof) ((eny) kamVar2.f).a.c()).c);
                if (a == null) {
                    a = eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                boolean z = false;
                int i = 1;
                boolean z2 = a == eoe.BACKGROUND_AUDIO_POLICY_ON;
                createBuilder.copyOnWrite();
                atys atysVar = (atys) createBuilder.instance;
                atysVar.b |= 1;
                atysVar.c = z2;
                eoe a2 = eoe.a(((eof) ((eny) kamVar2.f).a.c()).c);
                if (a2 == null) {
                    a2 = eoe.BACKGROUND_AUDIO_POLICY_UNSPECIFIED;
                }
                if (a2 == eoe.BACKGROUND_AUDIO_POLICY_ON_IF_HEADPHONES) {
                    z = true;
                }
                createBuilder.copyOnWrite();
                atys atysVar2 = (atys) createBuilder.instance;
                atysVar2.b |= 2;
                atysVar2.d = z;
                atys atysVar3 = (atys) createBuilder.mo39build();
                kaj a3 = kakVar.a();
                aopa createBuilder2 = atyt.a.createBuilder();
                boolean z3 = a3.a.b;
                createBuilder2.copyOnWrite();
                atyt atytVar = (atyt) createBuilder2.instance;
                atytVar.b |= 1;
                atytVar.c = z3;
                boolean z4 = kamVar2.e.k;
                createBuilder2.copyOnWrite();
                atyt atytVar2 = (atyt) createBuilder2.instance;
                atytVar2.b |= 2;
                atytVar2.d = z4;
                boolean z5 = a3.a.c;
                createBuilder2.copyOnWrite();
                atyt atytVar3 = (atyt) createBuilder2.instance;
                atytVar3.b |= 4;
                atytVar3.e = z5;
                int i2 = a3.a.d;
                createBuilder2.copyOnWrite();
                atyt atytVar4 = (atyt) createBuilder2.instance;
                atytVar4.g = i2 - 1;
                atytVar4.b |= 16;
                createBuilder2.copyOnWrite();
                atyt atytVar5 = (atyt) createBuilder2.instance;
                atysVar3.getClass();
                atytVar5.f = atysVar3;
                atytVar5.b |= 8;
                int i3 = a3.b;
                if (i3 != 0) {
                    switch (i3) {
                        case 2:
                            i = 3;
                            break;
                        case 3:
                            i = 4;
                            break;
                        case 4:
                            i = 5;
                            break;
                        case 5:
                            i = 6;
                            break;
                        case 6:
                            i = 7;
                            break;
                        case 7:
                            i = 8;
                            break;
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 11;
                            break;
                    }
                } else {
                    i = 2;
                }
                createBuilder2.copyOnWrite();
                atyt atytVar6 = (atyt) createBuilder2.instance;
                atytVar6.h = i - 1;
                atytVar6.b |= 32;
                boolean isPowerSaveMode = kamVar2.d.isPowerSaveMode();
                createBuilder2.copyOnWrite();
                atyt atytVar7 = (atyt) createBuilder2.instance;
                atytVar7.b |= 128;
                atytVar7.j = isPowerSaveMode;
                if (Build.VERSION.SDK_INT >= 23) {
                    boolean isDeviceIdleMode = kamVar2.d.isDeviceIdleMode();
                    createBuilder2.copyOnWrite();
                    atyt atytVar8 = (atyt) createBuilder2.instance;
                    atytVar8.b |= 64;
                    atytVar8.i = isDeviceIdleMode;
                }
                atyu a4 = kakVar.b().a();
                aqlv f = kamVar2.b.f();
                a4.copyOnWrite();
                ((atyv) a4.instance).i(f);
                String str = a3.a.a;
                a4.copyOnWrite();
                ((atyv) a4.instance).h(str);
                a4.copyOnWrite();
                ((atyv) a4.instance).l((atyt) createBuilder2.mo39build());
                arrf a5 = arrh.a();
                a5.copyOnWrite();
                ((arrh) a5.instance).dt((atyv) a4.mo39build());
                kamVar2.a.c((arrh) a5.mo39build());
            }
        });
        return kamVar;
    }

    public final kpa f() {
        aguk agukVar;
        dyo dyoVar = this.a;
        aikv aikvVar = new aikv(dyoVar.hy, this.aW, dyoVar.vQ, this.aX, this.aY, this.aZ, dyoVar.K, dyoVar.fH);
        dyo dyoVar2 = this.a;
        agts agtsVar = new agts(dyoVar2.hy, this.aW, dyoVar2.vQ, this.aX, this.aY, this.aZ, this.ba, dyoVar2.K, this.bb, dyoVar2.hh, dyoVar2.gR, dyoVar2.hf, dyoVar2.fH);
        agub i = i();
        azqb azqbVar = this.be;
        azqb azqbVar2 = this.bf;
        if (((axxh) this.a.kG.get()).b().booleanValue()) {
            agukVar = (aguk) azqbVar.get();
        } else {
            agukVar = (aguk) azqbVar2.get();
        }
        aguk agukVar2 = agukVar;
        axzl.o(agukVar2);
        return new kpa(aikvVar, agtsVar, i, agukVar2, (aadd) this.a.K.get(), (ankx) this.a.h.get());
    }

    public final adlc g() {
        dyo dyoVar = this.a;
        dyo dyoVar2 = this.a;
        dyo dyoVar3 = this.a;
        return new adlc(dyoVar.b.a, (snc) dyoVar.v.get(), anlz.g((Executor) this.a.h.get()), (yni) this.a.y.get(), dyoVar2.rT, dyoVar2.sP, dyoVar2.tK, (aynx) this.b.get(), this.a.jq, (aikh) this.D.get(), dyoVar3.jg, (bame) dyoVar3.vC.get(), (bame) this.a.vD.get(), (bame) this.a.vE.get(), (bame) this.a.vF.get(), (aizu) this.aP.get(), (wnb) this.a.sN.get(), this.a.bT(), new dyl(this.a, this.ap), (aacz) this.a.D.get(), (wmt) this.a.se.get(), (airw) this.aQ.get());
    }

    public final agsq h() {
        return new agsq(afku.c((zfq) this.a.ee.get(), this.a.d()), (zfq) this.a.ee.get(), this.a.d(), (axwu) this.a.gZ.get());
    }

    public final agub i() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.h.get();
        dyo dyoVar = this.a;
        azqb azqbVar = dyoVar.gS;
        snc sncVar = (snc) dyoVar.v.get();
        dyo dyoVar2 = this.a;
        azqb azqbVar2 = dyoVar2.hr;
        aahf aahfVar = (aahf) dyoVar2.dK.get();
        afvn afvnVar = (afvn) this.a.au.get();
        dyo dyoVar3 = this.a;
        return new agub(scheduledExecutorService, azqbVar, new agua(sncVar, azqbVar2, aahfVar, afvnVar, dyoVar3.jg, (ahdg) dyoVar3.vR.get()), (yzj) this.a.je.get(), (jjt) this.a.vS.get(), (aadd) this.a.K.get(), (axwu) this.a.gZ.get());
    }

    public final agug j() {
        dyo dyoVar = this.a;
        Context context = dyoVar.b.a;
        Executor executor = (Executor) dyoVar.Q.get();
        aimr aimrVar = (aimr) this.a.vQ.get();
        jjt jjtVar = (jjt) this.a.vS.get();
        yrj yrjVar = (yrj) this.a.as.get();
        agup agupVar = (agup) this.a.vT.get();
        ague agueVar = (ague) this.bd.get();
        dyo dyoVar2 = this.a;
        return new agug(context, executor, aimrVar, jjtVar, yrjVar, agupVar, agueVar, dyoVar2.gS, (axwu) dyoVar2.gZ.get());
    }

    public final aheq k() {
        return ahed.l((adzt) this.a.gI.get(), (aijf) this.j.get());
    }

    public final ahet l() {
        ahet i = wjs.i((aiqp) this.v.get(), (aisp) this.L.get(), axot.a(this.O), (Executor) this.a.x.get(), this.a.vr, (aynx) this.b.get(), (aynx) this.e.get());
        i.a();
        return i;
    }

    public final ahez m() {
        dyo dyoVar = this.a;
        return new ahez(dyoVar.b.a, dyoVar.uS, (aijf) this.j.get(), this.x, this.C, (aipq) this.A.get(), (ainx) this.a.uT.get(), (aisx) this.B.get(), (aadd) this.a.K.get(), axot.a(this.a.vh), (aiix) this.a.fH.get());
    }

    public final ahfq n() {
        ahfq l = aasx.l((afkf) this.a.gD.get());
        l.b((aynx) this.at.get(), (aynx) this.e.get(), (aynx) this.b.get());
        return l;
    }

    public final ahug o() {
        final ahug ahugVar = new ahug(this.a.bT(), this.a.ci(), (Executor) this.a.h.get(), (aaqp) this.a.ih.get(), (aisp) this.L.get());
        new aypf().d(ahugVar.b.a.Z(new ayqb() { // from class: ahud
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ahug ahugVar2 = ahug.this;
                ahhw ahhwVar = (ahhw) obj;
                if (!ahhwVar.c().a(aika.PLAYBACK_LOADED) || ahhwVar.d().g() == null || ahhwVar.d().e() == null || ahhwVar.d().e().y() || ahhwVar.b().a.F.isEmpty()) {
                    return;
                }
                ahhwVar.d().g().c(new ahuf(ahugVar2, ahhwVar));
            }
        }));
        return ahugVar;
    }

    @Override // defpackage.kpc
    public final ahvz p() {
        return (ahvz) this.bo.get();
    }

    public final aiis q() {
        zey bT = this.a.bT();
        aith aithVar = (aith) this.f189J.get();
        aynx aynxVar = (aynx) this.e.get();
        aynx aynxVar2 = (aynx) this.av.get();
        ailu ailuVar = (ailu) this.x.get();
        aiqp aiqpVar = (aiqp) this.v.get();
        axot.a(this.k);
        Executor executor = (Executor) this.a.x.get();
        return new aiis(bT, aithVar, aynxVar, aynxVar2, ailuVar, aiqpVar);
    }

    @Override // defpackage.airw
    public final aijf r() {
        return (aijf) this.j.get();
    }

    @Override // defpackage.airw
    public final aijh s() {
        return (aijh) this.c.get();
    }

    @Override // defpackage.airw
    public final aiji t() {
        return (aiji) this.j.get();
    }

    public final aikh u() {
        return new aikh((yni) this.a.y.get());
    }

    public final aiko v() {
        return aheb.g((snc) this.a.v.get());
    }

    @Override // defpackage.airs
    public final aiky w() {
        return (aiky) this.k.get();
    }

    @Override // defpackage.airs
    public final ailf x() {
        return (ailf) this.aW.get();
    }

    @Override // defpackage.airw
    public final ailw y() {
        return (ailw) this.aV.get();
    }

    @Override // defpackage.airw
    public final aios z() {
        return (aios) this.I.get();
    }
}
