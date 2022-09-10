package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bebz  reason: default package */
/* loaded from: classes3.dex */
public class bebz implements bdzw {
    public static final dcep<dnwv> a = dcep.F(dnwv.HOTEL_RESERVATION, dnwv.SEARCH_INVENTORY, dnwv.GET_A_QUOTE, dnwv.SEE_HOTEL_PRICING, dnwv.COVID_TESTING_RESTRICTIONS);
    public final dxio<akfa> b;
    public final dxio<apyz> c;
    public final becb d;
    public final bebr e;
    public final btvo f;
    public final beam g;
    public final bebo h;
    public final bkgz i;
    public final bkgy j;
    public final ddho k;
    private List<bdzv> l = dcdc.e();

    public bebz(dxio<akfa> dxioVar, dxio<apyz> dxioVar2, becb becbVar, bebr bebrVar, btvo btvoVar, beam beamVar, bebo beboVar, bkgz bkgzVar, bkgy bkgyVar, ddho ddhoVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = becbVar;
        this.e = bebrVar;
        this.f = btvoVar;
        this.g = beamVar;
        this.h = beboVar;
        this.i = bkgzVar;
        this.j = bkgyVar;
        this.k = ddhoVar;
    }

    @Override // defpackage.bdzw
    public List<bdzv> a() {
        return this.l;
    }

    @Override // defpackage.bdzw
    public void b(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        List<bdzv> c = c(iloVar);
        this.l = c;
        c.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<bdzv> c(final ilo iloVar) {
        dnxj dnxjVar = iloVar.h().au;
        if (dnxjVar == null) {
            dnxjVar = dnxj.b;
        }
        dcbg b = dcbg.b(dcbg.b(dnxjVar.a).o(ilh.a).s(ili.a).z());
        dccx F = dcdc.F();
        dnwx T = iloVar.T(dnwv.GET_A_QUOTE);
        if (T != null && (T.a & 64) == 0) {
            F.g(ilm.c(dnwv.GET_A_QUOTE, dnxf.k));
        }
        dnwx T2 = iloVar.T(dnwv.SEE_HOTEL_PRICING);
        if (T2 != null && (T2.a & 64) == 0) {
            F.g(ilm.c(dnwv.SEE_HOTEL_PRICING, dnxf.k));
        }
        return b.m(F.f()).s(new dbrn(this, iloVar) { // from class: bebv
            private final bebz a;
            private final ilo b;

            {
                this.a = this;
                this.b = iloVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
                if (r1.equals(defpackage.dnwv.COVID_TESTING_RESTRICTIONS) != false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
                if (r9.l() != false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
                if (r0.j.b() == false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
                if (r0.c.a().p(r5) == false) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
                r1 = r0.d;
                r9 = r12.a();
                r12 = r12.b();
                r0 = r0.k;
                r2 = r1.a.a();
                defpackage.becb.a(r2, 1);
                r7 = r1.b.a();
                defpackage.becb.a(r7, 2);
                defpackage.becb.a(r5, 3);
                defpackage.becb.a(r9, 4);
                defpackage.becb.a(r12, 5);
                defpackage.becb.a(r0, 6);
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
                return defpackage.dbsg.i(new defpackage.beby(r2, r7, r5, r9, r12, r0));
             */
            @Override // defpackage.dbrn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 438
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bebv.a(java.lang.Object):java.lang.Object");
            }
        }).o(bebw.a).s(bebx.a).z();
    }
}
