package defpackage;

import android.content.Context;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dxo  reason: default package */
/* loaded from: classes3.dex */
final class dxo implements azqb {
    private final dyo a;
    private final dxp b;
    private final int c;

    public dxo(dyo dyoVar, dxp dxpVar, int i) {
        this.a = dyoVar;
        this.b = dxpVar;
        this.c = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.c) {
            case 0:
                dxp dxpVar = this.b;
                return new kox(new igk(dxpVar.a.vJ), new aipw(dxpVar.b, dxpVar.d, dxpVar.o, dxpVar.p, dxpVar.u, dxpVar.a.fH));
            case 1:
                return azpd.ar();
            case 2:
                return aiqx.h((azpa) this.b.c.get());
            case 3:
                return azpa.ar();
            case 4:
                dxp dxpVar2 = this.b;
                return acrd.g((azpb) dxpVar2.e.get(), (azpb) dxpVar2.f.get(), (azpb) dxpVar2.g.get(), (azpb) dxpVar2.h.get(), (azpb) dxpVar2.i.get(), (azpb) dxpVar2.j.get(), (azpb) dxpVar2.k.get(), (azpb) dxpVar2.l.get(), (azpb) dxpVar2.m.get(), (azpb) dxpVar2.n.get());
            case 5:
                return azpd.ar();
            case 6:
                return azpd.ar();
            case 7:
                return azpa.ar();
            case 8:
                return azpd.ar();
            case 9:
                return azpd.ar();
            case 10:
                return azpd.ar();
            case 11:
                return azpa.ar();
            case 12:
                return azpd.ar();
            case 13:
                return azpd.ar();
            case 14:
                return azpd.ar();
            case 15:
                return new aikh((yni) this.b.a.y.get());
            case 16:
                dxp dxpVar3 = this.b;
                yni yniVar = (yni) dxpVar3.a.y.get();
                axnm a = axot.a(dxpVar3.q);
                Handler handler = (Handler) dxpVar3.a.an.get();
                yzj yzjVar = (yzj) dxpVar3.a.je.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dxpVar3.a.Q.get();
                Executor executor = (Executor) dxpVar3.a.x.get();
                aiqp aiqpVar = (aiqp) dxpVar3.o.get();
                ahey d = dxpVar3.d();
                aadd aaddVar = (aadd) dxpVar3.a.K.get();
                aacz aaczVar = (aacz) dxpVar3.a.D.get();
                ahfm ahfmVar = (ahfm) dxpVar3.a.bd.get();
                return new ailu(yniVar, a, handler, yzjVar, scheduledExecutorService, executor, aiqpVar, d, aaddVar, aaczVar, (aiix) dxpVar3.a.fH.get());
            case 17:
                dyo dyoVar = this.b.a;
                return new kpf(new ifx(dyoVar.vY, dyoVar.K));
            case 18:
                dxp dxpVar4 = this.b;
                dyo dyoVar2 = dxpVar4.a;
                return new ahez(dyoVar2.b.a, dyoVar2.uS, (aijf) dxpVar4.t.get(), dxpVar4.u, dxpVar4.ad, (aipq) dxpVar4.as.get(), (ainx) dxpVar4.a.uT.get(), (aisx) dxpVar4.f191J.get(), (aadd) dxpVar4.a.K.get(), axot.a(dxpVar4.a.vh), (aiix) dxpVar4.a.fH.get());
            case 19:
                dxp dxpVar5 = this.b;
                return ahed.m((aijh) dxpVar5.r.get(), (aijg) dxpVar5.s.get());
            case 20:
                Context context = this.b.a.b.a;
                return aiqx.d();
            case 21:
                Context context2 = this.b.a.b.a;
                return new aijg();
            case 22:
                dxp dxpVar6 = this.b;
                return new aisq((bame) dxpVar6.w.get(), dxpVar6.e(), (ailu) dxpVar6.u.get(), (aisx) dxpVar6.f191J.get());
            case 23:
                dxp dxpVar7 = this.b;
                Context context3 = dxpVar7.a.b.a;
                azpb azpbVar = (azpb) dxpVar7.v.get();
                axzl.o(azpbVar);
                return azpbVar;
            case 24:
                return azpd.ar();
            case 25:
                return new aisx((aipq) this.b.as.get());
            case 26:
                dxp dxpVar8 = this.b;
                dyo dyoVar3 = dxpVar8.a;
                azqb azqbVar = dyoVar3.v;
                azqb azqbVar2 = dyoVar3.hO;
                azqb azqbVar3 = dyoVar3.gb;
                azqb azqbVar4 = dyoVar3.uL;
                azqb azqbVar5 = dyoVar3.uM;
                azqb azqbVar6 = dxpVar8.E;
                azqb azqbVar7 = dxpVar8.t;
                azqb azqbVar8 = dxpVar8.p;
                azqb azqbVar9 = dyoVar3.fU;
                azqb azqbVar10 = dyoVar3.hy;
                azqb azqbVar11 = dyoVar3.vA;
                azqb azqbVar12 = dyoVar3.vB;
                azqb azqbVar13 = dyoVar3.K;
                azqb azqbVar14 = dyoVar3.D;
                azqb azqbVar15 = dxpVar8.ar;
                azqb azqbVar16 = dyoVar3.vu;
                azqb b = axoz.b(dxpVar8.B);
                dyo dyoVar4 = dxpVar8.a;
                return aheb.i(new ajan(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, b, dyoVar4.jl, dyoVar4.fH, dyoVar4.gO));
            case 27:
                dxp dxpVar9 = this.b;
                return new ajai((yni) dxpVar9.a.y.get(), dxpVar9.c(), (bame) dxpVar9.an.get(), (bame) dxpVar9.ao.get(), (bame) dxpVar9.ap.get(), (bame) dxpVar9.aq.get());
            case 28:
                dxp dxpVar10 = this.b;
                return aise.b((aivt) dxpVar10.A.get(), (aacz) dxpVar10.a.D.get());
            case 29:
                dxp dxpVar11 = this.b;
                return new aivt((afja) dxpVar11.a.hU.get(), (aynx) dxpVar11.z.get(), (aijh) dxpVar11.r.get(), (aynx) dxpVar11.a.fX.get(), (snc) dxpVar11.a.v.get(), (ajft) dxpVar11.a.uN.get(), (aadd) dxpVar11.a.K.get());
            case 30:
                return aiqx.g((azpa) this.b.y.get());
            case 31:
                return azpa.ar();
            case 32:
                dxp dxpVar12 = this.b;
                dyo dyoVar5 = dxpVar12.a;
                ajdz d2 = aaib.d(dyoVar5.uO, (ScheduledExecutorService) dyoVar5.h.get(), dxpVar12.am, (aisq) dxpVar12.a.uP.get(), (Handler) dxpVar12.a.an.get(), (Executor) dxpVar12.a.x.get(), (aadd) dxpVar12.a.K.get(), (aiix) dxpVar12.a.fH.get(), (SecureRandom) dxpVar12.a.eb.get(), dxpVar12.a.ci(), (acrr) dxpVar12.a.aw.get());
                d2.z((aynx) dxpVar12.z.get(), (aynx) dxpVar12.d.get());
                return d2;
            case 33:
                dxp dxpVar13 = this.b;
                return amvn.v((ajed) dxpVar13.ah.get(), (ajed) dxpVar13.ai.get(), (ajed) dxpVar13.aj.get(), (ajed) dxpVar13.ak.get(), (ajed) dxpVar13.al.get());
            case 34:
                dxp dxpVar14 = this.b;
                return aizs.c((aisq) dxpVar14.a.uP.get(), (Executor) dxpVar14.a.x.get(), dxpVar14.O, dxpVar14.R, (acrr) dxpVar14.a.aw.get(), (aiix) dxpVar14.a.fH.get());
            case 35:
                dxp dxpVar15 = this.b;
                dyo dyoVar6 = dxpVar15.a;
                Context context4 = dyoVar6.b.a;
                yni yniVar2 = (yni) dyoVar6.y.get();
                aeov aeovVar = (aeov) dxpVar15.a.hO.get();
                aiwb aiwbVar = (aiwb) dxpVar15.D.get();
                ajba ajbaVar = (ajba) dxpVar15.a.uR.get();
                ahez ahezVar = (ahez) dxpVar15.x.get();
                aijf aijfVar = (aijf) dxpVar15.t.get();
                aikh aikhVar = (aikh) dxpVar15.p.get();
                ajax ajaxVar = (ajax) dxpVar15.F.get();
                aegt aegtVar = (aegt) dxpVar15.a.hv.get();
                ahen ahenVar = new ahen(dxpVar15.a.b.a, (aijf) dxpVar15.t.get(), (aant) dxpVar15.a.fU.get(), (Executor) dxpVar15.a.h.get(), (bame) dxpVar15.H.get());
                ajad ajadVar = (ajad) dxpVar15.a.jD.get();
                afst afstVar = (afst) dxpVar15.a.hx.get();
                aadd aaddVar2 = (aadd) dxpVar15.a.K.get();
                aiiv aiivVar = (aiiv) dxpVar15.a.vl.get();
                aiis aiisVar = (aiis) dxpVar15.M.get();
                amvn.w(dxpVar15.S.get(), dxpVar15.T.get(), dxpVar15.U.get(), dxpVar15.W.get(), dxpVar15.X.get(), dxpVar15.Z.get(), dxpVar15.aa.get(), dxpVar15.ab.get(), dxpVar15.ac.get());
                airr b2 = aisj.b(context4, yniVar2, aeovVar, aiwbVar, ajbaVar, ahezVar, aijfVar, aikhVar, ajaxVar, ahenVar, ajadVar, afstVar, aaddVar2, aiisVar, (ailu) dxpVar15.u.get(), (aith) dxpVar15.K.get(), (aisx) dxpVar15.f191J.get(), (aisq) dxpVar15.ad.get(), (aiqp) dxpVar15.o.get(), (bame) dxpVar15.ae.get(), (bame) dxpVar15.af.get(), (aisi) dxpVar15.Q.get(), (aheq) dxpVar15.ag.get(), (aiix) dxpVar15.a.fH.get());
                b2.v((aisp) dxpVar15.N.get(), (aynx) dxpVar15.e.get(), (aisi) dxpVar15.Q.get(), (aijh) dxpVar15.r.get());
                return b2;
            case 36:
                return this.b.b();
            case 37:
                dxp dxpVar16 = this.b;
                return new aiwy((ScheduledExecutorService) dxpVar16.a.h.get(), (Executor) dxpVar16.a.h.get(), (zie) dxpVar16.a.uQ.get());
            case 38:
                return aheb.f((aynx) this.b.d.get());
            case 39:
                return azpd.ar();
            case 40:
                return new ajax((ajai) this.b.E.get());
            case 41:
                dxp dxpVar17 = this.b;
                Context context5 = dxpVar17.a.b.a;
                azpb azpbVar2 = (azpb) dxpVar17.G.get();
                axzl.o(azpbVar2);
                return azpbVar2;
            case 42:
                return azpd.ar();
            case 43:
                dxp dxpVar18 = this.b;
                zey bT = dxpVar18.a.bT();
                aith aithVar = (aith) dxpVar18.K.get();
                aynx aynxVar = (aynx) dxpVar18.d.get();
                aynx aynxVar2 = (aynx) dxpVar18.L.get();
                ailu ailuVar = (ailu) dxpVar18.u.get();
                aiqp aiqpVar2 = (aiqp) dxpVar18.o.get();
                axot.a(dxpVar18.q);
                Executor executor2 = (Executor) dxpVar18.a.x.get();
                return new aiis(bT, aithVar, aynxVar, aynxVar2, ailuVar, aiqpVar2);
            case 44:
                dxp dxpVar19 = this.b;
                return new aith(dxpVar19.a.ci(), (aiqp) dxpVar19.o.get(), (aios) dxpVar19.I.get(), (aisx) dxpVar19.f191J.get(), (Executor) dxpVar19.a.h.get(), (Executor) dxpVar19.a.x.get(), (aadd) dxpVar19.a.K.get(), dxpVar19.e(), (ailu) dxpVar19.u.get(), (aiix) dxpVar19.a.fH.get(), dxpVar19.d());
            case 45:
                dxp dxpVar20 = this.b;
                dyo dyoVar7 = dxpVar20.a;
                aioy a2 = aioz.a(dxpVar20.a.b.a, (aijf) dxpVar20.t.get(), (afvn) dxpVar20.a.au.get(), dyoVar7.vo, (aiow) dyoVar7.vq.get());
                a2.g();
                return a2;
            case 46:
                return azpd.ar();
            case 47:
                return this.b.a();
            case 48:
                dxp dxpVar21 = this.b;
                return new aisp((aynx) dxpVar21.z.get(), (aynx) dxpVar21.d.get(), (aynx) dxpVar21.v.get());
            case 49:
                dxp dxpVar22 = this.b;
                return ahed.k((airr) dxpVar22.O.get(), (aisi) dxpVar22.Q.get());
            case 50:
                return aiqx.c(this.b.P);
            case 51:
                dxp dxpVar23 = this.b;
                ahfq l = aasx.l((afkf) dxpVar23.a.gD.get());
                l.b((aynx) dxpVar23.c.get(), (aynx) dxpVar23.d.get(), (aynx) dxpVar23.z.get());
                return l;
            case 52:
                dxp dxpVar24 = this.b;
                return new aisl((aikh) dxpVar24.p.get(), (aios) dxpVar24.I.get(), (ajft) dxpVar24.a.uN.get(), (yni) dxpVar24.a.y.get(), amvn.r(new igl()), (aisp) dxpVar24.N.get(), amyg.a);
            case 53:
                dxp dxpVar25 = this.b;
                dyo dyoVar8 = dxpVar25.a;
                aiqf f = acrd.f((aiqp) dxpVar25.o.get(), (ahfm) dxpVar25.a.bd.get(), (Handler) dxpVar25.a.an.get(), axot.a(dxpVar25.R), (aynx) dxpVar25.i.get(), (aynx) dxpVar25.V.get(), (aynx) dxpVar25.e.get(), (aisp) dxpVar25.N.get(), dyoVar8.vr, dyoVar8.vs);
                f.b();
                return f;
            case 54:
                return aiqx.b((azpb) this.b.k.get());
            case 55:
                dxp dxpVar26 = this.b;
                dyo dyoVar9 = dxpVar26.a;
                aive e = aise.e(new aivb(dyoVar9.ay, dyoVar9.ll, dyoVar9.gP), (aisp) dxpVar26.N.get());
                e.a();
                return e;
            case 56:
                dxp dxpVar27 = this.b;
                aivo b3 = aizs.b(aivm.b((snc) dxpVar27.a.v.get(), (Executor) dxpVar27.a.h.get(), (afkf) dxpVar27.a.gD.get(), aivg.c((tis) dxpVar27.a.vt.get()), (aadd) dxpVar27.a.K.get(), (ScheduledExecutorService) dxpVar27.a.h.get()), (aisp) dxpVar27.N.get(), (aynx) dxpVar27.Y.get(), (aynx) dxpVar27.L.get(), (aynx) dxpVar27.d.get(), (aynx) dxpVar27.z.get());
                b3.a();
                return b3;
            case 57:
                return azpd.ar();
            case 58:
                dxp dxpVar28 = this.b;
                ajfv p = adzp.p((ajav) dxpVar28.a.vu.get(), (aijg) dxpVar28.s.get(), (aeov) dxpVar28.a.hO.get());
                p.a();
                return p;
            case 59:
                dxp dxpVar29 = this.b;
                aadd aaddVar3 = (aadd) dxpVar29.a.K.get();
                aigt m = adzp.m(new aiha(dxpVar29.a.jm, dxpVar29.r));
                m.a((aynx) dxpVar29.d.get());
                return m;
            case 60:
                dxp dxpVar30 = this.b;
                return aksx.b(dxpVar30.a.dv(), (aijh) dxpVar30.r.get());
            case 61:
                dxp dxpVar31 = this.b;
                Context context6 = dxpVar31.a.b.a;
                azpb azpbVar3 = (azpb) dxpVar31.b.get();
                axzl.o(azpbVar3);
                return azpbVar3;
            case 62:
                dxp dxpVar32 = this.b;
                Context context7 = dxpVar32.a.b.a;
                azpb azpbVar4 = (azpb) dxpVar32.C.get();
                axzl.o(azpbVar4);
                return azpbVar4;
            case 63:
                dxp dxpVar33 = this.b;
                return ahed.l((adzt) dxpVar33.a.gI.get(), (aijf) dxpVar33.t.get());
            case 64:
                dxp dxpVar34 = this.b;
                return ainr.e((Executor) dxpVar34.a.x.get(), dxpVar34.R, (aiix) dxpVar34.a.fH.get(), (acrr) dxpVar34.a.aw.get());
            case 65:
                dxp dxpVar35 = this.b;
                return adzp.o(dxpVar35.a.hC(), (aiix) dxpVar35.a.fH.get(), (ahfm) dxpVar35.a.bd.get());
            case 66:
                return ajcq.a();
            case 67:
                return ajct.c(this.b.a.as());
            case 68:
                dxp dxpVar36 = this.b;
                Context context8 = dxpVar36.a.b.a;
                azpb azpbVar5 = (azpb) dxpVar36.Y.get();
                axzl.o(azpbVar5);
                return azpbVar5;
            case 69:
                dxp dxpVar37 = this.b;
                Context context9 = dxpVar37.a.b.a;
                azpb azpbVar6 = (azpb) dxpVar37.L.get();
                axzl.o(azpbVar6);
                return azpbVar6;
            case 70:
                dxp dxpVar38 = this.b;
                Context context10 = dxpVar38.a.b.a;
                azpa azpaVar = (azpa) dxpVar38.y.get();
                axzl.o(azpaVar);
                return azpaVar;
            case 71:
                dxp dxpVar39 = this.b;
                Context context11 = dxpVar39.a.b.a;
                azpa azpaVar2 = (azpa) dxpVar39.c.get();
                axzl.o(azpaVar2);
                return azpaVar2;
            case 72:
                return new dyf(this.a, this.b);
            case 73:
                dxp dxpVar40 = this.b;
                yni yniVar3 = (yni) dxpVar40.a.y.get();
                ailv ailvVar = (ailv) dxpVar40.a.jn.get();
                aimy aimyVar = (aimy) dxpVar40.a.fI.get();
                Executor executor3 = (Executor) dxpVar40.a.h.get();
                Executor executor4 = (Executor) dxpVar40.a.x.get();
                amvl j = amvn.j(9);
                j.c((aimx) dxpVar40.a.vK.get());
                j.c((aimx) dxpVar40.a.vL.get());
                j.c(dxpVar40.a.bt());
                j.c((aimx) dxpVar40.a.vM.get());
                j.c((aimx) dxpVar40.a.vN.get());
                j.c(dxpVar40.a.cY());
                j.c((aimx) dxpVar40.a.fJ.get());
                j.c((aimx) dxpVar40.a.vO.get());
                j.j(ahed.n((ailw) dxpVar40.at.get(), (aimx) dxpVar40.a.lh.get()));
                return new ailf(yniVar3, ailvVar, aimyVar, executor3, executor4, j.g(), dxpVar40.a.dE(), (snc) dxpVar40.a.v.get(), (aadd) dxpVar40.a.K.get(), (aiix) dxpVar40.a.fH.get(), dxpVar40.a.bT());
            case 74:
                dxp dxpVar41 = this.b;
                return new ailw((aiji) dxpVar41.t.get(), (aikh) dxpVar41.p.get());
            case 75:
                return this.b.c();
            case 76:
                dxp dxpVar42 = this.b;
                aizu c = ainr.c((aizn) dxpVar42.a.jA.get(), (aijh) dxpVar42.a.sl.get(), (aizr) dxpVar42.a.vG.get(), (yni) dxpVar42.a.y.get());
                c.a();
                return c;
            case 77:
                dxp dxpVar43 = this.b;
                return new aizn(dxpVar43.O, dxpVar43.R, (zah) dxpVar43.a.av.get(), (aijf) dxpVar43.t.get(), (bame) dxpVar43.a.uW.get());
            case 78:
                return aiqx.e((ahfq) this.b.T.get());
            case 79:
                return aiqx.f((aisx) this.b.f191J.get());
            default:
                dxp dxpVar44 = this.b;
                return aise.c((airr) dxpVar44.O.get(), (aipq) dxpVar44.as.get());
        }
    }
}
