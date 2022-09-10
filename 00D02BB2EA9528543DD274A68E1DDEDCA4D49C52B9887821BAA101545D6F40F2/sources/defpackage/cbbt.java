package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cbbt  reason: default package */
/* loaded from: classes4.dex */
public final class cbbt extends ges {
    private static final dcqe g = dcqe.c("cbbt");
    public cqkj a;
    public cbbb b;
    public efg c;
    public cjxo d;
    private cqkf<cbqy> e;
    private cbba f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cbbt g(cbau cbauVar) {
        cbbt cbbtVar = new cbbt();
        Bundle bundle = new Bundle();
        dpsd a = cbauVar.a();
        if (a != null) {
            bundle.putByteArray("RECURRENCE_PATTERN_KEY", a.bS());
        }
        bundle.putByteArray("START_DATE_TIME_KEY", cbauVar.b().bS());
        dpvi c = cbauVar.c();
        if (c != null) {
            bundle.putByteArray("END_DATE_TIME_KEY", c.bS());
        }
        cbbtVar.B(bundle);
        return cbbtVar;
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqy> c = this.a.c(new cbmm(), null);
        this.e = c;
        c.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dpvi dpviVar;
        dpvi dpviVar2;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        dpsd dpsdVar = null;
        if (bundle != null) {
            dpsdVar = (dpsd) bvrs.b(bundle.getByteArray("RECURRENCE_PATTERN_KEY"), (dssr) dpsd.f.cu(7));
            dpviVar2 = (dpvi) bvrs.b(bundle.getByteArray("END_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
            dpviVar = (dpvi) bvrs.b(bundle.getByteArray("START_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
        } else {
            dpviVar = null;
            dpviVar2 = null;
        }
        if (dpviVar == null) {
            bvoo.h("Null start date in DateTimeRecurringTabsViewModel instantiation.", new Object[0]);
            return;
        }
        cbbb cbbbVar = this.b;
        gn R = R();
        cbbb.a(dpviVar, 1);
        cbbb.a(this, 4);
        cbbb.a(R, 5);
        cqhn a = cbbbVar.a.a();
        cbbb.a(a, 6);
        cjqy a2 = cbbbVar.b.a();
        cbbb.a(a2, 7);
        gga a3 = cbbbVar.c.a();
        cbbb.a(a3, 8);
        cqkj a4 = cbbbVar.d.a();
        cbbb.a(a4, 9);
        this.f = new cbba(dpviVar, dpviVar2, dpsdVar, this, R, a, a2, a3, a4);
        if (dpsdVar == null || dpsdVar.c.size() > 0) {
            this.f.m(cbqv.WEEKLY);
        } else if ((dpsdVar.a & 1) == 0) {
            if (dpsdVar.d.size() <= 0) {
                if (dpsdVar.e.size() > 0) {
                    this.f.m(cbqv.CUSTOM);
                    return;
                } else {
                    this.f.m(cbqv.WEEKLY);
                    return;
                }
            }
            this.f.m(cbqv.MONTHLY);
        } else {
            this.f.m(cbqv.DAILY);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.d.a(1);
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.f(false);
        egjVar.w(this.P);
        egjVar.I(2);
        egjVar.k(true);
        this.c.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        dpsd a = this.f.q().a();
        if (a != null) {
            bundle.putByteArray("RECURRENCE_PATTERN_KEY", a.bS());
        }
        bundle.putByteArray("START_DATE_TIME_KEY", this.f.q().b().bS());
        dpvi c = this.f.q().c();
        if (c != null) {
            bundle.putByteArray("END_DATE_TIME_KEY", c.bS());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        this.d.b();
        super.u();
    }
}
