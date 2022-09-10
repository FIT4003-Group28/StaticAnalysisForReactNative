package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bwje  reason: default package */
/* loaded from: classes4.dex */
public final class bwje extends hxf implements bwjv {
    private static final dcqe aq = dcqe.c("bwje");
    public bwqv ad;
    public cjzo ae;
    public cjqy af;
    public dxio<akfa> ag;
    public dxio<ahjq> ah;
    public dxio<nut> ai;
    public dxio<qbt> aj;
    public dxio<bwjz> ak;
    public bwpo al;
    public ckcw am;
    public bwjy an;
    public bwja ao;
    bwpn ap;
    private nxd as;
    private View at;
    public cqkj b;
    public btrm c;
    public eeu d;
    public efg e;
    public efc f;
    public bvrb g;
    private final jmz au = new jmz();
    private final bwjd av = new bwjd(this);
    private final bwnj ar = new bwnj();

    public static bwje aR(bwqv bwqvVar, bwnj bwnjVar, @dzsi fd fdVar) {
        dbsk.g(fdVar == null || (fdVar instanceof nxd), "fragment should be null or instance of CardUiActionDelegate, but fragment=%s", fdVar);
        bwje bwjeVar = new bwje();
        Bundle bundle = new Bundle();
        bundle.putBoolean("restoreCameraPositionOnResume", true);
        bwqvVar.c(bundle, "odelay_list_fragment_odelay_state", bwnjVar);
        aT(bundle, (nxd) fdVar);
        bwjeVar.B(bundle);
        bwjeVar.aJ();
        return bwjeVar;
    }

    private static void aT(Bundle bundle, @dzsi nxd nxdVar) {
        if (nxdVar != null) {
            fd fdVar = (fd) nxdVar;
            fdVar.A.n(bundle, "cardui_action_delegate", fdVar);
        }
    }

    private final boolean aU(Bundle bundle) {
        bwnj bwnjVar;
        if (bundle != null) {
            try {
                bwnjVar = (bwnj) this.ad.d(bwnj.class, bundle, "odelay_list_fragment_odelay_state");
            } catch (IOException e) {
                bvoo.h("Corrupt storage data: %s", e);
                bwnjVar = null;
            }
            if (bwnjVar == null) {
                return false;
            }
            this.ar.a(bwnjVar);
            gn gnVar = this.A;
            if (gnVar != null) {
                fd o = gnVar.o(bundle, "cardui_action_delegate");
                if (o instanceof nxd) {
                    this.as = (nxd) o;
                } else {
                    dcqe.b.v(dcqz.FULL);
                    this.as = null;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.au.a(this.at);
        super.Qe();
    }

    @Override // defpackage.bwjv
    public final boolean aS() {
        return this.ar.i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.c.a(this.av);
        super.am();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hxf
    public final jib g() {
        jhz a = jhz.a();
        a.a = dbsj.e(this.ar.v());
        a.b = dbsj.e(this.ar.x());
        a.f(new bwjc(this));
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf d = this.b.d(new bwkq(), null, false);
        this.at = cqkx.d(d.c(), bwkq.a);
        bwjb bwjbVar = new bwjb(this);
        bwja bwjaVar = this.ao;
        bvrj.UI_THREAD.c();
        bwjaVar.e = bwjbVar;
        d.e(this.ap);
        return d.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        btrm btrmVar = this.c;
        bwjd bwjdVar = this.av;
        dceq a = dcet.a();
        a.b(azrd.class, new bwjf(azrd.class, bwjdVar, bvrj.UI_THREAD));
        btrmVar.g(bwjdVar, a.a());
        if (!aU(bundle)) {
            aU(this.o);
        }
        this.ap = this.al.a(this.ar);
        this.ao = new bwja(this.ar, this.aE, this.ap, this.as, this.ae, this.af, this.ak.a(), this.c, this.ag, this.d, this.g, this.ai.a(), this.aj.a(), this.ah.a(), this.am, this.an);
        super.l(bundle);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxl.c;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ao.d();
        this.au.b(this.at);
        View view = this.P;
        if (view.getContentDescription() == null) {
            this.ao.b.ab();
            view.setContentDescription(null);
        }
        egu c = this.f.c();
        boolean z = c != null && c.d().t;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egf a = egf.a();
        a.t = z;
        egjVar.A(a);
        egjVar.w(view);
        egjVar.e(this);
        if (aS()) {
            egjVar.f(false);
            egjVar.x(egr.a);
        }
        this.ar.ac();
        this.e.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ad.c(bundle, "odelay_list_fragment_odelay_state", this.ar);
        aT(bundle, this.as);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.ao.e();
        super.u();
    }
}
