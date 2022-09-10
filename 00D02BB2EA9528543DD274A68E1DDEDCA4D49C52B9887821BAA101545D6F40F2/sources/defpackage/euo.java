package defpackage;

import android.content.Context;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: euo  reason: default package */
/* loaded from: classes6.dex */
public final class euo<T> implements dzsj<T> {
    final /* synthetic */ eup a;
    private final int b;

    public euo(eup eupVar, int i) {
        this.a = eupVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eup eupVar = this.a;
                return (T) new aaqg(eupVar.c(), eupVar.d());
            case 1:
                return (T) this.a.b();
            case 2:
                eup eupVar2 = this.a;
                ftt fttVar = eupVar2.h;
                return (T) new aaqi(new aaxn(fttVar.a, fttVar.eW.wf(), eupVar2.h.eW.sA(), eupVar2.h.wj(), eupVar2.h.cJ(), eupVar2.e(), eupVar2.f()), eupVar2.d());
            case 3:
                eup eupVar3 = this.a;
                ftt fttVar2 = eupVar3.h;
                rb rbVar = fttVar2.a;
                cqat rR = fttVar2.eW.a.rR();
                dxjg.e(rR);
                aaxc aaxcVar = new aaxc(rbVar, rR, new cqhn());
                aaxo b = aaxp.b(eupVar3.h.wk(), eupVar3.h.eW.sH(), dxjc.c(eupVar3.h.m()));
                bmdq jF = eupVar3.h.jF();
                ftt fttVar3 = eupVar3.h;
                return (T) new aaqk(new aaxr(aaxcVar, b, jF, fttVar3.a, dxjc.c(fttVar3.m())), eupVar3.d());
            case 4:
                eup eupVar4 = this.a;
                return (T) new aale(new aanv(eupVar4.g()), eupVar4.d());
            case 5:
                eup eupVar5 = this.a;
                gga wk = eupVar5.h.wk();
                dxio c = dxjc.c(eupVar5.h.bh());
                dxio c2 = dxjc.c(eupVar5.h.tT());
                dxio c3 = dxjc.c(eupVar5.h.bm());
                btvo rp = eupVar5.h.eW.a.rp();
                dxjg.e(rp);
                Executor sU = eupVar5.h.eW.a.sU();
                dxjg.e(sU);
                return (T) new aapz(new aaxg(wk, c, c2, c3, rp, sU), eupVar5.d());
            case 6:
                eup eupVar6 = this.a;
                rb rbVar2 = eupVar6.h.a;
                aahf f = eupVar6.f();
                rb rbVar3 = eupVar6.h.a;
                btvo rp2 = eupVar6.h.eW.a.rp();
                dxjg.e(rp2);
                Executor sU2 = eupVar6.h.eW.a.sU();
                dxjg.e(sU2);
                Executor sV = eupVar6.h.eW.a.sV();
                dxjg.e(sV);
                aahs aahsVar = new aahs(rbVar3, rp2, sU2, sV, dxjc.c(eupVar6.h.dj()), dxjc.c(eupVar6.h.eW()), dxjc.c(eupVar6.h.eW.dd()), eupVar6.h.eW.rG(), dxjc.c(eupVar6.h.eW.p()), dxjc.c(eupVar6.h.r()));
                aaht h = eupVar6.h();
                aahu i = eupVar6.i();
                dxio c4 = dxjc.c(eupVar6.h.m());
                dxjg.e(eupVar6.h.eW.a.rp());
                dzsj dzsjVar = eupVar6.a;
                if (dzsjVar == null) {
                    dzsjVar = new euo(eupVar6, 7);
                    eupVar6.a = dzsjVar;
                }
                return (T) new aaqm(new aayf(rbVar2, f, aahsVar, h, i, c4, new aaxx(dzsjVar)), eupVar6.d());
            case 7:
                return (T) new aaxz();
            case 8:
                eup eupVar7 = this.a;
                btvo rp3 = eupVar7.h.eW.a.rp();
                dxjg.e(rp3);
                dzsj c5 = dxjh.c(eupVar7.h.m());
                dzsj dzsjVar2 = eupVar7.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new euo(eupVar7, 9);
                    eupVar7.b = dzsjVar2;
                }
                return (T) new aaqb(new aaxj(rp3, new aaxt(c5, dzsjVar2, eupVar7.h.eV)), eupVar7.d());
            case 9:
                eup eupVar8 = this.a;
                return (T) new aaxv(dxjh.c(eupVar8.h.m()), eupVar8.h.eV);
            case 10:
                eup eupVar9 = this.a;
                return (T) new aala(new aanr(dxjc.c(eupVar9.h.rn()), eupVar9.h.eW.jh()), eupVar9.d());
            case 11:
                eup eupVar10 = this.a;
                return (T) new aalg(new aanw(eupVar10.h.pK()), eupVar10.d());
            case 12:
                eup eupVar11 = this.a;
                dxio c6 = dxjc.c(eupVar11.h.tU());
                btvo rp4 = eupVar11.h.eW.a.rp();
                dxjg.e(rp4);
                return (T) new aalc(new aanu(c6, rp4), eupVar11.d());
            case 13:
                eup eupVar12 = this.a;
                ftt fttVar4 = eupVar12.h;
                rb rbVar4 = fttVar4.a;
                dxio c7 = dxjc.c(fttVar4.m());
                bvpe jd = eupVar12.h.jd();
                huc jf = eupVar12.h.jf();
                ftt fttVar5 = eupVar12.h;
                return (T) new aayh(new aayz(rbVar4, c7, jd, jf, new aazb(fttVar5.eV, dxjh.c(fttVar5.m()))), eupVar12.d());
            case 14:
                eup eupVar13 = this.a;
                return (T) new aakw(new aano(eupVar13.g()), eupVar13.d());
            case 15:
                eup eupVar14 = this.a;
                Context b2 = eupVar14.h.eW.a.b();
                dxjg.e(b2);
                ckcw rU = eupVar14.h.eW.a.rU();
                dxjg.e(rU);
                return (T) new aaoa(new aaoh(b2, rU, eupVar14.d(), (bvvw) eupVar14.h.ao(), new aazg(dxjc.c(eupVar14.h.as()), dxjc.c(eupVar14.h.av()))), eupVar14.d());
            case 16:
                return (T) new aapu(new aawz(), this.a.d());
            case 17:
                eup eupVar15 = this.a;
                return (T) new aaqd(new aaxk(dxjc.c(eupVar15.h.m())), eupVar15.d());
            case 18:
                return (T) new aapw(new aaxa(), this.a.d());
            case 19:
                eup eupVar16 = this.a;
                dzsj<gga> ad = eupVar16.h.ad();
                dzsj<cqhn> il = eupVar16.h.eW.il();
                dzsj<cjqy> al = eupVar16.h.eW.al();
                dzsj dzsjVar3 = eupVar16.e;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new euo(eupVar16, 20);
                    eupVar16.e = dzsjVar3;
                }
                pms pmsVar = new pms(ad, il, al, dzsjVar3, eupVar16.h.aK(), dxjh.c(eupVar16.h.m()));
                dzsj<pml> j = eupVar16.j();
                dzsj dzsjVar4 = eupVar16.f;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new euo(eupVar16, 24);
                    eupVar16.f = dzsjVar4;
                }
                pma pmaVar = new pma(j, dzsjVar4);
                dzsj dzsjVar5 = eupVar16.g;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new euo(eupVar16, 25);
                    eupVar16.g = dzsjVar5;
                }
                return (T) new aaky(new aanp(pmsVar, pmaVar, new plv(dzsjVar5)), eupVar16.d());
            case 20:
                eup eupVar17 = this.a;
                dzsj dzsjVar6 = eupVar17.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new euo(eupVar17, 21);
                    eupVar17.d = dzsjVar6;
                }
                return (T) new pmo(dzsjVar6);
            case 21:
                return (T) new pmf(this.a.j());
            case 22:
                eup eupVar18 = this.a;
                dzsj dzsjVar7 = eupVar18.c;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new euo(eupVar18, 23);
                    eupVar18.c = dzsjVar7;
                }
                return (T) new pml(dzsjVar7);
            case 23:
                eup eupVar19 = this.a;
                return (T) new pmi(eupVar19.h.ad(), dxjh.c(eupVar19.h.m()));
            case 24:
                return (T) new ply();
            case 25:
                eup eupVar20 = this.a;
                return (T) new pmc(eupVar20.h.ad(), dxjh.c(eupVar20.h.m()), eupVar20.h.aK());
            case 26:
                eup eupVar21 = this.a;
                ftt fttVar6 = eupVar21.h;
                rb rbVar5 = fttVar6.a;
                cjqy tr = fttVar6.eW.a.tr();
                dxjg.e(tr);
                bhat fp = eupVar21.h.fp();
                btvo rp5 = eupVar21.h.eW.a.rp();
                dxjg.e(rp5);
                bbut be = eupVar21.h.be();
                bflb iZ = eupVar21.h.iZ();
                bwsh cZ = eupVar21.h.cZ();
                bvrb tn = eupVar21.h.eW.a.tn();
                dxjg.e(tn);
                cqhn cqhnVar = new cqhn();
                dxio c8 = dxjc.c(eupVar21.h.jc());
                bvjj rB = eupVar21.h.eW.a.rB();
                dxjg.e(rB);
                return (T) new akoi(rbVar5, tr, fp, rp5, be, iZ, cZ, tn, cqhnVar, c8, rB, eupVar21.h.jd(), eupVar21.h.jf(), eupVar21.h.jh(), eupVar21.h.pG());
            case 27:
                return (T) this.a.d();
            case 28:
                return (T) new aazw(this.a.h.wk(), new cqhn());
            case 29:
                return (T) new aazr(dxjh.c(this.a.h.bf()));
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                eup eupVar22 = this.a;
                return (T) new abac(eupVar22.h.ad(), eupVar22.h.eW.il(), eupVar22.h.eS(), eupVar22.h.eW.aw(), dxjh.c(eupVar22.h.bf()), dxjh.c(eupVar22.h.tV()), eupVar22.h.eW.p(), eupVar22.h.lf());
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return (T) this.a.f();
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) this.a.h();
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) this.a.i();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                ftt fttVar7 = this.a.h;
                return (T) new aahc(fttVar7.a, fttVar7.jF());
            case 35:
                return (T) this.a.c();
            default:
                eup eupVar23 = this.a;
                ivj fZ = eupVar23.h.fZ();
                gga wk2 = eupVar23.h.wk();
                btvo rp6 = eupVar23.h.eW.a.rp();
                dxjg.e(rp6);
                return (T) aafz.b(fZ, wk2, rp6, dxjc.c(eupVar23.h.aK()), new aafu(eupVar23.h.eV));
        }
    }
}
