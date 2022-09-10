package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cbaj  reason: default package */
/* loaded from: classes4.dex */
public final class cbaj extends ges implements cbqu {
    private static final dcqe d = dcqe.c("cbaj");
    public cqkj a;
    public cbas b;
    public cbqg c;
    @dzsi
    private cqkf<cbqr> e;
    private cbar f;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqr> c = this.a.c(new cbhm(), null);
        this.e = c;
        c.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.cbqu
    public final cbqv g() {
        return cbqv.MONTHLY;
    }

    @Override // defpackage.cbqu
    @dzsi
    public final cbqt i() {
        cbar cbarVar = this.f;
        if (cbarVar != null) {
            return cbarVar.l();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        final dpvi dpviVar;
        dpsd dpsdVar;
        dpvi dpviVar2;
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        if (bundle2 != null) {
            dpviVar2 = (dpvi) bvrs.b(bundle2.getByteArray("END_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
            dpsdVar = (dpsd) bvrs.b(bundle2.getByteArray("RECURRENCE_PATTERN_KEY"), (dssr) dpsd.f.cu(7));
            dpviVar = (dpvi) bvrs.b(bundle2.getByteArray("START_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
        } else {
            dpviVar = null;
            dpsdVar = null;
            dpviVar2 = null;
        }
        if (dpviVar == null) {
            bvoo.h("Null start date in DateTimeMonthlyRecurringTabViewModel instantiation.", new Object[0]);
            return;
        }
        cbau cbauVar = new cbau(dpsdVar, dpsdVar, dpviVar, dpviVar, dpviVar2, dpviVar2);
        final dpvi dpviVar3 = dpviVar;
        cazb cazbVar = new cazb(H(), dpviVar, new cbbs(dpviVar) { // from class: cbaf
            private final dpvi a;

            {
                this.a = dpviVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, null, this);
        final dpvi b = dpviVar2 != null ? dpviVar2 : cbpy.b(dpviVar3, 3);
        cazb cazbVar2 = new cazb(H(), dpviVar2, new cbbs(b) { // from class: cbag
            private final dpvi a;

            {
                this.a = b;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, false, null, this);
        final dpvi dpviVar4 = b;
        cbdw cbdwVar = new cbdw(H(), dpviVar3, new cbbs(dpviVar3) { // from class: cbah
            private final dpvi a;

            {
                this.a = dpviVar3;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, this.c.b(), true);
        cbdw cbdwVar2 = new cbdw(H(), dpviVar2, new cbbs(dpviVar4) { // from class: cbai
            private final dpvi a;

            {
                this.a = dpviVar4;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, false, this.c.b(), false);
        cbas cbasVar = this.b;
        cbas.a(cbauVar, 1);
        cbas.a(cazbVar, 2);
        cbas.a(cazbVar2, 3);
        cbas.a(cbdwVar, 4);
        cbas.a(cbdwVar2, 5);
        cbbc a = cbasVar.a.a();
        cbas.a(a, 6);
        cqhn a2 = cbasVar.b.a();
        cbas.a(a2, 7);
        gga a3 = cbasVar.c.a();
        cbas.a(a3, 8);
        cbqd a4 = cbasVar.d.a();
        cbas.a(a4, 9);
        this.f = new cbar(cbauVar, cazbVar, cazbVar2, cbdwVar, cbdwVar2, a, a2, a3, a4);
    }

    @Override // defpackage.cbqu
    public final void q(Runnable runnable) {
        cbar cbarVar = this.f;
        if (cbarVar != null) {
            cbarVar.m(runnable);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cbar cbarVar = this.f;
        if (cbarVar != null) {
            dpsd a = cbarVar.l().a();
            if (a != null) {
                bundle.putByteArray("RECURRENCE_PATTERN_KEY", a.bS());
            }
            bundle.putByteArray("START_DATE_TIME_KEY", this.f.l().b().bS());
            dpvi c = this.f.l().c();
            if (c == null) {
                return;
            }
            bundle.putByteArray("END_DATE_TIME_KEY", c.bS());
        }
    }
}
