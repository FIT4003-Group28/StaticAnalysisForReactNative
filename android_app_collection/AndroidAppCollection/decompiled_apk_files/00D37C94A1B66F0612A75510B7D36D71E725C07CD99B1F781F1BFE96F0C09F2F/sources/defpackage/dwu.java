package defpackage;

import android.content.Context;
import java.security.Key;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dwu  reason: default package */
/* loaded from: classes3.dex */
public final class dwu implements azqb {
    private final dwv a;
    private final int b;

    public dwu(dwv dwvVar, int i) {
        this.a = dwvVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        switch (this.b) {
            case 0:
                return new agkb((aghc) this.a.f.get());
            case 1:
                dwv dwvVar = this.a;
                return new aghc((aghf) dwvVar.d.wp.get(), (agpj) dwvVar.e.get(), (agvq) dwvVar.d.hf.get(), (ywa) dwvVar.d.gQ.get(), axot.a(axpa.a));
            case 2:
                dwv dwvVar2 = this.a;
                dyo dyoVar = dwvVar2.d;
                Context context = dyoVar.b.a;
                String str = dwvVar2.a;
                zey bT = dyoVar.bT();
                ajmy ajmyVar = (ajmy) dwvVar2.d.kC.get();
                aiwj aiwjVar = (aiwj) dwvVar2.d.wq.get();
                ywa ywaVar = (ywa) dwvVar2.d.gQ.get();
                zew zewVar = (zew) dwvVar2.d.fR.get();
                aacz aaczVar = (aacz) dwvVar2.d.D.get();
                agvq agvqVar = (agvq) dwvVar2.d.hf.get();
                dyo dyoVar2 = dwvVar2.d;
                return new agpj(context, str, bT, ajmyVar, aiwjVar, ywaVar, aaczVar, agvqVar, dyoVar2.lk, (akvm) dyoVar2.hl.get(), (axwu) dwvVar2.d.gZ.get());
            case 3:
                dwv dwvVar3 = this.a;
                agpj agpjVar = (agpj) dwvVar3.e.get();
                agme agmeVar = (agme) dwvVar3.k.get();
                aglb aglbVar = (aglb) dwvVar3.l.get();
                agmu agmuVar = (agmu) dwvVar3.m.get();
                agmk agmkVar = (agmk) dwvVar3.n.get();
                agmk agmkVar2 = (agmk) dwvVar3.o.get();
                agmg agmgVar = (agmg) dwvVar3.p.get();
                agku agkuVar = (agku) dwvVar3.q.get();
                agkz agkzVar = (agkz) dwvVar3.r.get();
                agkw agkwVar = (agkw) dwvVar3.s.get();
                aglp aglpVar = (aglp) dwvVar3.t.get();
                agmf agmfVar = (agmf) dwvVar3.u.get();
                return new aglj(agpjVar, agmeVar, aglbVar, agmuVar, agmkVar, agmkVar2, agmgVar, agkuVar, agkzVar, agkwVar, (agmr) dwvVar3.x.get(), (snc) dwvVar3.d.v.get(), null);
            case 4:
                dwv dwvVar4 = this.a;
                return new agme((Key) dwvVar4.d.fT.get(), (agli) dwvVar4.i.get(), (aglr) dwvVar4.j.get());
            case 5:
                dwv dwvVar5 = this.a;
                dyo dyoVar3 = dwvVar5.d;
                return new agli(new agmb(dyoVar3.v, dyoVar3.by, dyoVar3.D, dwvVar5.e), (agkr) dwvVar5.d.be.get(), (String) dwvVar5.h.get());
            case 6:
                String p = agio.p(this.a.a);
                axzl.o(p);
                return p;
            case 7:
                return new aglr((agli) this.a.i.get());
            case 8:
                dwv dwvVar6 = this.a;
                return new aglb((agli) dwvVar6.i.get(), dwvVar6.e);
            case 9:
                dwv dwvVar7 = this.a;
                return new agmu((agli) dwvVar7.i.get(), dwvVar7.e, (snc) dwvVar7.d.v.get(), (aglb) dwvVar7.l.get());
            case 10:
                dwv dwvVar8 = this.a;
                return new agmk((agli) dwvVar8.i.get(), dwvVar8.e, (snc) dwvVar8.d.v.get(), (aglb) dwvVar8.l.get(), (agmu) dwvVar8.m.get());
            case 11:
                dwv dwvVar9 = this.a;
                return new agmk((agli) dwvVar9.i.get(), dwvVar9.e, (aglb) dwvVar9.l.get(), (agmu) dwvVar9.m.get(), (snc) dwvVar9.d.v.get());
            case 12:
                return new agmg((agli) this.a.i.get());
            case 13:
                return new agku((agli) this.a.i.get());
            case 14:
                return new agkz((agli) this.a.i.get());
            case 15:
                return new agkw((agli) this.a.i.get());
            case 16:
                return new aglp((agli) this.a.i.get());
            case 17:
                return new agmf((agli) this.a.i.get());
            case 18:
                dwv dwvVar10 = this.a;
                final agmr agmrVar = new agmr((Executor) dwvVar10.d.lA.get(), (aghe) dwvVar10.f.get(), (agli) dwvVar10.i.get(), (agmu) dwvVar10.m.get(), (agme) dwvVar10.k.get(), (agmk) dwvVar10.n.get(), (agmk) dwvVar10.o.get(), (agmz) dwvVar10.v.get(), new agnb(dwvVar10.e, dwvVar10.l), amyg.a, (ayoi) dwvVar10.w.get(), null);
                agmrVar.g.as(new ayqb() { // from class: agmm
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        agmr agmrVar2 = agmr.this;
                        int size = agmrVar2.c().b().size();
                        for (String str2 : ((agny) obj).a) {
                            agmrVar2.m(str2);
                            agmrVar2.l(str2);
                        }
                        if (size <= 0 || !agmrVar2.f().isEmpty()) {
                            return;
                        }
                        for (agin aginVar : agmrVar2.f) {
                            agio agioVar = aginVar.a;
                            agioVar.e.a(agioVar.I);
                        }
                    }
                });
                return agmrVar;
            case 19:
                dwv dwvVar11 = this.a;
                aacz aaczVar2 = (aacz) dwvVar11.d.D.get();
                return new agmz((snc) dwvVar11.d.v.get());
            case 20:
                return azpq.e();
            case 21:
                dwv dwvVar12 = this.a;
                return new aglg((agpj) dwvVar12.e.get(), (aglb) dwvVar12.l.get(), (agmu) dwvVar12.m.get(), (agmk) dwvVar12.n.get(), (agmk) dwvVar12.o.get(), (aglj) dwvVar12.y.get(), (azpx) dwvVar12.w.get(), null);
            case 22:
                dwv dwvVar13 = this.a;
                aghc aghcVar = (aghc) dwvVar13.f.get();
                agwp agwpVar = (agwp) dwvVar13.d.jo.get();
                return new aglp();
            case 23:
                dwv dwvVar14 = this.a;
                snc sncVar = (snc) dwvVar14.d.v.get();
                String str2 = dwvVar14.a;
                dyo dyoVar4 = dwvVar14.d;
                azqb azqbVar = dyoVar4.hh;
                azqb azqbVar2 = dyoVar4.hf;
                azqb azqbVar3 = dyoVar4.lv;
                agyr agyrVar = (agyr) dyoVar4.kS.get();
                dyo dyoVar5 = dwvVar14.d;
                final agjz agjzVar = new agjz(sncVar, str2, azqbVar, azqbVar2, azqbVar3, agyrVar, dyoVar5.lc, dwvVar14.b, (Executor) dyoVar5.lA.get(), (Executor) dwvVar14.d.h.get(), dwvVar14.f, (agmu) dwvVar14.m.get(), dwvVar14.y, dwvVar14.A, dwvVar14.B, dwvVar14.D, (ahdn) dwvVar14.d.gR.get(), dwvVar14.F, dwvVar14.G, (ayoi) dwvVar14.w.get());
                agjzVar.p.as(new ayqb() { // from class: agjl
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        agjz agjzVar2 = agjz.this;
                        aglj agljVar = (aglj) agjzVar2.k.get();
                        for (String str3 : ((agny) obj).a) {
                            agjzVar2.s(str3);
                            agljVar.v(str3);
                        }
                    }
                });
                return agjzVar;
            case 24:
                dwv dwvVar15 = this.a;
                zey bT2 = dwvVar15.d.bT();
                String str3 = dwvVar15.a;
                dyo dyoVar6 = dwvVar15.d;
                return new agkg(bT2, str3, dyoVar6.hh, new agkf((snc) dyoVar6.v.get(), (aglj) dwvVar15.y.get(), dwvVar15.d.bT(), (ahdl) dwvVar15.d.ln.get(), (agkr) dwvVar15.d.be.get(), (aadd) dwvVar15.d.K.get()), (agxr) dwvVar15.d.lw.get(), (agyr) dwvVar15.d.kS.get());
            case 25:
                return new aghk(this.a.y);
            case 26:
                dwv dwvVar16 = this.a;
                snc sncVar2 = (snc) dwvVar16.d.v.get();
                dyo dyoVar7 = dwvVar16.d;
                azqb azqbVar4 = dyoVar7.hr;
                azqb azqbVar5 = dwvVar16.y;
                azqb azqbVar6 = dwvVar16.C;
                Executor executor = (Executor) dyoVar7.h.get();
                return new agiw(azqbVar4, azqbVar5, azqbVar6);
            case 27:
                return new agkh((agjz) this.a.E.get());
            case 28:
                agwk agwkVar = new agwk();
                agwkVar.b = new agwl(agwkVar, agwkVar.a);
                return agwkVar;
            case 29:
                dwv dwvVar17 = this.a;
                return new agvs((agwg) dwvVar17.H.get(), (agvq) dwvVar17.d.hf.get());
            case 30:
                dwv dwvVar18 = this.a;
                return new agwg(dwvVar18.y, dwvVar18.d.ln);
            case 31:
                return new agwi();
            case 32:
                dwv dwvVar19 = this.a;
                String str4 = dwvVar19.a;
                dyo dyoVar8 = dwvVar19.d;
                azqb azqbVar7 = dwvVar19.y;
                agis agisVar = dwvVar19.b;
                azqb azqbVar8 = dwvVar19.A;
                azqb azqbVar9 = dwvVar19.E;
                azqb azqbVar10 = dwvVar19.D;
                dyo dyoVar9 = dwvVar19.d;
                azqb azqbVar11 = dyoVar9.jg;
                azqb azqbVar12 = dyoVar9.ln;
                aacz aaczVar3 = (aacz) dyoVar9.D.get();
                amyg amygVar = amyg.a;
                ahdf ahdfVar = (ahdf) dwvVar19.d.ha.get();
                aaqp aaqpVar = (aaqp) dwvVar19.d.ih.get();
                dyo dyoVar10 = dwvVar19.d;
                return new agjk((snc) dwvVar19.d.v.get(), str4, dyoVar8.hr, dyoVar8.hf, dyoVar8.kY, (aghc) dwvVar19.f.get(), azqbVar7, agisVar, azqbVar8, azqbVar9, azqbVar10, azqbVar11, azqbVar12, amygVar, ahdfVar, aaqpVar, amvn.r(new joe(dyoVar10.b.a, (afvn) dyoVar10.au.get(), (aahf) dyoVar10.dK.get())));
            case 33:
                dwv dwvVar20 = this.a;
                return new aghj(dwvVar20.L, (Executor) dwvVar20.d.lA.get(), dwvVar20.y, dwvVar20.b, (ahdf) dwvVar20.d.ha.get());
            case 34:
                dwv dwvVar21 = this.a;
                dyo dyoVar11 = dwvVar21.d;
                return new agka(dyoVar11.ws, dyoVar11.jg, (aglj) dwvVar21.y.get(), (snc) dwvVar21.d.v.get());
            case 35:
                dwv dwvVar22 = this.a;
                dyo dyoVar12 = dwvVar22.d;
                Context context2 = dyoVar12.b.a;
                snc sncVar3 = (snc) dyoVar12.v.get();
                String str5 = dwvVar22.a;
                dyo dyoVar13 = dwvVar22.d;
                azqb azqbVar13 = dyoVar13.hf;
                agyr agyrVar2 = (agyr) dyoVar13.kS.get();
                dyo dyoVar14 = dwvVar22.d;
                return new agib(sncVar3, str5, azqbVar13, agyrVar2, dyoVar14.mJ, dyoVar14.lc, dwvVar22.b, (Executor) dyoVar14.h.get(), (Executor) dwvVar22.d.lA.get(), (agmk) dwvVar22.n.get(), dwvVar22.y, dwvVar22.f, dwvVar22.e, dwvVar22.A, dwvVar22.B, dwvVar22.E, dwvVar22.x, (ahdn) dwvVar22.d.gR.get(), dwvVar22.I, dwvVar22.G, dwvVar22.f187J, (aacz) dwvVar22.d.D.get(), (aadd) dwvVar22.d.K.get(), null);
            case 36:
                dwv dwvVar23 = this.a;
                dyo dyoVar15 = dwvVar23.d;
                return new agjh(dyoVar15.hf, dwvVar23.b, dwvVar23.H, dwvVar23.A, dwvVar23.B, dwvVar23.E, dwvVar23.o, dwvVar23.x, (aadd) dyoVar15.K.get(), dwvVar23.a, (agyr) dwvVar23.d.kS.get(), (ahdn) dwvVar23.d.gR.get(), (agvw) dwvVar23.d.gT.get(), (snc) dwvVar23.d.v.get(), dwvVar23.G, (Executor) dwvVar23.d.h.get());
            case 37:
                return new aghl(this.a.j);
            case 38:
                dwv dwvVar24 = this.a;
                Executor executor2 = (Executor) dwvVar24.d.h.get();
                return new agiy(dwvVar24.l, dwvVar24.u, dwvVar24.b);
            case 39:
                dwv dwvVar25 = this.a;
                return new agne((aahe) dwvVar25.R.get(), (aahn) dwvVar25.d.dI.get(), (ahdf) dwvVar25.d.ha.get());
            default:
                dwv dwvVar26 = this.a;
                aahe a = ((aahf) dwvVar26.d.dK.get()).a(dwvVar26.c);
                axzl.o(a);
                return a;
        }
    }
}
