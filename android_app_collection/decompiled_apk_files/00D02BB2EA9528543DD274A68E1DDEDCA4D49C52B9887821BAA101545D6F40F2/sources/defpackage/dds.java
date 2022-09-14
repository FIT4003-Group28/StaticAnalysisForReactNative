package defpackage;

import android.widget.ImageView;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dds  reason: default package */
/* loaded from: classes6.dex */
public final class dds implements ddv {
    public static final dspt a = dsuz.f();
    public final ahjq b;
    public final Executor c;
    public final dbsg<czo> d;
    public final gga e;
    private final czkm<ddx> f;
    private final Executor g;
    private final dbty<Boolean> i;
    private final Object h = new Object();
    @dzsi
    private Boolean j = null;
    @dzsi
    private dbsz<Boolean> k = null;

    public dds(ahjq ahjqVar, Executor executor, final dbsg<czw> dbsgVar, dbsg<czo> dbsgVar2, gga ggaVar, czkm<ddx> czkmVar, Executor executor2) {
        this.b = ahjqVar;
        this.c = executor;
        this.d = dbsgVar2;
        this.e = ggaVar;
        this.f = czkmVar;
        this.g = executor2;
        this.i = dbsgVar.a() ? new dbty(dbsgVar) { // from class: dcv
            private final dbsg a;

            {
                this.a = dbsgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dbsg dbsgVar3 = this.a;
                dspt dsptVar = dds.a;
                return Boolean.valueOf(((czw) dbsgVar3.b()).a().d);
            }
        } : dcw.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(czkm<ddx> czkmVar, Executor executor, dbsz<ddx> dbszVar) {
        deha.q(czkmVar.b(), new dda(dbszVar), executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(czkm<ddx> czkmVar, Executor executor, dbrn<ddx, ddx> dbrnVar) {
        deha.q(czkmVar.c(dbrnVar, executor), new ddb(), executor);
    }

    @Override // defpackage.ddv
    public final boolean a() {
        return this.i.a().booleanValue();
    }

    @Override // defpackage.ddv
    public final void b(dbsz<Boolean> dbszVar) {
        synchronized (this.h) {
            Boolean bool = this.j;
            if (bool != null) {
                dbszVar.NU(bool);
            } else {
                this.k = dbszVar;
            }
        }
    }

    @Override // defpackage.ddv
    public final void c(final boolean z) {
        boolean booleanValue;
        synchronized (this.h) {
            Boolean bool = this.j;
            booleanValue = bool != null ? bool.booleanValue() : false;
        }
        dbsk.a(booleanValue);
        dbsk.a(this.d.a());
        e(this.f, this.g, new dbsz(this, z) { // from class: dcx
            private final dds a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj) {
                dds ddsVar = this.a;
                boolean z2 = this.b;
                ddx ddxVar = (ddx) obj;
                czp o = ArLauncherParams.p(czh.CALIBRATOR, ddxVar.b, dcdc.e()).o();
                if (z2) {
                    boolean z3 = ddxVar.b;
                    dccx F = dcdc.F();
                    F.g(czq.DIRECTIONS_OVERLAY);
                    if (!z3) {
                        F.g(czq.AWARENESS);
                    }
                    o.l(F.f());
                    o.j(doi.ONBOARDING_CALIBRATOR);
                    o.i(ImageView.ScaleType.CENTER_INSIDE);
                    o.m(true);
                    o.o(czq.DIRECTIONS_OVERLAY, ddsVar.e.getString(R.string.CALIBRATOR_CONSENT_COMPASS_ACCURACY_TITLE));
                    o.n(czq.DIRECTIONS_OVERLAY, ddsVar.e.getString(R.string.CALIBRATOR_CONSENT_COMPASS_ACCURACY_DESCRIPTION));
                    o.c().f(czq.DIRECTIONS_OVERLAY, ddsVar.e.getString(R.string.CALIBRATOR_CONSENT_USE_CAMERA));
                }
                ddsVar.d.b().b(o.d(), null);
            }
        });
    }

    public final void d(boolean z) {
        synchronized (this.h) {
            Boolean valueOf = Boolean.valueOf(z);
            this.j = valueOf;
            dbsz<Boolean> dbszVar = this.k;
            if (dbszVar != null) {
                dbszVar.NU(valueOf);
                this.k = null;
            }
        }
    }
}
