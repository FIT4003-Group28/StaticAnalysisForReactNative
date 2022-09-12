package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqsv  reason: default package */
/* loaded from: classes2.dex */
public final class aqsv extends hxf {
    public ff b;
    public aqwb c;
    public efg d;
    public cqkj e;
    public dxio<cpv> f;
    private cqkf<aquy> g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqsw) btsx.b(aqsw.class, this)).cg(this);
    }

    @Override // defpackage.ges
    public final void Oo(View view) {
        if (w().a()) {
            this.f.a().c(w().b(), 8);
        } else {
            this.f.a().a(view);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.g.e(null);
        this.c.h();
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        ff ffVar = this.b;
        return jib.g(ffVar, ffVar.getString(R.string.MESSAGING_SETTINGS_TITLE));
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        this.g = this.e.e(new aqtp());
        this.c.g();
        this.g.e(this.c);
        return this.g.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxk.M;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.e(this);
        egjVar.j(false);
        this.d.a(egjVar.a());
    }
}
