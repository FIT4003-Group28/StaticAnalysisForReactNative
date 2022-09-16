package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: bqzo  reason: default package */
/* loaded from: classes4.dex */
public final class bqzo extends ges implements brlm {
    private static final dcqe ak = dcqe.c("bqzo");
    public eeu a;
    public bvrb ad;
    public dzsj<ixr> ae;
    public dxio<brba> af;
    public cqkj ag;
    public bsrq ah;
    public ckmp ai;
    public acyp aj;
    private bwrs<brln> al = bwrs.a(null);
    private ixr am;
    private bsrp an;
    public bqza b;
    public btrm c;
    public broq d;
    public bwqv e;
    public efg f;
    public cjqy g;

    private final void i() {
        bvoo.h("Fragment is in invalid state. Activity or searchRequest is null.", new Object[0]);
        gga ggaVar = this.aE;
        if (ggaVar != null) {
            cjxu.j(ggaVar, this.ad, Rp(R.string.UNKNOWN_ERROR));
        }
        gn gnVar = this.A;
        dbsk.s(gnVar);
        gnVar.g(bc(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    @Override // defpackage.brlm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.brln r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqzo.a(brln):void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        brln g = g();
        if (g != null) {
            g.f = null;
        }
        super.am();
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        gga ggaVar = this.aE;
        if (this.aD) {
            if (ggaVar != null && ggaVar.g().J()) {
                return;
            }
            if (ggaVar == null) {
                i();
                return;
            }
            bqzt.g(this.e, bwrs.a(null)).aJ(ggaVar);
            ixr ixrVar = this.am;
            if (ixrVar != null) {
                ixrVar.QF(izr.VIEW);
                cqkx.p(this.am);
            }
            this.ai.d(ckmk.SEARCH_TO_LIST, btzy.f(bttqVar));
        }
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        if (this.aD) {
            gga ggaVar = this.aE;
            if (ggaVar == null) {
                i();
                return;
            }
            ggaVar.g().f();
            this.ai.c(ckmk.SEARCH_TO_LIST, ckmo.CANCELLED);
        }
    }

    @dzsi
    public final brln g() {
        if (this.al.c() == null) {
            bvoo.h("Search request in searchRequestRef should not be null.", new Object[0]);
            i();
            return null;
        }
        return this.al.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        try {
            bwrs<brln> e = this.e.e(brln.class, this.o, "searchRequest");
            if (e == null || e.c() == null) {
                throw new IllegalArgumentException("searchRequest was not passed in.");
            }
            this.al = e;
            brln g = g();
            if (g == null) {
                return;
            }
            g.f = this;
        } catch (IOException | IllegalArgumentException e2) {
            bvoo.h("Corrupt storage data: %s", e2);
            this.al = bwrs.a(null);
            i();
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.aE;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        brln g = g();
        if (g == null) {
            i();
            return;
        }
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        egjVar.I(2);
        egf a = egf.a();
        a.s = true;
        a.B = true;
        egjVar.A(a);
        brln g2 = g();
        if (g2 == null || !g2.e()) {
            ixr a2 = this.ae.a();
            this.am = a2;
            a2.QF(izr.LOADING);
            this.am.I(g.j());
            egjVar.W(this.am);
        } else {
            this.an = this.ah.a(g.j());
            cqkf c = this.ag.c(new hxj(), null);
            c.e(this.an);
            this.an.b(true);
            egjVar.G(c.c(), 6);
        }
        if (this.aj.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
        }
        this.f.a(egjVar.a());
        g.e.z();
        this.d.a(g);
    }
}
