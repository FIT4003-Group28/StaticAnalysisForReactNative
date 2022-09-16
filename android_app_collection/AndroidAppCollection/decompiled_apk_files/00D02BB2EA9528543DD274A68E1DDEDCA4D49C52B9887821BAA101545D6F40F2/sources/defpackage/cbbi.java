package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cbbi  reason: default package */
/* loaded from: classes4.dex */
public final class cbbi extends ges implements cbqu {
    private static final dcqe d = dcqe.c("cbbi");
    public cqkj a;
    public cbbr b;
    public cbqg c;
    @dzsi
    private cqkf<cbqz> e;
    private cbbq f;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqz> c = this.a.c(new cbhu(), null);
        this.e = c;
        c.e(this.f);
        return this.e.c();
    }

    @Override // defpackage.cbqu
    public final cbqv g() {
        return cbqv.WEEKLY;
    }

    @Override // defpackage.cbqu
    @dzsi
    public final cbqt i() {
        cbbq cbbqVar = this.f;
        if (cbbqVar != null) {
            return cbbqVar.v();
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
            bvoo.h("Null start date in DateTimeWeeklyRecurringTabViewModel instantiation.", new Object[0]);
            return;
        }
        cbau cbauVar = new cbau(dpsdVar, dpsdVar, dpviVar, dpviVar, dpviVar2, dpviVar2);
        final dpvi dpviVar3 = dpviVar;
        cazb cazbVar = new cazb(H(), dpviVar, new cbbs(dpviVar) { // from class: cbbe
            private final dpvi a;

            {
                this.a = dpviVar;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, null, this);
        final dpvi b = dpviVar2 != null ? dpviVar2 : cbpy.b(dpviVar3, 1);
        cazb cazbVar2 = new cazb(H(), dpviVar2, new cbbs(b) { // from class: cbbf
            private final dpvi a;

            {
                this.a = b;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, null, this);
        final dpvi dpviVar4 = b;
        cbdw cbdwVar = new cbdw(H(), dpviVar3, new cbbs(dpviVar3) { // from class: cbbg
            private final dpvi a;

            {
                this.a = dpviVar3;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, true, this.c.b(), true);
        cbdw cbdwVar2 = new cbdw(H(), dpviVar2, new cbbs(dpviVar4) { // from class: cbbh
            private final dpvi a;

            {
                this.a = dpviVar4;
            }

            @Override // defpackage.cbbs
            public final dpvi a() {
                return this.a;
            }
        }, this.a, false, this.c.b(), false);
        cbbr cbbrVar = this.b;
        cbbr.a(cbauVar, 1);
        cbbr.a(cazbVar, 2);
        cbbr.a(cazbVar2, 3);
        cbbr.a(cbdwVar, 4);
        cbbr.a(cbdwVar2, 5);
        cbbc a = cbbrVar.a.a();
        cbbr.a(a, 6);
        cqhn a2 = cbbrVar.b.a();
        cbbr.a(a2, 7);
        cbqd a3 = cbbrVar.c.a();
        cbbr.a(a3, 8);
        gga a4 = cbbrVar.d.a();
        cbbr.a(a4, 9);
        this.f = new cbbq(cbauVar, cazbVar, cazbVar2, cbdwVar, cbdwVar2, a, a2, a3, a4);
    }

    @Override // defpackage.cbqu
    public final void q(Runnable runnable) {
        cbbq cbbqVar = this.f;
        if (cbbqVar != null) {
            cbbqVar.w(runnable);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cbbq cbbqVar = this.f;
        if (cbbqVar != null) {
            dpsd a = cbbqVar.v().a();
            if (a != null) {
                bundle.putByteArray("RECURRENCE_PATTERN_KEY", a.bS());
            }
            bundle.putByteArray("START_DATE_TIME_KEY", this.f.v().b().bS());
            dpvi c = this.f.v().c();
            if (c == null) {
                return;
            }
            bundle.putByteArray("END_DATE_TIME_KEY", c.bS());
        }
    }
}
