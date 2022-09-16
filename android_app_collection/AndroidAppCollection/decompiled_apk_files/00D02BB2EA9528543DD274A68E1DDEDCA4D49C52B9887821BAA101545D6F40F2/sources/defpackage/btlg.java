package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: btlg  reason: default package */
/* loaded from: classes4.dex */
public final class btlg extends ges implements egq, bxqg {
    public cqkj a;
    @dzsi
    private cqkf<btlm> ad;
    public gfq b;
    public bxqi c;
    public btlo d;
    public cjmt e;
    private btlm f;
    @dzsi
    private egu g;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<btlm> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ad = null;
        }
        super.Qe();
    }

    @Override // defpackage.egq
    public final void Qs(egu eguVar) {
        this.g = null;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<btlm> e = this.a.e(new btll());
        this.ad = e;
        e.e(this.f);
        return this.ad.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.SETTINGS_MENU;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        bxlx a = bxlz.a(this);
        if (a == null || a.d()) {
        }
        return true;
    }

    @Override // defpackage.bxqg
    public final void g() {
        if (this.aD) {
            fd d = this.b.d();
            if (!(d instanceof btlg)) {
                return;
            }
            gfq.l((btlg) d);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c.a(this);
        btlo.a(this.d.a.a(), 1);
        btlo.a(null, 2);
        btlo.a(null, 3);
        this.f = new btln(null);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        View view = this.P;
        egf.a().m = true;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(view);
        egjVar.x(egr.a);
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.e.i();
        jmw.c(J());
        throw null;
    }
}
