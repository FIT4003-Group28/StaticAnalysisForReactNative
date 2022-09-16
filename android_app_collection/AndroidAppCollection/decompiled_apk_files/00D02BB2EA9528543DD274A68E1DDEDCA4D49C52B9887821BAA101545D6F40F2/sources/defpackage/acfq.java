package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acfq  reason: default package */
/* loaded from: classes2.dex */
public final class acfq extends ges {
    public btrm a;
    private cqkf<acin> ad;
    public dxio<ache> b;
    public dxio<boxa> c;
    public efg d;
    public cqkj e;
    @dzsi
    public dnqe f;
    @dzsi
    private acio g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<acin> c = this.e.c(new achv(), viewGroup);
        this.ad = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        if (!J().isChangingConfigurations()) {
            this.a.b(new acfl(acfk.INACTIVE, null));
        }
        super.am();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        if (bundle2 != null) {
            dssr dssrVar = (dssr) dnqe.i.cu(7);
            dbsk.s(dssrVar);
            this.f = (dnqe) bvrs.e(bundle2, dnqe.class, dssrVar);
        } else {
            this.f = dnqe.i;
        }
        dnqe dnqeVar = this.f;
        dbsk.s(dnqeVar);
        dsqp dsqpVar = (dsqp) dnqeVar.cu(5);
        dsqpVar.bC(dnqeVar);
        dnps dnpsVar = (dnps) dsqpVar;
        dnqb dnqbVar = dnqb.ACCOUNT_PARTICLE_INTERMEDIATE;
        if (dnpsVar.c) {
            dnpsVar.bF();
            dnpsVar.c = false;
        }
        dnqe dnqeVar2 = (dnqe) dnpsVar.b;
        dnqeVar2.b = dnqbVar.ah;
        dnqeVar2.a |= 1;
        this.f = dnpsVar.bK();
        jhz e = jib.g(J(), Ro(R.string.HELP_AND_FEEDBACK)).e();
        e.n = Ro(R.string.HELP_AND_FEEDBACK);
        e.F = 1;
        this.g = new acio(e.b(), dcdc.i(new acim(J(), new Runnable(this) { // from class: acfm
            private final acfq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a().q("mobile_gmm_side_menu_android");
            }
        }, R.string.HELP, R.string.FEEDBACK_INTERMEDIATE_HELP_DESCRIPTION, cqrt.g(2131232287, ibm.o()), dtxp.b), new acim(J(), new Runnable(this) { // from class: acfn
            private final acfq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                acfq acfqVar = this.a;
                dnqe dnqeVar3 = acfqVar.f;
                dbsk.s(dnqeVar3);
                acfqVar.c.a().I(null, dnqeVar3);
            }
        }, R.string.EDIT_THE_MAP_TITLE, R.string.FEEDBACK_INTERMEDIATE_EDIT_THE_MAP_DESCRIPTION, cqrt.g(2131232251, ibm.o()), dtxp.e), new acim(J(), new Runnable(this) { // from class: acfo
            private final acfq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a().n();
            }
        }, R.string.FEEDBACK_TYPE_YOUR_LOCATION, R.string.FEEDBACK_INTERMEDIATE_LOCATION_DESCRIPTION, cqrt.f(2131231619), dtxp.c), new acim(J(), new Runnable(this) { // from class: acfp
            private final acfq a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a().p();
            }
        }, R.string.SEND_FEEDBACK, R.string.FEEDBACK_INTERMEDIATE_APP_FEEDBACK_DESCRIPTION, cqrt.g(2131232273, ibm.o()), dtxp.a)));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxp.d;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        View view = this.P;
        if (view == null) {
            return;
        }
        this.ad.e(this.g);
        view.setContentDescription(J().getString(R.string.HELP_AND_FEEDBACK));
        this.aF = view;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.e(this);
        this.d.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.ad.e(null);
        super.u();
    }
}
