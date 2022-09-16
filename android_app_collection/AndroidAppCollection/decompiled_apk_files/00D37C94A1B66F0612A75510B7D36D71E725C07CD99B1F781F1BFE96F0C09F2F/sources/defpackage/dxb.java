package defpackage;

import android.app.Activity;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentToolbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.libraries.youtube.player.features.overlay.subtitles.SubtitlesOverlayPresenter;
import com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
import com.google.protos.youtube.api.innertube.SubtitlesEndpointOuterClass$SubtitlesEndpoint;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxb  reason: default package */
/* loaded from: classes3.dex */
public final class dxb implements azqb {
    private final int a;
    private final eao b;

    public dxb(eao eaoVar, int i) {
        this.b = eaoVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [hki, java.lang.Object] */
    @Override // defpackage.azqb
    public final Object get() {
        Object reelBrowseFragmentToolbarController;
        Object ajsfVar;
        izt iztVar;
        Object wdmVar;
        int i = this.a;
        if (i / 100 != 0) {
            switch (i) {
                case 100:
                    eao eaoVar = this.b;
                    wdj wdjVar = new wdj();
                    dyo dyoVar = eaoVar.b;
                    wdjVar.a = dyoVar.b.a;
                    wdjVar.b = (vzm) dyoVar.dh.get();
                    wdjVar.c = (zdz) eaoVar.b.dy.get();
                    wdjVar.d = (yqw) eaoVar.b.fB.get();
                    wdmVar = new wdm(wdjVar, (Executor) eaoVar.b.h.get());
                    break;
                case 101:
                    return this.b.as();
                case 102:
                    return this.b.aG();
                case 103:
                    return this.b.aI();
                case 104:
                    return this.b.aF();
                case 105:
                    return this.b.aH();
                case 106:
                    return this.b.aA();
                case 107:
                    eao eaoVar2 = this.b;
                    wdmVar = new abvk(eaoVar2.c.f, eaoVar2.b.a.bo);
                    break;
                case 108:
                    return this.b.aB();
                case 109:
                    return this.b.aC();
                case 110:
                    return this.b.aD();
                default:
                    throw new AssertionError(i);
            }
            return wdmVar;
        }
        switch (i) {
            case 0:
                return this.b.g();
            case 1:
                dwq dwqVar = this.b.c;
                iztVar = new kxz(dwqVar.f, dwqVar.dy, 9, (char[][]) null);
                return iztVar;
            case 2:
                iztVar = new krb(this.b.c.f, 5, (short[]) null);
                return iztVar;
            case 3:
                eao eaoVar3 = this.b;
                reelBrowseFragmentToolbarController = new ReelBrowseFragmentToolbarController((guy) eaoVar3.g.get(), new hit((aafo) eaoVar3.c.H.get(), eaoVar3.c.h(), (ajxz) eaoVar3.b.lV.get()), new hir(eaoVar3.c.h(), (dt) eaoVar3.c.s.get(), eaoVar3.o()), new hhz(eaoVar3.c.h(), (dt) eaoVar3.c.s.get(), (aafo) eaoVar3.c.H.get(), (ajxz) eaoVar3.b.lV.get(), (acth) eaoVar3.c.L.get(), eaoVar3.o()), (acth) eaoVar3.c.L.get());
                return reelBrowseFragmentToolbarController;
            case 4:
                guo guoVar = (guo) this.b.a;
                axzl.o(guoVar);
                return guoVar;
            case 5:
                eao eaoVar4 = this.b;
                return new ReelBrowseFragmentFeedController((acth) eaoVar4.c.L.get(), eaoVar4.c.iK(), (yni) eaoVar4.b.y.get(), (aath) eaoVar4.b.kn.get(), (yzj) eaoVar4.b.je.get(), (aadd) eaoVar4.b.K.get(), (aynx) eaoVar4.b.yK.get(), (ajyi) eaoVar4.c.ah.get(), eaoVar4.c.iT(), new ajyx(), eaoVar4.am(), (SfvAudioItemPlaybackController) eaoVar4.c.go.get(), eaoVar4.c.aU(), eaoVar4.c.iH(), (tdu) eaoVar4.b.xx.get());
            case 6:
                eao eaoVar5 = this.b;
                iztVar = new guw((fwx) eaoVar5.c.gJ.get(), (acth) eaoVar5.c.L.get());
                return iztVar;
            case 7:
                eao eaoVar6 = this.b;
                ?? jL = eaoVar6.c.jL();
                Executor executor = (Executor) eaoVar6.b.x.get();
                ankx ankxVar = (ankx) eaoVar6.b.h.get();
                return new hai(jL, executor, eaoVar6.a, (snc) eaoVar6.b.v.get(), (hhl) eaoVar6.c.jH.get(), (hfn) eaoVar6.c.hB.get(), gzv.a, (hkl) eaoVar6.b.yP.get(), (hef) eaoVar6.c.lR.get(), (hkg) eaoVar6.c.jk.get(), new haj(), new hao((hhl) eaoVar6.c.jH.get(), (hkg) eaoVar6.c.jk.get(), (ankx) eaoVar6.b.h.get(), (Executor) eaoVar6.b.x.get()));
            case 8:
                return this.b.aN();
            case 9:
                return this.b.az();
            case 10:
                eao eaoVar7 = this.b;
                ajry ajryVar = (ajry) eaoVar7.n.get();
                ajry ajryVar2 = (ajry) eaoVar7.o.get();
                hkl hklVar = (hkl) eaoVar7.b.yP.get();
                hvy hvyVar = (hvy) eaoVar7.p.get();
                hci hciVar = (hci) eaoVar7.l.get();
                hba hbaVar = (hba) eaoVar7.q.get();
                ayor ayorVar = (ayor) eaoVar7.b.iz.get();
                tmm tmmVar = (tmm) eaoVar7.b.a.Q.get();
                tmn tmnVar = (tmn) eaoVar7.b.a.P.get();
                eaoVar7.b.a.p();
                ajsfVar = new ajsf(new hdc(amup.m(hcn.class, ajryVar, hbr.class, ajryVar2, hbl.class, new hbk(hklVar, hvyVar, hciVar, hbaVar, ayorVar))), new hda((hcy) eaoVar7.r.get(), eaoVar7.az()), eaoVar7.u, (hkl) eaoVar7.b.yP.get());
                return ajsfVar;
            case 11:
                return new mrs(1);
            case 12:
                return this.b.aM();
            case 13:
                return this.b.D();
            case 14:
                dp dpVar = this.b.a;
                Object obj = dpVar instanceof zwx ? ((zwx) dpVar).ay : dpVar instanceof zqw ? (zqw) dpVar : hle.a;
                axzl.o(obj);
                return obj;
            case 15:
                hvx hvxVar = (hvx) this.b.a;
                axzl.o(hvxVar);
                return hvxVar;
            case 16:
                eao eaoVar8 = this.b;
                ajsfVar = new hay(eaoVar8.c.a(), (Executor) eaoVar8.b.x.get(), (ankw) eaoVar8.b.h.get());
                return ajsfVar;
            case 17:
                eao eaoVar9 = this.b;
                iztVar = new hcy(axot.a(eaoVar9.t), (hba) eaoVar9.q.get());
                return iztVar;
            case 18:
                return amvn.r((hdb) this.b.s.get());
            case 19:
                return new hca((hcy) this.b.r.get());
            case 20:
                return this.b.aL();
            case 21:
                return this.b.i();
            case 22:
                return this.b.m();
            case 23:
                return this.b.n();
            case 24:
                eao eaoVar10 = this.b;
                return new hoi(new hpu(eaoVar10.c.a(), (ajxz) eaoVar10.b.lV.get(), (aafo) eaoVar10.c.H.get(), (hwq) eaoVar10.b.a.aG.get(), (acth) eaoVar10.c.L.get()), (hwq) eaoVar10.b.a.aG.get(), new hos(eaoVar10.c.a(), eaoVar10.p()), (Handler) eaoVar10.b.an.get(), (ayor) eaoVar10.b.iz.get(), (ayor) eaoVar10.b.aq.get(), eaoVar10.q());
            case 25:
                eao eaoVar11 = this.b;
                return new hoa(new hku(eaoVar11.c.a(), new hkr(eaoVar11.c.a(), (Executor) eaoVar11.b.h.get(), (Executor) eaoVar11.b.x.get())));
            case 26:
                eao eaoVar12 = this.b;
                reelBrowseFragmentToolbarController = new hnz(eaoVar12.c.a(), new hqk(eaoVar12.c.a()));
                return reelBrowseFragmentToolbarController;
            case 27:
                eao eaoVar13 = this.b;
                iztVar = new hnp(eaoVar13.c.a(), (Handler) eaoVar13.b.an.get());
                return iztVar;
            case 28:
                return new hob(this.b.c.a());
            case 29:
                eao eaoVar14 = this.b;
                hzt hztVar = new hzt(eaoVar14.f201J, eaoVar14.K);
                dyo dyoVar2 = eaoVar14.b;
                return new iai((aadd) eaoVar14.b.K.get(), eaoVar14.b.gs(), eaoVar14.c.iq(), eaoVar14.c.io(), (iee) eaoVar14.c.hb.get(), (icw) eaoVar14.D.get(), (iap) eaoVar14.F.get(), (iak) eaoVar14.b.md.get(), (iel) eaoVar14.G.get(), hztVar, new ibe(dyoVar2.vV, eaoVar14.L, dyoVar2.a.R, dyoVar2.v, dyoVar2.x), (icr) eaoVar14.I.get(), (hyu) eaoVar14.b.a.R.get(), (acth) eaoVar14.c.L.get(), (Executor) eaoVar14.b.x.get(), (snc) eaoVar14.b.v.get(), (ReelSnackbarController) eaoVar14.c.jr.get());
            case 30:
                eao eaoVar15 = this.b;
                iztVar = new icw(eaoVar15.c.a(), (acth) eaoVar15.c.L.get());
                return iztVar;
            case 31:
                eao eaoVar16 = this.b;
                return new iap(eaoVar16.c.a(), (Handler) eaoVar16.b.an.get(), (iee) eaoVar16.c.hb.get(), (icw) eaoVar16.D.get(), (iei) eaoVar16.E.get(), (aadd) eaoVar16.b.K.get());
            case 32:
                ico icoVar = (ico) this.b.a;
                axzl.o(icoVar);
                return icoVar;
            case 33:
                eao eaoVar17 = this.b;
                return new iel((vne) eaoVar17.b.a.aI.get(), (apy) eaoVar17.c.s.get(), (Executor) eaoVar17.b.h.get(), (snc) eaoVar17.b.v.get());
            case 34:
                eao eaoVar18 = this.b;
                dwq dwqVar2 = eaoVar18.c;
                return new ibh(dwqVar2.cQ, dwqVar2.bb, dwqVar2.L, eaoVar18.I);
            case 35:
                eao eaoVar19 = this.b;
                iztVar = new ics(axot.a(eaoVar19.H), (acth) eaoVar19.c.L.get());
                return iztVar;
            case 36:
                dyo dyoVar3 = this.b.b;
                return new ibj(dyoVar3.K, dyoVar3.a.R);
            case 37:
                return this.b.aK();
            case 38:
                eao eaoVar20 = this.b;
                return new ifj(eaoVar20.c.a(), (aafo) eaoVar20.c.H.get(), (acth) eaoVar20.c.L.get(), (aadd) eaoVar20.b.K.get(), (ajxz) eaoVar20.b.lV.get());
            case 39:
                eao eaoVar21 = this.b;
                return new ido(eaoVar21.c.a(), (Handler) eaoVar21.b.an.get(), (iee) eaoVar21.c.hb.get(), (icw) eaoVar21.D.get(), (aadd) eaoVar21.b.K.get());
            case 40:
                eao eaoVar22 = this.b;
                iztVar = new idw((ajmy) eaoVar22.b.kC.get(), eaoVar22.b.gs());
                return iztVar;
            case 41:
                eao eaoVar23 = this.b;
                dwq dwqVar3 = eaoVar23.c;
                azqb azqbVar = dwqVar3.md;
                azqb azqbVar2 = dwqVar3.ma;
                azqb azqbVar3 = eaoVar23.G;
                dyo dyoVar4 = eaoVar23.b;
                return new idk(azqbVar, azqbVar2, azqbVar3, dyoVar4.kC, dwqVar3.H, eaoVar23.P, dwqVar3.L, dwqVar3.kV, eaoVar23.R, eaoVar23.S, dyoVar4.lV, dwqVar3.lb, dwqVar3.cQ, dwqVar3.bb);
            case 42:
                return this.b.e();
            case 43:
                eao eaoVar24 = this.b;
                dwq dwqVar4 = eaoVar24.c;
                return new ifc(dwqVar4.L, eaoVar24.Q, dwqVar4.ma);
            case 44:
                return this.b.f();
            case 45:
                return new iex();
            case 46:
                return new aiba(this.b.a.rg());
            case 47:
                eao eaoVar25 = this.b;
                return new SubtitlesOverlayPresenter((aiau) eaoVar25.U.get(), (aiwj) eaoVar25.b.wq.get(), (aiyx) eaoVar25.b.iS.get(), eaoVar25.c.is(), (Executor) eaoVar25.b.h.get(), (Executor) eaoVar25.b.x.get(), (aacz) eaoVar25.b.D.get());
            case 48:
                eao eaoVar26 = this.b;
                return new iaz((aafo) eaoVar26.c.H.get(), (iee) eaoVar26.c.hb.get(), eaoVar26.c.iI());
            case 49:
                eao eaoVar27 = this.b;
                return new hzq((aafo) eaoVar27.c.H.get(), (ajxz) eaoVar27.b.lV.get(), (iee) eaoVar27.c.hb.get(), (acth) eaoVar27.c.L.get(), (gfu) eaoVar27.b.eA.get());
            case 50:
                return this.b.X();
            case 51:
                return this.b.ay();
            case 52:
                return this.b.Y();
            case 53:
                return this.b.G();
            case 54:
                return new fxh();
            case 55:
                return this.b.Z();
            case 56:
                return this.b.E();
            case 57:
                return new lvz((aksb) this.b.c.ms.get());
            case 58:
                return this.b.aa();
            case 59:
                return this.b.ad();
            case 60:
                eao eaoVar28 = this.b;
                iztVar = new ftl((aacz) eaoVar28.b.D.get(), eaoVar28.c.bc());
                return iztVar;
            case 61:
                return this.b.d();
            case 62:
                eao eaoVar29 = this.b;
                return new yer(eaoVar29.c.a(), eaoVar29.c.iV(), (aafo) eaoVar29.c.H.get(), (yni) eaoVar29.b.y.get());
            case 63:
                return this.b.ax();
            case 64:
                return this.b.aw();
            case 65:
                return this.b.L();
            case 66:
                return this.b.I();
            case 67:
                return this.b.aO();
            case 68:
                return this.b.J();
            case 69:
                return this.b.aP();
            case 70:
                eao eaoVar30 = this.b;
                Activity a = eaoVar30.c.a();
                yni yniVar = (yni) eaoVar30.b.y.get();
                iyu iyuVar = (iyu) eaoVar30.am.get();
                abeb abebVar = (abeb) eaoVar30.b.lM.get();
                yzj yzjVar = (yzj) eaoVar30.b.je.get();
                ajsg iK = eaoVar30.c.iK();
                ajsi ajsiVar = (ajsi) eaoVar30.c.ia.get();
                ajsiVar.f(ixv.class, new ixy(a, (ajmy) eaoVar30.b.kC.get()));
                return new oeq(yniVar, iyuVar, abebVar, yzjVar, iK, ajsiVar, ((emo) eaoVar30.c.ab.get()).d());
            case 71:
                return this.b.K();
            case 72:
                eao eaoVar31 = this.b;
                Object obj2 = eaoVar31.aj.get();
                aafe g = aafi.g();
                g.c(amup.l(SubtitlesEndpointOuterClass$SubtitlesEndpoint.class, (iyr) obj2, MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.class, (iys) eaoVar31.ak.get()));
                return g.a();
            case 73:
                return this.b.aQ();
            case 74:
                eao eaoVar32 = this.b;
                Activity a2 = eaoVar32.c.a();
                airr ir = eaoVar32.c.ir();
                izt iztVar2 = new izt(new aibe(a2));
                iztVar2.m(new izp(ir));
                iztVar = iztVar2;
                return iztVar;
            case 75:
                return this.b.aR();
            case 76:
                return this.b.M();
            case 77:
                return new jfw();
            case 78:
                eao eaoVar33 = this.b;
                return new gee(eaoVar33.c.H, eaoVar33.b.lV);
            case 79:
                eao eaoVar34 = this.b;
                dyo dyoVar5 = eaoVar34.b;
                return new jlj(dyoVar5.kG, dyoVar5.kI, dyoVar5.gS, eaoVar34.an);
            case 80:
                return new nni();
            case 81:
                eao eaoVar35 = this.b;
                azqb azqbVar4 = eaoVar35.b.kI;
                dwq dwqVar5 = eaoVar35.c;
                return new fcg(azqbVar4, dwqVar5.fH, dwqVar5.H);
            case 82:
                return this.b.N();
            case 83:
                return this.b.c();
            case 84:
                return this.b.O();
            case 85:
                return this.b.P();
            case 86:
                return this.b.a();
            case 87:
                return this.b.aE();
            case 88:
                return this.b.ao();
            case 89:
                return this.b.Q();
            case 90:
                return new jwb(this.b.c.ir());
            case 91:
                return this.b.ab();
            case 92:
                return this.b.aU();
            case 93:
                return this.b.T();
            case 94:
                return this.b.U();
            case 95:
                eao eaoVar36 = this.b;
                dwq dwqVar6 = eaoVar36.c;
                azqb azqbVar5 = dwqVar6.f;
                azqb azqbVar6 = dwqVar6.ah;
                dyo dyoVar6 = eaoVar36.b;
                return new kza(azqbVar5, azqbVar6, dyoVar6.y, dyoVar6.an, dwqVar6.id, dwqVar6.ld, dwqVar6.mO);
            case 96:
                return this.b.at();
            case 97:
                return this.b.au();
            case 98:
                return this.b.ac();
            case 99:
                return new mpf(this.b.c.a());
            default:
                throw new AssertionError(i);
        }
    }
}
