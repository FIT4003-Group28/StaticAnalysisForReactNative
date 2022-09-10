package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: aqmh  reason: default package */
/* loaded from: classes2.dex */
public final class aqmh extends hxf {
    @dzsi
    private cqkf<aqcc> ad;
    private int ae;
    public efg b;
    public cqkj c;
    public ckmm d;
    public ckcw e;
    public aqnj f;
    private aqni g;

    @Override // defpackage.ges
    protected final void Nv() {
        ((aqmi) btsx.b(aqmi.class, this)).cd(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        this.g.n();
        cqkf<aqcc> cqkfVar = this.ad;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.ad = null;
        }
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = jib.g(J(), J().getString(R.string.MESSAGING_INBOX_TITLE)).e();
        e.o = cjtd.a(dtxv.dA);
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        this.ae = apzw.b(this.o.getString("accountSelectionFlowType"));
        cqkf<aqcc> e = this.c.e(new aqmm());
        this.ad = e;
        View c = e.c();
        this.g = this.f.a(apzb.INBOX, c == null ? null : (cvbp) cqhu.a(c, aqmm.b), this);
        cqkf<aqcc> cqkfVar = this.ad;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.g);
        return c;
    }

    @Override // defpackage.ges
    @dzsi
    public final ddho p() {
        return dtxv.dD;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        View view = this.P;
        if (view == null) {
            return;
        }
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.aq(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
        egjVar.f(false);
        egjVar.w(view);
        egjVar.j(false);
        this.b.a(egjVar.a());
        this.g.PD();
        this.d.e(cwsv.a("MessagingInboxStartedEvent"));
        if (this.ae == 1) {
            ((ckhe) this.e.a(ckgs.a)).c();
        } else {
            ((ckhe) this.e.a(ckgs.a)).e();
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        this.g.m();
    }
}
