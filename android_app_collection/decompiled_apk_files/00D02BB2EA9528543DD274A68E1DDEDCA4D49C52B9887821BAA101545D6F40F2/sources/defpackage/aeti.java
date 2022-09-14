package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aeti  reason: default package */
/* loaded from: classes2.dex */
public class aeti extends ges implements aerz {
    public static final dcqe a = dcqe.c("aeti");
    public cqkj ad;
    public aetc ae;
    public dxio<efg> af;
    public btrm ag;
    public aesh ah;
    public bvrb ai;
    public dxio<akpm> aj;
    public inq ak;
    public ioj al;
    public iop am;
    public boxa an;
    public dxio<brba> ao;
    public iny ap;
    aesp ar;
    private cqkf<aesp> au;
    private bvrt<dnqh> av;
    cqkf<aesp> b;
    public aetm c;
    public bwqv d;
    public aesb e;
    public begg f;
    public bqji g;
    private aeui at = aeui.b;
    public aesa aq = aesa.OPEN_PLACESHEET;
    private boolean aw = false;
    private alad ax = null;
    final ink as = new aeth(this);

    private final dnqh aJ() {
        dnqh dnqhVar = dnqh.p;
        return (dnqh) dbsg.j((dnqh) bvrt.f(this.av, (dssr) dnqh.p.cu(7), dnqhVar)).c(dnqhVar);
    }

    private final void w(final boolean z) {
        aetc aetcVar = this.ae;
        aeui aeuiVar = this.at;
        cqqw f = this.ap.f();
        aesa aesaVar = this.aq;
        dzsj<aesb> dzsjVar = aetcVar.a;
        dzsj<araj> dzsjVar2 = aetcVar.b;
        dzsj<cqg> dzsjVar3 = aetcVar.c;
        bnjv a2 = aetcVar.d.a();
        aetc.a(a2, 4);
        axwq a3 = aetcVar.e.a();
        aetc.a(a3, 5);
        apkf a4 = aetcVar.f.a();
        aetc.a(a4, 6);
        ckcw a5 = aetcVar.g.a();
        aetc.a(a5, 7);
        aetc.a(aeuiVar, 8);
        aetc.a(this, 9);
        aetc.a(f, 10);
        aetc.a(aesaVar, 11);
        aetb aetbVar = new aetb(dzsjVar, dzsjVar2, dzsjVar3, a2, a3, a4, a5, aeuiVar, this, f, aesaVar);
        this.ar = aetbVar;
        this.ap.d(aetbVar.k());
        this.b.e(this.ar);
        this.au.e(this.ar);
        if (this.ar.k().isEmpty()) {
            this.ap.e(false);
        } else {
            this.am.d(this.b.c(), new Runnable(this, z) { // from class: aetf
                private final aeti a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 311
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.aetf.run():void");
                }
            });
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ap.c();
        this.b.e(null);
        this.au.e(null);
        super.Qe();
    }

    @Override // defpackage.aerz
    public final void a(aeui aeuiVar) {
        if (this.at.equals(aeuiVar)) {
            return;
        }
        this.at = aeuiVar;
        if (!this.aD) {
            return;
        }
        w(true);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b = this.ad.c(this.ah, null);
        this.au = this.ad.c(new aetq(), null);
        dccx F = dcdc.F();
        F.g(this.al.a(this.as, true, dtxy.fG, dtxy.fB));
        F.g(this.ak.a(this.as, dtxy.fE));
        this.ap = inz.a(new dbty(this) { // from class: aetd
            private final aeti a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                aeti aetiVar = this.a;
                return aetiVar.am.b(aetiVar.ar.c(), aetiVar.b.c());
            }
        }, F.f());
        w(this.aw);
        this.aw = false;
        return this.b.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        this.e.p(this);
    }

    public final egu g(boolean z) {
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.F(this.au.c());
        egjVar.aw(this.b.c(), false);
        egjVar.f(false);
        egjVar.k(z);
        egjVar.J(new egq(this) { // from class: aete
            private final aeti a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                aeti aetiVar = this.a;
                aetiVar.am.g(aetiVar.b.c(), aetiVar.H());
            }
        });
        egf a2 = egf.a();
        a2.l(false);
        a2.q();
        egjVar.A(a2);
        return egjVar.a();
    }

    public final void i() {
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            ggaVar.z(aeti.class);
            ggaVar.g().f();
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dbsk.s(bundle2);
        this.aq = (aesa) dbsg.j((aesa) bundle2.getSerializable("placemark_action")).c(aesa.OPEN_PLACESHEET);
        this.av = (bvrt) bundle2.getSerializable("placemark_action_logging");
        Bundle bundle3 = (Bundle) dbsg.j(bundle).c(bundle2);
        this.aw = bundle3.getBoolean("animate_on_create", false);
        try {
            aeui aeuiVar = (aeui) this.d.d(aeui.class, bundle3, "iah_state");
            if (aeuiVar != null) {
                this.at = aeuiVar;
                this.ax = (alad) this.d.d(alad.class, bundle3, "camera_position_on_active");
            }
        } catch (IOException e) {
            bvoo.j(new RuntimeException(e));
        }
        this.e.o(this);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.ft;
    }

    public final void q(ilo iloVar) {
        aesa aesaVar = aesa.OPEN_PLACESHEET;
        int ordinal = this.aq.ordinal();
        if (ordinal == 0) {
            begg beggVar = this.f;
            begj begjVar = new begj();
            begjVar.b(iloVar);
            begjVar.n = true;
            begjVar.x = true;
            begjVar.d = aJ();
            begjVar.c = jjn.FULLY_EXPANDED;
            begjVar.q = true;
            beggVar.o(begjVar, false, null);
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.an.B(bwrs.a(iloVar), dnqe.i, null);
        } else {
            i();
            bqji bqjiVar = this.g;
            bwrs<ilo> a2 = bwrs.a(iloVar);
            bqjf r = bqjh.r();
            r.f(aJ());
            bqjiVar.b(a2, r.o());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ap.a();
        alad aladVar = this.ax;
        if (aladVar != null) {
            akpm akpmVar = this.c.d;
            akyc e = akyt.e(aladVar);
            e.b = 0;
            akpmVar.p(e);
        }
        this.af.a().a(g(false));
        btrm btrmVar = this.ag;
        dceq a2 = dcet.a();
        a2.b(ardp.class, new aetj(ardp.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.d.c(bundle, "iah_state", this.at);
        bundle.putBoolean("animate_on_create", this.aw);
        this.d.c(bundle, "camera_position_on_active", this.ax);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ap.b();
        this.ag.a(this);
        this.am.f(this.b.c());
        this.ax = this.aj.a().n();
        super.u();
    }
}
