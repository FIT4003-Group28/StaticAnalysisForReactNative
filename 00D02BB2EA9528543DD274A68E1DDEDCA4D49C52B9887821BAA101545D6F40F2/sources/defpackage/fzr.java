package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
/* compiled from: PG */
/* renamed from: fzr  reason: default package */
/* loaded from: classes6.dex */
public final class fzr extends ges {
    public static final dcqe a = dcqe.c("fzr");
    public akpm ad;
    public gbi ae;
    private aefv af;
    private View ag;
    private cqkf<jar> ah;
    private cqkf<gbe> ai;
    private final awwn aj = new fzq(this);
    public efg b;
    public cqkj c;
    public dxio<afwr> d;
    public dxio<awwq> e;
    public fzp f;
    public gbj g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((fzs) btsx.b(fzs.class, this)).bG(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<jar> cqkfVar = this.ah;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ah = null;
        }
        cqkf<gbe> cqkfVar2 = this.ai;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
            this.ai = null;
        }
        this.af = null;
        this.ag = null;
        super.Qe();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AccessibilityManager accessibilityManager;
        cqkf<gbe> e = this.c.e(new gbb());
        this.ai = e;
        e.e(this.ae);
        aefv aefvVar = (aefv) this.ai.c();
        this.af = aefvVar;
        aefvVar.setShowGrippy(true);
        this.af.setMinExposurePixels(400);
        int w = this.af.w();
        aefv aefvVar2 = this.af;
        gga ggaVar = this.aE;
        if (ggaVar == null || (accessibilityManager = (AccessibilityManager) ggaVar.getSystemService("accessibility")) == null || !accessibilityManager.isEnabled()) {
            gga ggaVar2 = this.aE;
            w = (ggaVar2 == null || !this.aD) ? 0 : (int) (bvsc.a(ggaVar2) * 0.33f);
        }
        aefvVar2.h(w);
        cqkf<jar> e2 = this.c.e(new fzu());
        this.ah = e2;
        gga a2 = this.f.a.a();
        fzp.a(a2);
        e2.e(new fzo(a2));
        this.ag = this.ah.c();
        return null;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        gga ggaVar = this.aE;
        if (ggaVar == null || !this.aD) {
            return false;
        }
        this.d.a().k(afwm.COVID19, false);
        ggaVar.g().f();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        gbj gbjVar = this.g;
        cqhn a2 = gbjVar.a.a();
        gbj.a(a2, 1);
        dxio a3 = ((dxjh) gbjVar.b).a();
        gbj.a(a3, 2);
        amfi a4 = gbjVar.c.a();
        gbj.a(a4, 3);
        gga a5 = gbjVar.d.a();
        gbj.a(a5, 4);
        this.ae = new gbi(a2, a3, a4, a5);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ad.p(akyt.b(11.0f));
        this.e.a().f(this.aj);
        egj egjVar = new egj(this);
        egjVar.k(false);
        egjVar.w(null);
        egjVar.H(this.af);
        egjVar.ag(null);
        egjVar.Y(false);
        egjVar.r(this.ag);
        egjVar.B(false);
        egjVar.f(false);
        egf a2 = egf.a();
        a2.l(false);
        a2.g = false;
        a2.r();
        a2.v = dtxl.eJ;
        egjVar.A(a2);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.e.a().i(this.aj);
        super.u();
    }
}
