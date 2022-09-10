package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atsx  reason: default package */
/* loaded from: classes2.dex */
public class atsx extends atth<crpv> {
    private final atxu a;
    private final dbsg<asmp> b;
    private final jzv c;
    private final boolean d;

    public atsx(crpv crpvVar, atxu atxuVar, long j, dbsg<asmp> dbsgVar, btrm btrmVar, cref crefVar, pfk pfkVar, brlz brlzVar, cqat cqatVar, Context context, btvo btvoVar, cjqy cjqyVar, cjqq cjqqVar, jzv jzvVar, dehq dehqVar, Executor executor, atsr atsrVar, vtn vtnVar, boolean z) {
        super(crpvVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, j);
        this.a = atxuVar;
        this.b = dbsgVar;
        this.c = jzvVar;
        boolean z2 = btvoVar.getNavigationParameters() == null ? false : btvoVar.getNavigationParameters().a.aK;
        this.d = z2;
        alcb a = alcc.a();
        a.b = vtnVar;
        a.a = this.f;
        alcc a2 = a.a();
        a.c();
        alcc a3 = a.a();
        dpfh dpfhVar = ((crpv) this.e).a.d;
        dpfhVar = dpfhVar == null ? dpfh.l : dpfhVar;
        dozz dozzVar = dpfhVar.h;
        dozzVar = dozzVar == null ? dozz.y : dozzVar;
        this.p = a2.b(dozzVar.m);
        CharSequence b = a2.b(dozzVar.o);
        B(b);
        C(a3.b(dozzVar.o));
        CharSequence b2 = a2.b(dozzVar.p);
        if (TextUtils.isEmpty(b2.toString())) {
            this.s = b;
        } else {
            this.s = b2;
        }
        this.t = b;
        atvs.a(dpfhVar, vtnVar, this);
        cjta b3 = cjtd.b();
        b3.b = dpfhVar.c;
        b3.g(dpfhVar.b);
        b3.f = dvnp.DIRECTIONS;
        b3.d = dtxw.cZ;
        this.v = b3.a();
        if (z2) {
            atxw e = e(true);
            atxw d = d(false, false);
            M(e);
            j(d);
            return;
        }
        dqum dqumVar = dqum.REROUTE_TYPE_BETTER_ETA;
        int a4 = dpin.a(((crpv) this.e).a.c);
        if (a4 != 0) {
            if (a4 == 2) {
                atxw e2 = e(false);
                atxw d2 = d(true, false);
                M(e2);
                j(d2);
                return;
            } else if (a4 == 3) {
                j(d(true, true));
                return;
            }
        }
        atxw e3 = e(true);
        atxw d3 = d(false, false);
        M(e3);
        j(d3);
    }

    private final atxw d(boolean z, boolean z2) {
        atsm R = R(z);
        R.b();
        R.c = cqrt.l(R.string.ROUTE_AROUND_TRAFFIC_REROUTE);
        R.d = cqrt.l(R.string.ROUTE_AROUND_TRAFFIC_ACTION);
        R.f = atxv.ACCEPT;
        R.g = f(true);
        cjtd Q = Q();
        if (z2) {
            cjta b = cjtd.b();
            b.b = Q.e;
            b.d = dtxw.cV;
            R.h = b.a();
            cjta b2 = cjtd.b();
            b2.b = Q.e;
            b2.d = dtxw.da;
            R.i = b2.a();
        } else {
            cjta b3 = cjtd.b();
            b3.b = Q.e;
            b3.d = dtxw.cW;
            R.h = b3.a();
            cjta b4 = cjtd.b();
            b4.b = Q.e;
            b4.d = dtxw.db;
            R.i = b4.a();
        }
        if (z) {
            R.j = true;
        }
        return R.a();
    }

    private final atxw e(boolean z) {
        atsm R = R(z);
        R.c = cqrt.l(R.string.ROUTE_AROUND_TRAFFIC_DECLINE);
        R.f = atxv.DISMISS;
        R.g = f(false);
        cjtd Q = Q();
        cjta b = cjtd.b();
        b.b = Q.e;
        b.d = dtxw.cY;
        R.h = b.a();
        cjta b2 = cjtd.b();
        b2.b = Q.e;
        b2.d = dtxw.dc;
        R.i = b2.a();
        return R.a();
    }

    private final atsn f(boolean z) {
        return new atsw(this, z);
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Oa() {
        alfa alfaVar;
        super.Oa();
        if (!this.b.a()) {
            return;
        }
        crpv crpvVar = (crpv) this.e;
        amuh e = amuh.e(0, crpvVar.c, crpvVar.k());
        astf f = astg.f();
        f.e(e);
        dqum dqumVar = dqum.REROUTE_TYPE_BETTER_ETA;
        dqum b = dqum.b(((crpv) this.e).a.b);
        if (b == null) {
            b = dqum.REROUTE_TYPE_BETTER_ETA;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                alfaVar = alfa.SHOW_AS_NEW_CURRENT;
            } else if (ordinal != 3) {
                alfaVar = alfa.SHOW_AS_CURRENT_FASTER;
            }
            f.d(alfaVar);
            this.b.b().D(f.a());
        }
        alfaVar = alfa.SHOW_AS_NEW_CLOSED;
        f.d(alfaVar);
        this.b.b().D(f.a());
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Ob() {
        if (this.b.a()) {
            this.b.b().D(null);
        }
        super.Ob();
    }

    @Override // defpackage.atss
    @dzsi
    protected final crfj u() {
        String string;
        dpfh dpfhVar = ((crpv) this.e).a.d;
        if (dpfhVar == null) {
            dpfhVar = dpfh.l;
        }
        int a = this.a.a();
        int a2 = dpin.a(((crpv) this.e).a.c);
        if (a2 == 0) {
            a2 = 1;
        }
        if (this.c.a()) {
            string = "";
        } else {
            dqum dqumVar = dqum.REROUTE_TYPE_BETTER_ETA;
            if (a2 == 1) {
                Resources resources = this.j;
                string = resources.getString(R.string.ROUTE_AROUND_TRAFFIC_TAKE_ACTION_CUE_DEFAULT_DECLINE, resources.getString(R.string.ROUTE_AROUND_TRAFFIC_REROUTE));
            } else if (a2 != 2) {
                string = null;
            } else {
                Resources resources2 = this.j;
                string = resources2.getString(R.string.ROUTE_AROUND_TRAFFIC_TAKE_ACTION_CUE_DEFAULT_REROUTE, resources2.getString(R.string.ROUTE_AROUND_TRAFFIC_DECLINE));
            }
        }
        return atvs.c(dpfhVar, a, string, this.i.q());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void v() {
        cjqp g = this.l.g();
        cjta b = cjtd.b();
        b.b = Q().e;
        b.f = dvnp.DIRECTIONS;
        b.d = dtxw.ax;
        g.d(b.a());
    }

    @Override // defpackage.atss, defpackage.atxz
    public void o() {
        atxw T = T() != null ? T() : k();
        T.c();
        if (T.l() != null) {
            this.k.m(new cjte(deaf.BACK_BUTTON), T.l());
        }
    }
}
