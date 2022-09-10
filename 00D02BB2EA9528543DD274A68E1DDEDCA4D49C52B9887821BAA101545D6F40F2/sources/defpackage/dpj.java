package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dpj  reason: default package */
/* loaded from: classes6.dex */
public class dpj extends ivw implements dro, bwrr {
    private final gga c;
    private final bwqv d;
    private final dehn<dbsg<dpf>> e;
    private final dtc f;
    @dzsi
    private drq g;
    private boolean h;

    public dpj(gga ggaVar, Executor executor, bwqv bwqvVar, dtc dtcVar, final dehn<dbsg<dpf>> dehnVar, m mVar) {
        super(ggaVar, ivu.SLIDER_TOP, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.h(2131232776, ibm.p()), ggaVar.getString(R.string.LIGHTHOUSE_FAB_CONTENT_DESCRIPTION), null, false, 0, ivv.FULL);
        this.h = false;
        this.c = ggaVar;
        this.d = bwqvVar;
        this.e = dehnVar;
        this.f = dtcVar;
        mVar.Nh().a(new e() { // from class: com.google.android.apps.gmm.ar.lighthouse.ArLighthouseFloatingActionButtonViewModelImpl$1
            @Override // defpackage.f
            public final void a(m mVar2) {
            }

            @Override // defpackage.f
            public final void b(m mVar2) {
            }

            @Override // defpackage.f
            public final void c(m mVar2) {
            }

            @Override // defpackage.f
            public final void d(m mVar2) {
            }

            @Override // defpackage.f
            public final void e(m mVar2) {
            }

            @Override // defpackage.f
            public final void f(m mVar2) {
                dehn.this.cancel(true);
                this.i();
            }
        });
        deha.q(dehnVar, new dpi(this), executor);
    }

    private final void N(@dzsi drq drqVar) {
        i();
        this.g = drqVar;
        bwrs<ilo> h = h();
        if (h != null) {
            this.d.g(h, this);
        }
        j();
    }

    public static void k(cjta cjtaVar, @dzsi ilo iloVar) {
        if (iloVar == null) {
            return;
        }
        cjtaVar.g = decs.a(iloVar.ai().c);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        drq drqVar = this.g;
        if (drqVar != null && this.e.isDone()) {
            try {
                dbsg dbsgVar = (dbsg) deha.r(this.e);
                if (dbsgVar.a()) {
                    dpe b = ((dpf) dbsgVar.b()).b();
                    deha.q(b.b.c.b(), new dpd(b, drqVar), b.b.e);
                    return cqkl.a;
                }
            } catch (ExecutionException unused) {
            }
        }
        gga ggaVar = this.c;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.LH_NOT_AVAILABLE), 1).show();
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean b() {
        return false;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.dro
    public void d(PersonId personId) {
        drr drrVar = new drr();
        drrVar.c = 2;
        drrVar.b = dbsg.i(personId);
        drrVar.b(false);
        N(drrVar.a());
    }

    @Override // defpackage.dro
    public void e(@dzsi ilo iloVar) {
        if (iloVar == null) {
            N(null);
        } else {
            f(bwrs.a(iloVar));
        }
    }

    @Override // defpackage.dro
    public void f(bwrs<ilo> bwrsVar) {
        if (bwrsVar.c() == null) {
            N(null);
        } else {
            N(drq.a(bwrsVar));
        }
    }

    @Override // defpackage.bwrr
    /* renamed from: g */
    public void PV(@dzsi ilo iloVar) {
        cjtd z;
        j();
        if (iloVar == null || (z = z()) == null) {
            return;
        }
        cjta c = cjtd.c(z);
        k(c, iloVar);
        F(c.a());
    }

    @dzsi
    public final bwrs<ilo> h() {
        drq drqVar = this.g;
        if (drqVar == null || drqVar.g() != 1) {
            return null;
        }
        return this.g.b().b();
    }

    public final void i() {
        bwrs<ilo> h = h();
        if (h != null) {
            bwqv.t(h, this);
        }
    }

    public final void j() {
        drq drqVar = this.g;
        if (!A().booleanValue() || this.h || drqVar == null) {
            return;
        }
        int g = drqVar.g();
        if (g == 1) {
            bwrs<ilo> h = h();
            if (h == null || h.c() == null) {
                return;
            }
            ilo c = h.c();
            dbsk.s(c);
            akqq aj = c.aj();
            if (aj == null) {
                return;
            }
            dtc dtcVar = this.f;
            GmmLocation a = dtcVar.a.a();
            if (a != null && akqo.e(a.B(), aj) <= 15000.0d) {
                dtcVar.a(dqkc.AR_LIGHTHOUSE_FAB_TOOLTIP);
            }
        } else if (g == 2) {
            this.f.a(dqkc.AR_LIGHTHOUSE_LOCATION_SHARING_FAB_TOOLTIP);
        }
        this.h = true;
    }
}
