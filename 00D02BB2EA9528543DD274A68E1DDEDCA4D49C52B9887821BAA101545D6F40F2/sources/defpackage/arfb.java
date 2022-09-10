package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: arfb  reason: default package */
/* loaded from: classes2.dex */
public final class arfb extends ges implements arfl {
    public acyp a;
    public dzsj<ixr> ad;
    private cqkf<arjh> ae;
    public btvo b;
    public bvrb c;
    public efg d;
    public cqkj e;
    public arjd f;
    public dxio<acwo> g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((arfc) btsx.b(arfc.class, this)).cl(this);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cqkf<arjh> c = this.e.c(new arhd(), null);
        this.ae = c;
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxv.eJ;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.f.a();
        this.ae.e(this.f);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(null);
        egjVar.av(this.P);
        egjVar.W(this.ad.a());
        egjVar.k(false);
        egjVar.ad(false);
        egjVar.f(false);
        egjVar.e(this);
        if (this.a.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE);
        }
        this.d.a(egjVar.a());
        this.c.a(new arfa(this), bvrj.UI_THREAD, this.b.getSurveyParameters().b);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.f.b();
        super.u();
    }
}
