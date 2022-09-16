package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dwx  reason: default package */
/* loaded from: classes3.dex */
final class dwx implements azqb {
    private final dwy a;
    private final int b;

    public dwx(dwy dwyVar, int i) {
        this.a = dwyVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.b) {
            case 0:
                dwy dwyVar = this.a;
                return new nsj((nsd) dwyVar.s.get(), (EngagementPanelSizeBehavior) dwyVar.p.get(), (nrl) dwyVar.k.get(), (nsk) dwyVar.f.get(), (nsy) dwyVar.o.get(), (nsv) dwyVar.r.get(), (nsq) dwyVar.t.get(), (nsn) dwyVar.u.get(), (nrt) dwyVar.v.get(), (ntt) dwyVar.q.get(), new nrk((nsv) dwyVar.r.get()), null);
            case 1:
                dwy dwyVar2 = this.a;
                return new nsd(dwyVar2.c.a(), (nsk) dwyVar2.f.get(), (nsv) dwyVar2.r.get(), (nsw) dwyVar2.n.get());
            case 2:
                dwy dwyVar3 = this.a;
                nsk nskVar = (nsk) (dwyVar3.a.booleanValue() ? dwyVar3.d.get() : dwyVar3.e.get());
                axzl.o(nskVar);
                return nskVar;
            case 3:
                dwy dwyVar4 = this.a;
                nqq nqqVar = nqq.LANDSCAPE_PLAYER_OVERLAY;
                nta ntaVar = new nta();
                ((noq) dwyVar4.c.bw.get()).z(ntaVar);
                return new ntn((nqr) dwyVar4.c.gP.get(), amup.l(nqqVar, ntaVar, nqq.PORTRAIT_WATCH_PANEL, new nth((nzy) dwyVar4.c.gO.get(), (ghs) dwyVar4.c.bu.get())));
            case 4:
                return new nri((ViewGroup) this.a.c.aC.get());
            case 5:
                dwy dwyVar5 = this.a;
                return new nsv((nsw) dwyVar5.n.get(), (nrl) dwyVar5.k.get(), (ntt) dwyVar5.q.get(), null);
            case 6:
                dwy dwyVar6 = this.a;
                nsw nswVar = (nsw) (dwyVar6.a.booleanValue() ? dwyVar6.l.get() : dwyVar6.m.get());
                axzl.o(nswVar);
                return nswVar;
            case 7:
                dwy dwyVar7 = this.a;
                return new nto((nsk) dwyVar7.f.get(), (nrl) dwyVar7.k.get());
            case 8:
                dwy dwyVar8 = this.a;
                nrl nrlVar = (nrl) (dwyVar8.a.booleanValue() ? dwyVar8.i.get() : dwyVar8.j.get());
                axzl.o(nrlVar);
                return nrlVar;
            case 9:
                dwy dwyVar9 = this.a;
                return new ntk((ghs) dwyVar9.c.bu.get(), (npt) dwyVar9.g.get(), (nqr) dwyVar9.c.gP.get(), (nqk) dwyVar9.h.get());
            case 10:
                return new npt();
            case 11:
                return new nqk();
            case 12:
                return new nrf();
            case 13:
                return new nrj((nsk) this.a.f.get());
            case 14:
                dwy dwyVar10 = this.a;
                return new ntt((nsy) dwyVar10.o.get(), (EngagementPanelSizeBehavior) dwyVar10.p.get());
            case 15:
                return new nsy(this.a.c.a());
            case 16:
                dwy dwyVar11 = this.a;
                return new EngagementPanelSizeBehavior(dwyVar11.b.b.a, (nqk) dwyVar11.h.get(), (nrl) dwyVar11.k.get(), (nsk) dwyVar11.f.get());
            case 17:
                dwy dwyVar12 = this.a;
                return new nsq((airw) dwyVar12.c.n.get(), (nqr) dwyVar12.c.gP.get(), dwyVar12.c.ir(), (feu) dwyVar12.b.wt.get(), (fyy) dwyVar12.c.am.get());
            case 18:
                dwy dwyVar13 = this.a;
                return new nsn((nqk) dwyVar13.h.get(), (nrl) dwyVar13.k.get());
            case 19:
                dwy dwyVar14 = this.a;
                return new nrt((nsv) dwyVar14.r.get(), (nsw) dwyVar14.n.get(), (nrl) dwyVar14.k.get());
            case 20:
                return new nmh();
            case 21:
                dwy dwyVar15 = this.a;
                azqb azqbVar = dwyVar15.E;
                dwq dwqVar = dwyVar15.c;
                azqb azqbVar2 = dwqVar.f;
                dyo dyoVar = dwyVar15.b;
                nof nofVar = new nof(azqbVar2, dyoVar.rN, dwyVar15.F, dwqVar.ah, dwyVar15.G, dwyVar15.D, dwyVar15.H, dwyVar15.I, dwyVar15.f188J, dwyVar15.K, dwqVar.lO, dwyVar15.L, dyoVar.xx, dwqVar.lP, dyoVar.y, dyoVar.je, dwqVar.H, dwyVar15.M, dyoVar.D, dyoVar.K, dwyVar15.N, dyoVar.Ae, dwqVar.aV, dwyVar15.O);
                dwq dwqVar2 = dwyVar15.c;
                azqb azqbVar3 = dwqVar2.f;
                dyo dyoVar2 = dwyVar15.b;
                return new nmw(azqbVar, nofVar, new nlk(azqbVar3, dyoVar2.rN, dwyVar15.F, dwyVar15.D, dwyVar15.H, dwyVar15.I, dwyVar15.f188J, dwyVar15.K, dwyVar15.L, dwqVar2.lP, dyoVar2.y, dyoVar2.je, dwqVar2.H, dwyVar15.M, dyoVar2.D, dyoVar2.K, dwyVar15.N, dyoVar2.Ae, dwqVar2.aV, dwyVar15.O, dwyVar15.P), dwyVar15.c.cE(), (aath) dwyVar15.b.kn.get(), (aban) dwyVar15.b.yF.get(), dwyVar15.Q, dwyVar15.R, dwyVar15.S, (ampq) dwyVar15.T.get(), (axxy) dwyVar15.b.Af.get());
            case 22:
                dwy dwyVar16 = this.a;
                yni yniVar = (yni) dwyVar16.b.y.get();
                Context f = dwyVar16.c.f();
                azqb azqbVar4 = dwyVar16.y;
                azqb azqbVar5 = dwyVar16.z;
                azqb azqbVar6 = dwyVar16.A;
                dwq dwqVar3 = dwyVar16.c;
                noy noyVar = new noy(yniVar, f, new abjc(azqbVar4, azqbVar5, azqbVar6, dwqVar3.lK, dwyVar16.B, dwqVar3.lL), (abiq) dwyVar16.c.ck.get(), (abja) dwyVar16.c.ic.get(), dwyVar16.D, (feh) dwyVar16.c.aV.get(), (ezd) dwyVar16.c.bm.get(), (ezh) dwyVar16.c.A.get(), (frr) dwyVar16.c.dv.get(), (aadd) dwyVar16.b.K.get(), (akge) dwyVar16.c.af.get(), dwyVar16.c());
                final aagi aagiVar = (aagi) dwyVar16.b.dD.get();
                npt nptVar = (npt) dwyVar16.g.get();
                final abkf abkfVar = (abkf) dwyVar16.c.eD.get();
                axzl.o(abkfVar);
                axxe axxeVar = (axxe) dwyVar16.b.yT.get();
                noyVar.d.a(noyVar);
                if (eog.P(noyVar.f)) {
                    noyVar.m = noyVar.g.af(new ayqe() { // from class: now
                        @Override // defpackage.ayqe
                        public final Object a(Object obj) {
                            aagi aagiVar2 = aagi.this;
                            return aagiVar2.c().h(aakj.f(194, (String) obj), true).I(noc.c).V(nox.a).k(awbn.class).X(aypa.a());
                        }
                    }).as(new nou(noyVar, 1));
                    ezw a = noyVar.e.a();
                    if (a != null) {
                        noyVar.g.c(a.c());
                    }
                }
                nptVar.b.Z(new ayqb() { // from class: nov
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        abkc abkcVar = abkc.this;
                        ampq ampqVar = (ampq) obj;
                        boolean h = ampqVar.h();
                        boolean z = false;
                        int i = 1;
                        if (h && ((nmc) ampqVar.c()).s()) {
                            z = true;
                        }
                        abkf abkfVar2 = (abkf) abkcVar;
                        abkfVar2.l = h;
                        abkfVar2.m = z;
                        if (!abkfVar2.d()) {
                            return;
                        }
                        if (h) {
                            ((ahzk) abkcVar).e(1);
                        } else if (abkfVar2.c.a() == 1) {
                            ((ahzk) abkcVar).e(2);
                            abkfVar2.b.l();
                        }
                        if (abkfVar2.g) {
                            if (!z) {
                                return;
                            }
                            abkfVar2.c.d(1);
                            return;
                        }
                        abkg abkgVar = abkfVar2.c;
                        if (true != z) {
                            i = 2;
                        }
                        abkgVar.d(i);
                    }
                });
                noyVar.h = axxeVar.a.a.V(axxd.c).B().as(new nou(noyVar));
                return noyVar;
            case 23:
                dwq dwqVar4 = this.a.c;
                return new abrh(dwqVar4.f, dwqVar4.lG, dwqVar4.lI, dwqVar4.cV);
            case 24:
                dwy dwyVar17 = this.a;
                dwq dwqVar5 = dwyVar17.c;
                azqb azqbVar7 = dwqVar5.f;
                azqb azqbVar8 = dwqVar5.cR;
                azqb azqbVar9 = dwqVar5.dE;
                azqb azqbVar10 = dwqVar5.L;
                azqb azqbVar11 = dwqVar5.fB;
                azqb azqbVar12 = dwqVar5.hh;
                dyo dyoVar3 = dwyVar17.b;
                return new abpl(azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, dyoVar3.dU, dyoVar3.xx, dwqVar5.aL, dwqVar5.lJ);
            case 25:
                return new abqe(this.a.c.lI);
            case 26:
                dwy dwyVar18 = this.a;
                dwq dwqVar6 = dwyVar18.c;
                azqb azqbVar13 = dwqVar6.f;
                dyo dyoVar4 = dwyVar18.b;
                return new abqr(azqbVar13, dyoVar4.lV, dyoVar4.kC, dwqVar6.H, dyoVar4.an, dwqVar6.ck, dwqVar6.ae, dyoVar4.xv, dyoVar4.dD, dwqVar6.cj);
            case 27:
                dwy dwyVar19 = this.a;
                Activity a2 = dwyVar19.c.a();
                ajyi ajyiVar = (ajyi) dwyVar19.c.ah.get();
                ajhl iz = dwyVar19.c.iz();
                axnm a3 = axot.a(dwyVar19.c.cd);
                ajrh iI = dwyVar19.c.iI();
                aafo aafoVar = (aafo) dwyVar19.c.H.get();
                ajyc iQ = dwyVar19.c.iQ();
                ajxz ajxzVar = (ajxz) dwyVar19.b.lV.get();
                ajmy ajmyVar = (ajmy) dwyVar19.b.kC.get();
                akfb akfbVar = (akfb) dwyVar19.c.dt.get();
                acsx cI = dwyVar19.b.cI();
                xyf xyfVar = (xyf) dwyVar19.b.yN.get();
                dwq dwqVar7 = dwyVar19.c;
                azqb azqbVar14 = dwqVar7.H;
                dyo dyoVar5 = dwyVar19.b;
                return new nnu(a2, ajyiVar, iz, a3, iI, aafoVar, iQ, ajxzVar, ajmyVar, akfbVar, cI, xyfVar, new yfk(azqbVar14, dyoVar5.lV, dyoVar5.dD, dyoVar5.zQ, axoz.b(dwqVar7.gX)), dwyVar19.c.az(), (yni) dwyVar19.b.y.get(), (akfw) dwyVar19.c.gX.get(), (nng) dwyVar19.C.get(), (nsj) dwyVar19.w.get());
            case 28:
                dwy dwyVar20 = this.a;
                return new nng((nmh) dwyVar20.x.get(), (npt) dwyVar20.g.get(), (aacz) dwyVar20.b.D.get());
            case 29:
                dwy dwyVar21 = this.a;
                dwq dwqVar8 = dwyVar21.c;
                azqb azqbVar15 = dwqVar8.hY;
                azqb azqbVar16 = dwqVar8.ih;
                azqb azqbVar17 = dwqVar8.f12if;
                azqb azqbVar18 = dwqVar8.ip;
                dyo dyoVar6 = dwyVar21.b;
                return new nnm(azqbVar15, azqbVar16, azqbVar17, azqbVar18, dyoVar6.y, dyoVar6.je, dwqVar8.lM, dyoVar6.D);
            case 30:
                return this.a.a();
            case 31:
                dwy dwyVar22 = this.a;
                return new nph(dwyVar22.c.a(), (ajxz) dwyVar22.b.lV.get());
            case 32:
                dwy dwyVar23 = this.a;
                dwq dwqVar9 = dwyVar23.c;
                azqb azqbVar19 = dwqVar9.f;
                dyo dyoVar7 = dwyVar23.b;
                return new nkl(azqbVar19, dyoVar7.kC, dwqVar9.H, dyoVar7.sg, dwqVar9.lN);
            case 33:
                dwq dwqVar10 = this.a.c;
                return new nkn(dwqVar10.f, dwqVar10.cQ, axoz.b(dwqVar10.dc));
            case 34:
                dwy dwyVar24 = this.a;
                return new nkp(dwyVar24.c.f, dwyVar24.b.kC);
            case 35:
                return this.a.b();
            case 36:
                dwy dwyVar25 = this.a;
                return new nnk((aagi) dwyVar25.b.dD.get(), (aacz) dwyVar25.b.D.get());
            case 37:
                dwy dwyVar26 = this.a;
                return new non(new nqh(dwyVar26.c.a(), (aagi) dwyVar26.b.dD.get(), (acti) dwyVar26.c.au.get()), (npr) dwyVar26.c.lM.get(), (aacz) dwyVar26.b.D.get());
            case 38:
                return this.a.c();
            case 39:
                dwy dwyVar27 = this.a;
                dwq dwqVar11 = dwyVar27.c;
                azqb azqbVar20 = dwqVar11.f;
                dyo dyoVar8 = dwyVar27.b;
                return new nre(azqbVar20, dyoVar8.rN, dwqVar11.ah, dwqVar11.lO, dwyVar27.G, dyoVar8.xx);
            case 40:
                dwy dwyVar28 = this.a;
                return new nlr(dwyVar28.c.a(), dwyVar28.D, dwyVar28.c.a(), (ajmy) dwyVar28.b.kC.get(), (aafo) dwyVar28.c.H.get(), dwyVar28.b.cI(), (afvn) dwyVar28.b.au.get(), (afwc) dwyVar28.b.vo.get(), (frr) dwyVar28.c.dv.get(), (aadd) dwyVar28.b.K.get());
            case 41:
                dwy dwyVar29 = this.a;
                return new nqi(dwyVar29.c.iz(), axot.a(dwyVar29.c.bb), dwyVar29.D, (aagi) dwyVar29.b.dD.get(), (afvn) dwyVar29.b.au.get(), dwyVar29.b.cI(), (aadd) dwyVar29.b.K.get(), dwyVar29.c());
            case 42:
                dwy dwyVar30 = this.a;
                return new nop(dwyVar30.c.a(), dwyVar30.D, dwyVar30.b(), (imx) dwyVar30.c.gB.get(), dwyVar30.b.cI(), (aadd) dwyVar30.b.K.get());
            case 43:
                return this.a.a.booleanValue() ? ampq.j(ezv.i()) : amon.a;
            case 44:
                dwy dwyVar31 = this.a;
                return new nnb(dwyVar31.U, dwyVar31.V, (npg) dwyVar31.c.lP.get());
            case 45:
                dwy dwyVar32 = this.a;
                return new nlc(dwyVar32.c.a(), (aath) dwyVar32.b.kn.get(), (yzj) dwyVar32.b.je.get(), (yni) dwyVar32.b.y.get(), dwyVar32.c.iK(), (ajyi) dwyVar32.c.ah.get(), dwyVar32.c.eu(), (Executor) dwyVar32.b.x.get(), dwyVar32.b.cI(), (aafo) dwyVar32.c.H.get(), dwyVar32.a(), (yzv) dwyVar32.b.jc.get(), dwyVar32.c.fK(), dwyVar32.D, (xyb) dwyVar32.b.yU.get(), (xyd) dwyVar32.b.yV.get(), (aadd) dwyVar32.b.K.get(), (aynx) dwyVar32.b.yK.get(), dwyVar32.b(), (eml) dwyVar32.b.Ae.get(), (aacz) dwyVar32.b.D.get());
            case 46:
                dwy dwyVar33 = this.a;
                Activity a4 = dwyVar33.c.a();
                azqb azqbVar21 = dwyVar33.D;
                acth acthVar = (acth) dwyVar33.c.L.get();
                yzj yzjVar = (yzj) dwyVar33.b.je.get();
                abem he = dwyVar33.c.he();
                ajsg iK = dwyVar33.c.iK();
                iue cE = dwyVar33.c.cE();
                yni yniVar2 = (yni) dwyVar33.b.y.get();
                akar iT = dwyVar33.c.iT();
                azqb azqbVar22 = dwyVar33.c.ah;
                ydq ydqVar = (ydq) dwyVar33.b.xJ.get();
                dt dtVar = (dt) dwyVar33.c.s.get();
                aadd aaddVar = (aadd) dwyVar33.b.K.get();
                aynx aynxVar = (aynx) dwyVar33.b.yK.get();
                yln ylnVar = (yln) dwyVar33.b.Ag.get();
                nqe nqeVar = new nqe(a4, azqbVar21, acthVar, yzjVar, he, iK, cE, yniVar2, iT, azqbVar22, ydqVar, dtVar, aaddVar, aynxVar, (akge) dwyVar33.c.af.get());
                nqeVar.o.a(nqeVar.a);
                return nqeVar;
            case 47:
                dwy dwyVar34 = this.a;
                return new nnn((nmh) dwyVar34.x.get(), (npt) dwyVar34.g.get(), (aacz) dwyVar34.b.D.get());
            case 48:
                dwy dwyVar35 = this.a;
                return dwyVar35.a.booleanValue() ? ampq.j((nqn) dwyVar35.W.get()) : amon.a;
            case 49:
                dwy dwyVar36 = this.a;
                return new nqn((ayor) dwyVar36.b.iz.get(), (npt) dwyVar36.g.get(), (nqr) dwyVar36.c.gP.get(), (aacz) dwyVar36.b.D.get(), (aadd) dwyVar36.b.K.get());
            case 50:
                dwy dwyVar37 = this.a;
                return dwyVar37.a.booleanValue() ? ampq.j((npz) dwyVar37.c.in.get()) : amon.a;
            default:
                return new nne((nsj) this.a.w.get());
        }
    }
}
