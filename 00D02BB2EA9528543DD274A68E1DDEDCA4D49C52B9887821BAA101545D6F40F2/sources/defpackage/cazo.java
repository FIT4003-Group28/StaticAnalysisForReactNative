package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: cazo  reason: default package */
/* loaded from: classes4.dex */
public final class cazo extends ges implements cbqu {
    private static final dcqe c = dcqe.c("cazo");
    public cqkj a;
    public cazs b;
    @dzsi
    private cqkf<cbqp> d;
    private cazr e;
    private Runnable f;

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cbqp> c2 = this.a.c(new cbgw(), null);
        this.d = c2;
        c2.e(this.e);
        return this.d.c();
    }

    @Override // defpackage.cbqu
    public final cbqv g() {
        return cbqv.CUSTOM;
    }

    @Override // defpackage.cbqu
    @dzsi
    public final cbqt i() {
        cazr cazrVar = this.e;
        if (cazrVar != null) {
            return cazrVar.d();
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        dpsd dpsdVar;
        dpvi dpviVar;
        dpvi dpviVar2;
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        if (bundle2 != null) {
            dpviVar2 = (dpvi) bvrs.b(bundle2.getByteArray("END_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
            dpsdVar = (dpsd) bvrs.b(bundle2.getByteArray("RECURRENCE_PATTERN_KEY"), (dssr) dpsd.f.cu(7));
            dpviVar = (dpvi) bvrs.b(bundle2.getByteArray("START_DATE_TIME_KEY"), (dssr) dpvi.g.cu(7));
        } else {
            dpsdVar = null;
            dpviVar = null;
            dpviVar2 = null;
        }
        if (dpviVar == null) {
            bvoo.h("Null start date in DateTimeCustomRecurringTabViewModelImpl instantiation.", new Object[0]);
            return;
        }
        cazs cazsVar = this.b;
        cbau cbauVar = new cbau(dpsdVar, dpsdVar, dpviVar, dpviVar, dpviVar2, dpviVar2);
        cazs.a(this, 1);
        cazs.a(cbauVar, 2);
        cazn a = cazsVar.a.a();
        cazs.a(a, 3);
        cbqd a2 = cazsVar.b.a();
        cazs.a(a2, 4);
        cqkj a3 = cazsVar.c.a();
        cazs.a(a3, 5);
        cazl a4 = cazsVar.d.a();
        cazs.a(a4, 6);
        cqhn a5 = cazsVar.e.a();
        cazs.a(a5, 7);
        gga a6 = cazsVar.f.a();
        cazs.a(a6, 8);
        cazr cazrVar = new cazr(this, cbauVar, a, a2, a3, a4, a5, a6);
        this.e = cazrVar;
        Runnable runnable = this.f;
        if (runnable == null) {
            return;
        }
        cazrVar.e(runnable);
    }

    @Override // defpackage.cbqu
    public final void q(Runnable runnable) {
        this.f = runnable;
        cazr cazrVar = this.e;
        if (cazrVar != null) {
            cazrVar.e(runnable);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cazr cazrVar = this.e;
        if (cazrVar != null) {
            dpsd a = cazrVar.d().a();
            if (a != null) {
                bundle.putByteArray("RECURRENCE_PATTERN_KEY", a.bS());
            }
            bundle.putByteArray("START_DATE_TIME_KEY", this.e.d().b().bS());
            dpvi c2 = this.e.d().c();
            if (c2 == null) {
                return;
            }
            bundle.putByteArray("END_DATE_TIME_KEY", c2.bS());
        }
    }
}
