package defpackage;

import android.content.Context;
import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dxl  reason: default package */
/* loaded from: classes3.dex */
final class dxl implements azqb {
    private final dyo a;
    private final dxm b;
    private final int c;

    public dxl(dyo dyoVar, dxm dxmVar, int i) {
        this.a = dyoVar;
        this.b = dxmVar;
        this.c = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.c) {
            case 0:
                dxm dxmVar = this.b;
                return new aipr(aiqa.b(zto.q, (aipq) dxmVar.D.get()), new aipw(dxmVar.af, dxmVar.h, dxmVar.y, dxmVar.G, dxmVar.A, dxmVar.a.fH));
            case 1:
                dxm dxmVar2 = this.b;
                dyo dyoVar = dxmVar2.a;
                azqb azqbVar = dyoVar.v;
                azqb azqbVar2 = dyoVar.hO;
                azqb azqbVar3 = dyoVar.gb;
                azqb azqbVar4 = dyoVar.uL;
                azqb azqbVar5 = dyoVar.uM;
                azqb azqbVar6 = dxmVar2.H;
                azqb azqbVar7 = dxmVar2.m;
                azqb azqbVar8 = dxmVar2.G;
                azqb azqbVar9 = dyoVar.fU;
                azqb azqbVar10 = dyoVar.hy;
                azqb azqbVar11 = dyoVar.vA;
                azqb azqbVar12 = dyoVar.vB;
                azqb azqbVar13 = dyoVar.K;
                azqb azqbVar14 = dyoVar.D;
                azqb azqbVar15 = dxmVar2.at;
                azqb azqbVar16 = dyoVar.vu;
                azqb b = axoz.b(dxmVar2.i);
                dyo dyoVar2 = dxmVar2.a;
                return aheb.i(new ajan(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, b, dyoVar2.jl, dyoVar2.fH, dyoVar2.gO));
            case 2:
                dxm dxmVar3 = this.b;
                return new ajai((yni) dxmVar3.a.y.get(), dxmVar3.c(), (bame) dxmVar3.ap.get(), (bame) dxmVar3.aq.get(), (bame) dxmVar3.ar.get(), (bame) dxmVar3.as.get());
            case 3:
                dxm dxmVar4 = this.b;
                return aise.b((aivt) dxmVar4.e.get(), (aacz) dxmVar4.a.D.get());
            case 4:
                dxm dxmVar5 = this.b;
                return new aivt((afja) dxmVar5.a.hU.get(), (aynx) dxmVar5.c.get(), (aijh) dxmVar5.d.get(), (aynx) dxmVar5.a.fX.get(), (snc) dxmVar5.a.v.get(), (ajft) dxmVar5.a.uN.get(), (aadd) dxmVar5.a.K.get());
            case 5:
                return aiqx.g((azpa) this.b.b.get());
            case 6:
                return azpa.ar();
            case 7:
                Context context = this.b.a.b.a;
                return aiqx.d();
            case 8:
                dxm dxmVar6 = this.b;
                dyo dyoVar3 = dxmVar6.a;
                ajdz d = aaib.d(dyoVar3.uO, (ScheduledExecutorService) dyoVar3.h.get(), dxmVar6.ao, (aisq) dxmVar6.a.uP.get(), (Handler) dxmVar6.a.an.get(), (Executor) dxmVar6.a.x.get(), (aadd) dxmVar6.a.K.get(), (aiix) dxmVar6.a.fH.get(), (SecureRandom) dxmVar6.a.eb.get(), dxmVar6.a.ci(), (acrr) dxmVar6.a.aw.get());
                d.z((aynx) dxmVar6.c.get(), (aynx) dxmVar6.h.get());
                return d;
            case 9:
                dxm dxmVar7 = this.b;
                return amvn.v((ajed) dxmVar7.aj.get(), (ajed) dxmVar7.ak.get(), (ajed) dxmVar7.al.get(), (ajed) dxmVar7.am.get(), (ajed) dxmVar7.an.get());
            case 10:
                dxm dxmVar8 = this.b;
                return aizs.c((aisq) dxmVar8.a.uP.get(), (Executor) dxmVar8.a.x.get(), dxmVar8.Q, dxmVar8.T, (acrr) dxmVar8.a.aw.get(), (aiix) dxmVar8.a.fH.get());
            case 11:
                dxm dxmVar9 = this.b;
                dyo dyoVar4 = dxmVar9.a;
                Context context2 = dyoVar4.b.a;
                yni yniVar = (yni) dyoVar4.y.get();
                aeov aeovVar = (aeov) dxmVar9.a.hO.get();
                aiwb aiwbVar = (aiwb) dxmVar9.k.get();
                ajba ajbaVar = (ajba) dxmVar9.a.uR.get();
                ahez ahezVar = (ahez) dxmVar9.z.get();
                aijf aijfVar = (aijf) dxmVar9.m.get();
                aikh aikhVar = (aikh) dxmVar9.G.get();
                ajax ajaxVar = (ajax) dxmVar9.I.get();
                aegt aegtVar = (aegt) dxmVar9.a.hv.get();
                ahen ahenVar = new ahen(dxmVar9.a.b.a, (aijf) dxmVar9.m.get(), (aant) dxmVar9.a.fU.get(), (Executor) dxmVar9.a.h.get(), (bame) dxmVar9.K.get());
                ajad ajadVar = (ajad) dxmVar9.a.jD.get();
                afst afstVar = (afst) dxmVar9.a.hx.get();
                aadd aaddVar = (aadd) dxmVar9.a.K.get();
                aiiv aiivVar = (aiiv) dxmVar9.a.vl.get();
                aiis aiisVar = (aiis) dxmVar9.O.get();
                amvn.w(dxmVar9.U.get(), dxmVar9.V.get(), dxmVar9.W.get(), dxmVar9.Y.get(), dxmVar9.Z.get(), dxmVar9.ab.get(), dxmVar9.ac.get(), dxmVar9.ad.get(), dxmVar9.ae.get());
                airr b2 = aisj.b(context2, yniVar, aeovVar, aiwbVar, ajbaVar, ahezVar, aijfVar, aikhVar, ajaxVar, ahenVar, ajadVar, afstVar, aaddVar, aiisVar, (ailu) dxmVar9.A.get(), (aith) dxmVar9.M.get(), (aisx) dxmVar9.E.get(), (aisq) dxmVar9.F.get(), (aiqp) dxmVar9.y.get(), (bame) dxmVar9.ag.get(), (bame) dxmVar9.ah.get(), (aisi) dxmVar9.S.get(), (aheq) dxmVar9.ai.get(), (aiix) dxmVar9.a.fH.get());
                b2.v((aisp) dxmVar9.P.get(), (aynx) dxmVar9.o.get(), (aisi) dxmVar9.S.get(), (aijh) dxmVar9.d.get());
                return b2;
            case 12:
                dxm dxmVar10 = this.b;
                yni yniVar2 = (yni) dxmVar10.a.y.get();
                dyo dyoVar5 = dxmVar10.a;
                aiwb a = aiwc.a(yniVar2, dyoVar5.b.a, (aitm) dyoVar5.iR.get(), (aiwy) dxmVar10.f.get(), (ahfm) dxmVar10.a.bd.get(), (ScheduledExecutorService) dxmVar10.a.h.get(), (String) dxmVar10.a.fa.get(), (ankt) dxmVar10.a.lH.get(), axot.a(dxmVar10.i), (aiix) dxmVar10.a.fH.get());
                a.b((aynx) dxmVar10.h.get(), (aynx) dxmVar10.c.get(), (aynx) dxmVar10.j.get(), (aiix) dxmVar10.a.fH.get());
                return a;
            case 13:
                dxm dxmVar11 = this.b;
                return new aiwy((ScheduledExecutorService) dxmVar11.a.h.get(), (Executor) dxmVar11.a.h.get(), (zie) dxmVar11.a.uQ.get());
            case 14:
                return aheb.f((aynx) this.b.h.get());
            case 15:
                return aiqx.h((azpa) this.b.g.get());
            case 16:
                return azpa.ar();
            case 17:
                return azpd.ar();
            case 18:
                dxm dxmVar12 = this.b;
                dyo dyoVar6 = dxmVar12.a;
                return new ahez(dyoVar6.b.a, dyoVar6.uS, (aijf) dxmVar12.m.get(), dxmVar12.A, dxmVar12.F, (aipq) dxmVar12.D.get(), (ainx) dxmVar12.a.uT.get(), (aisx) dxmVar12.E.get(), (aadd) dxmVar12.a.K.get(), axot.a(dxmVar12.a.vh), (aiix) dxmVar12.a.fH.get());
            case 19:
                dxm dxmVar13 = this.b;
                return ahed.m((aijh) dxmVar13.d.get(), (aijg) dxmVar13.l.get());
            case 20:
                Context context3 = this.b.a.b.a;
                return new aijg();
            case 21:
                dxm dxmVar14 = this.b;
                yni yniVar3 = (yni) dxmVar14.a.y.get();
                axnm a2 = axot.a(dxmVar14.n);
                Handler handler = (Handler) dxmVar14.a.an.get();
                yzj yzjVar = (yzj) dxmVar14.a.je.get();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dxmVar14.a.Q.get();
                Executor executor = (Executor) dxmVar14.a.x.get();
                aiqp aiqpVar = (aiqp) dxmVar14.y.get();
                ahey d2 = dxmVar14.d();
                aadd aaddVar2 = (aadd) dxmVar14.a.K.get();
                aacz aaczVar = (aacz) dxmVar14.a.D.get();
                ahfm ahfmVar = (ahfm) dxmVar14.a.bd.get();
                return new ailu(yniVar3, a2, handler, yzjVar, scheduledExecutorService, executor, aiqpVar, d2, aaddVar2, aaczVar, (aiix) dxmVar14.a.fH.get());
            case 22:
                return this.b.w();
            case 23:
                dxm dxmVar15 = this.b;
                return acrd.g((azpb) dxmVar15.o.get(), (azpb) dxmVar15.p.get(), (azpb) dxmVar15.q.get(), (azpb) dxmVar15.r.get(), (azpb) dxmVar15.s.get(), (azpb) dxmVar15.t.get(), (azpb) dxmVar15.u.get(), (azpb) dxmVar15.v.get(), (azpb) dxmVar15.w.get(), (azpb) dxmVar15.x.get());
            case 24:
                return azpd.ar();
            case 25:
                return azpd.ar();
            case 26:
                return azpa.ar();
            case 27:
                return azpd.ar();
            case 28:
                return azpd.ar();
            case 29:
                return azpd.ar();
            case 30:
                return azpa.ar();
            case 31:
                return azpd.ar();
            case 32:
                return azpd.ar();
            case 33:
                return azpd.ar();
            case 34:
                dxm dxmVar16 = this.b;
                return new aisq((bame) dxmVar16.C.get(), dxmVar16.e(), (ailu) dxmVar16.A.get(), (aisx) dxmVar16.E.get());
            case 35:
                dxm dxmVar17 = this.b;
                Context context4 = dxmVar17.a.b.a;
                azpb azpbVar = (azpb) dxmVar17.B.get();
                axzl.o(azpbVar);
                return azpbVar;
            case 36:
                return azpd.ar();
            case 37:
                return new aisx((aipq) this.b.D.get());
            case 38:
                return new aikh((yni) this.b.a.y.get());
            case 39:
                return new ajax((ajai) this.b.H.get());
            case 40:
                dxm dxmVar18 = this.b;
                Context context5 = dxmVar18.a.b.a;
                azpb azpbVar2 = (azpb) dxmVar18.f190J.get();
                axzl.o(azpbVar2);
                return azpbVar2;
            case 41:
                return azpd.ar();
            case 42:
                dxm dxmVar19 = this.b;
                zey bT = dxmVar19.a.bT();
                aith aithVar = (aith) dxmVar19.M.get();
                aynx aynxVar = (aynx) dxmVar19.h.get();
                aynx aynxVar2 = (aynx) dxmVar19.N.get();
                ailu ailuVar = (ailu) dxmVar19.A.get();
                aiqp aiqpVar2 = (aiqp) dxmVar19.y.get();
                axot.a(dxmVar19.n);
                Executor executor2 = (Executor) dxmVar19.a.x.get();
                return new aiis(bT, aithVar, aynxVar, aynxVar2, ailuVar, aiqpVar2);
            case 43:
                dxm dxmVar20 = this.b;
                return new aith(dxmVar20.a.ci(), (aiqp) dxmVar20.y.get(), (aios) dxmVar20.L.get(), (aisx) dxmVar20.E.get(), (Executor) dxmVar20.a.h.get(), (Executor) dxmVar20.a.x.get(), (aadd) dxmVar20.a.K.get(), dxmVar20.e(), (ailu) dxmVar20.A.get(), (aiix) dxmVar20.a.fH.get(), dxmVar20.d());
            case 44:
                dxm dxmVar21 = this.b;
                dyo dyoVar7 = dxmVar21.a;
                aioy a3 = aioz.a(dxmVar21.a.b.a, (aijf) dxmVar21.m.get(), (afvn) dxmVar21.a.au.get(), dyoVar7.vo, (aiow) dyoVar7.vq.get());
                a3.g();
                return a3;
            case 45:
                return azpd.ar();
            case 46:
                return this.b.a();
            case 47:
                dxm dxmVar22 = this.b;
                return new aisp((aynx) dxmVar22.c.get(), (aynx) dxmVar22.h.get(), (aynx) dxmVar22.B.get());
            case 48:
                dxm dxmVar23 = this.b;
                return ahed.k((airr) dxmVar23.Q.get(), (aisi) dxmVar23.S.get());
            case 49:
                return aiqx.c(this.b.R);
            case 50:
                dxm dxmVar24 = this.b;
                ahfq l = aasx.l((afkf) dxmVar24.a.gD.get());
                l.b((aynx) dxmVar24.g.get(), (aynx) dxmVar24.h.get(), (aynx) dxmVar24.c.get());
                return l;
            case 51:
                dxm dxmVar25 = this.b;
                return new aisl((aikh) dxmVar25.G.get(), (aios) dxmVar25.L.get(), (ajft) dxmVar25.a.uN.get(), (yni) dxmVar25.a.y.get(), amvn.r(new igl()), (aisp) dxmVar25.P.get(), amyg.a);
            case 52:
                dxm dxmVar26 = this.b;
                dyo dyoVar8 = dxmVar26.a;
                aiqf f = acrd.f((aiqp) dxmVar26.y.get(), (ahfm) dxmVar26.a.bd.get(), (Handler) dxmVar26.a.an.get(), axot.a(dxmVar26.T), (aynx) dxmVar26.s.get(), (aynx) dxmVar26.X.get(), (aynx) dxmVar26.o.get(), (aisp) dxmVar26.P.get(), dyoVar8.vr, dyoVar8.vs);
                f.b();
                return f;
            case 53:
                return aiqx.b((azpb) this.b.u.get());
            case 54:
                dxm dxmVar27 = this.b;
                dyo dyoVar9 = dxmVar27.a;
                aive e = aise.e(new aivb(dyoVar9.ay, dyoVar9.ll, dyoVar9.gP), (aisp) dxmVar27.P.get());
                e.a();
                return e;
            case 55:
                dxm dxmVar28 = this.b;
                aivo b3 = aizs.b(aivm.b((snc) dxmVar28.a.v.get(), (Executor) dxmVar28.a.h.get(), (afkf) dxmVar28.a.gD.get(), aivg.c((tis) dxmVar28.a.vt.get()), (aadd) dxmVar28.a.K.get(), (ScheduledExecutorService) dxmVar28.a.h.get()), (aisp) dxmVar28.P.get(), (aynx) dxmVar28.aa.get(), (aynx) dxmVar28.N.get(), (aynx) dxmVar28.h.get(), (aynx) dxmVar28.c.get());
                b3.a();
                return b3;
            case 56:
                return azpd.ar();
            case 57:
                dxm dxmVar29 = this.b;
                ajfv p = adzp.p((ajav) dxmVar29.a.vu.get(), (aijg) dxmVar29.l.get(), (aeov) dxmVar29.a.hO.get());
                p.a();
                return p;
            case 58:
                dxm dxmVar30 = this.b;
                aadd aaddVar3 = (aadd) dxmVar30.a.K.get();
                aigt m = adzp.m(new aiha(dxmVar30.a.jm, dxmVar30.d));
                m.a((aynx) dxmVar30.h.get());
                return m;
            case 59:
                dxm dxmVar31 = this.b;
                return aksx.b(dxmVar31.a.dv(), (aijh) dxmVar31.d.get());
            case 60:
                dxm dxmVar32 = this.b;
                Context context6 = dxmVar32.a.b.a;
                azpb azpbVar3 = (azpb) dxmVar32.af.get();
                axzl.o(azpbVar3);
                return azpbVar3;
            case 61:
                return azpd.ar();
            case 62:
                dxm dxmVar33 = this.b;
                Context context7 = dxmVar33.a.b.a;
                azpb azpbVar4 = (azpb) dxmVar33.j.get();
                axzl.o(azpbVar4);
                return azpbVar4;
            case 63:
                dxm dxmVar34 = this.b;
                return ahed.l((adzt) dxmVar34.a.gI.get(), (aijf) dxmVar34.m.get());
            case 64:
                dxm dxmVar35 = this.b;
                return ainr.e((Executor) dxmVar35.a.x.get(), dxmVar35.T, (aiix) dxmVar35.a.fH.get(), (acrr) dxmVar35.a.aw.get());
            case 65:
                dxm dxmVar36 = this.b;
                return adzp.o(dxmVar36.a.hC(), (aiix) dxmVar36.a.fH.get(), (ahfm) dxmVar36.a.bd.get());
            case 66:
                return ajcq.a();
            case 67:
                return ajct.c(this.b.a.as());
            case 68:
                dxm dxmVar37 = this.b;
                Context context8 = dxmVar37.a.b.a;
                azpb azpbVar5 = (azpb) dxmVar37.aa.get();
                axzl.o(azpbVar5);
                return azpbVar5;
            case 69:
                dxm dxmVar38 = this.b;
                Context context9 = dxmVar38.a.b.a;
                azpb azpbVar6 = (azpb) dxmVar38.N.get();
                axzl.o(azpbVar6);
                return azpbVar6;
            case 70:
                dxm dxmVar39 = this.b;
                Context context10 = dxmVar39.a.b.a;
                azpa azpaVar = (azpa) dxmVar39.b.get();
                axzl.o(azpaVar);
                return azpaVar;
            case 71:
                dxm dxmVar40 = this.b;
                Context context11 = dxmVar40.a.b.a;
                azpa azpaVar2 = (azpa) dxmVar40.g.get();
                axzl.o(azpaVar2);
                return azpaVar2;
            case 72:
                return new dyi(this.a, this.b);
            case 73:
                dxm dxmVar41 = this.b;
                return new ailf((yni) dxmVar41.a.y.get(), (ailv) dxmVar41.a.jn.get(), (aimy) dxmVar41.a.fI.get(), (Executor) dxmVar41.a.h.get(), (Executor) dxmVar41.a.x.get(), dxmVar41.b(), dxmVar41.a.dE(), (snc) dxmVar41.a.v.get(), (aadd) dxmVar41.a.K.get(), (aiix) dxmVar41.a.fH.get(), dxmVar41.a.bT());
            case 74:
                dxm dxmVar42 = this.b;
                return new ailw((aiji) dxmVar42.m.get(), (aikh) dxmVar42.G.get());
            case 75:
                return this.b.c();
            case 76:
                dxm dxmVar43 = this.b;
                aizu c = ainr.c((aizn) dxmVar43.a.jA.get(), (aijh) dxmVar43.a.sl.get(), (aizr) dxmVar43.a.vG.get(), (yni) dxmVar43.a.y.get());
                c.a();
                return c;
            case 77:
                return aheb.g((snc) this.b.a.v.get());
            case 78:
                dxm dxmVar44 = this.b;
                return new aizn(dxmVar44.Q, dxmVar44.T, (zah) dxmVar44.a.av.get(), (aijf) dxmVar44.m.get(), (bame) dxmVar44.a.uW.get());
            case 79:
                return aiqx.e((ahfq) this.b.V.get());
            case 80:
                return aiqx.f((aisx) this.b.E.get());
            default:
                dxm dxmVar45 = this.b;
                return aise.c((airr) dxmVar45.Q.get(), (aipq) dxmVar45.D.get());
        }
    }
}
