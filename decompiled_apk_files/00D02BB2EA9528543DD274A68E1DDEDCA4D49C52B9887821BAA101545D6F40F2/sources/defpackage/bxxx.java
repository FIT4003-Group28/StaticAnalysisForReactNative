package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxxx  reason: default package */
/* loaded from: classes4.dex */
public final class bxxx extends hxf {
    public bxze b;
    public cqkj c;
    public efg d;
    public acyp e;
    private cqkf<bxxr> f;

    @Override // defpackage.ges
    public final void Nv() {
        ((bxxy) btsx.b(bxxy.class, this)).dq(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.f.e(null);
        super.Qe();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = jib.g(J(), Rp(R.string.RECENT_SEARCHES)).e();
        e.x = true;
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bxxr> c = this.c.c(new bxvv(), null);
        this.f = c;
        c.e(this.b);
        return this.f.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyb.aJ;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        if (this.e.c()) {
            egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        }
        this.d.a(egjVar.a());
        this.b.b();
    }
}
