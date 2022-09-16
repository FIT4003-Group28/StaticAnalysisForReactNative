package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cazx  reason: default package */
/* loaded from: classes4.dex */
public final class cazx extends ges implements cbqu {
    private static final dcqe d = dcqe.c("cazx");
    public cqkj a;
    public cbae b;
    public cbqg c;
    @dzsi
    private cqkf<cbqq> e;
    private cbad f;
    private Runnable g;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqq> c = this.a.c(new cbhc(), null);
        this.e = c;
        c.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.cbqu
    public final cbqv g() {
        return cbqv.DAILY;
    }

    @Override // defpackage.cbqu
    @dzsi
    public final cbqt i() {
        cbad cbadVar = this.f;
        if (cbadVar != null) {
            return cbadVar.l();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        final dpvi dpviVar;
        dpsd dpsdVar;
        dpvi dpviVar2;
        final dpvi bK;
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
            bvoo.h("Null start date in DateTimeDailyRecurringTabViewModel instantiation.", new Object[0]);
            return;
        }
        cbau cbauVar = new cbau(dpsdVar, dpsdVar, dpviVar, dpviVar, dpviVar2, dpviVar2);
        final dpvi dpviVar3 = dpviVar;
        cazb cazbVar = new cazb(H(), dpviVar, new cbbs(dpviVar) { // from class: cazt
            private final dpvi a;

            {
                this.a = dpviVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, null, this);
        if (dpviVar2 != null) {
            bK = dpviVar2;
        } else {
            eaph l = cbpy.a(dpviVar3).l(1);
            dsqp dsqpVar = (dsqp) dpviVar3.cu(5);
            dsqpVar.bC(dpviVar3);
            dpvh dpvhVar = (dpvh) dsqpVar;
            int m = l.m();
            if (dpvhVar.c) {
                dpvhVar.bF();
                dpvhVar.c = false;
            }
            dpvi dpviVar4 = (dpvi) dpvhVar.b;
            dpviVar4.a |= 1;
            dpviVar4.b = m;
            int n = l.n();
            if (dpvhVar.c) {
                dpvhVar.bF();
                dpvhVar.c = false;
            }
            dpvi dpviVar5 = (dpvi) dpvhVar.b;
            dpviVar5.a |= 2;
            dpviVar5.c = n;
            int o = l.o();
            if (dpvhVar.c) {
                dpvhVar.bF();
                dpvhVar.c = false;
            }
            dpvi dpviVar6 = (dpvi) dpvhVar.b;
            dpviVar6.a |= 4;
            dpviVar6.d = o;
            bK = dpvhVar.bK();
        }
        cazb cazbVar2 = new cazb(H(), dpviVar2, new cbbs(bK) { // from class: cazu
            private final dpvi a;

            {
                this.a = bK;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, false, null, this);
        final dpvi dpviVar7 = bK;
        cbdw cbdwVar = new cbdw(H(), dpviVar3, new cbbs(dpviVar3) { // from class: cazv
            private final dpvi a;

            {
                this.a = dpviVar3;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, this.c.b(), true);
        cbdw cbdwVar2 = new cbdw(H(), dpviVar2, new cbbs(dpviVar7) { // from class: cazw
            private final dpvi a;

            {
                this.a = dpviVar7;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, false, this.c.b(), false);
        cbae cbaeVar = this.b;
        cbae.a(cbauVar, 1);
        cbae.a(cazbVar, 2);
        cbae.a(cazbVar2, 3);
        cbae.a(cbdwVar, 4);
        cbae.a(cbdwVar2, 5);
        cbbc a = cbaeVar.a.a();
        cbae.a(a, 6);
        cqhn a2 = cbaeVar.b.a();
        cbae.a(a2, 7);
        cbqd a3 = cbaeVar.c.a();
        cbae.a(a3, 8);
        gga a4 = cbaeVar.d.a();
        cbae.a(a4, 9);
        cbad cbadVar = new cbad(cbauVar, cazbVar, cazbVar2, cbdwVar, cbdwVar2, a, a2, a3, a4);
        this.f = cbadVar;
        Runnable runnable = this.g;
        if (runnable == null) {
            return;
        }
        cbadVar.m(runnable);
    }

    @Override // defpackage.cbqu
    public final void q(Runnable runnable) {
        this.g = runnable;
        cbad cbadVar = this.f;
        if (cbadVar != null) {
            cbadVar.m(runnable);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cbad cbadVar = this.f;
        if (cbadVar != null) {
            dpsd a = cbadVar.l().a();
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
