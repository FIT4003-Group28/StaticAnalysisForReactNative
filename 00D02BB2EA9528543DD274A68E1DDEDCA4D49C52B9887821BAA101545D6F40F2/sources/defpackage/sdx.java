package defpackage;

import android.app.Activity;
import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sdx  reason: default package */
/* loaded from: classes7.dex */
public class sdx extends sco implements sak {
    private static Set<domy> D;
    public final cjnx C;
    private final sfc E;
    private final sca F;
    private final cqkn<sad> G;

    public sdx(Application application, btvo btvoVar, qjk qjkVar, axvy axvyVar, cqhn cqhnVar, sic sicVar, sfd sfdVar, ros rosVar, sbz sbzVar, dxio<sim> dxioVar, Executor executor, Executor executor2, cjnx cjnxVar, axwq axwqVar, Activity activity, saf safVar, fd fdVar, rzp rzpVar) {
        super(application, btvoVar, qjkVar, axvyVar, sicVar, rosVar, sbzVar, dxioVar, executor, executor2, safVar, axwqVar, (wbx) null, activity, fdVar, false);
        sdw sdwVar = new sdw(this);
        this.G = sdwVar;
        this.E = sfdVar.a(R.string.RECEIPT_PAGE_TITLE, null, dtxl.dB, rzpVar);
        this.C = cjnxVar;
        this.q.B(dtxl.dy);
        this.r.B(dtxl.dG);
        this.v.B(dtxl.dA);
        this.w.B(dtxl.dF);
        if (this.s != null) {
            this.w.B(dtxl.dE);
        }
        if (this.t != null) {
            this.w.B(dtxl.dD);
        }
        scb scbVar = this.x;
        if (scbVar != null) {
            scbVar.D(false);
        }
        sca scaVar = new sca(cqrt.f(2131232764), application.getString(R.string.LOCATION_HISTORY_IS_OFF_LINK), sdwVar, dtxl.dz);
        scaVar.d = application.getString(R.string.LOCATION_HISTORY_IS_OFF_LINK);
        scaVar.A("");
        scaVar.e = false;
        this.F = scaVar;
        this.o.add(scaVar);
    }

    public void A(boolean z) {
        this.F.e = z;
        cqkx.p(this);
    }

    @Override // defpackage.sco, defpackage.jbk
    public jib NC() {
        return this.E.e().b();
    }

    @Override // defpackage.sak
    public Boolean c() {
        domy f = this.f.f();
        if (D == null) {
            EnumSet of = EnumSet.of(domy.DRIVE, domy.TWO_WHEELER, domy.TRANSIT);
            if (sif.b(this.d)) {
                of.add(domy.MULTIMODAL);
            }
            D = of;
        }
        return Boolean.valueOf(D.contains(f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sco
    public final String j(dndr dndrVar) {
        if (!sif.b(this.d) || this.f.f() != domy.MULTIMODAL) {
            dndr dndrVar2 = dndr.UNKNOWN_ALIAS_TYPE;
            int ordinal = dndrVar.ordinal();
            if (ordinal == 1) {
                return this.b.getString(R.string.TRANSIT_ROUTE_TO_HOME_NO_ROUTE_CHOSEN);
            }
            if (ordinal == 2) {
                return this.b.getString(R.string.TRANSIT_ROUTE_TO_WORK_NO_ROUTE_CHOSEN);
            }
            return this.b.getString(R.string.TRANSIT_ROUTE_OTHER);
        }
        return this.b.getString(R.string.SETTING_NOT_SET_TEXT);
    }

    @Override // defpackage.sav
    public Boolean l() {
        return Boolean.valueOf(!this.E.c());
    }

    @Override // defpackage.sav
    public Boolean m() {
        return true;
    }

    @Override // defpackage.sav
    public Boolean n() {
        return true;
    }

    @Override // defpackage.sav
    public cqkl o() {
        sfc sfcVar = this.E;
        return sfcVar.a(sfcVar.b());
    }

    @Override // defpackage.sav
    public cjtd p() {
        return this.E.b;
    }

    @Override // defpackage.sav
    public cqkl q() {
        return this.E.d();
    }

    @Override // defpackage.sav
    public cjtd r() {
        return this.E.a;
    }

    @Override // defpackage.sav
    public Boolean s() {
        return sau.a();
    }

    @Override // defpackage.sav
    public rzp t() {
        return this.E.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sco
    public final void v() {
        super.v();
        dbsk.s(this.t);
        dbsk.s(this.s);
        boolean z = true;
        boolean z2 = this.f.f() == domy.TRANSIT;
        if (sif.b(this.d)) {
            z2 |= this.f.f() == domy.MULTIMODAL;
        }
        boolean z3 = this.f.p().a() || this.f.s().a();
        this.s.e = z2 && z3;
        sca scaVar = this.t;
        if (!z2 || !z3) {
            z = false;
        }
        scaVar.e = z;
    }
}
