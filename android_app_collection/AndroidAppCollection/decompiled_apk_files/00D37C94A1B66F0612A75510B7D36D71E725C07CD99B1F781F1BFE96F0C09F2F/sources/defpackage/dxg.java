package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxg  reason: default package */
/* loaded from: classes3.dex */
public final class dxg implements azqb {
    private final dxh a;
    private final int b;

    public dxg(dxh dxhVar, int i) {
        this.a = dxhVar;
        this.b = i;
    }

    @Override // defpackage.azqb
    public final Object get() {
        algj algjVar;
        switch (this.b) {
            case 0:
                dxh dxhVar = this.a;
                alcu alcuVar = dxhVar.a;
                azqb azqbVar = dxhVar.t;
                azqb azqbVar2 = dxhVar.v;
                azqb azqbVar3 = dxhVar.z;
                azqb azqbVar4 = dxhVar.A;
                alcu alcuVar2 = alcu.UNKNOWN_UPLOAD;
                int ordinal = alcuVar.ordinal();
                if (ordinal == 1) {
                    algjVar = (algj) azqbVar.get();
                } else if (ordinal == 2) {
                    algjVar = (algj) azqbVar2.get();
                } else if (ordinal == 3) {
                    algjVar = (algj) azqbVar3.get();
                } else if (ordinal == 5) {
                    algjVar = (algj) azqbVar4.get();
                } else {
                    int i = alcuVar.g;
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unsupported UploadFlow ");
                    sb.append(i);
                    throw new UnsupportedOperationException(sb.toString());
                }
                axzl.o(algjVar);
                return algjVar;
            case 1:
                dxh dxhVar2 = this.a;
                return new alft((alhc) dxhVar2.c.wg.get(), (algr) dxhVar2.d.get(), (alfu) dxhVar2.g.get(), (aleu) dxhVar2.i.get(), (alei) dxhVar2.k.get(), (alhi) dxhVar2.l.get(), (alec) dxhVar2.m.get(), (alfp) dxhVar2.n.get(), (alel) dxhVar2.o.get(), (algg) dxhVar2.p.get(), (alfj) dxhVar2.q.get(), (aldz) dxhVar2.r.get(), (aley) dxhVar2.s.get(), (aldn) dxhVar2.e.get(), 1);
            case 2:
                return new algr();
            case 3:
                dxh dxhVar3 = this.a;
                return new alfu((aadd) dxhVar3.c.K.get(), (aldn) dxhVar3.e.get(), (aqxo) dxhVar3.c.mO.get(), (albf) dxhVar3.c.mT.get(), (akze) dxhVar3.c.mS.get(), (alht) dxhVar3.c.mP.get(), (alez) dxhVar3.c.wi.get(), (alhl) dxhVar3.f.get(), null, null, null);
            case 4:
                dxh dxhVar4 = this.a;
                dyo dyoVar = dxhVar4.c;
                Context context = dyoVar.b.a;
                akze akzeVar = (akze) dyoVar.mS.get();
                alco alcoVar = new alco();
                akze akzeVar2 = (akze) dxhVar4.c.mS.get();
                aldn aldnVar = new aldn();
                aldnVar.b(new aldf(context, alcoVar, akzeVar2, 1));
                aldnVar.b(new aldf(context, alcoVar, akzeVar2));
                aldnVar.b(new zxj(context, (aacz) dxhVar4.c.D.get(), alcoVar, akzeVar2));
                aldnVar.b(new aldu());
                return aldnVar;
            case 5:
                dxh dxhVar5 = this.a;
                return new alhl((Executor) dxhVar5.c.h.get(), (akze) dxhVar5.c.mS.get(), 6, 5, (akzp) dxhVar5.c.mQ.get(), dxhVar5.b, akxt.i);
            case 6:
                dxh dxhVar6 = this.a;
                return new aleu((snc) dxhVar6.c.v.get(), (aadd) dxhVar6.c.K.get(), dxhVar6.c.gz(), (aldn) dxhVar6.e.get(), (akze) dxhVar6.c.mS.get(), (albf) dxhVar6.c.mT.get(), (alez) dxhVar6.c.wi.get(), (alht) dxhVar6.c.mP.get(), (alhl) dxhVar6.h.get());
            case 7:
                dxh dxhVar7 = this.a;
                return new alhl((Executor) dxhVar7.c.h.get(), (akze) dxhVar7.c.mS.get(), 5, 4, (akzp) dxhVar7.c.mQ.get(), dxhVar7.b, akxt.h);
            case 8:
                dxh dxhVar8 = this.a;
                dyo dyoVar2 = dxhVar8.c;
                return new alei(dyoVar2.b.a, (snc) dyoVar2.v.get(), (aadd) dxhVar8.c.K.get(), dxhVar8.c.gz(), (afvn) dxhVar8.c.au.get(), (vzm) dxhVar8.c.dh.get(), (alak) dxhVar8.c.mU.get(), (albs) dxhVar8.c.mX.get(), (alhl) dxhVar8.h.get(), (akze) dxhVar8.c.mS.get(), (alhn) dxhVar8.j.get(), dxhVar8.b(), (aqxo) dxhVar8.c.mO.get(), (albf) dxhVar8.c.mT.get(), (alez) dxhVar8.c.wi.get(), (aldn) dxhVar8.e.get(), (alht) dxhVar8.c.mP.get(), null, null, null);
            case 9:
                return new alhn((aldn) this.a.e.get());
            case 10:
                dxh dxhVar9 = this.a;
                return new alhi((aadd) dxhVar9.c.K.get(), (ScheduledExecutorService) dxhVar9.c.h.get(), (albf) dxhVar9.c.mT.get(), (akze) dxhVar9.c.mS.get(), (alht) dxhVar9.c.mP.get());
            case 11:
                dxh dxhVar10 = this.a;
                dyo dyoVar3 = dxhVar10.c;
                return new alec(dyoVar3.b.a, (snc) dyoVar3.v.get(), (aadd) dxhVar10.c.K.get(), (albq) dxhVar10.c.ne.get(), (alhn) dxhVar10.j.get(), (akze) dxhVar10.c.mS.get(), (alak) dxhVar10.c.mU.get(), (albf) dxhVar10.c.mT.get(), (alez) dxhVar10.c.wi.get(), (aldn) dxhVar10.e.get(), (alht) dxhVar10.c.mP.get());
            case 12:
                dxh dxhVar11 = this.a;
                return new alfp((snc) dxhVar11.c.v.get(), (aadd) dxhVar11.c.K.get(), dxhVar11.c.gz(), (alak) dxhVar11.c.mU.get(), (albo) dxhVar11.c.mR.get(), (albq) dxhVar11.c.ne.get(), (akze) dxhVar11.c.mS.get(), (alhn) dxhVar11.j.get(), dxhVar11.b(), (aqxo) dxhVar11.c.mO.get(), (albf) dxhVar11.c.mT.get(), (alez) dxhVar11.c.wi.get(), (aldn) dxhVar11.e.get(), (alht) dxhVar11.c.mP.get(), null, null, null);
            case 13:
                dxh dxhVar12 = this.a;
                return new alel((aadd) dxhVar12.c.K.get(), (afvn) dxhVar12.c.au.get(), dxhVar12.c.gz(), (albc) dxhVar12.c.wj.get(), (abdu) dxhVar12.c.wk.get(), (aldn) dxhVar12.e.get(), (aldl) dxhVar12.c.wl.get(), (albs) dxhVar12.c.mX.get(), (akze) dxhVar12.c.mS.get(), (albf) dxhVar12.c.mT.get(), (alht) dxhVar12.c.mP.get());
            case 14:
                dxh dxhVar13 = this.a;
                return new algg((aadd) dxhVar13.c.K.get(), (ScheduledExecutorService) dxhVar13.c.h.get(), (akze) dxhVar13.c.mS.get(), (afvn) dxhVar13.c.au.get(), (akzp) dxhVar13.c.mQ.get(), (alaz) dxhVar13.c.wm.get(), (albf) dxhVar13.c.mT.get(), (alak) dxhVar13.c.mU.get(), (alht) dxhVar13.c.mP.get());
            case 15:
                dxh dxhVar14 = this.a;
                return new alfj((aadd) dxhVar14.c.K.get(), (afvn) dxhVar14.c.au.get(), dxhVar14.c.gz(), (aazu) dxhVar14.c.wn.get(), (albs) dxhVar14.c.mX.get(), (akze) dxhVar14.c.mS.get(), (albf) dxhVar14.c.mT.get(), (alht) dxhVar14.c.mP.get());
            case 16:
                dxh dxhVar15 = this.a;
                return new aldz((aadd) dxhVar15.c.K.get(), (aldn) dxhVar15.e.get(), (akze) dxhVar15.c.mS.get(), (albf) dxhVar15.c.mT.get(), (alht) dxhVar15.c.mP.get());
            case 17:
                dxh dxhVar16 = this.a;
                dyo dyoVar4 = dxhVar16.c;
                return new aley(dyoVar4.b.a, (albf) dyoVar4.mT.get(), (alht) dxhVar16.c.mP.get());
            case 18:
                dxh dxhVar17 = this.a;
                return new ales((alhc) dxhVar17.c.wg.get(), (algr) dxhVar17.d.get(), (aleq) dxhVar17.u.get(), (algg) dxhVar17.p.get(), (aley) dxhVar17.s.get());
            case 19:
                dxh dxhVar18 = this.a;
                return new aleq((aadd) dxhVar18.c.K.get(), dxhVar18.c.gz(), (abdu) dxhVar18.c.wk.get(), (albs) dxhVar18.c.mX.get(), (akze) dxhVar18.c.mS.get(), (albf) dxhVar18.c.mT.get(), (alht) dxhVar18.c.mP.get());
            case 20:
                dxh dxhVar19 = this.a;
                return new alfg((alhc) dxhVar19.c.wg.get(), (algr) dxhVar19.d.get(), (aleu) dxhVar19.i.get(), (alei) dxhVar19.k.get(), (alfp) dxhVar19.n.get(), (alfi) dxhVar19.w.get(), (alee) dxhVar19.x.get(), (alhi) dxhVar19.l.get(), (alfe) dxhVar19.y.get(), (algg) dxhVar19.p.get(), (aldz) dxhVar19.r.get(), (aley) dxhVar19.s.get(), (aldn) dxhVar19.e.get());
            case 21:
                dxh dxhVar20 = this.a;
                return new alfi((aadd) dxhVar20.c.K.get(), (afvn) dxhVar20.c.au.get(), dxhVar20.c.gz(), (albc) dxhVar20.c.wj.get(), (albs) dxhVar20.c.mX.get(), (akze) dxhVar20.c.mS.get(), (albf) dxhVar20.c.mT.get(), (alht) dxhVar20.c.mP.get());
            case 22:
                dxh dxhVar21 = this.a;
                return new alee((aadd) dxhVar21.c.K.get(), (afvn) dxhVar21.c.au.get(), (abbr) dxhVar21.c.wo.get(), (albs) dxhVar21.c.mX.get(), (akze) dxhVar21.c.mS.get(), dxhVar21.c.gz(), (albf) dxhVar21.c.mT.get(), (alht) dxhVar21.c.mP.get());
            case 23:
                dxh dxhVar22 = this.a;
                return new alfe((aadd) dxhVar22.c.K.get(), (afvn) dxhVar22.c.au.get(), (albc) dxhVar22.c.wj.get(), (albs) dxhVar22.c.mX.get(), (akze) dxhVar22.c.mS.get(), (aldn) dxhVar22.e.get(), (aldl) dxhVar22.c.wl.get(), dxhVar22.c.gz(), (albf) dxhVar22.c.mT.get(), (alht) dxhVar22.c.mP.get());
            default:
                dxh dxhVar23 = this.a;
                return new alft((alhc) dxhVar23.c.wg.get(), (algr) dxhVar23.d.get(), (alfu) dxhVar23.g.get(), (aleu) dxhVar23.i.get(), (alei) dxhVar23.k.get(), (alhi) dxhVar23.l.get(), (alec) dxhVar23.m.get(), (alfp) dxhVar23.n.get(), (alel) dxhVar23.o.get(), (algg) dxhVar23.p.get(), (alfj) dxhVar23.q.get(), (aldz) dxhVar23.r.get(), (aley) dxhVar23.s.get(), (aldn) dxhVar23.e.get());
        }
    }
}
