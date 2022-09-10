package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbct  reason: default package */
/* loaded from: classes3.dex */
public final class bbct extends hxf {
    public bbpk ad;
    private cqkf<bbnj> ae;
    public efg b;
    public cqkj c;
    public bbnc d;
    public cqhn e;
    public Activity f;
    public Executor g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((bbcu) btsx.b(bbcu.class, this)).cC(this);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        Activity activity = this.f;
        return jib.g(activity, activity.getString(R.string.PERSONAL_SCORE_FEEDBACK_LIST_NAME));
    }

    @Override // defpackage.hxf
    @dzsi
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bbnj> e = this.c.e(new bblh());
        this.ae = e;
        return e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ad = new bbpk(this.d, this.e, this.g, this.f);
        deha.q(this.d.a(), new bbcs(this), this.g);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxj.P;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ae.e(this.ad);
        egj egjVar = new egj(this);
        egjVar.F(null);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.b.a(egjVar.a());
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.e(null);
        super.u();
    }
}
