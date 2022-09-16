package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: acdh  reason: default package */
/* loaded from: classes2.dex */
public final class acdh extends bcqc implements bcqa {
    private static final dcqe an = dcqe.c("acdh");
    public Activity a;
    public abwq ad;
    private bbuu ao;
    private bcrp ap;
    private abwp aq;
    public bwqv b;
    public btvo c;
    public bcri d;
    public bdeq e;
    public bdes f;
    public bbuw g;

    public static dcdc<bczw> aS(dcdc<acej> dcdcVar, eaol eaolVar, Application application) {
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            acej acejVar = dcdcVar.get(i);
            dwfl a = acejVar.a();
            dizh dizhVar = a.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            diis diisVar = dizhVar.g;
            if (diisVar == null) {
                diisVar = diis.h;
            }
            dikg dikgVar = diisVar.g;
            if (dikgVar == null) {
                dikgVar = dikg.d;
            }
            if (new dsrh(dikgVar.a, dikg.b).contains(dikd.UGC)) {
                diyt diytVar = dizhVar.e;
                if (diytVar == null) {
                    diytVar = diyt.c;
                }
                if (diytVar.b.size() > 0) {
                    dsqp dsqpVar = (dsqp) a.cu(5);
                    dsqpVar.bC(a);
                    dwfi dwfiVar = (dwfi) dsqpVar;
                    dsqp dsqpVar2 = (dsqp) dizhVar.cu(5);
                    dsqpVar2.bC(dizhVar);
                    dizg dizgVar = (dizg) dsqpVar2;
                    diyt diytVar2 = dizhVar.e;
                    if (diytVar2 == null) {
                        diytVar2 = diyt.c;
                    }
                    dsqp dsqpVar3 = (dsqp) diytVar2.cu(5);
                    dsqpVar3.bC(diytVar2);
                    diys diysVar = (diys) dsqpVar3;
                    diyt diytVar3 = dizhVar.e;
                    if (diytVar3 == null) {
                        diytVar3 = diyt.c;
                    }
                    dnpq dnpqVar = diytVar3.b.get(0);
                    dsqp dsqpVar4 = (dsqp) dnpqVar.cu(5);
                    dsqpVar4.bC(dnpqVar);
                    dnpp dnppVar = (dnpp) dsqpVar4;
                    if (dnppVar.c) {
                        dnppVar.bF();
                        dnppVar.c = false;
                    }
                    dnpq dnpqVar2 = (dnpq) dnppVar.b;
                    dnpq dnpqVar3 = dnpq.g;
                    dnpqVar2.a &= -9;
                    dnpqVar2.d = dnpq.g.d;
                    if (diysVar.c) {
                        diysVar.bF();
                        diysVar.c = false;
                    }
                    diyt diytVar4 = (diyt) diysVar.b;
                    dnpq bK = dnppVar.bK();
                    bK.getClass();
                    dsrj<dnpq> dsrjVar = diytVar4.b;
                    if (!dsrjVar.a()) {
                        diytVar4.b = dsqw.cl(dsrjVar);
                    }
                    diytVar4.b.set(0, bK);
                    if (dizgVar.c) {
                        dizgVar.bF();
                        dizgVar.c = false;
                    }
                    dizh dizhVar2 = (dizh) dizgVar.b;
                    diyt bK2 = diysVar.bK();
                    bK2.getClass();
                    dizhVar2.e = bK2;
                    dizhVar2.a |= 8;
                    if (dwfiVar.c) {
                        dwfiVar.bF();
                        dwfiVar.c = false;
                    }
                    dwfl dwflVar = (dwfl) dwfiVar.b;
                    dizh bK3 = dizgVar.bK();
                    bK3.getClass();
                    dwflVar.p = bK3;
                    dwflVar.a |= 32768;
                    a = dwfiVar.bK();
                }
            }
            F.g(bczw.c(a, acen.a(acejVar.b(), eaolVar, application)));
        }
        return F.f();
    }

    @Override // defpackage.bcqa
    public final bdag aJ() {
        return this.f.a(bbtq.c);
    }

    @Override // defpackage.bcqa
    public final bcrp aR() {
        return this.ap;
    }

    @Override // defpackage.bcqa
    public final bcrr aT() {
        return null;
    }

    @Override // defpackage.bcqa
    public final bdbm aU() {
        return bdbm.a(dcdc.g(this.e, new bdeu(this.a, this.d.a(bbvn.d, this.c, null))));
    }

    @Override // defpackage.bcqa
    public final bbvl g() {
        return this.g;
    }

    @Override // defpackage.bcqa
    public final bbtx i() {
        return bbtx.CONTROL_PLAYBACK_MUTE_STATE;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bcqm bcqmVar = (bcqm) this.b.d(bcqm.class, this.o, "LIGHTBOX_ITEMS");
            dbsk.s(bcqmVar);
            aX(bcqmVar.a);
            bbuu bbuuVar = (bbuu) this.b.d(bbuu.class, this.o, "VOTE_MANAGER");
            dbsk.s(bbuuVar);
            this.ao = bbuuVar;
            this.ap = new bcrp(this) { // from class: acdf
                private final acdh a;

                {
                    this.a = this;
                }

                @Override // defpackage.bcrp
                public final void a() {
                    this.a.ad.c();
                }
            };
            this.aq = new acdg(this);
        } catch (IOException e) {
            bvoo.h("Failed to unpack options from getArguments() %s", e);
        }
    }

    @Override // defpackage.bcqa
    public final bbuu q() {
        return this.ao;
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.a(this.aq);
    }

    @Override // defpackage.bcqc, defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.b(this.aq);
        super.u();
    }

    @Override // defpackage.bcqa
    public final bdai w() {
        return bdbl.b(dcdc.f(new bdbj()));
    }
}
