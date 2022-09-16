package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: dxd  reason: default package */
/* loaded from: classes3.dex */
final class dxd implements azqb {
    private final dyo a;
    private final dxe b;
    private final int c;

    public dxd(dyo dyoVar, dxe dxeVar, int i) {
        this.a = dyoVar;
        this.b = dxeVar;
        this.c = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        Object aivtVar;
        Object ailuVar;
        airr airrVar;
        int i = this.c;
        if (i / 100 == 0) {
            switch (i) {
                case 0:
                    return this.b.a();
                case 1:
                    dxe dxeVar = this.b;
                    airrVar = new kpb((aipq) dxeVar.A.get(), dxeVar.B(), (aiey) dxeVar.am.get(), (axxq) dxeVar.a.vI.get());
                    return airrVar;
                case 2:
                    dxe dxeVar2 = this.b;
                    dyo dyoVar = dxeVar2.a;
                    azqb azqbVar = dyoVar.v;
                    azqb azqbVar2 = dyoVar.hO;
                    azqb azqbVar3 = dyoVar.gb;
                    azqb azqbVar4 = dyoVar.uL;
                    azqb azqbVar5 = dyoVar.uM;
                    azqb azqbVar6 = dxeVar2.E;
                    azqb azqbVar7 = dxeVar2.j;
                    azqb azqbVar8 = dxeVar2.D;
                    azqb azqbVar9 = dyoVar.fU;
                    azqb azqbVar10 = dyoVar.hy;
                    azqb azqbVar11 = dyoVar.vA;
                    azqb azqbVar12 = dyoVar.vB;
                    azqb azqbVar13 = dyoVar.K;
                    azqb azqbVar14 = dyoVar.D;
                    azqb azqbVar15 = dxeVar2.ak;
                    azqb azqbVar16 = dyoVar.vu;
                    azqb b = axoz.b(dxeVar2.f);
                    dyo dyoVar2 = dxeVar2.a;
                    return new adli(new ajan(azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15, azqbVar16, b, dyoVar2.jl, dyoVar2.fH, dyoVar2.gO), (adlc) dxeVar2.al.get(), dxeVar2.a.jq, (aijf) dxeVar2.j.get());
                case 3:
                    return this.b.Q();
                case 4:
                    dxe dxeVar3 = this.b;
                    return aise.b((aivt) dxeVar3.d.get(), (aacz) dxeVar3.a.D.get());
                case 5:
                    dxe dxeVar4 = this.b;
                    aivtVar = new aivt((afja) dxeVar4.a.hU.get(), (aynx) dxeVar4.b.get(), (aijh) dxeVar4.c.get(), (aynx) dxeVar4.a.fX.get(), (snc) dxeVar4.a.v.get(), (ajft) dxeVar4.a.uN.get(), (aadd) dxeVar4.a.K.get());
                    return aivtVar;
                case 6:
                    return this.b.af();
                case 7:
                    return azpa.ar();
                case 8:
                    Context context = this.b.a.b.a;
                    return aiqx.d();
                case 9:
                    return this.b.T();
                case 10:
                    dxe dxeVar5 = this.b;
                    return amvn.v((ajed) dxeVar5.af.get(), (ajed) dxeVar5.ag.get(), (ajed) dxeVar5.ah.get(), (ajed) dxeVar5.ai.get(), (ajed) dxeVar5.aj.get());
                case 11:
                    dxe dxeVar6 = this.b;
                    return aizs.c((aisq) dxeVar6.a.uP.get(), (Executor) dxeVar6.a.x.get(), dxeVar6.M, dxeVar6.O, (acrr) dxeVar6.a.aw.get(), (aiix) dxeVar6.a.fH.get());
                case 12:
                    dxe dxeVar7 = this.b;
                    dyo dyoVar3 = dxeVar7.a;
                    Context context2 = dyoVar3.b.a;
                    yni yniVar = (yni) dyoVar3.y.get();
                    aeov aeovVar = (aeov) dxeVar7.a.hO.get();
                    aiwb aiwbVar = (aiwb) dxeVar7.h.get();
                    ajba ajbaVar = (ajba) dxeVar7.a.uR.get();
                    ahez ahezVar = (ahez) dxeVar7.w.get();
                    aijf aijfVar = (aijf) dxeVar7.j.get();
                    aikh aikhVar = (aikh) dxeVar7.D.get();
                    ajax ajaxVar = (ajax) dxeVar7.F.get();
                    aegt aegtVar = (aegt) dxeVar7.a.hv.get();
                    ahen ahenVar = new ahen(dxeVar7.a.b.a, (aijf) dxeVar7.j.get(), (aant) dxeVar7.a.fU.get(), (Executor) dxeVar7.a.h.get(), (bame) dxeVar7.H.get());
                    ajad ajadVar = (ajad) dxeVar7.a.jD.get();
                    afst afstVar = (afst) dxeVar7.a.hx.get();
                    aadd aaddVar = (aadd) dxeVar7.a.K.get();
                    aiiv aiivVar = (aiiv) dxeVar7.a.vl.get();
                    aiis aiisVar = (aiis) dxeVar7.K.get();
                    amvn.w(dxeVar7.P.get(), dxeVar7.Q.get(), dxeVar7.S.get(), dxeVar7.U.get(), dxeVar7.V.get(), dxeVar7.W.get(), dxeVar7.X.get(), dxeVar7.Y.get(), dxeVar7.Z.get(), dxeVar7.aa.get(), dxeVar7.a.vz.get());
                    airr b2 = aisj.b(context2, yniVar, aeovVar, aiwbVar, ajbaVar, ahezVar, aijfVar, aikhVar, ajaxVar, ahenVar, ajadVar, afstVar, aaddVar, aiisVar, (ailu) dxeVar7.x.get(), (aith) dxeVar7.f189J.get(), (aisx) dxeVar7.B.get(), (aisq) dxeVar7.C.get(), (aiqp) dxeVar7.v.get(), (bame) dxeVar7.ac.get(), (bame) dxeVar7.ad.get(), (aisi) dxeVar7.N.get(), (aheq) dxeVar7.ae.get(), (aiix) dxeVar7.a.fH.get());
                    b2.v((aisp) dxeVar7.L.get(), (aynx) dxeVar7.l.get(), (aisi) dxeVar7.N.get(), (aijh) dxeVar7.c.get());
                    airrVar = b2;
                    return airrVar;
                case 13:
                    return this.b.L();
                case 14:
                    return this.b.N();
                case 15:
                    return aheb.f((aynx) this.b.e.get());
                case 16:
                    return this.b.ag();
                case 17:
                    return azpa.ar();
                case 18:
                    return azpd.ar();
                case 19:
                    return this.b.m();
                case 20:
                    dxe dxeVar8 = this.b;
                    return ahed.m((aijh) dxeVar8.c.get(), (aijg) dxeVar8.i.get());
                case 21:
                    Context context3 = this.b.a.b.a;
                    airrVar = new aijg();
                    return airrVar;
                case 22:
                    dxe dxeVar9 = this.b;
                    yni yniVar2 = (yni) dxeVar9.a.y.get();
                    axnm a = axot.a(dxeVar9.k);
                    Handler handler = (Handler) dxeVar9.a.an.get();
                    yzj yzjVar = (yzj) dxeVar9.a.je.get();
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dxeVar9.a.Q.get();
                    Executor executor = (Executor) dxeVar9.a.x.get();
                    aiqp aiqpVar = (aiqp) dxeVar9.v.get();
                    ahey aG = dxeVar9.aG();
                    aadd aaddVar2 = (aadd) dxeVar9.a.K.get();
                    aacz aaczVar = (aacz) dxeVar9.a.D.get();
                    ahfm ahfmVar = (ahfm) dxeVar9.a.bd.get();
                    ailuVar = new ailu(yniVar2, a, handler, yzjVar, scheduledExecutorService, executor, aiqpVar, aG, aaddVar2, aaczVar, (aiix) dxeVar9.a.fH.get());
                    return ailuVar;
                case 23:
                    dxe dxeVar10 = this.b;
                    return acrd.g((azpb) dxeVar10.l.get(), (azpb) dxeVar10.m.get(), (azpb) dxeVar10.n.get(), (azpb) dxeVar10.o.get(), (azpb) dxeVar10.p.get(), (azpb) dxeVar10.q.get(), (azpb) dxeVar10.r.get(), (azpb) dxeVar10.s.get(), (azpb) dxeVar10.t.get(), (azpb) dxeVar10.u.get());
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
                    dxe dxeVar11 = this.b;
                    airrVar = new aisq((bame) dxeVar11.z.get(), dxeVar11.aH(), (ailu) dxeVar11.x.get(), (aisx) dxeVar11.B.get());
                    return airrVar;
                case 35:
                    dxe dxeVar12 = this.b;
                    Context context4 = dxeVar12.a.b.a;
                    azpb azpbVar = (azpb) dxeVar12.y.get();
                    axzl.o(azpbVar);
                    return azpbVar;
                case 36:
                    return azpd.ar();
                case 37:
                    return this.b.H();
                case 38:
                    return this.b.u();
                case 39:
                    airrVar = new ajax((ajai) this.b.E.get());
                    return airrVar;
                case 40:
                    dxe dxeVar13 = this.b;
                    Context context5 = dxeVar13.a.b.a;
                    azpb azpbVar2 = (azpb) dxeVar13.G.get();
                    axzl.o(azpbVar2);
                    return azpbVar2;
                case 41:
                    return azpd.ar();
                case 42:
                    return this.b.q();
                case 43:
                    dxe dxeVar14 = this.b;
                    ailuVar = new aith(dxeVar14.a.ci(), (aiqp) dxeVar14.v.get(), (aios) dxeVar14.I.get(), (aisx) dxeVar14.B.get(), (Executor) dxeVar14.a.h.get(), (Executor) dxeVar14.a.x.get(), (aadd) dxeVar14.a.K.get(), dxeVar14.aH(), (ailu) dxeVar14.x.get(), (aiix) dxeVar14.a.fH.get(), dxeVar14.aG());
                    return ailuVar;
                case 44:
                    return this.b.c();
                case 45:
                    return azpd.ar();
                case 46:
                    return this.b.l();
                case 47:
                    dxe dxeVar15 = this.b;
                    airrVar = new aisp((aynx) dxeVar15.b.get(), (aynx) dxeVar15.e.get(), (aynx) dxeVar15.y.get());
                    return airrVar;
                case 48:
                    dxe dxeVar16 = this.b;
                    return ahed.k((airr) dxeVar16.M.get(), (aisi) dxeVar16.N.get());
                case 49:
                    return aiqx.c(this.b.k);
                case 50:
                    return this.b.n();
                case 51:
                    dxe dxeVar17 = this.b;
                    aivtVar = new aisl((aikh) dxeVar17.D.get(), (aios) dxeVar17.I.get(), (ajft) dxeVar17.a.uN.get(), (yni) dxeVar17.a.y.get(), amvn.r(new igl()), (aisp) dxeVar17.L.get(), amvn.r((aiiz) dxeVar17.R.get()));
                    return aivtVar;
                case 52:
                    return this.b.o();
                case 53:
                    dxe dxeVar18 = this.b;
                    dyo dyoVar4 = dxeVar18.a;
                    aiqf f = acrd.f((aiqp) dxeVar18.v.get(), (ahfm) dxeVar18.a.bd.get(), (Handler) dxeVar18.a.an.get(), axot.a(dxeVar18.O), (aynx) dxeVar18.p.get(), (aynx) dxeVar18.T.get(), (aynx) dxeVar18.l.get(), (aisp) dxeVar18.L.get(), dyoVar4.vr, dyoVar4.vs);
                    f.b();
                    return f;
                case 54:
                    return this.b.U();
                case 55:
                    return this.b.I();
                case 56:
                    return this.b.J();
                case 57:
                    return azpd.ar();
                case 58:
                    dxe dxeVar19 = this.b;
                    ajfv p = adzp.p((ajav) dxeVar19.a.vu.get(), (aijg) dxeVar19.i.get(), (aeov) dxeVar19.a.hO.get());
                    p.a();
                    return p;
                case 59:
                    dxe dxeVar20 = this.b;
                    aadd aaddVar3 = (aadd) dxeVar20.a.K.get();
                    aigt m = adzp.m(new aiha(dxeVar20.a.jm, dxeVar20.c));
                    m.a((aynx) dxeVar20.e.get());
                    airrVar = m;
                    return airrVar;
                case 60:
                    dxe dxeVar21 = this.b;
                    return aksx.b(dxeVar21.a.dv(), (aijh) dxeVar21.c.get());
                case 61:
                    return this.b.e();
                case 62:
                    return this.b.d();
                case 63:
                    airrVar = new kan((airw) this.b.a.fP.get());
                    return airrVar;
                case 64:
                    airrVar = new kas((airw) this.b.a.fP.get());
                    return airrVar;
                case 65:
                    dxe dxeVar22 = this.b;
                    Context context6 = dxeVar22.a.b.a;
                    azpb azpbVar3 = (azpb) dxeVar22.ab.get();
                    axzl.o(azpbVar3);
                    return azpbVar3;
                case 66:
                    return azpd.ar();
                case 67:
                    dxe dxeVar23 = this.b;
                    Context context7 = dxeVar23.a.b.a;
                    azpb azpbVar4 = (azpb) dxeVar23.g.get();
                    axzl.o(azpbVar4);
                    return azpbVar4;
                case 68:
                    return this.b.k();
                case 69:
                    dxe dxeVar24 = this.b;
                    return ainr.e((Executor) dxeVar24.a.x.get(), dxeVar24.O, (aiix) dxeVar24.a.fH.get(), (acrr) dxeVar24.a.aw.get());
                case 70:
                    return this.b.R();
                case 71:
                    return ajcq.a();
                case 72:
                    return ajct.c(this.b.a.as());
                case 73:
                    dxe dxeVar25 = this.b;
                    return amvn.t(dxeVar25.a.fs(), dxeVar25.a.eP(), (ajfb) dxeVar25.a.tB.get());
                case 74:
                    return this.b.az();
                case 75:
                    return this.b.aA();
                case 76:
                    return this.b.ax();
                case 77:
                    return this.b.ay();
                case 78:
                    return new dyl(this.a, this.b);
                case 79:
                    return this.b.g();
                case 80:
                    dxe dxeVar26 = this.b;
                    aizu c = ainr.c((aizn) dxeVar26.a.jA.get(), (aijh) dxeVar26.a.sl.get(), (aizr) dxeVar26.a.vG.get(), (yni) dxeVar26.a.y.get());
                    c.a();
                    return c;
                case 81:
                    airw airwVar = ((aidn) this.b.a.eQ.get()).a;
                    axzl.o(airwVar);
                    return airwVar;
                case 82:
                    dyo dyoVar5 = this.b.a;
                    azqb azqbVar17 = dyoVar5.fO;
                    azqb azqbVar18 = dyoVar5.ib;
                    fgj fgjVar = (fgj) dyoVar5.vH.get();
                    aiey aieyVar = new aiey(new aifg(azqbVar17, azqbVar18), fgjVar);
                    aieyVar.e(new kou(new kow(fgjVar), fgjVar));
                    return aieyVar;
                case 83:
                    dxe dxeVar27 = this.b;
                    airrVar = new kox(new igk(dxeVar27.a.vJ), dxeVar27.B());
                    return airrVar;
                case 84:
                    return this.b.f();
                case 85:
                    dxe dxeVar28 = this.b;
                    dyo dyoVar6 = dxeVar28.a;
                    Set ar = dxeVar28.ar();
                    ahfm ahfmVar2 = (ahfm) dxeVar28.a.bd.get();
                    return new agsv((yni) dxeVar28.a.y.get(), (ailv) dxeVar28.a.jn.get(), (aimy) dxeVar28.a.fI.get(), dyoVar6.gS, dyoVar6.jg, (Executor) dyoVar6.h.get(), (Executor) dxeVar28.a.x.get(), ar, (aadd) dxeVar28.a.K.get(), dxeVar28.a.dE(), (snc) dxeVar28.a.v.get(), (agwp) dxeVar28.a.jo.get(), dxeVar28.a.bT(), (ahdn) dxeVar28.a.gR.get(), (ahdf) dxeVar28.a.ha.get(), (aiix) dxeVar28.a.fH.get());
                case 86:
                    dxe dxeVar29 = this.b;
                    airrVar = new ailw((aiji) dxeVar29.j.get(), (aikh) dxeVar29.D.get());
                    return airrVar;
                case 87:
                    dxe dxeVar30 = this.b;
                    return aimo.c((yni) dxeVar30.a.y.get(), (aaqj) dxeVar30.a.er.get(), (aaqf) dxeVar30.a.eV.get(), (afvn) dxeVar30.a.au.get(), (aimy) dxeVar30.a.fI.get(), dxeVar30.ar(), (abec) dxeVar30.a.lL.get(), (aadd) dxeVar30.a.K.get(), dxeVar30.a.dE());
                case 88:
                    return this.b.v();
                case 89:
                    dxe dxeVar31 = this.b;
                    dyo dyoVar7 = dxeVar31.a;
                    aine aineVar = new aine(dyoVar7.eq, dyoVar7.au, dyoVar7.jg, dyoVar7.ji);
                    dyo dyoVar8 = dxeVar31.a;
                    return aime.b((snc) dxeVar31.a.v.get(), aineVar, new aink(dyoVar8.eq, dyoVar8.au, dyoVar8.kD), (Executor) dxeVar31.a.h.get());
                case 90:
                    return this.b.i();
                case 91:
                    return new agtj();
                case 92:
                    return this.b.b();
                case 93:
                    return this.b.h();
                case 94:
                    return this.b.j();
                case 95:
                    dyo dyoVar9 = this.b.a;
                    return new kpf(new ifx(dyoVar9.vY, dyoVar9.K), 1);
                case 96:
                    return this.b.as();
                case 97:
                    dxe dxeVar32 = this.b;
                    return new aizn(dxeVar32.M, dxeVar32.O, (zah) dxeVar32.a.av.get(), (aijf) dxeVar32.j.get(), (bame) dxeVar32.a.uW.get());
                case 98:
                    return aiqx.e((ahfq) this.b.Q.get());
                case 99:
                    return aiqx.f((aisx) this.b.B.get());
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 100:
                dxe dxeVar33 = this.b;
                return aise.c((airr) dxeVar33.M.get(), (aipq) dxeVar33.A.get());
            case 101:
                dxe dxeVar34 = this.b;
                return new ahwi((aynx) dxeVar34.e.get(), (aynx) dxeVar34.b.get(), (Executor) dxeVar34.a.x.get(), (bame) dxeVar34.an.get(), (bame) dxeVar34.ao.get(), (aizl) dxeVar34.M.get());
            case 102:
                return azpd.ar();
            case 103:
                return azpd.ar();
            default:
                throw new AssertionError(i);
        }
    }
}
