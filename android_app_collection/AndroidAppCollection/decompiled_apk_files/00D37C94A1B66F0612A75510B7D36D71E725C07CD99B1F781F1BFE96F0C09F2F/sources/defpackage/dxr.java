package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxr  reason: default package */
/* loaded from: classes3.dex */
public final class dxr implements azqb {
    private final int a;
    private final eap b;

    public dxr(eap eapVar, int i) {
        this.b = eapVar;
        this.a = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.a) {
            case 0:
                eap eapVar = this.b;
                afvn afvnVar = (afvn) eapVar.a.au.get();
                agft agftVar = (agft) eapVar.a.ma.get();
                agcp agcpVar = (agcp) eapVar.a.et.get();
                afwc afwcVar = (afwc) eapVar.a.vo.get();
                agaf agafVar = (agaf) eapVar.b.get();
                ajxz ajxzVar = (ajxz) eapVar.a.lV.get();
                dyo dyoVar = eapVar.a;
                fap fapVar = (fap) eapVar.a.eu.get();
                return new fak(afvnVar, agftVar, agcpVar, afwcVar, agafVar, ajxzVar, dyoVar.hl, (aadd) dyoVar.K.get(), (agci) eapVar.a.mb.get());
            case 1:
                eap eapVar2 = this.b;
                return new agaf((yjl) eapVar2.a.ng.get(), (axwt) eapVar2.a.nN.get(), (yjs) eapVar2.a.ai.get(), (agfc) eapVar2.a.hq());
            case 2:
                eap eapVar3 = this.b;
                dyo dyoVar2 = eapVar3.a;
                Context context = dyoVar2.b.a;
                yzj yzjVar = (yzj) dyoVar2.je.get();
                acsx cI = eapVar3.a.cI();
                ajxz ajxzVar2 = (ajxz) eapVar3.a.lV.get();
                ajmr ajmrVar = (ajmr) eapVar3.a.kz.get();
                dyo dyoVar3 = eapVar3.a;
                azqb azqbVar = dyoVar3.by;
                azqb azqbVar2 = dyoVar3.xo;
                azqb azqbVar3 = dyoVar3.xp;
                azqb azqbVar4 = dyoVar3.lZ;
                azqb azqbVar5 = dyoVar3.y;
                azqb azqbVar6 = dyoVar3.fO;
                azqb azqbVar7 = dyoVar3.je;
                azqb azqbVar8 = dyoVar3.an;
                azqb azqbVar9 = dyoVar3.xq;
                azqb azqbVar10 = dyoVar3.xr;
                azqb azqbVar11 = eapVar3.d;
                azqb azqbVar12 = eapVar3.e;
                azqb azqbVar13 = eapVar3.f;
                azqb azqbVar14 = dyoVar3.dD;
                azqb azqbVar15 = eapVar3.g;
                azqbVar.getClass();
                azqbVar2.getClass();
                azqbVar3.getClass();
                azqbVar5.getClass();
                azqbVar6.getClass();
                azqbVar7.getClass();
                azqbVar8.getClass();
                azqbVar9.getClass();
                azqbVar10.getClass();
                azqbVar11.getClass();
                azqbVar12.getClass();
                azqbVar13.getClass();
                azqbVar14.getClass();
                azqbVar15.getClass();
                abiq a = abir.a((abha) eapVar3.h.get(), eapVar3.a.cI(), eapVar3.j(), azqbVar, azqbVar2, azqbVar3, azqbVar4, azqbVar5, azqbVar6, azqbVar7, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, azqbVar13, azqbVar14, azqbVar15);
                ajvm ajvmVar = (ajvm) eapVar3.a.xs.get();
                swq swqVar = new swq((tdr) eapVar3.u.get());
                eapVar3.d();
                acfq acfqVar = new acfq(context, yzjVar, cI, ajxzVar2, ajmrVar, a, ajvmVar, swqVar, (ajjr) eapVar3.a.dU.get(), (tdu) eapVar3.a.xx.get(), eapVar3.q, eapVar3.g(), eapVar3.h());
                acfqVar.a = eapVar3.v;
                acfqVar.b = eapVar3.w;
                return acfqVar;
            case 3:
                return new abic((Handler) this.b.a.an.get());
            case 4:
                dyo dyoVar4 = this.b.a;
                Context context2 = dyoVar4.b.a;
                return new abiy((Handler) dyoVar4.an.get());
            case 5:
                eap eapVar4 = this.b;
                dyo dyoVar5 = eapVar4.a;
                Context context3 = dyoVar5.b.a;
                afuw afuwVar = (afuw) eapVar4.a.on.get();
                tdb tdbVar = (tdb) eapVar4.a.nO.get();
                return new ajhn((Executor) dyoVar5.aA.get(), ampq.j((Boolean) eapVar4.a.ed.get()));
            case 6:
                return this.b.h();
            case 7:
                eap eapVar5 = this.b;
                return new abha((aafo) eapVar5.a.jd.get(), eapVar5.j());
            case 8:
                eap eapVar6 = this.b;
                amum i = amup.i(9);
                tfj e = eapVar6.e();
                teb d = eapVar6.d();
                Map n = eap.n();
                tdf c = eapVar6.c();
                eapVar6.o();
                i.f(axnk.class, svo.h((tei) eapVar6.o.get(), (tcu) eapVar6.i.get(), e, d, n, c, ampq.j(Boolean.valueOf(eapVar6.a.iw())), ampq.j(Boolean.valueOf(eapVar6.a.iz()))));
                i.f(axmq.class, opf.h((tei) eapVar6.o.get()));
                i.f(axmw.class, svo.a((tei) eapVar6.o.get()));
                i.f(axnh.class, svo.g((tei) eapVar6.o.get(), (tcu) eapVar6.i.get(), eapVar6.d()));
                i.f(axmz.class, svo.e((tei) eapVar6.o.get(), (tcu) eapVar6.i.get(), eapVar6.e(), eapVar6.d(), eap.n(), eapVar6.c()));
                i.f(axmr.class, opf.i((tei) eapVar6.o.get(), (tcu) eapVar6.i.get(), eapVar6.a(), ampq.j(Boolean.valueOf(eapVar6.a.iJ())), eapVar6.q, eapVar6.f()));
                tfj e2 = eapVar6.e();
                teb d2 = eapVar6.d();
                eapVar6.o();
                i.f(axmy.class, svo.d((tei) eapVar6.o.get(), (tcu) eapVar6.i.get(), e2, d2, eap.n()));
                dyo dyoVar6 = eapVar6.a;
                tcu tcuVar = (tcu) eapVar6.i.get();
                eapVar6.e();
                eapVar6.d();
                i.f(axmv.class, svo.b(opf.g(sza.i(dyoVar6.b.a, ampq.j((Boolean) dyoVar6.ed.get()), ampq.j((Boolean) eapVar6.a.dR.get()), eapVar6.r, eapVar6.j, eapVar6.m), (tdb) eapVar6.a.nO.get(), ampq.j(eapVar6.a.zh), eapVar6.d(), sza.j(amon.a), axot.a(eapVar6.r), (tax) eapVar6.t.get(), eapVar6.j, eapVar6.m, ampq.j((Boolean) eapVar6.a.dQ.get()), amon.a, ampq.j(Boolean.valueOf(eapVar6.a.iN())), ampq.j(Boolean.valueOf(eapVar6.a.iM())), ampq.j((Boolean) eapVar6.a.dW.get()), ampq.j(Integer.valueOf(eapVar6.a.b())), ampq.j((Boolean) eapVar6.a.zj.get()), ampq.j(eapVar6.a.zk)), (tei) eapVar6.o.get()));
                i.f(axnc.class, svo.f(sza.p((tei) eapVar6.o.get(), ampq.j((akcq) eapVar6.a.cP.get()), eapVar6.d(), (tcu) eapVar6.i.get(), svo.j(amup.k(axmp.class, svo.i(eapVar6.a.b.a, eapVar6.d())), amyc.b, eapVar6.d()), ampq.j(Boolean.valueOf(eapVar6.a.iG())), ampq.j(Float.valueOf(eapVar6.a.a()))), amon.a));
                return opf.f(i.b(), amyc.b, amyg.a, eapVar6.d(), ampq.j((Boolean) eapVar6.a.dR.get()), ampq.j(Boolean.valueOf(eapVar6.a.iN())), ampq.j(Boolean.valueOf(eapVar6.a.iI())), ampq.j(Boolean.valueOf(eapVar6.a.iO())), ampq.j(Boolean.valueOf(eapVar6.a.iJ())));
            case 9:
                eap eapVar7 = this.b;
                return sza.a(szb.b(eapVar7.m()), szb.a(eapVar7.m()), sza.c(amyc.b, amyg.a), eapVar7.d(), ampq.j((ampt) eapVar7.a.zg.get()));
            case 10:
                eap eapVar8 = this.b;
                amum i2 = amup.i(12);
                i2.f(atqz.class, afku.b((agsd) eapVar8.a.a.bF.c.lo.get()));
                i2.f(awop.class, new afof((tdb) eapVar8.a.nO.get(), 1));
                i2.f(awof.class, new szv(axot.a(eapVar8.i), eapVar8.k()));
                i2.f(awog.class, sza.g(axot.a(eapVar8.i), ampq.j(Boolean.valueOf(eapVar8.a.iH())), eapVar8.k()));
                i2.f(awoo.class, sza.t(axot.a(eapVar8.i)));
                i2.f(awni.class, sza.r(axot.a(eapVar8.i), eapVar8.k()));
                i2.f(awox.class, new tab((tdb) eapVar8.a.nO.get(), ampq.j((Boolean) eapVar8.a.dW.get())));
                i2.f(awnk.class, new szp((tdb) eapVar8.a.nO.get(), axot.a(eapVar8.i), ampq.j((Boolean) eapVar8.a.dW.get())));
                i2.f(awot.class, new tab((tdb) eapVar8.a.nO.get(), ampq.j((Boolean) eapVar8.a.dW.get()), 1));
                i2.f(awmn.class, eapVar8.a());
                i2.f(awnq.class, eapVar8.b());
                i2.f(awoh.class, sza.s(tfq.c(), axot.a(eapVar8.i)));
                return svo.p(i2.b(), amyg.a, tfq.b(ampq.j((tcw) eapVar8.a.zd.get())), eapVar8.d(), eapVar8.l.get(), eapVar8.m, eapVar8.j, ampq.j((Boolean) eapVar8.a.ze.get()), ampq.j(Boolean.valueOf(eapVar8.a.iu())), ampq.j((ampg) eapVar8.a.zf.get()), eapVar8.k(), eapVar8.n);
            case 11:
                return new tbp(this.b.j);
            case 12:
                eap eapVar9 = this.b;
                return sza.l(ampq.j((Boolean) eapVar9.a.dR.get()), eapVar9.l(), eapVar9.k, eapVar9.a.b.a);
            case 13:
                eap eapVar10 = this.b;
                ampq j = ampq.j((Boolean) eapVar10.a.dR.get());
                dyo dyoVar7 = eapVar10.a;
                return sza.k(j, dyoVar7.b.a, eapVar10.j, ampq.j(dyoVar7.aw()));
            case 14:
                return svo.q(this.b.d());
            case 15:
                eap eapVar11 = this.b;
                return sza.m(ampq.j((Boolean) eapVar11.a.dR.get()), eapVar11.k);
            case 16:
                return this.b.b();
            case 17:
                return tde.a;
            case 18:
                return svo.n(amup.k(IntersectionObserver.class, this.b.p));
            case 19:
                return svo.m(svo.l(this.b.d()));
            case 20:
                eap eapVar12 = this.b;
                return sza.o(ampq.j((Boolean) eapVar12.a.dQ.get()), ampq.j((Boolean) eapVar12.a.dR.get()), eapVar12.l(), eapVar12.j, ampq.j((Boolean) eapVar12.a.dW.get()), ampq.j(Integer.valueOf(eapVar12.a.b())));
            case 21:
                eap eapVar13 = this.b;
                return new tax(eapVar13.a.b.a, (taq) eapVar13.s.get());
            case 22:
                return new taq((tdb) this.b.a.nO.get());
            case 23:
                eap eapVar14 = this.b;
                dyo dyoVar8 = eapVar14.a;
                return new acmg(dyoVar8.b.a, (ajmy) dyoVar8.kC.get(), (ajxz) eapVar14.a.lV.get(), (aafo) eapVar14.a.jd.get(), (afvn) eapVar14.a.au.get(), (ajvm) eapVar14.a.xs.get(), (abkl) eapVar14.a.xr.get(), eapVar14.g(), zhf.a(2132084076));
            case 24:
                dyo dyoVar9 = this.b.a;
                return new acmc(dyoVar9.b.a, (ajmy) dyoVar9.kC.get());
            case 25:
                return new abux(this.b.a.b.a);
            case 26:
                return this.b.i();
            case 27:
                return new abtt(this.b.a.b.a);
            case 28:
                dyo dyoVar10 = this.b.a;
                return new abvk(dyoVar10.by, dyoVar10.a.bo);
            case 29:
                eap eapVar15 = this.b;
                acty actyVar = (acty) eapVar15.a.a.bp.get();
                dyo dyoVar11 = eapVar15.a;
                Context context4 = dyoVar11.b.a;
                yqw yqwVar = (yqw) dyoVar11.fB.get();
                abzc O = eapVar15.a.a.O();
                abss abssVar = (abss) eapVar15.C.get();
                ScreencastHostService i3 = eapVar15.i();
                acun acunVar = (acun) eapVar15.a.a.D.get();
                snc sncVar = (snc) eapVar15.a.v.get();
                sncVar.getClass();
                abty.a().b();
                return abty.a().c(actyVar, O.l(), context4, sncVar, yqwVar, O, abssVar, i3);
            case 30:
                return new abss(null);
            case 31:
                eap eapVar16 = this.b;
                dyo dyoVar12 = eapVar16.a;
                Context context5 = dyoVar12.b.a;
                acsx cI2 = dyoVar12.cI();
                dyo dyoVar13 = eapVar16.a;
                azqb azqbVar16 = dyoVar13.yQ;
                azqb azqbVar17 = dyoVar13.yR;
                azqb azqbVar18 = dyoVar13.yS;
                dxs dxsVar = dyoVar13.a;
                azqb azqbVar19 = dxsVar.a;
                azqb azqbVar20 = dxsVar.b;
                azqb azqbVar21 = dxsVar.c;
                azqb azqbVar22 = dxsVar.d;
                azqb azqbVar23 = dxsVar.e;
                azqb azqbVar24 = dxsVar.f;
                azqb azqbVar25 = dyoVar13.wn;
                azqb azqbVar26 = dxsVar.g;
                azqb azqbVar27 = dxsVar.h;
                azqb azqbVar28 = dyoVar13.wk;
                azqb azqbVar29 = dyoVar13.an;
                azqb azqbVar30 = dyoVar13.x;
                azqb azqbVar31 = dyoVar13.h;
                azqb azqbVar32 = dyoVar13.v;
                azqbVar16.getClass();
                azqbVar17.getClass();
                azqbVar18.getClass();
                azqbVar25.getClass();
                azqbVar28.getClass();
                azqbVar29.getClass();
                azqbVar30.getClass();
                azqbVar31.getClass();
                azqbVar32.getClass();
                return acaz.a(cI2, azqbVar16, azqbVar17, azqbVar18, azqbVar19, azqbVar20, azqbVar21, azqbVar22, azqbVar23, azqbVar24, azqbVar25, azqbVar26, azqbVar27, azqbVar28, azqbVar29, azqbVar30, azqbVar31, azqbVar32);
            case 32:
                dyo dyoVar14 = this.b.a;
                acbh h = acbh.h(dyoVar14.b.a, (SharedPreferences) dyoVar14.t.get());
                axzl.o(h);
                return h;
            case 33:
                eap eapVar17 = this.b;
                return yie.j(axot.a(eapVar17.G), axot.a(eapVar17.H), eapVar17.a.b.a);
            case 34:
                return yie.h();
            default:
                return yie.i();
        }
    }
}
