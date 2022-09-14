package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acgh  reason: default package */
/* loaded from: classes2.dex */
public final class acgh extends hxf {
    public dxio<ache> ad;
    public arag ae;
    public dxio<araj> af;
    public cpv ag;
    public cqkf<acip> ah;
    public acgm aj;
    public bwqv b;
    public hwe c;
    public cqkj d;
    public btrm e;
    public efg f;
    public cqat g;
    public acik ai = new acik();
    private final Runnable ak = new acgf(this);

    @Override // defpackage.ges
    protected final void Nv() {
        ((acgi) btsx.b(acgi.class, this)).bN(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qd() {
        super.Qd();
        this.c.h();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof dnoh) {
            this.ai.d = akqq.e((dnoh) obj);
            this.ai.e = Long.valueOf(this.g.b());
        }
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = jib.g(J(), Rp(R.string.LOCATION_FEEDBACK_TITLE)).e();
        e.x = true;
        e.i = null;
        e.j = null;
        e.f(null);
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<acip> d = this.d.d(new acii(), null, false);
        this.ah = d;
        d.e(this.aj);
        return this.ah.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle != null) {
            this.ai = (acik) bundle.getSerializable("model");
        }
        this.aj = new acgm(this, this.ai, this.ak, this.ad.a(), this.ae, this.af.a());
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(amqo.class, new acgj(0, amqo.class, this));
        a.b(ahlc.class, new acgj(1, ahlc.class, this));
        btrmVar.g(this, a.a());
        View view = this.P;
        if (view == null) {
            return;
        }
        acgg acggVar = new acgg(this);
        efg efgVar = this.f;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(view);
        egjVar.e(acggVar);
        efgVar.a(egjVar.a());
        this.ak.run();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("model", this.ai);
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.e.a(this);
        super.u();
    }
}
